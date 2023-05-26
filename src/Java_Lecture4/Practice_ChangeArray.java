package Java_Lecture4;

import java.util.Arrays;
import java.util.Random;

public class Practice_ChangeArray {
    public static void main(String[] args) {
        long start = System.nanoTime();

        int[] arr = new int[1_000_000];
        Random random = new Random();
        for (int i = 0; i < arr.length; i++)
            arr[i] = random.nextInt(10);

        long temp = System.nanoTime();
        System.out.printf("\n%d ms", (temp - start) / 1_000_000);

        int iDel = 4;
        for (int i = iDel; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];

        int[] arrNew = Arrays.copyOf(arr, arr.length - 1);

        long finish = System.nanoTime();
        System.out.printf("\n%d ms\n", (finish - temp) / 1_000_000);
    }
}
