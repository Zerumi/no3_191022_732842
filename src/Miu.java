public class Miu extends Entity {

    public Miu(String name)
    {
        super(name);
    }

    public void meet(INameable where, INameable who)
    {
        System.out.print(this.getName() + " повстречала " + where.getName() + " " + who.getName() + ". ");
    }
}
