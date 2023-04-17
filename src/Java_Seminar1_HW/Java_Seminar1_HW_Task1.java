/* Задача 1a: Вычислить n-ое треугольное число(сумма чисел от 1 до n).
 * Задача 1b: Вычислить n! (произведение чисел от 1 до n).
 */

package Java_Seminar1_HW;

import java.util.Scanner;

public class Java_Seminar1_HW_Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите целое число n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        System.out.printf("-> Сумма чисел от 1 до n (n-ое треугольное число) = %d\n", sum);

        int prod = 1;
        for (int i = 1; i <= n; i++) prod *= i;
        System.out.printf("-> Произведение чисел от 1 до n (n!) = %d\n", prod);
    }
}