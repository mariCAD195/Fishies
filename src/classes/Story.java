package classes;

import classes.command.Help;

public class Story {

    public String introduction(Help help) {
        System.out.println("\nYou are Larry, a college student on summer break who thought this summer would be a perfect time to revisit his childhood dreams.");
        Toolbox.wait(4000);
        System.out.println("You bought a three month aquarium pass, packed your old polaroid camera, \nfound your old octopus themed tshirt (it’s a bit tight, but it will do) and headed straight to the local sea world.\n");
        Toolbox.wait(6000);
        System.out.println("It can’t be that hard to take a photo of every fish there, can it?\n");
        System.out.println("\n(press enter to continue)");
        Toolbox.enter();
        return help.execute();
    }
}
