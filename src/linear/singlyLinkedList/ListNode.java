package linear.singlyLinkedList;

public class ListNode<T> {
    protected T data;
    protected ListNode<T> next;

    public ListNode(T data) {
        this.data = data;
        this.next = null;
    }
    
}
