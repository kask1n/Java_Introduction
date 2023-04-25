/* Задача 2.
 * Напишите метод, который сжимает строку.
 * Пример: aaaabbbcddaaa → a4b3cd2a3
 */

package Java_Seminar2_Classwork;

public class Java_Seminar2_CW_Task2 {
    public static void main(String[] args) {
        String line = "aaaabbbcdda";

        System.out.println(compressLine(line));

    }

    private static String compressLine(String line) {
        StringBuilder str = new StringBuilder();

        int count = 1;
        for (int i = 0; i < line.length() - 1; i++) {

            if (line.charAt(i) == line.charAt(i + 1)) count++;
            else {
                str.append(line.charAt(i));
                if (count > 1) str.append(count);
                count = 1;
            }
        }
        str.append(line.charAt(line.length() - 1));
        if (count > 1) str.append(count);

        return str.toString();
    }
}

