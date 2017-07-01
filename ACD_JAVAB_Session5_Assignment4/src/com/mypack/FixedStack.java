package com.mypack;

public class FixedStack implements Stack {

	
	int maxSize;
	int top;
	int[]arr;
	
	public FixedStack(int size){
		maxSize=size;
		arr=new int[maxSize];
		top=0;
	}
	
	public boolean empty(){
		
		if(top==0)
			return true;
			else
				return false;
		
	}
	
	public void push(int num){
		
		if(top<maxSize){
		arr[top]=num;
		top++;
		}
		else{
			System.out.println("Stack Overflow");
		}
	}
	
	public int pop(){
		
		if(!this.empty()){
			int temp=this.peek();
			arr[top-1]=0;
			top--;
			return temp;
			
		}
		else{
			return 0;
		}
		
	}
	
	public int peek(){
		if(top>0){
			return arr[top-1];
		}
		else{
			return 0;
		}
	}
	
	
}
