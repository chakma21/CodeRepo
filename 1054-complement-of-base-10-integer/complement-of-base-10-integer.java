class Solution {
    public int bitwiseComplement(int n) {
        StringBuilder s=new StringBuilder();
        String b=Integer.toBinaryString(n);
        for (int i=0;i<b.length();i++){
            if (b.charAt(i)=='1') s.append('0');
            else s.append('1');
        }
        return  Integer.parseInt(s.toString(), 2);
    }
}