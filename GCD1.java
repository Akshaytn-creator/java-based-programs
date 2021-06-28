import java.util.Scanner;  
public class GCD1  
{   
public static void main(String[] args)   
{  
int x, y, gcd = 0;  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the 1st number");  
x = sc.nextInt();     
System.out.print("Enter the 2nd number");  
y = sc.nextInt();  
gcd = findGCD(x, y);  
System.out.println("GCD of " + x + " and " + y + " =  " + gcd);  
}  
public static int GCD2(int a, int b)  
{  
while(b != 0)  
{  
if(a > b)  
{  
a = a - b;  
}  
else  
{  
b = b - a;  
}  
}  
return a;  
}  
}  