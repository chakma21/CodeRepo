class Solution {
    public long minNumberOfSeconds(int mountainHeight, int[] workerTimes) {

        long low = 0;
        long high = 0;
        int maxel = 0;
        long ans = 0;

        for (int n : workerTimes) {
            maxel = Math.max(maxel, n);
        }

        high = (long) maxel * mountainHeight * (mountainHeight + 1) / 2;

        while (low <= high) {

            long mid = low + (high - low) / 2;

            if (canfinish(mid, mountainHeight, workerTimes)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return ans;
    }

    public static boolean canfinish(long m, int h, int wt[]) {

        long total = 0;

        for (int n : wt) {

            long k = m / n;

            long x = (long)((Math.sqrt(1 + 8.0 * k) - 1) / 2);

            total += x;

            if (total >= h) return true;
        }

        return false;
    }
}