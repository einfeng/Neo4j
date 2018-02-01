package com.ace.driver;

import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.StatementResult;

public class Main {

	public static void main(String[] args) {

		Neo4jTest neo4j = new Neo4jTest("bolt://192.168.56.201:7687", "neo4j", "EINzhao,123");

		neo4j.connect();

		String sql = "match (n:Host) return n";

		StatementResult rs = neo4j.neo4jQuery(sql);
		
		
		//rs.consume();
		
		//System.out.println(rs.list());

		while (rs.hasNext()) {
			Record record = rs.next();
			
			System.out.println(record.get("n.ci_name"));
		}

		neo4j.close();

	}

}
