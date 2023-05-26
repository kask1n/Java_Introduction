package Java_Lecture4;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Practice_ChangeLinkedList {
    public static void main(String[] args) {
        long start = System.nanoTime();

        List<Integer> linList = new LinkedList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++)
            linList.add(random.nextInt(10));

        long temp = System.nanoTime();
        System.out.printf("\n%d ms", (temp - start) / 1_000_000);

        int iDel = 4;
        linList.remove(iDel);

        long finish = System.nanoTime();
        System.out.printf("\n%d ms\n", (finish - temp) / 1_000_000);
    }
}
