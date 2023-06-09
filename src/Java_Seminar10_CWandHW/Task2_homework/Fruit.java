package Java_Seminar10_CWandHW.Task2_homework;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class Fruit {
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

}