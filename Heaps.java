import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //Reverse of Order-Descending Order


        pq.add(3); //0(logn)
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while(!pq.isEmpty()) {
            System.out.println(pq.peek()); //0(1)
            pq.remove(); //0(logn)
        }


    }

}