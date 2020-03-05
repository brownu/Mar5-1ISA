package com.isa;

public class Calculator {
	static int x;
	/*
	 * public int add(int num1, int num2){
	 * 	return num1 + num2;
	 * }
	 * 
	 * method overloading 
	 * 
	 * public int add(int num1, int num2, int num3){
	 * return num1 + num2 + num3;
	 * }
	 * 
	 */
	public  int add(int ... nums) {//nums is an array
		int sum = 0;
		for(int num : nums) {
			sum += num;
			
		}
		return sum;
	}
	
	class Keypad{
		double size;
		
		
		void display() {// to make use of this obj, i need to create a keypad object by using the syntax
			System.out.println("Keypad was pressed. ");
		}
	}
}
/*
 * polymorphism - ability of an object to take many forms
 */
