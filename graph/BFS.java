package graph;
import java.util.*;

public class BFS {
   public static void main(String args[]){
    int[][] adj = {{1, 2}, {0, 2}, {0, 1, 3, 4}, {2}, {2}};
    int v=adj.length;
    boolean[] visited=new boolean[v];
    Queue<Integer> q=new LinkedList<>();
    List<Integer> ans=new ArrayList<>();
    for(int i=0;i<v;i++){
        if(!visited[i]){
            System.out.println(i);
            q.offer(i);
            visited[i]=true;
            while(!q.isEmpty()){
                
                int a=q.poll();
                
                ans.add(a);
                for(int val:adj[a]){
                    if(!visited[val]){
                        q.offer(val);
                        visited[val]=true;
                    }
                }
            }
        }
    }
    System.out.print("BFS tarversal is : ");
    for(int i:ans){
        System.out.print(i+" ");
    }
   } 
}

//output: BFS tarversal is : 0 1 2 3 4
