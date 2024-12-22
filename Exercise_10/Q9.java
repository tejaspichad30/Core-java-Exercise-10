package Exercise_10;

/* 9. Can a final class be subclassed? What happens if a class tries 
 * to extend a final class? Provide an example to illustrate your answer.
 * 
 * Ans - A final class cannot be subclassed in Java. 
 * 		 The final keyword is used to indicate that a class cannot be extended or subclassed. 
 * 		 If a class is marked as final, it cannot have any subclasses, and attempting to subclass a 
 * 		 final class will result in a compilation error.

		What happens if a class tries to extend a final class?
		If a class attempts to extend a final class, the compiler will throw an error. This happens because final classes are meant to prevent inheritance, ensuring that their implementation cannot be changed or extended.
 * 
 * 
 * 
 */
//Example:
//A final class
class FinalClass1 {
 public void display() {
     System.out.println("This is a final class.");
 }
}

//A class trying to extend the final class (will cause an error)
class Subclass4 extends FinalClass1 {  // Compile-time error
 public void show() {
     System.out.println("Trying to subclass a final class.");
 }
}

public class Q9 {
 public static void main(String[] args) {
     // This will not compile because Subclass tries to extend a final class
     Subclass4 obj = new Subclass4();
     obj.display();
     obj.show();
 }
}

