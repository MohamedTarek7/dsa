package linear.singlyLinkedList;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        // initialization of the Linked List
        SinglyLinkedList sll = new SinglyLinkedList();

        // Decleration of the Linked List
        // for (int i = 1; i < 10; i++) {
        //     sll.insertLast(i);
        // }

        // Display the content of the Linked List
        
        sll.insertLast(1);
        sll.insertLast(8);
        sll.insertLast(10);
        sll.insertLast(16);
        System.out.print("List items: ");
        sll.print();
        sll.insertSorted(11);
        System.out.print("List items: ");
        sll.print();

        // System.out.println("The nth node from end of the lis is: " + sll.getNthNodeFromEnd(3).data);
 
    }
}
