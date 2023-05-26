/* Задача 0.
 * Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации
 * 123456 Иванов
 * 321456 Васильев
 * 234561 Петрова
 * 234432 Иванов
 * 654321 Петрова
 * 345678 Иванов
 * Вывести данные по сотрудникам с фамилией Иванов.
 */

package Java_Seminar5_Classwork;

import java.util.HashMap;
import java.util.Map;

public class Java_Seminar5_CW_Task0_Map {
    public static void main(String[] args) {

        Map<Integer, String> passportToLastName = new HashMap<>();
        passportToLastName.put(123456, "Иванов");
        passportToLastName.put(321456, "Васильев");
        passportToLastName.put(234561, "Петрова");
        passportToLastName.put(234432, "Иванов");
        passportToLastName.put(654321, "Петрова");
        passportToLastName.put(345678, "Иванов");

        System.out.println(passportToLastName);

        for (Map.Entry<Integer, String> pair : passportToLastName.entrySet()) {
            if (pair.getValue().equals("Иванов"))
                System.out.println(pair);
        }
    }
}