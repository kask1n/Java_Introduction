package Java_Lecture7.Ex003;

public class Program {

    public static void main(String[] args) {
        Point2D a = new Point2D(0, 2);

        System.out.println(a.getX());
//        a = new Point2D(3);
        a.setX(12);
        System.out.println(a.getX());
        System.out.println(a.getY());

        Point2D b = new Point2D(10);
        System.out.println(b.toString());
        // Point2D b = new Point2D(10, 10);

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
