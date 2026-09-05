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
    public class Couple{
        TreeNode node;
        int level;

        public Couple(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        if(root==null){
            return 0;
        }
        int ans=0;
        Queue<Couple> q=new LinkedList<>();
        q.offer(new Couple(root,0));
        while(!q.isEmpty()){
           int size=q.size();
           int mmin=q.peek().level;
           int start=0,last=0;
           for(int i=0;i<size;i++){
                Couple couple=q.poll();
                int index=couple.level-mmin;
                TreeNode node= couple.node;
                if(i==0)start=index;

                if(i==size-1)last=index;

                if(node.left!=null){
                    q.offer(new Couple(node.left,2*index+1));
                }

                if(node.right!=null){
                    q.offer(new Couple(node.right,2*index+2));
                }
           }
            ans=Math.max(ans,(last-start)+1);
        }
        return ans;
    }
}