package pack1;
import java.util.Scanner;
import java.sql.*;

public class ConnectionDB {
	Scanner sc = new Scanner(System.in);
	Connection conn = null;
	PreparedStatement pst = null;
	Statement st = null;
	ResultSet rs = null;

	public void createConnection() {
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/javalab", "root", "tiger");

		} catch (SQLException e )
		{
			e.printStackTrace();
		}catch(ClassNotFoundException e2)
		{
			e2.printStackTrace();
		}

	}

	public void closeConnection() {

		try {
			if (conn == null)
				return;
			conn.close();
			pst.close();
			st.close();
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void updateByUsn() {
		try {
			pst = conn.prepareStatement("update student set name=? where usn=?");

			System.out.println("ENTER YOUR USN ID:");
			String usn = sc.nextLine();
			pst.setString(2, usn);

			System.out.println("ENTER YOUR NAME:");
			String name = sc.nextLine();
			pst.setString(1, name);
			

			System.out.println(pst);
			
			int b = pst.executeUpdate();
			System.out.println(String.format("Row affected %d", b));
			pst.close();

			System.out.println("Data update");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void deleteByUsn() 
	{
		try {
		 String sql = "delete from student where usn = ?";
		 pst = conn.prepareStatement(sql);
		 
		 System.out.println("Enter USN=");
			String usn = sc.nextLine();
			pst.setString(1, usn);
            pst.executeUpdate();
            System.out.println("Record delete Suceessfully");
            
		}catch(SQLException e)
		{
			e.printStackTrace();
		}
		 
	}

	public void searchByUsn() {

		try {

			pst = conn.prepareStatement("select * from student where usn=?");

			System.out.println("Enter USN=");
			String usn = sc.nextLine();
			pst.setString(1, usn);
			rs = pst.executeQuery();

			while (rs.next()) {
				String usn1 = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				Integer sem = rs.getInt(5);
				String section = rs.getString(6);
				String department = rs.getString(7);
				
				System.out.println(" Name:" + name + " USN:" + usn1 + " address:" + address +" Phone Number: "+ phone +" Semester: "+sem+" section: "+section +" Department: "+department);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public void insertData() {
		try {

			System.out.println("__________________insert data___________________");
			pst = conn.prepareStatement(
					"insert into student(usn,name,address,phone,sem,section,department) values(?,?,?,?,?,?,?)");

			System.out.println("ENTER YOUR USN:");
			String usn = sc.nextLine();
			pst.setString(1, usn);

			System.out.println("ENTER YOUR NAME:");
			String name = sc.nextLine();
			pst.setString(2, name);

			System.out.println("ENTER YOUR ADDRESS:");
			String address = sc.nextLine();
			pst.setString(3, address);

			System.out.println("ENTER YOUR CONATCT NUMBER:");
			String phone = sc.nextLine();
			pst.setString(4, phone);

			System.out.println("ENTER YOUR CURRENT SEMESTER:");
			int sem = sc.nextInt();
			pst.setInt(5, sem);

			System.out.println("ENTER YOUR PRESENT SECTION:");
			sc.nextLine();
			String section = sc.nextLine();
			pst.setString(6, section);

			System.out.println("ENTER YOUR DEPARTMENT:");
			String department = sc.nextLine();
			pst.setString(7, department);

			pst.execute();
			System.out.println("DATA INSERTED SUCCESSFULLY...");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void displayData() {
		try {
			System.out.println("______________Show Data__________________________");
			st = conn.createStatement();
			rs = st.executeQuery("select * from student");
			while (rs.next()) {
				String usn = rs.getString(1);
				String name = rs.getString(2);
				String address = rs.getString(3);
				String phone = rs.getString(4);
				String sem = rs.getString(5);
				String section = rs.getString(6);
				String department = rs.getString(7);
				System.out.println("USN:" + usn + " Name:" + name + " Address:" + address + " phone:" + phone
						+ " Semester:" + sem + " Section:" + section + " Department:" + department);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}

