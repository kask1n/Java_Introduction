package Java_Seminar13_CWandHW.observer;

import java.util.Random;

public class Company {

    private String nameCompany;
    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.jobAgency = jobAgency;
    }

    public void needEmployee(Vacancy vacancy){
        jobAgency.sendOffer(nameCompany, vacancy);
    }

}
