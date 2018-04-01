package ae.gov.mohap.odm.model.BiologicalDocuments;
/**
 * 
 */
import java.util.List;

public class Product {
	
	
	private ProductInfo productInfo;
	
	private SourceCompany sourceCompany;
	
	private OMCL omcl;
	
	private List<EndUser> endUser;

	/**
	 * @return the productInfo
	 */
	public ProductInfo getProductInfo() {
		return productInfo;
	}

	/**
	 * @param productInfo the productInfo to set
	 */
	public void setProductInfo(ProductInfo productInfo) {
		this.productInfo = productInfo;
	}

	/**
	 * @return the sourceCompany
	 */
	public SourceCompany getSourceCompany() {
		return sourceCompany;
	}

	/**
	 * @param sourceCompany the sourceCompany to set
	 */
	public void setSourceCompany(SourceCompany sourceCompany) {
		this.sourceCompany = sourceCompany;
	}

	/**
	 * @return the omcl
	 */
	public OMCL getOmcl() {
		return omcl;
	}

	/**
	 * @param omcl the omcl to set
	 */
	public void setOmcl(OMCL omcl) {
		this.omcl = omcl;
	}

	/**
	 * @return the endUser
	 */
	public List<EndUser> getEndUser() {
		return endUser;
	}

	/**
	 * @param endUser the endUser to set
	 */
	public void setEndUser(List<EndUser> endUser) {
		this.endUser = endUser;
	}
	

	
	

}
