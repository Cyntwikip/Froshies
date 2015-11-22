package giveright.entity;

public class Beneficiary {
	private int		idBeneficiary;
	private String	region;
	private String	province;
	private String	city;
	private int		familyCount;

	public int getIdBeneficiary() {
		return idBeneficiary;
	}

	public void setIdBeneficiary(int idBeneficiary) {
		this.idBeneficiary = idBeneficiary;
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

	public int getFamilyCount() {
		return familyCount;
	}

	public void setFamilyCount(int familyCount) {
		this.familyCount = familyCount;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}
}
