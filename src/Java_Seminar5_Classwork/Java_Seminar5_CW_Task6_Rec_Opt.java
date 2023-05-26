// Задача 6. Решение 2 (рекурсия оптимизированная).
// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package Java_Seminar5_Classwork;

import java.util.Arrays;

public class Java_Seminar5_CW_Task6_Rec_Opt {
    static int COUNT = 0;
    static int N = 5;
    static int[][] moves = {{2, 1}, {1, 2}, {-1, 2}, {-2, 1}, {-2, -1}, {-1, -2}, {1, -2}, {2, -1}};

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

        int[] moveOptions = new int[8];  // Конь может ходить только на восемь направлений.
        for (int i = 0; i < 8; i++) {
            int row = x + moves[i][0];
            int col = y + moves[i][1];
            if (row < N && row >= 0 && col < N && col >= 0 && arr[row][col] == 0) {
                for (int[] m : moves) {
                    int nextX = row + m[0];
                    int nextY = col + m[1];
                    if (nextX < N && nextX >= 0 && nextY < N && nextY >= 0 && arr[nextX][nextY] == 0)
                        moveOptions[i]++;
                }
            }
        }

        if (Arrays.stream(moveOptions).sum() == 0 && move == N * N - 1) {  // Для последнего хода.
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
        }

        boolean flag = true;
        for (int i = 1; i < 9 && flag; i++) {  // Конь может ходить только на восемь направлений.
            if (i == moveOptions[0]) {
                horse_move(x + 2, y + 1, arr, move);
                flag = false;
            }
            if (i == moveOptions[1]) {
                horse_move(x + 1, y + 2, arr, move);
                flag = false;
            }
            if (i == moveOptions[2]) {
                horse_move(x - 1, y + 2, arr, move);
                flag = false;
            }
            if (i == moveOptions[3]) {
                horse_move(x - 2, y + 1, arr, move);
                flag = false;
            }
            if (i == moveOptions[4]) {
                horse_move(x - 2, y - 1, arr, move);
                flag = false;
            }
            if (i == moveOptions[5]) {
                horse_move(x - 1, y - 2, arr, move);
                flag = false;
            }
            if (i == moveOptions[6]) {
                horse_move(x + 1, y - 2, arr, move);
                flag = false;
            }
            if (i == moveOptions[7]) {
                horse_move(x + 2, y - 1, arr, move);
                flag = false;
            }
        }


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