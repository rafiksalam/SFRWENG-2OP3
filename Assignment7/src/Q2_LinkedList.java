/* Assignment 7 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (60 marks)
    Use java to implement a data structure named LinkedList, and implement several methods of the LinkedList.

 */

class Node {
    int data; // 'data' stores the value of a node.
    Node next; // 'next' refers/points to the next node

    // the construction method of class Node.
    Node(int d) {
        data = d;
        next = null;
    }
}

class Q2_LinkedList {
    Node head;

    // Insert 'new_data' at the beginning of the LinkedList
    // (5 marks)
    public void insertAtBeginning(int new_data) {
        Node newNode = new Node(new_data);
        newNode.next = head;
        head = newNode;
    }

    // Insert 'new_data' at the end of the LinkedList
    // (5 marks)
    public void insertAtEnd(int new_data) {
        Node new_node = new Node(new_data);
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
        return;
    }

    // Insert 'new_data' after a node referred to as 'prev_node'
    // (10 marks)
    public void insertAfter(Node prev_node, int new_data) {
        if (prev_node == null) {
            System.out.println("THe previous node cannot be null!");
            return;
        }
        Node new_node =  new Node(new_data);
        new_node.next = prev_node.next;
        prev_node.next = new_node;
    }

    // Delete a node located in 'position' of the Linked List. The first element of the LinkedList has a position=0.
    // (10 marks)
    void deleteNode(int position) {
        if (head == null) {
            return;
        }
        Node temp = head;

        if (position == 0) {
            head = temp.next;   // Change head
            return;
        }
        for (int i=0; temp!=null && i<position-1; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            return;
        }
        Node next = temp.next.next;
        temp.next = next;
    }

    // Search for a node containing the value of 'key' in the LinkedList.
    // If there is a node in the LinkedList whose value is equal to 'key', then return 'true'.
    // If there is no node in the LinkedList whose value is equal to 'key', then return 'false'.
    // (15 marks)
    boolean search(Node head, int key) {
        Node currNode = head;
        while (currNode != null)
        {
            if (currNode.data == key) {
                return true;
            }
            currNode = currNode.next;
        }
        return false;

    }

    // Sort the nodes in the LinkedList in ascending orders of their values.
    // Requirement: please use bubble sort.
    // Example: for a LinkedList: head->3->5->1->4->2, the sorted LinkedList should be head->1->2->3->4->5.
    // (15 marks)
    void sortLinkedList(Node head) {
        if (head == null)
            return;
        Node temp = head;
        while (temp != null) {
            Node min = temp;
            Node r = temp.next;
            while (r != null) {
                if (min.data > r.data) {
                    min = r;
                }
                r = r.next;
            }

            int x = temp.data;
            temp.data = min.data;
            min.data = x;
            temp = temp.next;

        }
    }

        // Print the linked list
        public void printList () {
            Node tnode = head;
            while (tnode != null) {
                System.out.print(tnode.data + " ");
                tnode = tnode.next;
            }
        }

        public static void main (String[]args){
            /* TA may test different functions of the LinkedList here */
            /* The following is just an example of how to do the test. */

            Q2_LinkedList llist = new Q2_LinkedList();

            llist.insertAtEnd(1);
            llist.insertAtBeginning(2);
            llist.insertAtBeginning(3);
            llist.insertAtEnd(4);
            llist.insertAfter(llist.head.next, 5);

            System.out.println("Linked list: ");
            llist.printList();

            System.out.println("\nAfter deleting an element: ");
            llist.deleteNode(3);
            llist.printList();

            System.out.println();
            int item_to_find = 3;
            if (llist.search(llist.head, item_to_find))
                System.out.println(item_to_find + " is found");
            else
                System.out.println(item_to_find + " is not found");

            llist.sortLinkedList(llist.head);
            System.out.println("\nSorted List: ");
            llist.printList();
        }
    }