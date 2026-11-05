class MyCircularQueue {

    class Node{
        int value;
        Node next;
        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    Node head;
    Node tail;
    int size;
    int capacity;

    public MyCircularQueue(int k) {
        head = null;
        tail = null;
        size = 0;
        capacity = k;
    }
    
    public boolean enQueue(int value) {
        Node temp = new Node(value);
        if(size>=capacity){
            return false;
        }
        if(head == null){
            head = temp;
            tail = temp;
            tail.next = head;
            size++;
            return true;
        }
        tail.next = temp;
        tail = temp;
        tail.next = head;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(head == null){
            return false;
        }
        if(size==1){
            head = null;
            tail = null;
            size--;
            return true;
        }
        head = head.next;
        tail.next = head;
        size--;
        return true;
    }
    
    public int Front() {
        if(head==null){
            return -1;
        }
        return head.value;
        
    }
    
    public int Rear() {
        if(tail==null){
            return -1;
        }
        return tail.value;
    }
    
    public boolean isEmpty() {
        if(size==0){
            return true;
        }
        return false;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */