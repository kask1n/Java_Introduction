/* Домашняя работа 5. Задача 2.
 *
 * Пусть дан список сотрудников:
 * Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин
 * Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина
 * Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов
 *
 * Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений.
 * Отсортировать по убыванию популярности.
 */

package Java_Seminar5_HW;

import java.util.*;

public class Java_Seminar5_HW_Task2 {
    public static void main(String[] args) {
        String input = "Иван Иванов Светлана Петрова Кристина Белова Анна Мусина Анна Крутова Иван Юрин Петр Лыков Павел Чернов Петр Чернышов Мария Федорова Марина Светлова Мария Савина Мария Рыкова Марина Лугова Анна Владимирова Иван Мечников Петр Петин Иван Ежов";
        String[] employees = input.split(" ");

        Map<String, Integer> countNames = new HashMap<>();
        for (int i = 0; i < employees.length; i += 2) {
            if (!countNames.containsKey(employees[i])) {
                countNames.put(employees[i], 1);
            } else {
                int a = countNames.get(employees[i]);
                countNames.put(employees[i], a + 1);
            }
        }

        System.out.printf("\nИсходный словарь: \n%s\n", countNames);

        Map<String, Integer> popularNames = new HashMap<>();  // Фильтр на повторяющиеся имена.
        for (Map.Entry<String, Integer> pair : countNames.entrySet()) {
            if (pair.getValue() > 1) {
                popularNames.put(pair.getKey(), pair.getValue());
            }
        }

        ArrayList<String> names = new ArrayList<>(popularNames.keySet());
        ArrayList<Integer> count = new ArrayList<>(popularNames.values());
        Map<String, Integer> resultNames = new LinkedHashMap<>();

        while (count.size() > 0) {
            Integer max = Collections.max(count);
            resultNames.put(names.get(count.indexOf(max)), max);
            names.remove(count.indexOf(max));
            count.remove(max);  // Перегрузка метода .remove для удобочитаемости кода.
        }

// АЛЬТЕРНАТИВНЫЙ СПОСОБ ВЫВОДА НА ЭКРАН ОТСОРТИРОВАННЫХ ЗНАЧЕНИЙ СЛОВАРЯ:
//        popularNames.entrySet().stream()
//                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
//                .forEach(System.out::println);

        System.out.printf("-> Отсортированный и отфильтрованный словарь: \n%s\n", resultNames);
    }
}