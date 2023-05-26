package Java_Lecture4;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Stack;

public class Ex005_Calc {

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Double.parseDouble(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static String format(double value) {
        return NumberFormat.getInstance().format(value);
    }

    public static void main(String[] args) {
        // (1+2*3*4)*(10/5) - 20
        // 1 2 3 * 4 * + 10 5 / * 20 -

//        var exp = "20 30 - 10 *".split(" "); // (20-30)*10
//        var exp = "1 2 + 3 *".split(" "); // (1 + 2) * 3
        String[] exp = "0.52359877559 Sin 3 ^".split(" ");

        // var exp = "1 2 3 * +".split(" "); // 1 + 2 * 3
        double res = 0;
        System.out.println(Arrays.toString(exp));

        Stack<Double> st = new Stack<>();
        for (String s : exp) {

            if (isDigit(s)) {
                st.push(Double.parseDouble(s));
            } else {
                switch (s) {
                    case "+" -> {
                        res = st.pop() + st.pop();
                        st.push(res);
                    }
                    case "-" -> {
                        res = -st.pop() + st.pop();
                        st.push(res);
                    }
                    case "*" -> {
                        res = st.pop() * st.pop();
                        st.push(res);
                    }
                    case "/" -> {
                        res = (1 / st.pop()) * st.pop();
                        st.push(res);
                    }
                    case "Sin" -> {
                        res = Math.sin(st.pop());
                        st.push(res);
                    }
                    case "Cos" -> {
                        res = Math.cos(st.pop());
                        st.push(res);
                    }
                    case "^" -> {
                        double temp = st.pop();
                        res = Math.pow(st.pop(), temp);
                        st.push(res);
                    }
                }
            }
        }

        System.out.printf("%s\n", format(st.pop()));
    }
}