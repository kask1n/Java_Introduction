package Java_Seminar13_CWandHW.observer;

public class Program {


    /**
     * TODO: 1. Доработать приложение, поработать с шаблоном проектирования Observer добавить новый тип соискателя.
     *    ** 2. Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *    ** 3. Предусмотреть тип вакансии (enum).
     *
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        Vacancy cleaner = new Vacancy("Уборщик", 7000, TypeVacancy.GarbageCollector);
        Vacancy programmerJava = new Vacancy("Программист Java", 90000, TypeVacancy.Programmer);
        Vacancy master = new Vacancy("Аналитик БД", 50000, TypeVacancy.Master);
        Vacancy pentester = new Vacancy("Пентестер", 150000, TypeVacancy.Hacker);

        // Варианты создания экземпляра класса:
//        Student student1 = new Student("A");
//        Object student2 = new Student("B");
//        Observer student3 = new Student("C");

        Company geekBrains = new Company("GeekBrains", 70000, jobAgency);
        Company google = new Company("Google", 100000, jobAgency);
        Company yandex = new Company("Yandex", 120000, jobAgency);
        Company oracle = new Company("Oracle", 200000, jobAgency);

        Master ivanov = new Master("Ivanov", TypeVacancy.Master);
        Master petrov = new Master("Petrov", TypeVacancy.Master);
        Student sidorov = new Student("Sidorov");
        Hackerman linusTorvalds = new Hackerman("Torvalds", TypeVacancy.Hacker);

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(linusTorvalds);

        System.out.println();
        google.needEmployee(cleaner);
        System.out.println();
        yandex.needEmployee(programmerJava);
        System.out.println();
        oracle.needEmployee(master);
        System.out.println();
        geekBrains.needEmployee(pentester);
        System.out.println();

    }
}