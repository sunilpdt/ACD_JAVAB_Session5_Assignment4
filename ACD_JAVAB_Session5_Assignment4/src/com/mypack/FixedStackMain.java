package com.mypack;

public class FixedStackMain {

	public static void main(String[] args) {
		FixedStack fxstack=new FixedStack(5);
		fxstack.push(1);
		System.out.println(fxstack.peek());
		fxstack.push(2);
		System.out.println(fxstack.peek());
		fxstack.push(3);
		System.out.println(fxstack.peek());
		fxstack.push(4);
		System.out.println(fxstack.peek());
		fxstack.push(5);
		System.out.println(fxstack.peek());
		fxstack.push(6);
		System.out.println(fxstack.peek());
	}

}
