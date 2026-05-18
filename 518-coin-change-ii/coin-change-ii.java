class Solution {
    public int change(int amount, int[] coins) {
        int count=0;
        int dp[][]=new int[coins.length+1][amount+1];
        for (int i=0;i<coins.length+1;i++){
            //dp[0][i]=(i%coins[0]==0)?1:0;
            dp[i][0]=1;
        }
        for (int i=1;i<coins.length+1;i++){
            for (int j=0;j<amount+1;j++){
                int ntake=dp[i-1][j];
                int take = (j >= coins[i-1]) ? dp[i][j - coins[i-1]] : 0;
                dp[i][j]=ntake+take;
            }
        }
        return dp[coins.length][amount];
        
    }
}