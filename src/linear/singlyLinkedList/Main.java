package linear.singlyLinkedList;

// import java.util.Scanner;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        // initialization of the Linked List
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.createALoopInLinkedList();

        System.out.println(sll.findStartOfLoop().data);

        System.out.println(sll.containsLoop());
        sll.removeLoop();
        
        System.out.println(sll.containsLoop());
        sll.print();
    }
}
