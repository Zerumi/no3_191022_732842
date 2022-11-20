package entities;

import places.Place;

import java.util.Objects;

public class Miu extends Entity {

    public Miu(String name)
    {
        super(name);
    }

    public Miu(String name, Place location)
    {
        super(name, location);
    }

    public void meet(Entity who)
    {
        if (Objects.equals(who.getLocation(), this.getLocation()))
        {
            System.out.println(this.getName() + " повстречала на месте: " + getLocation().getName() + " | " + who.getName() + ". ");
        }
        else
        {
            System.out.println(this.getName() + " представила себе " + who.getName() + " в " + getLocation().getName() + ". Каково же было ее удивление, когда она не обнаружила " + who.getName() + " в этом месте.");
        }
    }
}
