class Solution {
    public int binaryGap(int n) {
        String s=Integer.toBinaryString(n);
        int count=0;
        int zero=0;
        int left=0;
        int right=s.length()-1;
        while(left<s.length()&&s.charAt(left)=='0'){
            left++;
        }
        while(right>=0&&s.charAt(right)=='0')right--;
        if(left>=right)return 0;
        for(int i=left;i<=right;i++){
            if(s.charAt(i)=='0')zero++;
            else zero=0;
            count=Math.max(count,zero);
        }
        
        return count+1;
    }
}