/* Допустим, в программе есть класс Кот.
 * У кота есть кличка и аппетит (сколько единиц еды он потребляет за приём пищи).
 * Эти поля мы заполняем с помощью конструктора. Также есть метод eat(),
 * который заставляет кота покушать, но пока что он пустой, так как неизвестно, откуда кот должен брать еду.
 */

package Java_Seminar8_HW;

public class Cat {
    private final String name;
    private final int appetite;
    private boolean satiety;

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public void eat(Plate plate) {
        System.out.printf("%s съел %d ", this.getName(), this.getAppetite());
        plate.removeFood(this.getAppetite());
        this.setSatiety(true);
    }
}
