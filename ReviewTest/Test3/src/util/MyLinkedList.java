package util;

public class MyLinkedList {
    private Node head;
    private Node last;

    public boolean add(String e){
        Node node = new Node(e);
        if(head==null){
            head = node;
            last = node;
            return true;
        }
        node.prev = last;
        last.next = node;
        last = node;
        return true;
    }
    public void add(int index, String e){
        Node node = new Node(e);
        if(index<0 || index>size()){
            throw new IndexOutOfBoundsException("下标越界："+index);
        }
        if(head==null){
            head = last = node;
        }else if(index==0){
            node.next = head;
            head.prev = node;
            head = node;
        }else if(index==size()){
            node.prev = last;
            last.next = node;
            last = node;
        }else {
            Node temp = head;
            while(index>1){
                temp = temp.next;
                index--;
            }
            Node next = temp.next;
            node.prev = temp;
            node.next = next;
            temp.next = node;
            next.prev = node;
        }
    }

    private int size() {
        int count = 0;
        while(head.next!=null){
            count++;
            head = head.next;
        }
        return count;
    }

    public void remove(int index){
        if(index<0 || index>=size()){
            throw new IndexOutOfBoundsException("访问越界："+index);
        }
        if(head==last){
            head = last = null;
        }else if(index==0){
            head = head.next;
            head.prev = null;
        }else if(index==size()-1){
            last = last.prev;
            last.next = null;
        }else{
            Node temp = head;
            while(index>1){
                temp = temp.next;
                index--;
            }
            Node next = temp.next.next;
            temp.next = next;
            next.prev = temp;

        }
    }

    public boolean remove(String e){
        if(head==null){
            return false;
        }
        Node temp = head;
        while(temp != null){
            if(temp.val.equals(e)){
                if(head.val.equals(e)){
                    head = head.next;
                    head.prev = null;
                }else if(last.val.equals(e)){
                    last = last.prev;
                    last.next = null;
                }else{
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                }
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
}
