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
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer> ans=new ArrayList<>();
        Map<TreeNode,TreeNode> par=new HashMap<>();
        Map<TreeNode,Boolean> visited=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        par.put(root,null);
        visited.put(root,null);
        while(!q.isEmpty()){
            TreeNode temp=q.poll();
            if(temp.left!=null){
               par.put(temp.left,temp);
               visited.put(temp.left,null);
               q.offer(temp.left);
            }
            if(temp.right!=null){
                par.put(temp.right,temp);
                visited.put(temp.right,null);
                q.offer(temp.right);
            }
        }

        if(k==0){
            ans.add(target.val);
            return ans;
        }
        q.offer(target);
        int count=0;
        visited.put(target,true);
        while(!q.isEmpty()){
            int size=q.size();
            List<Integer> list=new ArrayList<>();
            count++;
            for(int i=0;i<size;i++){
                TreeNode temp=q.poll();
                if(temp.left!=null&&visited.get(temp.left)==null){
                    list.add(temp.left.val);
                    q.offer(temp.left);
                    visited.put(temp.left,true);
                }
                if(temp.right!=null&&visited.get(temp.right)==null){
                    list.add(temp.right.val);
                    q.offer(temp.right);
                    visited.put(temp.right,true);
                }
                if(par.get(temp)!=null&&visited.get(par.get(temp))==null){
                    list.add(par.get(temp).val);
                    q.offer(par.get(temp));
                    visited.put(par.get(temp),true);
                }
              
                
            }
            
            if(k==count){
                ans=list;
                break;
            }
        }
        return ans;
    }
}