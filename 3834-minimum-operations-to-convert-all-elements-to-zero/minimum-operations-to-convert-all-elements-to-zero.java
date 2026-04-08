class Solution {
    public int minOperations(int[] nums) {
        Deque<Integer> st = new ArrayDeque<>();
        int count = 0;

        for (int n : nums) {
            while (!st.isEmpty() && st.peek() > n) {
                st.pop();
            }

            if (!st.isEmpty() && st.peek() == n) continue;

            if (n == 0) continue;
            st.push(n);
            count++;
        }

        return count;
    }
}