package Java_Seminar7_CWandHW;

public class HotBeverage extends BottleOfWater {
    private int temperature;

    public HotBeverage(String brand, String name, double price, double volume, int temperature) {
        super(brand, name, price, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    String displayInfo() {
        return String.format("[Горячий напиток] %s - %s - %.2f [объём: %.2f] [температура: %d]",
                name, brand, price, volume, temperature);
    }
}