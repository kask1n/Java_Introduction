package Java_Seminar7_CWandHW;

import java.util.List;

public class VendingMachine {
    private final List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(double volume) {
        for (Product product : products) {
            if (product instanceof BottleOfWater) {
                if (((BottleOfWater) product).getVolume() == volume) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
    }

    public ChocolateBar getChocolateBar(String taste) {
        for (Product product : products) {
            if (product instanceof ChocolateBar) {
                if (((ChocolateBar) product).getTaste().equals(taste)) {
                    return (ChocolateBar) product;
                }
            }
        }
        return null;
    }

    public HotBeverage getHotBeverage(int temperature) {
        for (Product product : products) {
            if (product instanceof HotBeverage) {
                if (((HotBeverage) product).getTemperature() == temperature) {
                    return (HotBeverage) product;
                }
            }
        }
        return null;
    }
}