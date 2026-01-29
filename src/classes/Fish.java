package classes;

/**
 * manages different fish species in the aquarium
 */
public class Fish {
    private String name;
    private String species;
    private Boolean special;
    private String description;
    private int preferredTime;

    public Fish() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        this.special = special;
    }

    public int getPreferredTime() {
        return preferredTime;
    }

    public void setPreferredTime(int preferredTime) {
        this.preferredTime = preferredTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
