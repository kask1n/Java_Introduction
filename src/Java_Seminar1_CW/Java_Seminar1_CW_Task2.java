/* Задача 2:
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

package Java_Seminar1_CW;

import java.util.Arrays;

public class Java_Seminar1_CW_Task2 {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        System.out.printf("\nДан массив чисел: %s", Arrays.toString(arr));
        int count = 0;
        int maxCount = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
                if (maxCount < count) maxCount = count;
            } else count = 0;
        }

        System.out.printf("\n-> Максимальное количество подряд идущих 1 = %d\n", maxCount);
    }
}