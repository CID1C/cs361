/**
 * 
 */
package reflection;

/**
 * @author ADD YOUR NAME 
 * Joel Avendano
 */

// Reflection: https://docs.oracle.com/javase/tutorial/reflect/class/

// Demonstration of Reflection

// Given an object o, we want to know what class corresponds to o, the inheritance chain for o
// and the list of methods of the class

// Complete the code

import java.lang.reflect.Method;

import circle.ColoredCircle;

public class Reflection {

	/**
	 * Print the class corresponding to the object
	 * @param o the object
	 */
	public void correspondingClass(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		System.out.println("Inspecting class: " + o.getClass().getName());
	}

	/**
	 * Print the chain of super classes of the object 
	 * Format of the output:
	 * Inheritance chain:
	 * Cn inherits from Cn-1 inherits ... inherits from java.lang.Object
	 * @param o the object
	 */
	public void inheritanceChain(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		// TODO To complete
		// You need to use the EXACT format of the output
		// Hint: Use the method getSuperClass()
		Class<?> clazz = o.getClass();
		StringBuilder inheritanceChain = new StringBuilder("Inheritance chain:\n");
		while (clazz != null) {
			inheritanceChain.append(clazz.getName());
			clazz = clazz.getSuperclass();
			if (clazz != null) {
				inheritanceChain.append(" inherits from ");
			}
		}

		System.out.println(inheritanceChain);
	}
	
	/**
	 * Print the list of methods of the object
	 * @param o an object
	 */
	public void listMethods(Object o) {
		if (o == null)
			throw new IllegalArgumentException("Object passesd is null");

		Method[] m = o.getClass().getMethods();

		// List of methods
		// TODO To complete
		// Print each method on one line
		// Use this EXACT format
		for(Method method : m){
			StringBuilder methodSignature = new StringBuilder();
			methodSignature.append(method.getName()).append(": ");
			Class<?>[] parameterTypes = method.getParameterTypes();
			for(int i = 0; i < parameterTypes.length; i++){
				if(i < parameterTypes.length - 1){
					methodSignature.append(" ");
				}
			}
			methodSignature.append(" -> ").append(method.getReturnType().getSimpleName());
			System.out.println(methodSignature.toString());
		}
		System.out.println("\n");
	}

	/**
	 * Constructor
	 */
	public Reflection() {
	}

	/**
	 * Demonstration
	 * @param args
	 */
	public static void main(String[] args) {

		Reflection r = new Reflection();		
		
		// Demonstration of the methods on an objet of type String
		// TODO To complete
		String str = "Hello, Reflection!";
		System.out.println("Demonstrating on String object:");
		r.correspondingClass(str);
		r.inheritanceChain(str);
		r.listMethods(str);
		
		// Demonstration of the methods on an objet of type ColoredCircle
		// TODO To complete		
		ColoredCircle circle = new ColoredCircle(); 
		System.out.println("\nDemonstrating on ColoredCircle object:");
		r.correspondingClass(circle);
		r.inheritanceChain(circle);
		r.listMethods(circle);
	}

}
