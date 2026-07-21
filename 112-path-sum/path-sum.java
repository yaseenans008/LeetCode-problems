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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        Stack<TreeNode> path=new Stack<>();
        Stack<Integer> pathSum=new Stack<>();
        path.push(root);
        pathSum.push(root.val);
        while(!path.isEmpty()){
            TreeNode temp=path.pop();
            int tempSum=pathSum.pop();
            if(temp.right==null&&temp.left==null&&tempSum==targetSum) return true;
            
            if(temp.left!=null) {
                path.push(temp.left);
                pathSum.push(temp.left.val+tempSum);
            }
             
             if(temp.right!=null) {
                path.push(temp.right);
                pathSum.push(temp.right.val+tempSum);
            }
       }
        return false   ;     
    }
}