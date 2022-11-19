package entities;

import places.Place;

public class They extends Entity {

    public They(String name) {
        super(name);
    }

    public void huddle(Place where)
    {
        System.out.print(this.getName() + " сгрудились " + where.getName() + ". ");
    }

    public void talk()
    {
        System.out.print(this.getName() + " разговаривали. ");
    }

    public void wave()
    {
        System.out.print(this.getName() + " размахивали лапами. ");
    }

    //@Override
    // void attach(Thing thing, Thing thing1)
    //{
        //System.out.print(this.getName() + " привязали " + thing.getName() + " к " + thing1.getName() + ". ");
    //}
}
