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
    static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим",
                "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков",
                "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};
        if (random.nextBoolean()) {
            return new Worker(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    random.nextInt(20000, 80000), random.nextInt(18, 60));
        } else {
            return new Freelancer(names[random.nextInt(names.length)], surnames[random.nextInt(surnames.length)],
                    random.nextInt(18, 60), random.nextInt(125, 500),
                    random.nextInt(160));
        }
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

        System.out.println("\n-> ИСХОДНЫЙ СПИСОК:");
        for (Employee employee : employees)
            System.out.println(employee);

//        Arrays.sort(employees);
        System.out.println("\n-> СОРТИРОВКА ПО УМЕНЬШЕНИЮ ОПЛАТЫ ТРУДА:");
        Arrays.sort(employees, new SalaryComparator());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\n-> СОРТИРОВКА ПО УВЕЛИЧЕНИЮ ВОЗРАСТА:");
        Arrays.sort(employees, new AgeComparator());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\n-> СОРТИРОВКА ПО ФАМИЛИИ И УВЕЛИЧЕНИЮ ВОЗРАСТА:");
        Arrays.sort(employees, new SurnameAgeComparator());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\n-> СОРТИРОВКА ПО ФАМИЛИИ И ИМЕНИ:");
        Arrays.sort(employees, new SurnameNameComparator());
        for (Employee employee : employees)
            System.out.println(employee);

        System.out.println("\n-> СОРТИРОВКА ПО УВЕЛИЧЕНИЮ ВОЗРАСТА И ЗАРАБОТНОЙ ПЛАТЫ:");
        Arrays.sort(employees, new AgeSalaryComparator());
        for (Employee employee : employees)
            System.out.println(employee);
    }
}