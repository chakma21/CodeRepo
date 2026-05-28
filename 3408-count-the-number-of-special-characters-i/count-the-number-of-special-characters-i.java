class Solution {
    public int numberOfSpecialChars(String word) {
        int fc[]=new int[26];
        int fs[]=new int[26];
        Arrays.fill(fc,-1);
        Arrays.fill(fs,-1);
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)>='A' && word.charAt(i)<='Z') fc[word.charAt(i)-'A']=i;
            else if (word.charAt(i)>='a' && word.charAt(i)<='z') fs[word.charAt(i)-'a']=i;
        }
        int count=0;
        for (int i=0;i<26;i++){
            if (fc[i]!=-1 && fs[i]!=-1) count++;
        }
        return count;
    }
}