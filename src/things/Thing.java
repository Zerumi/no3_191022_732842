package things;

public abstract class Thing {
    private String name;

    {
        name = "безымянная вещь";
    }

    protected Thing()
    {

    }
    protected Thing(String name) {
        this.setName(name);
    }

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }
}
