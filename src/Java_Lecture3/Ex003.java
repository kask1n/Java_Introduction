package Java_Lecture3;

import java.util.ArrayList;

public class Ex003 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<>();

        ArrayList<Integer> list3 = new ArrayList<>(10);
        // Создать новый список вместимостью 10 ячеек (пока пустых).
        System.out.println(list3);

        ArrayList<Integer> list4 = new ArrayList<>(list3);
        list4.add(123);
        System.out.println(list4);
    }
}
