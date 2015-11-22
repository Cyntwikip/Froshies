package giveright.database.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import giveright.database.DBConnection;
import giveright.entity.Beneficiary;
import giveright.entity.ReliefOperation;

public class BeneficiaryDAO {
	
	private DBConnection	connection;

	public BeneficiaryDAO() {
		connection = new DBConnection();
		connection.getConnection();
	}
	
	public void createBeneficiary(Beneficiary beneficiary) {
		try {
			String query = "INSERT INTO beneficiary ("
					+ "region, "
					+ "province, "
					+ "city, "
					+ "familyCount) VALUES (?,?,?,?)";
			
			PreparedStatement statement = connection.getConnection().prepareStatement(query);
			statement.setString(1, beneficiary.getRegion());
			statement.setString(2, beneficiary.getProvince());
			statement.setString(3, beneficiary.getCity());
			statement.setInt(4, beneficiary.getFamilyCount());
			statement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
