package Java_Lecture3;
import java.util.Arrays;
import java.util.List;

public class Ex004 {
    public static void main(String[] args) {
        int day = 29;  // Примитивный тип данных.
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };  // Массив ссылочного типа данных.
        List<Integer> d = Arrays.asList(date);  // Сформировать список ссылочного типа данных из массива.
        System.out.println(d); // [29, 9, 1990]
    }
}