class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list1=new ArrayList<>();
        List<int[]> list2=new ArrayList<>();
        int start=newInterval[0];
        int end=newInterval[1];
        int min=start;
        int max=end;
        for(int i=0;i<intervals.length;i++){
            int a=intervals[i][0];
            int b=intervals[i][1];
            if(b<start){
                list1.add(intervals[i]);
            }
            else if(end<a){
                list2.add(intervals[i]);
            }
            else{
                min=Math.min(a,min);
                max=Math.max(b,max);
            }
        }
        list1.add(new int[]{min,max});
        int[][] ans=new int[list1.size()+list2.size()][2];
        int count=0;
        for(int[] arr:list1){
            ans[count++]=arr;
        }
        for(int[] arr:list2){
            ans[count++]=arr;
        }
        return ans;
    }
}