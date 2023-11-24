// public class Test {
//     public static void main(String[] args){
//         int x = 2, y = 5;

//         int exp1 = (x + y / x);
//         int exp2 = (x * (y / x));

//         System.out.print(exp1 + " , ");
//         System.out.print(exp2);
//     }
// }



// public class Test {
//     public static void main(String[] args) {
//         int x  = 200, y = 50, z = 100;
//         if(x > y && y> z) {
//             System.out.println("Java");
//         }
//         if(z > y && z < x) {
//             System.out.println("Java");
//         }
//         if((y+200) < x && (y+150) < z) {
//             System.out.println("Hellow Java");
//         }

//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         int x, y, z;
//         x = y = z = 2;
        
//     }
// }







// //CONDITIONAL STATEMENT QUESTION 

// //NUMBER IS POSITIVE OR NEGATIVE.
//Question1:WriteaJavaprogramtogetanumberfromtheuserandprintwhetheritispositive or negative
// import java.util.*;
// public class Test{
//     public static void main(String arg[]) {
//         System.out.println("Eneter the number.");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
        
//         if (number > 0) {
//             System.out.println("Number is positive.");
//         } else {
//             System.out.println("Number is Negative.");
//         }
//     } 
// }

// import java.util.*;
// public class Test{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         double temperature = sc.nextDouble();
        
//         if (temperature > 100){
//             System.out.println("patient have fiver");
//         } else {
//             System.out.println("Patient do not have fiver");
//         }
        
//     }
// }







//LOOPS QUESTIONS
// Question 1 :How many times 'Hello' is printed?
// import java.util.*;
// public class Test {
//     public static void main(String agrs[]){
//         for(int i=0; i<20; i++) {
//             System.out.println("Jay Shree Ram");
//             i+=2;
//         }
//     }
// }
//
//

//Question2:Writeaprogramthatreadsasetofintegers,andthenprintsthesumoftheeven and odd integers.
// import java.util.*;
// public class Test{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         // int n = sc.nextInt();  

//         // if (n % 2 == 0) {
//         // System.out.println("Number is Even .");
//         // }
//         // else {
//         //     System.out.println("NUmber is odd.");
//
//         // }
//         int number;
//         int choice;
//         int evenSum = 0;
//         int oddSum = 0;
//         do {
//             System.out.print("Enter the number : ");
//             number = sc.nextInt();
//
//             if(number % 2 ==0) {
//                 evenSum += number;
//             } else {
//                 oddSum += number;
//             }
//             System.out.print("press 1 to continue .");
//             choice = sc.nextInt();
//         }while(choice==1);
//         System.out.println("Sum of the even nmbers : " + evenSum);
//         System.out.println("Sum of odd number : " + oddSum);
//     }
// }
//

//
//Question 3 :Write a program to find the factorialof any number entered by the user.
//(Hint:factorialofanumbern=n*(n-1)*(n-2)*(n-3)*......*1andexistsforpositivenumbersonly. We write factorial as n!So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)
// import java.util.Scanner;
// public class Test{
//     public static void main(String [] args){
//         System.out.print("Enter any positive number. :");
//         Scanner sc = new Scanner(System.in);
//          int num = sc.nextInt();
//          int fact = 1;

//          for(int i=1; i<=num; i++) {
//             fact *= i;
//          }
//          System.out.println(fact);
//     }
// }
//
//
//Question4:WriteaprogramtoprintthemultiplicationtableofanumberN,enteredbytheuser
// import java.util.*;
// class Test{
//     public static void main(String args[]) {
//         System.out.print("Enter the number : ");
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         for(int i=1; i<=10; i++) {
//             System.out.println(n + " * " + i + " = " + n*i);
//         }
//     }
// }