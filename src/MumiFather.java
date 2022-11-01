public class MumiFather extends Entity implements IAttachable {

    public MumiFather(String name) {
        super(name);
    }

    @Override
    public void attach(INameable thing, INameable thing1)
    {
        System.out.print(this.getName() + " прикрепил " + thing.getName() + " к " + thing1.getName() + ". ");
    }

    public void stick(INameable thing1, INameable thing2)
    {
        System.out.print(this.getName() + " воткнул " + thing1.getName() + " прямо в " + thing2.getName() + ". ");
    }
}
