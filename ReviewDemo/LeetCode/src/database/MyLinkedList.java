package database;

class MyListNode{
    Object val; 
    MyListNode next;
    MyListNode prev;

    public MyListNode(Object val) {
        this.val = val;
    }
}
public class MyLinkedList {
    MyListNode head;
    MyListNode tail;
    public boolean isEmpty(){
        return this.head == null && this.tail == null;
    }
    public int sizeOf(){
        MyListNode cur = this.head;
        int count = 0;
        while(cur!=null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    public void display(){
        MyListNode cur = this.head;
        while(cur!=null){
            System.out.print(cur.val);
            cur = cur.next;
        }
        System.out.println();
    }
    public void addFirst(Object val){
        MyListNode node = new MyListNode(val);
        if(this.head==null && this.tail==null){
            this.head = node;
            this.tail = node;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    public void addLast(Object val){
        MyListNode node = new MyListNode(val);
        if(this.head==null && this.tail==null){
            this.head = node;
            this.tail = node;
        }
        this.tail.next = node;
        node.prev = tail;
        this.tail = node;
    }
    public void addIndex(int index, Object val){
        MyListNode node =new MyListNode(val);
        MyListNode cur = this.head;
        if(index<0 || index>sizeOf()){
            throw new RuntimeException("插入位置不合法！");
        }
        if(index==0) {
            addFirst(val);
            return;
        }
        if(index==sizeOf()) {
            addLast(val);
            return;
        }
        for (int i = 0; i < index; i++) {
            cur = cur.next;
        }
        cur.next.prev = node;
        node.next = cur.next.prev;
        node.prev = cur;
        cur.next = node;
    }
    public boolean contents(Object key){
        MyListNode cur = this.head;
            while(cur!=null){
                if(cur.val==key){
                    return true;
                }
                cur = cur.next;
            }
        return false;
    }
    public void update(int key, Object val){
        MyListNode cur = this.head;
        if(key<0 || key>sizeOf()){
            throw new RuntimeException("更新位置不合法！");
        }
        for (int i = 0; i < key; i++){
            cur = cur.next;
        }
        cur.next.val = val;
    }

    public void remove(Object val){
        MyListNode cur = this.head;
        while(cur!=null){
            if(cur.val == val){
                if(cur == this.head){
                    this.head = this.head.next;
                    this.head.prev = null;
                }else{
                    cur.prev.next = cur.next;
                }
                if(cur.next!=null){
                    cur.next.prev = cur.prev;
                }else {
                    this.tail = cur.prev;
                    this.tail.next = null;
                }
            }
            cur = cur.next;
        }
    }
    public void clear(){
        while(this.head!=null){
            this.head.next = null;
            this.head.prev = null;
            this.head = null;
        }
        this.tail = null;
    }

}
