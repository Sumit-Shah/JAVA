// public class patterns {
//     public static void main(String args[]) {

//         for(int line=1; line<=4; line++) {
//             //one line
//           for(int star=1; star<=line; star++) {
//               System.out.print("*");
//           }
//           System.out.println();
//       }
// }
// }



// //stars = n - i + 1
// public class patterns {
//     public static void main(String args[]) {
//         int n = 4;
//         for(int line=1; line<=n; line++) {
//             for(int star=1; star<=n-line+1; star++) {
//                 System.out.print("*");

//             }
//             System.out.println();

//         }

//     }
// }




// //Half pyramid.
// public class patterns {
//     public static void main(String args[]) {
//         int n = 4;

//         for(int line=1; line<=n; line++) {
//             //numbers print
//             for(int number=1; number<=line; number++) {
//                 System.out.print(number);

//             }
//             System.out.println();
//         }
//     }
// }





// public class patterns {
//     public static void main(String args[]) {
//        int n = 5;
//        char ch = 'A';

//        //outer loop
//        for(int line=1; line<=n; line++) {
//            //inner loop
//            for(int chars=1; chars<=line; chars++) {
//                System.out.print(ch);
//                ch++;
//            }
//            System.out.println();
//        }        
//     }

// }




public class patterns {
    public static void main(String args[]) {
       int n = 10;
       char ch = 'A';

       //outer loop
       for(int line=1; line<=n; line++) {
           //inner loop
           for(int chars=1; chars<=line; chars++) {
               System.out.print(ch);
               ch++;
           }
           System.out.println();
       }        
    }

}