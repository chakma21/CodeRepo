class Solution {
    public int[] separateDigits(int[] nums) {
        //List<Integer> ans=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        for (int n:nums){
            list.addAll(find(n));
            //ans.add()
        }
        int i=0;
        int ans[]=new int[list.size()];
        for (int n:list){
            ans[i++]=n;
        }
        return ans;

    }
    public List<Integer> find(int n){
        List<Integer> list=new ArrayList<>();
        while (n>0){
            int d=n%10;
            n=n/10;
            list.add(d);
        }
        Collections.reverse(list);
        return list;
    }
}
