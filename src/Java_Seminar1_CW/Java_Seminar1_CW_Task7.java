/* Задача 7 (доп).
 * На вход некоторому исполнителю подаётся два числа (a, b). У исполнителя есть две команды:
 * - команда 1 (к1): увеличить на C ( +X ), к A прибавляется C;
 * - команда 2 (к2): увеличить в D раз, A умножается на D;
 * Написать программу, которая выдаёт набор команд,
 * позволяющий число a превратить в число b или сообщить, что это невозможно.
 *
 * Пример 1: а = 1, b = 7, c = 1, d = 3
 * ОТВЕТ: к1, к1, к1, к1, к1, к1 или к1, к2, к1, к1, к1 или к1, к1, к2, к1.
 * Пример 2: а = 11, b = 7, c = 2, d = 1
 * ОТВЕТ: "".
 *
 * Решить задачу с помощью рекурсии.
 */

package Java_Seminar1_CW;

public class Java_Seminar1_CW_Task7 {
    public static void main(String[] args) {
        int a = 1;
        int b = 7;
        int c = 1;
        int d = 3;
        String path = "";
        generate(a, b, c, d, path);
    }

    public static void generate(int source, int target, int c, int d, String path) {
        if (source > target) return;
        if (source == target) {
            System.out.println(path);
            return;
        }

        generate(source + c, target, c, d, path + " k1");
        generate(source * d, target, c, d, path + " k2");
    }
}