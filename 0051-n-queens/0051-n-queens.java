class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans=new ArrayList<>();
        int[][] boa=new int[n][n];
        path(0,ans,n,boa);
        return ans;
    }
    static void path(int row,List<List<String>> ans,int n,int[][] boa){
        if(row==n){
            print(boa,ans);
            return;
        }
        for(int c=0;c<n;c++){
            if(issafe(boa,row,c)){
                boa[row][c]=1;
                path(row+1,ans,n,boa);
                boa[row][c]=0;
            }
        }
    }
    static boolean issafe(int[][] arr,int row,int col){
        int r=row;
        int c=col;
        while(r>=0){
            if(arr[r][c]==1){
                return false;
            }
            r--;
        }
        r=row;
        c=col;
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
    static void print(int[][] arr,List<List<String>> ans){
        ArrayList<String> l=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            String s="";
            for(int j=0;j<arr.length;j++){
                if(arr[i][j]==1){
                    s+='Q';
                }
                else{
                    s+='.';
                }
            }
            l.add(s);
        }
        ans.add(l);
    }
}