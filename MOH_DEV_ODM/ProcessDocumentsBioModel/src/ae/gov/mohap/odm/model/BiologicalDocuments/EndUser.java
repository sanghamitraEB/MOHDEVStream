/*
 * AppImpExpManagement
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package ae.gov.mohap.odm.model.BiologicalDocuments;

/**
 * EndUser
 */
import java.util.Date;
import java.util.Objects;
public class EndUser {
	
  //BIO
  private KeyValueObj type;
  
  private String name;
	
  private String address;
  		
  private String emirate;
  		
  private String poBox;
  		
  private String telephone;
  		
  private String fax;
  		
  private String email;
  		
  private String webSite;
  		

  
//BIO
  private String remarks;
  
  
  private Date lpoDate = null;

  
  private String lpoNum = null;

  
  private String authorizationNum = null;

  
  private Integer quantity = null;

  
  private DicValue quantityUnit = null;

  
  private String healthAuthorityName = null;

  
  private String approvalNumber = null;

  public EndUser lpoDate(Date lpoDate) {
    this.lpoDate = lpoDate;
    return this;
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










/**
 * @return the emirate
 */
public String getEmirate() {
	return emirate;
}










/**
 * @param emirate the emirate to set
 */
public void setEmirate(String emirate) {
	this.emirate = emirate;
}










public String getName() {
	return name;
}





public void setName(String name) {
	this.name = name;
}





public String getAddress() {
	return address;
}





public void setAddress(String address) {
	this.address = address;
}










public String getBiologicalEmirate() {
	return emirate;
}





public void setBiologicalEmirate(String emirate) {
	this.emirate = emirate;
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





public String getEmail() {
	return email;
}





public void setEmail(String email) {
	this.email = email;
}





public String getWebSite() {
	return webSite;
}





public void setWebSite(String webSite) {
	this.webSite = webSite;
}





public String getRemarks() {
	return remarks;
}





public void setRemarks(String remarks) {
	this.remarks = remarks;
}





/**
   * Get lpoDate
   * 
  **/
  
  public Date getLpoDate() {
    return lpoDate;
  }

  public void setLpoDate(Date lpoDate) {
    this.lpoDate = lpoDate;
  }

  public EndUser lpoNum(String lpoNum) {
    this.lpoNum = lpoNum;
    return this;
  }

   /**
   * Get lpoNum
   * 
  **/
  
  public String getLpoNum() {
    return lpoNum;
  }

  public void setLpoNum(String lpoNum) {
    this.lpoNum = lpoNum;
  }

  public EndUser authorizationNum(String authorizationNum) {
    this.authorizationNum = authorizationNum;
    return this;
  }

   /**
   * Get authorizationNum
   * 
  **/
  
  public String getAuthorizationNum() {
    return authorizationNum;
  }

  public void setAuthorizationNum(String authorizationNum) {
    this.authorizationNum = authorizationNum;
  }

  public EndUser quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Get quantity
   * 
  **/
  
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

 

  public EndUser healthAuthorityName(String healthAuthorityName) {
    this.healthAuthorityName = healthAuthorityName;
    return this;
  }

   /**
   * Get healthAuthorityName
   * 
  **/
  
  public String getHealthAuthorityName() {
    return healthAuthorityName;
  }

  public void setHealthAuthorityName(String healthAuthorityName) {
    this.healthAuthorityName = healthAuthorityName;
  }

  public EndUser approvalNumber(String approvalNumber) {
    this.approvalNumber = approvalNumber;
    return this;
  }

   /**
   * Get approvalNumber
   * 
  **/
  
  public String getApprovalNumber() {
    return approvalNumber;
  }

  public void setApprovalNumber(String approvalNumber) {
    this.approvalNumber = approvalNumber;
  }


  
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndUser endUser = (EndUser) o;
    return Objects.equals(this.lpoDate, endUser.lpoDate) &&
        Objects.equals(this.lpoNum, endUser.lpoNum) &&
        Objects.equals(this.authorizationNum, endUser.authorizationNum) &&
        Objects.equals(this.quantity, endUser.quantity) &&
        Objects.equals(this.quantityUnit, endUser.quantityUnit) &&
        Objects.equals(this.healthAuthorityName, endUser.healthAuthorityName) &&
        Objects.equals(this.approvalNumber, endUser.approvalNumber) &&
        super.equals(o);
  }

  
  public int hashCode() {
    return Objects.hash(lpoDate, lpoNum, authorizationNum, quantity,quantityUnit, healthAuthorityName, approvalNumber, super.hashCode());
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndUser {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    lpoDate: ").append(toIndentedString(lpoDate)).append("\n");
    sb.append("    lpoNum: ").append(toIndentedString(lpoNum)).append("\n");
    sb.append("    authorizationNum: ").append(toIndentedString(authorizationNum)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    healthAuthorityName: ").append(toIndentedString(healthAuthorityName)).append("\n");
    sb.append("    approvalNumber: ").append(toIndentedString(approvalNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
  public EndUser quantityUnit(DicValue quantityUnit) {
	    this.quantityUnit = quantityUnit;
	    return this;
	  }

	   /**
	   * Get quantityUnit
	   * 
	  **/
	  
	  public DicValue getQuantityUnit() {
	    return quantityUnit;
	  }

	  public void setQuantityUnit(DicValue quantityUnit) {
	    this.quantityUnit = quantityUnit;
	  }
  
}

