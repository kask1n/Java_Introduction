package Java_Lecture8.Ex000;

public class Program {

    void A() {
        System.out.println("A()");
    }

    public static void main(String[] args) {
//        A();
        Program prog = new Program();  // Обращение к методу A(), если он не static.
        prog.A();

        Foo f1 = new Foo();
        f1.value = 123;
//        System.out.println(f1.value);
        f1.printCount();  // Экземплярный метод, который обращается к статическому полю класса.

//        Foo.count = 123000;

        Foo f2 = new Foo();
        f2.value = 222;
//        System.out.println(f2.value);
        f2.printCount();

        Foo f3 = new Foo();
        f3.value = 444;
//        System.out.println(f3.value);
        f3.printCount();

        System.out.println(Foo.getCount());
    }
}
