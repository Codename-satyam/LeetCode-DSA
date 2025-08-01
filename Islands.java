public class Islands {
    public int numIsIslands(char[][] grid ){
        if (grid == null || grid.length == 0) {
            return 0;
        }
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    markIsland(grid, i, j);
                }
            }
        }
        return count;
    }
    private void markIsland(char[][] grid, int i, int j) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') {
            return;
        }
        grid[i][j] = '0';
        markIsland(grid, i - 1, j); 
        markIsland(grid, i + 1, j); 
        markIsland(grid, i, j - 1); 
        markIsland(grid, i, j + 1);
    }
    public static void main(String[] args) {
        Islands islands = new Islands();
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '1', '1'},
            {'0', '0', '0', '0', '0'},
            {'0', '1', '1', '0', '1'},
            {'0', '0', '0', '1', '1'}
        };
        System.out.println(islands.numIsIslands(grid)); 
    }
}
