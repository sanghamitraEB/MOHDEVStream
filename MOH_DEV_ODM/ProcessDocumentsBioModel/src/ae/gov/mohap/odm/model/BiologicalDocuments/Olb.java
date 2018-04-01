package ae.gov.mohap.odm.model.BiologicalDocuments;
import java.util.Date;

public class Olb {
	
	private KeyValueObj companyName;
	
	private String country;
	private String city;
	private String address;
	private String poBox;
	private String telephone;
	private String fax;
	private String webSite;
	private int olbBatchNumber;
	private int olbCertificateNumber;
	private Date olbCertificateDate;
	private Date olbCertificateValidityDate;
	
	
	public KeyValueObj getCompanyName() {
		return companyName;
	}
	public void setCompanyName(KeyValueObj companyName) {
		this.companyName = companyName;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public int getOlbBatchNumber() {
		return olbBatchNumber;
	}
	public void setOlbBatchNumber(int olbBatchNumber) {
		this.olbBatchNumber = olbBatchNumber;
	}
	public int getOlbCertificateNumber() {
		return olbCertificateNumber;
	}
	public void setOlbCertificateNumber(int olbCertificateNumber) {
		this.olbCertificateNumber = olbCertificateNumber;
	}
	public Date getOlbCertificateDate() {
		return olbCertificateDate;
	}
	public void setOlbCertificateDate(Date olbCertificateDate) {
		this.olbCertificateDate = olbCertificateDate;
	}
	public Date getOlbCertificateValidityDate() {
		return olbCertificateValidityDate;
	}
	public void setOlbCertificateValidityDate(Date olbCertificateValidityDate) {
		this.olbCertificateValidityDate = olbCertificateValidityDate;
	}
	
	

}
