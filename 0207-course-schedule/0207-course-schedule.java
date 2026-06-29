class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indeg=new int[numCourses];
        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            arr.add(new ArrayList<>());
        }
        for(int[] p: prerequisites){
            arr.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }
        Queue<Integer> que=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                que.add(i);
            }
        }
        int count=0;
        while(!que.isEmpty()){
            int cur=que.poll();
            count++;
            for(int i:arr.get(cur)){
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