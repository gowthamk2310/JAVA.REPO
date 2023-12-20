package FullStack;

public class DynamicMethodaz {

	static int myMethod(int a,int b) {
		
		return a*b;
	}
	
	static double myMethod(double x,double y,double z) {
		return x*y*z;
	}

	
	static long myMethod(long w,long z) {
		
		return w*z;
	}
	static int myMethod(int l,int b,int h) {
	 return l*b*h;	
	}
	static public void main(String args[]) {
	
		int var1 = myMethod(17,23);
		
		double var2 = myMethod(17,23,22);

		long var3 = myMethod(17,23);
		
		int var4 = myMethod(45,48,40);

		System.out.print(var1+" ");
		System.out.print(var3+" ");
		System.out.print(var2+" ");
		System.out.print(var4);
		
	}
}	

