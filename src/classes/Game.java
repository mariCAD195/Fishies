package classes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Game {

    Map map = new Map();

    public void loadLocations() throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/location.json");){
            Location[] sideLocations = mapper.readValue(input, Location[].class);
            map.getLocations().addAll(List.of(sideLocations));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
