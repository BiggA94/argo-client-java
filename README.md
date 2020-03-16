# argo-client-java

Argo
- API version: v2.6.3

Workflow Service API performs CRUD actions against application resources


*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.argoproj.workflow</groupId>
  <artifactId>argo-client-java</artifactId>
  <version>1-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.argoproj.workflow:argo-client-java:1-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/argo-client-java-1-SNAPSHOT.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import io.argoproj.workflow.ApiClient;
import io.argoproj.workflow.ApiException;
import io.argoproj.workflow.Configuration;
import io.argoproj.workflow.models.*;
import io.argoproj.workflow.apis.ArchivedWorkflowServiceApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:2746");

    ArchivedWorkflowServiceApi apiInstance = new ArchivedWorkflowServiceApi(defaultClient);
    String uid = "uid_example"; // String | 
    try {
      Object result = apiInstance.deleteArchivedWorkflow(uid);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ArchivedWorkflowServiceApi#deleteArchivedWorkflow");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *http://localhost:2746*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ArchivedWorkflowServiceApi* | [**deleteArchivedWorkflow**](docs/ArchivedWorkflowServiceApi.md#deleteArchivedWorkflow) | **DELETE** /api/v1/archived-workflows/{uid} | 
*ArchivedWorkflowServiceApi* | [**getArchivedWorkflow**](docs/ArchivedWorkflowServiceApi.md#getArchivedWorkflow) | **GET** /api/v1/archived-workflows/{uid} | 
*ArchivedWorkflowServiceApi* | [**listArchivedWorkflows**](docs/ArchivedWorkflowServiceApi.md#listArchivedWorkflows) | **GET** /api/v1/archived-workflows | 
*CronWorkflowServiceApi* | [**createCronWorkflow**](docs/CronWorkflowServiceApi.md#createCronWorkflow) | **POST** /api/v1/cron-workflows/{namespace} | 
*CronWorkflowServiceApi* | [**deleteCronWorkflow**](docs/CronWorkflowServiceApi.md#deleteCronWorkflow) | **DELETE** /api/v1/cron-workflows/{namespace}/{name} | 
*CronWorkflowServiceApi* | [**getCronWorkflow**](docs/CronWorkflowServiceApi.md#getCronWorkflow) | **GET** /api/v1/cron-workflows/{namespace}/{name} | 
*CronWorkflowServiceApi* | [**lintCronWorkflow**](docs/CronWorkflowServiceApi.md#lintCronWorkflow) | **POST** /api/v1/cron-workflows/{namespace}/lint | 
*CronWorkflowServiceApi* | [**listCronWorkflows**](docs/CronWorkflowServiceApi.md#listCronWorkflows) | **GET** /api/v1/cron-workflows/{namespace} | 
*CronWorkflowServiceApi* | [**updateCronWorkflow**](docs/CronWorkflowServiceApi.md#updateCronWorkflow) | **PUT** /api/v1/cron-workflows/{namespace}/{name} | 
*InfoServiceApi* | [**getInfo**](docs/InfoServiceApi.md#getInfo) | **GET** /api/v1/info | 
*WorkflowServiceApi* | [**createWorkflow**](docs/WorkflowServiceApi.md#createWorkflow) | **POST** /api/v1/workflows/{namespace} | 
*WorkflowServiceApi* | [**deleteWorkflow**](docs/WorkflowServiceApi.md#deleteWorkflow) | **DELETE** /api/v1/workflows/{namespace}/{name} | 
*WorkflowServiceApi* | [**getWorkflow**](docs/WorkflowServiceApi.md#getWorkflow) | **GET** /api/v1/workflows/{namespace}/{name} | 
*WorkflowServiceApi* | [**lintWorkflow**](docs/WorkflowServiceApi.md#lintWorkflow) | **POST** /api/v1/workflows/{namespace}/lint | 
*WorkflowServiceApi* | [**listWorkflows**](docs/WorkflowServiceApi.md#listWorkflows) | **GET** /api/v1/workflows/{namespace} | 
*WorkflowServiceApi* | [**podLogs**](docs/WorkflowServiceApi.md#podLogs) | **GET** /api/v1/workflows/{namespace}/{name}/{podName}/log | 
*WorkflowServiceApi* | [**resubmitWorkflow**](docs/WorkflowServiceApi.md#resubmitWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resubmit | 
*WorkflowServiceApi* | [**resumeWorkflow**](docs/WorkflowServiceApi.md#resumeWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/resume | 
*WorkflowServiceApi* | [**retryWorkflow**](docs/WorkflowServiceApi.md#retryWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/retry | 
*WorkflowServiceApi* | [**suspendWorkflow**](docs/WorkflowServiceApi.md#suspendWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/suspend | 
*WorkflowServiceApi* | [**terminateWorkflow**](docs/WorkflowServiceApi.md#terminateWorkflow) | **PUT** /api/v1/workflows/{namespace}/{name}/terminate | 
*WorkflowServiceApi* | [**watchWorkflows**](docs/WorkflowServiceApi.md#watchWorkflows) | **GET** /api/v1/workflow-events/{namespace} | 
*WorkflowTemplateServiceApi* | [**createWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#createWorkflowTemplate) | **POST** /api/v1/workflow-templates/{namespace} | 
*WorkflowTemplateServiceApi* | [**deleteWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#deleteWorkflowTemplate) | **DELETE** /api/v1/workflow-templates/{namespace}/{name} | 
*WorkflowTemplateServiceApi* | [**getWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#getWorkflowTemplate) | **GET** /api/v1/workflow-templates/{namespace}/{name} | 
*WorkflowTemplateServiceApi* | [**lintWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#lintWorkflowTemplate) | **POST** /api/v1/workflow-templates/{namespace}/lint | 
*WorkflowTemplateServiceApi* | [**listWorkflowTemplates**](docs/WorkflowTemplateServiceApi.md#listWorkflowTemplates) | **GET** /api/v1/workflow-templates/{namespace} | 
*WorkflowTemplateServiceApi* | [**updateWorkflowTemplate**](docs/WorkflowTemplateServiceApi.md#updateWorkflowTemplate) | **PUT** /api/v1/workflow-templates/{namespace}/{name} | 


## Documentation for Models

 - [AWSElasticBlockStoreVolumeSource](docs/AWSElasticBlockStoreVolumeSource.md)
 - [ArchiveStrategy](docs/ArchiveStrategy.md)
 - [Arguments](docs/Arguments.md)
 - [Artifact](docs/Artifact.md)
 - [ArtifactLocation](docs/ArtifactLocation.md)
 - [ArtifactRepositoryRef](docs/ArtifactRepositoryRef.md)
 - [ArtifactoryArtifact](docs/ArtifactoryArtifact.md)
 - [ArtifactoryAuth](docs/ArtifactoryAuth.md)
 - [AzureDiskVolumeSource](docs/AzureDiskVolumeSource.md)
 - [AzureFileVolumeSource](docs/AzureFileVolumeSource.md)
 - [Backoff](docs/Backoff.md)
 - [CSIVolumeSource](docs/CSIVolumeSource.md)
 - [Capabilities](docs/Capabilities.md)
 - [CephFSVolumeSource](docs/CephFSVolumeSource.md)
 - [CinderVolumeSource](docs/CinderVolumeSource.md)
 - [ConfigMapEnvSource](docs/ConfigMapEnvSource.md)
 - [ConfigMapProjection](docs/ConfigMapProjection.md)
 - [ConfigMapVolumeSource](docs/ConfigMapVolumeSource.md)
 - [ContinueOn](docs/ContinueOn.md)
 - [CreateOptions](docs/CreateOptions.md)
 - [CronCreateCronWorkflowRequest](docs/CronCreateCronWorkflowRequest.md)
 - [CronLintCronWorkflowRequest](docs/CronLintCronWorkflowRequest.md)
 - [CronUpdateCronWorkflowRequest](docs/CronUpdateCronWorkflowRequest.md)
 - [CronWorkflow](docs/CronWorkflow.md)
 - [CronWorkflowList](docs/CronWorkflowList.md)
 - [CronWorkflowSpec](docs/CronWorkflowSpec.md)
 - [CronWorkflowStatus](docs/CronWorkflowStatus.md)
 - [DAGTask](docs/DAGTask.md)
 - [DAGTemplate](docs/DAGTemplate.md)
 - [DeleteOptions](docs/DeleteOptions.md)
 - [DownwardAPIProjection](docs/DownwardAPIProjection.md)
 - [DownwardAPIVolumeFile](docs/DownwardAPIVolumeFile.md)
 - [DownwardAPIVolumeSource](docs/DownwardAPIVolumeSource.md)
 - [EmptyDirVolumeSource](docs/EmptyDirVolumeSource.md)
 - [EnvVarSource](docs/EnvVarSource.md)
 - [ExecAction](docs/ExecAction.md)
 - [ExecutorConfig](docs/ExecutorConfig.md)
 - [FCVolumeSource](docs/FCVolumeSource.md)
 - [FieldsV1](docs/FieldsV1.md)
 - [FlexVolumeSource](docs/FlexVolumeSource.md)
 - [FlockerVolumeSource](docs/FlockerVolumeSource.md)
 - [GCEPersistentDiskVolumeSource](docs/GCEPersistentDiskVolumeSource.md)
 - [GetOptions](docs/GetOptions.md)
 - [GitArtifact](docs/GitArtifact.md)
 - [GitRepoVolumeSource](docs/GitRepoVolumeSource.md)
 - [GlusterfsVolumeSource](docs/GlusterfsVolumeSource.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [GrpcGatewayRuntimeStreamError](docs/GrpcGatewayRuntimeStreamError.md)
 - [HDFSArtifact](docs/HDFSArtifact.md)
 - [HDFSConfig](docs/HDFSConfig.md)
 - [HDFSKrbConfig](docs/HDFSKrbConfig.md)
 - [HTTPArtifact](docs/HTTPArtifact.md)
 - [HTTPGetAction](docs/HTTPGetAction.md)
 - [HTTPHeader](docs/HTTPHeader.md)
 - [Handler](docs/Handler.md)
 - [HostPathVolumeSource](docs/HostPathVolumeSource.md)
 - [ISCSIVolumeSource](docs/ISCSIVolumeSource.md)
 - [InfoResponse](docs/InfoResponse.md)
 - [Inputs](docs/Inputs.md)
 - [IntOrString](docs/IntOrString.md)
 - [Item](docs/Item.md)
 - [ItemValue](docs/ItemValue.md)
 - [KeyToPath](docs/KeyToPath.md)
 - [LabelSelector](docs/LabelSelector.md)
 - [LabelSelectorRequirement](docs/LabelSelectorRequirement.md)
 - [ListOptions](docs/ListOptions.md)
 - [LogEntry](docs/LogEntry.md)
 - [ManagedFieldsEntry](docs/ManagedFieldsEntry.md)
 - [Metadata](docs/Metadata.md)
 - [NFSVolumeSource](docs/NFSVolumeSource.md)
 - [NodeAffinity](docs/NodeAffinity.md)
 - [NodeSelector](docs/NodeSelector.md)
 - [NodeSelectorRequirement](docs/NodeSelectorRequirement.md)
 - [NodeSelectorTerm](docs/NodeSelectorTerm.md)
 - [NodeStatus](docs/NodeStatus.md)
 - [ObjectFieldSelector](docs/ObjectFieldSelector.md)
 - [Outputs](docs/Outputs.md)
 - [OwnerReference](docs/OwnerReference.md)
 - [ParallelSteps](docs/ParallelSteps.md)
 - [Parameter](docs/Parameter.md)
 - [PersistentVolumeClaimCondition](docs/PersistentVolumeClaimCondition.md)
 - [PersistentVolumeClaimSpec](docs/PersistentVolumeClaimSpec.md)
 - [PersistentVolumeClaimStatus](docs/PersistentVolumeClaimStatus.md)
 - [PersistentVolumeClaimVolumeSource](docs/PersistentVolumeClaimVolumeSource.md)
 - [PhotonPersistentDiskVolumeSource](docs/PhotonPersistentDiskVolumeSource.md)
 - [PodAffinity](docs/PodAffinity.md)
 - [PodAffinityTerm](docs/PodAffinityTerm.md)
 - [PodAntiAffinity](docs/PodAntiAffinity.md)
 - [PodDNSConfigOption](docs/PodDNSConfigOption.md)
 - [PodGC](docs/PodGC.md)
 - [PodLogOptions](docs/PodLogOptions.md)
 - [PortworxVolumeSource](docs/PortworxVolumeSource.md)
 - [Preconditions](docs/Preconditions.md)
 - [PreferredSchedulingTerm](docs/PreferredSchedulingTerm.md)
 - [ProjectedVolumeSource](docs/ProjectedVolumeSource.md)
 - [Quantity](docs/Quantity.md)
 - [QuobyteVolumeSource](docs/QuobyteVolumeSource.md)
 - [RBDVolumeSource](docs/RBDVolumeSource.md)
 - [RawArtifact](docs/RawArtifact.md)
 - [ResourceFieldSelector](docs/ResourceFieldSelector.md)
 - [ResourceTemplate](docs/ResourceTemplate.md)
 - [RetryStrategy](docs/RetryStrategy.md)
 - [S3Artifact](docs/S3Artifact.md)
 - [S3Bucket](docs/S3Bucket.md)
 - [SELinuxOptions](docs/SELinuxOptions.md)
 - [ScaleIOVolumeSource](docs/ScaleIOVolumeSource.md)
 - [ScriptTemplate](docs/ScriptTemplate.md)
 - [SecretEnvSource](docs/SecretEnvSource.md)
 - [SecretProjection](docs/SecretProjection.md)
 - [SecretVolumeSource](docs/SecretVolumeSource.md)
 - [Sequence](docs/Sequence.md)
 - [ServiceAccountTokenProjection](docs/ServiceAccountTokenProjection.md)
 - [StorageOSVolumeSource](docs/StorageOSVolumeSource.md)
 - [SuspendTemplate](docs/SuspendTemplate.md)
 - [Sysctl](docs/Sysctl.md)
 - [TCPSocketAction](docs/TCPSocketAction.md)
 - [TTLStrategy](docs/TTLStrategy.md)
 - [Template](docs/Template.md)
 - [TemplateRef](docs/TemplateRef.md)
 - [TypedLocalObjectReference](docs/TypedLocalObjectReference.md)
 - [UserContainer](docs/UserContainer.md)
 - [ValueFrom](docs/ValueFrom.md)
 - [VolumeProjection](docs/VolumeProjection.md)
 - [VolumeSource](docs/VolumeSource.md)
 - [VsphereVirtualDiskVolumeSource](docs/VsphereVirtualDiskVolumeSource.md)
 - [WeightedPodAffinityTerm](docs/WeightedPodAffinityTerm.md)
 - [WindowsSecurityContextOptions](docs/WindowsSecurityContextOptions.md)
 - [Workflow](docs/Workflow.md)
 - [WorkflowCreateRequest](docs/WorkflowCreateRequest.md)
 - [WorkflowLintRequest](docs/WorkflowLintRequest.md)
 - [WorkflowList](docs/WorkflowList.md)
 - [WorkflowResubmitRequest](docs/WorkflowResubmitRequest.md)
 - [WorkflowResumeRequest](docs/WorkflowResumeRequest.md)
 - [WorkflowRetryRequest](docs/WorkflowRetryRequest.md)
 - [WorkflowSpec](docs/WorkflowSpec.md)
 - [WorkflowStatus](docs/WorkflowStatus.md)
 - [WorkflowStep](docs/WorkflowStep.md)
 - [WorkflowSuspendRequest](docs/WorkflowSuspendRequest.md)
 - [WorkflowTemplate](docs/WorkflowTemplate.md)
 - [WorkflowTemplateCreateRequest](docs/WorkflowTemplateCreateRequest.md)
 - [WorkflowTemplateLintRequest](docs/WorkflowTemplateLintRequest.md)
 - [WorkflowTemplateList](docs/WorkflowTemplateList.md)
 - [WorkflowTemplateSpec](docs/WorkflowTemplateSpec.md)
 - [WorkflowTemplateUpdateRequest](docs/WorkflowTemplateUpdateRequest.md)
 - [WorkflowTerminateRequest](docs/WorkflowTerminateRequest.md)
 - [WorkflowWatchEvent](docs/WorkflowWatchEvent.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### BearerToken

- **Type**: API key
- **API key parameter name**: authorization
- **Location**: HTTP header

### HTTPBasic

- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



