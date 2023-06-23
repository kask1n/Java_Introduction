package Java_Seminar13_CWandHW.observer;

import java.util.Random;

public class Hackerman implements Observer {

    private static Random random = new Random();

    private String name;
    private double minSalary;
    private TypeVacancy typeVacancy;

    public Hackerman(String name, TypeVacancy typeVacancy) {
        this.name = name;
        this.minSalary = random.nextDouble(100000, 150000);
        this.typeVacancy = typeVacancy;
    }

    @Override
    public void receiveOffer(String nameCompany, Vacancy vacancy) {
        if (typeVacancy == vacancy.getTypeVacancy()) {
            if (minSalary > vacancy.getSalary()) {
                System.out.printf("%s %s (%.2f) >>> Я найду работу получше! (%s %s - %.2f)\n",
                        typeVacancy, name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            } else {
                if (minSalary < vacancy.getSalary())
                    minSalary = vacancy.getSalary();

                System.out.printf("%s %s (%.2f) >>> Мне нужна эта работа! (%s %s - %.2f)\n",
                        typeVacancy, name, minSalary, nameCompany, vacancy.getNameVacancy(), vacancy.getSalary());
            }
        }
        else {
            System.out.printf("%s %s (%.2f) >>> Мне не подходит вакансия %s от компании %s\n",
                    typeVacancy, name, minSalary, vacancy.getNameVacancy(), nameCompany);
        }
    }
}
