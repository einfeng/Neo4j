package com.ace.driver;

import org.neo4j.driver.v1.AuthTokens;
import org.neo4j.driver.v1.Driver;
import org.neo4j.driver.v1.GraphDatabase;
import org.neo4j.driver.v1.Record;
import org.neo4j.driver.v1.Session;
import org.neo4j.driver.v1.StatementResult;
import static org.neo4j.driver.v1.Values.parameters;

public class Neo4jTest {

	private Session session;
	private Driver driver;

	private String url;
	private String username;
	private String password;

	public Neo4jTest(String url, String username, String password) {
		this.url = url;
		this.username = username;
		this.password = password;
	}

	private void connectNeo4j() {
		driver = GraphDatabase.driver(url, AuthTokens.basic(username, password));
	}

	private void createSession() {
		session = driver.session();
	}

	public void connect() {
		connectNeo4j();
		createSession();
	}

	public void neo4jDdl(String sql) {

		session.run(sql);

	}

	public StatementResult neo4jQuery(String sql) {

		StatementResult result = session.run(sql);

		return result;
	}

	private void closeSession() {
		session.close();
	}

	private void closeDriver() {
		driver.close();
	}

	public void close() {
		closeSession();
		closeDriver();
	}

}
