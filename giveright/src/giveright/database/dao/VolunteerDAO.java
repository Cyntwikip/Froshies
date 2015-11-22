package giveright.database.dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.text.DateFormatter;

import giveright.database.DBConnection;
import giveright.entity.Account;
import giveright.entity.Volunteer;

public class VolunteerDAO {

	private DBConnection connection;

	public VolunteerDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createVolunteer(Volunteer volunteer) {
		try {
			String query = "INSERT INTO volunteer ("
					+ "idAccount, "
					+ "volunteerType, "
					+ "firstName, "
					+ "lastName, "
					+ "organizationName, "
					+ "contactNumber1, "
					+ "contactNumber2, "
					+ "region, "
					+ "province, "
					+ "city) VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, volunteer.getIdAccount());
			statement.setInt(2, volunteer.getVolunteerType());
			statement.setString(3, volunteer.getFirstName());
			statement.setString(4, volunteer.getLastName());
			statement.setString(5, volunteer.getOrganizationName());
			statement.setString(6, volunteer.getContactNumber1());
			statement.setString(7, volunteer.getContactNumber2());
			statement.setString(8, volunteer.getRegion());
			statement.setString(9, volunteer.getProvince());
			statement.setString(10, volunteer.getCity());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Volunteer retrieveVolunteer(int idVolunteer) {
		try {
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM volunteer WHERE idVolunteer = ?";

			statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idVolunteer);
			rs = statement.executeQuery();
			if (rs.next()) {
				Volunteer volunteer = new Volunteer();
				volunteer.setIdVolunteer(rs.getInt("idVolunteer"));
				volunteer.setIdAccount(rs.getInt("idAccount"));
				
				volunteer.setVolunteerType(rs.getInt("volunteerType"));
				if(volunteer.getVolunteerType() == Volunteer.VOLUNTEER_INDIVIDUAL) {
					volunteer.setFirstName(rs.getString("firstName"));
					volunteer.setLastName(rs.getString("lastName"));
				}else {
					volunteer.setOrganizationName(rs.getString("organizatioName"));
				}
				
				volunteer.setRegion(rs.getString("region"));
				volunteer.setProvince(rs.getString("province"));
				volunteer.setCity(rs.getString("city"));
				volunteer.setContactNumber1(rs.getString("contactNumber1"));
				volunteer.setContactNumber2(rs.getString("contactNumber2"));
				return volunteer;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public ArrayList<Volunteer> getAllVolunteers() {
		ArrayList<Volunteer> volunteerList = new ArrayList<Volunteer>();

		try {
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM volunteer";

			statement = connection.getConnection().prepareStatement(query);
			rs = statement.executeQuery();
			
			while (rs.next()) {
				Volunteer volunteer = new Volunteer();
				volunteer.setIdVolunteer(rs.getInt("idVolunteer"));
				volunteer.setIdAccount(rs.getInt("idAccount"));
				
				volunteer.setVolunteerType(rs.getInt("volunteerType"));
				if(volunteer.getVolunteerType() == Volunteer.VOLUNTEER_INDIVIDUAL) {
					volunteer.setFirstName(rs.getString("firstName"));
					volunteer.setLastName(rs.getString("lastName"));
				}else {
					volunteer.setOrganizationName(rs.getString("organizatioName"));
				}
				
				volunteer.setRegion(rs.getString("region"));
				volunteer.setProvince(rs.getString("province"));
				volunteer.setCity(rs.getString("city"));
				volunteer.setContactNumber1(rs.getString("contactNumber1"));
				volunteer.setContactNumber2(rs.getString("contactNumber2"));
				volunteerList.add(volunteer);
			} 
			
			return volunteerList;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
}
