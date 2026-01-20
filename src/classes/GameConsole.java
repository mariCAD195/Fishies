package classes;

import java.io.FileNotFoundException;

public class GameConsole {
    GameData gameData = new GameData();

    public void gameInitialization(){
        try {
            gameData.loadLocations();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        Larry larry = new Larry(gameData.getMap().getLocations().get("lobby"),0,1);
    }
}
