class Solution {
    public String frequencySort(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        List<Map.Entry<Character,Integer>> l=new ArrayList<>(map.entrySet());
        Collections.sort(l,(a,b)->b.getValue()-a.getValue());
        String str="";
        for(Map.Entry<Character,Integer> m1:l){
            int a=m1.getValue();
            for(int i=0;i<a;i++){
                str+=m1.getKey();
            }
        }
        return str;
    }
}