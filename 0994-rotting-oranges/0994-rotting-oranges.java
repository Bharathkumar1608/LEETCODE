class Solution {
    public int orangesRotting(int[][] grid) {
        int r=grid.length;
        int c=grid[0].length;
        int fresh=0;
        Queue<pair> que=new LinkedList<>();
        int[][] visited=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid[i][j]==2){
                    que.add(new pair(i,j,0));
                    visited[i][j]=2;
                }
                else{
                    visited[i][j]=0;
                }
                if(grid[i][j]==1){
                    fresh++;
                }
            }
        }
        int time=0;
        int[] rd={-1,0,1,0};
        int[] cd={0,1,0,-1};
        int cnt=0;
        while(!que.isEmpty()){
            pair p=que.poll();
            int row=p.row;
            int col=p.col;
            int tm=p.tm;
            time=Math.max(time,tm);
            for(int i=0;i<4;i++){
                int nr=row+rd[i];
                int nc=col+cd[i];
                if(nr>=0 && nr<r && nc>=0 && nc<c && visited[nr][nc]!=2 && grid[nr][nc]==1){
                    que.add(new pair(nr,nc,tm+1));
                    visited[nr][nc]=2;
                    cnt++;
                }
            }

        }
        if(cnt==fresh){
            return time;
        }
        return -1;
    }
}
class pair{
    int row;
    int col;
    int tm;
    pair(int row,int col,int tm){
        this.row=row;
        this.col=col;
        this.tm=tm;
    }
}