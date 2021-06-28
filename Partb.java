import java.util.Scanner;

public class Partb {
	String name, stud_add, stud_phoneno, stud_emailid, branch;
	double tfees, ad_fee, tution_fees, fee1;
	static String college, address, phoneno;
	static {
		college = "RVCE";
		address = "kengeri, bengaluru";
		phoneno = "1234567890";
	}
         Partb(String name2, String add, String phoneno2, String emailid2, String branch2) {
		this.name = name2;
		this.stud_add = add;
		this.stud_phoneno = phoneno2;
		this.stud_emailid = emailid2;
		this.branch = branch2;
	}

	Partb(String name2, String add, String branch2) {
		this.name = name2;
		this.stud_add = add;
		this.stud_phoneno = phoneno;
		this.stud_emailid = "" + name + "@rvce.edu.in";
		this.branch = branch2;
	}

	public double fee(String branch2) {
		this.ad_fee = 25000;
		this.tution_fees = 25000;
		this.fee1 = 10000;
		tfees = ad_fee + tution_fees + fee1;
		if (branch.equalsIgnoreCase("BE")) {
			tfees += 30000;
		}else {
			tfees += 25000;
		}
		return tfees;
	}

	public void display() {
		System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno+" emailid: "+stud_emailid+" branch:"+branch);
	}

	public void display(String branch) {
		double feecal = this.fee(branch);
		System.out.println("Total fees for the branch: "+branch+" total fees:"+feecal);
	}

	public void display(int no_of_fields) {
		if(no_of_fields==3) {
			System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno);
		}else {
			System.out.println("Name: "+name+" \n Address: "+address+" \n phone no: "+phoneno+" emailid: "+stud_emailid+" branch:"+branch);
		}		
	}

	public static void main(String args[]) {
		Partb si;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the student details");
			System.out.println("enter the name");
			String name = sc.next();
			System.out.println("enter the address");
			String add = sc.next();
			System.out.println("enter the branch");
			String branch = sc.next();
			System.out.println("would you like to enter emailid and phoneno");
			int choice = sc.nextInt();
			if (choice == 1) {
				System.out.println("enter the phoneno");
				String phoneno = sc.next();
				System.out.println("enter the emailid");
				String emailid = sc.next();
				si = new Partb(name, add, phoneno, emailid, branch);
			} else {
				si = new Partb(name, add, branch);
			}
			System.out.println("would you like to display");
			System.out.println("1. display all details");
			System.out.println("2. display total branch fees");
			System.out.println("3. display selected fields");
			choice = sc.nextInt();
			if (choice == 1) {
				si.display();
			} else if (choice == 2) {
				System.out.println("enter the branch");
				branch = sc.next();
				si.display(branch);
			} else if (choice == 3) {
				System.out.println("enter the no of fields(3 or 5) to display");
				int nooffields = sc.nextInt();
				si.display(nooffields);
			} else {
				System.out.println("Wrong choice");
			}
			System.out.println("enter the choice 1. continue 2. exit");
			choice = sc.nextInt();
			if (choice == 2) {
				break;
			}
		}
	}
}