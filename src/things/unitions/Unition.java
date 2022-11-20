package things.unitions;

import things.Thing;

import java.util.ArrayList;
import java.util.Objects;

public class Unition extends Thing {
    private final ArrayList<ICanAttachable> uniteItems;

    {
        uniteItems = new ArrayList<>();
    }

    public Unition(ICanAttachable... things)
    {
        String name = "";
        for (int i = 0; i < things.length; i++) {
            if (i == 0)
            {
                name = "Объединение (" + things[0].getName();
                uniteItems.add(things[0]);
                continue;
            }
            uniteItems.add(things[i]);
            name += ", " + things[i].getName();
        }
        name += ")";
        setName(name);
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if(!super.equals(otherObject)) return false;

        Unition other = (Unition) otherObject;

        return this.uniteItems.equals(other.uniteItems);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(super.hashCode(), uniteItems);
    }

    @Override
    public String toString()
    {
        return super.toString() + "["
                + "uniteItems=" + uniteItems
                + "]";
    }
}
