package entities;

import places.Place;
import things.unitions.ICanAttachable;
import things.Thing;
import things.unitions.Unition;

import java.util.Arrays;

public class MumiFather extends Entity implements IAttachable{

    public MumiFather(String name) {
        super(name);
    }

    public void stick(Thing thing, Place where)
    {
        System.out.println(this.getName() + " воткнул " + thing.getName() + " прямо в " + where.getName() + ". ");
    }

    @Override
    public Unition attach(ICanAttachable... things) {

        Unition unition = new Unition(things);

        System.out.println(this.getName() + " прикрепил между собой " + Arrays.toString(things));

        return unition;
    }
}
