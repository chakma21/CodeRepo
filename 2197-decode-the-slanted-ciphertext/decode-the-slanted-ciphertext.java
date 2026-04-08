class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        if (encodedText.length()==0) return "";
        int col=encodedText.length()/rows;
        char mat[][]=new char[rows][col];
        int in=0;
        for (int i=0;i<rows;i++){
            for (int j=0;j<col;j++){
                mat[i][j]=encodedText.charAt(in++);
            }
        }
        StringBuilder sb=new StringBuilder();
        int i=0, j=0,c=0;
        while(true){
            sb.append(mat[i][j]);
            i++; j++;
            if (i==mat.length || j==mat[0].length) {
                c++;
                i=0;
                j=c;
            }
            if (c==mat[0].length) break;
        }
        return sb.toString().stripTrailing();


    }
}