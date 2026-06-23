class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited= new boolean[isConnected.length];
        int count=0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited[i]){
                dfs(i,isConnected,visited);
                count++;
            }
        }
        return count;
    }
    static void dfs(int node,int[][] isConnected,boolean[] visited){
        visited[node]=true;
        for(int i=0;i<isConnected.length;i++){
            if(isConnected[node][i]==1 && !visited[i]){
                dfs(i,isConnected,visited);
            }
        }
    }
}