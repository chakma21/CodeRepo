class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int ans=0, i=0;
        int n=s.length();
        for (int j=0;j<n;j++){
            while (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            ans=Math.max(ans,set.size());
        }
        return ans;
        // brute
    //     if (s.length()==0) return 0;
    //     int ans=0;
    //     for (int i=0;i<s.length();i++){
    //         int len=find(s,i);
    //         ans=Math.max(ans,len);
    //     }
    //     return ans;
        
    // }
    // public int find(String s, int in){
    //     HashSet<Character> set=new HashSet<>();
    //     set.add(s.charAt(in));
    //     int i=in+1;
    //     while (i<s.length()){
    //     if (set.contains(s.charAt(i))) return i-in;
    //     else set.add(s.charAt(i));
    //     i++;
    //     }
    //     return i-in;
        
    }
}