public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static boolean isCycle() { // floyd's cycle finding approach
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) { // cycle exit
                return true;

            }

        }
        return false; // cycle not exit
    }

    public static void removecycle() {
        // detect cycle
        Node slow = head;
        Node fast = head;
        boolean iscycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                iscycle = true;
                break;
            }
        }
        if (iscycle == false) {
            return;
        }

        // find meeting point
        slow = head;
        Node prev = null; // last node
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;

        }
        // remove cycle->last.next=null
        prev.next = null;

    }

    public static void main(String args[]) {
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp; // 1->2->3->1
        System.out.println(isCycle());
        removecycle();
        System.out.println(isCycle());

    }
}