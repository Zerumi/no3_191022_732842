package places;

public abstract class Place {
    private String name;

    protected Place(String name)
    {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
