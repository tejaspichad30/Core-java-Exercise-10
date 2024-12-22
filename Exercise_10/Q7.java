package Exercise_10;

/* 7. Can a subclass have a different access modifier than its 
 * superclass? What are the implications of changing the access 
 * modifier of a subclass? Provide an example to illustrate your 
 * answer.
 * 
 * Ans - Yes, a subclass can have a different access modifier than its superclass. 
 *       there are important rules and implications that govern the relationship 
 *       between the access modifiers in a subclass and its superclass. 
 *       These rules ensure that the visibility of methods and fields in the subclass is not made more restrictive than in the superclass.
 * 		 Implications of changing the access modifier of a subclass?
 *       A subclass cannot reduce the visibility of an inherited member. 
 *       For eg, if a method or field in the superclass is public, the subclass cannot change it to private or protected. it can increase the visibility (e.g., changing protected to public).
		 A subclass can change the access modifier of methods and fields it overrides or defines, but the new access modifier must not make the member more restrictive than the one in the superclass.
 * 
 * 
 * 
 * 
 */

// Example :
class Superclass2 {
    // A public method in the superclass
    public void display() {
        System.out.println("This is a public method in Superclass.");
    }

    // A protected method in the superclass
    protected void protectedDisplay() {
        System.out.println("This is a protected method in Superclass.");
    }

    // A private method in the superclass (not accessible in subclass)
    private void privateDisplay() {
        System.out.println("This is a private method in Superclass.");
    }
}

class Subclass2 extends Superclass2 {

    // This is allowed: Changing from protected to public (increases visibility)
    @Override
    public void protectedDisplay() {
        System.out.println("This is a public method in Subclass (originally protected in Superclass).");
    }

    // This is NOT allowed: Trying to decrease visibility from public to protected or private
    // @Override
    // protected void display() {  // Error: Cannot reduce visibility
    //     System.out.println("Cannot reduce visibility to protected.");
    // }

    // This is NOT allowed: Trying to change the private method visibility (private methods cannot be inherited or overridden)
    // @Override
    // public void privateDisplay() {  // Error: Cannot override private method
    //     System.out.println("Trying to override private method.");
    // }
}

public class Q7 {
    public static void main(String[] args) {
        Subclass2 subclass = new Subclass2();

        // Calling the overridden method
        subclass.protectedDisplay();  // This will call the public method in Subclass

        // Calling the superclass method
        subclass.display();  // This will call the public method in Superclass
    }
}

