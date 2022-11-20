package tests;

import entities.BigScaryAnt;
import entities.Miu;
import places.Place;
import places.singlePlaces.Hower;
import places.superPlaces.SuperPlace;
import places.superPlaces.isolatedPlaces.Hall;
import places.superPlaces.openPlaces.UnderCeiling;

public class MiuTest {
    public static void MiuTest()
    {
        SuperPlace hall = new Hall("зал");
        SuperPlace underCeiling = new UnderCeiling("под потолком");

        Place hower = new Hower("ковер в зале", hall);
        Place hower2 = new Hower("ковер в зале", underCeiling);
        Miu m = new Miu("малышка Мю", hall);

        System.out.println(hower);
        System.out.println(hower2);

        BigScaryAnt ant = new BigScaryAnt("большой страшный муравейка", hall);
        m.meet(ant);
    }
}
