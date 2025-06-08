package linear.singlyLinkedList;

import java.util.Scanner;

public class Main {
    // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // initialization of the Linked List
        SinglyLinkedList sll = new SinglyLinkedList();

        // Decleration of the Linked List
        // for (int i = 1; i < 10; i++) {
        //     sll.insertLast(i);
        // }

        // Display the content of the Linked List

        int key;
        
        sll.insertLast(1);
        sll.insertLast(8);
        sll.insertLast(10);
        sll.insertLast(16);
        
        System.out.print("List items: ");
        sll.print();
        
        System.out.print("What item do you want to remove: ");
        key = input.nextInt();

        sll.removeNodeByKey(key);
        System.out.print("List items: ");
        sll.print();

        // System.out.println("The nth node from end of the lis is: " + sll.getNthNodeFromEnd(3).data);
 
    }
}
