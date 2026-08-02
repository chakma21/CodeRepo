class Solution {
    public boolean predictTheWinner(int[] nums) {
        int ret=helper(nums,0,nums.length-1);
        if (ret>=0) return true;
        return false;
    }
    public int helper(int nums[], int i, int j){
        if (i==j) return nums[i];
        int left=nums[i]-helper(nums,i+1,j);
        int right=nums[j]-helper(nums,i,j-1);
        return Math.max(left,right);
    }
}