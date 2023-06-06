package Java_Seminar9_CWandHW.Task1;

public class Dog extends Animal {
    private static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println("Static Dog Initializer");
    }

    {
        System.out.println("Dog Initializer");
        counter++;
    }

    public Dog(String name) {
        super(name, 10, 500);
    }
}
