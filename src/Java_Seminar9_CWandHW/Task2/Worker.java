package Java_Seminar9_CWandHW.Task2;

public class Worker extends Employee {
    public Worker(String name, String surname, double salary, int age) {
        super(name, surname, salary, age);
    }

    public Worker(String name, String surname, int age) {
        this(name, surname, 50000, age);  // Зарплата по умолчанию: 50000 рублей в месяц.
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%-10s %-10s %9s %8s:%3d %27s: %9.2f руб.",
                surname, name, "Рабочий", "Возраст", age, "ЗП (фиксированная)", calculateSalary());
    }
}