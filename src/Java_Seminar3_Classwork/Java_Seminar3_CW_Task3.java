/* Задача 3.
 * Создать список типа ArrayList<String>.
 * Поместить в него как строки, так и целые числа.
 * Пройти по списку, найти и удалить целые числа.
 */

package Java_Seminar3_Classwork;

import java.util.ArrayList;
import java.util.List;

public class Java_Seminar3_CW_Task3 {
    public static void main(String[] args) {

        List list = new ArrayList<String>();
        list.add("hello");
        list.add("hello2");
        list.add("hello3");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // for (int i = 0; i < list.size(); i++) {
        //     if (list.get(i) instanceof Integer) {list.remove(i--); }
        // }

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i) instanceof Integer) {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}