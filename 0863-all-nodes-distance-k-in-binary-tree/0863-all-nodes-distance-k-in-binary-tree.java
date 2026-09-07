/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public void parent(HashMap<TreeNode,TreeNode> map,TreeNode root){
        Queue<TreeNode> q =new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            TreeNode node=q.poll();
            if(node.left!=null){
                q.offer(node.left);
                map.put(node.left,node);
            }
            if(node.right!=null){
                q.offer(node.right);
                map.put(node.right,node);
            }
        }
    }
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> res=new ArrayList<>();
        HashMap<TreeNode,TreeNode> map=new HashMap<>();
        parent(map,root);
        Queue<TreeNode> q=new LinkedList<>();
        Set<TreeNode> visited=new HashSet<>();
        q.offer(target);
        visited.add(target);
        int dis=0;
        while(!q.isEmpty()){
            int size=q.size();
            if(dis==k){
                break;
            }

            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
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
            while(!q.isEmpty()){
                TreeNode node=q.poll();
                res.add(node.val);
        }
        return res;

    }
}