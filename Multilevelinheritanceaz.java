package FullStack;
//grand parent
class Goa{
	int rs = 12000;
	
	void enjoymentIs() {
		System.out.println("Vibing with Friends ");
	}
}
//parent
class Tanjore extends Goa{
	int ns = 1000;
	
	void worship() {
		System.out.println("Yaduku da kovil ku poganum");
	}
}

//child
class Losvegas extends Tanjore{
	int as = 150000;
	
	void visiting() {
		System.out.println("casino and gambling");
	}
}

public class Multilevelinheritanceaz {

	public static void main(String args[]) {
		
		Losvegas myObj = new Losvegas();
		System.out.println(myObj.as);
		myObj.visiting();
		System.out.println(myObj.ns);
		myObj.worship();
		System.out.println(myObj.rs);
		myObj.enjoymentIs();
		
		
		Tanjore myObj2 = new Tanjore();
		System.out.println(myObj2.ns);
		myObj.worship();
		System.out.println(myObj2.rs);
		myObj.enjoymentIs();
		
		
		
		var myObj3 = new Goa();
		System.out.println(myObj3.rs);
		myObj.enjoymentIs();
		
	}
	
}
