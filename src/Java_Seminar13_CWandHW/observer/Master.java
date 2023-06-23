package Java_Seminar13_CWandHW.observer;

import java.util.Random;

public class Master implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;
    private TypeVacancy typeVacancy;

    public Master(String name, TypeVacancy typeVacancy) {
        this.name = name;
        minSalary = random.nextDouble(80000, 100000);
        this.typeVacancy = typeVacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (typeVacancy == vacancy.getTypeVacancy()) {
            if (minSalary > vacancy.getSalary()) {
                System.out.printf("Мастер %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            } else {
                if (minSalary < vacancy.getSalary())
                    minSalary = vacancy.getSalary();

                System.out.printf("Мастер %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                        name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("Мастер %s %s (%.2f) >>> Мне не подходит вакансия %s от компании %s\n",
                    name, typeVacancy, minSalary, vacancy.getNameVacancy(), nameCompany);
        }
    }
}