class Solution {
    public String smallestSubsequence(String s) {
        int num[]=new int[26];
        boolean[] vis=new boolean[26];
        for (int i=0;i<s.length();i++){
            num[s.charAt(i)-'a']++;
        }
        StringBuilder sb=new StringBuilder();
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            num[c-'a']--;
            if (!vis[c-'a']){
                while (sb.length()>0 && sb.charAt(sb.length()-1)>c){
                    if (num[sb.charAt(sb.length()-1)-'a']>0){
                        vis[sb.charAt(sb.length() - 1) - 'a'] = false;
                        sb.deleteCharAt(sb.length()-1);
                        //sb.append(c);
                    } 
                    else break;
                }
                sb.append(c);
                vis[c-'a']=true;
            }
        }
        return sb.toString();

    }
}