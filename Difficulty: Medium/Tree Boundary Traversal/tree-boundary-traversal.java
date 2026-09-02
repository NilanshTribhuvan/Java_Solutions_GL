/* Node Structure
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
} */

class Solution {
    boolean leaf(Node root){
        return root!=null && root.left==null && root.right==null;
    }
    
    
    public void leftt(Node root,ArrayList<Integer> ans){
        Node node=root.left;
        while(node!=null){
            if(!leaf(node)){
            ans.add(node.data);
            }
            if(node.left!=null){
                node=node.left;
            }else{
                node=node.right;
            }
        }
        
    }
    
    public void leaves(Node root,ArrayList<Integer> ans){
        if(root==null){
            return;
        }
        if(leaf(root)){
            ans.add(root.data);
        }
        leaves(root.left,ans);
        leaves(root.right,ans);
    }
    
    public void rightt(Node root,ArrayList<Integer> ans){
        ArrayList<Integer> temp=new ArrayList<>();
        Node node=root.right;
        while(node!=null){
            if(!leaf(node)){
                temp.add(node.data);
            }
            if(node.right!=null){
                node=node.right;
            }else{
                node=node.left;
            }
        }
        for(int i=temp.size()-1;i>=0;i--){
            ans.add(temp.get(i));
        }
    }
    
    
    
    public ArrayList<Integer> boundaryTraversal(Node root) {
        // code here
        ArrayList<Integer> ans =new ArrayList<>();
        if(root==null){
            return ans;
        }
        if(!leaf(root)){
            ans.add(root.data);
        }
        
        leftt(root,ans);
        leaves(root,ans);
        rightt(root,ans);
        
        return ans;
    }
}