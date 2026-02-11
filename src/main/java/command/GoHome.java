package command;

import classes.Larry;
import classes.Map;
import classes.Toolbox;

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
            Toolbox.clearConsole();
            System.out.println(larry.newDayScreen());
            return Toolbox.clearConsole();

        }else{
            return "you can't go home from here. The exit is in the gift shop, try it there.";
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
