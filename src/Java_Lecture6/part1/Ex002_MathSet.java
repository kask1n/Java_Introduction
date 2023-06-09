package Java_Lecture6.part1;

import java.util.*;

public class Ex002_MathSet {
    public static void main(String[] args) {
        var a = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        var b = new HashSet<>(Arrays.asList(2, 3, 5, 7, 11, 13, 17));
        var u = new HashSet<>(a);
        u.addAll(b);  // Объединение множеств.
        var r = new HashSet<>(a);
        r.retainAll(b);  // Пересечение множеств.
        var s = new HashSet<>(a);
        s.removeAll(b);  // Разность множеств.

        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]

        System.out.println(a.addAll(b)); // true
        System.out.println(a);
    }
}