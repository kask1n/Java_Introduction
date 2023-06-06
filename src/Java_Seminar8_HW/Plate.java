/* Чтобы можно было хранить еду, создадим класс Тарелка с полем food
 * (еда измеряется в целых числах и не важно, что это за единицы измерения).
 * При создании тарелки мы можем указать начальное значение food.
 * В процессе работы с помощью метода info() можно вывести в консоль информацию о тарелке.
 */

package Java_Seminar8_HW;

/**
 * Тарелка для еды
 */
public class Plate {
    private int food;
    private final int maxFood;

    public int getFood() {
        return food;
    }

//    public void setFood(int food) {  // Вместо set используются методы addFood & removeFood
//        this.food = food;
//    }

    public int getMaxFood() {
        return maxFood;
    }

    public Plate(int food) {
        this.food = food;
        this.maxFood = food;
    }

    public void info() {
        System.out.printf("В тарелке находится %d еды.\n", food);
    }

    /**
     * Пополнение еды в тарелке.
     *
     * @param amount количество еды для добавления (условно)
     */
    public void addFood(int amount) {
        if ((this.food + amount) > maxFood) {
            int remainingCapacity = maxFood - this.food;
            this.food = maxFood;
            System.out.printf("В тарелку пытались добавить %d еды, но ПОМЕСТИЛОСЬ ТОЛЬКО %d. " +
                    "Теперь в ней %d еды.\n", amount, remainingCapacity, food);
        } else {
            this.food += amount;
            System.out.printf("В тарелку добавлено %d еды, теперь в ней %d еды.\n", amount, food);
        }
    }

    /**
     * Кормление едой из тарелки
     *
     * @param amount количество еды для кормления (условно)
     */
    public void removeFood(int amount) {
        if (this.food < amount) {
            System.out.println("Еды в тарелке недостаточно!");
        } else {
            this.food -= amount;
            System.out.printf("-> В тарелке осталось %d еды.\n", food);
        }
    }
}