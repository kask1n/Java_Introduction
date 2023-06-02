package Java_Seminar7_CWandHW;

public class ChocolateBar extends Product {
    private String taste;
    private double weight;
    private double calories;

    public ChocolateBar(String brand, String name, double price, String taste, double weight, double calories) {
        super(brand, name, price);
        this.taste = taste;
        this.weight = weight;
        this.calories = calories;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    String displayInfo() {
        return String.format("[Плитка шоколада] %s - %s - %.2f [вкус: %s] [вес: %.2f] [калории: %.2f]",
                name, brand, price, taste, weight, calories);
    }
}