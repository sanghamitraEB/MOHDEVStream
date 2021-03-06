/*
 * AppDrugRegManagment
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

import java.util.Objects;
/**
 * DicValue
 */
public class DicValue {
  
  private String key = null;

  
  private String value = null;

  
  private String parentKey = null;

  
  private String symbol = null;

  public DicValue key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Get key
   * 
  **/
  
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public DicValue value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Get value
   * 
  **/
  
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public DicValue parentKey(String parentKey) {
    this.parentKey = parentKey;
    return this;
  }

   /**
   * Get parentKey
   * 
  **/
  
  public String getParentKey() {
    return parentKey;
  }

  public void setParentKey(String parentKey) {
    this.parentKey = parentKey;
  }

  public DicValue symbol(String symbol) {
    this.symbol = symbol;
    return this;
  }

   /**
   * Get symbol
   * 
  **/
  
  public String getSymbol() {
    return symbol;
  }

  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }


  
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DicValue dicValue = (DicValue) o;
    return Objects.equals(this.key, dicValue.key) &&
        Objects.equals(this.value, dicValue.value) &&
        Objects.equals(this.parentKey, dicValue.parentKey) &&
        Objects.equals(this.symbol, dicValue.symbol);
  }

  
  public int hashCode() {
    return Objects.hash(key, value, parentKey, symbol);
  }


  
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DicValue {\n");
    
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    parentKey: ").append(toIndentedString(parentKey)).append("\n");
    sb.append("    symbol: ").append(toIndentedString(symbol)).append("\n");
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
  
}

