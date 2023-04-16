/* Задача 2:
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.
 */

public class Java_Seminar1_CW_Task2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 0, 1, 1, 1};
        int count = 0;
        int maxCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
                if (maxCount < count) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }

        System.out.printf("Максимальное количество подряд идущих 1: %d\n", maxCount);
    }
}