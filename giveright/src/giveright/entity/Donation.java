package giveright.entity;

import java.sql.Date;
import java.sql.Timestamp;

public class Donation {
	private int					idDonation;
	private int					idBatch;
	private int					idReliefOperation;
	private int					idVolunteer;
	private String				name;
	private int					quantity;
	private String				status;
	private Date				dateDonated;
	private Date				timestamp;

	public static final String	STATUS_PENDING	= "Pending";
	public static final String	STATUS_DONATED	= "Donated";

	public int getIdDonation() {
		return idDonation;
	}

	public void setIdDonation(int idDonation) {
		this.idDonation = idDonation;
	}

	public int getIdBatch() {
		return idBatch;
	}

	public void setIdBatch(int idBatch) {
		this.idBatch = idBatch;
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

	public Date getDateDonated() {
		return dateDonated;
	}

	public void setDateDonated(Date dateDonated) {
		this.dateDonated = dateDonated;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public int getIdVolunteer() {
		return idVolunteer;
	}

	public void setIdVolunteer(int idVolunteer) {
		this.idVolunteer = idVolunteer;
	}
}
