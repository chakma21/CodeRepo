class Solution {
    public int minSwaps(int[][] grid) {
        int end[]=new int[grid.length];
        for (int i=0;i<grid.length;i++){
            int j=grid[0].length-1;
            while (j >= 0 && grid[i][j] == 0)  {              
                end[i]++;
                j--;
            }
        }
        int need[]=new int[grid.length];
        for (int i=0;i<grid.length;i++){
            need[i]=grid.length-i-1;
        }
        int swap=0;
        for (int i=0;i<end.length;i++){
            int next=find(i,need,end);
            if (next==-1) return -1;
            swap+=next-i;
            while (next > i) {
    int temp = end[next];
    end[next] = end[next - 1];
    end[next - 1] = temp;
    next--;
}
        }
        return swap;
    }
    public int find(int in, int need[],int end[]){
        int needel=need[in];
        for (int i=in;i<end.length;i++){
            if (end[i]>=needel) return i;
        }
        return -1;
    }
}