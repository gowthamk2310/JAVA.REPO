package FullStack.Taskstatement;

class Softwareupdate extends Thread{
	void update() {
		for(int i=1;i<=10;i++) {
			System.out.println("updating your software");
			try {
				Thread.sleep(2800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
class Restart extends Thread{
	void restart() {
		for(int i=1;i<=10;i++) {
			System.out.println("Vannakam da mapla ");
			try {
				Thread.sleep(2700);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}


public class MultiThaz {
	public static void main(String args[]) {
		Softwareupdate soft = new Softwareupdate();
		Restart re = new Restart();
		
		soft.update();
		re.restart();
	}
}

}





