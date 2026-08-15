// class Solution {
//     public void solve(char[][] board) {
//         int vis[][]=new int[board.length][board[0].length];
//         for (int[] r:vis) Arrays.fill(r,0);

//         for(int col=0;col<board[0].length;col++){
//             if (board[0][col]=='O') dfs1(board,0,col,vis);
//         }
//         for(int col=0;col<board[0].length;col++){
//             if (board[board.length-1][col]=='O') dfs1(board,board.length-1,col,vis);
//         }
//         for(int row=0;row<board.length;row++){
//             if (board[row][0]=='O') dfs1(board,row,0,vis);
//         }
//         for(int row=0;row<board.length;row++){
//             if (board[row][board[0].length-1]=='O') dfs1(board,row,board[0].length-1,vis);
//         }
//         for (int i=1;i<board.length-1;i++){
//             for (int j=1;j<board[0].length-1;j++){
//                 if (board[i][j]=='O' && vis[i][j]==0) dfs(board,i,j,vis);
//             }
//         }
//         return;
//     }
//     public void dfs(char[][] b, int r, int c, int vis[][]){
//         if (r<0 || r>=b.length || c<0 || c>=b[0].length || b[r][c]=='X' ||vis[r][c]==1) return;
//         vis[r][c]=1;
//         b[r][c]='X';
//         dfs(b,r+1,c,vis);
//         dfs(b,r-1,c,vis);
//         dfs(b,r,c+1,vis);
//         dfs(b,r,c-1,vis);


//     }
//     public void dfs1(char[][] b, int r, int c, int vis[][]){
//         if (r<0 || r>=b.length || c<0 || c>=b[0].length || b[r][c]=='X' ||vis[r][c]==1) return;
//         vis[r][c]=1;
//         dfs1(b,r+1,c,vis);
//         dfs1(b,r-1,c,vis);
//         dfs1(b,r,c+1,vis);
//         dfs1(b,r,c-1,vis);


//     }
// }

class Solution {

    public void solve(char[][] board) {

        int m = board.length;
        int n = board[0].length;

        // Top and bottom
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O')
                dfs(board, 0, j);

            if (board[m - 1][j] == 'O')
                dfs(board, m - 1, j);
        }

        // Left and right
        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O')
                dfs(board, i, 0);

            if (board[i][n - 1] == 'O')
                dfs(board, i, n - 1);
        }

        // Capture surrounded O's
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (board[i][j] == 'O')
                    board[i][j] = 'X';

                else if (board[i][j] == '#')
                    board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int r, int c) {

        if (r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length ||
            board[r][c] != 'O') {
            return;
        }

        board[r][c] = '#';

        dfs(board, r + 1, c);
        dfs(board, r - 1, c);
        dfs(board, r, c + 1);
        dfs(board, r, c - 1);
    }
}