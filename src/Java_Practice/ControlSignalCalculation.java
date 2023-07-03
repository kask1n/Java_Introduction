// Вычисление управляющего сигнала для велосипедного двигателя.

package Java_Practice;

import java.util.Random;
import java.util.Scanner;

public class ControlSignalCalculation {
    public static void main(String[] args) {
        int[] inputArray = new int[]{1458, 1476, 1495, 1515, 1535, 1555, 1576, 1598, 1620, 1643, 1666, 1690, 1715, 1741,
                1767, 1795, 1823, 1851, 1881, 1912, 1944, 1977, 2011, 2046, 2083, 2121, 2160, 2201, 2243, 2287, 2333,
                2380, 2430, 2482, 2536, 2592, 2651, 2713, 2777, 2845, 2916, 2991, 3070, 3153, 3240, 3333, 3431, 3535,
                3645, 3763, 3888, 4022, 4166, 4320, 4486, 4666, 4860, 5071, 5302, 5554, 5832, 6139, 6480, 6861, 7290,
                7776, 8332, 8973, 9720, 10604, 11664, 12960, 14580, 16663, 19441, 23329, 29161, 38881, 58322, 65536};

        int[] outputArray = new int[]{170, 169, 168, 167, 166, 165, 164, 163, 162, 161, 160, 159, 158, 157, 156, 155,
                154, 153, 152, 151, 150, 149, 148, 147, 146, 145, 144, 144, 143, 142, 141, 140, 139, 138, 137, 136, 135,
                134, 133, 132, 131, 130, 129, 128, 127, 126, 125, 124, 123, 122, 121, 120, 119, 118, 117, 116, 115, 114,
                113, 112, 111, 110, 109, 108, 107, 106, 105, 104, 103, 102, 101, 100, 99, 98, 97, 96, 95, 94, 93, 92};

//        int[] ioArray = new int[]{
//                1458, 170, 1476, 169, 1495, 168, 1515, 167, 1535, 166, 1555, 165, 1576, 164, 1598, 163, 1620, 162,
//                1643, 161, 1666, 160, 1690, 159, 1715, 158, 1741, 157, 1767, 156, 1795, 155, 1823, 154, 1851, 153,
//                1881, 152, 1912, 151, 1944, 150, 1977, 149, 2011, 148, 2046, 147, 2083, 146, 2121, 145, 2160, 144,
//                2201, 144, 2243, 143, 2287, 142, 2333, 141, 2380, 140, 2430, 139, 2482, 138, 2536, 137, 2592, 136,
//                2651, 135, 2713, 134, 2777, 133, 2845, 132, 2916, 131, 2991, 130, 3070, 129, 3153, 128, 3240, 127,
//                3333, 126, 3431, 125, 3535, 124, 3645, 123, 3763, 122, 3888, 121, 4022, 120, 4166, 119, 4320, 118,
//                4486, 117, 4666, 116, 4860, 115, 5071, 114, 5302, 113, 5554, 112, 5832, 111, 6139, 110, 6480, 109,
//                6861, 108, 7290, 107, 7776, 106, 8332, 105, 8973, 104, 9720, 103, 10604, 102, 11664, 101, 12960, 100,
//                14580, 99, 16663, 98, 19441, 97, 23329, 96, 29161, 95, 38881, 94, 58322, 93, 65536, 92};

//        Scanner scanner = new Scanner(System.in);
//        int input = scanner.nextInt();

        Random random = new Random();
        int input;

        long start = System.nanoTime();
//        while (input > 0) {
        for (int i = 0; i < 10_000; i++) {
            input = random.nextInt(1, 65536);

            for (int j = 0; j < inputArray.length; j++) {
                if (input < inputArray[j]) {
                    System.out.println(outputArray[j]);
                    break;
                }
            }

//            for (int j = 0; j < ioArray.length; j = j + 2) {
//                if (input < ioArray[j]) {
//                    System.out.println(ioArray[j + 1]);
//                    break;
//                }
//            }


//            input = scanner.nextInt();
        }

        long finish = System.nanoTime();
        System.out.println(finish - start);

    }
}