package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import giveright.database.DBConnection;
import giveright.entity.Account;

public class AccountDAO {

	private DBConnection	connection;

	public AccountDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}

	public void createAccount(Account account) {
		try {
			Statement statement;
			String query = "INSERT INTO account (accountType, username, password, email, timestamp) VALUES (" + account.getAccountType() + ",\'" + account.getUsername() + "\',\'" + account.getPassword() + "\',\'" + account.getEmail() + "\', curdate())";

			statement = connection.getConnection().createStatement();
			statement.execute(query);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Account retrieveAccount(int id) {
		try {
			Account account;
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM account WHERE idAccount = ?";

			statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			if (rs.next()) {
				account = new Account();
				account.setAccountType(rs.getInt("accountType"));
				account.setEmail(rs.getString("email"));
				account.setUsername(rs.getString("username"));
				account.setIdAccount(rs.getInt("idAccount"));
				return account;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public Account retrieveAccount(String username) {
		try {
			Account account;
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM account WHERE username = ?";

			statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, username);
			rs = statement.executeQuery();
			if (rs.next()) {
				account = new Account();
				account.setAccountType(rs.getInt("accountType"));
				account.setEmail(rs.getString("email"));
				account.setUsername(rs.getString("username"));
				account.setIdAccount(rs.getInt("idAccount"));
				return account;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean login(String username, String password) {
		try {
			Account account;
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM account WHERE username = ? AND password = ?";

			statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, username);
			statement.setString(2, password);
			rs = statement.executeQuery();
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	public int getLatestIDAccount() {
		try {
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT MAX(idAccount) FROM account";

			statement = connection.getConnection().prepareStatement(query);
			rs = statement.executeQuery();
			if (rs.next()) {
				int idAccount = rs.getInt(1);
				return idAccount;
			} else {
				return -1;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return -1;
	}
}
