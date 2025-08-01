public class Uniquepath {
    public int uniquepathIII(int[][] grid){
        int m=grid.length;
        int n=grid[0].length;
        if(grid==null || m==0 || n==0){
            return 0;
        }
        boolean [][] visited = new boolean[m][n];
        int count=0;
        pathfinder(grid,0,0,visited,m,n,0);
        return count;
    }
    public void pathfinder(int[][] grid,int i,int j,boolean [][] visited,int m,int n,int count){
        if(i<0 || j<0 || i>=m || j>=n || grid[i][j]==-1 || visited[i][j]){
            return;
        }



        visited[i][j]=true;
        pathfinder(grid, i+1, j, visited, m, n, count);
        pathfinder(grid, i-1, j, visited, m, n, count);
        pathfinder(grid, i, j+1, visited, m, n, count);
        pathfinder(grid, i, j-1, visited, m, n, count);
        visited[i][j]=false;
    }
}
