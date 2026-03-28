class Solution {
    public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
        int mat[][] = new int[k][k];
        int r = 0;

        // copy reversed rows into mat
        for (int i = x + k - 1; i >= x; i--) {
            for (int j = y; j < y + k; j++) {
                mat[r][j - y] = grid[i][j]; 
            }
            r++;
        }

        r = 0;

        // copy back to grid
        for (int i = x; i < x + k; i++) {
            for (int j = y; j < y + k; j++) {
                grid[i][j] = mat[r][j - y]; 
            }
            r++;
        }

        return grid;
    }
}