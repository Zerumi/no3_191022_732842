package entities.entityBuff;

import java.util.Objects;

public class Buff {
    private final Stat stat;
    private final entities.entityBuff.ISourceable source;

    public Buff(Stat stat, ISourceable source)
    {
        this.stat = stat;
        this.source = source;
    }

    public Stat getStat()
    {
        return stat;
    }

    public String getSource()
    {
        return source.getSource();
    }

    @Override
    public boolean equals(Object otherObject)
    {
        if (this == otherObject) return true;

        if (otherObject == null) return false;

        if (!getClass().equals(otherObject.getClass())) return false;

        Buff other = (Buff) otherObject;

        return stat.equals(other.stat)
                && source.equals(other.source);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(stat, source);
    }

    @Override
    public String toString()
    {
        return getClass().getName() + "["
                + "stat=" + stat
                + ",source=" + source
                + "]";
    }
}
