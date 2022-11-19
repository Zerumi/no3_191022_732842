package story;

public class Event {
    private String event;
    public Event(String event)
    {
        this.setEventStr(event);
    }

    public String getEvent() {
        return event;
    }

    public void setEventStr(String event) {
        this.event = event;
    }
}
