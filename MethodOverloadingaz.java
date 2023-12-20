package FullStack;


class Maths{
	int cal(int x,int y) {
		return x*y;
	}
	double cal(double x,double y) {
		return x+y;
	}
	String cal(String x,String y) {
		return x+y;
	}
}

public class MethodOverloadingaz {
	static public void main(String args[]) {
	
		Maths cc = new Maths();
		
		int res1 = cc.cal(23,22);
		double res2 = cc.cal(0.3,1.7);
		String res3 = cc.cal("Toothless,","Zubii. ");
	
		System.out.println("Result 1: " + res1);
        System.out.println("Result 2: " + res2);
        System.out.println("Result 3: " + res3);
	
	
	}
}
