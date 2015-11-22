package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giveright.database.DBConnection;
import giveright.entity.DonationRequest;
import giveright.entity.VolunteerRequest;

public class DonationRequestDAO {

	private DBConnection connection;

	public DonationRequestDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}

	public void createDonationRequest(DonationRequest donationRequest) {
		try {
			String query = "INSERT INTO donationrequest (idReliefOperation,name,quantity,status) VALUES (?,?,?,?)";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, donationRequest.getIdReliefOperation());
			statement.setString(2, donationRequest.getName());
			statement.setInt(3, donationRequest.getQuantity());
			statement.setString(4, donationRequest.getStatus());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<DonationRequest> getDonationRequestByReliefOperation(int idReliefOperation) {
		try {
			String query = 
					"SELECT * FROM "
					+ "donationRequest a, reliefoperation b "
					+ "WHERE a.idReliefOperation = b.idReliefOperation "
					+ "WHERE b.idReliefOperation = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idReliefOperation);
			ResultSet rs = statement.executeQuery();
			ArrayList<DonationRequest> donationRequestLIst = new ArrayList<DonationRequest>();
			while(rs.next()) {
				DonationRequest donationRequest = new DonationRequest();
				donationRequest.setIdReliefOperation(idReliefOperation);
				donationRequest.setName(rs.getString("name"));
				donationRequest.setQuantity(rs.getInt("quantity"));
				donationRequest.setStatus(rs.getString("status"));
				donationRequestLIst.add(donationRequest);
			}
			return donationRequestLIst;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}

