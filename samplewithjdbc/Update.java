package samplewithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void updateData(Statement st) throws SQLException {
			st.executeUpdate("update student set address='Mumbai' where sid=1");
	}
}
