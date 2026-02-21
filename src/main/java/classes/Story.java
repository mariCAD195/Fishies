package classes;


import command.Help;

import java.util.ArrayList;

/**
 * game story and title
 * @author mari
 */
public class Story {

    private ArrayList<String>polaroidFish;
    private ArrayList<String>title;

    public Story() {
        this.polaroidFish = new ArrayList<>();
        this.title = new ArrayList<>();
    }

    public ArrayList<String> getTitle() {
        return title;
    }

    public void setTitle(ArrayList<String> title) {
        this.title = title;
    }

    public ArrayList<String> getPolaroidFish() {
        return polaroidFish;
    }

    public void setPolaroidFish(ArrayList<String> polaroidFish) {
        this.polaroidFish = polaroidFish;
    }

    public String introduction(Help help) {
        System.out.println("\nYou are Larry, a college student on summer break who thought this summer would be a perfect time to revisit his childhood dreams.");
        Toolbox.wait(4000);
        System.out.println("You bought a three month aquarium pass, packed your old polaroid camera, \nfound your old octopus themed tshirt (it’s a bit tight, but it will do) and headed straight to the local sea world.\n");
        Toolbox.wait(6000);
        System.out.println("It can’t be that hard to take a photo of every fish there, can it?\n");
        Toolbox.enter();
        return help.execute();
    }

    public String printPolaroid(){
        for (int i = 0; i < polaroidFish.size()-1; i++) {
            System.out.println(polaroidFish.get(i));
            Toolbox.wait(300);
        }
        return "";
    }

    public String title(){
        for (int i = 0; i < title.size()-1; i++) {
            System.out.println(title.get(i));
        }
        return "";
    }
}
