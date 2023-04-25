package Java_Seminar3_HW;

import java.util.ArrayList;
import java.util.Arrays;

public class Java_Seminar3_HW_Task3 {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(4,5,6,7,8,9));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(neRightJoin(arr,arr2));
        System.out.println(neLeftJoin(arr,arr2));
        System.out.println(neInnerJoin(arr,arr2));
    }
    public static ArrayList<Integer> neRightJoin (ArrayList<Integer> arr, ArrayList<Integer> arr2){
        ArrayList<Integer> neRightJoin = new ArrayList<>();
        for (Integer item : arr) {
            if (!arr2.contains(item))
                neRightJoin.add(item);
        }
        return neRightJoin;
    }
    public static ArrayList<Integer> neLeftJoin (ArrayList<Integer> arr, ArrayList<Integer> arr2){
        ArrayList<Integer> neLeftJoin = new ArrayList<>();
        for (Integer item : arr2) {
            if (!arr.contains(item))
                neLeftJoin.add(item);
        }
        return neLeftJoin;
    }
    public static ArrayList<Integer> neInnerJoin (ArrayList<Integer> arr, ArrayList<Integer> arr2){
        ArrayList<Integer> neInnerJoin = new ArrayList<>();

        for (Integer item : arr) {
            if (!arr2.contains(item))
                neInnerJoin.add(item);
        }
        for (Integer item : arr2) {
            if (!arr.contains(item))
                neInnerJoin.add(item);
        }
        return neInnerJoin;

    }
}
