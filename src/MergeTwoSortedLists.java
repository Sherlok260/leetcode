import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MergeTwoSortedLists {

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

    public static void addRight(ListNode listNode, int head, int val) {

        while (listNode != null) {
            if(listNode.val != head) {
                listNode = listNode.next;
            } else {
                if(listNode.next != null) {
                    listNode.next = new ListNode(val, listNode.next);
                    break;
                } else {
                    listNode.next = new ListNode(val);
                }
            }
        }

    }

    public static void addLeft(ListNode listNode, int head, int val) {

        if (listNode.next == null) {
            ListNode listNode1 = new ListNode(listNode.val);
            listNode = new ListNode(val, listNode1);
        } else

        while (listNode != null) {
            if(listNode.next != null) {
                if(listNode.next.val == head) {
                    addRight(listNode, listNode.val, val);
                    break;
                }
            }
            listNode = listNode.next;
        }

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null && list2 == null) return null;
        else if(list1 != null && list2 == null) return list1;
        else if(list1 == null && list2 != null) return list2;
        else {

            List<Integer> list = new ArrayList<>();

            while (list1 != null) {
                list.add(list1.val);
                list1 = list1.next;
            }

            while (list2 != null) {
                list.add(list2.val);
                list2 = list2.next;
            }

            list.sort(Comparator.comparingInt(value -> value));

            if (list.size() != 0) {
                ListNode listNode = new ListNode(list.get(0));
                list.remove(0);
                for (Integer i: list) {
                    addToEnd(listNode, i);
                }
                return listNode;
            } else {
                return null;
            }
        }
    }

    public static void addToEnd(ListNode list1Copy, int val) {
        while (list1Copy.next != null) {
            list1Copy = list1Copy.next;
        }
        list1Copy.next = new ListNode(val, null);
    }

    public static void print(ListNode listNode) {
        while (listNode != null) {
            System.out.print(listNode.val + " ");
            listNode = listNode.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));

        print(mergeTwoLists(list1, list2));

//        print(list1);

    }
}
