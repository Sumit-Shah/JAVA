import java.util.*;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Heaps {
    
    // PQ in JCFf
    // public static void main(String[] args) {
    //     // PriorityQueue<Integer> pq = new PriorityQueue<>();
    //     PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());  //Reverse of Order-Descending Order


    //     pq.add(3); //0(logn)
    //     pq.add(4);
    //     pq.add(1);
    //     pq.add(7);

    //     while(!pq.isEmpty()) {
    //         System.out.println(pq.peek()); //0(1)
    //         pq.remove(); //0(logn)
    //     }


    // }





    //PQ FOR OBJECT
    // Priority Queue for Student objects
    // static class Student implements Comparable<Student> { // Overriding
    //     String name;
    //     int rank;

    //     public Student(String name, int rank) {
    //         this.name = name;
    //         this.rank = rank;
    //     }

    //     @Override
    //     public int compareTo(Student s2) {
    //         return this.rank - s2.rank;
    //     }
    // }

    // public static void main(String[] args) {
    //     PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

    //     pq.add(new Student("A", 4));
    //     pq.add(new Student("B", 5));
    //     pq.add(new Student("C", 2));
    //     pq.add(new Student("D", 12));

    //     while (!pq.isEmpty()) {
    //         System.out.println(pq.peek().name + " -> " + pq.peek().rank);
    //         pq.remove(); // O(log n)
    //     }
    // }






    //Heaps Implementatuion (CBT)
    // i 
    //left = 2i+1
    //right = 2i+2
    //child(x)--par((x-1)/2)

    //Steps
    //Add at the last index
    //fix heap : par = (x-1)/2 
    //if (child value < Parent value )


    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        public void add(int data){
            //add at last idx
            arr.add(data);

            int x = arr.size()-1; //x is child index
            int par = (x-1)/2;

            while(arr.get(x) < arr.get(par)) {  //0(logn)
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);
                
                x = par;
                par = (x-1)/2;
            }
        }

        public int peek(){
            return arr.get(0);
        }



        // Delete in Heap
        // 1.1st and last node swap
        // 2.remove last idx arr.remove(arr.size()-1)
        //3. fix my heap ==> Heapify
        //     root = i
        //     left = 2i+1 =1
        //     right 2i+2 = 2
        //   min = (i, 2i+1, 2i+2)
        //   swap with root


        private void Heapify(int i) {  //0(logn)
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                //swap
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);

                Heapify(minIdx);
            }
        }

        public int remove() {
            int data = arr.get(0);

            //step1 - swap first & last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            //step2 - delete last
            arr.remove(arr.size()-1);

            //step3 - heapify
            Heapify(0);
            return data;
        }


        public boolean isEmpty() {
            return arr.size() == 0; 
        }




    }

    public static void main(String[] args) {
        Heap h = new Heap();
        
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while(!h.isEmpty()) {  //heap sort
            System.out.println(h.peek());
            h.remove();
        }
    }

}