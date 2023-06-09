/* Домашняя работа 5. Задача 3.
 *
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 */

package Java_Seminar5_HW;

import java.util.Arrays;

public class Java_Seminar5_HW_Task3 {
    public static void main(String[] args) {
        int[] arr = {1000, 5, 7, 3, 2, 500, 13, 19, 123, -5};
        System.out.printf("\nИсходный массив:\n%s", Arrays.toString(arr));

        heapSort(arr);
        System.out.printf("\n-> HeapSort:\n%s\n", Arrays.toString(arr));
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;

            heapify(arr, 0, i);
        }
    }

    private static void heapify(int[] arr, int i, int n) {
        int l = i * 2 + 1;
        int r = i * 2 + 2;
        int largest = i;

        if (l < n && arr[l] > arr[largest])
            largest = l;
        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (i != largest) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, largest, n);
        }
    }
}
