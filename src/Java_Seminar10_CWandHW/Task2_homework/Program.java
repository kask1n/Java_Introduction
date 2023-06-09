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
        System.out.printf("\nСодержимое мешка: %s", fruits);

        ArrayList<Box<Fruit>> boxes = new ArrayList<>(
                List.of(new Box<>(), new Box<>(), new Box<>(), new Box<>(), new Box<>()));
        System.out.print("\nСодержимое коробок:");
        for (Box<Fruit> box : boxes)
            System.out.printf("\n%s", box);
        System.out.println();

        Set<String> fruitTypes = new HashSet<>();
        for (Fruit fruit : fruits)
            fruitTypes.add(fruit.getClass().getSimpleName());

        for (String type : fruitTypes) {
            for (Box<Fruit> box : boxes) {

                Iterator<Fruit> iFruits = fruits.iterator();
                while (iFruits.hasNext()) {
                    if (box.addFruit(iFruits.next()))
                        iFruits.remove();
                }
            }
        }

        System.out.println();
        System.out.printf("\nСодержимое мешка: %s", fruits);
        System.out.print("\nСодержимое коробок:");
        for (Box<Fruit> box : boxes)
            System.out.printf("\n%s", box);
        System.out.println();

        fruits.add(boxes.get(0).removeFruit());
        System.out.print(boxes.get(0));
        System.out.printf("\nСодержимое мешка: %s", fruits);
    }

//        box2.removeFruit();
//        box2.removeFruit();
//
//        System.out.println(box2);
//        box2.addFruit(apple1);

//        System.out.println(box1.getBoxWeight());
//        System.out.println(box2.getBoxWeight());

//        System.out.println(box1);
//        System.out.println(box2);


//        System.out.println(box3.getBoxWeight());

//        System.out.println(box1.compare(box2));
//        System.out.println(box3.compare(box4));

//        System.out.println(apple1.equals(apple2));
//        System.out.println(apple1 == apple2);

}
