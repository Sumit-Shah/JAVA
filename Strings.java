import java.util.Scanner;
public class Strings {
    // public static void printLetters(String str) {
    //     for(int i=0; i<str.length(); i++) {
    //         System.out.print(str.charAt(i) + " ");
    //     }
    //     System.out.println();
    // }
    // public static void main(String args[]) {
        // char arr[] = {'a', 'b', 'c', 'd'};
        // String str = "abcd";
        // String str1 = new String("xyz");


        // STRINGS ARE IMUTABLE .
        
    //     Scanner sc = new Scanner(System.in);
    //     String name;
    //    // name = sc.next();  //Only print one word .
    //    name = sc.nextLine();
    //     System.out.println(name.length());
    //     //In Array .length is just a property but , in String .lenth()  is a function .



        //CONCATINATION 
        // String firstname = "Sumit";
        // String lastName = "Shah";
        // String fullname = firstname + " " + lastName;
        // System.out.println(fullname + " is this.");
        // System.err.println(fullname.charAt(0)); //PRINT THE LETTER THAT IS PRESENT IN THAT INDEX.
        //printLetters(fullname);




    //}
    // public static boolean isPalindrome(String word) {
    //     for(int i=0; i<word.length()/2; i++) {
    //         int n = word.length();
    //         if(word.charAt(i) != word.charAt(n-1-i)) {
    //             //not a palindrome
    //             return false;

    //         }
    //     }
    //     return true;

    // }

    // public static void main(String args[]) {
    //     System.out.print("ENTER A WORD FOR PALINDROME : ");
    //     Scanner sc = new Scanner(System.in);
    //     String word;
    //     word = sc.nextLine();
    //     // System.out.println(isPalindrome(word));
    //     if(isPalindrome(word)) {
    //         System.out.println(word + " IS A PALINDROME . ");
    //     }else {
    //         System.out.println(word + " Is NOT A PALINDROME . ");
    //     }
    // }








//FINDING THE SHORTEST PATH.
//     public static float getShortestPath(String path) {
//         int x = 0, y = 0;

//         for(int i=0; i<path.length(); i++) {
//             char dir = path.charAt(i);
//             //South
//             if(dir == 'S') {
//                 y--;
//             }
//             //North
//             else if(dir == 'N') {
//                 y++;
//             }
//             //West
//             else if(dir == 'W') {
//                 x--;
//             }
//             //East
//             else {
//                 x++;
//             }
//         }

//         int X2 = x*x;
//         int Y2 = y*y;
//         return (float)Math.sqrt(X2 + Y2);

//     }

//     public static void main(String args[]) {
//         // String path = "WNEENESENNN";
//         String path = "EW";
//         System.out.println(getShortestPath(path));
    // }
    

    //COMPARISION
    // public static void main(String args[]) {
    //     String s1 = "Sumit";
    //     String s2 = "Sumit";
    //     String s3 = new String("Sumit");

    //     if(s1 == s2) {
    //         System.out.println("Strings are equal. ");
    //     } else {
    //         System.out.println("Strings are not equal.");
    //     }

    //     if(s1 == s3) {
    //         System.out.println("Strings are equal. ");
    //     } else {
    //         System.out.println("Strings are not equal.");
    //     }

    //     if(s1.equals(s3)) {
    //         System.out.println("Strings are equal. ");
    //     } else {
    //         System.out.println("Strings are not equal.");
    //     }
    // }




    // //SUBSTRING8
    // public static String substring(String str, int si, int ei) {
    //     String substr = "";
    //     for(int i=si; i<ei; i++) {
    //         substr += str.charAt(i);
    //     }
    //     return substr;
    // }
    
    // public static void main(String args[]) {
    //     //SubString
    //     String str = "HelloWorld";
    //     System.out.println(str.substring(0,5)); //Directly no need to create any loo[ but for this .]
    //     // System.out.println(substring(str, 0, 5));
    // }





    //FINDING OUT THE LARGEST STRINGS AMONG THE STRINGS
    // public static void main(String args[]) {
    //     String fruits[] = {"apple", "mango", "banana"};

    //     String largest = fruits[0];
    //     for(int i=1; i<fruits.length; i++) {
    //         if(largest.compareTo(fruits[i]) < 0) {
    //             largest = fruits[i];
    //         }
    //     }

    //     System.out.println(largest);
    // }


     // public static void main(String args[]) {
    //     StringBuilder sb = new StringBuilder("");
    //     for(char ch='a'; ch<= 'z'; ch++) {
    //         sb.append(ch);

    //     } //abcdefghijklmnopqrstuvwxyz
    //     //0(26)
    //     //0(26 * n^2)
    //     // 0(n^2)

    //     System.out.println(sb);
    // }

    




    //FOR A GIVEN STRING CONVERT EACH THE FIRST LETTER OF EACH WORD TO UPPERCASE.
    // public static String toUpperCase(String str) {
    //     StringBuilder sb = new StringBuilder("");

    //     char ch = Character.toUpperCase(str.charAt(0));
    //     sb.append(ch);

    //     for(int i=1; i<str.length(); i++) {
    //         if(str.charAt(i) == ' ' && i<str.length()-1) {
    //             sb.append(str.charAt(i));
    //             i++;
    //             sb.append(Character.toUpperCase(str.charAt(i)));

    //         } else {
    //             sb.append(str.charAt(i));
    //         }
    //     }

    //     return sb.toString();
    // }
    // public static void main(String args[]) {
    //     // Scanner sc = new Scanner(System.in);
    //     // System.out.println("ENTER THE LETTERS : ");
    //     // String str;
    //     // String str = sc.nextLine();
    //     // // String result = capitalizeWor(str);
    //     // System.out.println("CAPITALIZATION OF THE LETTERS : " + result);
    //     String str = "hi, i am sumit shah.";
    //     System.out.println(toUpperCase(str));
        
    // }
    
    
    
    
    //STRIMG COMPRESSION.
    // public static String compress(String str) {
    //     String newStr = "";

    //     for(int i=0; i<str.length(); i++) {
    //         Integer count = 1;
    //         while (i<str.length()-1 && str.charAt(i) == str.charAt(i+1)) {
    //             count++;
    //             i++;
    //         }

    //         newStr += str.charAt(i);
    //         if(count > 1) {
    //             newStr += count.toString();
    //         }
    //     }
    //     return newStr;
    // }
    // public static void main(String args[]) {
    //     String str = "aaabbcccdd";
    //     System.out.println(compress(str));
    // }



    

    //TRYING IT WITH THE STRING BUILDER .
    public static String compress(String str) {
        StringBuilder sb = new StringBuilder("");
        char currentChar = str.charAt(0);
        sb.append(currentChar);
        int count = 1;

        for(int i=1; i<str.length(); i++) {
            if(str.charAt(i) == currentChar) {
                count++;
            } else {
                if(count > 1) {
                    sb.append(count);
                }

            }
            currentChar = str.charAt(i);
            sb.append(currentChar);
            count = 1;
        }
        return sb.toString();

    }    
        
    public static void main(String args[]) {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }





}
