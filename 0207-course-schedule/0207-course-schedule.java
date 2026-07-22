class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        int[] indeg=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            list.add(new ArrayList<>());
        }
        for(int[] p:prerequisites){
            list.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }
        Queue<Integer> que=new LinkedList<>();

        for(int i=0;i<indeg.length;i++){
            if(indeg[i]==0){
                que.add(i);
            }
        }
        int count=0;
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
        if(count==numCourses){
            return true;
        }
        return false;
    }
}