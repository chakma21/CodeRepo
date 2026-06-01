class Solution {
    public int minimumCost(int[] cost) {
        if (cost.length==1) return cost[0];
        if (cost.length==2) return cost[0]+cost[1];
        Arrays.sort(cost);
        int sum=0,i=cost.length-1;
        while (i>0){
            sum+=cost[i]+cost[i-1];
            i=i-3;
        }
        if (i==0) sum+=cost[0];
        return sum;
    }
}