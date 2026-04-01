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
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> li=new ArrayList<>();
        if(root==null) return li;
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root) ;
        while(!q.isEmpty()){
            List<Integer> level=new ArrayList<>();
            int n=q.size();
            for(int i=0;i<n;i++){
                TreeNode temp=q.poll();
                if(temp!=null){
                    q.offer(temp.left);
                    q.offer(temp.right);
                    level.add(temp.val);
                }
            }

            if(level.size()>0) li.add(level);
        }
        
        return li;
        
    }
}
