


package ae.gov.mohap.odm.model.BiologicalDocuments;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
/**
 * ActiveIngredient
 */
public class ActiveIngredient{
	
	//Added for Bio
  private Name name = null;	
  
  private BigDecimal quantity = null;

  
  private DicValue quantityUnit = null;

  
  private BigDecimal refQuantity = null;

  
  private DicValue refQuantityUnit = null;

  
  private Integer apiId = null;

  
  private String additionalInfo = null;

  
  private String description = null;

  
 // private List<Attachment> files = null;

  
  private BigDecimal contentFactor = null;
  
  //Added for Drug Classification
  private String indication = null;
  
   
  
  
  public ActiveIngredient quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

  
  
  
  
  public Name getName() {
	return name;
}





public void setName(Name name) {
	this.name = name;
}





/**
   * Get quantity
   * 
  **/
  
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public ActiveIngredient quantityUnit(DicValue quantityUnit) {
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

  public ActiveIngredient refQuantity(BigDecimal refQuantity) {
    this.refQuantity = refQuantity;
    return this;
  }

   /**
   * Get refQuantity
   * 
  **/
  
  public BigDecimal getRefQuantity() {
    return refQuantity;
  }

  public void setRefQuantity(BigDecimal refQuantity) {
    this.refQuantity = refQuantity;
  }

  public ActiveIngredient refQuantityUnit(DicValue refQuantityUnit) {
    this.refQuantityUnit = refQuantityUnit;
    return this;
  }

   /**
   * Get refQuantityUnit
   * 
  **/
  
  public DicValue getRefQuantityUnit() {
    return refQuantityUnit;
  }

  public void setRefQuantityUnit(DicValue refQuantityUnit) {
    this.refQuantityUnit = refQuantityUnit;
  }

  public ActiveIngredient apiId(Integer apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * Get apiId
   * 
  **/
  
  public Integer getApiId() {
    return apiId;
  }

  public void setApiId(Integer apiId) {
    this.apiId = apiId;
  }

  public ActiveIngredient additionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

   /**
   * Get additionalInfo
   * 
  **/
  
  public String getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(String additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public ActiveIngredient description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * 
  **/
  
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  

  /*
  
  public List<Attachment> getFiles() {
    return files;
  }

  public void setFiles(List<Attachment> files) {
    this.files = files;
  } */

  public ActiveIngredient contentFactor(BigDecimal contentFactor) {
    this.contentFactor = contentFactor;
    return this;
  }

   /**
   * Get contentFactor
   * 
  **/
  
  public BigDecimal getContentFactor() {
    return contentFactor;
  }

  public void setContentFactor(BigDecimal contentFactor) {
    this.contentFactor = contentFactor;
  }


  
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ActiveIngredient activeIngredient = (ActiveIngredient) o;
    return Objects.equals(this.quantity, activeIngredient.quantity) &&
        Objects.equals(this.quantityUnit, activeIngredient.quantityUnit) &&
        Objects.equals(this.refQuantity, activeIngredient.refQuantity) &&
        Objects.equals(this.refQuantityUnit, activeIngredient.refQuantityUnit) &&
        Objects.equals(this.apiId, activeIngredient.apiId) &&
        Objects.equals(this.additionalInfo, activeIngredient.additionalInfo) &&
        Objects.equals(this.description, activeIngredient.description) &&
  //      Objects.equals(this.files, activeIngredient.files) &&
        Objects.equals(this.contentFactor, activeIngredient.contentFactor) &&
        super.equals(o);
  }

  
  public int hashCode() {
    return Objects.hash(quantity, quantityUnit, refQuantity, refQuantityUnit, apiId, additionalInfo, description, contentFactor, super.hashCode());
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ActiveIngredient {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    quantityUnit: ").append(toIndentedString(quantityUnit)).append("\n");
    sb.append("    refQuantity: ").append(toIndentedString(refQuantity)).append("\n");
    sb.append("    refQuantityUnit: ").append(toIndentedString(refQuantityUnit)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
  //  sb.append("    files: ").append(toIndentedString(files)).append("\n");
    sb.append("    contentFactor: ").append(toIndentedString(contentFactor)).append("\n");
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
  
  //Added for Drug Classification

	public String getIndication() {
		return indication;
	}
	
	public void setIndication(String indication) {
		this.indication = indication;
	}
	
	
 
  
}

