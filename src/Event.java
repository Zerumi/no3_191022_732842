public class Event implements INameable{
    private String name;
    public Event(String name)
    {
        this.setName(name);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
