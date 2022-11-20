package entities;

import things.unitions.ICanAttachable;
import things.unitions.Unition;

public interface IAttachable {
    Unition attach(ICanAttachable... things);
}
