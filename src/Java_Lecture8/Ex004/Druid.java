package Java_Lecture8.Ex004;

public class Druid extends BaseHero {
    int mp;

    public Druid(String name, int hp, int mp) {
        super(name, hp);
        System.out.println("Вызван Druid(String name, int hp)");
        this.mp = mp;
        this.hp = (int) (this.hp * 0.8);  // Работает только ссылочный тип Integer.
    }

    public Druid() {
        this("", 0, 0);
        // super("", 0);
        System.out.println("Вызван Druid()");
    }
}