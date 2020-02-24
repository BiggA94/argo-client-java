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
import io.argoproj.workflow.models.IoK8sApiCoreV1DownwardAPIVolumeFile;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.
 */
@ApiModel(description = "Represents downward API info for projecting into a projected volume. Note that this is identical to a downwardAPI volume source without the default mode.")

public class IoK8sApiCoreV1DownwardAPIProjection {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<IoK8sApiCoreV1DownwardAPIVolumeFile> items = null;


  public IoK8sApiCoreV1DownwardAPIProjection items(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    
    this.items = items;
    return this;
  }

  public IoK8sApiCoreV1DownwardAPIProjection addItemsItem(IoK8sApiCoreV1DownwardAPIVolumeFile itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<IoK8sApiCoreV1DownwardAPIVolumeFile>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Get items
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<IoK8sApiCoreV1DownwardAPIVolumeFile> getItems() {
    return items;
  }


  public void setItems(List<IoK8sApiCoreV1DownwardAPIVolumeFile> items) {
    this.items = items;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IoK8sApiCoreV1DownwardAPIProjection ioK8sApiCoreV1DownwardAPIProjection = (IoK8sApiCoreV1DownwardAPIProjection) o;
    return Objects.equals(this.items, ioK8sApiCoreV1DownwardAPIProjection.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IoK8sApiCoreV1DownwardAPIProjection {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

