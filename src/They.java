public class They extends Entity implements IAttachable {

    public They(String name) {
        super(name);
    }
    public void forget(INameable what)
    {
        System.out.print(this.getName() + " забыли " + what.getName() + ". ");
    }

    public void huddle(INameable where)
    {
        System.out.print(this.getName() + " сгрудились " + where.getName() + ". ");
    }

    public void talk()
    {
        System.out.print(this.getName() + " разговаривали. ");
    }

    public void wave()
    {
        System.out.print(this.getName() + " размахивали лапами. ");
    }

    @Override
    public void attach(INameable thing, INameable thing1)
    {
        System.out.print(this.getName() + " привязали " + thing.getName() + " к " + thing1.getName() + ". ");
    }
}
