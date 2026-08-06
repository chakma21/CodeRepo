class Solution {

    public int[] twoSum(int[] nums, int target) {

        int[] ans = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {

            List<Integer> list = check(i, target, nums);

            if (list.get(0) != -1) {

                ans[0] = list.get(0);
                ans[1] = list.get(1);

                break;
            }
        }

        return ans;
    }

    public List<Integer> check(int in, int tar, int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int i = in + 1; i < nums.length; i++) {

            if (nums[in] + nums[i] == tar) {

                list.add(in);
                list.add(i);

                return list;
            }
        }

        list.add(-1);
        list.add(-1);

        return list;
    }
}