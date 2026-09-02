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

    static class Couple{
        TreeNode node;
        int level;
        int verticle;

        public Couple(TreeNode node,int level,int verticle){
            this.node=node;
            this.level=level;
            this.verticle=verticle;
        }
    } 
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
         if(root==null){
            return ans;
        }
        TreeMap<Integer,TreeMap<Integer,PriorityQueue<Integer>>> map= new TreeMap<>();
       
        Queue<Couple> q=new LinkedList<>();
        q.offer(new Couple(root,0,0));
        while(!q.isEmpty()){
            Couple couple=q.poll();

            TreeNode node=couple.node;
            int level=couple.level;
            int verticle=couple.verticle;

            if(!map.containsKey(verticle)){
                map.put(verticle,new TreeMap<>());
            }

            if(!map.get(verticle).containsKey(level)){
                map.get(verticle).put(level,new PriorityQueue<>());
            }

            map.get(verticle).get(level).offer(node.val);

            if(node.left!=null){
                q.offer(new Couple(node.left,level+1,verticle-1));
            }

            if(node.right!=null){
                q.offer(new Couple(node.right,level+1,verticle+1));
            }
        }
            
            for(TreeMap<Integer,PriorityQueue<Integer>> v:map.values()){
                
                List<Integer>res=new ArrayList<>();
                for(PriorityQueue<Integer> nodes:v.values()){
                    while(!nodes.isEmpty()){
                        res.add(nodes.poll());
                    }
                }
                ans.add(res);
            }
        return ans;
    }
}