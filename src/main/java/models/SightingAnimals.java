package models;

public class SightingAnimals {
   public int id;
   public String location;
   public String rangeName;

    public SightingAnimals(String location, String rangeName) {
        this.location = location;
        this.rangeName = rangeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getRangeName() {
        return rangeName;
    }

    public void setRangeName(String rangeName) {
        this.rangeName = rangeName;
    }
}
