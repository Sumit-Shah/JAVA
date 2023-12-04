import java.security.PublicKey;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class BitManipulation {
    // public static void oddOrEven(int n ) {
    //     int bitMask = 1;
    //     if((n & bitMask) == 0) {
    //         //even number
    //         System.out.println("Even number.");
    //     } else {
    //         System.out.println("Odd Number. ");
    //     }

    // }
    // public static void main(String args[]) {
    //     oddOrEven(10);
    //     oddOrEven(2);
    //     oddOrEven(3);

    // }




    //OPERATIONS
    //1.GET iTH BIT
    // public static int getIthBIt(int n, int i) {
    //     int bitMask = 1<<i;
    //     if((n & bitMask) == 0) {
    //         return 0;
    //     } else {
    //         return 1;
    //     }

    // }
    // public static void main(String args[]) {
    //     System.out.println(getIthBIt(10, 3));
    // }


    //2.SET iTH BIT
    // public static  int setIthBit(int n, int i) {
    //     int bitMask = 1<<i;
    //     return n | bitMask;

    // }
    // public static void main(String args[]) {
    //     System.out.println(setIthBit(10, 2));
    // }

    // 3.CLEAR iTH BIT
    //     public static  int clearIthBit(int n, int i) {
    //     int bitMask = ~(1<<i);
    //     return n & bitMask;

    // }
    // public static void main(String args[]) {
    //     System.out.println(clearIthBit(10, 1));
    // }








    //UPDATE iTH BIT.
//     public static int updateIthBit(int n, int i, int newBit) {
//         // if(newBit== 0) {
//         //     return clearIthBit(n, i);
//         // } else {
//         //     return setIthBit(n, i);
//         // }

//         n = clearIthBit(n, i);
//         int BitMask = newBit<<i;
//         return n | BitMask;
//     }
//     public static void main(String args[]) {
//         System.out.println(updateIthBit(10, 2, 1));
//     }



        



        //CLEAR LASAT i BITS
        // public static int clearIBits(int n, int i) {
        //     int bitMask = (~0)<<i;
        //     return n & bitMask;
        // }
        // public static void main(String args[]) {
        // System.out.println(clearIBits(15, 2));
        // }




        //CLEAR RANGE OF BITS 
        // public static int clearBitsinRange(int n, int i, int j) {
        //     int a = ((~0)<<(j+1));
        //     int b = (1<<i)-1;
        //     int bitMask = a | b;
        //     return n & bitMask;
        // }
        // public static void main(String args[]) {
        // System.out.println(clearBitsinRange(10, 2, 4));
        // }





        //Question 2
        //CHECK IF A NUMBER IS POWER OF 2 OR NOT.
        // public static boolean isPowerofTwo(int n) {
        //     return (n&(n-1)) == 0;

        // }
        // public static void main(String args[]) {
        //     System.out.println(isPowerofTwo(16));
        // }









        //FAST EXPONENTIAL

//         public static int fastExpo(int a, int n) {
//             int ans = 1;

//             while(n > 0) {
//                 if((n & 1) !=0) {// Checking the LSB
//                     ans = ans * a;

//                 }
//                 a = a * a;
//                 n = n >>1;
//             }

//             return ans;
//         }
//         public static void main(String arg[]) {
//             System.out.println(fastExpo(5, 10));
//         }













// }
