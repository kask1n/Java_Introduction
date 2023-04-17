/* Задача 4*.
 * Задано уравнение вида q + w = e, q, w, e >= 0.
 * Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69.
 * Требуется восстановить выражение до верного равенства.
 * Предложить хотя бы одно решение или сообщить, что его нет.
 */

package Java_Seminar1_HW;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Seminar1_HW_Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите цифры 0...9 или '?' через запятую для уравнения вида XX + XX = XX");
        String line = scanner.nextLine().trim().replaceAll(",", "");
        scanner.close();

        char a = line.charAt(0);
        char b = line.charAt(1);
        char c = line.charAt(2);
        char d = line.charAt(3);
        char e = line.charAt(4);
        char f = line.charAt(5);

        int at;
        int bt;
        int ct;
        int dt;
        int et;
        int ft;

        ArrayList<String> solutions = new ArrayList<>();
        String temp;

        boolean flag = false;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    for (int l = 0; l < 10; l++) {
                        for (int m = 0; m < 10; m++) {
                            for (int n = 0; n < 10; n++) {

                                if (a != 63) at = Character.digit(a, 10);
                                else at = i;
                                if (b != 63) bt = Character.digit(b, 10);
                                else bt = j;
                                if (c != 63) ct = Character.digit(c, 10);
                                else ct = k;
                                if (d != 63) dt = Character.digit(d, 10);
                                else dt = l;
                                if (e != 63) et = Character.digit(e, 10);
                                else et = m;
                                if (f != 63) ft = Character.digit(f, 10);
                                else ft = n;

                                if (at * 10 + bt + ct * 10 + dt == et * 10 + ft) {
                                    temp = String.format("%d%d + %d%d = %d%d", at, bt, ct, dt, et, ft);
                                    if (!solutions.contains(temp)) {
                                        solutions.add(temp);
                                    }

                                    flag = true;

                                }
                            }
                        }
                    }
                }
            }
        }

        if (flag) {
            System.out.printf("""
                                        
                    -> Для уравнения вида
                    %c%c + %c%c = %c%c
                    существуют следующие решения:
                    """, a, b, c, d, e, f);

            for (String solution : solutions) {
                System.out.println(solution);
            }

        } else {
            System.out.println("\n-> Решений нет.");
        }
    }
}
