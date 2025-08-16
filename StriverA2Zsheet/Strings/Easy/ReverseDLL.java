public class ReverseDLL {
    public static void main(String[] args){

    }

    public ListNode ReverseDLL(ListNode head){
        if(head == null || head.next == null)
            return head;

        ListNode prev = null;
        ListNode current = head;

        prev = current.back;
        current.back = current.next;
        current.next = prev;
        current = current.back;
    }
    return prev.back;
}
