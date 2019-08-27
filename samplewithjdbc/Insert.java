package samplewithjdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void insertData(Statement st) throws SQLException {
		st.addBatch("insert into student values(1,'Sam','Hyderabad')");
		st.addBatch("insert into student values(2,'John','Kolkata')");
		st.addBatch("insert into student values(3,'Mark','Chennai')");
		st.addBatch("insert into student values(4,'Jack','Pune')");
		st.addBatch("insert into student values(5,'Helen','Hyderabad')");
		st.addBatch("insert into student values(6,'Raju','Hyderabad')");
		st.addBatch("insert into student values(7,'Ravi','Delhi')");
		st.addBatch("insert into student values(8,'Ramesh','Pune')");
		st.addBatch("insert into student values(9,'Rahul','Chennai')");
		st.addBatch("insert into student values(10,'Suresh','Mumbai')");
		st.executeBatch();
		System.out.println("Insertion executed successfully");
	}
}
