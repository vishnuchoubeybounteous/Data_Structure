class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int[] prev=prevSmaller(heights);
        int[] next=nextSmaller(heights);
        int max=0;
        for(int i=0;i<n;i++){
          max=Math.max(max,heights[i]*(next[i]-prev[i]-1));
        }
        return max;
    }
      public int[] prevSmaller(int[] array){
        Stack<Integer> stk=new Stack<>();
        int[] prev=new int[array.length];
        for(int i=0;i<array.length;i++){
            while(!stk.isEmpty()&&array[stk.peek()]>=array[i])stk.pop();
            prev[i]=stk.isEmpty()?-1:stk.peek();
            stk.push(i);
        }
        return prev;
    }
      public int[] nextSmaller(int[] array){
        Stack<Integer> stk=new Stack<>();
        int[] next=new int[array.length];
        for(int i=array.length-1;i>=0;i--){
            while(!stk.isEmpty()&&array[stk.peek()]>=array[i])stk.pop();
            next[i]=stk.isEmpty()?array.length:stk.peek();
            stk.push(i);
        }
        return next;
    }
}