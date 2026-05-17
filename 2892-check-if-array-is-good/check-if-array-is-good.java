class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        for (int i=0;i<nums.length-2;i++){
            if (nums[i]==i+1) continue;
            else return false;
        }
        if (nums[nums.length-1]!=nums.length-1 || nums[nums.length-2]!=nums.length-1) return false;
        return true;
    }
}