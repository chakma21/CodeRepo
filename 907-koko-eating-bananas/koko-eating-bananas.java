class Solution {
    public int minEatingSpeed(int[] piles, int h) {
      int low=1, high=0;
      for (int p:piles){
        high=Math.max(p,high);
      }  
      while (low<=high){
        int mid=low+(high-low)/2;
        if (check(mid,h,piles)) high=mid-1;
        else low=mid+1;
      }
      return low;
    }
    public static boolean check(int m, int h, int piles[]){
        long hours = 0;

        for (int p : piles) {
            hours += (p + m - 1) / m;
        }

        return hours <= h;
    }
}