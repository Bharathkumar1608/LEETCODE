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
    public int rob(TreeNode root) {
        int[] arr=traverse(root);
        return Math.max(arr[0],arr[1]);
    }
    static int[] traverse(TreeNode root){
        if(root==null){
            return new int[]{0,0};
        }
        int[] l=traverse(root.left);
        int[] r=traverse(root.right);

        int nrb=Math.max(l[0],l[1])+Math.max(r[0],r[1]);
        int rb=root.val+l[0]+r[0];

        return new int[]{nrb,rb};
    }
}