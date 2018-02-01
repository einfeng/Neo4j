package com.ace.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbc {

	public static void main(String[] args) {
		try {
			Connection con = DriverManager.getConnection("jdbc:neo4j:bolt://192.168.56.201", "neo4j", "EINzhao,123");
			Statement stmt = con.createStatement();

			ResultSet rs = stmt.executeQuery("MATCH (n) RETURN n");
			
			stmt.executeUpdate("");
			
			System.out.println(rs.getMetaData().getColumnName(1));
			
			while (rs.next()) {
				System.out.println(rs.getString("n"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
