import org.w3c.dom.Node;

public class LinkedListCycle {

    static class NodeHandler {
        int data;
        NodeHandler next;
        NodeHandler(int value) {
            data = value;
            next = null;
        }
    }

    static NodeHandler nodeHandler;

    static void addToBegin(int value) {
        NodeHandler f_node = new NodeHandler(value);
        f_node.next = nodeHandler;
        nodeHandler = f_node;
    }

    static void printNodeList() {
        NodeHandler nodeHandler1 = nodeHandler;
        while (nodeHandler1 != null) {
            System.out.println(nodeHandler1.data);
            nodeHandler1 = nodeHandler1.next;
        }
        System.out.println();
    }

    public static boolean hasCycle(NodeHandler head) {
        NodeHandler node = head;
        if (node == null) return false;
        else if (node.next != null) return true;
        else return false;
    }

    public static void main(String[] args) {
        NodeHandler nodeHandler = null;
        System.out.println(hasCycle(nodeHandler));
    }
}
