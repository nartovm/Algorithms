import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> results = new ArrayList<>();
        if (heights == null) {
            return null;
        }
        boolean[][] pacificReachable = new boolean[heights.length][heights[0].length];
        boolean[][] atlanticReachable = new boolean[heights.length][heights[0].length];

        for (int i = 0; i < heights.length; i++) {
            // [i][0] pacific
            // [i][heights[0].length] atlantic
            dfs(i, 0, heights, heights[i][0], pacificReachable);
            dfs(i, heights[0].length - 1, heights, heights[i][heights[0].length - 1], atlanticReachable);
        }

        for (int j = 0; j < heights[0].length; j++) {
            // [0][j] pacific
            // [heights[0].length-1][j] atlantic
            dfs(0, j, heights, heights[0][j], pacificReachable);
            dfs(heights.length - 1, j, heights, heights[heights.length - 1][j], atlanticReachable);
        }

        for (int i = 0; i < pacificReachable.length; i++) {
            for (int j = 0; j < pacificReachable[0].length; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    results.add(Arrays.asList(i, j));
                }
            }
        }

        return results;
    }

    private void dfs(int i, int j, int[][] heights, int prevHeight, boolean[][] reachable) {
        if (i < 0 || i > heights.length - 1 || j < 0 || j > heights[0].length - 1) {
            return;
        }

        if (reachable[i][j]) {
            return;
        }

        if (prevHeight > heights[i][j]) {
            return;
        }

        reachable[i][j] = true;

        dfs(i - 1, j, heights, heights[i][j], reachable);
        dfs(i + 1, j, heights, heights[i][j], reachable);
        dfs(i, j - 1, heights, heights[i][j], reachable);
        dfs(i, j + 1, heights, heights[i][j], reachable);

    }

    // --- MAIN ДЛЯ ТЕСТОВ ---
    public static void main(String[] args) {
        Solution solver = new Solution();

        // --- Example 1 ---
        System.out.println("--- Example 1 ---");
        int[][] heights1 = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}
        };

        System.out.println("Input Grid:");
        printGrid(heights1);

        List<List<Integer>> result1 = solver.pacificAtlantic(heights1);
        System.out.println("Your Output: " + result1);
        System.out.println("Expected:    [[0, 4], [1, 3], [1, 4], [2, 2], [3, 0], [3, 1], [4, 0]]");
        System.out.println("(Порядок координат может отличаться, это нормально)");
        System.out.println();

        // --- Example 2 ---
        System.out.println("--- Example 2 ---");
        int[][] heights2 = {
                {1}
        };

        System.out.println("Input Grid:");
        printGrid(heights2);

        List<List<Integer>> result2 = solver.pacificAtlantic(heights2);
        System.out.println("Your Output: " + result2);
        System.out.println("Expected:    [[0, 0]]");
    }

    // Вспомогательный метод для красивого вывода матрицы
    private static void printGrid(int[][] grid) {
        for (int[] row : grid) {
            System.out.println(Arrays.toString(row));
        }
    }
}