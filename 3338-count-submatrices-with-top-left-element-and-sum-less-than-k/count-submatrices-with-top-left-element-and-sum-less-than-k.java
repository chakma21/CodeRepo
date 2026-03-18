class Solution {
    public int countSubmatrices(int[][] grid, int k) {
        if (grid[0][0]>k) return 0;
        int count=0;
        int r=grid.length;
        int col=grid[0].length;
        int prefix[][]=new int[r][col];
        
        for (int i=0;i<r;i++){
            for (int j=0;j<col;j++){
                if (i==0 && j==0) prefix[0][0]=grid[0][0];
                else{
                    if (j>0) prefix[i][j]=prefix[i][j-1]+grid[i][j];
                    else prefix[i][j]=grid[i][j];
                }
            }
        }
        // int sumcol=grid[0][0];
        // for (int row=1;row<r;row++){
        //     if (sumcol+grid[row][0]<=k){
        //         sumcol+=grid[row][0];
        //         count++;
        //     }
        // }
        for (int c=0;c<col;c++){
            if (prefix[0][c]<=k) count+=find(prefix,k,c);
            else break;
        }
        return count;

    }
    public int find(int pref[][], int k, int c){
        int sum=0,count=0;
        for (int i=0;i<pref.length;i++){
            if (sum+pref[i][c]<=k) count++;
            else break;
            sum+=pref[i][c]; 
        }
        return count;
    }
}