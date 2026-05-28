class Solution {
    public int numberOfSpecialChars(String word) {
        int fs[]=new int[26];
        Arrays.fill(fs,-1);
        int fc[]=new int[26];
        Arrays.fill(fc,-1);
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)>='A' && word.charAt(i)<='Z' && fc[word.charAt(i)-'A']==-1) fc[word.charAt(i)-'A']=i;
            else if (word.charAt(i)>='a' && word.charAt(i)<='z')fs[word.charAt(i)-'a']=Math.max(i,fs[word.charAt(i)-'a']);
        }
        int count=0;
        for (int i=0;i<26;i++){
            if (fc[i]>fs[i] && fs[i]!=-1) count++;
        }
        return count;

    }
}