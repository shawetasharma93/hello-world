package First;

import java.util.Scanner;

public class Hello {
	public static void main(String[] args) {
		System.out.println("enter your name");
		
		Scanner s =new Scanner(System.in);
		String name = s.next();
		s.close();
		System.out.println("your name is :" + name);
		
		
	}

}

