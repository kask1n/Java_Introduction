package Java_Lecture4;

import java.util.*;

public class Ex003_Deque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1);
        deque.addLast(2);
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
        deque.offerFirst(1);
        deque.offerLast(2);
        System.out.println(deque);
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);
        deque.offerFirst(12);
        deque.offerLast(23);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }
}