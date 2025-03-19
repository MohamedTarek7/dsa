package linear.singlyLinkedList;

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList s1 = new SinglyLinkedList();
        s1.head = new ListNode<>(20);

        SinglyLinkedList s2 = new SinglyLinkedList();
        s2.head = new ListNode<>("USD");
        s1.head.next = s2.head;

        SinglyLinkedList s3 = new SinglyLinkedList();
        s3.head = new ListNode<>('$');

        
    }
}
