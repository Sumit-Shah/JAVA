// import java.util.Scanner;
// public class Power {
//     public static int optimizedPower(int a, int n) { //0(n)
//         if(n == 0) {
//             return 1;

//         }
//         int halfPower = optimizedPower(a, n/2);
//         int halfPowerSq = halfPower * halfPower;


//         //n is odd
//         if(n % 2 != 0) {
//             halfPowerSq = a * halfPowerSq;
//         }

//         return halfPowerSq;
//     }
//     public static void main(String [] args) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int n = sc.nextInt();
//         System.out.println(optimizedPower(a, n));

//     }
// }
