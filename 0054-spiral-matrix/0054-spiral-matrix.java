class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int rows=matrix.length;
        int cols=matrix[0].length;
        int t=0;
        int r=cols-1;
        int b=rows-1;
        int l=0;
        while(t<=b && l<=r){
            for(int i=l;i<=r;i++){
                list.add(matrix[t][i]);
            }
            t++;
            for(int i=t;i<=b;i++){
                list.add(matrix[i][r]);
            }
            r--;
            if(t<=b){
                for(int i=r;i>=l;i--){
                    list.add(matrix[b][i]);
                }
                b--;
            }
            if(l<=r){
                for(int i=b;i>=t;i--){
                    list.add(matrix[i][l]);
                }
                l++;
            }
        }
        return list;
    }
}