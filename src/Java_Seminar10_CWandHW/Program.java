package Java_Seminar10_CWandHW;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
        SimpleAccount simpleAccount = new SimpleAccount(443334, 300.29);
        System.out.println(simpleAccount);

        UniversalAccount universalAccount1 = new UniversalAccount("AAAABB111", 40000.12);
        System.out.println(universalAccount1);

        UniversalAccount universalAccount2 = new UniversalAccount(new AccountIdentifier(554, "AAB1"), 40000.12);
        System.out.println(universalAccount2);

        System.out.println(((AccountIdentifier) universalAccount2.getId()).getPrefix());

        AccountIdentifier accId = new AccountIdentifier(554, "AAB1");
        Account<AccountIdentifier> account1 = new Account<>(accId, 333);
        System.out.println(account1);
        AccountIdentifier accountIdentifier1 = account1.getId();
        System.out.println(accountIdentifier1.getPrefix());

        int a = 12;
        double b = 4.12;
        boolean foo = true;
        char c = 'f';

        Object[] elements = new Object[4];
        elements[0] = a;
        elements[1] = a;
        elements[2] = a;
        elements[3] = a;

        for (Object element : elements) {
            if (element instanceof Double) {
//                ((Double) element = 4.00;
            }
        }

        ArrayList<String> list = new ArrayList<>();
//        list.add(12);

        Integer[] numbers = {2, 5, 6, -10, 4, 5, 1, 100};
        String[] names = {"Дарья", "Андрей", "Станислав", "Мария", "Сергей"};

        Object[] newNames = ArrayUtils.replaceTwoElements(names, 1, 3);
        for (Object element : newNames)
            System.out.println(element);

        Integer[] newNumbers = ArrayUtils.<Integer>replaceTwoElementsV2(numbers, 1, 3);
        // Тип Integer в <> передавать необязательно, т.к. компилятор и так вычисляет его на ходу.
        System.out.println(Arrays.toString(newNumbers));
    }
}