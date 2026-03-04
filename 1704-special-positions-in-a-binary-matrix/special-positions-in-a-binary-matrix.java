class Solution {
    public int numSpecial(int[][] mat) {
        // int row[]=new int[mat.length];
        int c=0;
        int col[]=new int[mat[0].length];
        for (int i=0;i<mat.length;i++){
            for (int j=0;j<mat[0].length;j++){
                if (mat[i][j]==1 && col[j]==0){
                    if (find(mat,i,j)){
                        col[j]=1;
                        c++;
                        break;
                    }
                }
            }
        }
        return c;

    }
    public boolean find(int mat[][], int r, int c){
        for (int i=0;i<mat[0].length;i++){
            if (mat[r][i]==1 && i!=c) return false;
        }
        for (int i=0;i<mat.length;i++){
            if (mat[i][c]==1 && i!=r) return false;
        }
        return true;
    }
}