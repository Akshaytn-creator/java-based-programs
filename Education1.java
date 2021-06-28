import java.util.Scanner;
public class Education1
{
 String usn,name,address,emailid,branch;
 double ad_fee=200000;
 double tut_fee=150000;
 double br_fee;
 double tot_fee;
 void student_details(String usn,String name,String Address,String emailid,String branch)
 {
   this.usn=usn;
   this.name=name;
   this.address=address;
   this.emailid=emailid;
   this.branch=branch;
  }
double fee()
{
  switch(this.branch)
{
 case "1:MCA":
     this.br_fee=70000;
     break;
 case "2:COMPUTER SCIENCE":
      this.br_fee=45000;
      break;
 case "3:MECHANICAL":
       this.br_fee=30000;
      break;
}
this.tot_fee=this.ad_fee+this.tut_fee+this.br_fee;
return tot_fee;
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("ENTER YOUR USN:");
 String usn =sc.nextLine();
 System.out.println("ENTER YOUR NAME:");
 String name=sc.nextLine();
 System.out.println("ENTER YOUR HOME ADDRESS:");
 String address=sc.nextLine();
 System.out.println("ENTER YOUR PERSONAL EMAIL ID:");
 String emailid=sc.nextLine();
 System.out.println("ENTER YOUR BRANCH:");
 String branch=sc.nextLine();
 Education1 e1 = new Education1();
 e1.student_details(usn,name,address,emailid,branch);
 System.out.println("the fee "+e1.usn+" has to pay the "+e1.branch+" branch is :"+e1.fee());
}
}