class Solution {
    public int maximumJumps(int[] nums, int target) {
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[nums.length-1]=0;
        for (int i=nums.length-2;i>=0;i--){
            int v=find(i,dp,nums,target);
            dp[i]=(v==0)?-1:v;
        }
        return (dp[0]==0)?-1:dp[0];
    }
    public int find(int in, int dp[], int nums[],int t){
        int c=-1;
        for (int i=in+1;i<nums.length;i++){
            if (nums[i]-nums[in]<=t && nums[i]-nums[in]>=-t) c=Math.max(c, 1+dp[i]);
        }
        return c;
    }
    //     int in=0, steps=0;
    //     while (in<nums.length){
    //         in=find(nums,target,in);
    //         if (in==-1) return -1;
    //         steps++;
    //     }
    //     return steps;
    // }
    // public int find(int nums[], int t,int i){
    //     int in=i+1,ans=0;
    //     while (in<nums.length){
    //         if (nums[in]>=nums[i]-t && nums[in]<=t+nums[i]){
    //             ans=in;
    //             break;
    //         }
    //         else in++;
    //     }
    //     return (ans==0)?1:ans;
    // }
}