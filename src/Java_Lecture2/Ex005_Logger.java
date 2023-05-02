package Java_Lecture2;

import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class Ex005_Logger {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Ex005_Logger.class.getName());
        //ConsoleHandler ch = new ConsoleHandler();

        String file = System.getProperty("user.dir")
                .concat(File.separator).concat("src")
                .concat(File.separator).concat("Java_Lecture2")
                .concat(File.separator).concat("Ex005_log.xml");
        FileHandler fh = new FileHandler(file);
        //logger.addHandler(ch); // Информация для logger с указанием, куда отправлять сообщения.
        logger.setUseParentHandlers(false);  // ОТКЛЮЧЕНИЕ СТАНДАРТНОГО ВЫВОДА log в консоль.
        logger.addHandler(fh); // Информация для logger с указанием, куда отправлять сообщения.

//        SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
//        fh.setFormatter(sFormat);
        fh.setFormatter(xml);

        //logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");  // Level.WARNING - уровень сообщения.
        logger.info("Тестовое логирование 2");

    }
}