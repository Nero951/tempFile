package dataStructure;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Main1 {
      public ListNode removeNthFromEnd(ListNode head, int n) {
            if(head==null || head.next==null) return head;
            ListNode dummy = new ListNode(0, head);
            ListNode first = head;
            ListNode slow = dummy;
            while(n>0){
                  first = first.next;
                  n--;
            }
            while(first!=null){
                  slow = slow.next;
                  first = first.next;
            }
            slow.next = slow.next.next;
            return dummy.next;
      }
}
