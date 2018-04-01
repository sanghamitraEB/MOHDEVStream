package ae.gov.mohap.odm.model.BiologicalDocuments;

import java.util.Date;

public class TissueProduct {
	
	private String category;
	
	private String type;
	
	private String tissueDescription;
	
	private String itemNumbers;
	
	private String shelfLife;
	
	private int shelfLifeUnit;
	
	private int quantity;
	
	private String storageCondition;
	
	private String typeOfDonation;
	
	private String donorAge;
	
	private String donorSex;
	
	KeyValueObj donorNationality;
	
	int donorPassportNumber;
	
	private Date deathDateAndTime;
	
	private Date donationDate;
	
	private Date releaseDate;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getTissueDescription() {
		return tissueDescription;
	}

	public void setTissueDescription(String tissueDescription) {
		this.tissueDescription = tissueDescription;
	}

	public String getItemNumbers() {
		return itemNumbers;
	}

	public void setItemNumbers(String itemNumbers) {
		this.itemNumbers = itemNumbers;
	}

	public String getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(String shelfLife) {
		this.shelfLife = shelfLife;
	}

	

	public int getShelfLifeUnit() {
		return shelfLifeUnit;
	}

	public void setShelfLifeUnit(int shelfLifeUnit) {
		this.shelfLifeUnit = shelfLifeUnit;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

	public String getTypeOfDonation() {
		return typeOfDonation;
	}

	public void setTypeOfDonation(String typeOfDonation) {
		this.typeOfDonation = typeOfDonation;
	}

	public String getDonorAge() {
		return donorAge;
	}

	public void setDonorAge(String donorAge) {
		this.donorAge = donorAge;
	}

	public String getDonorSex() {
		return donorSex;
	}

	public void setDonorSex(String donorSex) {
		this.donorSex = donorSex;
	}

	public KeyValueObj getDonorNationality() {
		return donorNationality;
	}

	public void setDonorNationality(KeyValueObj donorNationality) {
		this.donorNationality = donorNationality;
	}

	public int getDonorPassportNumber() {
		return donorPassportNumber;
	}

	public void setDonorPassportNumber(int donorPassportNumber) {
		this.donorPassportNumber = donorPassportNumber;
	}

	public Date getDeathDateAndTime() {
		return deathDateAndTime;
	}

	public void setDeathDateAndTime(Date deathDateAndTime) {
		this.deathDateAndTime = deathDateAndTime;
	}

	public Date getDonationDate() {
		return donationDate;
	}

	public void setDonationDate(Date donationDate) {
		this.donationDate = donationDate;
	}

	public Date getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(Date releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	

}
