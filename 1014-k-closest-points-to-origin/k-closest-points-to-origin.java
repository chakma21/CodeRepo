class Solution {
    public int[][] kClosest(int[][] points, int k) {

        // Max heap based on distance
        PriorityQueue<int[]> pq =
            new PriorityQueue<>((a, b) -> b[1] - a[1]);

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int distance = x * x + y * y;

            pq.offer(new int[]{i, distance});

            // Keep only k closest points
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {
            int index = pq.poll()[0];
            ans[i] = points[index];
        }

        return ans;
    }
}