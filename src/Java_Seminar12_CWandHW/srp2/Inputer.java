package Java_Seminar12_CWandHW.srp2;

import java.util.Scanner;

public class Inputer implements Inputable {
    private final Scanner in = new Scanner(System.in);

    @Override
    public void inputFromConsole(Order o) {
        o.setClientName(prompt("Имя клиента: "));
        o.setProduct(prompt("Продукт: "));
        o.setQnt(Integer.parseInt(prompt("Кол-во: ")));
        o.setPrice(Integer.parseInt(prompt("Цена: ")));
        System.out.printf("-> Создан заказ #%d на имя %s\n", o.getId(), o.getClientName());
    }

    @Override
    public String prompt(String message) {
        System.out.println(message);
        return in.nextLine();
    }
}