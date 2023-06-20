package Java_Seminar12_CWandHW.srp1;

public class SquareDrawer {

    private final Square square;
    private int scale = 1;

    public Square getSquare() {
        return square;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public SquareDrawer(Square square, int scale) {
        this.square = square;
        this.scale = scale;
    }

    public SquareDrawer(Square square) {
        this.square = square;
    }

    public void draw() {
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            // * 2, чтобы красивее смотрелось в терминале (стандартный межстрочный интервал примерно равено одному символу в строке).
            System.out.print("*");
        }
        System.out.println();
        for (int i = 0; i < square.getSide() * scale - 2; i++) {
            // На 2 символа меньше, т.к. верхняя и нижняя сторона рисуются отдельно (расходуется по 1 символу на каждую).
            System.out.print("*");
            for (int j = 1; j < square.getSide() * scale * 2 - 1; j++) {  // Внутри квадрата всё заполняется пробелами.
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < square.getSide() * scale * 2; i++) {
            System.out.print("*");
        }
    }


}
