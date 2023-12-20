package FullStack;


class Csk{//parent
	int score = 207;
	void battingFirst(){
		System.out.println("Good total");
	}	
}

class Batsmen extends Csk{//child1
	int batting = 197;//class
	void scoring() {//method
		System.out.println("Set a  good score");
	}
	
}
class Bowler extends Csk{//child2
	int bowling = 110;//class
	void defend() { //method
		System.out.println("Defend a  good score");
	}
	
}

public class Hierarchicalinherianceaz {
 
	static public void main(String args[]) {
		
		Batsmen myObj2 = new Batsmen();//child1
		System.out.println(myObj2.batting);//class
		myObj2.scoring();//method
		System.out.println(myObj2.score);// parent - class
		myObj2.battingFirst();// method
		
	
		Bowler myObj3 = new Bowler();//child2
		System.out.println(myObj3.bowling);
		myObj3.defend();
		System.out.println(myObj3.score);
		myObj3.battingFirst();
	}
	
}
