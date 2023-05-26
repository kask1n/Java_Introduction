package Java_Lecture6.part1;

import java.util.*;

public class Ex003_TreeSet {
    public static void main(String[] args) {
        var a = new TreeSet<>(Arrays.asList(1, 7, 2, 3, 6, 4, 5));
        var b = new TreeSet<>(Arrays.asList(13, 3, 17, 7, 2, 11, 5));

        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [2, 3, 5, 7, 11, 13, 17]
        System.out.println(a.headSet(4)); // [1, 2, 3]  // Начало Set до элемента 4 (не включая).
        System.out.println(a.tailSet(4)); // [4, 5, 6, 7]  // Хвост Set, начиная с элемента 4.
        System.out.println(a.subSet(3, 5)); // [3, 4]  // Часть Set, в диапазоне элементов [3, 5).
    }
}