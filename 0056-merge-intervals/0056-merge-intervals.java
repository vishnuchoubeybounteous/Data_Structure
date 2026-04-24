class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list=new ArrayList<>();
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        int min=intervals[0][0];
        int max=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            if(max<intervals[i][0]){
                list.add(new int[]{min,max});
                min=intervals[i][0];
                max=intervals[i][1];
            }
         
            else{
                min=Math.min(min,intervals[i][0]);
                max=Math.max(max,intervals[i][1]);
            }
        }
        list.add(new int[]{min,max});
        return list.toArray(new int[list.size()][]);
    }
}