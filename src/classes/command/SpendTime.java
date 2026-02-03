package classes.command;

import classes.Aquarium;
import classes.Larry;
import classes.Map;
import classes.Toolbox;

public class SpendTime extends Command {

    Larry larry;
    Map map;

    public SpendTime(Larry larry, Map map) {
        this.larry = larry;
        this.map = map;
    }

    @Override
    public String execute() {
        if(larry.getCurrentLocation().getName().equalsIgnoreCase("cafe")||larry.getCurrentLocation().getName().equalsIgnoreCase("restaurant")){
            larry.setCurrentTime(larry.getCurrentTime()+1);
            for(Aquarium aquarium1 : map.getAquariums().values()){
                aquarium1.activateFish(larry);
            }
            return "you enjoy a bit of alone time\ntake a look at your photos and read a few pages of your book\nit feels like only a few minutes have passed but you soon realise it's already "+ Toolbox.coloredText("yellow", larry.getTime().get(larry.getCurrentTime()));
        }
        else{
            return "hmm...it would be nice to relax for a bit\nyou should head to the "+Toolbox.coloredText("yellow", "restaurant")+" or "+Toolbox.coloredText("yellow","cafe");
        }
    }

    @Override
    public boolean exit() {
        return false;
    }
}
