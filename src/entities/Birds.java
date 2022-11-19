package entities;

import places.Place;
import places.openPlaces.OpenPlace;

public class Birds extends Entity {

    public Birds(String name)
    {
        super(name);
    }

    public void hunt(Entity entity)
    {
        System.out.print(this.getName() + " охотились за " + entity.getName() + ". ");
    }

    public void flutter()
    {
        System.out.print(this.getName() + " порхали " + getLocation().getName() + ". ");
    }
}
