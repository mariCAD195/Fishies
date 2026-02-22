package command;

import classes.*;

/**
 * allows player to end the day and go home
 * @author mari
 */
public class GoHome extends Command {

    Larry larry;
    Map map;

    public GoHome(Larry larry, Map map) {
        this.larry = larry;
        this.map = map;
    }

    /**
     * allows player to go home and start another day
     */
    @Override
    public String execute() {
        if(larry.getCurrentLocation().getName().toLowerCase().equals("gift shop")){
            System.out.println("you decided it would be best to go home for today. you've done great work :)");
            Toolbox.enter();
            larry.setDate(larry.getDate()+1);
            larry.setCurrentTime(1);
            larry.setCurrentLocation(map.getLocations().get("lobby"));
            larry.setPhotosTaken(0);
            for(Item item : map.getItems().values()){
                item.setBought(false);
            }
            for(NPC npc : map.getNpcs().values()){
                npc.setWasGifted(false);
            }
            Toolbox.clearConsole();
            System.out.println(larry.newDayScreen());
            return Toolbox.clearConsole();

        }else{
            return "you can't go home from here. The exit is in the gift shop, try it there.";
        }
    }

    @Override
    public boolean exit() {
        if(larry.getDate()>90){
            System.out.println("\noh no...day 90 already?! you were so close to your goal but school calls now\nbetter luck next summer :)");
            return true;
        }
        return false;
    }
}
