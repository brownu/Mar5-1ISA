package com.isa;

public class Test {

	public static void main(String[] args) {
		
		Calculator casio = new Calculator();
		System.out.println(casio.add(5,8));
		Calculator.Keypad key = casio.new Keypad();//means inner class of calculator, object of the outer class should exist first
		key.display();
		
		/*Parent p = new Parent();// referring to its own kind
		p = new Child();//UPCASTING, late binding
		System.out.println(p instanceof Child);//produces a boolean
		
		//Child c = (Child) new Parent(); //forcing the parent object to become a child, Casting, will produce runtime error
		
		/*Calculator  c = new Calculator();
		Calculator c2 = new Calculator();
		Calculator.add(8,9);
		someMethod();*/	
		
	}
	
	public static void someMethod() {// non static method
		Calculator c3 = new Calculator();
		c3.add(8,10);
		
		
	}
}

	/*
		Parent p = new Parent();
		Child c = new Child();
		
		
		//p = c;
		Object obj = c;
		p.walk("fast");
		//Calculator sharp = new Calculator();
		
		
		//System.out.println(sharp.add(8, 10, 2001,18));
		
	}

}
	 */

// class.method to call
//Child reference cannot point to a parent object
