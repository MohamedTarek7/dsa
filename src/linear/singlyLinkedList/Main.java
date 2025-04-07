package linear.singlyLinkedList;

public class Main {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode<>(1);

        ListNode<Integer> node2 = new ListNode<>(2);
        sll.head.next = node2;

        ListNode<Integer> node3 = new ListNode<>(3);
        node2.next = node3;

        ListNode<Integer> node4 = new ListNode<>(4);
        node3.next = node4;

        ListNode<Integer> node0 = new ListNode<>(0);
        ListNode<Integer> node5 = new ListNode<>(5);


        System.out.println("Size: " + sll.size());
        sll.print();

        // sll.reverse();
        sll.reverseSLL();

        System.out.println("Size: " + sll.size());
        sll.print();

    }
}
