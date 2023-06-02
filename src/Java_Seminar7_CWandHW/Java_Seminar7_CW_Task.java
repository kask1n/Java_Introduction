/* Семинар 7. Домашнее задание.
 * Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
 * Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат
 * и реализовать перегруженный метод getProduct(int name, int volume, int temperature),
 * выдающий продукт соответствующий имени, объему и температуре.
 * В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат
 * и воспроизвести логику заложенную в программе.
 * Все вышеуказанное создать согласно принципам ООП пройденным на семинаре.
 *
 * Создать новый продукт на основе Product, создать ему хотя бы одно свойство (например, шоколад и калории)
 * и включить в список продуктов в вендинг машину.
 * Продемонстрировать работу класса по продаже товаров (как мы это делали на уроке).
 */

package Java_Seminar7_CWandHW;

import java.util.ArrayList;
import java.util.List;

public class Java_Seminar7_CW_Task {
    public static void main(String[] args) {
        Product product1 = new Product();
//        product1.brand = "ООО Чистый Источник";
//        product1.name = "Бутылка с водой";
//        product1.price = 125.15;
        System.out.println();
        System.out.println(product1.displayInfo());

        Product product2 = new Product("ООО Чистый Источник", "Бутылка с водой #2", 90.15);
//        product1.brand = "ООО Чистый Источник";
//        product1.name = "Бутылка с водой #2";
//        product1.price = 90.15;
        product2.setPrice(-15);
        System.out.println(product2.displayInfo());

        BottleOfWater bottleOfWater1 = new BottleOfWater(
                "ООО Чистый Источник", "Бутылка с водой #3", -90.15, 1.5);
        System.out.println(bottleOfWater1.displayInfo());

        Product bottleOfMilk1 = new BottleOfMilk("ООО Чистый Источник", "Бутылка с молоком #1", -90.15, 1.5, 10);
        System.out.println(bottleOfMilk1.displayInfo());

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);
        products.add(bottleOfWater1);
        products.add(bottleOfMilk1);

        System.out.println();
        VendingMachine vendingMachine = new VendingMachine(products);
        BottleOfWater bottleOfWaterResult = vendingMachine.getBottleOfWater(1.5);
        if (bottleOfWaterResult != null) {
            System.out.println("Вы купили:");
            System.out.println(bottleOfWaterResult.displayInfo());
        } else {
            System.out.println("Такой бутылки с водой нет в автомате.");
        }

        ChocolateBar chocolateBar1 = new ChocolateBar(
                "RitterSport", "Шоколад #1", 150, "Тёмный", 100, 300);
        ChocolateBar chocolateBar2 = new ChocolateBar(
                "AlpenGold", "Шоколад #2", 110, "Молочный", 200, 500);

        products.add(chocolateBar1);
        products.add(chocolateBar2);

        ChocolateBar chocolateBarResult = vendingMachine.getChocolateBar("Тёмный");
        if (chocolateBarResult != null) {
            System.out.println("Вы купили:");
            System.out.println(chocolateBarResult.displayInfo());
        } else {
            System.out.println("Такой плитки шоколада нет в автомате.");
        }

        HotBeverage hotBeverage1 = new HotBeverage(
                "ООО Арабика", "Капучино", 150, 200, 80);
        HotBeverage hotBeverage2 = new HotBeverage(
                "ООО Робуста", "Латте", 120, 200, 80);

        products.add(hotBeverage1);
        products.add(hotBeverage2);

        HotBeverage hotBeverageResult = vendingMachine.getHotBeverage(80);
        if (hotBeverageResult != null) {
            System.out.println("Вы купили:");
            System.out.println(hotBeverageResult.displayInfo());
        } else {
            System.out.println("Такого горячего напитка нет в автомате.");
        }
    }
}