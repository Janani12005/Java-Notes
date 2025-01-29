##  Insert (Creating a node)

````java[]

// Step 1: create class
class Node {
    int data;
    Node next;
    // Step 2. create an constructor
    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}
//Step 4: 
class LinkedList {
    Node head;
    Node tail;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        //newNode.next = newNode
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;// connect the tail to the new node
            tail = newNode; // update tail to the new node 
        }
    }
    //display
    public void display() {
        Node temp = head;
        while (temp != null) {  //iterate the loop is null
            System.out.println(temp.data + " "); 
            temp = temp.next;// move to the next node
        }
        // this will print all  the elements once
    }
}
// Step 3: Main class
public class Main {
    public static void main(String[] args) {  
        LinkedList link = new LinkedList(); 
        link.insert(100);
        link.insert(200);
        link.insert(300);
        link.display();// this willm print 100,200,300
    }
}

````

## Insert At beginning

```` java[]

// Step 1: create class
class Node {
    int data;
    Node next;
    // Step 2. create an constructor
    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}
//Step 4: 
class LinkedList {
    Node head;
    Node tail;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        //newNode.next = newNode
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;// connect the tail to the new node
            tail = newNode; // update tail to the new node 
        }
    }
    //display
    public void display() {
        Node temp = head;
        while (temp != null) {  //iterate the loop is null
            System.out.println(temp.data + " "); 
            temp = temp.next;// move to the next node
        }
        // this will print all  the elements once
    }

   // INSERT insertAtBeginning 
    public void insertAtBeginning(int data){
           Node newNode = new Node(data);
           newNode.next = head;
           head = newNode;
    }
}
           
// Step 3: Main class
public class Main {
    public static void main(String[] args) {  
        LinkedList link = new LinkedList(); 
        link.insert(100);
        link.insert(200);
        link.insert(300);
        System.out.println("insertAtBeginning");
        link.insertAtBeginning(500);
        link.display();// this will print 500,100,200,300
    }
}

````

##  Insert at Specific Position

````java[]

// Step 1: create class
class Node {
    int data;
    Node next;
    // Step 2. create an constructor
    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}
//Step 4: 
class LinkedList {
    Node head;
    Node tail;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        //newNode.next = newNode
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;// connect the tail to the new node
            tail = newNode; // update tail to the new node 
        }
    }
    //display
    public void display() {
        Node temp = head;
        while (temp != null) {  //iterate the loop is null
            System.out.println(temp.data + " "); 
            temp = temp.next;// move to the next node
        }
        // this will print all  the elements once
    }

   // INSERT insertAtBeginning 
    public void insertAtBeginning(int data){
           Node newNode = new Node(data);
           newNode.next = head;
           head = newNode;
    }

   // SPECIFIC POSITION
    public void insertAtSpecific(int pos,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i<pos-1;i++){
            temp= temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }   
        
    }
}
           
// Step 3: Main class
public class Main {
    public static void main(String[] args) {  
        LinkedList link = new LinkedList(); 
        link.insert(100);
        link.insert(200);
        link.insert(300);
        System.out.println("insertAtBeginning");
        link.insertAtBeginning(500);
        link.insertAtSpecific(2,250);
        link.display();// this will print 500,100,200,300
    }
}

````

## Insert At End

````java[]

// Step 1: create class
class Node {
    int data;
    Node next;
// Step 2. create an constructor
    Node(int data) {
        this.data = data;
        this.next = null;  
    }
}
//Step 4: 
class LinkedList {
    Node head;
    Node tail;
    
    public void insert(int data) {
        Node newNode = new Node(data);
        //newNode.next = newNode
        if (head == null) { 
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;// connect the tail to the new node
            tail = newNode; // update tail to the new node 
        }
    }
    //display
    public void display() {
        Node temp = head;
        while (temp != null) {  //iterate the loop is null
            System.out.println(temp.data + " "); 
            temp = temp.next;// move to the next node
        }
        // this will print all  the elements once
    }

   // INSERT AT BEGINNING 
    public void insertAtBeginning(int data){
           Node newNode = new Node(data);
           newNode.next = head;
           head = newNode;
    }

   // SPECIFIC POSITION
    public void insertAtSpecific(int pos,int data){
        Node newNode = new Node(data);
        Node temp = head;
        for (int i = 0; i<pos-1;i++){
            temp= temp.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }   
   
   
    }
}
           
// Step 3: Main class
public class Main {
    public static void main(String[] args) {  
        LinkedList link = new LinkedList(); 
        link.insert(100);
        link.insert(200);
        link.insert(300);
        System.out.println("insertAtBeginning");
        link.insertAtBeginning(500);
        link.insertAtSpecific(2,250);
        link.insert(800); // this is the keyqword to declare an element to insert at the end
        link.display();// this will print 500,100,200,300,800
    }
}

