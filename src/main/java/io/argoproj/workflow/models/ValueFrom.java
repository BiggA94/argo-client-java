/*
 * Argo
 * Workflow Service API performs CRUD actions against application resources
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.argoproj.workflow.models;

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
 * ValueFrom
 */

public class ValueFrom {
  public static final String SERIALIZED_NAME_JQ_FILTER = "jqFilter";
  @SerializedName(SERIALIZED_NAME_JQ_FILTER)
  private String jqFilter;

  public static final String SERIALIZED_NAME_JSON_PATH = "jsonPath";
  @SerializedName(SERIALIZED_NAME_JSON_PATH)
  private String jsonPath;

  public static final String SERIALIZED_NAME_PARAMETER = "parameter";
  @SerializedName(SERIALIZED_NAME_PARAMETER)
  private String parameter;

  public static final String SERIALIZED_NAME_PATH = "path";
  @SerializedName(SERIALIZED_NAME_PATH)
  private String path;


  public ValueFrom jqFilter(String jqFilter) {
    
    this.jqFilter = jqFilter;
    return this;
  }

   /**
   * Get jqFilter
   * @return jqFilter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJqFilter() {
    return jqFilter;
  }


  public void setJqFilter(String jqFilter) {
    this.jqFilter = jqFilter;
  }


  public ValueFrom jsonPath(String jsonPath) {
    
    this.jsonPath = jsonPath;
    return this;
  }

   /**
   * Get jsonPath
   * @return jsonPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getJsonPath() {
    return jsonPath;
  }


  public void setJsonPath(String jsonPath) {
    this.jsonPath = jsonPath;
  }


  public ValueFrom parameter(String parameter) {
    
    this.parameter = parameter;
    return this;
  }

   /**
   * Get parameter
   * @return parameter
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getParameter() {
    return parameter;
  }


  public void setParameter(String parameter) {
    this.parameter = parameter;
  }


  public ValueFrom path(String path) {
    
    this.path = path;
    return this;
  }

   /**
   * Get path
   * @return path
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPath() {
    return path;
  }


  public void setPath(String path) {
    this.path = path;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueFrom valueFrom = (ValueFrom) o;
    return Objects.equals(this.jqFilter, valueFrom.jqFilter) &&
        Objects.equals(this.jsonPath, valueFrom.jsonPath) &&
        Objects.equals(this.parameter, valueFrom.parameter) &&
        Objects.equals(this.path, valueFrom.path);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jqFilter, jsonPath, parameter, path);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueFrom {\n");
    sb.append("    jqFilter: ").append(toIndentedString(jqFilter)).append("\n");
    sb.append("    jsonPath: ").append(toIndentedString(jsonPath)).append("\n");
    sb.append("    parameter: ").append(toIndentedString(parameter)).append("\n");
    sb.append("    path: ").append(toIndentedString(path)).append("\n");
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

