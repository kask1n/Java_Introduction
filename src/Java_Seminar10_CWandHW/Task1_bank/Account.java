package Java_Seminar10_CWandHW.bank;

public abstract class Account<T extends PersonalData> {
    // Можно предоставить только те типы, которые наследуют интерфейс PersonalData.
    private final T data;
    private double amount;

    public T getData() {
        return data;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Account(T data, double amount) {
        this.data = data;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Account{" +
                "data=" + data +
                ", amount=" + amount +
                '}';
    }

}