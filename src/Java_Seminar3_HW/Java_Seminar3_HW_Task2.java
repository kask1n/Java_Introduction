package Java_Seminar3_HW;

import java.util.ArrayList;
import java.util.Arrays;

//public class Java_Seminar3_HW_Task2 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9));
//        System.out.println(arr);
//        for (int i = 0; i < arr.size(); i++) {
//            if (arr.get(i) % 2 == 0) {
//                arr.remove(i);
//            }
//        }
//        System.out.println(arr);
//    }
//}
//import java.text.NumberFormat;
//        import java.util.ArrayList;
//        import java.util.Arrays;

// Задан целочисленный список ArrayList.
// Найти минимальное, максимальное и среднее арифметичское этого списка.

//public class Project3 {
//    public static void main(String[] args) {
//        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
//
//        int max = arr.get(0);
//        int min = arr.get(0);
//        double summ = 0;
//        for (int i = 0; i < arr.size(); i++) {
//            if (max < arr.get(i))
//                max = arr.get(i);
//
//            if (min > arr.get(i))
//                min = arr.get(i);
//            summ += arr.get(i);
//        }
//        // float average = summ / arr.size();
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(format(summ / arr.size()));
//    }
//
//    private static String format(double value) {
//        return NumberFormat.getInstance().format(value);
//    }
//}
