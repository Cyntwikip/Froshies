package giveright.database.dao;

import giveright.database.DBConnection;
import giveright.entity.Organizer;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class OrganizerDAO {

	private DBConnection connection;

	public OrganizerDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createOrganizer(Organizer organizer) {
		try {
			String query = "INSERT INTO organizer ("
					+ "idAccount, "
					+ "name, "
					+ "contactNumber1, "
					+ "contactNumber2) VALUES (?,?,?,?)";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, organizer.getIdAccount());
			statement.setString(2, organizer.getName());
			statement.setString(3, organizer.getContactNumber1());
			statement.setString(4, organizer.getContactNumber2());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
