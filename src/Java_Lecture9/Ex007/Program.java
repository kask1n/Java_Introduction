package Java_Lecture9.Ex007;

// Три вода
public class Program {
    public static void main(String[] args) {
        Coffee latte = new Coffee();
        latte.addComponent(new Water("Вода"));
        latte.addComponent(new Water(new String("Вода")));
        latte.addComponent(new Water("Вода"));
        for (var ingredient : latte) {
            System.err.println(ingredient);
        }

        Ingredient ingredient1 = new Water("Вода");
        Ingredient ingredient2 = new Water("Вода");
        Ingredient ingredient3 = new Water("Вода");
        System.err.println(ingredient1.equals(ingredient2));

    }
}