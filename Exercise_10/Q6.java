

/* 6. What is the purpose of packages in Java? 
 * How do access modifiers affect the visibility 
 * of classes and members within a package? 
 * Provide an example to illustrate your answer.
 * 
 * Ans -1) What is the purpose of packages in Java?
 * 		 A Package in Java is a way of organizing related classes and interfaces.
 *       it provides a namespace and helps in avoiding naming conflicts.
 *       
 *       package keyword is used to define a package in Java.
 *       
 *       //(keyword)        (Name of package)
 *          package           packagename;
 * 
 * 
 * 
 * 
 */
//Example:
//Step 1: 
//package Exercise_10;
//public class Packages {
//
//	public static void main(String[] args) {
//		System.out.println("Java Packages");
//
//	}
//
//}

//Step 2: save this file as sample.java.
//
//Step 3: compile java package using following syntax: 
//	    Javac -d directory javafilename
//	    eg: Javac -d. sample.java
//	    (If we want to keep the pacakge withon the same directory use(.))
//
//Step 4: Run Java package program 
//		--> use fully qualified name
//		eg: mypack.simple to run the class
//		--> command to run java package
//		 java mypack.sample
//		 
//Output: Java Packages

/* Ans- 2) How do access modifiers affect the visibility of classes and members within a package? Provide an example to illustrate your answer.
 * 		   Java provides four access modifiers: 1: public
 * 												2: private
 *                                              3: protected
 *                                              4: default(no modifier)
 *         --> They control the visibility and accessibility of classes,methods, and variables.
 * 
 * 		1. public Access Modifier:
        A public class can be accessed from any other class, regardless of the package.
        Members (fields, methods, etc.): A public member can be accessed from any other class, regardless of whether it is in the same package or in a different package.
		2. protected Access Modifier:
        A class cannot be protected. This modifier can only be applied to members.
		Members: A protected member can be accessed:
		Within the same package.
		By subclasses (including subclasses in other packages).
		3. Default Access Modifier:
		A class with no access modifier is accessible only within the same package.
		Members: A member with no access modifier (i.e., package-private) is accessible only within the same package.
		4. private Access Modifier:
		A class cannot be private.
		Members: A private member can only be accessed within the same class. It is not accessible from other classes, even within the same package.
 * 
 * 
 * 
 * 
 * 
 * 
 */
// Example:
package Exercise_10;

public class Q6 {
    public int publicVar = 1;
    protected int protectedVar = 2;
    int defaultVar = 3; // Package-private
    private int privateVar = 4;

    public void display() {
        System.out.println("Inside ClassA:");
        System.out.println("publicVar = " + publicVar);
        System.out.println("protectedVar = " + protectedVar);
        System.out.println("defaultVar = " + defaultVar);
        System.out.println("privateVar = " + privateVar);
    }
}


//public class PackageB extends Packages {
//    public void display() {
//        System.out.println("Inside ClassB (Subclass of ClassA):");
//        System.out.println("publicVar = " + publicVar);  // Accessible
//        System.out.println("protectedVar = " + protectedVar);  // Accessible
//        System.out.println("defaultVar = " + defaultVar);  // Accessible within the same package
//        // System.out.println("privateVar = " + privateVar);  // Not Accessible, private in ClassA
//    }
//}
//
//
//
////import Exercise_10.Packages;
//
//public class PackageC {
//    public void display() {
//        Packages packages = new Packages();
//        System.out.println("Inside ClassC (Different Package):");
//        System.out.println("publicVar = " + classA.publicVar);  // Accessible
//        // System.out.println("protectedVar = " + classA.protectedVar);  // Not Accessible, protected in ClassA
//        // System.out.println("defaultVar = " + classA.defaultVar);  // Not Accessible, package-private
//        // System.out.println("privateVar = " + classA.privateVar);  // Not Accessible, private in ClassA
//    }
//}



