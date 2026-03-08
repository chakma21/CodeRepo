class Solution {
    public String findDifferentBinaryString(String[] nums) {
        int n=nums.length;
        StringBuilder ans=new StringBuilder();
        for (int i=0;i<n;i++){
            if (nums[i].charAt(i)=='0') ans.append('1');
            else ans.append('0');
        }
        return ans.toString();
        // List<String> list=Arrays.asList(nums);
        // Collections.sort(list);
        // int last=(int)Math.pow(2,n);
        // int first=0;
        // while (){
        //     int mid=(first+last)/2;
        //     String b=Integer.toBinaryString(mid);
        //     if (!list.contains(b)) return b;
        //     if (list.get(n-1).compareTo(b) < 0) mid--;
        //     else mid++;

        // }
        // return " ";
    }
}