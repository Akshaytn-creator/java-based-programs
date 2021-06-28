import java.util.Scanner;
public class Lab2
{
 String name,address,phno,email,branch;
 static String clg_name,clg_address,clg_phno;
 static{
      clg_name="RVCOLLEGE";
      clg_address="mysore road,bangalore";
      clg_phno="2255881";
}
Lab2(){
System.out.println("INSIDE DEFAULT CONSTRUCTOR");
}
Lab2(String name,String phno,String branch)
{
   this.name=name;
   this.phno=phno;
   this.branch=branch;
}
Lab2(String name,String address,String phno,String email,String branch)
{
  this.name=name;
  this.address=address;
  this.phno=phno;
  this.email=email;
  this.branch=branch;
}
void display()
{
System.out.println("THE NAME IS:"+name);
System.out.println("THE ADDRESS IS:"+address);
System.out.println("THE PHONE NUMBER IS:"+phno);
System.out.println("THE EMAIL-ID IS:"+email);
System.out.println("THE BRANCH IS:"+branch);
System.out.println("THE COLLEGE NAME IS:"+clg_name);
System.out.println("THE COLLEGE ADDRESS IS:"+clg_address);
System.out.println("THE CONTACT NUMBER IS:"+clg_phno);
}
void display(int n)
{
  switch(n)
{
   case 1:
       System.out.println(this.name);
       break;
   
   case 2:
       System.out.println(this.name);
       System.out.println(this.address);
       break;
   case 3:
        System.out.println(this.name);
        System.out.println(this.address);
        System.out.println(this.phno);
        break; 
   case 4:
       System.out.println(this.name);
       System.out.println(this.address);
       System.out.println(this.phno);
       System.out.println(this.email);
       break;  
   case 5:
       System.out.println(this.name);
       System.out.println(this.address);
       System.out.println(this.phno);
       System.out.println(this.email);
       System.out.println(this.branch);
       break;
     default:
         System.out.println("WRONG INPUT PLEASE TRY AGAIN LATER!!!");
}
}
public static void main(String[] args)
{
 Scanner sc = new Scanner(System.in);
 System.out.println("ENTER STUDENT NAME:");
 String name= sc.nextLine();
 System.out.println("ENTER STUDENT HOME ADDRESS:");
 String address= sc.nextLine();
 System.out.println("ENTER STUDENT CONTACT NUMBER:");
 String phno= sc.nextLine();
 System.out.println("ENTER STUDENT EMAILID:");
 String email= sc.nextLine();
 System.out.println("ENTER STUDENT COURSE BRANCH:");
 String branch= sc.nextLine();
 Lab2 obj1= new Lab2();
 Lab2 obj2= new Lab2(name,phno,branch);
 Lab2 obj3= new Lab2(name,address,phno,email,branch);
 obj1.display();
 obj2.display();
 obj3.display();
 System.out.println("ENTER THE NUMBER OF FIELDS:");
 int n =sc.nextInt();
 obj3.display(n);
}
}