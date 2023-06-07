import java.util.Scanner;

public class problems {
    // public static int multiply(int a, int b) {
    //     int product = a * b;
    //     return product;
    // }

    // public static int factorial(int n) {
    //     int f = 1;

    //     for(int i=1; i<=n; i++) {
    //         f = f * i;
    //     }

    //     return f; //factorial of n
    // }

    // public static int binCoeff(int n, int r) {
    //     int fact_n = factorial(n);
    //     int fact_r = factorial(r);
    //     int fact_nmr = factorial(n-r);

    //     int binCoeff = fact_n / (fact_r * fact_nmr)
    //     return binCoeff;
    // }

    // public static void main(String args[]) {
    //     // Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     System.out.println(binCoeff(5, 2));
    // }
    





//FUNCTION OVERLOADING USING PARAMETERS ****

    // //func to calc sum of 2 nums
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // //func to calc sum of 3 nums
    // public static int sum(int a, int b, int c) {
    //     return a + b + c;
    // }

    // public static void main(String args[]) {
    //     System.out.println(sum(3, 5));
    //     System.out.println(sum(5, 2, 1));
    // }





//FUNCTION OVERLOADING USING DATA TYPES ****

    // //func to cal int sum
    // public static int sum(int a, int b) {
    //     return a + b;
    // }

    // //func to cal float sum
    // public static float sum(float a, float b) {
    //     return a + b;
    // }
    // public static void main(String args[]) {
    //     System.out.println(sum(3, 5));
    //     System.out.println(sum(3.2f, 4.8f));
    // }





   public static boolean isPrime(int n) {
       //corner cases
       //2
       if(n == 2) {
        return true;
       }
       boolean isPrime = true;
       for(int i=2; i<=n-1; i++) {
           if(n % i == 0) {//completely dividing
              isPrime = false;
              break;

            }
        }

       return isPrime;
    }
    public static void main(String args[]) {
        System.out.println(isPrime(2));
    }
}
 