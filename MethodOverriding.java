package FullStack;


class Veeravicky{
	void display() {
		System.out.println("chips venuma bro : ila venam ");
	}
}
class Agent extends Veeravicky{
	void display(){
		super.display();
		System.out.println("vv : 3 arrear ra da");
	}
}


public class MethodOverriding {

	
	static public void main(String args[]) {
		
		Agent vv = new Agent();
		
		vv.display();
		
	}
	
}
