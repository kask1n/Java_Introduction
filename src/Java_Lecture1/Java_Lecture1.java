package Java_Lecture1;

import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.FileNameMap;
import java.util.Arrays;
import java.util.Scanner;

/**
 * program # Автоматическое создание сниппета в VSCode.
 */
// public class program {
//
// }

// Автоматическое создание сниппета в IntelliJ IDEA.
public class Java_Lecture1 {
    static int t = 123; // Глобальная переменная.

    public static void main(String[] args) throws IOException {
//        System.out.println("bye world");
//        String s = null;
//        System.out.println(s);

//        short age = 10;
//        int salary = 123456;
//        System.out.println(age);
//        System.out.println(salary);

//        float e = 2.7f;
//        double pi = 3.1415;
//        System.out.println(e);
//        System.out.println(pi);

//        double el = 2.7D;
//        System.out.println(el);

//        char ch = '1';
//        System.out.println(Character.isDigit(ch)); // true
//        ch = 'a';
//        System.out.println(Character.isDigit(ch)); // false

//        ch = '{';
//        System.out.println(ch);
//        ch = 123; Присваивается по таблице кодировки ASCII ('{').
//        System.out.println(ch);

//        int a = 13;
//        double d = a;
//        a = d; // Не сработает, т.к. double не может поместиться в int.

//        boolean flag1 = 123 <= 234;
//        System.out.println(flag1); // true
//        boolean flag2 = 123 >= 234 || flag1;
//        System.out.println(flag2); // true
//        boolean flag3 = flag1 ^ flag2;
//        System.out.println(flag3); // false
//
//        boolean f = true && false;
//        System.out.println(f); // false
//        boolean f = true ^ true;
//        System.out.println(f); // false

//        String msg = "Hello world";
//        System.out.println(msg);
//        System.out.println(1 + 2);
//        System.out.println("Bye world");
//
//        var a = 123;
//        System.out.println(a);
//        System.out.println(getType(a)); // Integer
//        var b = 123.456;
//        System.out.println(b);
//        System.out.println(getType(b)); // Double

//        d = 1022;
//        System.out.println(d); // 1022
//        // d = "mistake";
//        // error: incompatible types:
//        // String cannot be converted to double

//        System.out.println(Integer.MIN_VALUE); // -2147483648
//        System.out.println(Integer.MAX_VALUE); // 2147483647

//        String s = "qwer";
//        System.out.println(s.length()); // 4 - посчитать длину строки.
//        System.out.println(s.charAt(1)); // w - вывести символ из строки по индексу.

//        int a = 123;
//        a++; // 124
//        System.out.println(a++); // 124 - Сначала вывод операнда, потом выполнение операции (постфиксной).
//        System.out.println(a); // 125
//        System.out.println(++a); // 126 - Сначала выполнение операции (префиксной), потом вывод операнда.

//        int a = 123;
//        a = a-- - --a; // a = 121
//        //  123 - 121 = 2
//        System.out.println(a); // 121

//        int a = 123;
//        a = --a - a--; // a = 121
//        //  122 - 122 = 0
//        System.out.println(a); // 121

//        boolean f = 123 >= 234;
//        System.out.println(f);
//        f = 123 != 234;
//        System.out.println(f);

//        int a = 8;
//        // 1000
//        System.out.println(a << 1); // 16 = 10000
//        a = 18;
//        // 10010
//        System.out.println(a << 1); // 9 = 1001

//        int a = 5;
//        // 101
//        int b = 2;
//        // 010
//        System.out.println(a | b);
//        // 111 = 7
//        System.out.println(a & b);
//        // 000 = 0
//        System.out.println(a ^ b); // Разделительное ИЛИ (XOR).
//        // 111 = 7

//        String s = "qwe1"; // 4, 0..3
//        boolean b = s.length() >= 5 && s.charAt(4) == '1';
//        boolean b = s.length() >= 5 & s.charAt(4) == '1'; // ОШИБКА: Индекс проверяется несмотря на длину.
//        System.out.println(b);

//        String s = "qwe1"; // 4, 0..3
//        boolean b = s.length() >= 5 || s.charAt(4) == '1'; // ОШИБКА: Индекс проверяется, т.к. >= false.
//        boolean b = s.length() >= 5 | s.charAt(4) == '1'; // ОШИБКА: Индекс проверяется несмотря на длину.
//        System.out.println(b);

//        int[] arr = new int[10];
//        System.out.println(arr.length); // 10
//        System.out.println(arr[3]); // 0
//        arr = new int[]{1, 2, 3, 4, 5};
//        System.out.println(arr.length); // 5
//        System.out.println(arr[3]); // 4
//        arr[3] = 13;
//        System.out.println(arr[3]); // 13

//        String s = new String();
//        System.out.println(s); // По умлочанию присваивается значение null.

//        int[] arr = new int[]{1, 2, 3};
//        System.out.println(Arrays.toString(arr)); // [1, 2, 3]
//        int brr[] = {3}; // Некорректно с точки зрения оформления кода в стиле Java.
//        System.out.println(Arrays.toString(brr)); // [1]

//        int[] arr[] = new int[3][5]; // Создание двумерного массива (массива массивов).
//        for (int[] line : arr) {
//            for (int item : line) {
//                System.out.printf("%d ", item);
//            }
//            System.out.println();
//        }

//        int[][] arr = new int[3][5]; // Создание двумерного массива (массива массивов).
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++) {
//                System.out.printf("%d ", arr[i][j]);
//            }
//            System.out.println();
//        }

//        int i = 123;
//        double d = i;
//        System.out.println(i); // 123
//        System.out.println(d); // 123.0
//        d = 3.1415;
//        i = (int) d;
//        System.out.println(d); // 3.1415
//        System.out.println(i); // 3
//        d = 3.9415;
//        i = (int) d;
//        System.out.println(d); // 3.9415
//        System.out.println(i); // 3

//        byte b = Byte.parseByte("123");
//        System.out.println(b); // 123
//        b = Byte.parseByte("1234");
//        System.out.println(b); // NumberFormatException: Value out of range.

//        int[] a = new int[10];
//        double[] d = a; // ОШИБКА: ИЗУЧАЕМ ковариантность и контрвариантность.
//        System.out.println(d);

// ПОЛУЧЕНИЕ ДАННЫХ ИЗ ТЕРМИНАЛА:
//        Scanner iScanner = new Scanner(System.in);

//        System.out.print("Name: ");
//        String name = iScanner.nextLine(); // Получение строки от пользователя.
//        System.out.printf("Hello, %s!\n", name);

//        System.out.print("int x: ");
//        int x = iScanner.nextInt(); // Получение целого числа от пользователя.
//        System.out.print("int у: ");
//        double y = iScanner.nextDouble(); // Получение дробного числа от пользователя.
//        System.out.printf("%d + %f = %f", x, y, x + y); // 3 + 3,000000 = 6,000000

//        System.out.print("int x: ");
//        boolean flag = iScanner.hasNextInt(); // Проверяет, будет ли следующий токен целым числом.
//        System.out.println(flag);
//        if (flag) {
//            int i = iScanner.nextInt();
//            System.out.println(i);
//        }
//        iScanner.close();

//        int a = 1, b = 2;
//        int c = a + b;
//        String res = a + " + " + b + " = " + c; // Компоновка строки.
//        String res = String.format("%d + %d = %d\n", a, b, c); // Если требуется сохранить вместо print.
//        System.out.printf("%d + %d = %d\n", a, b, c);
//        System.out.println(res);

//        String s = "qwe";
//        int a = 123;
//        String q = s + a; // Конкатенация строк ОПАСНА, т.к. приводит к просадке производительности.
//        System.out.println(q);

//        float pi = 3.1415f;
//        System.out.printf("%f\n", pi);
//        System.out.printf("%.2f\n", pi);
//        System.out.printf("%.3f\n", pi);
//        System.out.printf("%e\n", pi);
//        System.out.printf("%.2e\n", pi);
//        System.out.printf("%.3e\n", pi);

//        int b = 111; // То что определено перед вложенным блоком, не может быть определено повторно.
//        {
//            int a = 222;
//            System.out.println(a + b); // Во вложенном блоке видны все родительские переменные.
//        }
//        System.out.println(a); // error: cannot find symbol (вне блока переменная a пропадает).
//        int a = 132; // Ошибки не будет, т.к. вне вложенного блока одноимённая переменная a недоступна.
//        System.out.println(a + b);

//        lib.sayHi(); // hi!
//        System.out.println(lib.sum(1, 3)); // 4
//        System.out.println(lib.factor(5)); // 120.0

//        int a = 1;
//        int b = 2;

//        int c;
//        if (a > b) {
//            c = a;
//        } else {
//            c = b;
//        }

//        int c = 0;
//        if (a > b) c = a;
//        if (b > a) c = b;
//        System.out.println(c); // 2

//        int min = a < b ? a : b;
//        System.out.println(min); // 1

//        int month = 1;
//        String text = "";
//        switch (month) { // Проверка значения переменной month.
//            case 1: // Если значение month совпадает со значением в кейсе, то выполняется код кейса.
//                text = "Autumn";
//                break; // В каждом кейсе обязателен break.
//            ...
//            default:
//                text = "mistake";
//                break;
//        }
//        System.out.println(text);

        int a = 123;
//        switch (a) {
//            case 123:
//            case 2:
//            case 3:
//            case 4:
//            case 5:
//                System.out.println("a");
//                break;
//            case 10:
//                System.out.println('b');
//                break;
//            default: // Необязательная конструкция.
//                break;
//        }

//        switch (a) {
//            case 123, 2, 3, 4, 5 -> System.out.println("a"); // Тот же код с сокращениями.
//            case 10 -> System.out.println('b');
//            default -> {
//            } // Необязательная конструкция.
//        }

// ЦИКЛЫ:
//        int value = 321;
//        int count = 0;
//
//        while (value != 0) { // Сначала проверяем, потом делаем.
//            value /= 10;
//            count++;
//        }
//        System.out.println(count); // 3

//        int value = 321;
//        int count = 0;
//
//        do { // Сначала делаем, потом проверяем.
//            value /= 10;
//            count++;
//        }
//        while (value != 0);
//        System.out.println(count); // 3

//        for (int i = 0; i < 10; i++) {
//            if (i % 2 == 0) continue; // Если чётное, то пропускаем следующие строки текущей итерации.
//            if (i % 2 != 0) continue; // Если НЕчётное, то пропускаем следующие строки текущей итерации.
//            if (i % 2 != 0) { // Если НЕчётное, то прерываем цикл, ближайший к оператору.
//                break;
//            }
//            System.out.println(i);
//        }

//        for (int i = 0; i < 10; i++) {
//            for (int j = 0; j < 5; j++) {
//                break;
//            }
//            break;
//        }

//        int s = 0;
//        for (int i = 1; i <= 10 || i % 2 != 0; i++) { // 66 - цикл for выполняется до тех пор, пока true.
//            s += i;
//        }
//        System.out.println(s);

//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *
        // * * * * *

//        int arr[] = new int[]{1, 2, 3, 4, 5, 77};
//
//        for (int i = 0; i < arr.length; i++) { // Если перебираем по индексам, то можно перезаписать.
//            arr[i] = 10;
//        }
//        Arrays.fill(arr, 10);

//        for (int item : arr) { // Если перебираем по значениям, то перезаписать НЕЛЬЗЯ.
//            item = 13;
//            System.out.printf("%d ", item); // 13 13 13 13 13 13
//        }
//        System.out.println();

//        for (int item : arr) {
//            System.out.printf("%d ", item); // 10 10 10 10 10 10
//        }
//        System.out.println();

// РАБОТА С ФАЙЛАМИ:
// СОЗДАНИЕ ФАЙЛА И ЗАПИСЬ / ДОЗАПИСЬ:
//        try (FileWriter fw = new FileWriter("file.txt", false)) { // По умолчанию false.
//            fw.write("line 1");
//            fw.append('\n');
//            fw.append('2');
//            fw.append('\n');
//            fw.write("line 3");
//            fw.flush();
//        } catch (IOException ex) { // Обработка и сбор ошибок.
//            System.out.println(ex.getMessage()); // Чтение ошибок.
//        }

// ПОСИМВОЛЬНОЕ ЧТЕНИЕ ИЗ ФАЙЛА:
//        FileReader fr = new FileReader("file.txt");
//        int c;
//        while ((c = fr.read()) != -1) {
//            char ch = (char) c;
//            if (ch == '\n') {
//                System.out.print(ch);
//            } else {
//                System.out.print(ch);
//            }
//        }

// ВАРИАНТ ЧТЕНИЯ ПОСТРОЧНО (ЧЕРЕЗ БУФЕР):
        System.out.println();
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
}
