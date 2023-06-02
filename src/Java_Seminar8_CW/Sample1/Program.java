package Java_Seminar8_CW.Sample1;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
//        Animal animal = new Animal("Четыре лапы и хвост");
        Cat cat1 = new Cat("Персик", "Рыжий");

//        Animal a = (Animal) cat1;
//        a.jump();
//        ((Animal) cat1).jump();  // Избыточное определение.
        cat1.jump();
        cat1.voice();

        Dog dog1 = new Dog("Шарик", 8);
        dog1.jump();
        dog1.voice();

        List<Animal> animals = new ArrayList<>();
        animals.add(cat1);
        animals.add(dog1);

        System.out.println("==================");
        processAnimals(animals);
    }

    public static void processAnimals(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.voice();
            if (animal instanceof Cat cat) {
                System.out.println(cat.getColor());
            }
        }
    }
}

class Dog extends Animal {
    private int weight;

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void voice() {
        System.out.println("Собака лает.");
    }

    @Override
    public void jump() {
        super.jump();
    }
}

class Cat extends Animal {
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }

    @Override
    public void jump() {
        super.jump();
    }
}

abstract class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal(String name) {
        this.name = name;
    }

    public void jump() {
        System.out.println("Животное подпрыгнуло.");
    }

    public abstract void voice();
    // System.out.println("Животное подаёт голос.");
}