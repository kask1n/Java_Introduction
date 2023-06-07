package Java_Seminar10_CWandHW.homework;

public abstract class Fruit {
    private final float weight;

    public Fruit(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public boolean equals(Fruit f) {
        return this.getClass().getSimpleName() == f.getClass().getSimpleName();
        // Одинаковый класс = Одинаковые экземпляры.
    }

    @Override
    public int hashCode() {
        return (int) weight;
    }
}