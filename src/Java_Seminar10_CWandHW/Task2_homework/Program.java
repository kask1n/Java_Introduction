// Домашнее задание 4.
//
// a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
// b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можно использовать ArrayList;
// d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
//
// e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
// подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
// g. Не забываем про метод добавления фрукта в коробку.

package Java_Seminar10_CWandHW.Task2_homework;

import java.util.*;

public class Program {
    public static void main(String[] args) {

        ArrayList<Fruit> fruits = new ArrayList<>(List.of(
                new Apple(), new Apple(), new Apple(),
                new Orange(), new Orange(),
                new Mango()));
        System.out.printf("\nСодержимое корзины: %s", fruits);

        ArrayList<Box<Fruit>> boxes = new ArrayList<>(
                List.of(new Box<>(), new Box<>(), new Box<>(), new Box<>(), new Box<>()));
        System.out.println("\n-> СОДЕРЖИМОЕ КОРОБОК:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        for (Box<Fruit> box : boxes) {
            if (fruits.isEmpty())
                break;

            fruits.removeIf(box::addFruit);
//            Iterator<Fruit> iFruits = fruits.iterator();
//            while (iFruits.hasNext()) {
//                if (box.addFruit(iFruits.next()))
//                    iFruits.remove();
//            }
        }

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> СОДЕРЖИМОЕ КОРОБОК:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        fruits.add(boxes.get(0).removeFruit());
        System.out.print(boxes.get(0));
        System.out.printf("Содержимое корзины: %s", fruits);
        System.out.println("\n--------------------");

        boxes.get(0).moveTo(5, boxes.get(3));
        boxes.get(0).moveTo(1, boxes.get(3));
        System.out.print(boxes.get(0));
        System.out.print(boxes.get(3));

        System.out.println();
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(0).getIdentificator(), boxes.get(0).getBoxWeight());
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(2).getIdentificator(), boxes.get(2).getBoxWeight());
        System.out.printf("Масса коробки #%d составляет %.1f кг.\n", boxes.get(3).getIdentificator(), boxes.get(3).getBoxWeight());
        boxes.get(0).compare(boxes.get(3));
        boxes.get(2).compare(boxes.get(3));

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> СОДЕРЖИМОЕ КОРОБОК:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

        boxes.get(1).moveTo(1, boxes.get(2)); // Попытка переместить 1 фрукт из коробки #2 в коробку #3.

        System.out.printf("\nСодержимое корзины: %s", fruits);
        System.out.println("\n-> СОДЕРЖИМОЕ КОРОБОК:");
        for (Box<Fruit> box : boxes)
            System.out.printf("%s", box);
        System.out.println("--------------------");

    }
}
