package Java_Lecture2;

import java.io.*;
import java.util.Objects;

public class Ex003_tryDemo {
    public static void main(String[] args) {

        String line = "empty";
        try {
            String pathProject = System.getProperty("user.dir");  // Перейти в текущую папку с проектом.
            String pathFile = pathProject
                    .concat(File.separator).concat("src")  // File.separator для совместимости с разными ОС.
                    .concat(File.separator).concat("Java_Lecture2")
                    .concat(File.separator).concat("Ex003_file.txt");
            File file = new File(pathFile);
            System.out.println(file.getAbsolutePath());

            System.out.println("try");

//            if (file.mkdir())  // Создание нового каталога.
//                System.out.println("+");
//            else
//                System.out.println("-");
//            for (String fname : Objects.requireNonNull(file.list()))
//                System.out.println(fname);

            if (file.createNewFile()) {
                System.out.println("file.created");
            } else {
                System.out.println("file.existed");
                FileWriter fileWriter = new FileWriter(file, true);
                fileWriter.write("new line");

                //#region lineSeparator
                // A string containing "\r\n" for non-Unix 
                // platforms, or a string containing 
                // "\n" for Unix platforms.
                fileWriter.append(System.lineSeparator());
                //#endregion

                fileWriter.write("new line");
                fileWriter.append("new line");
                fileWriter.flush();
                fileWriter.close();
                BufferedReader bufReader = new BufferedReader(new FileReader(file));
                line = bufReader.readLine();
                bufReader.close();
            }
        } catch (Exception e) {
//            e.printStackTrace();  // Вывод описания ошибки при её сбросе из try.
        } finally {
            System.out.println(line);
        }
    }
}
