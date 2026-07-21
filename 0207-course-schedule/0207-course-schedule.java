class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indeg=new int[numCourses];
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            list.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }
        int count=0;
        Queue<Integer> que=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                que.add(i);
            }
        } 
        while(!que.isEmpty()){
            int cur=que.poll();
            count++;
            for(int i:list.get(cur)){
                indeg[i]--;
                if(indeg[i]==0){
                    que.add(i);
                }
            }
        }
        if(numCourses==count){
            return true;
        }
        return false;
    }
}