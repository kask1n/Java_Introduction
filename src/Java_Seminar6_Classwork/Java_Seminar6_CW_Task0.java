package Java_Seminar6_Classwork;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Java_Seminar6_CW_Task0 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of(480, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new HashSet<>(List.of(480, 1, 2, 3, 2, 7, 4, 5, 6, 3));
        System.out.println(linkedHashSet);

        Set<Integer> treeSet = new HashSet<>(List.of(480, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);
    }
}