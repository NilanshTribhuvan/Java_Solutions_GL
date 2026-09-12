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
    int cnt=0;
    int ans=-1;
    public int kthSmallest(TreeNode root, int k) {
       small(root,k);
        return ans;
        
    }
    public void small(TreeNode root,int k){
         if(root==null){
            return ;
        }
        small(root.left,k);
        cnt++;
        if(cnt==k){
            ans=root.val;
            return;
        }

        small(root.right,k);

    }
}