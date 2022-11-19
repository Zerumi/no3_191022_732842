package entities;

import places.Place;

public class Miu extends Entity {

    public Miu(String name)
    {
        super(name);
    }

    public void meet(Place where, Entity who)
    {
        System.out.print(this.getName() + " повстречала " + where.getName() + " " + who.getName() + ". ");
    }
}
