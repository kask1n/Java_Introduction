package Java_Seminar10_CWandHW.Task2_homework;

import java.util.ArrayList;

public class Box<F extends Fruit> {
    private final ArrayList<F> contents;
    private static int id = 0;
    private final int identificator;

    public static int getId() {
        return id;
    }

    public int getIdentificator() {
        return identificator;
    }

    public Box(ArrayList<F> contents) {
        this.contents = contents;
        this.identificator = ++id;
    }

    public Box() {
        this(new ArrayList<>());
    }

//    public String getBoxWeight() {
//        if (contents.size() == 0)
//            return "Коробка пуста.";
//        return String.format("Коробка весит %.2f кг.", contents.size() * contents.get(0).getWeight());
//    }

    public float getBoxWeight() {
        if (contents.size() == 0)
            return 0;
        return contents.size() * contents.get(0).getWeight();
    }

    public boolean addFruit(F fruit) {
        if (contents.isEmpty() || contents.get(0).getClass().equals(fruit.getClass())) {
            if (!contents.contains(fruit)) {
                contents.add(fruit);
                System.out.printf("\nBox #%d: Добавлен фрукт -> %s", this.getIdentificator(), fruit);
                return true;
            } else {
                System.out.printf("\nBox #%d: Попытка дважды добавить в коробку один и тот же объект -> %s",
                        this.getIdentificator(), fruit);
                return false;
            }
        } else {
            System.out.printf("\nBox #%d: Нельзя добавить -> %s, т.к. в коробке уже есть %s.",
                    this.getIdentificator(), fruit, contents.get(0));
            return false;
        }
    }

    public F removeFruit() {
        if (!contents.isEmpty()) {
            F target = contents.remove(0);  // Вытащить ближайший фрукт (первый из списка).
            System.out.printf("\nBox #%d: Из коробки вытащили -> %s\n", this.getIdentificator(), target);
            return target;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Box #" + identificator +
                ": " + contents;
    }

    public boolean compare(Box<F> o) {
        return this.getBoxWeight() == o.getBoxWeight();
    }
}