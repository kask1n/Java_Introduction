// Домашнее задание 12 (в рамках ООП - 6).
// Доработать приложение из семинара (пакет srp2) в рамках понимания работы принципов SOLID.
// Переработать структуру приложения Order, приложение должно соответствовать принципу SRP.

package Java_Seminar12_CWandHW.srp2;

public class Program {
    public static void main(String[] args) {

        System.out.println();
        Order order = new Order();  // По умолчанию создаётся Order("", "", 0, 0).
        Inputer inputer = new Inputer();
        Saver saver = new Saver();

        inputer.inputFromConsole(order);
        saver.saveToJson(order);

    }
}