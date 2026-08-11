class Solution {
    public String minWindow(String s, String t) {
        int left=0,count=0,minl=Integer.MAX_VALUE;
        int freq[]=new int[128];
        int cfreq[]=new int[128];
        for (char c:t.toCharArray()){
            freq[c]++;
        }
        int start=0;
        //if (t.contains(String.valueOf(s.charAt(left)))) count++;
        
        for (int right=0;right<s.length();right++){
            if (freq[s.charAt(right)]>cfreq[s.charAt(right)]){
                count++;
            } 
            cfreq[s.charAt(right)]++;
            while (count==t.length()){
                if (right-left+1<minl){
                    minl=right-left+1;
                    start=left;
                }
                cfreq[s.charAt(left)]--;
                if (cfreq[s.charAt(left)]<freq[s.charAt(left)]){
                    count--;
                }
                left++;
            }

        }
        if (minl==Integer.MAX_VALUE) return "";
        return s.substring(start, start+minl);
    }
}