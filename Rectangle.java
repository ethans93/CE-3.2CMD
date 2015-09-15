import java.util.Scanner;
public class Rectangle {
	public static void main(String [] args) {
		
		Scanner keyboard = new Scanner (System.in);
		int x1,x2;
		int p0;
		int a0;
		
		System.out.println();
		System.out.print("Please enter the height of the rectangle as an integer: ");
		x1=keyboard.nextInt();
		System.out.println();

		System.out.print("Please enter the width of the rectangle: ");
		x2=keyboard.nextInt();
		System.out.println();

		a0 = x1 * x2;
		p0 = (x1 * 2) + (x2 * 2);

		System.out.println("The area of the rectangle is "+ a0);
		System.out.println("The perimeter of the rectangle is "+ p0); 
}
}