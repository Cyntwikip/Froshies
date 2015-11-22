package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giveright.database.DBConnection;
import giveright.entity.Donation;
import giveright.entity.DonationRequest;
import giveright.entity.VolunteerWork;

public class VolunteerWorkDAO {

	private DBConnection connection;

	public VolunteerWorkDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}

	public void createVolunteerWork(VolunteerWork volunteerWork) {
		try {
			String query = "INSERT INTO volunteerwork (idvolunteer,task,status,timestamp) VALUES (?,?,?,curdate())";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void updateVolunteerWorkStatus(int idVolunteerWork, String status) {
		try {
			String query = "UPDATE volunteerwork SET status = ?";
			if(status == VolunteerWork.STATUS_COMPLETED)
				query += ", dateCompleted = curdate() ";
			query += "WHERE idvolunteerwork = ?";
			
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, status);
			statement.setInt(2, idVolunteerWork);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<VolunteerWork> getVolunteerWorkByReliefOperation(int idReliefOperation) {
		try {
			String query = "SELECT * FROM VolunteerWork WHERE i";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idReliefOperation);
			ResultSet rs = statement.executeQuery();
			ArrayList<VolunteerWork> volunteerWorkList = new ArrayList<VolunteerWork>();
			while(rs.next()) {
				VolunteerWork volunteerWork = new VolunteerWork();
				volunteerWork.setTask(rs.getString("task"));
				volunteerWork.setStatus(rs.getString("status"));
				volunteerWorkList.add(volunteerWork);
			}
			return volunteerWorkList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public ArrayList<VolunteerWork> getVolunteerByUsername(String username) {
		try {
			String query = 
					"SELECT c.* " +
					"FROM account a, volunteer b, volunteerwork c" +
					"WHERE " +
					"		a.idAccount = b.idAccount " +
					"	AND b.idVolunteer = c.idVolunteer " +
					"	AND a.username = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			ArrayList<VolunteerWork> volunteerWorkList = new ArrayList<VolunteerWork>();
			while(rs.next()) {
				VolunteerWork volunteerWork = new VolunteerWork();
				volunteerWork.setTask(rs.getString("task"));
				volunteerWork.setStatus(rs.getString("status"));
				volunteerWorkList.add(volunteerWork);
			}
			return volunteerWorkList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
