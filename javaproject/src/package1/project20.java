package package1;

import java.util.Scanner;

public class project20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int mark =sc.nextInt();
		if(mark<=100 && mark>90)
		{
			System.out.println("Grade A+");
		}
		else if(mark<=90 && mark>80)
		{
			System.out.println("Grade A");
		}
		else if(mark<=80 && mark>70)
		{
			System.out.println("Grade B");
		}
		else if(mark<=70 && mark>60)
		{
			System.out.println("Grade C");
		}
		else if(mark<=60 && mark>50)
		{
			System.out.println("Grade D");
		}
		else if(mark<=50)
		{
			System.out.println("Grade F");
		}
		else
		{
			System.out.println("invalid input");
			
		}

	}

}
