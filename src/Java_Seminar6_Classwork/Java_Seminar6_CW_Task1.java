/* Задача 1.
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set
 * вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * Процент уникальных чисел = Количество уникальных чисел * 100 / Общее количество чисел в массиве.
 */

package Java_Seminar6_Classwork;

import java.util.*;

public class Java_Seminar6_CW_Task1 {
    public static void main(String[] args) {
        Integer[] arr = fillArray();
        System.out.printf("\nДан массив: \n%s", Arrays.toString(arr));
        proportionOfUnique(arr);
    }

    private static Integer[] fillArray() {
        Integer[] array = new Integer[1000];

        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }

        return array;
    }

    private static void proportionOfUnique(Integer[] arr) {
        Set<Integer> arrSet = new HashSet<>(List.of(arr));  // Заполнение работает только с типом Integer.
        System.out.printf("\n-> Процент уникальных значений в данном массиве = %.3f%%\n", (float) arrSet.size() * 100 / arr.length);
    }
}