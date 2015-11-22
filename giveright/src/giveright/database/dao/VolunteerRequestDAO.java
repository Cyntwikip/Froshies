package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giveright.database.DBConnection;
import giveright.entity.Donation;
import giveright.entity.VolunteerRequest;

public class VolunteerRequestDAO {

	private DBConnection connection;

	public VolunteerRequestDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createVolunteerRequest(VolunteerRequest volunteerRequest) {
		try {
			String query = "INSERT INTO volunteerrequest (idReliefOperation,task,status) VALUES (?,?,?)";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, volunteerRequest.getIdReliefOperation());
			statement.setString(2, volunteerRequest.getTask());
			statement.setString(3, volunteerRequest.getStatus());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<VolunteerRequest> getVolunteerRequestByReliefOperation(int idReliefOperation) {
		try {
			String query = 
					"SELECT * FROM "
					+ "volunteerrequest a, reliefoperation b "
					+ "WHERE a.idReliefOperation = b.idReliefOperation "
					+ "WHERE b.idReliefOperation = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idReliefOperation);
			ResultSet rs = statement.executeQuery();
			ArrayList<VolunteerRequest> volunteerRequestList = new ArrayList<VolunteerRequest>();
			while(rs.next()) {
				VolunteerRequest volunteerRequest = new VolunteerRequest();
				volunteerRequest.setIdReliefOperation(idReliefOperation);
				volunteerRequest.setTask(rs.getString("task"));
				volunteerRequest.setStatus(rs.getString("status"));
				volunteerRequestList.add(volunteerRequest);
			}
			return volunteerRequestList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}