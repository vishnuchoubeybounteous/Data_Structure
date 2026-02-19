package cses.collections;

import java.util.Arrays;

public class MyHashSet {
    private int[] arr;
    private int size;     
    private int capacity;  

    public MyHashSet() {
        capacity = 10;   
        arr = new int[capacity];
        size = 0;
    }

  
    private boolean contains(int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key) return true;
        }
        return false;
    }

 
    public void add(int key) {
        if (contains(key)) return;

        if (size == capacity) {
            capacity *= 2;
            arr = Arrays.copyOf(arr, capacity);
        }
        arr[size] = key;
        size++;
    }

    public void remove(int key) {
        for (int i=0;i<size;i++) {
            if (arr[i]==key) {
                for (int j=i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                size--;
                return;
            }
        }
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        set.add(5);
        set.add(10);
        set.add(15);
        set.print();

        set.add(10); 
        set.print(); 

        set.remove(10);
        set.print(); 

        for (int i = 1; i <= 15; i++) {
            set.add(i);
        }
        set.print();
    }
}

