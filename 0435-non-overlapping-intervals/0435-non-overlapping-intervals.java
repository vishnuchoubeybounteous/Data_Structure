class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        for(int[] row:intervals){
            System.out.println(row[0]+" "+row[1]);
        }
        int count=0;
        int left=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[left][1]>intervals[i][0]){
                count++;
            }
            else{
                left=i;
            }
        }
        return count;

    }
}