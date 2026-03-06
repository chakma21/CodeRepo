class Solution {
    public boolean checkOnesSegment(String s) {
        
        if (s.length()==1 && s.charAt(0)=='1') return true;
        int last=0;
        // if (s.charAt(1)=='1') return true;
        // else{
            for (int i=1;i<s.length();i++){
                if (s.charAt(i)=='1' && last==i-1) last++;
                else if (s.charAt(i)=='1' && last!=i-1) return false;
            }
        // }
        return true;
    }
}