// Задание 5 (доп).
// Взять набор строк, например:
// Мороз и солнце день чудесный
// Еще ты дремлешь друг прелестный
// Пора красавица проснись
//
// Написать метод, который отсортирует эти строки по длине с помощью TreeMap.
// Строки с одинаковой длиной не должны "потеряться".

package Java_Seminar5_Classwork;

import java.util.*;

public class Java_Seminar5_CW_Task5 {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<>(
                Arrays.asList("Мороз и солнце день чудесный", "Пора крeсавица проснись",
                        "Морз и солнце день чудесный", "Пора крeсавица просни", "Пора крисавица проснись",
                        "Еще ты дремлешь друг прелестный", "Пора красавица проснись"));

        TreeMap<String, Integer> tMap = new TreeMap<>(
                Comparator.comparingInt(String::length)
                        .thenComparing((k1, k2) -> 1)); // Выбирает "более ранний" ключ из двух.

        for (String s : arr)
            tMap.put(s, s.length());

        System.out.println();
        tMap.navigableKeySet().forEach(System.out::println);
    }
}