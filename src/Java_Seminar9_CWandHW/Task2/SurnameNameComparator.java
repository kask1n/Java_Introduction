package Java_Seminar9_CWandHW.Task2;

import java.util.Comparator;

public class SurnameNameComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            return o1.getName().compareTo(o2.getName());
        }
        return res;
    }
}