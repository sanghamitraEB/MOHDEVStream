package ae.gov.mohap.odm.model.BiologicalDocuments;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//import ae.gov.mohap.odm.model.impExp.application.ImportExportPermitApplication;

/**
 * 
 * @author sangha
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApplicationBiologicalDocs {
	
	private String permitNumber = null;

	private Date submitionDate = null;

	private String applicationNumber = null;
	
	private Agent agent = null;
	
	private Product product = null;
	
	private Integer drugNum =null;

	/**
	 * @return the permitNumber
	 */
	public String getPermitNumber() { 
		return permitNumber;
	}

	/**
	 * @param permitNumber the permitNumber to set
	 */
	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	/**
	 * @return the submitionDate
	 */
	public Date getSubmitionDate() {
		return submitionDate;
	}

	/**
	 * @param submitionDate the submitionDate to set
	 */
	public void setSubmitionDate(Date submitionDate) {
		this.submitionDate = submitionDate;
	}
	/**
	 * 
	 * @param applicationNumber
	 * @return
	 */
	public ApplicationBiologicalDocs applicationNumber(
			String applicationNumber) {
		this.applicationNumber = applicationNumber;
		return this;
	}
	/**
	 * @return the applicationNumber
	 */
	public String getApplicationNumber() {
		return applicationNumber;
	}

	/**
	 * @param applicationNumber the applicationNumber to set
	 */
	public void setApplicationNumber(String applicationNumber) {
		this.applicationNumber = applicationNumber;
	}

	/**
	 * @return the agent
	 */
	public Agent getAgent() {
		return agent;
	}

	/**
	 * @param agent the agent to set
	 */
	public void setAgent(Agent agent) {
		this.agent = agent;
	}

	/**
	 * @return the product
	 */
	public Product getProduct() {
		return product;
	}

	/**
	 * @param product the product to set
	 */
	public void setProduct(Product product) {
		this.product = product;
	}

	/**
	 * @return the drugNum
	 */
	public Integer getDrugNum() {
		return drugNum;
	}

	/**
	 * @param drugNum the drugNum to set
	 */
	public void setDrugNum(Integer drugNum) {
		this.drugNum = drugNum;
	}
	
	
	

}
