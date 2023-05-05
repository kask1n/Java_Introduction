package Java_Lecture3;

import java.util.Arrays;
import java.util.List;

public class Ex005_ArraysMethod {
    public static void main(String[] args) {
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[]{day, month, year};

        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]

//        d.set(1, new StringBuilder("09"));
        date[1] = new StringBuilder("09");
        // При перезаписи значения в массиве меняется значение и в списке, т.к. ссылается на него же.
        System.out.println(d); // [29, 09, 1990]
    }
}