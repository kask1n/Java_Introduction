package Java_Seminar10_CWandHW.bank;

public class CreditAccount<T extends PersonalData> extends Account<T> {
    // Протягиваем обобщённый интерфейс на обобщённый класс.

    public CreditAccount(T data, double amount) {
        super(data, amount);
    }
}
