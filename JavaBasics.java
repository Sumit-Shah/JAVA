// public class JavaBasics {
//     public static void main(String args[]) {
//         //System.out.print(" 1 2 3 4 5 ");
//     }
// }
//boiller plate code 



// public class JavaBasics{
//     public static void main(String args[]){
//         int a = 10;
//         int b = 20;
//         System.out.println(a);
//         System.out.println(b);
//         System.out.println(a+b);
//         String name = "Sumit Shah";
//         System.out.println(name); 

//         a = 100;
//         System.out.println(a);
//         b = a;
//         System.out.println(b);

//     }
// }



// public class JavaBasics{
//     public static void main(String arg[]) {
//         float a = 5;
//         float b = 10;
//         float sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // String input = sc.next();
//         // System.out.println(input);

//         // String name = sc.nextLine();
//         // System.out.println(name);
        

//         // int number = sc.nextInt();
//         // System.out.println(number);

//         int number = sc.nextInt();
//         System.out.println(number);

//     }
// }


// import java.util.*;
// public class JavaBasics {
//     public static void main(String srgs[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = a + b;
//         System.out.println(sum);
//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         Scanner sc = new Scanner(System.in);
//         Float a = sc.nextFloat();
//         Float b = sc.nextFloat();
//         Float product = a * b;
//         System.out.println(product);

//     }
// }

// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Float a = sc.nextFloat();
//         Float b = sc.nextFloat();
//         Float difference = a - b;
//         System.out.print(difference);
//     }
// }



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float radius = sc.nextFloat();
//         float area = 3.14f*radius*radius*radius;
//         System.out.println(area);

//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         float a = 20.54f;
//         int b = (int)a;
//         System.out.println(b);

//     }
// }


//TYPE PROMOTION IN EXPRESSIONS
/*1. Java autmatically promotes each byte, short, or char operad to int
 * when ecaluating an expression.
 * 2. If one operand is long, float or double the whole expression is 
 * promoted to long, float, or double respectively.
 * 
 */
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int a = 10;
//         float b = 20.22f;
//         long c = 25;
//         double d = 30;
//         double ans = a + b + c + d;
//         System.out.println(ans);

//     }
// }


//VARIABLES & DATA TYPES QUESTIONS

/*Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.
(Hint : Average of N numbers is sum of those numbers divided by N) */
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int c = sc.nextInt();
//         int d = a + b + c;
//         System.out.println(d);
//     }
// }


/* /Question2:Inaprogram,inputthesideofasquare.Youhavetooutputtheareaofthesquare.(Hint : area of a square is (side x side)*/
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Float length = sc.nextFloat();
//         Float breath = sc.nextFloat();
//         Float Area = length * breath;
//         System.out.print(Area);
//     }
// }

/*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
 */
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         Float first_item = sc.nextFloat();
//         Float second_item = sc.nextFloat();
//         Float third_item = sc.nextFloat();
//         Float Total = first_item + second_item + third_item;
//         Float Discount_Amount = (0.18f*Total) + Total;
//         System.out.println("Total Bill Amount = " + Total);
//         System.out.println("Amount need to be paid = " + Discount_Amount);
//     }
// }

/*Question 4: What will be the type of result in the following Java code?
 */
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         byte b = 4;
//         char c = 'a';
//         short s = 512;
//         int i = 1000;
//         float f = 3.14f
//     }
// }

//Arithmetoc Operators
/*
 * Increment =  (++a - preincrement ), (a++-postincrement)
 * pre-increment Change then used.  
 * post-increment Use than Chanage 
 */
// public class JavaBasics{
//     public static void main(String args[]){
//         // int a = 10;
//         // int b = ++a;
//         // System.out.println(a);
//         // System.out.println(b);
//         int a = 10;
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }

//ASSIGNMENT OPERATORS
// public class JavaBasics{
//     public static void main(String args[]){
//         int A = 10;
//         //A += 10;
//         //A -= 10;
//         //A *= A;
//         //A /= A;
//         A %= A;
//         System.out.println(A);
//     }
// }






// IF ELSE CONDITION .
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         // int age = 23;
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >= 18) {
//             System.out.println("adult : Drive and Vote.");
//         }

//         if(age > 11 && age < 18) {
//             System.out.println("Teenager.");
//         }
//         else {
//             System.out.println("Can not drive or vote.");
//         }
//     }
// }


//GREATEST NUMBER AMONG TWO NUMBERS.
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]) {
//         System.out.println("Enter two numbers.");
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         if (A >= B){
//             System.out.println("A is gratest number.");
//         } else {
//             System.out.println("B is greatest number. ");
//         }

//     }
// }


// //ODD OR EVEN NUMBERS .
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]) { 
//         System.out.println("Enter number. ")   
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number % 2 == 0) {
//             System.out.println("Even");
//         }else {
//             System.out.print("Odd");
//         }
//     }

// }


//INCOME TAX CALCULATOR
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]) {
//         // System.out.println("Enter your income.");
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000){
//             tax = 0;
//         } 
//         else if(income >= 500000 && income < 1000000) {
//             tax = (int) (income * 0.2);
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }

