package game;
import java.util.ArrayList;

public class Stack<T> {
	private int capacity;
	private ArrayList<T> stack;
	
	//Constructor
	Stack(int capacity){
		this.capacity = 5;
		this.stack = new ArrayList<>();
		
	}
	
	//Operation Methods
	public void push(T element) {
		if (stack.size() < capacity) {
			stack.add(element);
			System.out.println("Added " + element + " to the stack");
		} else {
			System.out.println("Stack overflow...");
		}
	}
	
	public void pop() {
		System.out.println("popped " + stack.remove(stack.size() - 1));
	}
	
	public void peek() {
		System.out.println(stack.get(stack.size() - 1) + " was the last added ingredient");
	}
	
	public void isEmpty() {
		if (stack.size() == 0) {
			System.out.println("The stack is empty");
		}else {
			System.out.println("The stack isn't empty");
		}
		
	}
	
	public void isFull() {
		if (stack.size() == capacity) {
			System.out.println("The stack is full");
		}else {
			System.out.println("The stack isn't empty");
		}
		
	}
	
	public String display() {
		//return a string representing the stack elements
		return stack.toString();
	}

	public static void main(String[]args) {
		//Object creation
		Stack<String> myStack = new Stack<String>(5);
		
		System.out.println("------Basket stack------");
		
		myStack.push("Cheese");
		myStack.push("Whole cream");
		myStack.push("Butter");
		myStack.push("Milk");
		myStack.push("Flour");
		myStack.push("Yeast");
		System.out.println(" ");	
		
		//Confirm the stack capacity
		myStack.isFull();
		
		myStack.pop();
		
		myStack.peek();
	
	}

}


