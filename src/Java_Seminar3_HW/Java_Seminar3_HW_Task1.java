/*
 * Домашняя работа. Задача 1.
 * Реализовать алгоритм сортировки слиянием.
 */

package Java_Seminar3_HW;

import java.util.Arrays;

public class Java_Seminar3_HW_Task1 {
    public static void main(String[] args) {
        // ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(16, 34, 9, 56, 26, 11, 4, 89));
        int[] arr = new int[]{16, 34, 9, 56, 26, 11, 4, 89};
        System.out.printf("\nИсходный массив: %s\n", Arrays.toString(arr));
        long start = System.nanoTime();

// ПЕРВОЕ РЕШЕНИЕ (с пошаговым отображением решения):
//        int[] res = mergeSort(arr);
//        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(res));

// АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ (быстрее в 27 раз):
        SortUnsorted(arr, 0, arr.length - 1);
        System.out.printf("Отсортированный массив: %s\n", Arrays.toString(arr));

        long finish = System.nanoTime();
        System.out.printf("Затраченное время: %f сек.\n", (finish - start) / 1e+9);
    }

    private static int[] mergeSort(int[] arr) {
        if (arr.length <= 1)
            return arr;

        int[] arrLeft = Arrays.copyOfRange(arr, 0, arr.length / 2);
        System.out.printf("Левая половина: %s\n", Arrays.toString(arrLeft));

        int[] arrRight = Arrays.copyOfRange(arr, arr.length / 2, arr.length);
        System.out.printf("Правая половина: %s\n", Arrays.toString(arrRight));

        arrLeft = mergeSort(arrLeft);  // Ключевой момент - присваиваем левой части новое значение.
        arrRight = mergeSort(arrRight);  // Ключевой момент - присваиваем правой части новое значение.

        int i = 0;
        int j = 0;
        int k = 0;

        int[] res = new int[arrLeft.length + arrRight.length];
        while (i < arrLeft.length && j < arrRight.length) {
            if (arrLeft[i] < arrRight[j]) {
                res[k] = arrLeft[i];
                i++;
            } else {
                res[k] = arrRight[j];
                j++;
            }
            k++;
            System.out.printf("Слияние: %s\n", Arrays.toString(res));
        }

        while (i < arrLeft.length) {
            res[k] = arrLeft[i];
            i++;
            k++;
            System.out.printf("Слияние: %s\n", Arrays.toString(res));
        }

        while (j < arrRight.length) {
            res[k] = arrRight[j];
            j++;
            k++;
            System.out.printf("Слияние: %s\n", Arrays.toString(res));
        }

        return res;
    }


    // a – массив;
    // lo – позиция первого элемента в массиве (для первой итерации = 0);
    // hi – позиция последнего элемента в массиве (для первой итерации = a.length — 1).
    private static void SortUnsorted(int[] a, int lo, int hi) {

        if (hi <= lo)
            return;
        int mid = lo + (hi - lo) / 2;
        SortUnsorted(a, lo, mid);
        SortUnsorted(a, mid + 1, hi);

        int[] buf = Arrays.copyOf(a, a.length);

        if (hi + 1 - lo >= 0) System.arraycopy(a, lo, buf, lo, hi + 1 - lo);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {

            if (i > mid) {
                a[k] = buf[j];
                j++;
            } else if (j > hi) {
                a[k] = buf[i];
                i++;
            } else if (buf[j] < buf[i]) {
                a[k] = buf[j];
                j++;
            } else {
                a[k] = buf[i];
                i++;
            }
        }
    }
}