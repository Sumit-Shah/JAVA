// import java.util.*;
// public class ArraysCC{
//     public static void main (String args[]) {
//         //dataType arrayname[] = new dataType[size];

//         // int marks [] = new int[50];
//         // int numbers [] = {1, 2, 3, 4, 5, 6};
//         // int moreNumbers [] = {4, 5, 6};
//         // String fruits [] = {"apple", "mango", "banana"};
//         // System.out.println(numbers);
//         // System.out.println(moreNumbers);
//         // System.out.println(fruits);


//         // TAKING ARRAY AS A INPUT FROM THE USER.
        
//         int marks []  = new int[100];

//         Scanner sc = new Scanner(System.in);

//         //int phy;
//         //phy = sc.nextInt();

//         System.out.println("length of array = " + marks.length);
//         // System.out.print("Enter physics marks : ");
//         // marks[0] = sc.nextInt();
//         // System.out.print("Enter Chemistry marks : ");
//         // marks[1] = sc.nextInt();
//         // System.out.print("Enter Biology marks : ");
//         // marks[2] = sc.nextInt();

//         // System.out.println("phy : " + marks[0]);
//         // System.out.println("chem : " + marks[1]);
//         // System.out.println("bio: " + marks[2]);

//         // int percentage = (marks[0] + marks[1] + marks[2]) / 3;
//         // System.out.println("Percentage =   " + percentage + "%");


        
//     }

// }




// PASSING ARRAYS AS ARGUMENT 
// ALWAYS BY REFRENCE NEVER PASS BY VALUE : 
// import java.util.*;
// public class ArraysCC {
//     public static void update(int marks[], int nonChangable) {
//         nonChangable = 10;
//         for(int i=0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         int nonChangable = 5;
//         update(marks, nonChangable);
//         System.out.println(nonChangable);

//         //print our marks
//         for(int i=0; i<marks.length; i++) {
//             System.out.println(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }



//LINEAR SEARCH
//Find the index of element ina given array.
// import java.util.*;
// public class ArraysCC{
//     public static int linearSearch(int[] numbers, int key) {
//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args[]) {
//         int numbers[] = {2, 4, 6, 8, 10, 12};
//         int key = 20;

//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("Not Found.");
//         } else {
//             System.out.println("Key is at index : " + index);
//         }

//     }

// }




//CORRECTED BY CHAT GPT
// import java.util.*;

// public class ArraysCC {
//     public static int linearSearch(int[] numbers, int key) {
//         for (int i = 0; i < numbers.length; i++) {
//             if (numbers[i] == key) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
//         int[] numbers = {2, 4, 6, 8, 10, 12};
//         int key = 20;

//         int index = linearSearch(numbers, key);
//         if (index == -1) {
//             System.out.println("Not Found.");
//         } else {
//             System.out.println("Key is at index: " + index);
//         }
//     }
// }









//LINEAR SEARCH  

//Find the index of element in a given array

// import java.util.*;
// //Linear Search
// public class ArraysCC {
//     public static int linearSearch(int numbers[], int key) {

//         for(int i=0; i<numbers.length; i++) {
//             if(numbers[i] == key) {
//                 return i;
//             }

//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         System.out.println("2, 4, 6, 8, 10, 12, 14, 16");
//         int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//         System.out.println("Enter a number. : ");
//         Scanner sc = new Scanner(System.in);
//         int key = sc.nextInt();

//         int index = linearSearch(numbers, key);
//         if(index == -1) {
//             System.out.println("NOT FOUND");
//         } else {
//             System.out.println("Key is at index : " + index);
//         }
//     }
// }

//In the items :
// import java.util.*;
// //Linear Search
// public class ArraysCC {
//     public static int linearSearch(String numbers[], String key) {

//         for(int i=0; i<menu.length; i++) {
//             if(menu[i].equals(key)) {
//                 return i;
//             }

//         }

//         return -1;
//     }

