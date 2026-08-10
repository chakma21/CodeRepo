class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int left=0, right=0, sum=0,ans=Integer.MAX_VALUE;
        while (left<=right && right<nums.length){
            sum+=nums[right];
            while (sum>=target) {
                ans=Math.min(right-left+1,ans);
                sum-=nums[left];
                left++;
            }
            right++;
        }
        if (ans==Integer.MAX_VALUE) ans=0;
        return ans;
   
    }
}