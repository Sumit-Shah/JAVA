// import java.util.*;

// public class JavaBasics {
//     public static void main(String args[]) {
//         // Scanner sc = new Scanner(System.in);
//         // String input = sc.next();
//         // System.out.println(input);
//         // int a = 10;
//         // int b = 5;
//         // int sum = a + b;
//         // System.out.println(sum);




//         // Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int product = a * b;
//         // System.out.println(product);




//         //  Scanner sc = new Scanner(System.in);
//         // int a = sc.nextInt();
//         // int b = sc.nextInt();
//         // int divide = a / b;
//         // System.out.println(divide);





//         //  Scanner sc = new Scanner(System.in);
//         //  float rad = sc.nextFloat();
//         //  float area = 3.14f * rad * rad;        System.out.println(area);



//         //TYPE CASTING
//         // Scanner sc = new Scanner(System.in);
//         // float a = 25.12f;
//         // int b = (int) a;
//         // System.out.println(b);


//         int a = 10;
//         float b = 20.25f;
//         long c = 25;
//         double d = 30;
//         double ans = a + b + c + d;
//         System.out.println(ans);
        
//     }
// }  



// import java.util.*;

// public class JavaBasics {
//     public static void main(String arg[]) {
//         int A = 10;
//         int B = 5;
//         System.out.println("add = " + (A+B));
//         System.out.println("sub = " + (A-B));
//         System.out.println("multi = " + (A*B));
//         System.out.println("divide = " + (A/B));
// //         System.out.println("modulo(remainder) = " + (A%B));
        
//     }
// }

// import java.util.*;
// public class JavaBasics {
//     public  static void main(String args[]) {
//         int A = 10;
//         int B = 1;
//         System.out.println(A < B);

//     }
// }


// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         System.out.println(!(2>4));
//     }
// }



// import java.util.*;
// public class JavaBasics{ 
//     public static void main(String args[]) {
//         // int A = 10;
//         // // A = A + 20;
//         // A += 20;
//         // int B = 5;
//         // B = B - 5;
//         // // B -= 5;
//         // System.out.println(B);
//         int C = 10;
//         C %= 10; //C = C * 10
//         System.out.println(C);
//     }
// }





// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age >= 18) {
//             System.out.println("Adult : Drive and Vote");
//         }
//         if(age > 13 && age < 18) {
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Not Adult");
//         }
//     }
// }




// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();

//         if(A >= B) {
//             System.out.println("A is largest than B");
//         }
//         else {
//             System.out.println("B is greater than A");
//         }
//     }
// }





// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         if(number % 2 == 0) {
//             System.out.println("EVEN");
//         } else {
//             System.out.println("ODD");
//         }
//     }
// }



// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();

//         if(age >= 18) {
//             System.out.println("Adult");
//         }
//         else if(age >= 13 && age < 18) {
//             System.out.println("Teenager");
//         }
//         else {
//             System.out.println("Child");
//         }

//     }
// }






// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int income = sc.nextInt();
//         int tax;

//         if(income < 500000) {
//             tax = 0;
//         }
//         else if(income >= 500000 && income < 1000000) {
//             tax = (int) (income * 0.2);
//         }
//         else {
//             tax = (int) (income * 0.3);
//         }
//         System.out.println("Tax: " + tax);
//     }
// }






// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int A = sc.nextInt();
//         int B = sc.nextInt();
//         int C = sc.nextInt();

//         if( (A >= B) && (A >= C)) {
//             System.out.println("A is largest.");
//         }
//         else if(B >= C) {
//             System.out.println("B is largest");
//         }
//         else {
//             System.out.println("C is Largest.");
//         }
//     }
// }






// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a number : ");
//         int number = sc.nextInt();

//         //Ternary Operator
//         String type = ((number%2) == 0) ? "Even" : "Odd";
//         System.out.println(type);
//     }
// }

// import java.util.Scanner;

// import javax.sound.midi.Soundbank;

// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your marks : ");
//         int marks = sc.nextInt();

//         //Ternary Operators
//         String reportCard = marks >= 33 ? "PASS" : "FAILL";
//         System.out.println(reportCard);

//     }
// }






// import java.util.*;
// public class JavaBasics{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter a button : ");
//         int button = sc.nextInt();

//         switch(button) {
//             case 1 : System.out.println("Samosa");
//                        break;
//             case 2 : System.out.println("Burger");            
//                        break;
//             case 3 : System.out.println("Mangoes");
//                        break;
//             default : System.out.println("We wake up");
//         }
//     }
// }


// import java.util.*;

