package classes;

import java.util.HashMap;
import java.util.Scanner;

/**
 * useful methods for better console organization
 * @author mari
 */
public class Toolbox {

    public static HashMap<String, String> colorMap = new HashMap<>();

    /**
     * adds color codes to a hashMap
     */
    public static void setColor() {
        colorMap.put("DEFAULT", "\u001B[0m");
        colorMap.put("RED", "\u001B[31m");
        colorMap.put("BLUE", "\u001B[34m");
        colorMap.put("GREEN", "\u001B[32m");
        colorMap.put("YELLOW", "\u001B[33m");
        colorMap.put("BLACK", "\u001B[30m");
        colorMap.put("WHITE", "\u001B[37m");
        colorMap.put("PURPLE", "\u001B[35m");
        colorMap.put("CYAN", "\u001B[36m");
    }

    /**
     * sets given String to a different color
     *
     * @param color  color name
     * @param string text which is colored
     * @return colored string
     */
    public static String coloredText(String color, String string) {
        setColor();
        return colorMap.get(color.toUpperCase()) + string + colorMap.get("DEFAULT");

    }

    /**
     * prints empty lines which visually clear the console
     * @return
     */
    public static String clearConsole(){
        return "\n".repeat(60);
    }

    /**
     * program waits
     * @param time amout of time the program is supposed to wait
     */
    public static void wait(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    /**
     * when used somewhere, forces the player to press enter before continuing
     */
    public static void enter(){
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

}
