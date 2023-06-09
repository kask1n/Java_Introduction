package Java_Seminar9_CWandHW.Task2;

import java.util.Comparator;

public class AgeSalaryComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        int res = Integer.compare(o1.getAge(), o2.getAge());
        if (res == 0) {
            return Double.compare(o1.getSalary(), o2.getSalary());
        }
        return res;
    }
}