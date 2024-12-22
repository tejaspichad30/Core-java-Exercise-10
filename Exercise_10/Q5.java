package Exercise_10;

/* 5. How does the super keyword differ from the this keyword in Java? 
 * Provide an example to illustrate the difference.
 * 
 * Ans - 1. The this keyword:
			The this keyword refers to the current object — the instance of the class in which the keyword is used.
			--> It is used to refer to:
			The current instance of the class.
			The current class's instance variables (fields).
			The current class's constructors.
			('this' refers to the current instance of the class.)
			
		 2. The super keyword:
			The super keyword refers to the superclass (parent class) of the current object.
			--> It is used to:
			Access a method or variable from the superclass that is hidden or overridden by the current class.
			Call the constructor of the superclass.
			('super' refers to the parent class instance or superclass.)
 * 
 * 
 * 
 */

class Animal {
    String name = "Animal";
    
    public Animal() {
        System.out.println("Animal");
    }

    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String name = "Dog";

    public Dog() {
        // Calling the constructor of the superclass using super()
        super();
        System.out.println("Dog");
    }

    public void sound() {
        // Calling the method from the superclass using super
        super.sound();
        System.out.println("Dog barks");
    }

    public void displayNames() {
        // Accessing current class variable using this
        System.out.println("Current class name: " + this.name);
        // Accessing superclass variable using super
        System.out.println("Superclass name: " + super.name);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Dog dog = new Dog();  // Creates a Dog object, calling constructors

        dog.sound();  // Calls the overridden sound method

        dog.displayNames();  // Displays names from both Dog and Animal
    }
}

