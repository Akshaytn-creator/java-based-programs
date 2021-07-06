package pack1;
import java.util.Scanner;
public class TestDB
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ConnectionDB obj=new ConnectionDB();
        obj.createConnection();
        while(true)
        {
            System.out.println("1.PLEASE INSERT VALUE:");
            System.out.println("2.PLEASE UPDATE VALUE:");
            System.out.println("3.PLEASE SEARCH VALUE BASED ON YOUR USN:");
            System.out.println("4.PLEASE DELETE VALUE BASED ON USN:");
            System.out.println("5.EXIT...");

            System.out.println("ENTER YOUR CHOICE:");
            int ch=sc.nextInt();
            switch (ch)
            {
                case 1:
                	
                    obj.insertData();
                    obj.displayData();
                    break;
                case 2:
                	obj.displayData();
                	obj.updateByUsn();
                	obj.displayData();
                    break;
                case 3:
                	obj.searchByUsn();
                    break;
                case 4:
                	obj.deleteByUsn();
                	obj.displayData();
                    break;
                case 5:
                	obj.closeConnection();
                    System.exit(0);break;
                default:
                    System.out.println("WRONG CHOICE....");

            }
        }

    }
}