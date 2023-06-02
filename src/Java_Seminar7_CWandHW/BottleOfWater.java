package Java_Seminar7_CWandHW;

// Д.б. конструктор по умолчанию (без параметров).
public class BottleOfWater extends Product {
    protected double volume;

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public BottleOfWater(String brand, String name, double price, double volume) {
        super(brand, name, price);
//        super("", name, price);
        this.volume = volume;
    }

    @Override
        // Аннотация носит информационный характер и м.б. удалена.
    String displayInfo() {
        return String.format("[Бутылка] %s - %s - %.2f [объём: %.2f]",
                name, brand, price, volume);
    }
}
