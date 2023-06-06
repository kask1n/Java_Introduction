package Java_Seminar9_CWandHW.Task1;

public class Cat extends Animal {

    private static int counter = 0;
    // В наследуемых классах поля перекрываются, если они имеют одинаковые имена.

    public static int getCounter() {
        return counter;
    }

    static {
        System.out.println("Static Cat Initializer");
    }

    {
        System.out.println("Cat Initializer");
        counter++;
    }

    public Cat(String name) {
        super(name, 0, 200);
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать!");
    }
}