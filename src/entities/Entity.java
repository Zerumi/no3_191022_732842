package entities;

import entities.entityBuff.Buff;
import entities.entityBuff.ISourceable;
import places.Place;
import places.superPlaces.openPlaces.UnknownLocation;
import story.Event;
import story.IActionable;
import story.Time;

import java.util.ArrayList;
import java.util.Objects;

public abstract class Entity implements IActionable, ISourceable {
    private String name;
    private Place location;
    private ArrayList<Buff> bufflist;

    {
        name = "безымянный";
        location = new UnknownLocation("вне времени и пространства");
        bufflist = new ArrayList<>();
    }

    protected Entity(String name) {
        this.setName(name);
    }

    protected Entity(String name, Place location) {
        this(name);
        this.location = location;
    }

    protected Entity(String name, Place location, ArrayList<Buff> bufflist)
    {
        this(name, location);
        this.bufflist = bufflist;
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

    // we can set location to the every entity
    public void setLocation(Place location)
    {
        this.location = location;
    }

    public void lockAttention(Time when, Event onWhat)
    {
        System.out.println(when.getName() + " " + this.getName() + " обратил внимание: " + onWhat.getEventDescribe() + ". ");
    }

    public static void getWorried(IWorriable entity)
    {
        entity.worry();
    }

    public void addBuff(Buff e)
    {
        bufflist.add(e);
    }

    public void removeBuff(Buff e)
    {
        bufflist.remove(e);
    }

    @Override
    public String getSource() {
        return getName();
    }

    @Override
    public String getDescribe() {
        return getName();
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!otherObject.getClass().equals(this.getClass())) return false;

        Entity other = (Entity) otherObject;

        return name.equals(other.name)
                && location.equals(other.location);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, location);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "name=" + this.name
                + ",location=" + this.location
                + ",bufflist=" + this.bufflist + "]";
    }
}
