package places.isolatedPlaces;

import places.Place;
import story.Time;
import things.ISmellable;

public abstract class IsolatedPlace extends Place {
    protected IsolatedPlace(String name) {
        super(name);
    }

    // every isolatedPlace can fill smell
    public void fillSmell(Time when, ISmellable obj)
    {
        System.out.println(when.getName() + " " + obj.getSmell() + " запах " + obj.getSmellSource() + " заполнил " + this.getName() + ". ");
    }
}
