class Solution {
    public String reorganizeString(String s) {
        StringBuilder sb=new StringBuilder();
        int[] freq=new int[26];
        for (char c:s.toCharArray()){
            freq[c-'a']++;
        }
        PriorityQueue<int[]> maxheap=new PriorityQueue<>((a,b)-> b[1]-a[1]);
        int[] prev=new int[2];
        for (int i=0;i<26;i++){
            if (freq[i]!=0){
                maxheap.offer(new int[]{i,freq[i]});
            }
        }
        while (!maxheap.isEmpty()){
            int[] cur=maxheap.poll();
            sb.append((char)(cur[0]+'a'));
            cur[1]--;
            if (prev!=null && prev[1]!=0) maxheap.offer(prev);
            prev=cur;
        }
        if (sb.length() != s.length()) {
            return "";
        }

        return sb.toString();
    }
}