package command;

import classes.*;

import java.util.Scanner;

public class Search extends Command {

    private Map map;
    private Larry larry;
    private Journal journal;
    private Story story;
    Scanner scanner = new Scanner(System.in);

    public Search(Map map, Larry larry, Journal journal, Story story) {
        this.map = map;
        this.larry = larry;
        this.journal = journal;
        this.story = story;
    }

    @Override
    public String execute() {
        System.out.println("\n what do you want to search?\n");
        map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).searchMenu();
        System.out.println("\n(type aquarium name)");
        String input = scanner.nextLine();
        if (map.getLocations().get(larry.getCurrentLocation().getName().toLowerCase()).getAquariums().contains(input)) {
            System.out.println(Toolbox.coloredText("blue", "\n1) look for fishies\n2) look at information sign"));
            System.out.println("\n(type fishies/sign)\n");
            String input2 = scanner.nextLine();
            switch (input2) {
                case "fishies":
                    if(map.getAquariums().get(input.toLowerCase()).getActiveFish().size()==0){
                        return "\noh...the tank looks empty, maybe come back later\nif you want to learn more about local fish habits, try reading informative signs or talk to staff to get more clues\n";
                    }
                    map.getAquariums().get(input.toLowerCase()).activeFishMenu();
                    System.out.println("\ntype fish name if you want to take a photo of them");
                    String input3 = scanner.nextLine().trim();
                    boolean fishExists = false;
                    for (int i = 0; i < map.getAquariums().get(input).getActiveFish().size(); i++) {
                        if (fishExists == false) {
                            if(map.getAquariums().get(input).getActiveFish().get(i).getSpecies().trim().equalsIgnoreCase(input3)) {
                                journal.takePhoto(input3,story);
                                fishExists = true;
                                return "";
                            }
                        }
                    }
                    if (!fishExists) {
                        return "sorry I don't see any fish like this";
                    }
                case "sign":
                    map.getAquariums().get(input.toLowerCase()).everyFishSign();
                    System.out.println("\ntype fish name if you want to learn more");
                    String input4 = scanner.nextLine().trim();
                    boolean fishExists2 = false;
                    for (int i = 0; i < map.getAquariums().get(input).getEveryFish().size(); i++) {
                        if (fishExists2 == false) {
                            if(map.getAquariums().get(input).getEveryFish().get(i).getSpecies().trim().equalsIgnoreCase(input4)) {
                                System.out.println("\n"+Toolbox.coloredText("yellow",journal.getAllFish().get(input4.toLowerCase()).getSpecies().toUpperCase()));
                                System.out.println(journal.getAllFish().get(input4.toLowerCase()).getDescription());
                                fishExists2 = true;
                                return "";
                            }
                        }
                    }
                    if (!fishExists2) {
                        return "sorry I don't see any fish like this";
                    }
            }
        }else{
            return "sorry, no fish tanks like that in here";
        }
        return "";
    }

    @Override
    public boolean exit() {
        return false;
    }
}
