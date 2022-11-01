public abstract class Place implements INameable {
    private String name;

    protected Place(String name)
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
