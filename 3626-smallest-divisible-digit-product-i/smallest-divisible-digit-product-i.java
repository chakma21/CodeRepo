class Solution {
    public int smallestNumber(int n, int t) {
        for (int i=n;i<n+10;i++){
            if (check(i,t)) return i;
        }
        return 0;
    }
    public boolean check(int num, int d){
        int pr=1;
        while (num!=0){
            int dg=num%10;
            num=num/10;
            pr*=dg;
        }
        if (pr%d==0) return true;
        return false;

    }
}