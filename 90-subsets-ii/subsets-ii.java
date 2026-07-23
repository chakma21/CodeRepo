class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        helper(0,nums,list,ans);
        return ans;

    }
    public void helper(int i, int[] nums, List<Integer> list, List<List<Integer>> ans){
        ans.add(new ArrayList<>(list));
        for (int in=i;in<nums.length;in++){
            if (in>i && nums[in]==nums[in-1]) continue;
            list.add(nums[in]);
            helper(in+1,nums,list,ans);
            list.remove(list.size()-1);
            //helper(i+1,nums,list,ans);
            
        } 
        

    }
}