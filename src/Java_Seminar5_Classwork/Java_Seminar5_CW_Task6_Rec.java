// Задача 6. Решение 1 (рекурсия).
// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package Java_Seminar5_Classwork;

import java.util.Arrays;

public class Java_Seminar5_CW_Task6_Rec {
    static int COUNT = 0;
    static int N = 5;

    public static void main(String[] args) {
        long start = System.nanoTime();

        int[][] arr = new int[N][N];
        System.out.println();

        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                if (N * N % 2 != 0 && (x + y) % 2 != 0)
                    continue;  // Если кол-во клеток нечётное и начальная клетка нечётная, то решений нет.
                horse_move(x, y, arr, 0);
            }
        }

        System.out.printf("-> Общее количество решений: %d\n", COUNT);

        long finish = System.nanoTime();
        System.out.println(finish - start);
    }

    private static void horse_move(int x, int y, int[][] arr, int move) {

        if (COUNT == 1)
            return;

        arr[x][y] = ++move;

        if (x + 2 < N && y + 1 < N && arr[x + 2][y + 1] == 0)
            horse_move(x + 2, y + 1, arr, move);
        if (x + 1 < N && y + 2 < N && arr[x + 1][y + 2] == 0)
            horse_move(x + 1, y + 2, arr, move);
        if (x - 1 >= 0 && y + 2 < N && arr[x - 1][y + 2] == 0)
            horse_move(x - 1, y + 2, arr, move);
        if (x - 2 >= 0 && y + 1 < N && arr[x - 2][y + 1] == 0)
            horse_move(x - 2, y + 1, arr, move);
        if (x - 2 >= 0 && y - 1 >= 0 && arr[x - 2][y - 1] == 0)
            horse_move(x - 2, y - 1, arr, move);
        if (x - 1 >= 0 && y - 2 >= 0 && arr[x - 1][y - 2] == 0)
            horse_move(x - 1, y - 2, arr, move);
        if (x + 1 < N && y - 2 >= 0 && arr[x + 1][y - 2] == 0)
            horse_move(x + 1, y - 2, arr, move);
        if (x + 2 < N && y - 1 >= 0 && arr[x + 2][y - 1] == 0)
            horse_move(x + 2, y - 1, arr, move);

        if (move == N * N) {
            for (int[] ints : arr) {
                System.out.print("[");
                for (int i : ints)
                    System.out.printf("%3d ", i);
                System.out.print("]\n");
            }
            System.out.println();
            COUNT++;
        }

        arr[x][y] = 0;
    }
}