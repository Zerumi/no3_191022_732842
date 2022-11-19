package things;

public abstract class Berry extends Thing implements ISmellable{
    private String smell;
    private boolean isBlossom;

    {
        smell = "неизвестный";
        this.setName("безымянная ягода");
    }
    protected Berry()
    {

    }
    protected Berry(String name)
    {
        this.setName(name);
    }

    protected Berry(String name, String smell)
    {
        this.setName(name);
        this.setSmell(smell);
    }

    protected Berry(String name, String smell, boolean isBlossom)
    {
        this.setName(name);
        this.setSmell(smell);
        this.setBlossom(isBlossom);
    }

    public String getSmell()
    {
        return smell;
    }

    public String getSmellSource()
    {
        return getName();
    }
    protected void setSmell(String smell)
    {
        this.smell = smell;
    }
    protected void setBlossom(boolean isBlossom) {
        this.isBlossom = isBlossom;
    }
}
