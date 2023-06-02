package Java_Seminar7_CWandHW;

public class Product {
    protected String name;  // Наименование.
    protected String brand;  // Бренд.
    protected double price;  // Цена.

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        checkPrice(price);
    }

    Product() {
        this("product", 100);
    }

    Product(String name, double price) {
        this("noname", name, price);
    }

    Product(String brand, String name, double price) {
        if (brand == null || brand.length() < 4) {
            this.brand = "noname";
        } else {
            this.brand = brand;
        }

        if (name == null || name.length() < 4) {
            this.name = "product";
        } else {
            this.name = name;
        }

        checkPrice(price);
    }

    private void checkPrice(double price) {
        if (price <= 0) {
            this.price = 100;
        } else {
            this.price = price;
        }
    }

    String displayInfo() {
        return String.format("%s - %s - %.2f", name, brand, price);
    }
}