// Node class
class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

class Remove_Loop_LL {
    // Function to remove loop using Floyd’s Cycle Detection
    public static void removeLoop(Node head) {
        if (head == null || head.next == null) return;

        Node slow = head;
        Node fast = head;

        // Step 1: Detect loop
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) { // loop detected
                break;
            }
        }

        // If no loop
        if (slow != fast) return;

        // Step 2: Find start of loop
        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        // Step 3: Find last node of loop and break it
        while (fast.next != slow) {
            fast = fast.next;
        }
        fast.next = null; // remove loop
    }

    // Utility function to print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Introduce loop: 5 -> 2
        head.next.next.next.next.next = head.next;

        // Remove loop
        removeLoop(head);

        // Print list after removing loop
        printList(head); // Output: 1 2 3 4 5
    }
}