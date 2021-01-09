package util;

/**
 * @author Wade Winston Wilson
 */
public class MineSolution {
    public void listReverse(Node node){
        Node cur = node;
        Node next = cur.next;
        while(next != null){
            Node temp = next.next;
            next.next = cur;
            cur = next;
            next = temp;
            temp = temp.next;
        }
    }
    public Node listAdd(Node node1, Node node2){
        Node node = null;
        while(node1!=null && node2!=null){
            if(node1.val<node2.val){
                
            }
        }
        return node;
    }
    //TODO 微信红包

}
