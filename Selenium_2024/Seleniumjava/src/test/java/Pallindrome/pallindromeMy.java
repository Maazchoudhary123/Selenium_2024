package Pallindrome;

import org.testng.annotations.BeforeClass;

public class pallindromeMy {
	public static void main(String[] args) {
		String m="Maaz choudhary";
		StringBuilder m1=new StringBuilder(m);
		m1.reverse();
		if(m.equals(m1.toString())) {
			System.out.println(m);
			}
		else {
			System.out.println("not pallindrome");
		}

	}

}
