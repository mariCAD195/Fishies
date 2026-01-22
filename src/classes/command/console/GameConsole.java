package classes.command.console;

import classes.GameData;
import classes.Larry;
import classes.command.Command;
import classes.command.Move;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class GameConsole {
    private boolean exit = false;
    private HashMap<String, Command> commands = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private GameData gameData = new GameData();

    public void start() {
        commandInitialization();
        gameInitialization();
        do{
            execute();
        }while(!exit);
    }

    public void execute() {
        System.out.print("><((((`>  ");
        String input = scanner.nextLine();
        input = input.trim().toLowerCase();
        Command command = commands.get(input);
        if(commands.containsKey(input)) {
            System.out.println(commands.get(input).execute());
        }else{
            System.out.println("sorry...I don't think I can do this.");
        }
    }

    public void commandInitialization() {
        commands.put("move", new Move());
    }

    public void gameInitialization() {
        try {
            gameData.loadLocations();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Larry larry = new Larry(gameData.getMap().getLocations().get("lobby"), 0, 1);
    }
}
