package linear.singlyLinkedList;

// import java.util.Scanner;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // initialization of the Linked List
        SinglyLinkedList sll_1 = new SinglyLinkedList();
        sll_1.insertLast(5);
        sll_1.insertLast(6);
        sll_1.insertLast(4);
        sll_1.print();

        SinglyLinkedList sll_2 = new SinglyLinkedList();
        sll_2.insertLast(3);
        sll_2.insertLast(4);
        sll_2.insertLast(3);
        sll_2.print();

        
        SinglyLinkedList sumOfTwoLinkedList = new SinglyLinkedList();
        sumOfTwoLinkedList.head = SinglyLinkedList.sumTwoLinkedLists(sll_1.head, sll_2.head);
        sumOfTwoLinkedList.print();
    }
}
