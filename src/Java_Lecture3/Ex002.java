package Java_Lecture3;

import java.util.ArrayList;

public class Ex002 {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        ArrayList list = new ArrayList();  // Если тип не указан, то создаётся сырой тип (Object).
        list.add(2809);
//        list.add("1234");  // Ошибка, т.к. мы явно указали тип в обобщении ArrayList.

        for (Object o : list) {
            System.out.println(o);
        }
    }
}
