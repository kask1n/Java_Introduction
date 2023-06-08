package Java_Seminar10_CWandHW;

public class ArrayUtils {
    public static Object[] replaceTwoElements(Object[] array, int begin, int end) {
        if (begin < 0 || begin >= array.length || end < 0 || end >= array.length)
            throw new IndexOutOfBoundsException();  // Возбуждение исключения.
        Object[] buffArray = array.clone();
        Object buffElement = buffArray[begin];
        buffArray[begin] = buffArray[end];
        buffArray[end] = buffElement;
        return buffArray;
    }

    public static <T> T[] replaceTwoElementsV2(T[] array, int begin, int end) {
        if (begin < 0 || begin >= array.length || end < 0 || end >= array.length)
            throw new IndexOutOfBoundsException();  // Возбуждение исключения.
        T[] buffArray = array.clone();
        T buffElement = buffArray[begin];
        buffArray[begin] = buffArray[end];
        buffArray[end] = buffElement;
        return buffArray;
    }
}
