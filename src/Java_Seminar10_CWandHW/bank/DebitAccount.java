package Java_Seminar10_CWandHW.bank;

public class DebitAccount<T extends PersonalData> extends Account<T> {
    // Протягиваем обобщённый интерфейс на обобщённый класс.

    public DebitAccount(T data, double amount) {
        super(data, amount);
    }
}
