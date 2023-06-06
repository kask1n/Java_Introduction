package Java_Seminar9_CWandHW.Task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
//        Возвращаем только одно из трёх: 1, 0 или -1
//        return o1.calculateSalary() == o2.calculateSalary() ? 0 : (o1.calculateSalary() > o2.calculateSalary() ? 1 : -1);
//        return Double.compare(o1.calculateSalary(), o2.calculateSalary());  // Сортировка по возрастанию.
        return Double.compare(o2.calculateSalary(), o1.calculateSalary());  // Сортировка по убыванию.

    }
}
