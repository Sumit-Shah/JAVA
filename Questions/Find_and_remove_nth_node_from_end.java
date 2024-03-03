// package Questions;

// import java.util.LinkedList;

// public class Find_and_remove_nth_node_from_end {
//     public void deleteNthfromEnd(int n) {
//         int sz = 0;
//         Node temp = head;
//          while(temp != null) {
//             temp = temp.next;
//             sz++;
//         }

//         if(n == sz) {
//             head = head.next; //removeFirst
//             return;
//         }

//         //sz-n
//         int i = 1;
//         int iToFind = sz-n;
//         Node prev = head;
//         while(i < iToFind) {
//             prev = prev.next;
//             i++;
//         }

//         prev.next = prev.next.next;
//         return;

//     }
    

    


//     public static void main(String[] args) {
//         LinkedList ll = new LinkedList<>();
//         ll.addFirst(2);
//         ll.addFirst(1);
//         ll.addLast(4);
//         ll.add(2, 3);

//         ll.print();
//         ll.deleteNthfromEnd(3);
//         ll.print();
//     }
    
// }
 