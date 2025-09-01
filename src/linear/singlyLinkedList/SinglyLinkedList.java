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
            throw new IllegalArgumentException(
                    "Invalid value: n = " + n + ", n should be a value in the range of 1 to " + size());
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

    // Remove duplicates from a sorted linked list
    public void removeDuplicatesSorted() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
    }

    // Remove duplicates from an usorted linked list
    public void removeDuplicatesUnsorted() {
        if (head == null) {
            return;
        }

        ListNode current = head;

        while (current != null) {
            ListNode runner = current;
            while (runner.next != null) {
                if (current.data.equals(runner.next.data)) {
                    runner.next = runner.next.next; // remove the duplicate node
                } else {
                    runner = runner.next; // move to the next node
                }
            }
            current = current.next; // move to the next node
        }
    }

    public <T> void insertSorted(T value) {
        if (head == null) {
            head = new ListNode<T>(value);
            return;
        }

        ListNode current = head;
        ListNode temp = null;
        ListNode new_node = new ListNode<T>(value);

        // these two variables are holding the integer values,
        // because comparisone betten an object & a premitive can't be done.
        int current_data = (int) current.data;
        int new_node_data = (int) new_node.data;

        while (current != null && new_node_data >= current_data) {
            temp = current;
            current = current.next;
            current_data = (int) current.data; // update the value of current.data in the holder variable
        }
        new_node.next = current;
        temp.next = new_node;
    }

    public void removeNodeByKey(int key) {

        if (head == null) {
            throw new NullPointerException("The List is empty!");
        }

        ListNode current = head;

        if (head.data.equals(key)) {
            head = head.next;
            current.next = null;
            return;
        }

        ListNode temp = null;

        while (current != null) {
            if (current.data.equals(key)) {
                temp.next = current.next;
                current.next = null;
                return;
            }
            temp = current;
            current = current.next;
        }
    }

    public boolean containsLoop() {
        ListNode fast_ptr = head;
        ListNode slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if (fast_ptr == null) {
                return false;
            }
            if (fast_ptr.equals(slow_ptr)) {
                return true;
            }
        }
        return false;
    }

    public ListNode findStartOfLoop() {
        ListNode fast_ptr = head;
        ListNode slow_ptr = head;

        while (fast_ptr != null && fast_ptr.next != null) {
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;

            if (fast_ptr.equals(slow_ptr)) {
                return slow_ptr;
            }
        }
        return null;
    }

    public void removeLoop() {
        ListNode start_of_loop = findStartOfLoop();
        ListNode temp = head;
        
        while (!temp.next.equals(start_of_loop.next)) {
            temp = temp.next;
            start_of_loop = start_of_loop.next;
        }

        start_of_loop.next = null;
    }

    public void createALoopInLinkedList() {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        ListNode eighth = new ListNode(8);
        ListNode ninth = new ListNode(9);

        head = first;

        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = eighth;
        eighth.next = ninth;
        ninth.next = sixth; // Creates a loop by pointing sixth node to third
    }

    public static ListNode mergeSorted(ListNode a, ListNode b) {
        
        ListNode dummy = new ListNode(0); // dummy node
        ListNode tail = dummy; // tail pointer to build the merged list

        while (a != null && b != null) {

            if ((int) (a.data) >= (int) (b.data)) {
                tail.next = b;
                b = b.next;
            } else {
                tail.next = a;
                a = a.next;
            }
            tail = tail.next;
        }
        // append the remaining nodes of a or b
        if (a == null) {
            tail.next = b;
        } else {
            tail.next = a;
        }
        // return the merged list, which starts from dummy.next
        return dummy.next;
    } 
}

// Hello from Mac OS