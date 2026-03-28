class Solution {
    public boolean canPartitionGrid(int[][] grid) {
        long pref[][]=new long[grid.length][grid[0].length];
        long ref[][]=new long[grid.length][grid[0].length];

        for (int i=0;i<grid.length;i++){
            for (int j=0;j<grid[0].length;j++){
                pref[i][j]=j==0? grid[i][j]:pref[i][j-1]+grid[i][j];
                ref[i][j]=i==0? grid[i][j]:ref[i-1][j]+grid[i][j];
            }
        }
        long total=0;
        for (int i=0;i<grid.length;i++){
            total+=pref[i][grid[0].length-1];
        }
        //hcut
        int c=grid[0].length-1;
        long rsum=0,csum=0;
        for (int i=0;i<grid.length-1;i++){
            rsum+=pref[i][c];
            if (rsum*2==total) return true;
        }
        //vcut
        for (int j=0;j<c;j++){
            csum+=ref[grid.length-1][j];
            if (csum*2==total) return true;
        }
        return false;
    }
}