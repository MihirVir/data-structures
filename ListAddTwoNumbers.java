class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode (int val) { this.val = val; }
    ListNode (int val, ListNode next) { this.val = val; this.next = next; }
}
public class ListAddTwoNumbers {
    public static void main(String[] args) {
        ListNode n1 = new ListNode(2);
        ListNode n2 = new ListNode(4);
        ListNode n3 = new ListNode(3);
        n1.next = n2;
        n2.next = n3;

        ListNode s1 = new ListNode(5);
        ListNode s2 = new ListNode(6);
        ListNode s3 = new ListNode(4);
        s1.next = s2;
        s2.next = s3;

        ListNode result = addTwoNumbers(n1, s1);
        System.out.println(result);
    }   

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return new ListNode();     
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;

        while (current != null) {
            ListNode nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        return prev;
    }

    public static int createIntegerFromList(ListNode head) {
        int result = 0;
        ListNode current = head;

        while (current != null) {
            result = result * 10 + current.val;
            current = current.next;
        }

        return result;
    }

    public static void printLinkedList (ListNode list) {
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }
}
