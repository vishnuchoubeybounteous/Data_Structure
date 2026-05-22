class Solution {
    public int numSubmat(int[][] mat) {
         int m=mat.length;
         int n=mat[0].length;
         int[] sum=new int[n];
         int count=0;
         for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                sum[j]=mat[i][j]==0?0:sum[j]+1;
            }
            count+=counting(sum);
         }
         return count;
    }
    public int counting(int[] array){
        Stack<Integer> stk=new Stack<>();
         int n=array.length;
         int count=0;
         int[] sum=new int[n];
         for(int i=0;i<n;i++){
           while(!stk.isEmpty()&&array[stk.peek()]>=array[i])stk.pop();
           if(stk.isEmpty()){
             sum[i]=array[i]*(i+1);
           }
           else{
             sum[i]=sum[stk.peek()]+array[i]*(i-stk.peek());
           }
           stk.push(i);
           count+=sum[i];
         }
         return count;
    }
}