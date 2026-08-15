class Solution {
    public int[][] kClosest(int[][] points, int k) {

        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> a[1] - b[1]);

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            pq.offer(new int[]{i, distance});
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            int index = pq.poll()[0];
            ans[i] = points[index];
        }

        return ans;
    }
}