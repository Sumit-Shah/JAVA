import java.util.Stack;
import java.util.*;

public class Histogram {

    public static void maxArea(int arr[]) {
        int maxAREA = 0;
        int nsr[] = new int[arr.length];
        int nsl[] = new int[arr.length];
    
    
    
        //Next Smaller RIght 
        Stack<Integer> s = new Stack<>();
    
        for(int i=arr.length-1; i>=0; i--) {
            for(int i=arr.length-1; i>=0; i--) {
                while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                    s.pop();   
                }
                if(s.isEmpty()) {
                    nsr[i] = arr.length;
                    //-1
                } else {
                    nsr[i] = s.peek();
                    //top
                }
                s.push(i);
            }
            //Next Smaller Left
           s = new Stack<>();
    
            for(int i=arr.length-1; i>=0; i--) {
                for(int i=arr.length-1; i>=0; i--) {
                    while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
                        s.pop();   
                    }
                    if(s.isEmpty()) {
                        nsr[i] = arr.length;
                        //-1
                    } else {
                        nsr[i] = s.peek();
                        //top
                    }
                    s.push(i);
                }
        }
        
    }


    //Next Smaller Left

    //Current Area

    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 6, 2, 3}; //heights in histogram
    }
}
