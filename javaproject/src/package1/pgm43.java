package package1;

public class pgm43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,row=6;
		for(i=0;i<=row-1;i++) {
			for(j=0;j<=i;j++) {
				System.out.print(" ");
			}
			for(j=0;j<=row-1-i;j++) {
				System.out.print("* ");
			}
			System.out.println();

	}

}}
