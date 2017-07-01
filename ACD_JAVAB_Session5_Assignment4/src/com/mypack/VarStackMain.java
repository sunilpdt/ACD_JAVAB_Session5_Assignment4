package com.mypack;

public class VarStackMain {

	public static void main(String[] args) {
		VariableStack vstack=new VariableStack(5);
		vstack.push(1);
		System.out.println(vstack.peek());
		vstack.push(2);
		System.out.println(vstack.peek());
		vstack.push(3);
		System.out.println(vstack.peek());
		vstack.push(4);
		System.out.println(vstack.peek());
		vstack.push(5);
		System.out.println(vstack.peek());
		vstack.push(6);
		System.out.println(vstack.peek());

	}

}
