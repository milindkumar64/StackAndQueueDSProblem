package com.bridgelabz;

import java.util.LinkedList;

class Stack {
	private LinkedList linkedlist = new LinkedList();

	public void push(Object obj) {

		linkedlist.addFirst(obj);
	}

	public Object peak() {
		return linkedlist.getFirst();
	}

	public Object pop() {
		return linkedlist.removeFirst();
	}

	public boolean isEmpty() {
		if (linkedlist.isEmpty()) {
			return true;
		}
		return false;
	}

	public String toString() {
		return "" + linkedlist;

	}
}

public class StackAndQueueProblem {

	public static void main(String[] args) {

		Stack stack = new Stack();

		stack.push(70);
		stack.push(30);
		stack.push(56);

		System.out.println(stack);

		while (!stack.isEmpty()) {
			System.out.println("Now Peak is at :"+stack.peak());
			System.out.println(stack.pop()+" is removed ");
		}
		System.out.println("Stack is empty : "+stack);

	}

}
