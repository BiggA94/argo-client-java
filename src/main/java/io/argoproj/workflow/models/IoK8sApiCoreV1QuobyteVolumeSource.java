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
 * Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.
 */
@ApiModel(description = "Represents a Quobyte mount that lasts the lifetime of a pod. Quobyte volumes do not support ownership management or SELinux relabeling.")

public class IoK8sApiCoreV1QuobyteVolumeSource {
  public static final String SERIALIZED_NAME_GROUP = "group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_REGISTRY = "registry";
  @SerializedName(SERIALIZED_NAME_REGISTRY)
  private String registry;

  public static final String SERIALIZED_NAME_TENANT = "tenant";
  @SerializedName(SERIALIZED_NAME_TENANT)
  private String tenant;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_VOLUME = "volume";
  @SerializedName(SERIALIZED_NAME_VOLUME)
  private String volume;


  public IoK8sApiCoreV1QuobyteVolumeSource group(String group) {
    
    this.group = group;
    return this;
  }

   /**
   * Get group
   * @return group
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGroup() {
    return group;
  }


  public void setGroup(String group) {
    this.group = group;
  }


  public IoK8sApiCoreV1QuobyteVolumeSource readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Get readOnly
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public IoK8sApiCoreV1QuobyteVolumeSource registry(String registry) {
    
    this.registry = registry;
    return this;
  }

   /**
   * Get registry
   * @return registry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getRegistry() {
    return registry;
  }


  public void setRegistry(String registry) {
    this.registry = registry;
  }


  public IoK8sApiCoreV1QuobyteVolumeSource tenant(String tenant) {
    
    this.tenant = tenant;
    return this;
  }

   /**
   * Get tenant
   * @return tenant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTenant() {
    return tenant;
  }


  public void setTenant(String tenant) {
    this.tenant = tenant;
  }


  public IoK8sApiCoreV1QuobyteVolumeSource user(String user) {
    
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  public IoK8sApiCoreV1QuobyteVolumeSource volume(String volume) {
    
    this.volume = volume;
    return this;
  }

   /**
   * Volume is a string that references an already created Quobyte volume by name.
   * @return volume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Volume is a string that references an already created Quobyte volume by name.")

  public String getVolume() {
    return volume;
  }


  public void setVolume(String volume) {
    this.volume = volume;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1QuobyteVolumeSource ioK8sApiCoreV1QuobyteVolumeSource = (IoK8sApiCoreV1QuobyteVolumeSource) o;
    return Objects.equals(this.group, ioK8sApiCoreV1QuobyteVolumeSource.group) &&
        Objects.equals(this.readOnly, ioK8sApiCoreV1QuobyteVolumeSource.readOnly) &&
        Objects.equals(this.registry, ioK8sApiCoreV1QuobyteVolumeSource.registry) &&
        Objects.equals(this.tenant, ioK8sApiCoreV1QuobyteVolumeSource.tenant) &&
        Objects.equals(this.user, ioK8sApiCoreV1QuobyteVolumeSource.user) &&
        Objects.equals(this.volume, ioK8sApiCoreV1QuobyteVolumeSource.volume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(group, readOnly, registry, tenant, user, volume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1QuobyteVolumeSource {\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
    sb.append("    tenant: ").append(toIndentedString(tenant)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    volume: ").append(toIndentedString(volume)).append("\n");
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

