class Solution {
    public int minimumDistance(int[] nums) {
        if (nums.length<3) return -1; 
        HashMap<Integer, List<Integer>> map=new HashMap<>();
        for (int i=0;i<nums.length;i++){
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        int dist=Integer.MAX_VALUE;
        for (List<Integer> list:map.values()){
            if (list.size()>=3){
                dist=Math.min(dist,find(list));
            }
        }
        return (dist==Integer.MAX_VALUE)?-1:dist;
    }
    public int find(List<Integer> list){
        int c=1_000_000_007;
        for (int i=0;i<list.size()-2;i++){
            c = Math.min(c, 2 * (list.get(i+2) - list.get(i)));
            // c=Math.min(c, (list.get(i+1)-list.get(i))+(list.get(i+2)-list.get(i+1))+list.get(i+2)-list.get(i));
        }
        return c;
        
    }
}