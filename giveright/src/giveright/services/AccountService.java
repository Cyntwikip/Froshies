package giveright.services;

import giveright.database.dao.AccountDAO;
import giveright.database.dao.OrganizerDAO;
import giveright.database.dao.VolunteerDAO;
import giveright.entity.Account;
import giveright.entity.Organizer;
import giveright.entity.Volunteer;

public class AccountService {
	private AccountDAO		accountDAO;
	private VolunteerDAO	volunteerDAO;
	private OrganizerDAO	organizerDAO;
	
	public AccountService() {
		accountDAO = new AccountDAO();
		volunteerDAO = new VolunteerDAO();
		organizerDAO = new OrganizerDAO();
	}
	
	public boolean authenticateAccount(String username, String password) {
		return accountDAO.login(username, password);
	}
	
	public int getAccountType(String username) {
		return accountDAO.retrieveAccount(username).getAccountType();
	}
	
	public void createNewOrganizer(String username, String password, String email, String name, String contactNumber1, String contactNumber2) {	
		Account account = new Account();
		account.setAccountType(Account.ACCOUNT_ORGANIZER);
		account.setUsername(username);
		account.setPassword(password);
		account.setEmail(email);
		
		accountDAO.createAccount(account);
		int idAccount = accountDAO.getLatestIDAccount();
		
		Organizer organizer = new Organizer();
		organizer.setIdAccount(idAccount);
		organizer.setName(name);
		organizer.setContactNumber1(contactNumber1);
		organizer.setContactNumber2(contactNumber2);
		
		organizerDAO.createOrganizer(organizer);
	}
	
	public void createNewVolunteerIndividual(String username, String password, String email, String firstName, String lastName, String contactNumber1, String contactNumber2, String region, String province, String city) {	
		Account account = new Account();
		account.setAccountType(Account.ACCOUNT_VOLUNTEER);
		account.setUsername(username);
		account.setPassword(password);
		account.setEmail(email);
		
		accountDAO.createAccount(account);
		int idAccount = accountDAO.getLatestIDAccount();
		
		Volunteer volunteer = new Volunteer();
		volunteer.setIdAccount(idAccount);
		volunteer.setVolunteerType(Volunteer.VOLUNTEER_INDIVIDUAL);
		volunteer.setFirstName(firstName);
		volunteer.setLastName(lastName);
		volunteer.setContactNumber1(contactNumber1);
		volunteer.setContactNumber2(contactNumber2);
		volunteer.setRegion(region);
		volunteer.setProvince(province);
		volunteer.setCity(city);
		
		volunteerDAO.createVolunteer(volunteer);
	}
	
	public void createNewVolunteerOrganization(String username, String password, String email, String organizationName, String contactNumber1, String contactNumber2, String region, String province, String city) {	
		Account account = new Account();
		account.setAccountType(Account.ACCOUNT_VOLUNTEER);
		account.setUsername(username);
		account.setPassword(password);
		account.setEmail(email);
		
		accountDAO.createAccount(account);
		int idAccount = accountDAO.getLatestIDAccount();
		
		Volunteer volunteer = new Volunteer();
		volunteer.setIdAccount(idAccount);
		volunteer.setVolunteerType(Volunteer.VOLUNTEER_ORGANIZATION);
		volunteer.setOrganizationName(organizationName);
		volunteer.setContactNumber1(contactNumber1);
		volunteer.setContactNumber2(contactNumber2);
		volunteer.setRegion(region);
		volunteer.setProvince(province);
		volunteer.setCity(city);
		
		volunteerDAO.createVolunteer(volunteer);
	}
	
	
}
