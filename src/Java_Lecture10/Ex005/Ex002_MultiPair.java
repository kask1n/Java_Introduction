package Java_Lecture10.Ex005;

public class Ex002_MultiPair {
    public static void main(String[] args) {
        MultiPair<Integer, String> mp1 = new MultiPair<>(123, "str");
        System.out.println(mp1);
        System.out.println(mp1.getX().getClass().getSimpleName() + " " + mp1.getY().getClass().getSimpleName());

        System.out.println();
        var mp2 = new MultiPair<>(true, false);
        System.out.println(mp2);
        System.out.println(mp2.getX().getClass().getSimpleName() + " " + mp2.getY().getClass().getSimpleName());

    }
}

class MultiPair<X, Y> {
    X x;
    Y y;

    public MultiPair(X arg1, Y arg2) {
        x = arg1;
        y = arg2;
    }

    public X getX() {
        return x;
    }

    public void setX(X x) {
        this.x = x;
    }

    public Y getY() {
        return y;
    }

    public void setY(Y y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return x.toString() + " " + y.toString();
    }
}
