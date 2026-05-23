class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        find(ans, list, candidates, target,0);
        return ans;
    }
    public void find(List<List<Integer>> ans, List<Integer> l, int can[], int t, int ind){
        if (ind==can.length){
            if (t==0) ans.add(new ArrayList<>(l));
            return ;
        }
        if (can[ind]<=t){
            l.add(can[ind]);
            find(ans, l ,can,t-can[ind],ind);
            l.remove(l.size()-1);
        }
        
        find(ans, l,can,t,ind+1);
        


    }
}