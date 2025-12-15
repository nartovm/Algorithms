class Solution {
    public int numIslands(char[][] grid) {
        int islandCount = 0;
        if (grid.length == 0) return 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == '1') {
                    islandCount++;
                    drown(grid, i, j);
                }
            }
        }
        return islandCount;
    }

    private void drown(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length) {
            return;
        }
        if (grid[i][j] == '0') {
            return;
        } else {
            grid[i][j] = '0';
            drown(grid, i - 1, j);
            drown(grid, i + 1, j);
            drown(grid, i, j - 1);
            drown(grid, i, j + 1);
        }
    }

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(new Solution().numIslands(grid));
    }
}