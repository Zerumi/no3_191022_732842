package entities;

import places.Place;

public abstract class Entity {
    private String name;

    private Place location;

    protected Entity(String name) {
        this.setName(name);
    }

    protected Entity(String name, Place location) {
        this.setName(name);
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public Place getLocation()
    {
        return location;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setLocation(Place location)
    {
        this.location = location;
    }
}
