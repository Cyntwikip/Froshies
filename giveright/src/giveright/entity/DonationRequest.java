package giveright.entity;

public class DonationRequest {
	private int					idDonationRequest;
	private int					idReliefOperation;
	private String				name;
	private int					quantity;
	private String				status;

	public static final String	STATUS_INNEED	= "In Need";
	public static final String	STATUS_FINISHED	= "Finished";

	public int getIdDonationRequest() {
		return idDonationRequest;
	}

	public void setIdDonationRequest(int idDonationRequest) {
		this.idDonationRequest = idDonationRequest;
	}

	public int getIdReliefOperation() {
		return idReliefOperation;
	}

	public void setIdReliefOperation(int idReliefOperation) {
		this.idReliefOperation = idReliefOperation;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
