/* Группа 3730, Рябцев А.
 * Домашнее задание 6.
 * Подумать над структурой класса "Ноутбук" для магазина техники - выделить поля и методы. Реализовать в Java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации
 * и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем ЖД
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */

package Java_Seminar6_HW;

import java.util.*;

import static Java_Seminar6_HW.Laptop.filterBy;

public class Java_Seminar6_HW_Task1 {
    public static void main(String[] args) {
        Set<Laptop> shop = new HashSet<>();
        shop.add(new Laptop("ASUS", 16, 256, "Windows", "Black", 15));
        shop.add(new Laptop("Lenovo", 8, 128, "Windows", "Blue", 14));
        shop.add(new Laptop("Dell", 32, 1024, "Windows", "White", 17));
        shop.add(new Laptop("HP", 4, 128, "Windows", "Black", 11));
        shop.add(new Laptop("Apple", 16, 512, "Mac OS", "Silver", 14));

        Set<Laptop> shopCopy = new HashSet<>(shop);
        Map<Integer, Object> filters = new HashMap<>();
        printMenu();
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (input != 9) {
            switch (input) {
                case 1 -> {
                    System.out.print("Введите желаемого производителя (строкой): ");
                    filters.put(1, scanner.next());
                }
                case 2 -> {
                    System.out.print("Введите желаемый объём ОЗУ (числом): ");
                    filters.put(2, scanner.nextInt());
                }
                case 3 -> {
                    System.out.print("Введите желаемый объём HDD/SSD (числом): ");
                    filters.put(3, scanner.nextInt());
                }
                case 4 -> {
                    System.out.print("Введите желаемую ОС (строкой): ");
                    filters.put(4, scanner.next());
                }
                case 5 -> {
                    System.out.print("Введите желаемый цвет (строкой): ");
                    filters.put(5, scanner.next());
                }
                case 6 -> {
                    System.out.print("Введите желаемую диагональ (числом): ");
                    filters.put(6, scanner.nextInt());
                }
                case 7 -> {
                    // Поиск и удаление из выборки ноутбуков, не соответствующих фильтрам (критериям).
                    for (Map.Entry<Integer, Object> crit : filters.entrySet()) {
                        for (Iterator<Laptop> laptop = shopCopy.iterator(); laptop.hasNext(); ) {
                            switch (crit.getKey()) {
                                case 1 -> {
                                    if (filterBy(laptop.next().getVendor(), (String) crit.getValue()))
                                        laptop.remove();
                                }
                                case 2 -> {
                                    if (filterBy(laptop.next().getRam(), (int) crit.getValue()))
                                        laptop.remove();
                                }
                                case 3 -> {
                                    if (filterBy(laptop.next().getHdd(), (int) crit.getValue()))
                                        laptop.remove();
                                }
                                case 4 -> {
                                    if (filterBy(laptop.next().getOs(), (String) crit.getValue()))
                                        laptop.remove();
                                }
                                case 5 -> {
                                    if (filterBy(laptop.next().getColor(), (String) crit.getValue()))
                                        laptop.remove();
                                }
                                case 6 -> {
                                    if (filterBy(laptop.next().getDiagonal(), (int) crit.getValue()))
                                        laptop.remove();
                                }
                            }
                        }
                    }

                    if (shopCopy.size() == 0) {
                        System.out.println("-> Подходящие ноутбуки не найдены.");
                    } else {
                        System.out.printf("\n-> В соответствии с объявленными фильтрами: \n%s\n" +
                                "-> Найдены следующие ноутбуки:\n", filters);
                        shopCopy.forEach(System.out::println);
                    }
                }
                case 8 -> {
                    filters.clear();
                    shopCopy.addAll(shop);
                }
                default -> System.out.println("-> Введено некорректное значение!");
            }

            printMenu();
            input = scanner.nextInt();
        }
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("""

                Введите цифру, соответствующую пункту меню:
                1 -> Производитель
                2 -> ОЗУ
                3 -> Объём ЖД
                4 -> Операционная система
                5 -> Цвет
                6 -> Диагональ
                7 -> ОТОБРАЖЕНИЕ РЕЗУЛЬТАТОВ ФИЛЬТРА
                8 -> СБРОС ФИЛЬТРА
                9 -> ЗАВЕРШЕНИЕ ПРОГРАММЫ
                """);
        System.out.print("ВЫБОР ЭЛЕМЕНТА МЕНЮ: ");
    }
}