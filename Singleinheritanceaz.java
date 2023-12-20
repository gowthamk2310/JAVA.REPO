package FullStack;


class parentaz{
	
	int xs = 23;
	
	void myMethod() {
		System.out.println("I am the base class ");
	}
}

class childaz extends parentaz{
	
	int sx = 17;
	
	void myMethod2() {
		System.out.println("I am the child class ");
	}
	
}

public class Singleinheritanceaz {
	
	public static void main(String args[]) {
		childaz myObj = new childaz();
		System.out.println(myObj.xs);
		myObj.myMethod();
		
		System.out.println(myObj.sx);
		myObj.myMethod2();
		
		
		
	}

}

