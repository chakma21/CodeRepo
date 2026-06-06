class Solution {
    public int[] leftRightDifference(int[] nums) {
        int left[]=new int[nums.length];
        int right[]=new int[nums.length];
        int lsum=0, rsum=0;
        for (int i=0;i<nums.length;i++){
            left[i]=lsum;
            right[nums.length-1-i]=rsum;
            lsum+=nums[i];
            rsum+=nums[nums.length-1-i];
        }
        int ans[]=new int[nums.length];
        for (int i=0;i<nums.length;i++){
            ans[i]=(int)Math.abs(left[i]-right[i]);
        }
        return ans;
    }
}