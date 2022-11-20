package places.superPlaces.isolatedPlaces;

import places.superPlaces.SuperPlace;
import story.Time;
import things.ISmellable;

import java.util.Objects;

public abstract class IsolatedPlace extends SuperPlace {

    private String smell;

    {
        smell = "нейтральный";
    }
    protected IsolatedPlace(String name) {
        super(name);
    }

    // every isolatedPlace can fill smell
    public void fillSmell(Time when, ISmellable obj)
    {
        this.smell = obj.getSmell();
        System.out.println(when.getName() + " " + obj.getSmell() + " запах " + obj.getSmellSource() + " заполнил " + this.getName() + ". ");
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;

        IsolatedPlace other = (IsolatedPlace) otherObject;

        return Objects.equals(smell, other.smell);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), smell);
    }

    @Override
    public String toString() {
        return super.toString() + "["
                + "smell=" + this.smell + "]";
    }
}
