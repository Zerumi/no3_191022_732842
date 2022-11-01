public class All extends Entity {

    public All(String name) {
        super(name);
    }
    public void notice(Time time, INameable event)
    {
        System.out.print(time.getName() + " " + this.getName() + " заметили, что " + event.getName() + ". ");
    }
    public void worry()
    {
        System.out.print(this.getName() + " пришли в сильное волнение. ");
    }
}
