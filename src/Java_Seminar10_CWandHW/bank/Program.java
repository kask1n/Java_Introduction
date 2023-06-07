package Java_Seminar10_CWandHW.bank;

public class Program {
    public static void main(String[] args) {
        DebitAccount<Entity> entityDebitAccount1 =
                new DebitAccount<>(new Entity("ООО Рога и копыта", "1111233"), 50000);
        CreditAccount<Person> personCreditAccount1 =
                new CreditAccount<>(new Person("Иванов А.Ю.", "1111234"), 12.01);

        System.out.println();
        System.out.println(entityDebitAccount1);
        System.out.println(personCreditAccount1);

        Transaction<Account<?>> transaction1 =
                new Transaction<>(entityDebitAccount1, personCreditAccount1, 26000);

        System.out.println();
        transaction1.execute();
        transaction1.execute();

        System.out.println();
        System.out.println(entityDebitAccount1);
        System.out.println(personCreditAccount1);
    }
}
