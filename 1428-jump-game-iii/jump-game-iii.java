class Solution {
    public boolean canReach(int[] arr, int start) {
        Queue<Integer> q=new LinkedList<>();
        q.offer(start);
        int vis[]=new int[arr.length];
        Arrays.fill(vis,0);
        while (!q.isEmpty()){
            int s=q.size();
            for (int i=0;i<s;i++){
                int el=q.poll();
                if (vis[el]==1) continue;
                if (arr[el]==0) return true;
                int up=el+arr[el];
                int low=el-arr[el];
                if (up<arr.length) q.offer(up);
                if (low>=0) q.offer(low);
                vis[el]=1;

            }
        }
        return false;
    }
}