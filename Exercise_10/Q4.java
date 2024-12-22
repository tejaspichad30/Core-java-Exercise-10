package Exercise_10;

/* 4. Can a final method be overridden in a subclass? 
 * What happens if a subclass tries to override a final method? 
 * Provide an example to illustrate your answer.
 * 
 * 
 * Ans - A final method cannot be overridden in a subclass. 
 *       The final keyword in Java indicates that a method is "finalized," 
 *       meaning its behavior cannot be modified in subclasses. If a subclass 
 *       tries to override a method that is declared as final in the superclass, 
 *       the compiler will produce an error.
 *       
 *       What happens if a subclass tries to override a final method?
		 If a subclass attempts to override a final method, 
		 a compilation error will occur. The compiler will 
		 inform you that the method in the subclass cannot 
		 override the final method from the superclass.
 * 
 * 
 */

// Example:
class Superclass1 {
    // This method is final and cannot be overridden
    public final void displayMessage() {
        System.out.println("This is a final method in the superclass.");
    }
}

class Subclass1 extends Superclass1 {
    // Attempting to override the final method will cause a compile-time error
    // public void displayMessage() {
    //     System.out.println("Trying to override the final method.");
    // }
}

public class Q4 {
    public static void main(String[] args) {
        Subclass1 sc1 = new Subclass1();
        sc1.displayMessage();  // This will call the superclass's final method
    }
}


