/*
Definition for Node
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        left = right = null;
    }
} */

class Solution {
    int findCeil(Node root, int x) {
        // code here
        int floor=-1;
        while(root!=null){
            if(root.data==x){
                floor=root.data;
                return floor;
            }

            if(x<root.data){
                floor=root.data;
                 root=root.left;
                
            }else{
                root=root.right;
               
            }
        }
        return floor;
    }
}