package classes;

import java.util.Scanner;

/**
 * game characters the player can talk to
 * @author mari
 */
public class NPC {
    private String name;
    private boolean giftable;
    private boolean wasGifted;
    private boolean borrowsKeyCard;
    private boolean giftKeyCard;
    private String welcomeDialog;
    private String fishInfo;
    private String giftReactionPOSITIVE;
    private String giftReactionNEGATIVE;
    private int giftLevel;
    Scanner sc = new Scanner(System.in);

    public NPC() {
    }

    public String giftGiving(NPC npc, Larry larry){
        if(npc.giftable){
            if(!npc.wasGifted){
                larry.inventoryMenu();
                System.out.println("\n(type item name)");
                String giftWhat = sc.nextLine();
                for (int i = 0; i < larry.getInventory().size(); i++) {
                    if (larry.getInventory().get(i).getName().equalsIgnoreCase(giftWhat)) {
                        larry.getInventory().remove(i);
                    }
                }
                npc.wasGifted = true;
                npc.giftLevel++;
                return npc.giftReactionPOSITIVE;
            }else{
                return npc.giftReactionNEGATIVE;
            }
        }
        return npc.giftReactionNEGATIVE;
    }

    public String keyCardCheck(NPC npc, Larry larry, Item keyCard){
        if(npc.borrowsKeyCard){
            if(npc.giftLevel>=2){
                System.out.println("\nyou know what...you are here so often...i'll lend you my key card for a bit\n");
                larry.setHasBorrowedCard(true);
                return keyCard.getDescription();
            }
        }
        if(npc.giftKeyCard){
            if(npc.giftLevel>=3){
                System.out.println("\ni know you are so dedicated to you goal, i hope this will make the job easier :)\n");
                larry.setHasCardPermanently(true);
                return keyCard.getDescription();
            }
        }
        return "";
    }

    //region getters setters
    public String getName() {
        return name;
    }

    public boolean isBorrowsKeyCard() {
        return borrowsKeyCard;
    }

    public void setBorrowsKeyCard(boolean borrowsKeyCard) {
        this.borrowsKeyCard = borrowsKeyCard;
    }

    public boolean isGiftKeyCard() {
        return giftKeyCard;
    }

    public void setGiftKeyCard(boolean giftKeyCard) {
        this.giftKeyCard = giftKeyCard;
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

    public boolean isWasGifted() {
        return wasGifted;
    }

    public void setWasGifted(boolean wasGifted) {
        this.wasGifted = wasGifted;
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

    public int getGiftLevel() {
        return giftLevel;
    }

    public void setGiftLevel(int giftLevel) {
        this.giftLevel = giftLevel;
    }

    public String getGiftReactionPOSITIVE() {
        return giftReactionPOSITIVE;
    }

    public void setGiftReactionPOSITIVE(String giftReactionPOSITIVE) {
        this.giftReactionPOSITIVE = giftReactionPOSITIVE;
    }

    public String getGiftReactionNEGATIVE() {
        return giftReactionNEGATIVE;
    }

    public void setGiftReactionNEGATIVE(String giftReactionNEGATIVE) {
        this.giftReactionNEGATIVE = giftReactionNEGATIVE;
    }
    //endregion
}
