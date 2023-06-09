package Java_Seminar9_CWandHW.Task2;

import java.util.Comparator;

public class SurnameAgeComparator implements Comparator<Employee> {
    public int compare(Employee o1, Employee o2) {
        int res = o1.getSurname().compareTo(o2.getSurname());
        if (res == 0) {
            return Integer.compare(o1.getAge(), o2.getAge());
        }
        return res;
    }
}