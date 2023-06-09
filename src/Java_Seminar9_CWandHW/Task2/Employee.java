package Java_Seminar9_CWandHW.Task2;

public abstract class Employee implements Comparable<Employee> {
    protected String name;
    protected String surname;
    protected double salary;  // Ставка заработной платы (ежемесячная).
    protected int age;

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public Employee(String name, String surname, double salary, int age) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчёт среднемесячной заработной платы.
     *
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Employee{" +
                "surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Employee o) {  // Сравнение с текущим объектом.
        int res = surname.compareTo(o.surname);
        if (res == 0)
            return Double.compare(calculateSalary(), o.calculateSalary());
        else
            return res;
    }
}