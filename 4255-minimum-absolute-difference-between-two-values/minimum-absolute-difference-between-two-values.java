class Solution {
    public int minAbsoluteDifference(int[] nums) {
        int lastone = Integer.MAX_VALUE;
        int lasttwo = Integer.MAX_VALUE;
        int dif = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) lastone = i;
            else if (nums[i] == 2) lasttwo = i;

            if (lastone != Integer.MAX_VALUE && lasttwo != Integer.MAX_VALUE) {
                dif = Math.min(dif, Math.abs(lastone - lasttwo));
            }
        }

        return (dif == Integer.MAX_VALUE) ? -1 : dif;
    }
}