package package1;

import java.util.Scanner;

public class pgm15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		if(a%2==0)
		{
			int square = a*a;
			System.out.println("square of this number" +square);
		}

	}

}
