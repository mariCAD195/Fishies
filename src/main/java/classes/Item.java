package classes;

/**
 * item the player can carry and gift to characters
 * @author mari
 */
public class Item {
    private String name;
    private String description;

    public Item() {
    }

    //region getters setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    //endregion
}
