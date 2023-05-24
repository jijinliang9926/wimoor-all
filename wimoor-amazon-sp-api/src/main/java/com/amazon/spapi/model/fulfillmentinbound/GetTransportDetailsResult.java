/*
 * Selling Partner API for Fulfillment Inbound
 * The Selling Partner API for Fulfillment Inbound lets you create applications that create and update inbound shipments of inventory to Amazon's fulfillment network.
 *
 * OpenAPI spec version: v0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.fulfillmentinbound;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetTransportDetailsResult
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-12-21T11:58:54.268+08:00")
public class GetTransportDetailsResult {
  @SerializedName("TransportContent")
  private TransportContent transportContent = null;

  public GetTransportDetailsResult transportContent(TransportContent transportContent) {
    this.transportContent = transportContent;
    return this;
  }

   /**
   * Get transportContent
   * @return transportContent
  **/
  @ApiModelProperty(value = "")
  public TransportContent getTransportContent() {
    return transportContent;
  }

  public void setTransportContent(TransportContent transportContent) {
    this.transportContent = transportContent;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTransportDetailsResult getTransportDetailsResult = (GetTransportDetailsResult) o;
    return Objects.equals(this.transportContent, getTransportDetailsResult.transportContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transportContent);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTransportDetailsResult {\n");
    
    sb.append("    transportContent: ").append(toIndentedString(transportContent)).append("\n");
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

