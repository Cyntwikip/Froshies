package giveright.entity;

public class Account {
	private int		idAccount;
	private int		accountType;
	private String	username;
	private String	password;
	private String	email;

	public static final int ACCOUNT_VOLUNTEER = 0;
	public static final int ACCOUNT_ORGANIZER = 1;
	
	public int getIdAccount() {
		return idAccount;
	}

	public void setIdAccount(int idAccount) {
		this.idAccount = idAccount;
	}

	public int getAccountType() {
		return accountType;
	}

	public void setAccountType(int accountType) {
		this.accountType = accountType;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
