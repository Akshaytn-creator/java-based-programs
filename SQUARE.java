import java.lang.Math;
import java.util.Scanner;
public class SQUARE{
	public static void main(String[] args)
	{
		Double n;
		Scanner sc= new Scanner(System.in);
		n=sc.nextDouble();
		System.out.println("ENTER A RANDOM NUMBER");
		n=sc.nextDouble();
		Double squareroot=Math.pow(n,0.5);
		System.out.println("THE SQUARE OF A GIVEN NUMBER IS"+n+"="+squareroot);
		}
}