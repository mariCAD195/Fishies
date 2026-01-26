package classes;

public class Fish {
    private String species;
    private Boolean special;
    private int preferredTime;

    public Fish() {
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public Boolean getSpecial() {
        return special;
    }

    public void setSpecial(Boolean special) {
        special = special;
    }

    public int getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(int preferredTime) {
        this.preferredTime = preferredTime;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "species='" + species + '\'' +
                ", special=" + special +
                ", preferredTime=" + preferredTime +
                '}';
    }
}
