package cses.collections;
public class MyHashSet {
    class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
        this.next = null;
    }
    }
    private static final int SIZE = 10;
    private Node[] buckets;

    public MyHashSet() {
        buckets = new Node[SIZE];
    }
    private int getIndex(int key) {
        return Math.abs(key) % SIZE;
    }
    public void add(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        if (head == null) {
            buckets[index] = new Node(key);
            return;
        }
        Node current = head;
        while (true) {
            if (current.value==key) {
                return; 
            }
            if (current.next == null) {
                break;
            }
            current = current.next;
        }
        current.next = new Node(key);
    }

 
    public void remove(int key) {
        int index = getIndex(key);
        Node head = buckets[index];
        if (head == null) return;
        if (head.value == key) {
            buckets[index] = head.next;
            return;
        }
        Node prev = head;
        Node curr = head.next;
        while (curr != null) {
            if (curr.value == key) {
                prev.next = curr.next;
                return;
            }
            prev = curr;
            curr = curr.next;
        }
    }
        public static void main(String[] args) {
        MyHashSet set = new MyHashSet();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(20); 
        set.remove(10);
        set.remove(100); 
    }
}
