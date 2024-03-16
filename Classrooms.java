import java.util.LinkedList; //JCF ->optimize
import java.util.Stack;
public class Classrooms {

    // public static boolean isValid(String str) {   //O(n)
    //     Stack<Character> S = new Stack<>();

    //     for(int i=0; i<str.length(); i++) {
    //         char ch = str.charAt(i);

    //         if(ch == '(' || ch == '{' || ch == '[') { //Opening
    //             S.push(ch);
    //         } else {
    //             //closing
    //             if(S.isEmpty()) {
    //                 return false;
    //             }
    //             if( (S.peek() == '(' && ch == ')')  //()
    //                 || (S.peek() == '{' && ch == '}') //{} 
    //                 || (S.peek() == '[' && ch == ']')) { // []
    //                     S.pop();

    //             } else {
    //                 return false;
    //             }

    //         }
    //     }

    //     if(S.isEmpty()) {
    //         return true;
    //     } else {
    //         return false;
    //     }
    // }





    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);


            //closing
            if(ch == ')') {
                int count = 0;
                while(s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if(count < 1) {
                    return true; //duplicate
                } else {
                    s.pop(); //opening pair 
                }
            } else {
                //opening
                s.push(ch);
            }
        }

        return false;
    }

     public static void main(String[] args) {
        // //Create -
        // LinkedList<Integer> ll = new LinkedList<>();

        // //add
        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addFirst(0);
        // //0->1->2
        // System.out.println(ll);

        // //remove
        // ll.removeLast();
        // ll.removeFirst(); 
        // System.out.println(ll);






        //Next greater element Code   
        
        
        //next Greater Right -----O(n)
        // int arr[] = {6, 8, 0, 1, 3};  
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr. length];

        // for(int i= arr.length-1; i>=0; i--) {
        //     //1 While
        //     while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //         s.pop();
        //     }
       // 
        //     //2 if-else
        //     if(s.isEmpty()) {
        //         nxtGreater[i] = -1;
        //     } else {
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     //3 push in s
        //     s.push(i);
        // }

        // for(int i=0; i<nxtGreater.length; i++) {
        //     System.out.print(nxtGreater[i]+" ");
        // }
        // System.out.println();





        // //next Greater Left
        // int arr[] = {6, 8, 0, 1, 3};  
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr. length];

        // for(int i=0 ; i>=arr.length-1; i--) {
        //     //1 While
        //     while (!s.isEmpty() && arr[s.peek()] <= arr[i]) {
        //         s.pop();
        //     }
            
        //     //2 if-else
        //     if(s.isEmpty()) {
        //         nxtGreater[i] = -1;
        //     } else {
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     //3 push in s
        //     s.push(i);
        // }

        // for(int i=0; i<nxtGreater.length; i++) {
        //     System.out.print(nxtGreater[i]+" ");
        // }
        // System.out.println();





        // //next Smaller Right 
        // int arr[] = {6, 8, 0, 1, 3};  
        // Stack<Integer> s = new Stack<>();
        // int nxtGreater[] = new int[arr. length];

        // for(int i= arr.length-1; i>=0; i--) {
        //     //1 While
        //     while (!s.isEmpty() && arr[s.peek()] >= arr[i]) {
        //         s.pop();
        //     }
            
        //     //2 if-else
        //     if(s.isEmpty()) {
        //         nxtGreater[i] = -1;
        //     } else {
        //         nxtGreater[i] = arr[s.peek()];
        //     }

        //     //3 push in s
        //     s.push(i);
        // }

        // for(int i=0; i<nxtGreater.length; i++) {
        //     System.out.print(nxtGreater[i]+" ");
        // }
        // System.out.println();


        // //next Smaller Left








        // //WALID PARENTHESES CODE 
        // String str = "(({}) "; //true
        // System.out.println(isValid(str));








        // #### 
        // Duplicate Parentheses Code 
        String str = "((a+b))"; //true
        String str1 = "(a-b)"; //false
        System.out.println(isDuplicate(str));
        System.out.println(isDuplicate(str1));





    }
    
}
