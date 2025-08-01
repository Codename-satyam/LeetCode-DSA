class Enclaves{
    public int numEnclaves(int [][] grid){
        if(grid==null || grid.length==0){
            return 0;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int count = 0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1 && (i==0 || i==rows-1 || j==0 || j==cols-1)){
                    FindEnclaves(grid, i, j);
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(grid[i][j]==1){
                    count++;
                }
            }
        }
        return count;
    }
    public void FindEnclaves(int [][] grid, int i,int j){
        if(i<0 || i>=grid.length-1 || j<0 || j>=grid[0].length-1 || grid[i][j]==0){
            return;
        }
        grid[i][j] = 0; 
        FindEnclaves(grid, i-1, j); 
        FindEnclaves(grid, i+1, j); 
        FindEnclaves(grid, i, j-1); 
        FindEnclaves(grid, i, j+1); 
    }
    public static void main(String[] args) {
        Enclaves enclaves = new Enclaves();
        int[][] grid = {
            {0, 0, 0, 0},
            {0, 1, 1, 0},
            {0, 1, 0, 0},
            {0, 0, 0, 0}
        };
        System.out.println(enclaves.numEnclaves(grid)); 
    }
}