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



}