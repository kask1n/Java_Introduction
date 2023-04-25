// Дана строка json:
// [{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},
//  {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"},
//  {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
// Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package Java_Seminar2_HW;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Java_Seminar2_HW_Task3 {
    public static void main(String[] args) throws FileNotFoundException {

        FileReader reader = new FileReader("E:\\Git\\Java_Introduction\\src\\Java_Seminar2_HW\\students_task3.txt");
        Scanner scan = new Scanner(reader);
        String input = scan.nextLine();
        scan.close();

        input = input.substring(1, input.length() - 2);
        input = input.replace(":", ",").replaceAll("[{} \"]", "");
        String[] arrString = input.split(",");

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arrString.length - 5; i += 6) {
            result.append(String.format("\nСтудент %s получил %s по предмету %s.",
                    arrString[i + 1], arrString[i + 3], arrString[i + 5]));
        }

        System.out.println(result);
    }
}
