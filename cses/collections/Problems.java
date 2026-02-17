package cses.collections;
import java.util.*;
public class Problems {
    // public static void main(String args[]){
    //     Set<String> set=new LinkedHashSet<>();
    //     set.add("Rahul");
    //     set.add("Amit");
    //     set.add("Neha");
    //     set.add("Rahul");
    //     System.out.println(set);
    // }

    //Question 2
    // public static void main(String args[]){
    //     List<String> list=Arrays.asList("Milk","Bread","Milk","Egg");
    //     System.out.println(list);
        
    // }

    //Question 3

    // public static void main(String args[]){
    //   List<String> l=Arrays.asList("Apple","Mango","Apple","Banana","Mango","Apple");
    //   Map<String,Integer> map=new HashMap<>();
    //   for(String s:l){
    //     map.put(s,map.getOrDefault(s,0)+1);
    //   }
    //   System.out.println(map);
    // }

    //Question 4
    // public static void main(String args[]){
    //    Set<Integer> set=new HashSet<>();
    //    set.add(1);
    //    set.add(2);
    //    set.add(3);
    //    set.add(2);
    //    set.add(4);
    //    set.add(1);
    //    System.out.println(set);
    // }

    //Question 5

    // public static void main(String args[]){
    //     Queue<String> q=new LinkedList<>();
    //     q.offer("Task1");
    //     q.offer("Task2");
    //     q.offer("Task3");
    //     System.out.println(q);
    // }


    //Solution 6
    // public static void main(String args[]){
    //  PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
    //  pq.offer(45);
    //  pq.offer(67);
    //  pq.offer(89);
    //  pq.offer(34);
    //  System.out.println(pq.peek());
    // }

    //Solution 7

    // public static void main(String args[]){
    //     Queue<String> q=new LinkedList<>();
    //     q.offer("Patent1");
    //     q.offer("Patent2");
    //     q.offer("Patent3");
    // }

    //Solution 8

    // public static void main(String args[]){
    //     Map<Integer,String> map=new HashMap<>();
    //     map.put(101,"Rahul");
    //     map.put(102,"Amit");
    //     map.put(103,"Neha");
    //     System.out.println(map);
    // }

    // public static void main(String args[]){
    //     List<String> l=Arrays.asList("Rahul","Amit","Neha");
    //     Collections.sort(l);
    //     System.out.println(l);
    // }

    public static void main(String args[]){
        List<Integer> l=Arrays.asList(1,2,3,2,4,1);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:l){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            if(m.getValue()>1){
                System.out.println(m.getKey());
            }
        }

    }


}
