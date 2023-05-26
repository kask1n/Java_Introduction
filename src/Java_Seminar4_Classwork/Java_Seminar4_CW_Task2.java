/* Задача 2.
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя и "запоминает" строки.
 * Если введено print, выводит строки в обратном порядке (первая введённая окажется последней выведенной).
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */

package Java_Seminar4_Classwork;

import java.util.*;

public class Java_Seminar4_CW_Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> arrDeque = new ArrayDeque<>();

        while (true) {
            String str = scanner.nextLine();

            switch (str) {
                case "exit" -> System.exit(0);
                case "print" -> {
                    System.out.print("[ ");
                    for (Iterator<String> it = arrDeque.descendingIterator(); it.hasNext(); ) {
                        String s = it.next();
                        if (it.hasNext())
                            System.out.printf("%s, ", s);
                        else
                            System.out.printf("%s", s);
                    }
                    System.out.print(" ]\n");
                }
                case "revert" -> System.out.println(arrDeque.pop());
                default -> arrDeque.add(str);
            }
        }
    }
}