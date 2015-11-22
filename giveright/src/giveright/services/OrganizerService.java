package giveright.services;

import giveright.database.dao.ReliefOperationDAO;
import giveright.entity.ReliefOperation;

public class OrganizerService {
	
	private ReliefOperationDAO reliefOperationDAO;
	
	public OrganizerService() {
		reliefOperationDAO = new ReliefOperationDAO();
	}
	
	public void createNewReliefOperation(int idOrganizer, int idBeneficiary, String name, String region, String province, String city, double locationLong, double locationLat) {
		ReliefOperation reliefOperation = new ReliefOperation();
		reliefOperationDAO.createReliefOperation(reliefOperation);
	}
}
