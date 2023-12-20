package FullStack;

class Number
{
void displays() {
	try{
		String str = "nine";
		int num = Integer.parseInt(str);
	}
	catch(Exception a) {
		System.out.println("simbu is exceptional "+a);
	}
	System.out.println("Error closed");
}	

}

public class NumberFormataz {
	public static void main(String args[]) {
		Number num = new Number();
		num.displays();
	}

}
