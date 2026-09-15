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
class NodeValue{
    int sum,maxnode,minnode;
    NodeValue(int sum,int maxnode,int minnode){
        this.sum=sum;
        this.maxnode=maxnode;
        this.minnode=minnode;
    }
} 
class Solution {
    int maxsum=0;

    public NodeValue large(TreeNode root){
        if(root==null){
            return new NodeValue(0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        NodeValue left=large(root.left);
        NodeValue right=large(root.right);
        if(left.maxnode<root.val && root.val<right.minnode){
            int sum=left.sum+root.val+right.sum;
            maxsum=Math.max(maxsum,sum);
            return new NodeValue(sum,Math.max(root.val,right.maxnode),Math.min(root.val,left.minnode));
        }
        return new NodeValue(0,Integer.MAX_VALUE,Integer.MIN_VALUE);

    }
    public int maxSumBST(TreeNode root) {
        large(root);
        return maxsum;
    }
}