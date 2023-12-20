package FullStack;

public class Nullpointeraz {

	public static void main(String args[]) {
		String str = null;
		try {
			int am = str.length();
			int at = str.length();
		}
		catch(NullPointerException er) {
			System.out.println("code la error varuthu da muttal "+er);
		}
		System.out.println(" error rorre");
	}
}
