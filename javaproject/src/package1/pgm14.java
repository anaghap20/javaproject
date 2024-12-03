package package1;

import java.util.Scanner;

public class pgm14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = 20;
		int b = 50;
		int c = 70;
		if((a>b)&&(a>c) ) {
			System.out.println("a is greater");
		}
		else if((b>a)&&(b>c)) {
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}

	}

}
