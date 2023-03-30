/* Assignment 9 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (40 marks)
    1. Inherit from LKList.A2_LinkedList to implement a subclass Q1_OrderedLinkedList that overrides the sortLinkedList()
    method by using insertion sort instead of the original bubble sort in LKList.A2_LinkedList. Please sort all nodes in
    ascending order of data values.
    2. Implement an orderedInsert() method that inserts a new node in an ordered linked list without breaking the order of
    nodes. Please use one or multiple of the methods of the super class LKList.A2_LinkedList such as insertAtBeginning(),
    insertAtEnd(int new_data) and insertAfter().
 */

import LKList.*;

public class Q1_OrderedLinkedList extends LKList.A2_LinkedList{
    // Use the following method to override the original sortLinkedList() method.
    // The following method should implement insertion sort.
    // (25 marks)
    public void sortLinkedList(Node headref)
    {
        System.out.println("Running insertion sort of A1_OrderedLinkedList ...");
        
        Node currNode = headref.next;
        Node end = headref;

        while (currNode != null) {
            Node store = this.head;
            Node next = currNode.next;
            while (true) {
                if (currNode.data < store.data & store == this.head) {
                    cutOff(currNode);
                    this.head = currNode;
                    currNode.next = store;
                    break;
                }
                else if (currNode.data > store.data & store == end) {
                    cutOff(currNode);
                    currNode.next = end.next;
                    end = currNode;
                    store.next = currNode;
                    break;
                }
                else if (currNode.data < store.data) {
                    cutOff(currNode);
                    insertBefore(store, currNode);
                    break;
                }
                store = store.next;
            }
            currNode = next;
        }
    }
    public void cutOff(Node node) {

        Node currNode = this.head;

        while (currNode != null) {
            if (currNode.next == node) {
                node.next = null;
                currNode.next = currNode.next.next;
                break;
            }
            currNode = currNode.next;
        }
    }

    public void insertBefore(Node after, Node before) {

        Node currNode = this.head;

        while(currNode != null) {
            if (currNode.next == after) {
                currNode.next = before;
                before.next = after;
                break;
            }
            currNode = currNode.next;
        }
    }

    // Use the following method to implement orderedInsert().
    // The 'newnode' should be inserted without breaking the order of a LinkedList in ascending order.
    // Only the methods insertAtBeginning(), insertAtEnd(int new_data) and insertAfter() of the superclass LKList.A2_LinkedList can be used.
    // (15 marks)
    public void orderedInsert(Node newnode) {

        Node currNode = this.head;

        while (currNode != null) {
            if (currNode.data > newnode.data & currNode == this.head) {
                insertAtBeginning(newnode.data);
            }
            else if (currNode.next == null & currNode.data < newnode.data) {
                insertAtEnd(newnode.data);
            }
            if (currNode.next != null) {
                if (currNode.data < newnode.data & newnode.data < currNode.next.data) {
                    insertAfter(currNode, newnode.data);
                }
            }
            currNode = currNode.next;
        }
    }

    public static void main (String args[]) {
        // test A1_OrderedLinkedList
        Q1_OrderedLinkedList llist1 = new Q1_OrderedLinkedList();

        llist1.insertAtEnd(1);
        llist1.insertAtBeginning(3);
        llist1.insertAtBeginning(5);
        llist1.insertAtEnd(7);
        llist1.insertAfter(llist1.head.next, 9);
        llist1.printList();

        llist1.sortLinkedList(llist1.head);
        llist1.printList();

        Node newnode = new Node(10);
        llist1.orderedInsert(newnode);
        llist1.printList();

        // test A2_LinkedList
        A2_LinkedList llist2 = new A2_LinkedList();

        llist2.insertAtEnd(2);
        llist2.insertAtBeginning(4);
        llist2.insertAtBeginning(6);
        llist2.insertAtEnd(8);
        llist2.insertAfter(llist2.head.next, 10);
        llist2.printList();

        llist2.sortLinkedList(llist2.head);
        llist2.printList();
    }
}
