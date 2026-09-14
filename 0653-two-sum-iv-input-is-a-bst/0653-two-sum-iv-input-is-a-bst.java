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
class Biterator{
    Stack<TreeNode> st=new Stack<>();
    boolean reverse;
    public Biterator(TreeNode root,boolean isReverse){
        reverse=isReverse;
        pushAll(root);
    }
    public void pushAll(TreeNode root){
        while(root!=null){
            st.push(root);
            if(!reverse){
                root=root.left;
            }else{
                root=root.right;
            }
        }
    }
    public int next(){
        TreeNode node=st.pop();
           
        if(!reverse){
            pushAll(node.right);

        }else{
            pushAll(node.left);
        }
    
    return node.val;
    }
}
class Solution {
    public boolean findTarget(TreeNode root, int k) {
        if(root==null) return false;
        Biterator l=new Biterator(root,false);
        Biterator r=new Biterator(root,true);
        int i=l.next();
        int j=r.next();
        while(i<j){
            if(i+j==k){
                return true;
            }else if(i+j>k){
               j= r.next();
            }else{
                i=l.next();
            }
        }
        return false;
    }
}