class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> arr=new ArrayList<>();
        int r=matrix.length;
        int c=matrix[0].length;
        int top=0;
        int bot=r-1;
        int lef=0;
        int rig=c-1;

        while(top<=bot && lef<=rig){
            for(int i=lef;i<=rig;i++){
                arr.add(matrix[top][i]);
            }
            top++;
            for(int i=top;i<=bot;i++){
                arr.add(matrix[i][rig]);
            }
            rig--;
            if(top<=bot){
                for(int i=rig;i>=lef;i--){
                    arr.add(matrix[bot][i]);
                }
                bot--;
            }
            if(lef<=rig){
                for(int i=bot;i>=top;i--){
                    arr.add(matrix[i][lef]);
                }
                lef++;
            }
        }
        return arr;
    }
}