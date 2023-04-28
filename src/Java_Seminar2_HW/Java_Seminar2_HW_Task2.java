/* Домашнее задание 2. Задача 2.
 * Реализуйте алгоритм сортировки пузырьком числового массива,
 * результат после каждой итерации запишите в лог-файл.
 */

package Java_Seminar2_HW;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.*;

public class Java_Seminar2_HW_Task2 {
    public static void main(String[] args) throws IOException {
        int[] arr = new int[]{13, 2, 7, 9, 10};
        int number = 0;

        Logger logger = Logger.getLogger(Java_Seminar2_HW_Task2.class.getName());
        // ConsoleHandler info = new ConsoleHandler();
        FileHandler info = new FileHandler("E:\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\Task2_Log.xml");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    number = arr[i];
                    arr[i] = arr[j];
                    arr[j] = number;
                }
            }

            logger.addHandler(info);
            logger.info(Arrays.toString(arr));
        }

        System.out.println(Arrays.toString(arr));
    }
}