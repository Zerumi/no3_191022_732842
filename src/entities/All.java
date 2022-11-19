package entities;

import story.Event;
import story.Time;

public class All extends Entity {

    public All(String name) {
        super(name);
    }
    public void notice(Time time, Event event)
    {
        System.out.print(time.getName() + " " + this.getName() + " заметили, что " + event.getEvent() + ". ");
    }
    public void worry()
    {
        System.out.print(this.getName() + " пришли в сильное волнение. ");
    }
}
