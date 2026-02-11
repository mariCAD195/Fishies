package classes;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

/**
 * all game data is loaded here
 * @author mari
 */
public class GameData {

    /**
     * loads game map from json file
     */
    public void loadLocations(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/location.json");) {
            Location[] locations = mapper.readValue(input, Location[].class);
            for (Location location : locations) {
                map.getLocations().put(location.getName().toLowerCase(), location);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * loads fish from json file
     */
    public void loadFish(Journal journal, Map map){
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/fish.json");) {
            Fish[] fish = mapper.readValue(input, Fish[].class);
            for (Fish fish1 : fish) {
                journal.getAllFish().put(fish1.getSpecies().toLowerCase(), fish1);
                journal.getFishLeft().put(fish1.getSpecies().toLowerCase(), fish1);
                for(Aquarium aquarium1 : map.getAquariums().values()){
                    if(aquarium1.getName().equalsIgnoreCase(fish1.getHomeLocation())){
                        aquarium1.addFish(fish1);
                    }
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadNPCs(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try (InputStream input = new FileInputStream("res/npcs.json");) {
            NPC[] npcs = mapper.readValue(input, NPC[].class);
            for (NPC npc : npcs) {
                map.getNpcs().put(npc.getName().toLowerCase(), npc);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadObjects(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try(InputStream input = new FileInputStream("res/objects.json");){
            InteractableObject[] objects = mapper.readValue(input, InteractableObject[].class);
            for (InteractableObject object : objects) {
                map.getInteractableObjects().put(object.getName().toLowerCase(), object);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void loadAquariums(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try(InputStream input = new FileInputStream("res/aquariums.json");){
            Aquarium[] aquariums = mapper.readValue(input, Aquarium[].class);
            for (Aquarium aquarium : aquariums) {
                map.getAquariums().put(aquarium.getName().toLowerCase(), aquarium);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadItems(Map map) throws FileNotFoundException {
        ObjectMapper mapper = new ObjectMapper();
        try(InputStream input = new FileInputStream("res/item.json");){
            Item[] items = mapper.readValue(input, Item[].class);
            for (Item item : items) {
                map.getItems().put(item.getName().toLowerCase(), item);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void loadPolaroidFish(Story story) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("res/fishPolaroidAscii"));
        String line = "";
        while (line!=null){
            line = br.readLine();
            story.getPolaroidFish().add(line);
        }
    }
}

