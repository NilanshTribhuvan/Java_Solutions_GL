/* Structure of binary tree node
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}*/

class Solution {
    public Node parent(HashMap<Node,Node> map,Node root,int target){ 
        Queue<Node> q =new LinkedList<>(); 
        q.offer(root); 
        Node tnode =null;
        while(!q.isEmpty()){ 
            Node node=q.poll(); 
            if(node.data==target){
                tnode=node;
            }
            if(node.left!=null){ 
                q.offer(node.left); 
                map.put(node.left,node); 
            } 
            if(node.right!=null){ 
                q.offer(node.right); 
                map.put(node.right,node); 
            } 
        }
        return tnode;
    } 
    public int minTime(Node root, int target) {
        // code here
        HashMap<Node,Node> map=new HashMap<>(); 
        Node tnode=parent(map,root,target); 
        Queue<Node> q=new LinkedList<>(); 
        Set<Node> visited=new HashSet<>(); 
        q.offer(tnode); 
        visited.add(tnode); 
        int dis=-1; 
        while(!q.isEmpty()){ 
            int size=q.size(); 
            for(int i=0;i<size;i++){ 
                Node node=q.poll(); 
                if(node.left!=null && !visited.contains(node.left)){ 
                    q.offer(node.left); 
                    visited.add(node.left); 
                } 
                if(node.right!=null && !visited.contains(node.right)){ 
                    q.offer(node.right); 
                    visited.add(node.right); 
                    } 
                if(map.get(node)!=null && !visited.contains(map.get(node))){ 
                    q.offer(map.get(node)); 
                    visited.add(map.get(node)); 
                } 
            } 
            dis++;
        }
        return dis; 
    }
}