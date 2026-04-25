class Solution {
    public boolean checkValidString(String s) {
       int star=0;
       int count=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch=='('){
            count++;
        }
        else if(ch==')'){
            count--;
        }
        else if(ch=='*')star++;
        if(count<0&&star==-count){
            count=0;
            star=0;
        }
       } 
       System.out.println(count+" "+star);
       if((Math.abs(count)<=star)||count==0)return true;
 return false;
        
    }
}