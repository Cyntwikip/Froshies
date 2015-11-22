package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import giveright.database.DBConnection;
import giveright.entity.Donation;
import giveright.entity.ReliefOperation;

public class ReliefOperationDAO {

	private DBConnection connection;

	public ReliefOperationDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createReliefOperation(ReliefOperation reliefOperation) {
		try {
			String query = "INSERT INTO reliefoperation ("
					+ "name, "
					+ "startDate, "
					+ "endDate, "
					+ "status, "
					+ "locationLat, "
					+ "locationLong, "
					+ "region, "
					+ "province, "
					+ "city, "
					+ "idBeneficiary) VALUES (?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, reliefOperation.getName());
			statement.setDate(2, reliefOperation.getStartDate());
			statement.setDate(3, reliefOperation.getEndDate());
			statement.setString(4, ReliefOperation.STATUS_ONGOING);
			statement.setDouble(5, reliefOperation.getLocationLat());
			statement.setDouble(6, reliefOperation.getLocationLong());
			statement.setString(7, reliefOperation.getRegion());
			statement.setString(8, reliefOperation.getProvince());
			statement.setString(9, reliefOperation.getCity());
			statement.setInt(10, reliefOperation.getIdBeneficiary());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
