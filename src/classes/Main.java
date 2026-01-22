package classes;

import classes.command.console.GameConsole;

public class Main {
    public static void main(String[] args) {
        GameConsole gameConsole = new GameConsole();
        gameConsole.start();
    }
}
