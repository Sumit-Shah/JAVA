public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;


    public void addFirst(int data) {

        // //step1 = create new node
        // Node newNode = new Node(data);

        // //step2 = newNode next = head
        // newNode.next = new Node(data);

        // //step3 - head = newNode
        // head = newNode;


        //Only 1 node
        //step1 = create new node
         Node newNode = new Node(data);
         size++;
         if(head == null) {
            head = tail = newNode;
            return;
         }

        //step2 = newNode next = head
        newNode.next = new Node(data);

        //step3 - head = newNode
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if(head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }


    //PRINTING THE LINKED LIST
    public void print() { //O(n)
        // if(head == null){
        //     System.out.println("LL is empty.");
        //     return;
        // }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data+"-->");
            temp = temp.next;           
        }
        System.out.println("Null");
    }

    public void add(int idx, int data) {
        //For first
        if(idx == 0) {
            addFirst(data);
            return;
        }


        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idex-1; temp -> prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

      

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast(5);

        ll.add(2, 3);

        ll.print(); //1->

    }
}
