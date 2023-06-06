/*
 * Домашнее задание.
 * ~ Создать класс Поток содержащий в себе список УчебныхГрупп и реализующий интерфейс Iterator;
 * ~ Создать класс StreamComparator, реализующий сравнение количества групп входящих в Поток;
 * ~ Создать класс ПотокСервис, добавив в него метод сортировки списка потоков,
 *   используя созданный StreamComparator;
 * ~ Модифицировать класс Контроллер, добавив в него созданный сервис;
 * ~ Модифицировать класс Контроллер, добавив в него метод сортирующий список потоков,
 *   путем вызова созданного сервиса;
 *
 * Доработать приложение, которое мы разрабатывали на уроке.
 * Мы должны поработать с сортировкой объектов, освоить работу с интерфейсами Comparator, Comparable.
 * 1. Доработать класс Freelancer, при желании можно разработать и свой собтственный тип сотрудника.
 * 2. Переработать метод generateEmployee, метод должен создавать случайного сотрудника
 *    (Worker, Freelancer или любого другого). Метод должен быть один!
 * 3. Придумать свой собственный компаратор (Возможно отсортировать сотрудников по возрасту?
 *    Тогда добавьте соответствующее состояние на уровне ваших классов).
 * 4. Продемонстрировать сортировку объектов различного типа с использованием собственного компаратора.
 */


package Java_Lecture9.Ex002;

import Java_Lecture9.Ex002.ExBeverage.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Program {
    public static void main(String[] args) {

        // #region Intro Iterator
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(12);
        nums.add(123);
        nums.add(1234);
        nums.add(12345);

        Iterator<Integer> iter = nums.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
        //#endregion

        //#region Worker Iterator

        Worker worker = new Worker(
                "Имя", "Фамилия", 23, 4567);

        Iterator<String> components = worker;

        while (components.hasNext()) {
            System.out.println(worker.next());
        }

        //#endregion

        //#region Beverage Iterator

        Beverage latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Beans("Зёрна"));
        latte.addComponent(new Milk("Молоко"));

        Iterator<Ingredient> iterator = latte;
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

//        for (Ingredient ingr : latte)

        //#endregion
    }
}
