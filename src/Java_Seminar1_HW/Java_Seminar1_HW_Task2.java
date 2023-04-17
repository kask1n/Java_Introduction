/* Задача 2.
 * Вывести все простые числа от 1 до 1000.
 */

package Java_Seminar1_HW;

import java.util.ArrayList;

public class Java_Seminar1_HW_Task2 {
    public static void main(String[] args) {

        ArrayList<Integer> simpleNums = new ArrayList<>();
        for (int num = 2; num <= 1000; num++) {

            boolean flag = true;
            for (int divider = 2; divider * divider <= num; divider++) {
                if (num % divider == 0) {
                    flag = false;
                    break;
                }
            }

            if (flag) simpleNums.add(num);
        }

        System.out.printf("\n-> В диапазоне от 2 до 1000 находится %d простых чисел, в том числе:\n", simpleNums.size());
        System.out.println(simpleNums);
    }
}
