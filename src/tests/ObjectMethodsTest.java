package tests;

import places.Place;
import places.superPlaces.isolatedPlaces.Hall;
import things.berries.Berry;
import things.Rope;
import things.berries.Rowan;
import things.Thing;

public class ObjectMethodsTest {
    public static void testObjectMethods()
    {
        Place place1 = new Hall("Тестовая локация 1: Холл");
        Place place2 = new Hall("Тестовая локация 1: Холл");
        Place place3 = new Hall("Тестовая локация 2: Холл");

        System.out.println("place1: " + place1);
        System.out.println("place2: " + place2);
        System.out.println("place3: " + place3);

        System.out.println("place1 hash: " + place1.hashCode());
        System.out.println("place2 hash: " + place2.hashCode());
        System.out.println("place1 equals place2: " + place1.equals(place2));
        System.out.println("place2 equals place1: " + place2.equals(place1));
        System.out.println("place1 equals place3: " + place1.equals(place3));
        System.out.println("place2 equals place3: " + place2.equals(place3));

        Berry thing1 = new Rowan("не рябина", "не острый");
        Thing thing2 = new Rope("палка");
        Thing thing3 = new Rowan("рябина", "острый", true);
        System.out.println("thing1: " + thing1);
        System.out.println("thing2: " + thing2);
        System.out.println("thing3: " + thing3);
    }
}
