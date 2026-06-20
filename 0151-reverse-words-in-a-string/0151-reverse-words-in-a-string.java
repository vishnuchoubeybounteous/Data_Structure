class Solution {
    public String reverseWords(String s) {
        String[] array=s.split("\\s+");
        reverse(array);
        return String.join(" ",array).trim();

    }
    public void reverse(String[] array){
        int i=0;
        int j=array.length-1;
        while(i<j){
            String temp=array[i];
            array[i]=array[j];
            array[j]=temp;
            i++;
            j--;
        }
    }
}