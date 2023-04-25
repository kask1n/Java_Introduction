/* Задача 4.
 * Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
 * что на 0-й позиции каждого внутреннего списка содержится название жанра,
 * а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
 */

package Java_Seminar3_Classwork;

import java.io.FileWriter;
import java.io.IOException;
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