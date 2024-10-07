/**
 * 
 */
package mystack;

/**
 * @author ADD YOUR NAME 
 * Joel Avendano
 */

// Stack using generics

// Complete the provided code

public class MyStack<T> {

	private class MyNode<T1> {
		T1 val;
		MyNode<T1> next;

		MyNode(T1 v, MyNode<T1> n) {
			val = v;
			next = n;
		}
	}

	private MyNode<T> theStack = null;

	/**
	 * 
	 */
	public MyStack() {
	}

	public T pop() {
		if (theStack == null) {
            throw new IllegalStateException("Stack is empty");
        }
        T value = theStack.val;
        theStack = theStack.next; 
        return value;
	}

	public void push(T v) {
		// TODO To complete
		theStack = new MyNode<>(v, theStack);
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO To complete
		// Create a stack of Integer
		MyStack<Integer> intStack = new MyStack<>();
		// Push 1 and 2
		intStack.push(1);
        intStack.push(2);
		// Pop
		System.out.println(intStack.pop()); //2
		// Push 5
		intStack.push(5);
		System.out.println(intStack.pop()); //5
		
		// TODO To complete
		// Create a stack of Person
		MyStack<Person> personStack = new MyStack<>();
		// Push a person p1 with your name
		Person p1 = new Person("Joel", "Avendano");
        personStack.push(p1);
		// Push a person p2 with my name
		Person p2 = new Person("Christelle", "Scharff");
        personStack.push(p2);

		Person poppedPerson = personStack.pop();
		System.out.println(poppedPerson.getFname() + " " + poppedPerson.getLname()); //CS
		poppedPerson = personStack.pop();
		System.out.println(poppedPerson.getFname() + " " + poppedPerson.getLname()); //JA

	}

}
