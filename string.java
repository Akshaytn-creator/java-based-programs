import java.util.Scanner;
class string
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("ENTER 1ST STRING VALUE");
String str1 = sc.nextLine();
System.out.println("ENTER 2ND STRING VALUE");
String str2 = sc.nextLine();
System.out.println("1. THE SUBSTRING OF FIRST STRING IS:"+str1.substring(5,10));
System.out.println("2.THE LENGTH OF SECOND STRING IS:"+str2.length());
System.out.println("3.THE LENGTH OF FIRST STRING IS:"+str1.length());
System.out.println("4.COMPARING FIRST AND SECOND STRING");
if(str1.equals(str2))
System.out.println("both the strings are equal");
else
System.out.println("both the strings are not equal");
}
}





