// Задача 2.
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь

package Java_Seminar5_Classwork;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Java_Seminar5_CW_Task2 {
    public static boolean isCorrect(String str) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> dict = new HashMap<>();
        dict.put('{', '}');
        dict.put('(', ')');
        dict.put('[', ']');
        dict.put('<', '>');

        for (char item : str.toCharArray()) {
            if (dict.containsKey(item)) {
                stack.push(item);
            } else if (dict.containsValue(item)) {
                if (!dict.get(stack.pop()).equals(item)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "{a+]}{(d*3)}";
        if (isCorrect(str)) {
            System.out.println("Истина");
        } else
            System.out.println("Ложь");
    }
}


// АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ:

//import org.jetbrains.annotations.NotNull;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//import java.util.Stack;
//
//public class Task2 {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите строку s: ");
//        String s = scanner.nextLine();
//        scanner.close();
//
//        System.out.println(rightBrackets(s));
//    }
//
//    private static boolean rightBrackets(@NotNull String s) {
//        Map<Character, Character> brackets = new HashMap<>();
//        Stack<Character> open = new Stack<>();
//        brackets.put('{', '}');
//        brackets.put('(', ')');
//        brackets.put('<', '>');
//        brackets.put('[', ']');
//
//        for (int i = 0; i < s.length(); i++) {
//            if (brackets.containsKey(s.charAt(i))) open.push(s.charAt(i));
//            else if (brackets.containsValue(s.charAt(i))) {
//                if (open.empty() || s.charAt(i) != brackets.get(open.pop())) return false;
//            }
//        }
//        return open.empty();
//    }
//}