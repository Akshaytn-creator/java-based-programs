package lab2;
import labsecond.Are;

import java.util.Scanner;

public class Trial1
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Are obj1 =new Are();

        while(true)
        {
            System.out.println("1:CIRCLE OF AREA");
            System.out.println("2:TRIANGLE OF AREA");
            System.out.println("3:SQUARE OF AREA");
            System.out.println("4:EXIT");

            System.out.println("ENTER YOUR CHOICE:");
            int choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                     System.out.println("ENTER RADIUS:");
                     Double radius=sc.nextDouble();
                     System.out.println("CIRCLE OF AREA="+obj1.circle(radius));
                     break;
                case 2:
                    System.out.println("ENTER BASE:");
                    Double base=sc.nextDouble();
                    System.out.println("ENTER HEIGHT:");
                    Double height=sc.nextDouble();
                    System.out.println("TRIANGLE OF AREA="+obj1.triangle(base,height));
                    break;
                case 3:
                    System.out.println("ENTER SIDES OF AN SQUARE:");
                    Double a=sc.nextDouble();
                    System.out.println("SQUARE OF AREA="+obj1.square(a));
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("INVALID CHOICE....");
            }
        }
    }
}