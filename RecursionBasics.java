import java.util.Scanner;

public class RecursionBasics {

    // //DECRESASING ORDER
    // public static void printDec(int n) {
    //     if(n == 1) {
    //         System.out.println(n);
    //         return;
    //     }
    //     System.out.print(n + " ");
    //     printDec(n-1);
    // }
    
    // public static void main(String args[]) {f
    //     int n = 10;
    //     printDec(n);
    // }


    //INCREASING ORDER
    // public static void printInc(int n) {
    //     if(n == 1) {
    //         System.out.print(n+" ");
    //         return;
    //     }
    //     printInc(n-1);
    //     System.out.print(n+" ");
    // }
    // public static void main(String args[]) {
    //     int n = 10;
    //     printInc(n);
    // }






    //FACTORIAL OF A NUMBER N 
//     public static int fact(int n) {
//         if(n == 0) {
//             return 1;
//         }
//         int fnm1 = fact(n-1);
//         int fn = n * fact(n-1);
//         return fn;
//     }
//     public static void main(String args[]) {
//         int n = 5;
//         System.out.println(fact(n));
//     }







        // //SUM OF THE Nth NATURAL NUMBER.
        // public static int sum(int n) {
        //     if(n ==1) {
        //         return 1;
        //     }
        //     int su = sum(n-1);
        //     int s = n + sum(n-1);
        //     return s;

        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     System.out.print("Enter the number : ");
        //     int n = sc.nextInt();
        //     System.out.println("Sum of the first natural number is : " + sum(n));
        // 
        // }








        // //PRINT Nth FIBONACCI NUMBER.
        // public static int fib(int n) {
        //     //BASE CASE 
        //     if(n == 0 || n == 1) {
        //         return n;
        //     }

        //     int fnm1 = fib(n-1);
        //     int fnm2 = fib(n-2);
        //     int fn = fnm1 + fnm2;
        //     return fn;
        // }

        // public static void main(String args[]) {
        //     System.out.print("Enter the number for the Fibonacci : ");
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     System.out.print("Finonacci of the Nth number is : " + fib(n));
        // }







        // //CHECK IF A GIVEN ARRAY IS SORTED OR NOT
        // public static boolean isSorted(int arr[], int i) {
        //     if(i ==arr.length-1) {
        //         return true;
        //     }

        //     if(arr[i] > arr[i+1]) {
        //         return false;
        //     }
        //     return isSorted(arr, i+1);

        // }
        // public static void main(String[] args) {
        //     int arr[] = {1, 2, 3, 4, 5  };
        //     System.out.println(isSorted(arr, 0));
        // }




        // //WFA to find the first occurence of element in an array
        // public static int firstOccurence(int arr[], int key, int i) {
        //     if(i == arr.length) {
        //         return -1;
        //     }
        //     if(arr[i] == key) {
        //         return i;
        //     }
        //     return firstOccurence(arr, key, i+1);
        // }
        // public static void main(String[] args) {
        //     int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        //     System.out.println(firstOccurence(arr, 5, 0));
        // }





        //WFA to find the last occurence of an element in an array
        // public static int lastOccurence(int arr[], int key, int i) {
        //     if(i == arr.length) {
        //         return -1;
        //     }
        //     int isFound = lastOccurence(arr, key, i+1);
        //     if(isFound == -1 && arr[i] == key) {
        //         return i;
        //     }

        //     return isFound;
        // }

        // public static void main(String[] args) {
        //     int arr[] = {8, 3, 6, 9, 5, 10, 2, 5, 3};
        //     System.out.println(lastOccurence(arr, 5, 0));
        // }








        //PRINT x TO THE POWER N
        // public static int power(int x, int n) {
        //     if(n == 0) {
        //         return 1;
        //     }
        //     int xnm1 = power(x, n-1);
        //     int xn = x * xnm1;
        //     return xn;

        //     // return x  *  power(x, n-1);
        // }
        // public static void main(String [] args) {
        //     System.out.println(power(2, 10));

        // }




        // public class PowerCalculator {

        //     public static int power(int x, int n) {
        //         if (n == 0) {
        //             return 1;
        //         } else {
        //             return x * power(x, n - 1);
        //         }
        //     }
        
        //     public static void main(String[] args) {
        //         System.out.println(power(2, 10));
        //     }
        // }







        //TILING PROBLEMS
        // public static int tilingProblem(int n) {
        //     //base case
        //     if(n == 0 || n == 1) {
        //         return 1;
        //     }

        //     //kam
        //     //vertical choice 
        //     int fnm1 = tilingProblem(n-1);

        //     //Horizontal choice
        //     int fnm2 = tilingProblem(n-2);

        //     int totWays = fnm1 + fnm2;
        //     return totWays;
        // }
        // public static void main(String args[]) {
        //     System.out.println(tilingProblem(5));

        // }

        // public static void removeDuplicates(String str, int idx, StringBuilder newStr, boolean map[]) {
        //     if(idx == str.length()) {
        //         System.out.println(newStr);
        //         return;
        //     }

        //     //kaam
        //     char currChar = str.charAt(idx);
        //     if(map[currChar-'a'] == true) {
        //         //duplicate
        //         removeDuplicates(str, idx+1, newStr, map);
        //     } else {
        //         map[currChar-'a'] = true;   
        //         removeDuplicates(str, idx+1, newStr.append(currChar), map);
        //     }
        // }

        // public static void main(String[] args){
        //     String str = "Suumiit";
        //     removeDuplicates(str, 0, new StringBuilder(""), new boolean[26]);
        // }







        //FRIENDS PAIRING PROBLEM
        // public static int friendsPairing(int n){
        //     if(n == 1 || n == 2) {
        //         return n;
        //     }
        //     //choice

        //     // //single
        //     // int fnm1 = friendsPairing(n-1);

        //     // //pair
        //     // int fnm2 = friendsPairing(n-2);
        //     // int pairWays = (n-1) * fnm2;

        //     // //totWays
        //     // int totWays = fnm1 + pairWays;
        //     // return totWays;

        //     return friendsPairing(n-1) + (n-1) * friendsPairing(n-2);
        // }
        // public static void main(String[] args) {
        //     Scanner sc = new Scanner(System.in);
        //     int n = sc.nextInt();
        //     System.out.println(friendsPairing(n));
        // }









        //IMPORTANT
        //BINARY STRINGS PROBLEM
        //PRINT ALL BINARY STRINGS OF SIZE N WITHOUT CONSECUTIVE ONES.
        public static void printBinStrings(int n, int lastPlace, String str) {
            //base case
            if(n == 0) {
                System.out.println(str);
                return;
            }

            //kamm
            printBinStrings(n-1, 0, str+"0");

            if(lastPlace == 0) {
                printBinStrings(n-1, 1, str+"1");
            }
        }
        public static void main(String[] args) {
            printBinStrings(3, 0, "");
            
        }


 
        
        

}