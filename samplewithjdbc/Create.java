package samplewithjdbc;

import java.sql.SQLException;
import java.sql.Statement;

public class Create {
	public static void createTable(Statement stm) throws SQLException {
		if (stm.executeUpdate(
				"create table student(sid int primary key,sname varchar(100)NOT NULL,address varchar(100))") == 0)
			System.out.println("Table created");
		else
			System.out.println("Creation failed");
	}

}
