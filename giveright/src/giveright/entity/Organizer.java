package giveright.entity;

public class Organizer {
	private int		idOrganizer;
	private int		idAccount;
	private String	name;
	private String	contactNumber1;
	private String	contactNumber2;

	public int getIdOrganizer() {
		return idOrganizer;
	}

	public void setIdOrganizer(int idOrganizer) {
		this.idOrganizer = idOrganizer;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNumber1() {
		return contactNumber1;
	}

	public void setContactNumber1(String contactNumber1) {
		this.contactNumber1 = contactNumber1;
	}

	public String getContactNumber2() {
		return contactNumber2;
	}

	public void setContactNumber2(String contactNumber2) {
		this.contactNumber2 = contactNumber2;
	}
}
