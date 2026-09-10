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
    public int averageOfSubtree(TreeNode root) {
        ArrayList<TreeNode> list=new ArrayList<>();
        in(root,list);
        int cn=0;
        for(int i=0;i<list.size();i++){
            TreeNode roo=list.get(i);
            int tot=rec(roo);
            int c=cnt(roo);
            if(roo.val==(tot/c)){
                cn++;
            }
        }
        return cn;
    }
    static void in(TreeNode root,ArrayList<TreeNode> list){
        if(root==null){
            return;
        }
        in(root.left,list);
        list.add(root);
        in(root.right,list);
    }
    static int rec(TreeNode root){
        if(root==null){
            return 0;
        }
        return root.val+rec(root.left)+rec(root.right);
    }
    static int cnt(TreeNode root){
        if(root==null){
            return 0;
        }
        return 1+cnt(root.left)+cnt(root.right);
    }
}