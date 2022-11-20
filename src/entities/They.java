package entities;

import entities.entityBuff.Buff;
import things.unitions.ICanAttachable;
import places.Place;
import things.unitions.Unition;

import java.util.Arrays;

public class They extends Entity implements IAttachable {

    public They(String name) {
        super(name);
    }

    public They(String name, Place location)
    {
        super(name, location);
    }

    public They(String name, Place location, Buff... buffs)
    {
        super(name, location);
        for (var buff: buffs)
        {
            addBuff(buff);
        }
    }

    public void huddle()
    {
        System.out.println(this.getName() + " сгрудились на месте: " + getLocation().getName() + ". ");
    }

    public void talk()
    {
        System.out.println(this.getName() + " разговаривали. ");
    }

    public void wave()
    {
        // идея для 4-й лабы: внутренний класс лапы
        System.out.println(this.getName() + " размахивали лапами. ");
    }

    @Override
    public void removeBuff(Buff e) {
        System.out.println(this.getName() + " забыли " + e.getStat() + " (Источник: " + e.getSource() + ").");
        super.removeBuff(e);
    }

    @Override
    public Unition attach(ICanAttachable... things) {

        Unition unition = new Unition(things);

        System.out.println(this.getName() + " привязали между собой: " + Arrays.toString(Arrays.stream(things).map(ICanAttachable::getName).toArray()));

        return unition;
    }
}
