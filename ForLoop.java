// // Print out the elements in the Array; Using ForLoop
// // 1)arrayOfFloats
// // 2)arrayOfDoubles
// public class ForLoop {
//     class loop {
//     // declaring instance variable
//     static int[] arrayOfInts = {1, 2, 3, 4, 5};
//     static float[] arrayOfFloats = {1f, 2f, 3f, 4f, 5f};
//    // instance variable 
//    static double[] arrayOfDoubles = {1d, 2d, 3d, 4d, 5d};
    
//     // instance function
//     public static void display() {
//         System.out.println("the length of the arrayOfInts: " + arrayOfInts.length);

//         for (int i = 0; i <= arrayOfInts.length - 1; i++) {
//             System.out.print(arrayOfInts[i] + " ");
//         }
//     }
//     //1)arrayOfFloats
//         public static void display() {
//         System.out.println("the length of the arrayOfFloats: " + arrayOfFloats.length);

//         for (int i = 0; i <= arrayOfFloats.length - 1; i++) {
//             System.out.print(arrayOfFloats[i] + " ");
//         }
//     }
//     // 2)arrayOfDoubles
//        public static void display() {
//         System.out.println("the length of the arrayOfDoubles: " + arrayOfDoubles.length);

//         for (int i = 0; i <= arrayOfDoubles.length - 1; i++) {
//             System.out.print(arrayOfDoubles[i] + " ");
//         }
//     }


// }

// }
// // Task2:
// // In  the below  class named IfExample create a function named CalculateDiscount that 
// //  should return discount amount, on basis of discount rate  as mentioned below;

// // totalAmount > 1000; apply 20% discount
// // totalAmount > 500; apply 10% discount
// // And No discount for below and equal to 500;
// // Syntax of Else if ;
// class Discount {
//     public static int calculateDiscount(int totalAmountSpent) {
//         int discountAmount = 0; // Initial discountAmount to 0
        
//         if (totalAmountSpent > 1000) {
//             // Apply 20% discount for totalAmount > 1000
//             discountAmount = (int) (totalAmountSpent * 0.20);
//         } else if (totalAmountSpent > 500) {
//             // Apply 10% discount for totalAmount > 500
//             discountAmount = (int) (totalAmountSpent * 0.10);
//         }
        
//         // Return the calculated discountAmount
//         return discountAmount;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         int totalAmount = 1200; // Example total amount spent
//         int discount = calculateDiscount(totalAmount);
//         System.out.println("Discount Amount: $" + discount);
//     }
// }


// package Core.java.day03;

// public class Student {
//     private String studentName;
//     private int rollNo;
//     private float[] marks;
//     private String contact;
//     public String collegeName;
//     public void setStudentName(String name) {
//         this.studentName = name;
//     }
//    public String getStudentName() {
//        return studentName;
//    }

//    public void setRollNo(int roll) {
//         this.rollNo = roll;
//    }

//    public int getRollNo() {
//         return rollNo;
//    }

//     public void setMarks(Float[] marks) {
//         this.marks = marks;
//     }

//     public float[] getMarks() {
//         return marks;
//     }

//     public void setContact(String contact) {
//         this.contact = contact;
//     }

//     public String getContact() {
//         return contact;
//     }
// }