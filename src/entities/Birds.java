package entities;

import java.util.Objects;

public class Birds extends Entity {

    public Birds(String name)
    {
        super(name);
    }

    public void hunt(Entity entity)
    {
        if (Objects.equals(this.getLocation(), entity.getLocation()))
        {
            System.out.println(this.getName() + " охотились за " + entity.getName() + ". ");
        }
        else
        {
            System.out.println(this.getName() + " пытались охотиться за " + entity.getName() + ", но вряд-ли у них это получалось...");
        }
    }

    public void flutter()
    {
        System.out.println(this.getName() + " порхали " + getLocation().getName() + ". ");
    }
}
