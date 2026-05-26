class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> list=new ArrayList<>();
        int start=newInterval[0];
        int end=newInterval[1];
        int i=0;
        while(i<intervals.length&&intervals[i][1]<start){
            list.add(intervals[i]);
            i++;
        }
        while(i<intervals.length&&end>=intervals[i][0]){
            start=Math.min(start,intervals[i][0]);
            end=Math.max(end,intervals[i][1]);
            i++;
        }
        list.add(new int[]{start,end});
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
        int[][] ans=new int[list.size()][2];
       for(int j=0;j<list.size();j++){
        ans[j]=list.get(j);
       }
       return ans;
    }
}