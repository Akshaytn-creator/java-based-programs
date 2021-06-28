import java.util.Scanner;
public class LAB1
{
    Scanner sc = new Scanner(System.in);
    private String usn;
    private String name;
    private String address;
    private String emailid;
    private String branch;
    private double feestructure;
    private double admissionfee;
    private double otherfee;

    public LAB1(){
    }
    public LAB1(String usn, String name, String address, String emailid, String branch, double feestructure, double admissionfee,double otherfee)
    {

        this.usn = usn;
        this.name = name;
        this.address = address;
        this.emailid = emailid;
        this.branch = branch;
        this.feestructure = feestructure;
        this.admissionfee = admissionfee;
        this.otherfee = otherfee;
    }
    public void LAB1_details()
    {
        System.out.println("ENTER YOUR USN NUMBER:");
        usn=sc.nextLine();
        System.out.println("ENTER YOUR NAME:");
        name = sc.nextLine();
        System.out.println("ENTER YOUR HOME ADDRESS:");
        address = sc.nextLine();
        System.out.println("ENTER YOUR PERSONAL EMAIL-ID");
        emailid = sc.nextLine();
        System.out.println("ENTER YOUR CURRENT BRANCH:");
        branch = sc.nextLine();
        System.out.println("ENTER ADMISSION FEE:");
        admissionfee = sc.nextDouble();
        System.out.println("ENTER OTHER FEE:");
        otherfee = sc.nextDouble();
        feestructure = admissionfee + otherfee;
    }
    public void display(){
        System.out.println("THE USN="+this.usn);
        System.out.println("THE NAME IS:"+this.name);
        System.out.println("THE HOME ADDRESS IS:"+this.address);
        System.out.println("THE PERSONAL EMAILID IS:"+this.emailid);
        System.out.println("THE BRANCH IS:"+this.branch);
        System.out.println("THE FEE STRUCTURE IS:"+this.feestructure);
        System.out.println("THE ADMISSION FEE IS:"+this.admissionfee);
        System.out.println("THE OTHER FEE IS:"+this.otherfee);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        LAB1 obj = new LAB1();
        while (true) {
            System.out.println("1.ENTER THE STUDENT DETAILS");
            System.out.println("2.DISPLAY DETAILS");
            System.out.println("3.EXIT");
            System.out.println("PLEASE ENTER YOUR CHOICE:");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.LAB1_details();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("INVALID INPUT PLEASE TRY AGAIN LATER!!!");
            }

        }
    }
}