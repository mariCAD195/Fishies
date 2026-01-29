package classes.command;

import classes.Larry;
import classes.Map;
import classes.Toolbox;

import java.util.Scanner;

public class TalkTo extends Command {

    private Map map;
    private Larry larry;
    Scanner sc = new Scanner(System.in);

    public TalkTo(Map map, Larry larry) {
        this.map = map;
        this.larry = larry;
    }

    @Override
    public String execute() {
        System.out.println("\n...");
        map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).talkToMenu();
        System.out.println("\n(type npc name)");
        String input = sc.next();
        if (map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getNPCsPresent().contains(input)) {
            System.out.println(map.getNpcs().get(input).getWelcomeDialog());
            Toolbox.enter();
            System.out.println(Toolbox.coloredText("blue", "1) ask about fish\n2) gift item from inventory\n3) leave\n")+"(type fish/gift/leave)\n");
            String answer = sc.next();
            switch (answer) {
                case "fish":
                    System.out.println(Toolbox.coloredText("cyan", "\ndo you happen to know anything about the local fish population?"));
                    Toolbox.enter();
                    System.out.println(map.getNpcs().get(input).getFishInfo());
                    Toolbox.enter();
                    return Toolbox.coloredText("cyan","thanks so much :)\n");
                case "gift":
                    if(map.getNpcs().get(input).isGiftable()) {
                        larry.inventoryMenu();
                        System.out.println("\n(type item name)");
                        String giftWhat = sc.nextLine();
                        for (int i = 0; i < larry.getInventory().size(); i++) {
                            if (larry.getInventory().get(i).getName().equalsIgnoreCase(giftWhat)) {
                                larry.getInventory().remove(i);
                                map.getNpcs().get(input).getGiftReaction();
                            }
                        }
                    }else{
                        return map.getNpcs().get(input).getGiftReaction();
                    }
            }
        }else{
            return "hmm...i don't think anybody like that is here";
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
