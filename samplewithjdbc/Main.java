package samplewithjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:sqlserver://GGKu2ser6;databaseName=sampath", "sample",
					"Asdf@123");
			Statement stm = con.createStatement();
			Create.createTable(stm);
			System.out.println("--------Insertion------");
			Insert.insertData(stm);
			Select.printData(stm);
			System.out.println("---- After Updating city of sid=1-------");
			Update.updateData(stm);
			Select.printData(stm);
			System.out.println("---- After deleting sid=10-------");
			Delete.deleteData(stm);
			Select.printData(stm);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
