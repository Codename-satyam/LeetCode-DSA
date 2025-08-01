import java.util.ArrayList;

class Solution {
    public void dfs(int[][] maze, int row, int col, ArrayList<String> ans, String path, boolean[][] visited) {
        int n = maze.length;
        int m = maze[0].length;

        // Base conditions: out of bounds, blocked cell, or already visited
        if (row < 0 || col < 0 || row >= n || col >= m || visited[row][col] || maze[row][col] == 0) {
            return;
        }

        // If destination is reached, add the path to answer
        if (row == n - 1 && col == m - 1) {
            ans.add(path);
            return;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        dfs(maze, row - 1, col, ans, path + "U", visited);
        dfs(maze, row + 1, col, ans, path + "D", visited);
        dfs(maze, row, col - 1, ans, path + "L", visited);
        dfs(maze, row, col + 1, ans, path + "R", visited);

        visited[row][col] = false;
    }

    public ArrayList<String> ratInMaze(int[][] maze) {
        ArrayList<String> ans = new ArrayList<>();
        if (maze[0][0] == 0) return ans; 

        boolean[][] visited = new boolean[maze.length][maze[0].length];
        dfs(maze, 0, 0, ans, "", visited);
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[][] maze = {
            {1, 0, 1, 1},
            {1, 1, 0, 1},
            {0, 1, 1, 0},
            {1, 1, 1, 1}
        };
        ArrayList<String> paths = sol.ratInMaze(maze);
        System.out.println(paths);
    }
}
