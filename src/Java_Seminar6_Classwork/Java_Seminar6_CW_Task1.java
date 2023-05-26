/* Задача 1.
 * 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24.
 * 2. Создайте метод, в который передайте заполненный выше массив, и с помощью Set
 * вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
 * Для вычисления процента используйте формулу:
 * Процент уникальных чисел = Количество уникальных чисел * 100 / Общее количество чисел в массиве.
 */

package Java_Seminar6_Classwork;

import java.util.Random;

public class Java_Seminar6_CW_Task1 {
    public static void main(String[] args) {
        int[] arr = fillArray();

    }

    private static int[] fillArray() {
        int[] array = new int[1000];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(25);
        }

        return array;
    }


}
