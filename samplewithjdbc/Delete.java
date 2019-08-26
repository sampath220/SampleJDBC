package samplewithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void deleteData(Statement st) throws SQLException {
			st.executeUpdate("delete from student where sid=10");
	}

}
