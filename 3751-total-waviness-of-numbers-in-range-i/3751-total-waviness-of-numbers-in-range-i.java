class Solution {
    public int totalWaviness(int num1, int num2) {
       // if(num1<100)return 0;
        int count=0;
         for(int i=num1;i<=num2;i++){
            String str=Integer.toString(i);
            for(int j=1;j<str.length()-1;j++){
                char a=str.charAt(j-1);
                char b=str.charAt(j);
                char c=str.charAt(j+1);
                if((a<b&&b>c)||(a>b&&b<c))count++;
            }
         }
         return count;
    }
}