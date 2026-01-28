package classes;

/**
 * game characters the player can talk to
 */
public class NPC {
    private String name;
    private boolean giftable;

    public NPC() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGiftable() {
        return giftable;
    }

    public void setGiftable(boolean giftable) {
        this.giftable = giftable;
    }
}