// import javax.sound.midi.Soundbank;
// public class JavaBasics {
//     public static void main(String args[]) {
//        Scanner sc = new Scanner(System.in); 
//        System.out.println("Enter a : ");
//        int a = sc.nextInt();
//        System.out.println("Enter b : ");
//        int b = sc.nextInt();
//        System.out.println("Enter an operator : ");
//        char operator = sc.next().charAt(0);

//        switch(operator) {
//         case '+' : System.out.println(a+b);
//                      break;
//         case '-' : System.out.println(a-b);
//                      break;
//         case '*' : System.out.println(a*b);
//                      break;
//         case '/' : System.out.println(a/b);
//                       break;
//         default : System.out.println("Wrong operator");
//        }

//     }

// }







// import java.util.*;
// public class JavaBasics {
//     public static void main(String argsp[]) {
//         int counter = 0;
//         while(counter < 5) {
//             System.out.println("Hello World");
//             counter++;
//         }

//         System.out.println("Printed ");
//     }
// }




// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 1;
//         while(counter <= 100) {
//             System.out.print(counter+" ");
//             counter++;
//         }
//         System.out.println();
//     }
// }



// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int range = sc.nextInt();
//         System.out.println("Enter a number : ");
//         int counter = 1;

//         while(counter <= range) {
//             System.out.println(counter + " ");
//             counter++;

//         }
//         System.out.println();
//     }
// }





//  //FOR LOOP
//  import java.util.*;
//  public class JavaBasics {
//     public static void main(String args[]) {
//         // int i=1;
//         // for(int i=1; i<=4; i++) {
//         //     System.out.println("****");

//         // }     
        
//         int line = 1;
//         while(line <= 4) {
//             System.out.println("****");
//             line++;
//         }
//     }
//  }


// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 98182;

//         while( n > 0 ) {
//             int lastDigit = n % 10;
//             System.out.print(lastDigit);
//             n = n / 10; //n/=10
//         }
//         System.out.println();
//     }
// }




// public class JavaBasics {
//     public static void main(String args[]) {
//         int n = 10899;
//         int rev = 0;

//         while(n > 0) {
//             int lastDigit = n % 10;
//             rev = (rev*10) + lastDigit;
//             n = n/10;
//         }

//         System.out.println(rev);
//     }
// }





// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         int counter = 1;
//         do {
//             System.out.println("Hello World");
//             counter++;
//         } while(counter <= 10);
//     }
// }





// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         for(int i=1; i<=5; i++) {
//             if(i == 3) {
//                 break;
//             }
//             System.out.println(i);

//         }

//         System.out.println("I am oput of the loop");
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
//     public static void main(String args []) {
//         for(int i=1; i<=5; i++) {
//             if(i == 3) {
//                 continue;
//             }
//             System.out.println(i);
//         }
//     }
// }




// import java.util.*;
// public class JavaBasics; {
//     public static void main(String args []) {
//         Scanner sc = new Scanner(System.in);

//         do {
//             System.out.print("Entrer your number : ");
//             int n = sc.nextInt();
            
//             if(n % 10 == 0) {
//                 continue;
//             }

//             System.out.println("Number was : " + n);

//         }while(true);
//     }
// }




// import java.util.*;
// public class JavaBasics {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();


//     if(n == 2){
//         System.out.println("n is prime");
//     } else {
        
//         boolean isPrime = true;
//         for(int i=2; i<=Math.sqrt(n); i++) {
//             if(n % i == 0) { // n is a multiple of i (i not equal to 1 or n)
//                 isPrime = false;
//             }
//         }

//         if(isPrime == true) {
//             System.out.println("n is prime");
//         } else {
//             System.out.println("n is not a prime number.");
//         }
        
//     }


//     }

// }





  // public static int calculateSum(int num1, int num2) {
    //     int sum = num1 + num2;
    //     return sum;
    // }
    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int sum = calculateSum(a, b);
    //     System.out.println("sum is : " + sum);

        
    // }




    // public static void swap(int a, int b) {
    //           //swap
    //           int temp = a;
    //           a = b;
    //           b = temp;
      
    //           System.out.println("a = " + a);
    //           System.out.println("b = " + b);
    // }
    // public static void main(String args[]) {
    //     //swap - value exchage
    //     int a = 5;
    //     int b = 10;
    //     swap(a,b);


  
    // }





    // //PRODUCT OF A AND B.
    // public static int multiply(int a, int b) {
    //     int product = a * b ;
    //     return product;
    // }


    // public static void main(String args[]) {
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     int prod = multiply(a,b);
    //     System.out.println("a * b = " + prod);
    // }




    
