package linear.singlyLinkedList;

import java.util.List;

@SuppressWarnings("unchecked")
public class SinglyLinkedList {

    protected ListNode head;

    public <T> void insertFirst(T value) {
        ListNode node = new ListNode<T>(value);
        node.next = head;
        head = node;
    }

    public <T> void insertLast(T value) {
        if (head == null) {
            head = new ListNode<T>(value);
            return;
        }

        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new ListNode<T>(value);
    }

    public <T> void insertNodeAtIndex(T value, int idx) {
        if (idx > size() || idx < 0) {
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }

        if (idx == 0) {
            insertFirst(new ListNode<T>(value));
            return;
        }

        ListNode current = head;
        int i = 0;
        while (i < idx - 1) {
            current = current.next;
            i++;
        }
        ListNode node = new ListNode<T>(value);
        node.next = current.next;
        current.next = node;
    }

    public int size() {
        int counter = 0;
        ListNode current = head;

        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public void print() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void deleteHead() {
        if (head == null) {
            return;
        }
        ListNode temp = head;
        head = head.next;
        temp.next = null;
    }

    public void deleteTail() {
        ListNode current = head;
        while (current != null) {
            if (current.next != null) {
                if (current.next.next == null) {
                    current.next = null;
                    break;
                }
            }
            current = current.next;
        }
    }

    public void deleteNodeAtIndex(int idx) {
        if (idx > size() || idx < 0) {
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }

        if (idx == 0) {
            deleteHead();
            return;
        }

        if (idx == size() - 1) {
            deleteTail();
            return;
        }

        ListNode current = head;
        int i = 0;
        while (i < idx - 1) {
            current = current.next;
            i++;
        }
        ListNode temp = current.next;
        current.next = temp.next;
        temp.next = null;
    }

    public <T> boolean contains(T searchKey) {
        ListNode current = head;
        while (current != null) {
            if (searchKey.equals(current.data)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public ListNode getListNodeAtIndex(int idx) {

        if (idx > size() || idx < 0) {
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }

        ListNode temp = head;
        int i = 0;

        while (i < idx) {
            temp = temp.next;
            i++;
        }
        return temp;
    }

    public <T> void switchListNodes(ListNode n1, ListNode n2) {
        T temp = (T) n1.data;
        n1.data = n2.data;
        n2.data = temp;
    }

    public void reverse() {
        int length = size();
        int i = 0;

        while (i < (length / 2)) {
            switchListNodes(getListNodeAtIndex(i), getListNodeAtIndex(length - 1));
            length--;
            i++;
        }
    }

    public void reverseSLL() {
        // ListNode current = head;
        ListNode previous = null;
        ListNode next = null;

        while (head != null) {
            next = head.next;
            head.next = previous;
            previous = head;
            head = next;
        }
        head = previous;
    }

    public ListNode getMiddleNode() {

        if (head == null) {
            return null;
        }

        ListNode slow_ptr = head;
        ListNode fast_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            slow_ptr = slow_ptr.next;
            fast_ptr = fast_ptr.next.next;
        }
        return slow_ptr;
    }

    public ListNode getNthNodeFromEnd(int n) {

        if (head == null) {
            return null;
        }

        if (n <= 0 || n > size()) {
            throw new IllegalArgumentException("Invalid value: n = " + n + ", n should be a value in the range of 1 to " + size());
        }

        ListNode main_ptr = head;
        ListNode ref_ptr = head;

        int counter = 0;

        while (counter < n) {
            ref_ptr = ref_ptr.next;
            counter++;
        }

        while (ref_ptr != null) {
            ref_ptr = ref_ptr.next;
            main_ptr = main_ptr.next;
        }

        return main_ptr;
    }

    // Remove duplicate from a sorted linked list
    
    /*
     * your code here
     */
}

// Hello from Mac OS