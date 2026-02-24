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
    public void preOrder(TreeNode root,String s,List<String> list){
         if(root==null)return;
         s+=root.val;
         if(root.left==null&&root.right==null){
            list.add(new String(s));
         }
          
          preOrder(root.left,s,list);
          preOrder(root.right,s,list);
    }
    public int sumRootToLeaf(TreeNode root) {
        List<String> list=new ArrayList<>();
        preOrder(root,"",list);
        System.out.println(list);
        int sum=0;
        for(String s:list){
            if(s.equals(""))continue;
            sum+=Integer.parseInt(s,2);
        }
        return sum;
        
    }
}