// Домашнее задание 4. Задача 2.
// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package Java_Seminar4_HW;


import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class Java_Seminar4_HW_Task2 {

    private static LinkedList<Integer> enqueue(LinkedList<Integer> linkedList) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nВведите число, которое хотите добавить в конец очереди: ");
        linkedList.add(scanner.nextInt());
        scanner.close();

        return linkedList;
    }

    private static int dequeue(LinkedList<Integer> linkedList) {
        return linkedList.removeFirst();
    }

    private static int first(LinkedList<Integer> linkedList) {
        return linkedList.getFirst();
    }

    public static void main(String[] args) {
        LinkedList<Integer> queue = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.printf("\nИсходная очередь: %s\n", queue);

        System.out.println(enqueue(queue));

        System.out.printf("\nВозвращаем первый элемент с удалением: %d\n", dequeue(queue));
        System.out.println(queue);

        System.out.printf("\nВозвращаем первый элемент без удаления: %d\n", first(queue));
        System.out.printf("Итоговая очередь: %s\n", queue);
    }
}
