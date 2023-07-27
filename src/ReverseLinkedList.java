import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class ReverseLinkedList {

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void addElement(ListNode listNode, int val) {
        while (listNode.next != null) {
            listNode = listNode.next;
        }
        listNode.next = new ListNode(val, null);
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void copier(ListNode listNode, ListNode copy) {

        copy.val = listNode.val;
        copy.next = null;
        while (listNode.next != null) {
            addElement(copy, listNode.next.val);
            listNode = listNode.next;
        }
    }

    public static void removeLastItem(ListNode listNode) {

        while (listNode.next.next != null) {
            listNode = listNode.next;
        }
        listNode.next = null;
    }

    public static ListNode reverseList(ListNode head) {
        if(head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        } else {
            ListNode copy = new ListNode();
            copier(head, copy);
            while (copy != null) {
                head = new ListNode(copy.val, head);
                removeLastItem(head);
                copy = copy.next;
            }
            return head;
        }
    }

    public static void main(String[] args) {
//        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5, null)))));
        ListNode listNode = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        listNode = reverseList(listNode);
//        listNode = new ListNode(6, listNode);
//        removeLastItem(listNode);
        print(listNode);
    }
}
