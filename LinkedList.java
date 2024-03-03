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
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < idx - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //REMOVE LAST
    public int removeLast() {
        if(size == 0) {
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        } else if(size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++) {
            prev = prev.next;
        }

        int val = prev.next.data; //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }



    //ITERATIVE SEARCH
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        
        while(temp != null) {
            if(temp.data == key) { //key found
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;
    }


    //RECURSIVE SEARCH
    public int helper(Node head, int key) {
        if(head == null) {
            return -1;
        }
        if(head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1) {
            return -1;
        }

        return idx+1;

    }

    public int recSearch(int key) {
        return helper(head, key);
    }






    //REVERSE A LINKED LIST
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }





    //VERY IMPORATANT QUESTION
    //FIND AND REMOVE Nth NODE FROM END
    
    public void deleteNthfromEnd(int n) {
        //calculate size.
        int sz = 0;
        Node temp = head;
         while(temp != null) {
            temp = temp.next;
            sz++;
        }

        if(n == sz) {
            head = head.next; //removeFirst
            return;
        }

        //sz-n
        int i = 1;
        int iToFind = sz-n;
        Node prev = head;
        while(i < iToFind) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
        return;

    }






    //CHECK IF LL IS PALINDROME
    //Slow-Fast Approach
    public Node findMid(Node head) { //helper
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next;//+2
            
        }

        return slow; //slow is my midNode
    }
    
    public boolean checkPalindrome(){
        if(head == null || head.next == null) {
            return true;
        }
        //step1 - find mid
        Node midNode = findMid(head);


        //step2 - reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while(curr != null) {
            next = curr.next;
             curr.next = prev;
             prev = curr;
             curr = next;
        }

        Node right = prev; //right half head
        Node left = head;

        //step3 - Check left half & right half
        while ( right != null) {
            if(left.data != right.data) {
                return false;
            }
            left = right.next;
            right = right.next;
        }

        return true;

    }
     


    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        // ll.addFirst(1);
        // ll.addFirst(2);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);


        // ll.add(2, 3);
        ll.print(); // Expected: 1-->2-->3-->4-->5-->Null

        // ll.removeFirst();
        // ll.print(); // Expected: 2-->3-->4-->5-->Null

        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println(ll.itrSearch(4));
        // System.out.println(ll.itrSearch(10));


        // System.out.println(ll.recSearch(4));
        // System.out.println(ll.recSearch(10));


        // ll.reverse();
        // ll.print();


        // ll.deleteNthfromEnd(3);
        // ll.print();



        System.out.println(ll.checkPalindrome());


    }
}