/* Домашнее задание 2. Задача 4*.
 * К калькулятору из предыдущего дз добавить логирование.
 */

package Java_Seminar2_HW;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;

public class Java_Seminar2_HW_Task4 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nВведите первое число: ");
        double a = scanner.nextDouble();

        System.out.print("Введите один из операторов [+] [-] [*] [/]: ");
        String operator = scanner.next();

        System.out.print("Введите второе число: ");
        double b = scanner.nextDouble();

        Logger logger = Logger.getLogger(Java_Seminar2_HW_Task4.class.getName());
        FileHandler info = new FileHandler("\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\Task4_Log.xml");

        String res = null;
        switch (operator) {
            case "+" -> res = String.format("-> %s + %s = %s\n", format(a), format(b), format(a + b));
            case "-" -> res = String.format("-> %s - %s = %s\n", format(a), format(b), format(a - b));
            case "*" -> res = String.format("-> %s * %s = %s\n", format(a), format(b), format(a * b));
            case "/" -> {
                if (b == 0) res = "-> ОШИБКА: Нельзя делить на ноль.";
                else res = String.format("-> %s / %s = %s\n", format(a), format(b), format(a / b));
            }
        }
        logger.addHandler(info);
        logger.info(res);
        System.out.println(res);
    }

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }
}