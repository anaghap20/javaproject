package package1;

import java.util.Scanner;

public class project16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year =sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println("this is leap year");
		}
		else
		{
			System.out.println("this is not a leap year");
		}

	}

}
