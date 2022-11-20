/* Лабораторная работа #3 ИТМО ВТ
 * (no3_191022_732842) от 19.10.2022, вариант #732842
 * Работу выполнил: Афанасьев Кирилл Александрович
 * Университет ИТМО, СУиР -- 24.03.02 СУДиН
 */

/* Текст варианта:
 *
 * Вечером острый запах цветущей рябины заполнил зал.
 * Птички порхали под самым потолком, охотясь за пауками, а малышка Мю повстречала на ковре в зале большого страшного муравья.
 * Только теперь все заметили, что театр плыл уже в лесу.
 * Все пришли в сильное волнение.
 * Забыв свой страх перед Эммой, они сгрудились у самой воды, разговаривая и размахивая лапами.
 * Они привязали дом к большой рябине.
 * Муми-папа прикрепил канат к своей палке, а палку воткнул прямо в крышу чулана.
 */

import entities.*;
import entities.entityBuff.Buff;
import entities.entityBuff.Stat;
import places.Place;
import places.singlePlaces.BigRowanTree;
import places.singlePlaces.Hower;
import places.singlePlaces.Roof;
import places.superPlaces.isolatedPlaces.Hall;
import places.superPlaces.isolatedPlaces.House;
import places.superPlaces.isolatedPlaces.Lumber;
import places.superPlaces.isolatedPlaces.Theatre;
import places.superPlaces.openPlaces.Forest;
import places.superPlaces.openPlaces.NearWater;
import places.superPlaces.openPlaces.OpenPlace;
import places.superPlaces.openPlaces.UnderCeiling;
import story.Actions;
import story.Event;
import story.IActionable;
import story.Time;
import things.ISmellable;
import things.Rope;
import things.Stick;
import things.berries.Rowan;
import things.unitions.ICanAttachable;
import things.unitions.Unition;


// Согласованная объектная модель:
/* Абстракции:
 * Entity -- представляет сущность
 * Place -- место
 *  * SuperPlace -- суперместо: может содержать одиночные места (eg. Зал, который может содержать ковер)
 *  *  * IsolatedPlace -- изолированное помещение
 *  *  * OpenPlace -- открытое пространство
 *  * SinglePlace -- одиночное место (eg. Ковер в зале)
 * Thing -- вещь
 *  * Unition -- объединение ICanAttachable
 *  * Berry -- ягода
 *
 * Интерфейсы:
 * ISmellable -- Возможность иметь запах (для наполнения закрытого пространства)
 * IActionable -- Возможность совершать действие Actions
 * IAttachable -- Возможность привязывать ICanAttachable
 * ICanAttachable -- Возможность объединяться с другими ICanAttachable
 * IWorriable -- Возможность волновать
 * ISourcable -- Возможность иметь источник (entityBuff)
 *
 * Полные диаграммы см ./diagrams
 */
public class Program {
    public static void main(String[] args) {
        // Вечером острый запах цветущей рябины заполнил зал.
        Hall hall = new Hall("зал");
        ISmellable berry = new Rowan("рябина", "острый", true);
        hall.fillSmell(Time.EVENING, berry);

        // Птички порхали под самым потолком, охотясь за пауками
        OpenPlace underCeiling = new UnderCeiling("под самым потолком");
        Birds birds = new Birds("птчики");
        Spiders spiders = new Spiders("паучки");
        birds.setLocation(underCeiling);
        spiders.setLocation(underCeiling);
        birds.flutter();
        birds.hunt(spiders);

        // А малышка Мю повстречала на ковре в зале большого страшного муравья.
        Place hower = new Hower("ковер в зале", hall);
        Miu miu = new Miu("малышка Мю", hower);
        BigScaryAnt ant = new BigScaryAnt("большой страшный муравейка", hower);
        miu.meet(ant);

        // Только теперь все заметили, что театр плыл уже в лесу.
        IActionable theatre = new Theatre("театр");
        Place forest = new Forest("лес");
        Event theatreSwimming = new Event(Actions.SWIMMING, theatre, forest);
        All all = new All("все");
        all.lockAttention(Time.ONLY_RIGHT_NOW, theatreSwimming);

        // Все пришли в сильное волнение.
        Entity.getWorried(all);

        // Забыв свой страх перед Эммой, они сгрудились у самой воды, разговаривая и размахивая лапами.
        Emma emma = new Emma("Эмма");
        Buff fear = new Buff(Stat.FEAR, emma);
        They they = new They("они", forest, fear);
        they.removeBuff(fear);
        Place nearWater = new NearWater("около воды");
        they.setLocation(nearWater);
        they.huddle();
        they.talk();
        they.wave();

        // Они привязали дом к большой рябине.
        ICanAttachable house = new House("дом");
        ICanAttachable bigRowanTree = new BigRowanTree("большое дерево рябины");
        Unition u1 = they.attach(house, bigRowanTree);

        // Муми-папа прикрепил канат к своей палке, а палку воткнул прямо в крышу чулана.
        MumiFather father = new MumiFather("Муми-папа");
        Rope rope = new Rope("канат");
        Stick stick = new Stick("палка");
        Unition u2 = father.attach(rope, stick);
        Lumber lumber = new Lumber("чулан");
        Roof roofOfLumber = new Roof("крыша чулана", lumber);
        father.stick(u2, roofOfLumber);

        System.out.println();

        // Описание состояния всех объектов
        System.out.println("Описание состояния всех объектов:");
        System.out.println("hall:" + hall);
        System.out.println("berry:" + berry);
        System.out.println("underCeiling:" + underCeiling);
        System.out.println("birds:" + birds);
        System.out.println("spiders:" + spiders);
        System.out.println("hower:" + hower);
        System.out.println("miu:" + miu);
        System.out.println("ant:" + ant);
        System.out.println("theatre:" + theatre);
        System.out.println("forest:" + forest);
        System.out.println("theatreSwimming:" + theatreSwimming);
        System.out.println("all:" + all);
        System.out.println("emma:" + emma);
        System.out.println("fear:" + fear);
        System.out.println("they:" + they);
        System.out.println("nearWater:" + nearWater);
        System.out.println("house:" + house);
        System.out.println("bigRowanTree:" + bigRowanTree);
        System.out.println("1-st unition:" + u1);
        System.out.println("father:" + father);
        System.out.println("rope:" + rope);
        System.out.println("stick:" + stick);
        System.out.println("2-nd unition:" + u2);
        System.out.println("lumber:" + lumber);
        System.out.println("roofOfLumber:" + roofOfLumber);
    }
}
