package day9;

import java.util.*;

public class question3 {
	Stack<Integer> st = new Stack();
	Integer min;
	void getMin()
	{
		if(st.isEmpty())
			System.out.println("Empty Stack");
		else
			System.out.println("Minimum element of stack: " + min);
	}
	
	void push(Integer a) {
		if(st.isEmpty())
		{
			min = a;
			st.push(a);
			System.out.println("Number added: " + a);
			return;
		}
		
		if(a<min) {
			st.push(2*a - min);
			min = a;
		}
		else {
			st.push(a);
		}
		
		System.out.println("Number added: " + a);
	}

	void pop(){
		if(st.isEmpty()) {
			System.out.println("Empty Stack");
			return;
		}
		System.out.println("Top most element of the stack removed: ");
		Integer i = st.pop();
		
		if(i<min) {
		System.out.println(min);
		min = 2*min - i;
		}
		else {
			System.out.println(i);
		}
	}
	
	void peek() {
		if(st.isEmpty()) {
			System.out.println("Empty Stack");
			return;
		}
		Integer i = st.peek();
		System.out.println("Top element is: ");
		
		if(i<min) {
			System.out.println(min);
		}
		else {
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) {
		question3 st = new question3();
		st.push(7);
		st.push(2);
		st.getMin();
		st.push(16);
		st.push(11);
		st.getMin();
		st.pop();
		st.getMin();
		st.pop();
		st.peek();
	}
}
