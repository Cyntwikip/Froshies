package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import giveright.database.DBConnection;
import giveright.entity.Donation;

public class DonationDAO {

	private DBConnection connection;

	public DonationDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createDonation(Donation donation) {
		try {
			String query = "INSERT INTO donation ("
					+ "idBatch, "
					+ "idReliefOperation, "
					+ "name, "
					+ "quantity, "
					+ "status, "
					+ "idVolunteer, "
					+ "timestamp) VALUES (?,?,?,?,?, curdate())";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, donation.getIdBatch());
			statement.setInt(2, donation.getIdReliefOperation());
			statement.setString(3, donation.getName());
			statement.setInt(4, donation.getQuantity());
			statement.setString(5, donation.getStatus());
			statement.setInt(6, donation.getIdVolunteer());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public Donation getDonationById(int idDonation) {
		try {
			String query = "SELECT * FROM donation WHERE idDonation = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idDonation);
			ResultSet rs = statement.executeQuery();
			if(rs.next()) {
				Donation donation = new Donation();
				donation.setIdDonation(rs.getInt("idDonation"));
				donation.setIdVolunteer(rs.getInt("idVolunteer"));
				donation.setIdBatch(rs.getInt("idBatch"));
				donation.setIdReliefOperation(rs.getInt("idReliefOperation"));
				donation.setName(rs.getString("name"));
				donation.setStatus(rs.getString("status"));
				donation.setDateDonated(rs.getDate("dateDonated"));
				return donation;
			}
			return null;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public void updateDonationStatus(int idDonation, String status) {
		try {
			String query = "UPDATE donation SET status = ?, dateDonated = curdate() WHERE idDonation = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, status);
			statement.setInt(2, idDonation);
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ArrayList<Donation> getDonationByReliefOperation(int idReliefOperation) {
		try {
			String query = "SELECT * FROM donation WHERE idReliefoperation = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, idReliefOperation);
			ResultSet rs = statement.executeQuery();
			ArrayList<Donation> donationList = new ArrayList<Donation>();
			while(rs.next()) {
				Donation donation = new Donation();
				donation.setIdDonation(rs.getInt("idDonation"));
				donation.setIdVolunteer(rs.getInt("idVolunteer"));
				donation.setIdBatch(rs.getInt("idBatch"));
				donation.setIdReliefOperation(rs.getInt("idReliefOperation"));
				donation.setName(rs.getString("name"));
				donation.setStatus(rs.getString("status"));
				donation.setDateDonated(rs.getDate("dateDonated"));
				donationList.add(donation);
			}
			return donationList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public ArrayList<Donation> getDonationByUsername(String username) {
		try {
			String query = 
					"SELECT c.* " +
					"FROM account a, volunteer b, donation c, batch d " +
					"WHERE " +
					"		a.idAccount = b.idAccount " +
					"	AND b.idVolunteer = c.idVolunteer " +
					"	AND c.idBatch = d.idBatch " +
					"	AND a.username = ?";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, username);
			ResultSet rs = statement.executeQuery();
			ArrayList<Donation> donationList = new ArrayList<Donation>();
			while(rs.next()) {
				Donation donation = new Donation();
				donation.setIdDonation(rs.getInt("idDonation"));
				donation.setIdVolunteer(rs.getInt("idVolunteer"));
				donation.setIdBatch(rs.getInt("idBatch"));
				donation.setIdReliefOperation(rs.getInt("idReliefOperation"));
				donation.setName(rs.getString("name"));
				donation.setStatus(rs.getString("status"));
				donation.setDateDonated(rs.getDate("dateDonated"));
				donationList.add(donation);
			}
			return donationList;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
