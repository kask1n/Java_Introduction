// Домашнее задание 2. Задача 1.
// В файле содержится строка с исходными данными в такой форме:
// {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
// Требуется на её основе построить и вывести на экран новую строку, в форме SQL запроса:
// SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city = "Moscow";
// Для разбора строки используйте String.split. Сформируйте новую строку, используя StringBuilder.
// Значения null не включаются в запрос.

package Java_Seminar2_HW;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Java_Seminar2_HW_Task1 {
    public static void main(String[] args) throws FileNotFoundException {

        File students = new File("\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\students.txt");
        FileReader reader = new FileReader(students);
        Scanner scan = new Scanner(reader);

//        while (scan.hasNextLine())  // Проверка наличия строки.
//            System.out.println(scan.nextLine()); // Вывод на экран следующей строки.

        String input = "";
        while (scan.hasNextLine())
            input = scan.nextLine();
        System.out.println(input);

        input = input.substring(1, input.length() - 2);
        input = input.replace(":", ",").replaceAll("[\" ]", "");
        String[] parts = input.split(",");
        System.out.println(Arrays.toString(parts));

        StringBuilder sb = new StringBuilder();
        sb.append("SELECT * FROM students WHERE ");
        for (int i = 0; i < parts.length; i += 2) {
            if (!parts[i + 1].equals("null"))
                sb.append(String.format("%s = %s AND ", parts[i], parts[i + 1]));
        }
        sb.replace(sb.lastIndexOf(" AND "), sb.length(), ";");  // [begin; end)

        System.out.println(sb);
    }
}


// АЛЬТЕРНАТИВНОЕ РЕШЕНИЕ:
// String input = students;

// try (FileWriter fw = new FileWriter("students.txt", false)) {
//     fw.write(res);

// } catch (IOException ex) {
//     System.out.println(ex.getMessage());
// }

//        BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
//        String[] input = reader.readLine()
//                .replace("{", "")
//                .replace("}", "")
//                .split(",");
//
//        StringBuilder sb = new StringBuilder();
//        sb.append("SELECT * FROM students WHERE ");
//
//        for (String s : input) {
//            String[] temp = s.trim().split(":");
//            if (!temp[1].contains("null")) {
//                sb.append(temp[0].replace(""", "")).append(" = ").append(temp[1]).append(" AND ");
//            }
//        }
//
//        sb.replace(sb.lastIndexOf(" AND "), sb.length()-1, ";");
//        System.out.println(sb);

// File students = new File("E:\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\students.txt");
//        FileReader reader = new FileReader("E:\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\students.txt");
//        String file = students.getName();
//        Scanner scan = new Scanner(reader);
//        String input = scan.nextLine();
//        scan.close();
//        input = input.substring(1, input.length() - 2);
//        input = input.replace(":", ",").replaceAll("[\" ]", "");
//
//        String[] parts = input.split(",");
//        System.out.println(Arrays.toString(parts));
//        StringBuilder sb = new StringBuilder();
//        sb.append(String.format("SELECT * FROM %s WHERE ", file.replaceAll("\\.\\w+$", "")));
//
//        for (int i = 0; i < parts.length; i += 2) {
//            if (!parts[i + 1].equals("null"))
//                sb.append(String.format("%s = %s AND ", parts[i], parts[i + 1]));
//        }
//        sb.replace(sb.lastIndexOf(" AND "), sb.length() - 1, ";");
//
//
//        System.out.println(sb);