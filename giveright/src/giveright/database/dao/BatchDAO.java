package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import giveright.database.DBConnection;
import giveright.entity.Account;
import giveright.entity.Batch;

public class BatchDAO {

	private DBConnection connection;

	public BatchDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}

	public Batch retrieveBatch(int id) {
		try {
			Batch batch;
			ResultSet rs;
			PreparedStatement statement;
			String query = "SELECT * FROM batch WHERE idBatch = ?";

			statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, id);
			rs = statement.executeQuery();
			if (rs.next()) {
				batch = new Batch();
				batch.setIdBatch(rs.getInt("idBatch"));
				batch.setIdReliefOperation(rs.getInt("idReliefOperation"));
				batch.setStatus(rs.getString("status"));
				batch.setDateDelivered(rs.getDate("dateDelivered"));
				return batch;
			} else {
				return null;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public void createBatch(Batch batch) {
		try {
			PreparedStatement statement;
			String query = "INSERT INTO account (idReliefOperation, batchNumber, status) VALUES (" +
					batch.getIdReliefOperation() + 
					",\'" + Batch.STATUS_ONGOING + 
					"\'," + batch.getDateDelivered() + ")";
			statement = connection.getConnection().prepareStatement(query);
			statement.setInt(1, batch.getIdReliefOperation());
			statement.setInt(2, batch.getBatchNumber());
			statement.setString(3, batch.getStatus());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void changeBatchStatus(int idBatch, String status) {
		
	}
}
