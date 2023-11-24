// // FUNCTIONS 
// // QUESTIONSQuestion 
// // 1 :Write a Java method to compute the averageof three numbers..
// import java.util.Scanner;
// public class function {
//  public static void main(String arg[]) {
//     System.out.print("Enter the first number . : ");
//     Scanner sc = new Scanner(System.in);
//     double x = sc.nextDouble();
//     System.out.print("Enter the second number . : ");
//     double y = sc.nextDouble();
//     System.out.print("Enter the third number . : ");
//     double z = sc.nextDouble();
//     System.out.print("The average value is " + average(x , y , z) );

//  }
// public static double average(double x , double y, double z) {
//     return (x + y + z) / 3;
//  }   
// }




// Question2:
// WriteamethodnamedisEventhatacceptsanintargument.Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.Alsowriteaprogramtotestyourmethod.
// import java.util.*;
// public class function {
//    public static void main(String args[]) {
//       System.out.print("Enter a number : ");
//       Scanner sc = new Scanner(System.in);
//       int number = sc.nextInt();
//       if (isEven(number)) {
//          System.out.print(number + " IS EVEN.");

//       }
//       else {
//          System.out.print(number + " IS ODD.");
//       }
//    }
//    public static boolean isEven(int number) {
//       if (number % 2 == 0) {
//          return true;
//       }
//       else {
//          return false;
//       }
         
//    }
// }


// // Question3:
// // WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)Anumberiscalledapalindromeifthenumberisequaltothereverseofanumbere.g.,121isapalindromebecausethereverseof121is121itself.Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321.
// import java.util.*;
// public class function {
//    public static void main(String args[]) {
//       System.out.print("Enter the number. : ");
//       Scanner sc = new Scanner(System.in);
//       int palindrome = sc.nextInt();

//       if (ispalindrome(palindrome)) {
//          System.out.print(palindrome +" Is palindrome ");
//       }
//       else {
//          System.out.print(palindrome + " Is not palindrome");
//       }
//    }

//    public static boolean ispalindrome(int number) {
//       int palindrome = number;
//       int reverse = 0;

//       while (palindrome != 0) {
//          int remainder = palindrome % 10;
//          reverse = reverse * 10 + remainder;
//          palindrome = palindrome / 10;
//       }
//       //if original and the reverse of number is equal means
//       //number is palindrome in Java
//       if (number == reverse) {
//          return true;
//       }
//       return false;
//    }
// }