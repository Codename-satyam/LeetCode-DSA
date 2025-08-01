import java.util.ArrayList;

public class RatinMaze {
    public ArrayList<String> ratinMaze(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        if (maze == null || maze.length == 0 || maze[0].length == 0) {
            return result;
        }
        int n = maze.length;
        int m = maze[0].length;
        boolean[][] visited = new boolean[n][m];
        findPath(maze, 0, 0, visited, "", result);
        System.out.println(result.size());
        return result;
    }

    public void findPath(int[][] maze, int i, int j, boolean[][] visited, String path, ArrayList<String> result) {
        if (i < 0 || j < 0 || i >= maze.length || j >= maze[0].length || maze[i][j] == 0 || visited[i][j]) {
            return;
        }
        if (i == maze.length - 1 && j == maze[0].length - 1) {
            result.add(path);
            return;
        }
        visited[i][j] = true;
        findPath(maze, i - 1, j, visited, path + "U", result);
        findPath(maze, i + 1, j, visited, path + "D", result);
        findPath(maze, i, j - 1, visited, path + "L", result);
        findPath(maze, i, j + 1, visited, path + "R", result);

        visited[i][j] = false;
    }

    public static void main(String[] args) {
        RatinMaze ratinMaze = new RatinMaze();
        int[][] maze = {
                { 1, 0, 1, 1 },
                { 1, 1, 0, 1 },
                { 0, 1, 1, 0 },
                { 1, 1, 1, 1 }
        };
        ArrayList<String> paths = ratinMaze.ratinMaze(maze);
        for (String path : paths) {
            System.out.println(path);
        }
    }
}
