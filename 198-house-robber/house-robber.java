class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        dp[n-1]=nums[n-1];
        if (n>1) dp[n-2]=Math.max(nums[n-2],nums[n-1]);
        for (int i=n-3;i>=0;i--){
            dp[i]=Math.max(nums[i]+dp[i+2], dp[i+1]);
        }
        return dp[0];
    }
}