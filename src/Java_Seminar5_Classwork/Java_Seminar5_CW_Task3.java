// Задача 3.
// Написать метод, который переводит число из римского формата записи в арабский.
// Например, MMXXII = 2022
//
// Принципы римской с/с:
// http://graecolatini.bsu.by/htm-different/num-converter-roman.htm

package Java_Seminar5_Classwork;

public class Java_Seminar5_CW_Task3 {
    public static void main(String[] args) {

        String s = "MMXXIIII";

        int number = 0;
        int answer = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            switch (s.charAt(i)) {
                case 'M' -> number = 1000;
                case 'D' -> number = 500;
                case 'C' -> number = 100;
                case 'L' -> number = 50;
                case 'X' -> number = 10;
                case 'V' -> number = 5;
                case 'I' -> number = 1;
            }

            if (4 * number > answer) answer += number;
            else answer -= number;
        }

        System.out.println(answer);
    }
}