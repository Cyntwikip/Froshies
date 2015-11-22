package giveright.entity;

import java.sql.Date;

public class Batch {
	private int		idBatch;
	private int		idReliefOperation;
	private int		batchNumber;
	private String	status;
	private Date	dateDelivered;
	
	public static final String STATUS_ONGOING = "Ongoing";
	public static final String STATUS_ENROUTE = "Enroute";
	public static final String STATUS_DELIVERED = "Delivered";
	public static final String STATUS_LOST = "Lost";

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getDateDelivered() {
		return dateDelivered;
	}

	public void setDateDelivered(Date dateDelivered) {
		this.dateDelivered = dateDelivered;
	}

	public int getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(int batchNumber) {
		this.batchNumber = batchNumber;
	}
}
