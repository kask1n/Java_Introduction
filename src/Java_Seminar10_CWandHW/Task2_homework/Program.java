// Домашнее задание 4.
//
// a. Даны классы Fruit, Apple extends Fruit, Orange extends Fruit;
// b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по типу фрукта,
// поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
// c. Для хранения фруктов внутри коробки можно использовать ArrayList;
// d. Сделать метод getWeight(), который высчитывает вес коробки, зная вес одного фрукта и их количество:
// вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не важны);
// e. Внутри класса Box сделать метод compare(), который позволяет сравнить текущую коробку с той, которую
// подадут в compare() в качестве параметра. true – если их массы равны, false в противоположном случае.
// Можно сравнивать коробки с яблоками и апельсинами;
// f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
// Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
// Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в первой;
// g. Не забываем про метод добавления фрукта в коробку.

package Java_Seminar10_CWandHW.homework;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        Fruit apple1 = new Apple();
        Fruit apple2 = new Apple();
        Fruit apple3 = new Apple();


        Fruit orange1 = new Orange();
        Fruit orange2 = new Orange();
        Fruit orange3 = new Orange();

        ArrayList<Fruit> fruits = new ArrayList<>(List.of(apple1, apple2, apple3, orange1, orange2));
        System.out.println();
        System.out.println(fruits);

        Box<Fruit> appleBox = new Box<>();
        Box<Fruit> orangeBox = new Box<>();

        for (Fruit fruit : fruits) {
            if (fruit instanceof Apple) {
                appleBox.add(fruit);
//                fruits.remove(fruit);
            } else if (fruit instanceof Orange) {
                orangeBox.add(fruit);
//                fruits.remove(fruit);
            }
        }

//        System.out.println(appleBox.getBoxWeight());
//        System.out.println(orangeBox.getBoxWeight());

        System.out.println(appleBox);
        System.out.println(orangeBox);

        Box<Fruit> newBox1 = new Box<>();
        Box<Fruit> newBox2 = new Box<>();
//        System.out.println(newBox1.getBoxWeight());

//        System.out.println(appleBox.compare(orangeBox));
//        System.out.println(newBox1.compare(newBox2));

//        System.out.println(apple1.equals(apple2));
//        System.out.println(apple1 == apple2);

    }
}
