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
    public int kthSmallest(TreeNode root, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        find(root, q,k);
        
        return q.poll();
        
    }

    public void find(TreeNode root, PriorityQueue<Integer> q, int k){
        if(root==null) return;

        q.add(root.val);
        if(q.size()> k) q.poll();
        
        find(root.left,q,k);
        find(root.right, q,k);

    }
}
