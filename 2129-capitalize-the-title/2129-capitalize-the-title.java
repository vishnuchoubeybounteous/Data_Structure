class Solution {
    public String capitalizeTitle(String title) {
        String[] array=title.split("\\s");
        for(int i=0;i<array.length;i++){
            String s=array[i];
            array[i]=s.length()>2?Character.toUpperCase(s.charAt(0))+s.substring(1).toLowerCase():s.toLowerCase();
            System.out.println(array[i]);
        }
        return String.join(" ",array);
        
    }
}