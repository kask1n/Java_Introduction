/* Домашняя работа. Задача 3.
 * Реализовать простой калькулятор.
 */

package Java_Seminar1_HW;

import java.text.NumberFormat;
import java.util.Scanner;

public class Java_Seminar1_HW_Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите один из операторов [+] [-] [*] [/]: ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        switch (operator) {
            case "+" -> System.out.printf("-> %s + %s = %s\n", format(a), format(b), format(a + b));
            case "-" -> System.out.printf("-> %s - %s = %s\n", format(a), format(b), format(a - b));
            case "*" -> System.out.printf("-> %s * %s = %s\n", format(a), format(b), format(a * b));
            case "/" -> {
                if (b == 0) System.out.println("-> ОШИБКА: Нельзя делить на ноль.");
                else System.out.printf("-> %s / %s = %s\n", format(a), format(b), format(a / b));
            }
        }
    }

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }
}