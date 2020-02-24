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
import io.argoproj.workflow.models.ArtifactoryAuth;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ArtifactoryArtifact
 */

public class ArtifactoryArtifact {
  public static final String SERIALIZED_NAME_ARTIFACTORY_AUTH = "artifactoryAuth";
  @SerializedName(SERIALIZED_NAME_ARTIFACTORY_AUTH)
  private ArtifactoryAuth artifactoryAuth;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public ArtifactoryArtifact artifactoryAuth(ArtifactoryAuth artifactoryAuth) {
    
    this.artifactoryAuth = artifactoryAuth;
    return this;
  }

   /**
   * Get artifactoryAuth
   * @return artifactoryAuth
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ArtifactoryAuth getArtifactoryAuth() {
    return artifactoryAuth;
  }


  public void setArtifactoryAuth(ArtifactoryAuth artifactoryAuth) {
    this.artifactoryAuth = artifactoryAuth;
  }


  public ArtifactoryArtifact url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ArtifactoryArtifact artifactoryArtifact = (ArtifactoryArtifact) o;
    return Objects.equals(this.artifactoryAuth, artifactoryArtifact.artifactoryAuth) &&
        Objects.equals(this.url, artifactoryArtifact.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(artifactoryAuth, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ArtifactoryArtifact {\n");
    sb.append("    artifactoryAuth: ").append(toIndentedString(artifactoryAuth)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

