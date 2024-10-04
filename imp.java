// import java.util.Scanner;

// public class imp {
//     //Only for ,n>2
//     public static boolean isPrime(int n) {
//         //Coner case 
//         //1
//         if(n == 2) {
//             return true;
//         }

//         boolean isPrime = true;
//         for(int i=2; i<=n-1; i++) {
//             if(n % i == 0) { ///Completlyb divided
//                 isPrime = false;
//                 return isPrime;
//             }
//         }
//         return isPrime;

//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number. : ");
//         int n = sc.nextInt();
//         System.out.println("Is given number is prime?  : " + isPrime(n));
//     }
// }



// GOOGLE
// WORD BREAK PROBLEM
// Given an input string and a dictionary of words, find out if the input string
// can be broken into a space-separated sequence of dictionary words.

// words[] = {i, like , sam, samsung, mobile, ice}
// key = "ilikesamsung"
// output : true 

import java.util.*;
public class imp {
        static class  Node {
            Node children[] = new Node[26];
            boolean eow = false;
    
            public Node() {
                for (int i=0; i<26; i++) {
                    children[i] = null;
                }
            }
        }
    
        public static Node root = new Node();
    
        public static void insert(String word) {  //O(L)  (L= largest length of the word.)
            Node curr = root;
            for(int level=0; level<word.length(); level++) {
                int idx = word.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    curr.children[idx] = new Node();
                }
                curr = curr.children[idx];
            }
    
            curr.eow = true;
        }
    
        public static boolean search(String key) {
            Node curr = root;
            for(int level=0; level<key.length(); level++) {
                int idx = key.charAt(level) - 'a';
                if(curr.children[idx] == null) {
                    return false;
                }
                curr = curr.children[idx];
            }
    
            return curr.eow = true;
        }

        public static boolean wordBreak(String key) {  //O(L)
            if(key.length() == 0) {
                return true;
            }

            for(int i=1; i<= key.length(); i++) {
                 if(search(key.substring(0, i)) &&
                    wordBreak(key.substring(i))) {
                        return true;
                    }  
            }
            return false;

        }
        
        public static void main(String[] args) {
            String arr[] = {"i", "like", "sam", "samsung", "mobile", "ice"};
            for(int i=0; i<arr.length; i++) {
                insert(arr[i]);
            }

            String key = "ilikesamsung";
            System.out.println(wordBreak(key));

        }
      
    
}


