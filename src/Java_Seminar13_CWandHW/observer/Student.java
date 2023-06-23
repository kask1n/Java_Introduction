package Java_Seminar13_CWandHW.observer;

import java.util.Random;

public class Student implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;

    public Student(String name) {
        this.name = name;
        minSalary = random.nextDouble(2000, 3000);
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (minSalary > vacancy.getSalary()) {
            System.out.printf("Student %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                    name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
        } else {
            if (minSalary < vacancy.getSalary())
                minSalary = vacancy.getSalary();

            System.out.printf("Student %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                    name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
        }
    }
}