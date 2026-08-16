class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<Integer> st=new ArrayDeque<>();
        int ans[]=new int[temperatures.length];
        int n=temperatures.length;
        ans[n-1]=0;
        st.push(n-1);
        for (int i=n-2;i>=0;i--){
            while (!st.isEmpty()){
                if (temperatures[st.peek()]>temperatures[i]){
                    ans[i]=st.peek()-i;
                    break;
                }
                else{
                    st.pop();
                    ans[i]=0;
                }
            }
            st.push(i);

        }
        return ans;
    }
}