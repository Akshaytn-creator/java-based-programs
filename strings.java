import java.util.*;
public class strings
{
  public static void main(String args[])
  {
    String actual, reverse = "";
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a string to reverse");
    actual = sc.nextLine();

    int length = actual.length();

    for (int i = length - 1 ; i >= 0 ; i--)
      reverse = reverse + actual.charAt(i);

    System.out.println("Reverse of the string: " + reverse);
  }
}