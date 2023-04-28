// Домашняя работа. Задача 3.
// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметичское этого списка.

package Java_Seminar3_HW;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class Java_Seminar3_HW_Task3 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        int max = arr.get(0);
        int min = arr.get(0);
        double summ = 0;
        for (int item : arr) {
            if (max < item)
                max = item;

            if (min > item)
                min = item;
            summ += item;
        }

        System.out.printf("\nНаименьший элемент списка = %d\n", min);
        System.out.printf("Наибольший элемент списка = %d\n", max);
        System.out.printf("Среднее арифметическое списка = %s\n", format(summ / arr.size()));
    }

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }
}