//         System.out.println("Your tax is : " + tax);
//     }
// }


// import java.util.*;
// public class JavaBasics{
//     public static void main(String arg[]){
//         int A = 1;
//         int B = 3;
//         int C = 6;
//         if ( (A>=B) && (A>=C)) {
//            System.out.println("A");
//         }
//         else if (B >= C) {
//             System.out.println("B");
//         }
//         else {
//             System.out.println("C");
//         }
//     }
// }





// //TERNARY OPERATORS
// import java.util.*;
// public class JavaBasics{
//     public static void main(String agrs[]) {
//     Scanner sc = new Scanner(System.in);
//     int number = sc.nextInt();
//     //TERNARY OPERATORS
//     String type = ((number%2) == 0) ? "EVEN" : "ODD";
//     System.out.println(type);
//     }
// }

//MARKSHEET
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int marks = sc.nextInt();
//         String report = marks >= 33 ? "PASS" : "FAIL";
//         System.out.println(report);

//     }
// }



//SWITCH STATEMENTS
// import java.util.Scanner;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         switch(number) {
//             case 1 : System.out.println("Samosa");
//             break;
//             case 2 : System.out.println("Burger");
//             break;
//             case 3 : System.out.println("Mango Shake");
//             break;
//             default : System.out.println("Wake up");
//         }
//     }
// }

// //CALCULATOR 
// import java.util.*;
// public class JavaBasics {
//     public static void main(String agrs[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         char operator = sc.next().charAt(0);

//         switch(operator) {
//             case '+' : System.out.println(a + b);
//             break;
//             case '-' : System.out.println(a - b);
//             break;
//             case '*' : System.out.println(a * b);
//             break;
//             case '/' : System.out.println(a / b);
//             break;
//             case '%' : System.out.println(a % b);
//             break;
//             default : System.out.println("Wrong Operator.");
//         }

//     }
// }









//LOOPS IN JAVA .
//while loops
//PRINTING JAY SHREE RAM 1000 TIMES .
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 0;
//         while(counter < 1000) {
//             System.out.println("Jay Shree Ram");
//             counter++;
//         }
//         System.out.println("Printed 1000x");
//     }
// }


//PRINT 1 TO 10 .
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 100) {
//             System.out.print(counter+ " ");
//             counter++;
//         }
//     }
// }

//Taking input from the user and printing the numbers.
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.print("Enter the range : ");
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         int counter = 1;

//         while(counter <= range) {
//             System.out.print(counter + " ");
//             counter++;
//         }
//         System.out.println();
//     }
// }


//Print sum of natural numbers .
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.print("Enter the number for sum : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt(); 
//         int sum = 0;

//         int i = 1;
//         while(i <= n) {
//             sum += i;
//             i++;
//         }
//         System.out.println("The sum is : " + sum);
//     }
// }



// FOR LOOP 
// for(initialisation; condition; updation){
//     //do something
// }
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=10; i++) {
//             System.out.println("Jay SHreee Ram");
//         }
//     }
// }



// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]) {
//         // System.out.print("Number of stars want  to get printed.");
//         // Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();
//         // for(int i=1; i<=n; i++){
//         //     System.out.println("******");
//         // }
//         //// While loop 
//         int line = 1;
//         while(line <= 4) {
//             System.out.println("****");
//             line++;
//         }

//     }
// }


//PRINT REVERSE NUMBER .
// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         int n = 981825730;

//         while( n > 0 ) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit + " ");
//             n = n / 10; //n/=10
//         }
//         System.out.println();
//     }
// }


//REVERSE THE GIVEN NUMBER
// import java.util.*;
// public class JavaBasics{
//     public static void main( String args[]) {
//         System.out.print("Enter the number you want to reverse : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int rev = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev * 10) + lastDigit;
//             n = n / 10;
//         }
//         System.out.println(rev);
//     }
// }



//DO WHILE LOOP
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 1;
//         do {
//             System.out.println("Jay Shree RAM");
//             counter++;
//         }while(counter <= 10);
//     }

// }

// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=100; i++) {
//             if(i == 50) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of loop.");
//     }
// }

// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter your number : ");
//             int n = sc.nextInt();

//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }

// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=100; i++) {
//             if(i % 10 == 0) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }

//CONTINUE KEYWORD USE.
// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Enter the number : ");
//             int n = sc.nextInt();

//             if(n % 10 ==0) {
//                 continue;
//             }

//             System.out.println("number was : " + n);
//         }while(true);
//     }
// }