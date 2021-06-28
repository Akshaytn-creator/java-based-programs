import java.util.Scanner;
public class Student {

	String usn, name, address, emailid, branch;
	double tfees, ad_fee, tution_fees, fee1;
	Scanner sc = new Scanner(System.in);
	
	public Student(String usn, String name, String address, String emailid, String branch, double tfees,
			double ad_fee, double tution_fees, double fee1) {
		this.usn = usn;
		this.name = name;
		this.address = address;
		this.emailid = emailid;
		this.branch = branch;
		this.tfees=tfees;
		this.ad_fee=ad_fee;
		this.tution_fees=tution_fees;
		this.fee1=fee1;
	}
	
	public void displayStudentDetails() {
		System.out.println("----------------------------------  ");
		System.out.println("Student information are as follows: ");
		System.out.println("----------------------------------  ");
		System.out.println("usn: "+usn);
		System.out.println("name: "+name);
		System.out.println("address: "+address);
		System.out.println("emailid: "+emailid);
		System.out.println("branch: "+branch);
	}
	
	public void calculateFee() {
		System.out.println("---------------------------");
		System.out.println("Fee Details are as follows:");
		System.out.println("---------------------------");
		System.out.println("tfees: "+tfees);
		System.out.println("ad_fee: "+ad_fee);
		System.out.println("tution_fees: "+tution_fees);
		System.out.println("fee1: "+fee1);
		System.out.println("Total fee: "+(tfees+ad_fee+tution_fees+fee1));
	}
}