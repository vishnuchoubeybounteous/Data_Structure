class Solution {
    class Pair{
        int v;
        int w;
        public Pair(int v,int w){
            this.v=v;
            this.w=w;
        }
    }
    class Node{
        int d;
        int s;
        public Node(int d,int s){
            this.d=d;
            this.s=s;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<Node> pq=new PriorityQueue<>((a,b)->a.d-b.d);
        List<List<Pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int[] t:times){
            adj.get(t[0]).add(new Pair(t[1],t[2]));
        }
        int[] dist=new int[n+1];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[k]=0;
        pq.offer(new Node(0,k));
        while(!pq.isEmpty()){
            Node node=pq.poll();
            int s=node.s;
            int d=node.d;
            for(Pair p:adj.get(s)){
                int v=p.v;
                int w=p.w;
                if(dist[v]>d+w){
                    dist[v]=d+w;
                    pq.offer(new Node(d+w,v));
                }
            }
        }
        int max=0;
        for(int i=1;i<=n;i++){
           
            max=Math.max(max,dist[i]);
        }
        return max==Integer.MAX_VALUE?-1:max;
    }
}