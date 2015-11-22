package giveright.services;

import java.util.ArrayList;

import giveright.database.dao.DonationDAO;
import giveright.database.dao.DonationRequestDAO;
import giveright.database.dao.VolunteerDAO;
import giveright.database.dao.VolunteerRequestDAO;
import giveright.database.dao.VolunteerWorkDAO;
import giveright.entity.Donation;
import giveright.entity.DonationRequest;
import giveright.entity.VolunteerRequest;
import giveright.entity.VolunteerWork;

public class ReliefOperationService {
	private DonationDAO donationDAO;
	private VolunteerWorkDAO volunteerWorkDAO;
	private DonationRequestDAO donationRequestDAO;
	private VolunteerRequestDAO volunteerRequestDAO;
	
	public ReliefOperationService() {
		donationDAO = new DonationDAO();
		donationRequestDAO = new DonationRequestDAO();
		volunteerRequestDAO = new VolunteerRequestDAO();
	}
	
	public int countTotalDonations(String name, int idReliefOperation) {
		ArrayList<Donation> donationList = donationDAO.getDonationByReliefOperation(idReliefOperation);
		int donationCount = 0;
		for (Donation donation : donationList) {
			if(	donation.getStatus().equals(Donation.STATUS_DONATED) && donation.getName().equals(name)) {
				donationCount++;
			}
		}
		return donationCount;
	}
	
	public int countCurrentVolunteer(String task, int idReliefOperation) {
		ArrayList<VolunteerWork> volunteerWorkList = volunteerWorkDAO.getVolunteerWorkByReliefOperation(idReliefOperation);
		int volunteerWorkCount=0;
		for (VolunteerWork volunteerWork : volunteerWorkList) {
			if(	volunteerWork.getStatus().equals(VolunteerWork.STATUS_INPROGRESS) && volunteerWork.getTask().equals(task)) {
				volunteerWorkCount++;
			}
		}
		return volunteerWorkCount;
	}
	
	public int countTotalVolunteers(String task, int idReliefOperation) {
		ArrayList<VolunteerWork> volunteerWorkList = volunteerWorkDAO.getVolunteerWorkByReliefOperation(idReliefOperation);
		int volunteerWorkCount=0;
		for (VolunteerWork volunteerWork : volunteerWorkList) {
			if(	!(volunteerWork.getStatus().equals(VolunteerWork.STATUS_PENDING)) && volunteerWork.getTask().equals(task)) {
				volunteerWorkCount++;
			}
		}
		return volunteerWorkCount;
	}
	
	public ArrayList<DonationRequest> donationsNeeded(int idReliefOperation) {
		return donationRequestDAO.getDonationRequestByReliefOperation(idReliefOperation);
	}
	
	public ArrayList<VolunteerRequest> getVolunteerRequestByReliefEffort(int idReliefEffort) {
		return volunteerRequestDAO.getVolunteerRequestByReliefOperation(idReliefEffort);
	}
}
