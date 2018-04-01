package ae.gov.mohap.odm.model.BiologicalDocuments;

import java.util.Date;


import java.util.List;

public class ProductInfo {
	
	private List<ActiveIngredient> activeIngredient;
	
	private List<InactiveIngredient> inactiveIngredient;
	
	private boolean isProductRegistered; //change to boolean
	
	private KeyValueObj type;
	
	private String productName;
	
	private ProductFrom productFrom;
	
	private String productStrength;
	
	private String packName;
	
	private String storageCondition;
	
	private String quantity;
	
	private String batchNumber;
	
	private Date manufactureDate;
	
	private Date expiryDate;

	public List<ActiveIngredient> getActiveIngredient() {
		return activeIngredient;
	}

	public void setActiveIngredient(List<ActiveIngredient> activeIngredient) {
		this.activeIngredient = activeIngredient;
	}

	public List<InactiveIngredient> getInactiveIngredient() {
		return inactiveIngredient;
	}

	public void setInactiveIngredient(List<InactiveIngredient> inactiveIngredient) {
		this.inactiveIngredient = inactiveIngredient;
	}

	



	/**
	 * @return the isProductRegistered
	 */
	public boolean isProductRegistered() {
		return isProductRegistered;
	}

	/**
	 * @param isProductRegistered the isProductRegistered to set
	 */
	public void setProductRegistered(boolean isProductRegistered) {
		this.isProductRegistered = isProductRegistered;
	}

	

	/**
	 * @return the type
	 */
	public KeyValueObj getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(KeyValueObj type) {
		this.type = type;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public ProductFrom getProductFrom() {
		return productFrom;
	}

	public void setProductFrom(ProductFrom productFrom) {
		this.productFrom = productFrom;
	}

	public String getProductStrength() {
		return productStrength;
	}

	public void setProductStrength(String productStrength) {
		this.productStrength = productStrength;
	}

	public String getPackName() {
		return packName;
	}

	public void setPackName(String packName) {
		this.packName = packName;
	}

	public String getStorageCondition() {
		return storageCondition;
	}

	public void setStorageCondition(String storageCondition) {
		this.storageCondition = storageCondition;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getBatchNumber() {
		return batchNumber;
	}

	public void setBatchNumber(String batchNumber) {
		this.batchNumber = batchNumber;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	

	
	
}
