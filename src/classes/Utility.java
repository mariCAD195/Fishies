package classes;

public class Utility {

    /**
     * sets color
     * @param color color name
     * @return color code
     */
    public static String color(String color) {
        return switch (color.toUpperCase()) {
            case "RED" -> "\u001B[31m";
            case "BLUE" -> "\u001B[34m";
            case "GREEN" -> "\u001B[32m";
            case "YELLOW" -> "\u001B[33m";
            case "BLACK" -> "\u001B[30m";
            case "WHITE" -> "\u001B[37m";
            case "PURPLE" -> "\u001B[35m";
            case "CYAN" -> "\u001B[36m";
            default -> "\u001B[0m";
        };
    }

    /**
     * sets color for given text
     * @param color color name
     * @param string text to color
     * @return color code using the previous color method
     */
    public static String coloredText(String color, String string) {
        return color(color) + string + color("default");
    }

}
