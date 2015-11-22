package giveright.entity;

public class Volunteer {
	private int		idVolunteer;
	private int		idAccount;
	private int		volunteerType;
	private String	firstName;
	private String	lastName;
	private String	organizationName;
	private String	contactNumber1;
	private String	contactNumber2;
	private String	region;
	private String	province;
	private String	city;
	
	public int getBirthmonth() {
		return birthmonth;
	}

	public void setBirthmonth(int birthmonth) {
		this.birthmonth = birthmonth;
	}

	public int getBirthyear() {
		return birthyear;
	}

	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}

	private int		birthmonth;
	private int		birthyear;
	
	public static final int VOLUNTEER_INDIVIDUAL = 0;
	public static final int VOLUNTEER_ORGANIZATION = 1;
	
	public int getIdVolunteer() {
		return idVolunteer;
	}

	public void setIdVolunteer(int idVolunteer) {
		this.idVolunteer = idVolunteer;
	}

	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public int getVolunteerType() {
		return volunteerType;
	}

	public void setVolunteerType(int volunteerType) {
		this.volunteerType = volunteerType;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
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

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
