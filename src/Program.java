/* Лабораторная работа #3 ИТМО ВТ
 * (no3_191022_732842) от 19.10.2022, вариант #732842
 * Работу выполнил: Афанасьев Кирилл Александрович
 * Университет ИТМО, СУиР -- 24.03.02 СУДиН
 */

/* Вечером острый запах цветущей рябины заполнил зал.
 * Птички порхали под самым потолком, охотясь за пауками, а малышка Мю повстречала на ковре в зале большого страшного муравья.
 * Только теперь все заметили, что театр плыл уже в лесу.
 * Все пришли в сильное волнение.
 * Забыв свой страх перед Эммой, они сгрудились у самой воды, разговаривая и размахивая лапами.
 * Они привязали дом к большой рябине.
 * Муми-папа прикрепил канат к своей палке, а палку воткнул прямо в крышу чулана.
 */

import entities.Birds;
import entities.Spiders;
import places.Place;
import places.isolatedPlaces.Hall;
import places.openPlaces.OpenPlace;
import places.openPlaces.UnderCeiling;
import places.singlePlaces.Hower;
import story.Time;
import things.ISmellable;
import things.Rowan;

// Согласованная объектная модель:
/* Абстракции:
 * Entity -- представляет сущность
 * Place -- место
 * Thing -- вещь
 * Berry -- ягода
 *
 * Интерфейсы:
 * ISmellable -- Возможность иметь запах (для наполнения закрытого пространства)
 */
public class Program {
    public static void main(String[] args) {
        // Вечером острый запах цветущей рябины заполнил зал.
        Hall hall = new Hall("зал");
        ISmellable berry = new Rowan("рябина", "острый", true);
        hall.fillSmell(Time.EVENING, berry);

        // Птички порхали под самым потолком, охотясь за пауками, а малышка Мю повстречала на ковре в зале большого страшного муравья.
        OpenPlace underCeiling = new UnderCeiling("под самым потолком");
        Birds birds = new Birds("Птчики");
        Spiders spiders = new Spiders("паучки");
        birds.setLocation(underCeiling);
        birds.flutter();
        birds.hunt(spiders);

    }
}
