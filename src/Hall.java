public class Hall extends Place {

    public Hall(String name)
    {
        super(name);
    }

    public <T extends ISmellable & INameable> void fillSmell(Time time, T obj)
    {
        System.out.print(time.getName() + " " + obj.getSmell() + " запах " + obj.getName() + " заполнил " + this.getName() + ". ");
    }
}
