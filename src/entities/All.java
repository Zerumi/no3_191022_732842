package entities;

public class All extends Entity implements IWorriable {

    public All(String name) {
        super(name);
    }
    public void worry()
    {
        System.out.println(this.getName() + " пришли в сильное волнение. ");
    }
}
