class Solution {
    public int[] sortByBits(int[] arr) {
      List<int[]> list=new ArrayList<>();
      for(int i:arr){
        int count=0;
        int n=i;
        while(n>0){
            count+=n&1;
            n=n>>1;
        }
        list.add(new int[]{i,count});
      } 
      int[] ans=new int[arr.length];
      int i=0;
       Collections.sort(list,(a,b)->{
        if(a[1]==b[1])return a[0]-b[0];
        else return a[1]-b[1];
       });
       
      for(int[] ar:list){
        ans[i++]=ar[0];
      }
      return ans;
    }
}