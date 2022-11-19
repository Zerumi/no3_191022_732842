package entities;

import things.IAttachable;
import things.Thing;

public class MumiFather extends Entity implements IAttachable {

    public MumiFather(String name) {
        super(name);
    }

    @Override
    public void attach(Thing thing, Thing thing1)
    {
        System.out.print(this.getName() + " прикрепил " + thing.getName() + " к " + thing1.getName() + ". ");
    }

    public void stick(Thing thing1, Thing thing2)
    {
        System.out.print(this.getName() + " воткнул " + thing1.getName() + " прямо в " + thing2.getName() + ". ");
    }
}
