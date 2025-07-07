package linear.singlyLinkedList;

// import java.util.Scanner;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // initialization of the Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        
        sll.insertLast(1);
        sll.insertLast(8);
        sll.insertLast(10);
        sll.insertLast(16);
        
        // Display the content of the Linked List
        System.out.print("List items before: ");
        sll.print();
        
        // Code here

        // Display the content of the Linked List
        System.out.print("List items after: ");
        sll.print();

    }
}
