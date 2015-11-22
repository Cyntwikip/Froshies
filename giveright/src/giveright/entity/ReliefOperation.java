package giveright.entity;

import java.sql.Date;

public class ReliefOperation {
	private int					idReliefOperation;
	private int					idBeneficiary;
	private int					idOrganizer;
	private String				name;
	private Date				startDate;
	private Date				endDate;
	private String				status;
	private double				locationLong;
	private double				locationLat;
	private String				region;
	private String				province;
	private String				city;

	public static final String	STATUS_ONGOING	= "Ongoing";
	public static final String	STATUS_FINISHED	= "Finished";

	public int getIdReliefOperation() {
		return idReliefOperation;
	}

	public void setIdReliefOperation(int idReliefOperation) {
		this.idReliefOperation = idReliefOperation;
	}

	public int getIdBeneficiary() {
		return idBeneficiary;
	}

	public void setIdBeneficiary(int idBeneficiary) {
		this.idBeneficiary = idBeneficiary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public double getLocationLong() {
		return locationLong;
	}

	public void setLocationLong(double locationLong) {
		this.locationLong = locationLong;
	}

	public double getLocationLat() {
		return locationLat;
	}

	public void setLocationLat(double locationLat) {
		this.locationLat = locationLat;
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
