// Домашняя работа. Задача 2.
// Пусть дан произвольный список целых чисел. Удалить из него чётные числа.

package Java_Seminar3_HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java_Seminar3_HW_Task2 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(arr);

        List<Integer> resArr = new ArrayList<>();
        for (int item : arr)
            if (item % 2 != 0) resArr.add(item);  // Записать в новый список только нечётные числа.

        System.out.println(resArr);
    }
}