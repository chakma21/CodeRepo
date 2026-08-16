class Solution {
    public int[] asteroidCollision(int[] asteroids) {

        Deque<Integer> st = new ArrayDeque<>();

        for (int i = 0; i < asteroids.length; i++) {

            int cur = asteroids[i];

            // Collision can only happen:
            // stack top is moving right
            // current asteroid is moving left
            while (!st.isEmpty() &&
                   st.peek() > 0 &&
                   cur < 0) {

                if (st.peek() < -cur) {
                    // stack asteroid is smaller → destroy it
                    st.pop();
                }
                else if (st.peek() == -cur) {
                    // both destroy each other
                    st.pop();
                    cur = 0;
                    break;
                }
                else {
                    // current asteroid is destroyed
                    cur = 0;
                    break;
                }
            }

            // Current asteroid survived
            if (cur != 0) {
                st.push(cur);
            }
        }

        int[] ans = new int[st.size()];

        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = st.pop();
        }

        return ans;
    }
}