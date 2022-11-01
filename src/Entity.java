public abstract class Entity implements INameable {
    private String name;

    protected Entity(String name)
    {
        this.setName(name);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
