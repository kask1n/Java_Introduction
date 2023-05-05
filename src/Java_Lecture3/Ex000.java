package Java_Lecture3;

public class Ex000 {
    public static void main(String[] args) {
        Object o = 1;
        GetType(o);  // java.lang.Integer
        o = 1.2;
        GetType(o);  // java.lang.Double

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));  // 0
        System.out.println(Sum(1, 2.0));  // 0
        System.out.println(Sum(1.2, 2.1));
        System.out.println(Sum("каша", "маша"));  // 0 - ошибка, т.к. тип String не предусмотрен.
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }

    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double)
            return (Object) ((Double) a + (Double) b);
        else if (a instanceof Integer && b instanceof Integer)
            return (Object) ((Integer) a + (Integer) b);
        else
            return 0;
    }
}