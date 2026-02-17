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
      
        Map<TreeNode,Boolean> map=new HashMap<>();
        Map<TreeNode,TreeNode> par=new HashMap<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        par.put(root,null);
        while(!q.isEmpty()){
           TreeNode temp=q.poll();
           if(temp.left!=null){
            par.put(temp.left,temp);
            q.offer(temp.left);
           }
           if(temp.right!=null){
            par.put(temp.right,temp);
            q.offer(temp.right);
           }
        }
        q.offer(target);
        int count=0;
        map.put(target,true);
        while(!q.isEmpty()){
          
          int size=q.size();
          for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
          if(temp.left!=null&&map.get(temp.left)==null){
            q.offer(temp.left);
            map.put(temp.left,true);
          }
          if(temp.right!=null&&map.get(temp.right)==null){
            q.offer(temp.right);
            map.put(temp.right,true);
          }
          if(par.get(temp)!=null&&map.get(par.get(temp))==null){
            q.offer(par.get(temp));
            map.put(par.get(temp),true);
          }
          }
          count++;
          if(count==k)break;
        }
        List<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }
        if(k==0)ans.add(target.val);
        return ans;
    }
}