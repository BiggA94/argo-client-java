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
import io.argoproj.workflow.models.IoK8sApiCoreV1Preconditions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * DeleteOptions may be provided when deleting an API object.
 */
@ApiModel(description = "DeleteOptions may be provided when deleting an API object.")

public class IoK8sApiCoreV1DeleteOptions {
  public static final String SERIALIZED_NAME_DRY_RUN = "dryRun";
  @SerializedName(SERIALIZED_NAME_DRY_RUN)
  private List<String> dryRun = null;

  public static final String SERIALIZED_NAME_GRACE_PERIOD_SECONDS = "gracePeriodSeconds";
  @SerializedName(SERIALIZED_NAME_GRACE_PERIOD_SECONDS)
  private String gracePeriodSeconds;

  public static final String SERIALIZED_NAME_ORPHAN_DEPENDENTS = "orphanDependents";
  @SerializedName(SERIALIZED_NAME_ORPHAN_DEPENDENTS)
  private Boolean orphanDependents;

  public static final String SERIALIZED_NAME_PRECONDITIONS = "preconditions";
  @SerializedName(SERIALIZED_NAME_PRECONDITIONS)
  private IoK8sApiCoreV1Preconditions preconditions;

  public static final String SERIALIZED_NAME_PROPAGATION_POLICY = "propagationPolicy";
  @SerializedName(SERIALIZED_NAME_PROPAGATION_POLICY)
  private String propagationPolicy;


  public IoK8sApiCoreV1DeleteOptions dryRun(List<String> dryRun) {
    
    this.dryRun = dryRun;
    return this;
  }

  public IoK8sApiCoreV1DeleteOptions addDryRunItem(String dryRunItem) {
    if (this.dryRun == null) {
      this.dryRun = new ArrayList<String>();
    }
    this.dryRun.add(dryRunItem);
    return this;
  }

   /**
   * Get dryRun
   * @return dryRun
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getDryRun() {
    return dryRun;
  }


  public void setDryRun(List<String> dryRun) {
    this.dryRun = dryRun;
  }


  public IoK8sApiCoreV1DeleteOptions gracePeriodSeconds(String gracePeriodSeconds) {
    
    this.gracePeriodSeconds = gracePeriodSeconds;
    return this;
  }

   /**
   * Get gracePeriodSeconds
   * @return gracePeriodSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGracePeriodSeconds() {
    return gracePeriodSeconds;
  }


  public void setGracePeriodSeconds(String gracePeriodSeconds) {
    this.gracePeriodSeconds = gracePeriodSeconds;
  }


  public IoK8sApiCoreV1DeleteOptions orphanDependents(Boolean orphanDependents) {
    
    this.orphanDependents = orphanDependents;
    return this;
  }

   /**
   * Get orphanDependents
   * @return orphanDependents
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getOrphanDependents() {
    return orphanDependents;
  }


  public void setOrphanDependents(Boolean orphanDependents) {
    this.orphanDependents = orphanDependents;
  }


  public IoK8sApiCoreV1DeleteOptions preconditions(IoK8sApiCoreV1Preconditions preconditions) {
    
    this.preconditions = preconditions;
    return this;
  }

   /**
   * Get preconditions
   * @return preconditions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public IoK8sApiCoreV1Preconditions getPreconditions() {
    return preconditions;
  }


  public void setPreconditions(IoK8sApiCoreV1Preconditions preconditions) {
    this.preconditions = preconditions;
  }


  public IoK8sApiCoreV1DeleteOptions propagationPolicy(String propagationPolicy) {
    
    this.propagationPolicy = propagationPolicy;
    return this;
  }

   /**
   * Get propagationPolicy
   * @return propagationPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPropagationPolicy() {
    return propagationPolicy;
  }


  public void setPropagationPolicy(String propagationPolicy) {
    this.propagationPolicy = propagationPolicy;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1DeleteOptions ioK8sApiCoreV1DeleteOptions = (IoK8sApiCoreV1DeleteOptions) o;
    return Objects.equals(this.dryRun, ioK8sApiCoreV1DeleteOptions.dryRun) &&
        Objects.equals(this.gracePeriodSeconds, ioK8sApiCoreV1DeleteOptions.gracePeriodSeconds) &&
        Objects.equals(this.orphanDependents, ioK8sApiCoreV1DeleteOptions.orphanDependents) &&
        Objects.equals(this.preconditions, ioK8sApiCoreV1DeleteOptions.preconditions) &&
        Objects.equals(this.propagationPolicy, ioK8sApiCoreV1DeleteOptions.propagationPolicy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dryRun, gracePeriodSeconds, orphanDependents, preconditions, propagationPolicy);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DeleteOptions {\n");
    sb.append("    dryRun: ").append(toIndentedString(dryRun)).append("\n");
    sb.append("    gracePeriodSeconds: ").append(toIndentedString(gracePeriodSeconds)).append("\n");
    sb.append("    orphanDependents: ").append(toIndentedString(orphanDependents)).append("\n");
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    propagationPolicy: ").append(toIndentedString(propagationPolicy)).append("\n");
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

