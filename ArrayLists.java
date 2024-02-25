import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;

import javax.sound.midi.Soundbank;
public class ArrayLists {


    // //SWAPPING OF TWO NUMBERS.
    // public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
    //     int temp = list.get(idx1);
    //     list.set(idx1, list.get(idx2));
    //     list.set(idx2, temp);
    // }

    public static void main(String[] args) {
        //Java Collection FrameWork 
        //ClassName objectName = new ClassName();
        // ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();


        // list.add(2); //0(1)
        // list.add(5);
        // list.add(9);
        // list.add(6);
        // list.add(8);



        // list.add(1, 9);

        // System.out.println(list);

        // //Get Operatiom - 0(1)
        // int element = list.get(2);
        // System.out.println(element);


        // //Delete
        // list.remove(2);
        // System.out.println(list);

        // //Set
        // list.set(2, 10);
        // System.out.println(list);


        // //contains
        // System.out.println(list.contains(1));
        // System.out.println(list.contains(11));



        // //SIZE OF ARRAYLIST
        // System.out.println(list.size());

        // //print the arraylist
        // for(int i=0; i<list.size(); i++) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();



        // //REVERSE PRINT -o(n)
        // for(int i=list.size()-1; i>=0; i--) {
        //     System.out.print(list.get(i) + " ");
        // }
        // System.out.println();


         
        // //MAXIMUM NUMBER
        // int max = Integer.MIN_VALUE;
        // for(int i=0; i<list.size(); i++) {
        //     // if(max <list.get(i)) {
        //     //     max = list.get(i);
        //     // }

        //     max = Math.max(max, list.get(i));
        // }

        // System.out.println("Max Element : " + max);


        //SWAPPING OF TWO NUMBERS
        // int idx1 = 2, idx2 = 4;
        // System.out.println(list);
        // swap(list, idx1, idx2);
        // System.out.println(list);




        // SORTING AN ARRAYLIST

        // //Ascending order
        // System.out.println(list);
        // Collections.sort(list);  //ASCENDING
        // System.out.println(list);

        // //Decending order
        // System.out.println(list);
        // Collections.sort(list, Collections.reverseOrder());
        // //Comparator - fnx logic
        // System.out.println(list);




        //MULTI-DIMENSIONAL ARRAYLISTS
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list1 = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();
        ArrayList<Integer>list3 = new ArrayList<>();


        for(int i=1; i<=5; i++) {
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);

        }

        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        list2.remove(3);
        list2.remove(2); 

        System.out.println(mainList);


        //nested loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<Integer>currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }






    }
    
}
