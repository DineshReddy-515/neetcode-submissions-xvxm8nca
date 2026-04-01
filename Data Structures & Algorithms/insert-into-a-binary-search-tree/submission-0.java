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
    public TreeNode insertIntoBST(TreeNode root, int val) {
        
         
        TreeNode n=new TreeNode(val);
        if(root==null) return n;
        TreeNode temp=root;
        while(true){
            if(temp.val>val){
                if(temp.left==null) {
                    temp.left=n;
                    break;
                }
                else temp=temp.left;
            } 
            else if(temp.val<val) {
                if(temp.right==null) {
                    temp.right=n;
                    break;
                }
                
                else temp=temp.right;
            }

        }

        return root ;
        
    }
}