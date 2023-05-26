package Java_Lecture6.part2;

import java.util.*;

public class Ex001_Program {

    public static void main(String[] args) {
        // #region

        Worker w1 = new Worker();
        w1.firstName = "Имя_1";
        w1.lastName = "Фамилия_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Имя_1";
        w4.lastName = "Фамилия_1";
        w4.salary = 100;
        w4.id = 1000;

        Worker w2 = new Worker();
        w2.firstName = "Имя_2";
        w2.lastName = "Фамилия_2";
        w2.salary = 200;
        w2.id = 2000;

        Worker w3 = new Worker();
        w3.firstName = "Имя_3";
        w3.lastName = "Фамилия_3";
        w3.salary = 300;
        w3.id = 3000;

        System.out.println(w1);  // id:1000 fn:Имя_1 ln:Фамилия_1 s:100
        System.out.println(w2);  // id:2000 fn:Имя_2 ln:Фамилия_2 s:200
        System.out.println(w3);  // id:3000 fn:Имя_3 ln:Фамилия_3 s:300
        System.out.println(w4);  // id:1000 fn:Имя_1 ln:Фамилия_1 s:100
        //#endregion

        // БЕЗ ПЕРЕНАЗНАЧЕНИЯ МЕТОДОВ // С ПЕРЕНАЗНАЧЕНИЕМ: hashCode // equals // hashCode & equals
        System.out.println(w1 == w4);
        // false // false // false // false (равенство ссылок).
        System.out.println(w1.equals(w4));
        // false // false // TRUE // TRUE (для объектов - это равенство ссылок, если не указано иное).
        System.out.println(w1.hashCode() == w4.hashCode());
        // false // TRUE // false // TRUE (проверка hash).

        var workers = new HashSet<>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
        // false // false // false // TRUE (проверка hash && equals).

        // hashCodes:
        // Worker@5f184fc6 // Worker@3e8 // Worker@5f184fc6 // Worker@3e8
        // Worker@3feba861 // Worker@7d0 // Worker@3feba861 // Worker@7d0
        // Worker@5b480cf9 // Worker@bb8 // Worker@5b480cf9 // Worker@bb8
        // Worker@6f496d9f // Worker@3e8 // Worker@6f496d9f // Worker@3e8
    }
}