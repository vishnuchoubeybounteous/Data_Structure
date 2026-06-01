class Solution {
    public int minimumCost(int[] cost) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i:cost){
            pq.offer(i);
        }
        int sum=0;
        while(!pq.isEmpty()){
            sum+=pq.poll();
            sum+=pq.isEmpty()?0:pq.poll();
            if(!pq.isEmpty())pq.poll();
        }
        return sum;

    }
}