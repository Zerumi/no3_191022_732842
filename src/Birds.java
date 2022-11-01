public class Birds extends Entity {
    public Birds(String name)
    {
        super(name);
    }

    public void hunt(INameable entity)
    {
        System.out.print(this.getName() + " охотились за " + entity.getName() + ". ");
    }

    public void flutter(INameable where)
    {
        System.out.print(this.getName() + " порхали " + where.getName() + ". ");
    }
}
