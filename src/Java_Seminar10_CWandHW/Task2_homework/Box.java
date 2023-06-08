package Java_Seminar10_CWandHW.homework;

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

    public void add(F fruit) {
        if (contents.isEmpty() || contents.contains(fruit))
            contents.add(fruit);
        else
            System.out.println("В коробке находятся другие фрукты.");
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
