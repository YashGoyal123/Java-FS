package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lpujdbc","root","Ya@12111975");
		Statement st = con.createStatement();
//		int n = st.executeUpdate("insert into employee values(105,'Ajit',23,56000)");
//		int n = st.executeUpdate("delete from employee where id = 102");
		int n = st.executeUpdate("Update employee set name = 'Abhas' where id = 103");
		System.out.println(n+" no of record are inserted in the employee table");
		con.close();
	}

}
