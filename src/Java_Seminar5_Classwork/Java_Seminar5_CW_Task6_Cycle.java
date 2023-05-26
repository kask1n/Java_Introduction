// Задача 6. Решение 3 (итерации).
// Шахматную доску размером NxN обойти конём так, чтобы фигура в каждой клетке была строго один раз.

package Java_Seminar5_Classwork;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Java_Seminar5_CW_Task6_Cycle {
    public static void main(String[] args) {
        long start = System.nanoTime();

        int n = 5;
        int[][] board = new int[n][n];
        int x = 1; // точка начала
        int y = 1;
        int knight = 1; // счетчик
        board[x][y] = knight;
        while (knight != n * n) {
            ArrayList<Integer> knightOptions = findMoves(board, x, y);
            ArrayList<Integer> nextMove = new ArrayList<>(nextMove(knightOptions, board));
            x = nextMove.get(0);
            y = nextMove.get(1);
            knight++;
            board[x][y] = knight;
        }
        for (int[] ints : board) {
            for (int i : ints)
                System.out.printf("%3d ", i);
            System.out.print("\n");
        }
        System.out.println();

        long finish = System.nanoTime();
        System.out.println(finish - start);
    }

    private static int countMoves(int[][] board, int x, int y) {
        ArrayList<Integer> knighsMove = new ArrayList<>(
                Arrays.asList(1, -2, 2, -1, 2, 1, 1, 2, -1, 2, -2, 1, -2, -1, -1, -2));
        int countMoves = 0;
        for (int i = 0; i < knighsMove.size(); i += 2) {
            int x1 = x + knighsMove.get(i);
            int y1 = y + knighsMove.get(i + 1);
            if (x1 >= 0 && x1 < board.length && y1 >= 0 && y1 < board.length && board[x1][y1] == 0) {
                countMoves++;
            }
        }
        return countMoves;
    }

    private static ArrayList<Integer> findMoves(int[][] board, int x, int y) {

        ArrayList<Integer> knighsMove = new ArrayList<>(
                Arrays.asList(1, -2, 2, -1, 2, 1, 1, 2, -1, 2, -2, 1, -2, -1, -1, -2));
        ArrayList<Integer> knightOptions = new ArrayList<>();
        for (int i = 0; i < knighsMove.size(); i += 2) {
            int x1 = x + knighsMove.get(i);
            int y1 = y + knighsMove.get(i + 1);
            if (x1 >= 0 && x1 < board.length && y1 >= 0 && y1 < board.length && board[x1][y1] == 0) {
                knightOptions.add(x1);
                knightOptions.add(y1);
            }
        }
        return knightOptions;
    }

    private static ArrayList<Integer> nextMove(ArrayList<Integer> knightOptions, int[][] board) {
        ArrayList<Integer> minMoves = new ArrayList<>();
        for (int i = 0; i < knightOptions.size(); i += 2) {
            minMoves.add(countMoves(board, knightOptions.get(i), knightOptions.get(i + 1)));
        }
        int min = minMoves.indexOf(Collections.min(minMoves));
        int x = knightOptions.get(min * 2);
        int y = knightOptions.get(min * 2 + 1);
        ArrayList<Integer> nextMove = new ArrayList<>();
        nextMove.add(x);
        nextMove.add(y);
        return nextMove;
    }
}