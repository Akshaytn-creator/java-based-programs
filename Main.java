interface staff_Op {
	public void calculate_salary();
}

interface student_Op{
	public void calculate_fees();
}

class person{
	String name,address,phone_no,email_id;
	person(String name, String address, String phone_no, String email_id){
		this.name = name;
		this.address = address;
		this.phone_no = phone_no;
		this.email_id = email_id;
	}
	  void display(){
		  System.out.println("Name is :" + this.name);
		  System.out.println("Address is :" + this.address);
		  System.out.println("Phone_no is :" + this.phone_no);
		  System.out.println("Email_id is :" + this.email_id);
	
		  	}
}


class student extends person implements student_Op{
	String usn,branch;
	student(String usn, String branch, String name, String address , String phone_no, String email_id){
		super(name, address, phone_no, email_id);
		this.usn = usn;
		this.branch = branch;
	}
	public void calculate_fees(){
             //System.out.println("the total fee is")
                }
}

class staff extends person implements staff_Op{
	String company,Emp_id,designation;
	staff(String company, String Emp_id, String designation,  String name, String address , String phone_no, String email_id){
		super(name, address, phone_no, email_id);
		this.company = company;
		this.Emp_id = Emp_id;
		this.designation = designation;
	}
	public double calculate_salary(){
		return 50000;
	}
void display()
{
System.out.println("salary is:"+this.calculate_salary());
}
}
public class Main {

	public static void main(String[] args) {
		
      person p = new person("AKSHAY","TUMKUR","7899242857","akshaytn97@gmail.com");
      System.out.println();
      p.display();
      System.out.println();
      staff s = new staff("HTC","21HTC02","TESTING","AKSHAY","TUMKUR","7899242857","akshaytn97@gmail.com");
      System.out.println();
      System.out.println("EMPLOYEE DETAILS ARE AS FOLLOWS:");
      System.out.println();
      s.display();
      s.calculate_salary();
      System.out.println();
      student S = new student("RVCE20MCA069","MCA","AKSHAY","BENGALURU","7892890368","akshaytn.mca20@rvce.edu.in ");
      System.out.println();
      System.out.println("STUDENT DETAILS ARE AS FOLLOWS:");
      System.out.println();
      S.display();
      S.calculate_fees();
      
	}

}
