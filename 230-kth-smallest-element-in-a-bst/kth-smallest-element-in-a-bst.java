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
        List<Integer> temp = new ArrayList<>();
        List<Integer> ans = helper(root , temp);
        return ans.get(k-1);
    
    }
    public static List<Integer> helper(TreeNode root , List<Integer> temp){
        if(root == null){
            return temp;
        }
        helper(root.left , temp);
        temp.add(root.val);
        helper(root.right , temp);
        return temp;
    }
}