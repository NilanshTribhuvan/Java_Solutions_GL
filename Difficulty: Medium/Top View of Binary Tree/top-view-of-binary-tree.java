/*
class Node {
    int data;
    Node left, right;

    Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
*/
class Solution {
    static class Couple{
        Node node;
        int verticle;
        
        public Couple(Node node,int verticle){
            this.node=node;
            this.verticle=verticle;
        }
        
    }
    public ArrayList<Integer> topView(Node root) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null){
            return ans;
        }
        TreeMap<Integer,Integer> map=new TreeMap<>();
        Queue<Couple> q=new LinkedList<>();
        q.offer(new Couple(root,0));
        while(!q.isEmpty()){
            Couple couple=q.poll();
            Node node=couple.node;
            int verticle=couple.verticle;
            
            if(!map.containsKey(verticle)){
                map.put(verticle,node.data);
            }
            if(node.left!=null){
                q.offer(new Couple(node.left,verticle-1));
            }
            if(node.right!=null){
                q.offer(new Couple(node.right,verticle+1));
            }
            
        }
        ans.addAll(map.values());
        return ans;
    }
}