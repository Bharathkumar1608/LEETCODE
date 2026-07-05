class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> list=new ArrayList<>();

        int[][] arr=new int[n][n];
        place(0,arr,list);
        return list;
    }
    static void place(int row,int[][] arr,List<List<String>> list){
        if(row==arr.length){
            print(arr,list);
            return;
        }
        for(int col=0;col<arr.length;col++){
            if(issafe(row,col,arr)){
                arr[row][col]=1;
                place(row+1,arr,list);
                arr[row][col]=0;
            }
        }
    }
    static boolean issafe(int row,int col,int[][] arr){
        int r=row;
        int c=col;
        while(r>=0){
            if(arr[r][c]==1){
                return false;
            }
            r--;
        }
        r=row;
        while(r>=0 && c>=0){
            if(arr[r][c]==1){
                return false;
            }
            r--;
            c--;
        }
        r=row;
        c=col;
        while(r>=0 && c<arr.length){
            if(arr[r][c]==1){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }
    static void print(int[][] arr,List<List<String>> list){
        List<String> ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String s="";
            for(int j=0;j<arr[0].length;j++){
                s+=(arr[i][j]==1?'Q':'.');
            }
            ans.add(s);
        }
        list.add(ans);
    }
}