/* Задача 6 (доп).
 * Реализовать функцию возведения числа а в степень b, где a, b лежат во множестве Z.
 * Сводя количество выполняемых действий к минимуму.
 *
 * Пример 1: а = 3, b = 2, ответ: 9
 * Пример 2: а = 2, b = -2, ответ: 0.25
 * Пример 3: а = 3, b = 0, ответ: 1
 */

package Java_Seminar1_CW;

public class Java_Seminar1_CW_Task6 {
    public static void main(String[] args) {
        double c = powRec(3, 3);
        System.out.println(c);

        c = powIter(3, 3);
        System.out.println(c);
    }

    public static double powRec(double a, int b) {  // Рекурсивное решение.
        if (b == 0)
            return 1;
        if (b < 0)
            return powRec(1 / a, -b);

        double res = powRec(a, b / 2);
        return b % 2 == 0 ? res * res : res * res * a;
    }

    public static double powIter(double a, int b) {
        if (a == 0 || a == 1)
            return a;
        if (b == 0)
            return 1;

        if (b < 0) {
            b = -b;
            a = 1 / a;
        }

        double result = 1;
        while (b > 0) {
            if (b % 2 == 1)
                result = result * a;
            a = a * a;
            b = b / 2;
        }
        return result;
    }
}