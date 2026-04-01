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
        if(root==null) return l;

        order(root,l,0);
        return l;
        
    }
    

    public void order(TreeNode root,List<Integer> l,int level){
        if(root==null) return ;
        if(l.size()==level){
            l.add(root.val);
            
        }
        order(root.right,l,level+1);
        order(root.left,l,level+1);
    }
}
