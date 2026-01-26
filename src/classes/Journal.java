package classes;

import java.util.ArrayList;

public class Journal {
    private ArrayList<Fish> fishDone;
    private ArrayList<Fish> fishLeft;


    public Journal() {
        fishDone = new ArrayList<>();
        fishLeft = new ArrayList<>();
    }

    public ArrayList<Fish> getFishDone() {
        return fishDone;
    }

    public ArrayList<Fish> getFishLeft() {
        return fishLeft;
    }

    @Override
    public String toString() {
        return "Journal{" +
                "fishDone=" + fishDone +
                ", fishLeft=" + fishLeft +
                '}';
    }
}
