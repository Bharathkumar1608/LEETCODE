class Solution {
    public int getMaximumGold(int[][] grid) {
        int max=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                //if(grid[i][j]!=0){
                    max=Math.max(max,rec(grid,i,j));
                //}
            }
        }
        return max;
    }
    static int rec(int[][] arr,int i,int j){
        if(i<0 || j<0 || i>=arr.length ||j>=arr[0].length || arr[i][j]==0){
            return 0;
        }
        int du=arr[i][j];
        arr[i][j]=0;
        int l=du+rec(arr,i,j-1);
        int r=du+rec(arr,i,j+1);
        int t=du+rec(arr,i-1,j);
        int d=du+rec(arr,i+1,j);
        arr[i][j]=du;
        return Math.max(l,Math.max(r,Math.max(t,d)));
    }
}