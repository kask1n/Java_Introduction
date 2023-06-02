/* Задача 3.
 * 1. Реализуйте 1 из вариантов класса Cat из предыдущего задания, можно использовать не все
 * придуманные поля и методы. Создайте несколько экземпляров этого класса, выведите их в консоль.
 *
 * 2. Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилась его кличка, цвет и возраст
 * (или другие параметры на ваше усмотрение).
 */

package Java_Seminar6_Classwork;

public class Java_Seminar6_CW_Task3 {
    public static void main(String[] args) {
        VetCat cat = new VetCat("Вася", "Мэй-Кун", null,
                null, null, "123", 'M');
        cat.setName("Барсик");

        System.out.println();
        System.out.println(cat.getName());
        System.out.println(cat);
    }
}