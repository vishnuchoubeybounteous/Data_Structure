class Solution {
    public String countAndSay(int n) {
        String prev="1";
        for(int i=0;i<n-1;i++){
           int count=1;
           String str="";
           for(int j=1;j<prev.length();j++){
            if(prev.charAt(j)==prev.charAt(j-1)){
                count++;
            }
            else{
                str+=count;
                str+=prev.charAt(j-1);
                count=1;
            }
           } 
           str+=count;
           str+=prev.charAt(prev.length()-1);
             prev=str;
        }
        return prev;
    }
}