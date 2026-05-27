class Solution {
    public int numberOfSpecialChars(String word) {
        int count=0;
        int[] hash=new int[26];
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(Character.isUpperCase(ch)){
               if(hash[ch-'A']==1){
                count++;
                hash[ch-'A']=2;
               }
               else if(hash[ch-'A']==0){
                hash[ch-'A']=3;
               }
            }   
            else{
                if(hash[ch-'a']==2){
                  count--;
                  hash[ch-'a']=3;
                }
                else if(hash[ch-'a']!=3){
                    hash[ch-'a']=1;
                }
            }
        }
        System.out.println(count);
        return count;
    }
}