package classes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * all game data is loaded here
 */
public class GameData {

    /**
     * loads game map from json file
     */
    public void loadLocations(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/location.json");) {
            Location[] sideLocations = mapper.readValue(input, Location[].class);
            for (Location sideLocation : sideLocations) {
                map.getLocations().put(sideLocation.getName().toLowerCase(), sideLocation);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * loads fish from json file
     */
    public void loadFish(Journal journal){
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/fish.json");) {
            Fish[] fish = mapper.readValue(input, Fish[].class);
            for (Fish fish1 : fish) {
                journal.getAllFish().add(fish1);
                journal.getFishLeft().add(fish1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
