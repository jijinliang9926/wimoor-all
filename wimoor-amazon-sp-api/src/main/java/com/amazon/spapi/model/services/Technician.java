/*
 * Selling Partner API for Services
 * With the Services API, you can build applications that help service providers get and modify their service orders.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.spapi.model.services;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A technician who is assigned to perform the service job in part or in full.
 */
@ApiModel(description = "A technician who is assigned to perform the service job in part or in full.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-12-15T20:57:54.327+08:00")
public class Technician {
  @SerializedName("technicianId")
  private String technicianId = null;

  @SerializedName("name")
  private String name = null;

  public Technician technicianId(String technicianId) {
    this.technicianId = technicianId;
    return this;
  }

   /**
   * The technician identifier.
   * @return technicianId
  **/
  @ApiModelProperty(value = "The technician identifier.")
  public String getTechnicianId() {
    return technicianId;
  }

  public void setTechnicianId(String technicianId) {
    this.technicianId = technicianId;
  }

  public Technician name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the technician.
   * @return name
  **/
  @ApiModelProperty(value = "The name of the technician.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Technician technician = (Technician) o;
    return Objects.equals(this.technicianId, technician.technicianId) &&
        Objects.equals(this.name, technician.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(technicianId, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Technician {\n");
    
    sb.append("    technicianId: ").append(toIndentedString(technicianId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

