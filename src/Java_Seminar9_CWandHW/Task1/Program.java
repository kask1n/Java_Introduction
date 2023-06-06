package Java_Seminar9_CWandHW.Task1;


public class Program {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Барсик");
        System.out.println(cat1.getId());
        cat1.run(10);

        Cat cat2 = new Cat("Персик");
        System.out.println(cat2.getId());
        cat1.swim(20);

        Cat cat3 = new Cat("Бублик");
        System.out.println(cat3.getId());
        cat1.run(300);

        Dog dog1 = new Dog("Шарик");
        System.out.println(dog1.getId());

        Dog dog2 = new Dog("Бобик");
        System.out.println(dog2.getId());
        System.out.println(Animal.getIdentifier());

//        Animal.identifier = 999;
        System.out.println(Animal.getIdentifier());

        System.out.printf("Было создано %d животных.\n", Animal.getCounter());
        System.out.printf("Было создано %d котов.\n", Cat.getCounter());
        System.out.printf("Было создано %d собак.\n", Dog.getCounter());
    }
}
