package Exercise_10;

/* 3. What is the purpose of the this keyword in Java? 
 * How is it used to resolve ambiguity in method calls? 
 * Provide an example to illustrate your answer.
 * 
 * 
 * Ans - 1)  There can be a lot of usage of java this keyword, in Java 
 *           'this' keyword is a reference variable that refers to the current object.
 *       
 *       'this' (reference variable) ------> 1) state 2) behaviors (objects)
 *       
 *       2)  Way to uses of 'this' keyword :
 *       --->	 To refer the current class instance variable.
 *       ---> Using this() to invoke the current class constructor.
 *       
 *                
 * 
 * 
 * 
 */

// Example:
class Student {
	int a;
	int b;
	
	// Constructor
	Student (int a, int b)
	{
		this.a = a;            // name of parameters and instance variable are same and get result,so this problem using this keyword.
		this.b = b;
	}
	// Method to display
	void display()
	{
		System.out.println("a = " +a+ " b = " +b);
	}
	
}
public class Q3 {

	public static void main(String[] args) {
		Student s1 = new Student(1001, 80);
		Student s2 = new Student(1002, 90);
		s1.display();
		s2.display();

	}

}
