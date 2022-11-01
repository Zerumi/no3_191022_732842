public abstract class Berry implements ISmellable, INameable {
    private String smell;
    private String name;

    protected Berry(String name, String smell)
    {
        this.setName(name);
        this.setSmell(smell);
    }

    @Override
    public String getSmell()
    {
        return smell;
    }
    @Override
    public void setSmell(String smell)
    {
        this.smell = smell;
    }
    @Override
    public String getName()
    {
        return name;
    }
    @Override
    public void setName(String name)
    {
        this.name = name;
    }
}
