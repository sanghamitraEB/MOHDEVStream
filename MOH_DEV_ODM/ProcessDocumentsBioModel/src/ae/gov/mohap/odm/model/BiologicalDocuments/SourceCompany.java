package ae.gov.mohap.odm.model.BiologicalDocuments;

public class SourceCompany {
	
	private boolean isRegistered;
	
	private CompanyName companyName;
	
    private KeyValueObj type;
	
	private Country country;
	
	
	
	private String city;
	
	private String address;
			
	private String poBox;
			
	private String telephone;
	
	private String email;	
			
	private String fax;	
			
	private String webSite;
	
	
	
	

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public CompanyName getCompanyName() {
		return companyName;
	}

	public void setCompanyName(CompanyName companyName) {
		this.companyName = companyName;
	}

	

	/**
	 * @return the isRegistered
	 */
	public boolean isRegistered() {
		return isRegistered;
	}

	/**
	 * @param isRegistered the isRegistered to set
	 */
	public void setRegistered(boolean isRegistered) {
		this.isRegistered = isRegistered;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPoBox() {
		return poBox;
	}

	public void setPoBox(String poBox) {
		this.poBox = poBox;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWebSite() {
		return webSite;
	}

	public void setWebSite(String webSite) {
		this.webSite = webSite;
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

	

}
