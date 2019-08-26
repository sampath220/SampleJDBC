package samplewithjdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void insertData(Statement st) throws SQLException {
		st.executeUpdate("insert into student values(1,'Sam','Hyderabad')");
		st.executeUpdate("insert into student values(2,'John','Kolkata')");
		st.executeUpdate("insert into student values(3,'Mark','Chennai')");
		st.executeUpdate("insert into student values(4,'Jack','Pune')");
		st.executeUpdate("insert into student values(5,'Helen','Hyderabad')");
		st.executeUpdate("insert into student values(6,'Raju','Hyderabad')");
		st.executeUpdate("insert into student values(7,'Ravi','Delhi')");
		st.executeUpdate("insert into student values(8,'Ramesh','Pune')");
		st.executeUpdate("insert into student values(9,'Rahul','Chennai')");
		st.executeUpdate("insert into student values(10,'Suresh','Mumbai')");
		System.out.println("Insertion executed successfully");
	}
}
