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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        rv(0,l,root);
        return l;
    }
    static void rv(int level,List<Integer> l,TreeNode root){
        if(root==null){
            return;
        }
        if(level==l.size()){
            l.add(root.val);
        }
        rv(level+1,l,root.right);
        rv(level+1,l,root.left);
    }
}