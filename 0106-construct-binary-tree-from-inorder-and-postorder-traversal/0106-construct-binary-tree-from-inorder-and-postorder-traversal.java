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
     Map<Integer,Integer> map= new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
       
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        TreeNode root=build(inorder,postorder,0,0,inorder.length);
        return root;
    }
    private TreeNode build(int[] inorder, int[] postorder,int i, int j, int n){
        if(n<=0){
            return null;
        }
        int v=postorder[j+n-1];
        int k=map.get(v);
        TreeNode root=new TreeNode(v);
        root.left=build(inorder,postorder,i,j,k-i);
        root.right=build(inorder,postorder,k+1,j+k-i,n-k+i-1);
        return root;
    }
}