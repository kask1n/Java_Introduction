// Задача 2.
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
        System.out.println("Введите число, которое хотите добавить в конец очереди: ");
        linkedList.add(scanner.nextInt());
        return linkedList;
    }

    private static LinkedList<Integer> dequeue(LinkedList<Integer> linkedList) {
        System.out.printf("Удаляем первый элемент: %d\n", linkedList.removeFirst());
        return linkedList;
    }

    private static void first(LinkedList<Integer> linkedList) {
        int number = linkedList.getFirst();
        System.out.printf("Выводим первый элемент, не удаляя его: %d\n", number);
    }

    public static void main(String[] args) {

        LinkedList<Integer> queue = new LinkedList<>(Arrays.asList(1,2,3,4,5));
        System.out.println(queue);
        System.out.println(enqueue(queue));
        System.out.println(dequeue(queue));
        first(queue);

        System.out.printf("Итоговая очередь: %s", queue);
    }
}