//     public static void main(String args[]) {
//         System.out.println("Momo, chawmin, Thukpa, Rotisabji, Coffe ");
//         String menu[] = {"Momo", "chawmin", "Thukpa", "Rotisabji", "Coffe" };
//         System.out.println("Enter a number. : ");
//         Scanner sc = new Scanner(System.in);
//         String key = sc.nextLine();

//         int index = linearSearch(menu, key);
//         if(index == -1) {
//             System.out.println("NOT FOUND");
//         } else {
//             System.out.println("Key is at index : " + index);
//         }
//     }
// }
// public static int linearSearch(String menu[], String key) {
//     for (int i = 0; i < menu.length; i++) {
//         if (menu[i].equals(key)) {
//             return i;
//         }
//     }
//     return -1;
// }

// public static int linearSearch(String menu[], String key) {
//     for (int i = 0; i < menu.length; i++) {
//         if (menu[i].equals(key)) {
//             return i;
//         }
//     }
//     return -1;
// }

// public static void main(String args[]) {
//     System.out.println("Momo, chowmein, Thukpa, Rotisabji, Coffee");
//     String menu[] = {"Momo", "chowmein", "Thukpa", "Rotisabji", "Coffee"};
//     System.out.println("Enter a menu item: ");
//     Scanner sc = new Scanner(System.in);
//     String key = sc.nextLine();

//     int index = linearSearch(menu, key);
//     if (index == -1) {
//         System.out.println("NOT FOUND");
//     } else {
//         System.out.println("Key is at index: " + index);
//     }
// }




//LINEAR SEARCH FOR THE STRING .
// import java.util.*;
// //linear Searchy
// public class ArraysCC{
//     public static string linearSearch(str items[], int key) {
//         for(int i=; i<items.length; i++) {
//             return i;
//         }
//         return -1;
//     }
//     public static void main(String args[]) {
//         str items[] = {momo, chawmin, thukpa, samosa};
//         int key = samosa;

//         int index = linearSearch(items, key);
//         if(index == -1) {
//             System.out.println("Not Found");
//         } else {
//             System.out.println("Key is at index " + index);
//         }
//     }
// }



//LARGEST NUMBER.
// import java.util.*;
// //Largest Number im Array
// public class ArraysCC {
//     public static void main(String args[]) {
//         int numbers[] = {1, 2, 3, 4, 5};
//     }

//     public static int getLargest(int numbers[]) {
//         int largest = Integer.MIN_VALUE;// -infinity

//         for(int i=0; i<numbers.length; i++){
//             if(largest < numbers[i]) {
//                 largest = numbers[i];
//             }
//         }
//         return largest;
//     }
// }






// //MAXIMUM SUB ARRAY SUM.
// //BRUTE FORCE
// import java.util.*;
// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i;j<numbers.length; j++) {
//                 int end = j;
//                 currSum = 0;
//                 for(int k=start; k<=end; k++) {
//                     //SUBARRAY SUM
//                     currSum += numbers[k];
//                 }
//                 System.out.println(currSum);
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         maxSubarraySum(numbers);
//     }
// }






//MAXIMUM SUB ARRAY SUM.
// PRIFIX SUM
// import java.util.*;
// public class ArraysCC {
//     public static void maxSubarraySum(int numbers[]) {
//         int currSum = 0;
//         int maxSum = Integer.MIN_VALUE;
//         int prefix[] = new int[numbers.length];

//         prefix[0] = numbers[0];
//         //CALCULATE  PREFIX ARRAY
//         for(int i=1; i<prefix.length; i++) {
//             prefix[i] = prefix[i-1] + numbers[i];
        
//         }

//         for(int i=0; i<numbers.length; i++) {
//             int start = i;
//             for(int j=i;j<numbers.length; j++) {
//                 int end = j;

