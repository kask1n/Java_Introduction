/*
 Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.
 */

package Java_Seminar4_HW;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Java_Seminar4_HW_Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in, StandardCharsets.UTF_8);
        System.out.println("\nВведите элементы списка в одну строку через пробел: ");
        String inputString = scanner.nextLine();
        scanner.close();

        List<String> list = new LinkedList<>(Arrays.asList(inputString.split(" ")));
        System.out.printf("Исходный список: %s\n", list);

        System.out.printf("-> Перевёрнутый список: %s\n", reverseList(list));
    }

    private static List<String> reverseList(List<String> list) {

        List<String> copy = new LinkedList<>();
        for (String item : list)
            copy.add(0, item);

        return copy;
    }
}