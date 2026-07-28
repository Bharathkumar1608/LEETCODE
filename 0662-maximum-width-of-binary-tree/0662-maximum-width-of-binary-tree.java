/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int ans=0;
    public int widthOfBinaryTree(TreeNode root) {
        ArrayList<Long> list=new ArrayList<>();
        dfs(root,0,list,0);
        return ans;
    }
    void dfs(TreeNode root,long ind,ArrayList<Long> arr,int level){
        if(root==null){
            return;
        }
        if(level==arr.size()){
            arr.add(ind);
        }
        ans=Math.max(ans,(int)(ind-arr.get(level)+1));
        dfs(root.left,2*ind,arr,level+1);
        dfs(root.right,2*ind+1,arr,level+1);
    }
}