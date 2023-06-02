package Java_Seminar7_CWandHW;

public class BottleOfMilk extends Product {
    private double volume;  // Объём
    private double fatContent;  // Содержание жирности

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getFatContent() {
        return fatContent;
    }

    public void setFatContent(double fatContent) {
        this.fatContent = fatContent;
    }

    public BottleOfMilk(String brand, String name, double price, double volume, double fatContent) {
        super(brand, name, price);
        this.volume = volume;
        this.fatContent = fatContent;
    }

    @Override
    String displayInfo() {
        return String.format("[Бутылка] %s - %s - %.2f [объём: %.2f] [жирность: %.2f]",
                name, brand, price, volume, fatContent);
    }
}
