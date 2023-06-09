package Java_Seminar10_CWandHW.Task0;

public class DebitAccount<T> implements Accountable<T> {
    // Протягиваем обобщённый интерфейс на обобщённый класс.

    @Override
    public T getId() {
        return null;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public void setAmount(double amount) {

    }
}
