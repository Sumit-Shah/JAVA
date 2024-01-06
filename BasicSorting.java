// import java.util.*;
// public class BasicSorting {
//     public static void bubbleSort(int arr[]) {
//         for(int turn=0; turn<arr.length-1; turn++) {
//             for(int j=0; j<arr.length-1-turn; j++) {
//                 if(arr[j] > arr[j+1]) {
//                     //swap
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                 }
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for(int i=0; i<arr.length; i++) {
//             System.out.print(arr[i]+" ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         bubbleSort(arr);
//         printArr(arr);
//     }
// }


//selection sort
// Idea = pick the smallest (from unsorted), put it at the begining.

// for(int i = 0 to n-2)---smallest = Max
//    for (j = i + 1 to n-1)  [min]-- Unsorted array- start.

// import java.util.*;

// public class BasicSorting {
//     public static void selectionSort(int arr[]) {
//         for (int i = 0; i < arr.length - 1; i++) {
//             int minPos = i;
//             for (int j = i + 1; j < arr.length; j++) {
//                 if (arr[minPos] > arr[j]) {  //For high to low just change the sign.
//                     minPos = j;
//                 }
//             }

//             // Swap
//             int temp = arr[minPos];
//             arr[minPos] = arr[i];
//             arr[i] = temp;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 3, 2};
//         selectionSort(arr);
//         printArr(arr);
//     }
// }






//INSERTION SORT
// inspiration - Cards(52)
// Idea - pick an element(from unsorted part) & place in the
// right pos in sorted part.

// import java.util.*;

// public class BasicSorting {
//     public static void insertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             // Finding out the correct position to store.
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // Insertion
//             arr[prev + 1] = curr;
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {5, 4, 1, 4, 20};
//         insertionSort(arr);
//         printArr(arr);
//     }
// }






// INBUILT SORT
// import java.util.Arrays;
// Arrays.sort(arr)
// 0(nlogn)   <  0(n^2)  [S,I,B]

// Arrays.sort(arr, si, ei)


// import java.util.Arrays;
// public class BasicSorting{
//     public static void insertionSort(int arr[]) { 
//         for (int i = 1; i < arr.length; i++) { 
//             int curr = arr[i]; 
//             int prev = i - 1; 
//             // Finding out the correct position to store. 
//             while (prev >= 0 && arr[prev] > curr) { 
//                 arr[prev + 1] = arr[prev]; 
//                 prev--; 
//             } 
//             // Insertion 
//             arr[prev + 1] = curr; 
//         } 
//     } 
//     public static void printArr(int arr[]) { 
//         for (int num : arr) { 
//             System.out.print(num + " "); 
//         } 
//         System.out.println(); 
//     } 
 
//     public static void main(String args[]) {
//         int arr[] = {2, 4, 3, 8, 5, 6};
//         // Arrays.sort(arr);
//         Arrays.sort(arr, 0, 3);

//         printArr(arr);
//     }
// }




// Inbuit Sort  FOR DECENDING ORDER
// import java.util.*;
// Arrays.sort(arr,Collections.reverseOrder())

// Arrays.sort(arr,si,ei,Collections.reverseOrder())

// import java.util.Arrays;
// public class BasicSorting{
//     public static void insertionSort(Integer arr[]) { 
//         for (int i = 1; i < arr.length; i++) { 
//             int curr = arr[i]; 
//             int prev = i - 1; 
//             // Finding out the correct position to store. 
//             while (prev >= 0 && arr[prev] > curr) { 
//                 arr[prev + 1] = arr[prev]; 
//                 prev--; 
//             } 
//             // Insertion 
//             arr[prev + 1] = curr; 
//         } 
//     } 
//     // public static void printArr(Integer arr[]) { 
//     //     for (Integer num : arr) { 
//     //         System.out.print(num + " "); 
//     //     } 
//     //     System.out.println(); 
//     // } 
//     public static int compare(int a, int b) {
//         // a < b -ve
//         // a == b 0
//         // a > b +ve
//         return a-b;
//     }
 
//     public static void main(String args[]) {
//         Integer arr[] = {2, 4, 3, 8, 5, 6};
//         // Arrays.sort(arr);
//         Arrays.sort(arr, 0, 3,Collections.reverseOrder());
//         printArr(arr);
//     }
// }


// import java.util.Arrays;
// import java.util.Collections;

// public class BasicSorting {
//     public static void insertionSort(Integer arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             // Finding out the correct position to store.
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // Insertion
//             arr[prev + 1] = curr;
//         }
//     }

//     public static void printArr(Integer arr[]) {
//         for (Integer num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         Integer arr[] = {2, 4, 3, 8, 5, 6};
//         Arrays.sort(arr, 0, 3, Collections.reverseOrder());
//         printArr(arr);
//     }
// }








//COUNTING SORT
// 1. for(int i = 0 to n)  frequency
// 2. for(int i = 0 to maxno. / range)


// import java.util.Arrays;
// import java.util.Collections;

// public class BasicSorting {
//     public static void insertionSort(int arr[]) {
//         for (int i = 1; i < arr.length; i++) {
//             int curr = arr[i];
//             int prev = i - 1;
//             // Finding out the correct position to store.
//             while (prev >= 0 && arr[prev] > curr) {
//                 arr[prev + 1] = arr[prev];
//                 prev--;
//             }
//             // Insertion
//             arr[prev + 1] = curr;
//         }
//     }

//     public static void countingSort(int arr[]) {
//         int largest = Integer.MIN_VALUE;
//         for (int i = 0; i < arr.length; i++) {
//             largest = Math.max(largest, arr[i]);
//         }

//         int count[] = new int[largest + 1];
//         for (int i = 0; i < arr.length; i++) {
//             count[arr[i]]++;
//         }

//         // Sorting
//         int j = 0;
//         for (int i = 0; i < count.length; i++) {
//             while (count[i] > 0) {
//                 arr[j] = i;
//                 j++;
//                 count[i]--;
//             }
//         }
//     }

//     public static void printArr(int arr[]) {
//         for (int num : arr) {
//             System.out.print(num + " ");
//         }
//         System.out.println();
//     }

//     public static void main(String args[]) {
//         int arr[] = {2, 4, 3, 8, 2, 4};
//         insertionSort(arr);
//         printArr(arr);
//     }
// }


//Basic sorting has completed,