class Surrounded{
    public void solve(char[][] board){
        if(board == null || board.length == 0) {
            return;
        }
        int rows= board.length;
        int cols = board[0].length;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i==0 || i == rows-1 || j==0 || j == cols-1){
                    if(board[i][j]=='O'){
                        markborder(board, i, j);
                    }
                }
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(board[i][j]=='O'){
                    board[i][j] = 'X';
                } else if(board[i][j]=='S'){
                    board[i][j] = 'O';
                }
            }
        }
    }
    public void markborder(char[][] board,int i,int j){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!='O'){
            return;
        }
        board[i][j] = 'S';
        markborder(board, i-1, j);
        markborder(board, i+1, j);
        markborder(board, i, j-1);
        markborder(board, i, j+1); 
    }
    public static void main(String[] args) {
        Surrounded surrounded = new Surrounded();
        char[][] board = {
            {'X', 'X', 'X', 'X'},
            {'X', 'O', 'O', 'X'},
            {'X', 'X', 'O', 'X'},
            {'X', 'O', 'X', 'X'}
        };
        surrounded.solve(board);
        for (char[] row : board) {
            System.out.println(row);
        }
    }
}