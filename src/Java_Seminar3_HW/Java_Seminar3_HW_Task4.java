// Домашняя работа. Задача 4*.
// Даны два ArrayList из целых чисел. Написать функции, которые вычисляют разницу коллекций:
// Разность:
// A - B = все числа из первой коллекции, которые не содержатся во второй коллекции
// B - A = все числа из второй коллекции, которые не содержатся в первой
// Симметрическая разность:
// A ^ B = числа из первой коллекции, которых нет во второй, А ТАКЖЕ числа из второй, которых нет в первой.

package Java_Seminar3_HW;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_Seminar3_HW_Task4 {
    public static void main(String[] args) {

        ArrayList<Integer> first = new ArrayList<>(Arrays.asList(4, 5, 6, 7, 8, 9));
        ArrayList<Integer> second = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        System.out.printf("""
                                                
                        ДАНО
                        Коллекция A: %s
                        Коллекция B: %s
                        ---------------
                        РЕШЕНИЕ
                        A - B: %s
                        B - A: %s
                        A ^ B: %s
                        """,
                first, second,
                notRightJoin(first, second), notLeftJoin(first, second), notInnerJoin(first, second));
    }

    public static ArrayList<Integer> notRightJoin(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> notRightJoin = new ArrayList<>();
        for (Integer item : first) {
            if (!second.contains(item))
                notRightJoin.add(item);
        }
        return notRightJoin;
    }

    public static ArrayList<Integer> notLeftJoin(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> notLeftJoin = new ArrayList<>();
        for (Integer item : second) {
            if (!first.contains(item))
                notLeftJoin.add(item);
        }
        return notLeftJoin;
    }

    public static ArrayList<Integer> notInnerJoin(ArrayList<Integer> first, ArrayList<Integer> second) {
        ArrayList<Integer> notInnerJoin = new ArrayList<>();

        for (Integer item : first) {
            if (!second.contains(item))
                notInnerJoin.add(item);
        }
        for (Integer item : second) {
            if (!first.contains(item))
                notInnerJoin.add(item);
        }
        return notInnerJoin;

    }
}
