package giveright.database;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private String	driverName	= "com.mysql.jdbc.Driver";
	private String	url			= "jdbc:mysql://localhost:3306/";
	private String	database	= "give_right_db";
	private String	username	= "root";
	private String	password	= "1234";

	public Connection getConnection() {
		try {
			Class.forName(driverName);
			Connection con = DriverManager.getConnection(getUrl() + getDatabase(), getUsername(), getPassword());
			return con;
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDatabase() {
		return database;
	}

	public void setDatabase(String database) {
		this.database = database;
	}
}
