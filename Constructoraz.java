package FullStack;

public class Constructoraz {
 
	String Name;
	int age;
	
	
	public Constructoraz() {//intialize constructor
		Name ="Gowtham K";
		age= 22;
	}
	
	public Constructoraz(String str,int n) {//parameterized constructor
		Name = str;
		age = n;
			
	}
	
	
	
	public static void main(String args[]) {
		Constructoraz cc = new Constructoraz();
		System.out.println(cc.Name);
		System.out.println(cc.age);
		
		
		Constructoraz ccc = new Constructoraz("Anileyyy",49);
		System.out.println(ccc.Name);
		System.out.println(ccc.age);
		
	}
	
}
