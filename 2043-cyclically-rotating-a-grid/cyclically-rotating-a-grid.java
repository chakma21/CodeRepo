class Solution {
    public int[][] rotateGrid(int[][] grid, int k) {
        List<List<Integer>> biglist=new ArrayList<>();
        int row=0,col=0;
        while (row<grid.length/2 && col<grid[0].length/2){
            List<Integer> list=new ArrayList<>();
            for (int i=col;i<grid[0].length-col;i++){
                list.add(grid[row][i]);
            }
            for (int i=row+1;i<grid.length-row-1;i++){
                list.add(grid[i][grid[0].length-col-1]);
            }
            for (int i=grid[0].length-col-1;i>=col;i--){
                list.add(grid[grid.length-row-1][i]);
            }
            for (int i=grid.length-row-2;i>row;i--){
                list.add(grid[i][col]);
            }
            biglist.add((new ArrayList(list)));
            row=row+1;
            col=col+1;
        }
        for (int i = 0; i < biglist.size(); i++) {
            List<Integer> list = biglist.get(i);
            int rot = k % list.size();
            List<Integer> rotated = new ArrayList<>();
            rotated.addAll(list.subList(rot, list.size()));
            rotated.addAll(list.subList(0, rot));
            biglist.set(i, rotated);
        }
        int ind=0;
        row=0;
        col=0;
        while (row<grid.length/2 && col<grid[0].length/2){
            List<Integer> list=biglist.get(ind);
            int in=0;
            for (int i=col;i<grid[0].length-col;i++){
                grid[row][i]=list.get(in++);
            }
            for (int i=row+1;i<grid.length-row-1;i++){
                grid[i][grid[0].length-col-1]=list.get(in++);
            }
            for (int i=grid[0].length-col-1;i>=col;i--){
                grid[grid.length-row-1][i]=list.get(in++);
            }
            for (int i=grid.length-row-2;i>row;i--){
                grid[i][col]=list.get(in++);
            }
            ind++;
            row=row+1;
            col=col+1;
        }
        return grid;

    }
    public List<Integer> fix (List<Integer> list){
        int temp=list.get(0);
        list.remove(0);
        list.add(temp);
        return list;
    }
}