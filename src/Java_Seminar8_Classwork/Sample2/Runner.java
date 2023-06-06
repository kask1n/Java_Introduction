package Java_Seminar8_Classwork.Sample2;

public interface Runner {  // В интерфейсе все методы являются абстрактными.
    String getName();

    int getMaxJump();

    int getMaxRun();

    default boolean jump(int height) {
        if (height <= getMaxJump()) {
            System.out.printf("%s перепрыгнул через стену %d см\n", getName(), height);
            return true;
        } else {
            System.out.printf("%s НЕ УДАЛОСЬ перепрыгнуть через стену %d см, он смог прыгнуть на %d см\n",
                    getName(), height, getMaxJump());
            return false;
        }
    }

    default boolean run(int length) {
        if (length <= getMaxRun()) {
            System.out.printf("%s пробежал по беговой дорожке %d метров\n", getName(), length);
            return true;
        } else {
            System.out.printf("%s НЕ УДАЛОСЬ пробежать %d метров, он смог пробежать  %d метров\n",
                    getName(), length, getMaxRun());
            return false;
        }
    }
}
