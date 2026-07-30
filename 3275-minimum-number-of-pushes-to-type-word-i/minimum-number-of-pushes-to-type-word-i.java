class Solution {
    public int minimumPushes(String word) {
        if (word.length()<=8) return word.length();
        int rem= word.length()%8;
        int ans=8;
        if (word.length()>24) ans+=2*8+3*8+4*rem;
        else if (word.length()<24 && word.length()>16) ans+=2*8+3*rem;
        else if (word.length()<16 && word.length()>8) ans+=2*rem;
        else if (word.length()==16) ans+=2*8;
        else if (word.length()==24) ans+=2*8+3*8;
        return ans;
    }
}