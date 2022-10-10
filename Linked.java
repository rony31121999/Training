import javax.xml.crypto.NodeSetData;

class Linked {
    //A node class for doubly linked list
    class Node{
        int item;
        Node previous;
        Node next;

        public Node(int item) {
            this.item = item;
        }
    }
    //Initially, heade and tail is set to null
    Node head, tail = null;

    //add a node to the list
    public void addNode(int item) {
        //Create a new node
        Node newNode = new Node(item);

        //if list is empty, head and tail points to newNode
        if(head == null) {
            head = tail = newNode;
            //head's previous will be null
            head.previous = null;
            //tail's next will be null
            tail.next = null;
        }
        else {
            //add newNode to the end of list. tail->next set to newNode
            tail.next = newNode;
            //newNode->previous set to tail
            newNode.previous = tail;
            //newNode becomes new tail
            tail = newNode;
            //tail's next point to null
            tail.next = null;
        }
    }

    //print all the nodes of doubly linked list
    public void printNodes() {
        //Node current will point to head
        Node i = head;

        while(i != null) {
            //Print each node and then go to next.
            System.out.print(i.item + " ");
            i = i.next;
        }
    }
}
class node13{
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        Linked rk = new Linked();
        //Add nodes to the list
        rk.addNode(10);
        rk.addNode(20);
        rk.addNode(30);
        rk.addNode(40);
        rk.addNode(50);

        //print the nodes of DoublyLinkedList
        rk.printNodes();

    }
}
