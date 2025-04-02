package linear.singlyLinkedList;

@SuppressWarnings("unchecked")
public class SinglyLinkedList {
    
    protected ListNode head;

    public void insertFirst(ListNode node) {
        node.next = head;
        head = node;
    }

    public void insertLast(ListNode node) {
        if (head == null) {
            head = node;
            return;
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
    }

    public void insertAt(ListNode node, int idx) {
        if (idx > size(head) || idx < 0) {
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }
        
        if (idx == 0) {
            insertFirst(node);
            return;
        }

        ListNode current = head;
        int i = 0;
        while (i < idx - 1) {
            current = current.next;
            i++;
        }
        node.next = current.next;
        current.next = node;
    }

    public int size(ListNode node) {
        int counter = 0;
        ListNode current = head;
        while (current != null) {
            counter++;
            current = current.next;
        }
        return counter;
    }

    public int size(SinglyLinkedList sll) {
        int counter = 0;
        ListNode current = sll.head;
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

    public void deleteAt(int idx) {
        if (idx > size(head) || idx < 0) {
            throw new IndexOutOfBoundsException("This index doesn't exist");
        }

        if (idx == 0) {
            deleteHead();
            return;
        }

        if (idx == size(head) - 1) {
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

    public void replace(int idx1, int idx2) {
        ListNode current = head;
        ListNode temp ;
        int i = 0;
        while (i < idx2) {
            current = current.next;
        }
    }

}
