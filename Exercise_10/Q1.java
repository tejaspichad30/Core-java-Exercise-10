package Exercise_10;

/*
 * 1. What is the difference between method overriding and 
 * method overloading in the context of inheritance? 
 * Provide an example to illustrate your answer. 
 * 
 * Ans - 1) Method overriding Define-    1) Method overriding occur when a subclass provides a 
 *       		 				   		 specific implementation of a method that is already defined in its superclass.
 *               				         2) The method in the subclass must have the same signature (names & parameter)
 *                				         as the method in the superclass.
 *                
 *                					--> Overriding and Access Modifiers
 *                					--> final method can not be overridden
 *                					--> static method can not be overridden
 *                
 * 
 */
// Implementation
//class Student {
//	void display()
//	{
//		System.out.println("I am Student");
//	}
//}
//class Student_stream {
//	void display()
//	{
//		System.out.println("I am a Computer Engineering student");
//	}
//}
//public class Method_overriding {
//
//	public static void main(String[] args) {
//		Student_stream s1 = new Student_stream();
//		s1.display();
//
//	}
//
//}

/* 1) Method overloading Define-        1) Method overloading refers to defining multiple methods in the same class with
									    the same name but with different parameter.
									    2) Method overloading increases the readability of the program
									    3) Different way of method overloading in Java.
									    --> Changing the no of parameter.
									    --> Changing Data type of Arguments.
 * 
 */

// Implementation
//class Sum {
//	public int sum (int a, int b)
//	{
//		return (a+b);
//		
//	}
//	public double sum (int a, int b, int c)
//	{
//		return (a+b+c);
//	}
//	public static void main(String args[])
//	{
//		Sum s = new Sum();
//		System.out.println(s.sum(10,20));
//		System.out.println(s.sum(10,20,30));
//	}
//}
//class Main1 {
//	public static void main(String args[])
//	{
//	// Declare,creation,initialization of integer array
//		int [] myarray = {10,20,30};
//		
//		// accessing array element
//		for (int i = 0; i < myarray.length; i++)
//		{
//			System.out.println("Element"+i+":"+myarray[i]);
//		}
//	}
//}


/*    Difference between Method Overloading and Method Overriding
 * 
 * 			        Method Overloading                                                               Method Overriding
 * 
 *      
 * 		1)	Method Overloading is a compile time polymorphism.             				1)	Method Overriding is a run time polymorphism.

		2)	It helps to increase the readability of the program.                        2)	It is used to grant the specific implement of method which is already provided by its parent class or superclass.
         
		3)	Must have different parameters.                                             3)	Must have the same parameters.

		4)	Can have the same or different return type.                                 4)	Must have the same Return type.

		5)	Not depend on Inheritance.                                                 	5)	Depend on Inheritance.

		6)	Static binding is being used for overloaded methods.                        6)	Dynamic binding is being used for overriding methods.          
 * 
 * 
 */




