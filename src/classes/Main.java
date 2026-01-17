package classes;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        try {
            game.loadLocations();
            System.out.println(game.map.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
