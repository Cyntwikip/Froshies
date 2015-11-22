package giveright.services;

import java.util.ArrayList;

import giveright.database.dao.AccountDAO;
import giveright.database.dao.DonationDAO;
import giveright.database.dao.VolunteerWorkDAO;
import giveright.entity.Donation;
import giveright.entity.VolunteerWork;

public class VolunteerService {
	private DonationDAO			donationDAO;
	private AccountDAO			accountDAO;
	private VolunteerWorkDAO	volunteerWorkDAO;

	public VolunteerService() {
		donationDAO = new DonationDAO();
		accountDAO = new AccountDAO();
		volunteerWorkDAO = new VolunteerWorkDAO();
	}

	public void submitDonation(String username, String donationName, int donationQuantity, int idReliefOperation, int idBatch) {

	}

	public void confirmDonationDonated(int idDonation) {
		donationDAO.updateDonationStatus(idDonation, Donation.STATUS_DONATED);
	}
	
	public void confirmVolunteerWorkCompletion(int idVolunteerWork) {
		volunteerWorkDAO.updateVolunteerWorkStatus(idVolunteerWork, VolunteerWork.STATUS_COMPLETED);
	}
	
	public void confirmVolunteerWorkInProgress(int idVolunteerWork) {
		volunteerWorkDAO.updateVolunteerWorkStatus(idVolunteerWork, VolunteerWork.STATUS_INPROGRESS);
	}

	public ArrayList<Donation> getAllDonationByUsername(String username) {
		return donationDAO.getDonationByUsername(username);
	}
}
