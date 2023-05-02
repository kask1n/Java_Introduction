package Java_Lecture2;

public class Ex000_OtherDemos {
    public static void main(String[] args) {
        String line = "";
        StringBuilder str = new StringBuilder();
//        var s = System.currentTimeMillis();
        long start = System.nanoTime();

//        for (int i = 0; i < 1_000_000; i++)  // ~42,068290 сек.
//            line += "+";

//        for (int i = 0; i < 1_000_000; i++)  // ~0,010014 сек.
//            str.append("+");

        str.append("+".repeat(1_000_000));  // ~0,004315 сек.

//        var f = System.currentTimeMillis();
        long finish = System.nanoTime();
        System.out.printf("\nЗатраченное время: %f сек.\n", (finish - start) / 1e+9);
    }
}
