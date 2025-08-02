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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> qq= new LinkedList<TreeNode>();
        List<List<Integer>> ll = new ArrayList<>();
        if(root==null) return ll;
        qq.offer(root);
        while(!qq.isEmpty()){
            int levelnum = qq.size();
            List<Integer> sublist = new ArrayList<>();
            for(int i = 0 ;i<levelnum ; i++){
                if(qq.peek().left!=null) qq.offer(qq.peek().left);
                if(qq.peek().right!=null) qq.offer(qq.peek().right);
                sublist.add(qq.poll().val);
            }
            ll.add(sublist);
        }
        for(int i = 1 ; i<ll.size() ;i++){
            if(i%2!=0){
                Collections.reverse(ll.get(i));
            }
        }
        return ll;

    }
}