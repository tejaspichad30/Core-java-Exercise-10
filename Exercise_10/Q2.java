package Exercise_10;

/* 
   2. How does the static keyword affect the behavior of a method or
    variable in a subclass? Can 3. Can a subclass inherit the private members of its superclass? 
    If not, how can a subclass access the private members of its superclass? Provide an example to illustrate your answer.
 *  
 * 
 * 
 * 
 * 
 * 
 * 
 *Ans - 1. How does the static keyword affect the behavior of a method or variable in a subclass?
		The static keyword in Java (and other object-oriented programming languages) is used to 
		declare class-level methods or variables, meaning they belong to the class itself, not to instances of the class.
 * 			
 * 		Static Variables and Methods in a Subclass:
        When a subclass inherits a static method or variable from its superclass, it does not inherit an instance of the static variable or method. Instead, the subclass has access to the static members of the superclass as if they were part of its own class.

        Static members are not overridden in subclasses; instead, if the subclass defines a method with the same name, it hides the superclass method. However, both the subclass and the superclass can access their respective static methods and variables using the class name.
 * 
 *     Example - 
 *     class Superclass {
    static int staticVariable = 10;

    static void staticMethod() {
        System.out.println("Superclass static method");
    }
}

class Subclass extends Superclass {
    static int staticVariable = 20;

    static void staticMethod() {
        System.out.println("Subclass static method");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Subclass.staticVariable);  // Output: 20
        System.out.println(Superclass.staticVariable);  // Output: 10

        Subclass.staticMethod();  // Output: Subclass static method
        Superclass.staticMethod();  // Output: Superclass static method
    }
}
		2. Can a subclass inherit the private members of its superclass? If not, how can a subclass access the private members of its superclass?
           No, a subclass cannot directly inherit or access the private members of its superclass. The private members of a class are only accessible within the class itself. They are not visible to subclasses, even though the subclass inherits the structure of the superclass.

           a subclass can access private members of the superclass indirectly by using getter and setter methods provided by the superclass. These methods allow controlled access to the private fields.

		
		


		

 */
// Example -

class Superclass {
    private int privateVar = 10;

    // Get method to access the private member
    public int getPrivateVar() {
        return privateVar;
    }

    // Set method to modify the private member
    public void setPrivateVar(int value) {
        privateVar = value;
    }
}

class Subclass extends Superclass {
    public void displayPrivateVar() {
        // Accessing the private member through the getter method
        System.out.println("Private variable in superclass: " + getPrivateVar());
    }
}

public class Q2 {
    public static void main(String[] args) {
        Subclass subclass = new Subclass();
        subclass.displayPrivateVar();  // Output: Private variable in superclass: 10
    }
}

