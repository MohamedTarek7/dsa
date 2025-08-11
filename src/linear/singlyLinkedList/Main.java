package linear.singlyLinkedList;

// import java.util.Scanner;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // initialization of the Linked List
        SinglyLinkedList sll_1 = new SinglyLinkedList();
        sll_1.insertLast(1);
        sll_1.insertLast(4);
        sll_1.insertLast(8);
        // sll_1.print();

        SinglyLinkedList sll_2 = new SinglyLinkedList();
        sll_2.insertLast(3);
        sll_2.insertLast(6);
        // sll_2.print();

        SinglyLinkedList sll_3 = new SinglyLinkedList();
        sll_3.head = new ListNode<>(0);
        System.out.println(sll_3.head.data);

        // Merging two linked lists
        // SinglyLinkedList mergedList = SinglyLinkedList.mergeSorted(sll_1, sll_2);
        // mergedList.print();
    }
}
