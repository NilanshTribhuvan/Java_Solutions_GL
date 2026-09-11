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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null){
            return null;
        }
        if(root.val==key){
            return dele(root);
        }
        TreeNode curr=root;
        while(curr!=null){
            if(curr.val>=key){
                if(curr.left!=null && curr.left.val==key){
                    curr.left=dele(curr.left);
                    break;
                }else{
                    curr=curr.left;
                }
            }else{
                if(curr.right!=null && curr.right.val==key){
                    curr.right=dele(curr.right);
                    break;
                }else{
                    curr=curr.right;
                }
            }

        }
        return root;
        
    }
    public TreeNode dele(TreeNode root){
        if(root.left==null){
            return root.right;
        }
        else if(root.right==null){
            return root.left;
        }
        TreeNode rightChild = root.right;
        TreeNode leftlast=find(root.left);
        leftlast.right=rightChild;
        return root.left;
    }
    private TreeNode find(TreeNode root){
        if(root.right==null){
            return root;
        }
        return find(root.right);
    }
}