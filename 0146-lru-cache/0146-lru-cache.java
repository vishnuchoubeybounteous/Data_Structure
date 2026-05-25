class LRUCache {
    int capacity;
    int size;
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    class Node{
        int key;
        int val;
        Node next;
        Node prev;
        public Node(int key,int val){
            this.key=key;
            this.val=val;
            this.next=null;
            this.prev=null;
        }
        public Node(int key,int val,Node next,Node prev){
            this.key=key;
            this.val=val;
            this.next=next;
            this.prev=prev;
        }
    }

    public LRUCache(int capacity) {
        this.capacity=capacity;
        this.head=new Node(-1,-1);
        this.tail=new Node(-1,-1);
        this.head.next=tail;
        this.tail.prev=head;
        this.map=new HashMap<>();
        this.capacity=capacity;
        this.size=0;
    }
    
    public int get(int key) {
        Node node=map.get(key);
        if(node==null)return -1;
        delete(node);
        insert(node);
        return node.val;
    }

   public void delete(Node node){
        Node temp=node.prev;
        temp.next=node.next;
        node.next.prev=temp;
   }
   public void insert(Node node){
       node.next=head.next;
       head.next=node;
       node.prev=head;
       node.next.prev=node;
   }
    
    public void put(int key, int value) {
       Node node=map.get(key);
       if(node==null){
          if(size>=capacity){
            Node t1=tail.prev;
            delete(t1);
            map.remove(t1.key);
            size--;
          }
          Node temp=new Node(key,value);
          insert(temp);
          map.put(key,temp);
          size++; 
       }
       else{
            delete(node);
            node.val=value;
            
            insert(node);
       }

    
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */