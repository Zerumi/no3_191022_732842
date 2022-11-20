package places.singlePlaces;

import places.Place;
import places.superPlaces.SuperPlace;
import places.superPlaces.openPlaces.UnknownLocation;

import java.util.Objects;

public abstract class SinglePlace extends Place {

    private SuperPlace location;

    {
        location = new UnknownLocation();
    }
    protected SinglePlace(String name) {
        super(name);
    }
    protected SinglePlace(String name, SuperPlace location) {
        super(name);
        this.location = location;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (!super.equals(otherObject)) return false;

        SinglePlace other = (SinglePlace) otherObject;

        return Objects.equals(location, other.location);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), location);
    }

    @Override
    public String toString() {
        return super.toString() + "["
                + "location=" + this.location + "]";
    }
}
