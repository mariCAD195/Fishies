package classes;

/**
 * game characters the player can talk to
 * @author mari
 */
public class NPC {
    private String name;
    private boolean giftable;
    private String welcomeDialog;
    private String fishInfo;
    private String giftReaction;

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

    public String getWelcomeDialog() {
        return welcomeDialog;
    }

    public void setWelcomeDialog(String welcomeDialog) {
        this.welcomeDialog = welcomeDialog;
    }

    public String getFishInfo() {
        return fishInfo;
    }

    public void setFishInfo(String fishInfo) {
        this.fishInfo = fishInfo;
    }

    public String getGiftReaction() {
        return giftReaction;
    }

    public void setGiftReaction(String giftReaction) {
        this.giftReaction = giftReaction;
    }
}
