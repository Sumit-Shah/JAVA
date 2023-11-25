public class OOPS {
//     public static void main(String args []) {
//         Pen p1 = new Pen(); //created a pen object called p1
//         p1.setColor("Blue");
//         System.out.println(p1.color);
//         p1.setColor("Yelllow");
//         System.out.println(p1.color);

//         p1.color = "Green";
//         System.out.println(p1.color);

//         BankAccount myAcc = new BankAccount();
//         myAcc.username = "Sumit Shah";
//         myAcc.setPassword("abcdefghi");

//     }
    
// }


// class BankAccount{
//     public String username;
//     private String password;
//     public void setPassword(String pwd){
//         password = pwd;
//     }
// }

// class Pen {
//     //properties and function.
//     String color;
//     int tip;

//     void setColor(String newColor) {
//         color = newColor;
//     }

//     void setTip(int newTip) {
//         tip = newTip;
//     }

// }

// class Student {
//     String name;
//     int age;
//     float percentage; //cgpa

//     void calcPercentage(int phy, int chem, int math) {
//         percentage = (phy + chem + math) / 3;
//     }




    



    //GTTER AND SETTERS
    // Get : to return the value
    // Set : to modify the value
    // this : this keyword is used to refer to current object.


    // public static void main(String args[]) {
    //     Pen p1 = new Pen();//Created a pen Object called p1
    //     p1.setColor("Blue");
    //     System.out.println(p1.getColor());
    //     p1.setTip(5);
    //     System.out.println(p1.getTip());
    //     p1.setColor("Yellow");
    //     System.out.println(p1.getColor());



    // }
    // class Pen {
    //     private String color;
    //     private int tip;
    //     String getColor() {
    //         return this.color;
    //     }

    //     int getTip() {
    //         return this.tip;
    //     }

    //     void setColor(String newColor) {
    //         this.color = newColor;
    //     }
    // }







    //ENCAPSULATION
    //Encapsulation is defined as the WRAPPING UP  of data & methods under a 
    //single unit.It also implements data hiding.
    // public static void main(String args[]) {
    //     Student s1 = new Student();
    //     // Student s1 = new Student("Sumit");
    //     // System.out.println(s1);
    // }
    // class Student {
    //     String name;
    //     int roll;

    //     Student( ) {
    //         // this.name = name;
    //         System.out.println("Constructor is called .....");
    //     }
    // }


    //TYPES OF CONSTRUCTOR
    // public static void main(String args[]) {
    //     Student s1 = new Student();
    //     Student s2 = new Student("Sumit Shah");
    //     Student s3 = new Student(123);
    // }
    // class Student {
    //     String name;
    //     int roll;

    //     Student() {
    //         System.out.println("Constructor is called ....");
    //     }
    //     Student(String name) {
    //         this.name = name;
    //     }
    //     Student(int roll) {
    //         this.roll = roll;
    //     }
    // }

    public class OOPS {
        //     public static void main(String[] args) {
        //         Student s1 = new Student("Sumit", 456, "abcd", new int[]{100, 90, 80});
        
        //         Student s2 = new Student(s1);
        //         s2.setPassword("xyz");
        
        //         for (int i = 0; i < 3; i++) {
        //             System.out.println(s2.getMarks()[i]);
        //         }
        //     }
        // }
        
        // class Student {
        //     private String name;
        //     private int roll;
        //     private String password;
        //     private int[] marks;
        
        //     // Copy constructor
        //     Student(Student s1) {
        //         this.name = s1.name;
        //         this.roll = s1.roll;
        //         this.password = s1.password;
        //         this.marks = s1.marks.clone();
        //     }
        
        //     Student(String name, int roll, String password, int[] marks) {
        //         this.name = name;
        //         this.roll = roll;
        //         this.password = password;
        //         this.marks = marks.clone();
        //     }
        
        //     Student() {
        //         marks = new int[3];
        //         System.out.println("Constructor is called...");
        //     }
        
        //     Student(String name) {
        //         this();
        //         this.name = name;
        //     }
        
        //     Student(int roll) {
        //         this();
        //         this.roll = roll;
        //     }
        
        //     // Getter for marks
        //     public int[] getMarks() {
        //         return marks;
        //     }
        
        //     // Setter for password
        //     public void setPassword(String password) {
        //         this.password = password;
        //     }
        
        
        
        
        
        //INHERITANCE
        //  Inheritance is when properties & methods of base class are
        // passed on to a derived class.
        //     public static void main (String args []) {
        //         Fish shark = new Fish();
        //         shark.eat();
        
        //     }
        // }
        
        
        
        
        
        // //BASE CLASS
        // class Animal {
        //     String color;
        
        //     void eat() {
        //         System.out.println("eats");
        //     }
        
        //     void breathe() {
        //         System.out.println("breathes");
        //     }
        // }
        
        
        
        // //Derived Class
        // class Fish extends Animal {
        //     int fins;
        
        //     void swim() {
        //         System.out.println("Swims in Water");
        //     }
        // }
        
        
        
        //TYPES OF INHERITANCE 
        
        
        
        //1.MULTI LEVEL INHERITANCE 
        //     public static void main (String args []) {
        //         Dog dobby = new Dog();
        //         dobby.eat();
        //         dobby.legs = 4;
        //         System.out.println(dobby.legs);
                
        //     }
        // }
        
        
        
        
        
        // //BASE CLASS
        // class Animal {
        //     String color;
        
        //     void eat() {
        //         System.out.println("eats");
        //     }
        
        //     void breathe() {
        //         System.out.println("breathes");
        //     }
        // }
        
        // class Mammal extends Animal {
        //     int legs;
        // }
        
        // class Dog extends Mammal {
        //     String breed;
        // }
        
        
        
        
        
        //2. Hierarchial Inheritance
        
        //     public static void main (String args []) {
        //         Dog dobby = new Dog();
        //         dobby.eat();
        //         dobby.legs = 4;
        //         System.out.println(dobby.legs);
                
        //     }
        // }
        
        
        
        // //BASE CLASS
        // class Animal {
        //     String color;
        
        //     void eat() {
        //         System.out.println("eats");
        //     }
        
        //     void breathe() {
        //         System.out.println("breathes");
        //     }
        // }
        
        // class Mammal extends Animal {
        //     int legs;
        // }
        
        // class Dog extends Mammal {
        //     String breed;
        // }
        
        // class Mammal extends Animal {
        //     void walk() {
        //         System.out.println("Walks");
        //     }
        // }
        
        // class Fish extends Animal {
        //     void swim() {
        //         System.out.println("swim");
        //     }
        // }
        
        // class Bird extends Animal {
        //     void fly() {
        //         System.out.println("fly");
        //     }
        // }
        
        
        
        
        
        //4. Hybrid Inheritance 
        public static void main (String args []) {
                Dog dobby = new Dog();
                dobby.eat();
                dobby.legs = 4;
                System.out.println(dobby.legs);
                
            }
        }
        
        
        
        //BASE CLASS
        class Animal {
            String color;
        
            void eat() {
                System.out.println("eats");
            }
        
            void breathe() {
                System.out.println("breathes");
            }
        }
        
        class Mammal extends Animal {
            int legs;
        }
        
        class Aves extends Animal {
            int Egg;
        }
        
        class Reptile extends Animal {
            int Crawl;
        }
        
        
        
        class Dog extends Mammal {
            String breed;
        }
        
        class Mammal extends Animal {
            void walk() {
                System.out.println("Walks");
            }
        }
        
        class Fish extends Animal {
            void swim() {
                System.out.println("swim");
            }
        }
        
        class Bird extends Animal {
            void fly() {
                System.out.println("fly");
            }
        }
        
        
}
