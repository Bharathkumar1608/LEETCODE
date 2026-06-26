class Solution {
    public int findCenter(int[][] edges) {
        int[] arr=new int[edges.length+2];

        for(int[] edge:edges){
            arr[edge[0]]++;
            arr[edge[1]]++;
            if(arr[edge[0]]==edges.length){
                return edge[0];
            }
            else if(arr[edge[1]]==edges.length){
                return edge[1];
            }
        }
        return -1;
    }
}