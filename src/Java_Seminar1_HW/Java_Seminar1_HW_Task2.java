/*
 Вывести все простые числа от 1 до 1000
 */

package Java_Seminar1_HW;

import java.util.Arrays;

public class Java_Seminar1_HW_Task2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 2; i < 1001; i++) {
            int divider = 2;
            boolean flag = true;
            while (divider * divider <= i && flag) {//j перебираем до корня из i
                if (i % divider == 0)
                    flag = false;
                divider++;
            }
            if (flag)
                count++;
        }
// посчитали длину массива
        int arr[] = new int[count];

        int x = 0;
        for (int i = 2; i < 1001; i++) {
            boolean flag = true;
            for (int divider = 2; divider * divider <= i && flag; divider++) {
                if (i % divider == 0)
                    flag = false;
            }
            if (flag)
                arr[x++] = i;//записываем i в массив c индексом x и с последующим инкрементом
        }
        System.out.println(Arrays.toString(arr));
    }
}
