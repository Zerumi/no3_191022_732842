public abstract class Thing implements INameable {
    private String name;
    protected Thing(String name)
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
