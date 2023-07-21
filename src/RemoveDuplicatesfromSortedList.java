import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class RemoveDuplicatesfromSortedList {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode deleteDuplicates(ListNode head) throws IOException {
        ListNode listNode = head;
        try(FileReader fileReader = new FileReader("asd")) {

        }
        while (head != null) {
            if(head.next != null) {
                if(head.val != head.next.val) {
                    head = head.next;
                    continue;
                } else {
                    if(head.next.next != null) {
                        head.next = head.next.next;
                    } else {
                        head.next = null;
                    }
                }
            } else {
                return listNode;
            }
        }
        return head;
    }

    public static void main(String[] args) {

    }
}
