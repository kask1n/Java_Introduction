package Java_Seminar9_CWandHW.Task2;

public class Worker extends Employee {
    public Worker(String name, String surname, double salary) {
        super(name, surname, salary);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int compareTo(Employee o) {
        return 0;
    }
}