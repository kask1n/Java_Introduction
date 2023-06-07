package Java_Seminar10_CWandHW;

public class CreditAccount implements Accountable<AccountIdentifier> {
    // Из обобщённого интерфейса перешли в необобщённый класс.
    @Override
    public AccountIdentifier getId() {
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
