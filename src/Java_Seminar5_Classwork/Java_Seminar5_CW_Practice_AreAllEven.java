package Java_Seminar5_Classwork;

public class Java_Seminar5_CW_Practice_AreAllEven {
    public static void main(String[] args) {
        int[] numbers = {4, 6, 7, 8, 8, 10};
    }

    private static boolean areAllEven(int[] numbers) {
        // ВСЕ ли числа чётные?
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] % 2 != 0)
                return false;
        return true;
    }
}