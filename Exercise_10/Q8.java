package Exercise_10;

/* 8. How does method hiding work in Java? 
 * Can a subclass hide a static method of its superclass? 
 * Provide an example to illustrate your answer.
 * 
 * Ans - Method hiding occurs when a subclass defines a method with the same name and signature as a static method in the superclass. 
 *       This is different from method overriding, which involves instance methods. 
 *       In Java, static methods are bound to the class rather than to instances, and they are not overridden but hidden when a subclass defines a static method with the same signature.
 *       When a static method is defined in both a superclass and a subclass with the same method signature, the version of the method that is called depends on the class reference used, not the object at runtime. This is why it's called method hiding rather than overriding.
 * 
 * 
 * 
 */
// Example:

class Superclass3 {
    public static void display() {
        System.out.println("Static method in Superclass");
    }
}

class Subclass3 extends Superclass3 {
    // Hiding the static method from the superclass
    public static void display() {
        System.out.println("Static method in Subclass");
    }
}

public class Q8 {
    public static void main(String[] args) {
        // Calling the static method using superclass reference
        Superclass3 superClassRef = new Superclass3();
        superClassRef.display();  // Output: Static method in Superclass

        // Calling the static method using subclass reference
        Subclass3 subClassRef = new Subclass3();
        Subclass3.display();  // Output: Static method in Subclass

        // Calling the static method using superclass reference but referring to a subclass object
        Superclass3 polymorphicRef = new Subclass3();
        Superclass3.display();  // Output: Static method in Superclass
    }
}

