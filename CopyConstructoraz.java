package FullStack;

public class CopyConstructoraz {
	
	String name;
	int age;
	
	public CopyConstructoraz() {
		name = "Gowtham";
		age = 22;
	}
	
	public CopyConstructoraz(CopyConstructoraz obj) {
		name = obj.name;
		age = obj.age;
	}
	public static void main(String args[]) {
		CopyConstructoraz cc = new CopyConstructoraz();
		System.out.println(cc.name);
		System.out.println(cc.age);
		
		CopyConstructoraz dd = new CopyConstructoraz(cc);
		System.out.println(dd.name);
		System.out.println(dd.age);
		
		
	}
	

}
