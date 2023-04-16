package Java_Seminar1_HW;

import java.util.Scanner;

public class Java_Seminar1_HW_Task3 {
    /*
     * 3. Реализовать простой калькулятор
     */

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите первое число: ");
        int a = iScanner.nextInt();
        System.out.printf("Введите оператор (+, -,, /): ");
        String operator = iScanner.next();
        System.out.printf("Введите второе число: ");
        int b = iScanner.nextInt();

        switch (operator) {
            case "+":
                System.out.printf("%d + %d = %d\n", a, b, a + b);
                break;

            case "-":
                System.out.printf("%d - %d = %d\n", a, b, a - b);
                break;

            case "":
                System.out.printf("%d %d = %d\n", a, b, a * b);
                break;

            case "/":
                System.out.printf("%d / %d = %d\n", a, b, a / b);
                break;

        }
    }
}
