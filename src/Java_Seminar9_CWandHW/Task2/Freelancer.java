package Java_Seminar9_CWandHW.Task2;

/**
 * TODO: Спроектировать класс Freelancer самостоятельно в рамках домашнего задания.
 * Ежемесячная ЗП = Ставка * 20 * 8
 */
public class Freelancer extends Employee {
    private double rate;
    private int hours;

    public Freelancer(String name, String surname, int age, double rate, int hours) {
        super(name, surname, rate * (double) hours, age);
        this.rate = rate;
        this.hours = hours;
    }

    public Freelancer(String name, String surname, int age) {
        this(name, surname, age, 300, 20 * 8);
        // Ставка по умолчанию: 300 рублей в час, 20 рабочих дней * 8 часов.
    }

    @Override
    public double calculateSalary() {
        return this.rate * (double) this.hours;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %9s %8s:%3d %12s %3d%5s %3d): %9.2f руб.",
                surname, name, "Фрилансер", "Возраст", age,
                "ЗП (ставка", (int) rate, ", часы", hours, calculateSalary());
    }
}
