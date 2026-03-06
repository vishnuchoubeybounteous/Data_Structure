class Solution {
    public boolean checkOnesSegment(String s) {
       int count=0;
       int count1=0;
       for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='1'){
            count++;
        }
        else{
            if(count>0){
                count1++;
                if(count1>1)return false;
            }
            count=0;
        }}
        if(count>0){
            count1++;
            if(count1>1)return false;
        
       } 
       return true;
    }
}