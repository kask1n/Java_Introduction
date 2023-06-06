// Yandex "CodeRun" Backend.
// 155. Уникальные элементы.
// https://coderun.yandex.ru/seasons/first_2023/tracks/backend/problem/exactly-one-occur

package Java_Practice;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(reader.readLine());
        String[] stringArray = reader.readLine().split(" ");
        int[] intArray = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            intArray[i] = Integer.parseInt(stringArray[i]);
        }


        Map<Integer, Integer> mapNums = new HashMap<>();
        for (int num : intArray) {
            if (!mapNums.containsKey(num)) {
                mapNums.put(num, 1);
            } else {
                mapNums.put(num, mapNums.get(num) + 1);
            }
        }

        int count = 0;
        for (Map.Entry<Integer, Integer> pair : mapNums.entrySet()) {
            if (pair.getValue() == 1) {
                count++;
            }
        }

        writer.write(String.valueOf(count));

        reader.close();
        writer.close();

    }
}
