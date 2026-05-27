class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        String[] array=sentence.split("\\s");
        for(int i=0;i<array.length;i++){
            if(array[i].startsWith(searchWord))return i+1;
        }
        return -1;
    }
}