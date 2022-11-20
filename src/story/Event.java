package story;

import places.Place;

import java.util.Objects;

public class Event {
    private String event;
    public Event(String event)
    {
        this.setEventStr(event);
    }

    public Event(Actions action, IActionable what, Place where)
    {
        event = "В локации " + where.getName() + ": " + what.getDescribe() + " " + action;
    }

    public String getEventDescribe() {
        return event;
    }

    public void setEventStr(String event) {
        this.event = event;
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!this.getClass().equals(otherObject.getClass())) return false;

        Event other = (Event) otherObject;

        return Objects.equals(this.event, other.event);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(event);
    }

    @Override
    public String toString() {
        return this.getClass().getName() + "["
                + "event=" + event + "]";
    }
}
