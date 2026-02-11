package classes;

/**
 * object the player can interact with but not carry
 * @author mari
 */
public class InteractableObject {
    private String name;
    private String description;

    public InteractableObject() {
    }

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
}
