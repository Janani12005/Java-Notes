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

## Insert At End

```` java[]

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

    // Insert at the end of the list (original method)
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

    // Insert at the end of the list (additional method with clear naming)
    public void insertAtEnd(int data) {
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

        // Inserting at the end using the original method
        link.insert(100);
        link.insert(200);
        link.insert(300);
        
        System.out.println("After inserting at the end using insertAtEnd:");
        link.insertAtEnd(400);
        link.display();  // This will print: 100 <-> 200 <-> 300 <-> 400

        // Insert at the beginning
        System.out.println("After insertAtBeginning:");
        link.insertAtBeginning(500);
        link.display(); // This will print: 500 <-> 100 <-> 200 <-> 300 <-> 400
    }
}

````

## Insert at Specific position

````java[]

// Step 1: create class
class Node {
    int data;
    Node next;
    Node prev;

    // Step 2: create a constructor
    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

// Step 4:
class DoublyLinkedList {
    Node head;
    Node tail;

    // Insert at the end of the list (original method)
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

    // Insert at the end of the list (additional method with clear naming)
    public void insertAtEnd(int data) {
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

    // Insert at a specific position in the list
    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        
        // If inserting at position 0, treat as insert at beginning
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }

        Node current = head;
        int index = 0;
        
        // Traverse to the position before the one where we want to insert
        while (current != null && index < position - 1) {
            current = current.next;
            index++;
        }

        // If current is null, position is out of bounds (greater than the size of the list)
        if (current == null) {
            System.out.println("Position is out of bounds.");
            return;
        }

        // Inserting in the middle or at the end
        Node nextNode = current.next; // This will be the node after the new node
        current.next = newNode; // Point the current node to the new node
        newNode.prev = current; // Set the new node's previous pointer to the current node
        newNode.next = nextNode; // Set the new node's next pointer to the next node
        
        // If the new node is not the last node, update the next node's previous pointer
        if (nextNode != null) {
            nextNode.prev = newNode;
        }
        
        // If we inserted at the end, update the tail
        if (newNode.next == null) {
            tail = newNode;
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

        // Inserting at the end using the original method
        link.insert(100);
        link.insert(200);
        link.insert(300);
        
        System.out.println("Original list after inserting 100, 200, 300:");
        link.display();  // This will print: 100 <-> 200 <-> 300

        // Insert at specific position
        System.out.println("After inserting 250 at position 2:");
        link.insertAtPosition(250, 2);  // Insert 250 at position 2 (between 200 and 300)
        link.display();  // This will print: 100 <-> 200 <-> 250 <-> 300

        // Insert at the beginning
        System.out.println("After inserting 50 at the beginning:");
        link.insertAtBeginning(50);
        link.display();  // This will print: 50 <-> 100 <-> 200 <-> 250 <-> 300

        // Insert at the end
        System.out.println("After inserting 400 at the end:");
        link.insertAtEnd(400);
        link.display();  // This will print: 50 <-> 100 <-> 200 <-> 250 <-> 300 <-> 400
    }
}
````



