package classes.command.console;

import classes.GameData;
import classes.Journal;
import classes.Larry;
import classes.Map;
import classes.command.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/**
 * it's a console for my game :)
 */
public class GameConsole {
    private boolean exit = false;
    private HashMap<String, Command> commands = new HashMap<>();
    private Scanner scanner = new Scanner(System.in);
    private GameData gameData = new GameData();
    private Map gameMap = new Map();
    private Larry larry;
    private Journal journal = new Journal();

    /**
     * loads the game and repeatedly shows command window
     */
    public void start() {
        gameInitialization();
        commandInitialization();
        do{
            execute();
        }while(!exit);
    }

    /**
     * prints command line and starts command specific logic
     */
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

    /**
     * creates game commands
     */
    public void commandInitialization() {
        commands.put("move", new Move(larry, gameMap));
        commands.put("open journal", new OpenJournal(journal));
        commands.put("go home", new GoHome(larry,  gameMap));
        commands.put("search", new Search(gameMap, larry));
    }

    /**
     * initializes the game and loads data
     */
    public void gameInitialization() {
        try {
            gameData.loadLocations(gameMap);
            gameData.loadFish(journal);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        larry = new Larry(gameMap.getLocations().get("lobby"), 1, 1);
    }
}
