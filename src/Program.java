/* Лабораторная работа #3 ИТМО ВТ
 * (no3_191022_732842) от 19.10.2022, вариант #732842
 * Работу выполнил: Афанасьев Кирилл Александрович
 * Университет ИТМО, СУиР -- 24.03.02 СУДиН
 */
public class Program {
    public static void main(String[] args)
    {
        Rowan rowan = new Rowan("цветущей рябины","острый");
        Hall hall = new Hall("зал");

        Birds birds = new Birds("Птички");
        Place undercover = new UnderCeiling("под самым потолком");
        Entity spiders = new Spiders("пауками");

        Miu miu = new Miu("Малышка Мю");
        Place hower = new Hower("на ковре в зале");
        Entity bsa = new BigScaryAnt("большого страшного муравья");

        All all = new All("Все");
        Event event = new Event("театр плыл уже в лесу");
        Event fear = new Event("свой страх перед Эммой");

        They they = new They("Они");
        Place nearthewater = new NearWater("у самой воды");
        Place house = new House("дом");
        Place bigrow = new BigRowanTree("большой рябине");

        MumiFather farther = new MumiFather("Муми-папа");
        Thing rope = new Rope("канат");
        Thing stick = new Stick("своей палке");
        Thing ropewithstck = new Stick("палку");
        Place roof = new Roof("крышу чулана");

        hall.fillSmell(Time.EVENING, rowan);
        birds.flutter(undercover);
        birds.hunt(spiders);
        miu.meet(hower,bsa);
        all.notice(Time.RIGHT_NOW, event);
        all.worry();
        they.forget(fear);
        they.huddle(nearthewater);
        they.talk();
        they.wave();
        they.attach(house,bigrow);
        farther.attach(rope,stick);
        farther.stick(ropewithstck, roof);
    }
}