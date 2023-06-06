package Java_Seminar9_CWandHW.Task2;

import java.util.Arrays;
import java.util.Random;

public class Program {
    static Random random = new Random();

    /**
     * TODO: Переработать метод generateEmployee в рамках ДЗ.
     * Метод должен генерировать сотрудников (Employee) разных типов.
     *
     * @return
     */
    static Worker generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Григорий"};
        String[] surnames = new String[]{"Григорьев", "Глебов", "Попов"};
        int salary = random.nextInt(20000, 80000);
        return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)], salary);
    }

    /**
     * TODO: Придумать новые состояния для наших сотрудников.
     * Придумать несколько Comparator'ов для сортировки сотрудников.
     * Например, по "фамилии и имени" или по "возрасту и уровню ЗП".
     *
     * @param args
     */
    public static void main(String[] args) {
//        Worker worker1 = generateEmployee();
//        System.out.println(worker1);

        Employee[] employees = new Employee[10];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();

        for (Employee employee : employees)
            System.out.println(employee);
        System.out.println();

//        Arrays.sort(employees);
        Arrays.sort(employees, new SalaryComparator());



//        for (int i = 0; i < employees.length; i++) {
//
//        }
//
//        for (Employee employee : employees) {
//            salaryComparator1.compare(employee);
//        }

        for (Employee employee : employees)
            System.out.println(employee);

    }
}