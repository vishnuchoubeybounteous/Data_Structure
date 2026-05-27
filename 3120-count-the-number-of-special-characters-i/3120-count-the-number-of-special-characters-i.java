class Solution {
    public int numberOfSpecialChars(String word) {
        int[] upper=new int[26];
        int[] lower=new int[26];
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                upper[word.charAt(i)-'A']++;
            }
            else{
                lower[word.charAt(i)-'a']++;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
           if(upper[i]!=0&&lower[i]!=0)count++;
        }
        return count;
    }
}