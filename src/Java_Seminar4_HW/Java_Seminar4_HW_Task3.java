/* Домашнее задание 4. Задача 3*
 * Напишите постфиксный калькулятор. Пользователь вводит данные и операции в обратной польской записи.
 * Калькулятор вычисляет результат и проверяет, что в стэке получилось единственное число.
 * Например:
 * 5 4 3 - + => 5 1 + => 6
 * 1 2 + 3 * => 3 3 * => 9
 * 1 2 3 * + => 1 6 + => 7
 */

package Java_Seminar4_HW;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Java_Seminar4_HW_Task3 {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите данные в формате обратной польской записи: ");
        String input = scanner.nextLine();
        scanner.close();

        String[] arr = input.split(" ");
        System.out.println(Arrays.toString(arr));

        Stack<Double> stack = new Stack<>();
        for (String s : arr) {
            if (isDigit(s)) {
                stack.push(Double.parseDouble(s));
            } else {
                switch (s) {
                    case "+" -> stack.push(stack.pop() + stack.pop());
                    case "-" -> stack.push(-stack.pop() + stack.pop());
                    case "*" -> stack.push(stack.pop() * stack.pop());
                    case "/" -> {
                        if (stack.peek() == 0) {
                            System.out.println("-> ОШИБКА: Нельзя делить на ноль!");
                            return;
                        } else stack.push((1 / stack.pop()) * stack.pop());
                    }
                }
            }
        }

        if (stack.size() > 1)
            System.out.println("-> Исходные данные некорректны!");
        else
            System.out.printf("-> Ответ: %s\n", format(stack.peek()));
    }
}