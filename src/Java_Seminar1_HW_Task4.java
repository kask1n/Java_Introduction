/*
 4. *+Задано уравнение вида q + w = e, q, w, e >= 0.
 Некоторые цифры могут быть заменены знаком вопроса, например 1? + ?5 = 69.
 Требуется восстановить выражение до верного равенства.
 Предложить хотя бы одно решение или сообщить, что его нет.
 */


public class Java_Seminar1_HW_Task4 {
    public static void main(String[] args) {
        char a = 1;
        char b = 63;
        char c = 63;
        char d = 5;
        char e = 6;
        char f = 9;

        for (int i = 0; i < 10; i++) {
            if (a != 63) {
                i = a;
            }
            for (int j = 0; j < 10; j++) {
                if (b != 63) {
                    j = b;
                }
                for (int l = 0; l < 10; l++) {
                    if (c != 63) {
                        l = c;
                    }
                    for (int k = 0; k < 10; k++) {
                        if (d != 63) {
                            k = d;
                        }
                        for (int n = 0; n < 10; n++) {
                            if (e != 63) {
                                n = e;
                            }
                            for (int m = 0; m < 10; m++) {
                                if (f != 63) {
                                    m = f;
                                }
                                if (i 10 + j + l * 10 + k == n * 10 + m) {
                                    System.out.printf("%d%d + %d%d = %d%d", i , j, l, k, n, m);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}