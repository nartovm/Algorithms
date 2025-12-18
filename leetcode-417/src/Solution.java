import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> results = new ArrayList<>();
        if (heights == null || heights.length == 0 || heights[0].length == 0) return results;

        int rows = heights.length;
        int cols = heights[0].length;

        boolean[][] pacificReachable = new boolean[rows][cols];
        boolean[][] atlanticReachable = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            dfs(i, 0, pacificReachable, heights[i][0], heights);
            dfs(i, cols-1, atlanticReachable, heights[i][cols - 1], heights);
        }

        for (int j = 0; j < cols; j++) {
            dfs(0, j, pacificReachable, heights[0][j], heights);
            dfs(rows - 1, j, atlanticReachable, heights[rows - 1][j], heights);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (pacificReachable[i][j] && atlanticReachable[i][j]) {
                    results.add(Arrays.asList(i, j));
                }
            }
        }

        return results;
    }

    private void dfs(int i, int j, boolean[][] reachable, int prevHeight, int[][] heights) {
        if (i < 0 || i >= heights.length || j < 0 || j >= heights[0].length) {
            return;
        }
        if (reachable[i][j]) {
            return;
        }
        if (heights[i][j] < prevHeight) {
            return;
        }

        reachable[i][j] = true;

        record Pair(int i, int j) {
        }

        Pair[] pairs = {
                new Pair(i-1,j),
                new Pair(i,j-1),
                new Pair(i+1,j),
                new Pair(i,j+1)
        };
        for (Pair neighbor : pairs) {
            dfs(neighbor.i, neighbor.j, reachable, heights[i][j], heights);
        }
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

        solver = new Solution();
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