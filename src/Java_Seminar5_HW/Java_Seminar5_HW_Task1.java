/* Группа 3730, Рябцев А.
 * Домашняя работа 5. Задача 1.
 *
 * Реализуйте структуру телефонной книги с помощью HashMap,
 * учитывая, что 1 человек может иметь несколько телефонов.
 */

package Java_Seminar5_HW;

import java.util.*;

public class Java_Seminar5_HW_Task1 {
    public static void main(String[] args) {
        addPhonebook("Иванов", Arrays.asList(123, 456));  // Добавление телефонов списком.
        addPhonebook("Иванов", 789);  // Добавление телефонов по одному.
        addPhonebook("Петров", 456);
        addPhonebook("Сидоров", Arrays.asList(123, 456, 789));  // Добавление телефонов списком.
        addPhonebook("Сидоров", 917);  // Добавление телефонов по одному.

        System.out.println();
        System.out.println(phonebook);
        System.out.print("Выполнил:\nСтудент группы 3730\nРябцев А.\n");
    }

    static Map<String, List<Integer>> phonebook = new HashMap<>();

    private static void addPhonebook(String s, Integer i) {
        List<Integer> tempArr = phonebook.get(s);
        if (tempArr == null) tempArr = new ArrayList<>();
        tempArr.add(i);
        phonebook.put(s, tempArr);
    }

    private static void addPhonebook(String s, List<Integer> i) {
        List<Integer> tempArr = phonebook.get(s);
        if (tempArr == null) tempArr = new ArrayList<>();
        tempArr.addAll(i);
        phonebook.put(s, tempArr);
    }
}