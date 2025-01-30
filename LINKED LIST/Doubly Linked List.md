## Insert At Beginning

```` java[]

// Step 1: create class
class Node {
    int data;
    Node next;
    Node prev;

    // Step 2: create a constructor
    Node(int data) {
        this.data = data;  // Corrected from this.data = next;
        this.next = null;
        this.prev = null;
    }
}

// Step 4:
class DoublyLinkedList {
    Node head;
    Node tail;

    // Insert at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;  // Connect the tail to the new node
            newNode.prev = tail;  // Set the previous node of the new node
            tail = newNode; // Update the tail to the new node
        }
    }

    // Display the list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("The list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " ");
            if (temp.next != null) {
                System.out.print("<-> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // Insert at the beginning of the list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }
}

// Step 3: Main class
public class Main {
    public static void main(String[] args) {
        DoublyLinkedList link = new DoublyLinkedList();
        link.insert(100);
        link.insert(200);
        link.insert(300);
        
        

        System.out.println("After insertAtBeginning:");
        link.insertAtBeginning(500);
        link.display(); // This will print 500 <-> 100 <-> 200 <-> 300
    }
}

````
