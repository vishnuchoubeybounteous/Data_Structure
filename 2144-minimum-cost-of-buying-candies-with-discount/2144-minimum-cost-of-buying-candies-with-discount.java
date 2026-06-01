class Solution {
    public int minimumCost(int[] cost) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:cost){
            pq.offer(i);
        }
       
        int sum=0;
        while(pq.size()>=3){
         sum+=pq.poll();
         sum+=pq.poll();
         pq.poll();
        }
        while(!pq.isEmpty()){
            sum+=pq.poll();
        }
        return sum;

    }
}