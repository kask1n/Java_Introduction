package Java_Seminar6_HW;

import java.util.*;

public class Java_Seminar6_HW_Task1_Alternate {
    public static void main(String[] args) {
        LaptopAlternate laptop1 = new LaptopAlternate("Samsung", 16, 512, "windows", "cherry");
        LaptopAlternate laptop2 = new LaptopAlternate("Lenovo", 8, 256, "windows", "black");
        LaptopAlternate laptop3 = new LaptopAlternate("Macbook", 32, 512, "macos", "silver");

        Set<LaptopAlternate> laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);

        Map<Integer, String> filter = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        // Выбор критериев.
        while (flag) {
            System.out.println("Задайте критерии фильтрации: \n" +
                    "1 - ОЗУ\n" +
                    "2 - Объём ЖД\n" +
                    "3 - Операционная система\n" +
                    "4 - Цвет\n" +
                    "5 - Запустить поиск");
            if (scanner.hasNextInt()) {
                int input = scanner.nextInt();
                switch (input) {
                    case 1 -> {
                        System.out.println("Введите минимальный объем памяти: ");
                        filter.put(1, scanner.next());
                    }
                    case 2 -> {
                        System.out.println("Введите минимальный объем жесткого диска:");
                        filter.put(2, scanner.next());
                    }
                    case 3 -> {
                        System.out.println("Введите операционную систему: ");
                        filter.put(3, scanner.next().toLowerCase());
                    }
                    case 4 -> {
                        System.out.println("Введите цвет ноутбука:");
                        filter.put(4, scanner.next().toLowerCase());
                    }
                    case 5 -> flag = false;
                    default -> System.out.println("Неверное число");
                }
            } else {
                flag = false;
                System.out.println("Вы ввели не число");
            }
//            System.out.println(filter);
        }

        Set<LaptopAlternate> results = new HashSet<>();
        long start = System.nanoTime();

        for (LaptopAlternate element : laptops) {
            if ((filter.containsKey(1) && Integer.parseInt(filter.get(1)) > element.getRam())
                    || (filter.containsKey(2) && Integer.parseInt(filter.get(2)) > element.getHdd())
                    || (filter.containsKey(3) && !filter.get(3).equals(element.getOs()))
                    || (filter.containsKey(4) && !filter.get(4).equals(element.getColor()))) {
                results.add(element);
            }
        }

        laptops.removeAll(results); // Разность множеств: laptop - results.

        long finish = System.nanoTime();
        System.out.println(finish - start);

        for (LaptopAlternate laptop : laptops)
            System.out.println(laptop.getModel());
    }
}