/*
 * Selling Partner API for Merchant Fulfillment
 * The Selling Partner API for Merchant Fulfillment helps you build applications that let sellers purchase shipping for non-Prime and Prime orders using Amazon’s Buy Shipping Services.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.merchantfulfillment;

import java.util.Objects;
import java.util.Arrays;
import com.amazon.spapi.model.merchantfulfillment.UnitOfLength;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Dimensions for printing a shipping label.
 */
@ApiModel(description = "Dimensions for printing a shipping label.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:46:23.921+08:00")
public class LabelDimensions {
  @SerializedName("Length")
  private BigDecimal length = null;

  @SerializedName("Width")
  private BigDecimal width = null;

  @SerializedName("Unit")
  private UnitOfLength unit = null;

  public LabelDimensions length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * The length dimension.
   * @return length
  **/
  @ApiModelProperty(required = true, value = "The length dimension.")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }

  public LabelDimensions width(BigDecimal width) {
    this.width = width;
    return this;
  }

   /**
   * The width dimension.
   * @return width
  **/
  @ApiModelProperty(required = true, value = "The width dimension.")
  public BigDecimal getWidth() {
    return width;
  }

  public void setWidth(BigDecimal width) {
    this.width = width;
  }

  public LabelDimensions unit(UnitOfLength unit) {
    this.unit = unit;
    return this;
  }

   /**
   * The unit of measurement.
   * @return unit
  **/
  @ApiModelProperty(required = true, value = "The unit of measurement.")
  public UnitOfLength getUnit() {
    return unit;
  }

  public void setUnit(UnitOfLength unit) {
    this.unit = unit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LabelDimensions labelDimensions = (LabelDimensions) o;
    return Objects.equals(this.length, labelDimensions.length) &&
        Objects.equals(this.width, labelDimensions.width) &&
        Objects.equals(this.unit, labelDimensions.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(length, width, unit);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LabelDimensions {\n");
    
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

