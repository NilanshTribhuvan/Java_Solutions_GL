/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        data = val;
        left = right = null;
    }
}
*/

class Solution {
    public int findMaxFork(Node root, int k) {
        // code here.
        int floor=-1;
        while(root!=null){
            if(root.data==k){
                floor=root.data;
                return floor;
            }
            
            if(k>root.data){
                floor=root.data;
                root=root.right;
            }else{
                root=root.left;
            }
        }
        return floor;
    }
}