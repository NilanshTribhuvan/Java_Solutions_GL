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
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        Queue<TreeNode> st=new LinkedList<>();
        st.offer(root);
        while(!st.isEmpty()){
            int size=st.size();
            List<Integer> res=new ArrayList<>();
            for(int i=0;i<size;i++){
            TreeNode node=st.poll();
            res.add(node.val);

            if(node.left!=null){
                st.offer(node.left);
            }
            if(node.right!=null){
                st.offer(node.right);
            }
            }
           ans.add(res);
        }
        return ans;
    }
}