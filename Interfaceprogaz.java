package FullStack;

interface BaseA{
	void  display();
}
interface BaseB{
	void display1();
}
public class Interfaceprogaz implements BaseA,BaseB {
	private static Interfaceprogaz obj;
	public static void main(String args[]) {
		setObj(new Interfaceprogaz());

		
	}

	@Override
	public void display() {
		System.out.println(" value of one ");
	}
	public void display1() {
		System.out.println(" value of two ");
	}

	public static Interfaceprogaz getObj() {
		return obj;
	}

	public static void setObj(Interfaceprogaz obj) {
		Interfaceprogaz.obj = obj;
	}
	
	
	
}
