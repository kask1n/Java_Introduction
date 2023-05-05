package Java_Lecture3;

import java.util.List;

public class Ex006 {
    public static void main(String[] args) {
        Character value = null;
        List<Character> list1 = new java.util.ArrayList<>(List.of('S', 'e', 'r', 'g', 'e', 'y'));
        System.out.println(list1);

        list1.remove(1); // java.lang.UnsupportedOperationException, если будет просто List.of()
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);
    }
}
