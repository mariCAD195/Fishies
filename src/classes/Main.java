package classes;

import com.fasterxml.jackson.core.exc.StreamReadException;
import com.fasterxml.jackson.databind.DatabindException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {
        ObjectMapper parser = new ObjectMapper();


        InputStream input;
        {
            try {
                input = new FileInputStream("res/location.json");
                Map map = parser.readValue(input, Map.class);
                System.out.println(map);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (StreamReadException e) {
                throw new RuntimeException(e);
            } catch (DatabindException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