//                 currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];
//                 if(maxSum < currSum) {
//                     maxSum = currSum;
//                 }
//             }
//         }
//         System.out.println("max sum = " + maxSum);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {2, 4, 6, 8, 10};
//         maxSubarraySum(numbers);
//     }
// }





// //KADANES ALGORITHUM.
// import java.util.*;
// public class ArraysCC {
//     public static void kadanes(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i=0; i<numbers.length; i++) {
//             cs = cs + numbers[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         System.out.println("Our max subarray sum is : " + ms);
//     }
//     public static void main(String args[]) {
//         int numbers[] = {-2, -3, 4, -1, -2, 1, 5, -3};
//         kadanes(numbers);
//     }
// }

//IF ALL THE NUMBERS IN ARRAY ARE NEGATIVE KADANES ALGORITHUM  AN PRINT LEAST NEGATIVE NUMBER INSTEAD OF ZERO .
// import java.util.*;
// public class ArraysCC{
//     public static void kadanes(int numbers[]) {
//         int ms = Integer.MIN_VALUE;
//         int cs = 0;

//         for(int i = 0; i < numbers.length; i++) {
//             cs = cs + numbers[i];
//             if(cs < 0) {
//                 cs = 0;
//             }
//             ms = Math.max(cs, ms);
//         }

//         //When all the number in Array are negative we can priint the least negative numbers .
//         if(ms == 0) {
//             Arrays.sort(numbers);
//             System.out.println("Our max subarray sum is :" + numbers[numbers.length -1]); 
//         } else {
//             System.out.println("Our max subarray sum is : " + ms);
//         }
//     }
//     public static void main(String args[]) {
//         int numbers[] = {-2, -3, -4, -1, -2, -1, -5, -3};
//         kadanes(numbers);
//     }
// }





// //TAPPING RAIN WATER - CODE 
// public class ArraysCC {
//     public static int trappedRainwater(int height[]) {
//         int n = height.length;
//         // calculate left max boundary - array
//         int leftMax[] = new int[height.length];
//         leftMax[0] = height[0];
//         for (int i = 1; i < height.length; i++) {
//             leftMax[i] = Math.max(height[i], leftMax[i - 1]);
//         }
//         // calculate right max boundary - array
//         int rightMax[] = new int[n];
//         rightMax[n - 1] = height[n - 1];
//         for (int i = n - 2; i >= 0; i--) {
//             rightMax[i] = Math.max(height[i], rightMax[i + 1]);
//         }

//         int trappedWater = 0;
//         // loop
//         for (int i = 0; i < n; i++) {
//             // water level = min(left max bound, right max bound)
//             int waterLevel = Math.min(leftMax[i], rightMax[i]);

//             // trapped water = waterLevel - height[i]
//             trappedWater += waterLevel - height[i];
//         }

//         return trappedWater; // add this line to return the trapped water
//     }

//     public static void main(String args[]) {
//         int height[] = {4, 2, 10, 6, 3, 2, 5};
//         System.out.println(trappedRainwater(height));
//     }
// }





// import java.util.*;

// public class ArraysCC {
//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for(int i=0; i<prices.length; i++) {
//             if(buyPrice , prices[i]) { //profit
//                 int profit = prices[i] - buyPrice; //today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             }else {
//                 buyPrice = prices[i];
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//     }
// }


// import java.util.*;

// public class ArraysCC {
//     public static int buyAndSellStocks(int prices[]) {
//         int buyPrice = Integer.MAX_VALUE;
//         int maxProfit = 0;

//         for (int i = 0; i < prices.length; i++) {
//             if (buyPrice < prices[i]) { // Compare using '<' instead of ','
//                 int profit = prices[i] - buyPrice; // today's profit
//                 maxProfit = Math.max(maxProfit, profit);
//             } else {
//                 buyPrice = prices[i];
//             }
//         }
//         return maxProfit; // Don't forget to return the result
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         int result = buyAndSellStocks(prices);
//         System.out.println("Maximum Profit: " + result);
//     }
// }
