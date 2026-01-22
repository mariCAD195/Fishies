package classes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class GameData {

    /**
     * loads game map from json file
     */
    public void loadLocations(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/location.json");) {
            Location[] sideLocations = mapper.readValue(input, Location[].class);
            for (Location sideLocation : sideLocations) {
                map.getLocations().put(sideLocation.getId(), sideLocation);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
