package sample_java;

import graphql.schema.DataFetcher;

public class Resolvers {
  public interface Activity {
    public DataFetcher<Object> activityType();
    public DataFetcher<Iterable<Object>> additionalFields();
    public DataFetcher<Object> consumer();
    public DataFetcher<Object> creationDate();
    public DataFetcher<Object> date();
    public DataFetcher<String> detail();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<Object> producer();
    public DataFetcher<Object> source();
  }
  
  public interface ActivitySource {
    public DataFetcher<Object> contact();
    public DataFetcher<Object> document();
    public DataFetcher<Object> job();
    public DataFetcher<Object> jobMessage();
    public DataFetcher<Object> tenant();
    public DataFetcher<Object> tenantUser();
    public DataFetcher<Object> thirdParty();
  }
  
  public interface ActivityTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ApiDomainUser {
    public DataFetcher<Iterable<String>> authorizedIPs();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> domainId();
    public DataFetcher<String> domainName();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<String> keyPreview();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
  }
  
  public interface ApiDomainUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ApiEnvironmentUser {
    public DataFetcher<Iterable<String>> authorizedIPs();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<String> keyPreview();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
  }
  
  public interface ApiEnvironmentUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ApiTenantUser {
    public DataFetcher<Iterable<String>> authorizedIPs();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<String> keyPreview();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<String> tenantId();
  }
  
  public interface ApiTenantUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ArchiveConfiguration {
    public DataFetcher<Boolean> archiveMetadata();
    public DataFetcher<Object> billingMode();
    public DataFetcher<Integer> durationInMonth();
    public DataFetcher<Object> provider();
  }
  
  public interface BusinessSchemaMutation {
    public DataFetcher<Object> addApiDomainUser();
    public DataFetcher<Object> addApiEnvironmentUser();
    public DataFetcher<Object> addApiTenantUser();
    public DataFetcher<Object> addContact();
    public DataFetcher<Object> addContactFunction();
    public DataFetcher<Object> addDashboardRight();
    public DataFetcher<Object> addDocumentJob();
    public DataFetcher<Object> addDocumentProbativeJob();
    public DataFetcher<Object> addDocumentType();
    public DataFetcher<Object> addDocumentTypeMetadata();
    public DataFetcher<Object> addDomainUser();
    public DataFetcher<Object> addEmailJob();
    public DataFetcher<Object> addEnvironmentUser();
    public DataFetcher<Object> addFaxJob();
    public DataFetcher<Object> addHostedDocumentFile();
    public DataFetcher<Object> addHostedListFile();
    public DataFetcher<Object> addListOfValues();
    public DataFetcher<Object> addMetadata();
    public DataFetcher<Object> addNote();
    public DataFetcher<Object> addPaperMailJob();
    public DataFetcher<Object> addPowerBiAuthToken();
    public DataFetcher<Object> addPushJob();
    public DataFetcher<Object> addService();
    public DataFetcher<Object> addSmsJob();
    public DataFetcher<Object> addTemporaryDocument();
    public DataFetcher<Object> addTenantUser();
    public DataFetcher<Object> addThirdParty();
    public DataFetcher<Object> addThirdPartyType();
    public DataFetcher<Object> addValueOfList();
    public DataFetcher<Object> addVoiceJob();
    public DataFetcher<Object> deleteContact();
    public DataFetcher<Object> deleteContactFunction();
    public DataFetcher<Object> deleteDashboardRight();
    public DataFetcher<Object> deleteDocumentType();
    public DataFetcher<Object> deleteDocumentTypeMetadata();
    public DataFetcher<Object> deleteHostedDocumentFile();
    public DataFetcher<Object> deleteHostedInboundFile();
    public DataFetcher<Object> deleteHostedListFile();
    public DataFetcher<Object> deleteHostedReportFile();
    public DataFetcher<Object> deleteListOfValues();
    public DataFetcher<Object> deleteMetadata();
    public DataFetcher<Object> deleteNote();
    public DataFetcher<Object> deleteService();
    public DataFetcher<Object> deleteTemporaryDocument();
    public DataFetcher<Object> deleteThirdParty();
    public DataFetcher<Object> deleteThirdPartyType();
    public DataFetcher<Object> deleteValueOfList();
    public DataFetcher<Object> editApiDomainUser();
    public DataFetcher<Iterable<Object>> editApiDomainUserRight();
    public DataFetcher<Object> editApiEnvironmentUser();
    public DataFetcher<Iterable<Object>> editApiEnvironmentUserRight();
    public DataFetcher<Object> editApiTenantUser();
    public DataFetcher<Iterable<Object>> editApiTenantUserRight();
    public DataFetcher<Object> editContact();
    public DataFetcher<Object> editContactFunction();
    public DataFetcher<Object> editDocumentType();
    public DataFetcher<Object> editDocumentTypeMetadata();
    public DataFetcher<Object> editDomainUser();
    public DataFetcher<Iterable<Object>> editDomainUserRight();
    public DataFetcher<Object> editEnvironmentUser();
    public DataFetcher<Iterable<Object>> editEnvironmentUserRight();
    public DataFetcher<Object> editErrorQueueMessage();
    public DataFetcher<Object> editListOfValues();
    public DataFetcher<Object> editMetadata();
    public DataFetcher<Object> editNote();
    public DataFetcher<Object> editService();
    public DataFetcher<Object> editTenantUser();
    public DataFetcher<Iterable<Object>> editTenantUserRight();
    public DataFetcher<Object> editThirdParty();
    public DataFetcher<Object> editThirdPartyType();
    public DataFetcher<Object> editValueOfList();
    public DataFetcher<Object> readDocument();
    public DataFetcher<Object> renewApiDomainUser();
    public DataFetcher<Object> renewApiEnvironmentUser();
    public DataFetcher<Object> renewApiTenantUser();
    public DataFetcher<Object> resendInviteDomainUser();
    public DataFetcher<Object> resendInviteEnvironmentUser();
    public DataFetcher<Object> resendInviteTenantUser();
    public DataFetcher<Object> validateDomainUser();
    public DataFetcher<Object> validateEnvironmentUser();
    public DataFetcher<Object> validateTenantUser();
  }
  
  public interface BusinessSchemaQuery {
    public DataFetcher<Iterable<Object>> activityItems();
    public DataFetcher<Object> activityList();
    public DataFetcher<Iterable<Object>> apiDomainUserItems();
    public DataFetcher<Object> apiDomainUserList();
    public DataFetcher<Object> apiDomainUserRightList();
    public DataFetcher<Iterable<Object>> apiEnvironmentUserItems();
    public DataFetcher<Object> apiEnvironmentUserList();
    public DataFetcher<Object> apiEnvironmentUserRightList();
    public DataFetcher<Iterable<Object>> apiTenantUserItems();
    public DataFetcher<Object> apiTenantUserList();
    public DataFetcher<Object> apiTenantUserRightList();
    public DataFetcher<Object> clickedLinkDocumentItems();
    public DataFetcher<Iterable<Object>> contactFunctionItems();
    public DataFetcher<Object> contactFunctionList();
    public DataFetcher<Object> contactFunctionSystemList();
    public DataFetcher<Iterable<Object>> contactItems();
    public DataFetcher<Object> contactList();
    public DataFetcher<Iterable<Object>> dashboardItems();
    public DataFetcher<Object> dashboardList();
    public DataFetcher<Iterable<Object>> dashboardRightItems();
    public DataFetcher<Object> dashboardRightList();
    public DataFetcher<Iterable<Object>> documentCountStatisticsList();
    public DataFetcher<Iterable<Object>> documentItems();
    public DataFetcher<Iterable<Object>> documentJobItems();
    public DataFetcher<Object> documentJobList();
    public DataFetcher<Object> documentList();
    public DataFetcher<Iterable<Object>> documentProbativeJobItems();
    public DataFetcher<Object> documentProbativeJobList();
    public DataFetcher<Object> documentSizeStatistics();
    public DataFetcher<Iterable<Object>> documentSubTypeItems();
    public DataFetcher<Object> documentSubTypeList();
    public DataFetcher<Iterable<Object>> documentTypeItems();
    public DataFetcher<Object> documentTypeList();
    public DataFetcher<Iterable<Object>> domainUserItems();
    public DataFetcher<Object> domainUserList();
    public DataFetcher<Object> domainUserRightList();
    public DataFetcher<Iterable<Object>> environmentUserItems();
    public DataFetcher<Object> environmentUserList();
    public DataFetcher<Object> environmentUserRightList();
    public DataFetcher<Iterable<Object>> errorQueueMessageItems();
    public DataFetcher<Object> errorQueueMessageList();
    public DataFetcher<Iterable<Object>> hostedDocumentFileItems();
    public DataFetcher<Object> hostedDocumentFileList();
    public DataFetcher<Iterable<Object>> hostedInboundFileItems();
    public DataFetcher<Object> hostedInboundFileList();
    public DataFetcher<Iterable<Object>> hostedListFileItems();
    public DataFetcher<Object> hostedListFileList();
    public DataFetcher<Iterable<Object>> hostedReportFileItems();
    public DataFetcher<Object> hostedReportFileList();
    public DataFetcher<Object> inboundFaxList();
    public DataFetcher<Object> inboundSmsList();
    public DataFetcher<Iterable<Object>> jobItemItems();
    public DataFetcher<Object> jobItemList();
    public DataFetcher<Iterable<Object>> jobItems();
    public DataFetcher<Object> jobList();
    public DataFetcher<Iterable<Object>> jobMessageItems();
    public DataFetcher<Object> jobMessageList();
    public DataFetcher<Iterable<Object>> jobSummaryItems();
    public DataFetcher<Object> jobSummaryList();
    public DataFetcher<Iterable<Object>> listOfValuesItems();
    public DataFetcher<Object> listOfValuesList();
    public DataFetcher<Object> listOfValuesSystemList();
    public DataFetcher<Iterable<Object>> metadataItems();
    public DataFetcher<Object> metadataList();
    public DataFetcher<Object> metadataSystemList();
    public DataFetcher<Iterable<Object>> natureItems();
    public DataFetcher<Object> natureList();
    public DataFetcher<Iterable<Object>> noteItems();
    public DataFetcher<Object> noteList();
    public DataFetcher<Iterable<Object>> postalJobItems();
    public DataFetcher<Object> postalJobList();
    public DataFetcher<Object> processingJobCountStatistics();
    public DataFetcher<Object> rightInitialValueList();
    public DataFetcher<String> schema();
    public DataFetcher<Iterable<Object>> serviceItems();
    public DataFetcher<Object> serviceList();
    public DataFetcher<Iterable<Object>> temporaryDocumentItems();
    public DataFetcher<Object> temporaryDocumentList();
    public DataFetcher<Iterable<Object>> tenantUserItems();
    public DataFetcher<Object> tenantUserList();
    public DataFetcher<Object> tenantUserRightList();
    public DataFetcher<String> test();
    public DataFetcher<Iterable<Object>> thirdPartyItems();
    public DataFetcher<Object> thirdPartyList();
    public DataFetcher<Iterable<Object>> thirdPartyTypeItems();
    public DataFetcher<Object> thirdPartyTypeList();
    public DataFetcher<Object> thirdPartyTypeSystemList();
    public DataFetcher<Iterable<Object>> valueOfListItems();
    public DataFetcher<Object> valueOfListList();
    public DataFetcher<Object> valueOfListSystemList();
  }
  
  public interface ClickedLinkDocument {
    public DataFetcher<String> content();
    public DataFetcher<String> documentName();
    public DataFetcher<Object> expirationDate();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isCountExpired();
    public DataFetcher<String> jobId();
    public DataFetcher<String> jobMessageId();
    public DataFetcher<String> tenantId();
  }
  
  public interface Contact {
    public DataFetcher<String> civility();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> culture();
    public DataFetcher<Object> documentTransmissionMode();
    public DataFetcher<String> email();
    public DataFetcher<String> firstName();
    public DataFetcher<Iterable<String>> functionIds();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Boolean> isFavorite();
    public DataFetcher<Boolean> isPrincipal();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> lastName();
    public DataFetcher<String> phone();
    public DataFetcher<String> thirdPartyId();
    public DataFetcher<String> thirdPartyName();
    public DataFetcher<String> timeZone();
  }
  
  public interface ContactFunction {
    public DataFetcher<String> code();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
  }
  
  public interface ContactFunctionTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ContactTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Dashboard {
    public DataFetcher<String> dashboardType();
    public DataFetcher<Object> dashboardVisibility();
    public DataFetcher<String> datasetId();
    public DataFetcher<String> id();
    public DataFetcher<String> name();
    public DataFetcher<String> reportId();
  }
  
  public interface DashboardRight {
    public DataFetcher<String> dashboardType();
    public DataFetcher<String> id();
    public DataFetcher<String> userId();
  }
  
  public interface DashboardRightTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DashboardTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Document {
    public DataFetcher<String> archiveId();
    public DataFetcher<Object> archiver();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> documentSubTypeCode();
    public DataFetcher<String> documentTypeCode();
    public DataFetcher<String> fileContent();
    public DataFetcher<String> fileName();
    public DataFetcher<String> hash();
    public DataFetcher<String> id();
    public DataFetcher<Iterable<String>> jobIds();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Iterable<Object>> metadata();
    public DataFetcher<Object> readDate();
    public DataFetcher<Object> sentDate();
    public DataFetcher<Boolean> signRequired();
    public DataFetcher<Object> signType();
    public DataFetcher<Object> signedDate();
    public DataFetcher<Object> status();
    public DataFetcher<String> tenantId();
  }
  
  public interface DocumentCountStatistics {
    public DataFetcher<Object> count();
    public DataFetcher<String> documentTypeCode();
    public DataFetcher<Integer> month();
    public DataFetcher<Integer> year();
  }
  
  public interface DocumentInfo {
    public DataFetcher<String> hash();
    public DataFetcher<String> id();
  }
  
  public interface DocumentJob {
    public DataFetcher<Iterable<String>> attachmentIds();
    public DataFetcher<Iterable<String>> documentIds();
    public DataFetcher<String> id();
    public DataFetcher<String> note();
    public DataFetcher<String> serviceId();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> trackingId();
    public DataFetcher<Object> validationType();
  }
  
  public interface DocumentJobTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DocumentProbativeJob {
    public DataFetcher<Iterable<String>> attachmentsId();
    public DataFetcher<Iterable<String>> documentsId();
    public DataFetcher<String> id();
    public DataFetcher<String> joinedMessage();
    public DataFetcher<String> note();
    public DataFetcher<Object> registeredPostalOptions();
    public DataFetcher<String> serviceId();
    public DataFetcher<String> subject();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> trackingId();
    public DataFetcher<Object> validationType();
  }
  
  public interface DocumentProbativeJobTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DocumentSizeStatistics {
    public DataFetcher<Object> size();
  }
  
  public interface DocumentSubType {
    public DataFetcher<String> chorusAttachmentTypeCode();
    public DataFetcher<String> chorusAttachmentTypeId();
    public DataFetcher<String> code();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<Iterable<String>> natureCodes();
  }
  
  public interface DocumentSubTypeTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DocumentType {
    public DataFetcher<Object> archiveConfiguration();
    public DataFetcher<String> code();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Iterable<Object>> metadataConfigs();
    public DataFetcher<String> name();
    public DataFetcher<String> natureCode();
    public DataFetcher<Object> sign();
    public DataFetcher<String> tenantId();
  }
  
  public interface DocumentTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DocumentTypeTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DomainRightValue {
    public DataFetcher<Object> right();
    public DataFetcher<Boolean> value();
  }
  
  public interface DomainRightValueTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface DomainUser {
    public DataFetcher<String> civility();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> culture();
    public DataFetcher<String> domainId();
    public DataFetcher<String> domainName();
    public DataFetcher<String> email();
    public DataFetcher<String> firstName();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> lastName();
    public DataFetcher<String> phone();
    public DataFetcher<String> timeZone();
    public DataFetcher<String> userId();
  }
  
  public interface DomainUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface EnvironmentRightValue {
    public DataFetcher<Object> right();
    public DataFetcher<Boolean> value();
  }
  
  public interface EnvironmentRightValueTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface EnvironmentUser {
    public DataFetcher<String> civility();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> culture();
    public DataFetcher<String> email();
    public DataFetcher<String> firstName();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> lastName();
    public DataFetcher<String> phone();
    public DataFetcher<String> timeZone();
    public DataFetcher<String> userId();
  }
  
  public interface EnvironmentUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ErrorQueueMessage {
    public DataFetcher<Object> action();
    public DataFetcher<Integer> errorCode();
    public DataFetcher<String> errorFunctionName();
    public DataFetcher<String> errorMessage();
    public DataFetcher<String> errorServiceName();
    public DataFetcher<String> errorStackTrace();
    public DataFetcher<String> id();
    public DataFetcher<String> jobId();
    public DataFetcher<String> resourceId();
    public DataFetcher<Object> resourceType();
    public DataFetcher<Object> status();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> tenantName();
  }
  
  public interface ErrorQueueMessageTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface FileContent {
    public DataFetcher<String> content();
    public DataFetcher<Object> creationDateTime();
    public DataFetcher<Object> lastModificationDateTime();
    public DataFetcher<String> name();
    public DataFetcher<Object> size();
  }
  
  public interface FileHeader {
    public DataFetcher<Object> creationDateTime();
    public DataFetcher<Object> lastModificationDateTime();
    public DataFetcher<String> name();
    public DataFetcher<Object> size();
  }
  
  public interface FileHeaderTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface IdName {
    public DataFetcher<String> id();
    public DataFetcher<String> name();
  }
  
  public interface IdNameType {
    public DataFetcher<String> id();
    public DataFetcher<String> name();
    public DataFetcher<Object> type();
  }
  
  public interface InboundFax {
    public DataFetcher<Integer> baudRate();
    public DataFetcher<Integer> callTime();
    public DataFetcher<Integer> customerNumber();
    public DataFetcher<String> fileName();
    public DataFetcher<String> folder();
    public DataFetcher<String> from();
    public DataFetcher<Boolean> isDeleted();
    public DataFetcher<String> messageId();
    public DataFetcher<Integer> pages();
    public DataFetcher<Object> receivedDate();
    public DataFetcher<String> to();
  }
  
  public interface InboundFaxTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface InboundSms {
    public DataFetcher<Integer> customerNumber();
    public DataFetcher<String> fromAddress();
    public DataFetcher<Integer> jobItemNumber();
    public DataFetcher<Integer> jobNumber();
    public DataFetcher<String> message();
    public DataFetcher<Object> receivedDate();
    public DataFetcher<String> recipient();
    public DataFetcher<String> toAddress();
  }
  
  public interface InboundSmsTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Job {
    public DataFetcher<Object> completedDate();
    public DataFetcher<Object> creationDate();
    public DataFetcher<Iterable<String>> documentIds();
    public DataFetcher<String> id();
    public DataFetcher<Object> jobType();
    public DataFetcher<String> note();
    public DataFetcher<String> serviceId();
    public DataFetcher<Object> status();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> trackingId();
  }
  
  public interface JobCountStatistics {
    public DataFetcher<Integer> count();
  }
  
  public interface JobCreationResult {
    public DataFetcher<Iterable<Object>> attachments();
    public DataFetcher<Iterable<Object>> documents();
    public DataFetcher<String> id();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> trackingId();
  }
  
  public interface JobItem {
    public DataFetcher<String> address();
    public DataFetcher<String> answerBack();
    public DataFetcher<Integer> attempts();
    public DataFetcher<Integer> baudRate();
    public DataFetcher<Integer> bytes();
    public DataFetcher<String> callAnalysis();
    public DataFetcher<Integer> callTime();
    public DataFetcher<Double> connectionDuration();
    public DataFetcher<Object> faxResolution();
    public DataFetcher<Object> finishDate();
    public DataFetcher<Object> firstDate();
    public DataFetcher<Boolean> isSent();
    public DataFetcher<Integer> jobItemNumber();
    public DataFetcher<Integer> jobNumber();
    public DataFetcher<Double> lastCall();
    public DataFetcher<Double> lastConnectionDuration();
    public DataFetcher<Object> media();
    public DataFetcher<String> outcome();
    public DataFetcher<String> outcomes();
    public DataFetcher<Integer> pages();
    public DataFetcher<Object> priority();
    public DataFetcher<String> recipient();
    public DataFetcher<Integer> sentPages();
    public DataFetcher<Integer> status();
    public DataFetcher<String> statusText();
    public DataFetcher<String> trackingId();
    public DataFetcher<String> uD1();
    public DataFetcher<String> uD2();
    public DataFetcher<String> uD3();
    public DataFetcher<String> uD4();
    public DataFetcher<String> uD5();
  }
  
  public interface JobItemTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface JobMessage {
    public DataFetcher<String> contactId();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<Iterable<String>> documentIds();
    public DataFetcher<String> emailAddress();
    public DataFetcher<String> id();
    public DataFetcher<String> jobId();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Object> messageType();
    public DataFetcher<String> name();
    public DataFetcher<String> recipientName();
    public DataFetcher<Object> status();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> thirdPartyId();
    public DataFetcher<String> trackingId();
    public DataFetcher<Object> transmissionStatus();
  }
  
  public interface JobMessageTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface JobResult {
    public DataFetcher<Integer> jobNumber();
  }
  
  public interface JobSummary {
    public DataFetcher<Integer> applicationId();
    public DataFetcher<Object> creationDate();
    public DataFetcher<Integer> customerNumber();
    public DataFetcher<Integer> failed();
    public DataFetcher<String> firstDoc();
    public DataFetcher<String> firstList();
    public DataFetcher<Boolean> isProofJob();
    public DataFetcher<Integer> jobNumber();
    public DataFetcher<String> jobType();
    public DataFetcher<String> login();
    public DataFetcher<Object> media();
    public DataFetcher<Object> mostRecentDate();
    public DataFetcher<Integer> page();
    public DataFetcher<Integer> pageSent();
    public DataFetcher<Integer> remaining();
    public DataFetcher<Integer> retries();
    public DataFetcher<Integer> sent();
    public DataFetcher<Object> startDate();
    public DataFetcher<Object> status();
    public DataFetcher<String> tID();
    public DataFetcher<Integer> total();
  }
  
  public interface JobSummaryTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface JobTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface KeyValue {
    public DataFetcher<String> key();
    public DataFetcher<String> value();
  }
  
  public interface KeyValuePair {
    public DataFetcher<String> key();
    public DataFetcher<String> value();
  }
  
  public interface ListOfValues {
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Iterable<String>> metadataIds();
    public DataFetcher<String> name();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
    public DataFetcher<Integer> valueCount();
  }
  
  public interface ListOfValuesTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Metadata {
    public DataFetcher<String> code();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<Object> dataType();
    public DataFetcher<Iterable<String>> documentTypeIds();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> listOfValuesId();
    public DataFetcher<String> name();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
  }
  
  public interface MetadataConfig {
    public DataFetcher<String> defaultValue();
    public DataFetcher<String> expectedFormat();
    public DataFetcher<Boolean> isDeletable();
    public DataFetcher<Boolean> isEditable();
    public DataFetcher<Boolean> isMandatory();
    public DataFetcher<String> metadataId();
  }
  
  public interface MetadataTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Nature {
    public DataFetcher<Object> archiveConfiguration();
    public DataFetcher<String> code();
    public DataFetcher<Object> cycle();
    public DataFetcher<String> id();
    public DataFetcher<String> label();
    public DataFetcher<Iterable<Object>> metadataConfigs();
  }
  
  public interface NatureTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Note {
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
    public DataFetcher<String> text();
  }
  
  public interface NoteTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface PageInfo {
    public DataFetcher<String> endCursor();
    public DataFetcher<Boolean> hasNextPage();
  }
  
  public interface PaperMailJob {
    public DataFetcher<Object> completedDate();
    public DataFetcher<Iterable<String>> documentIds();
    public DataFetcher<String> id();
    public DataFetcher<String> note();
    public DataFetcher<String> serviceId();
    public DataFetcher<Object> status();
    public DataFetcher<String> trackingId();
  }
  
  public interface PostalAddress {
    public DataFetcher<String> additionalGeographicInfo();
    public DataFetcher<String> additionalInfo();
    public DataFetcher<String> city();
    public DataFetcher<String> country();
    public DataFetcher<String> name();
    public DataFetcher<String> postBox();
    public DataFetcher<String> street();
    public DataFetcher<String> zipCode();
  }
  
  public interface PostalJobTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface PowerBiAuthToken {
    public DataFetcher<String> accessToken();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> embedUrl();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
  }
  
  public interface RegisteredPostalOptions {
    public DataFetcher<Boolean> anonymous();
  }
  
  public interface RightInitialValue {
    public DataFetcher<Object> actionType();
    public DataFetcher<String> category();
    public DataFetcher<Boolean> initialValue();
    public DataFetcher<Object> right();
    public DataFetcher<String> subCategory();
  }
  
  public interface RightInitialValueTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface Service {
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<Object> customSmtpConfig();
    public DataFetcher<Boolean> hasCustomSmtpConfig();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<String> tenantId();
    public DataFetcher<Integer> tenantUserCount();
  }
  
  public interface ServiceTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface SmtpConfig {
    public DataFetcher<String> errorAddress();
    public DataFetcher<Boolean> hasSmtpSsl();
    public DataFetcher<String> replyAddress();
    public DataFetcher<String> senderAddress();
    public DataFetcher<String> senderName();
    public DataFetcher<String> smtpLogin();
    public DataFetcher<String> smtpPassword();
    public DataFetcher<Integer> smtpPort();
    public DataFetcher<String> smtpServer();
  }
  
  public interface TemporaryDocumentContent {
    public DataFetcher<String> content();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Iterable<Object>> metadata();
    public DataFetcher<String> name();
    public DataFetcher<Object> size();
    public DataFetcher<Object> storageEndDate();
    public DataFetcher<String> tenantId();
  }
  
  public interface TemporaryDocumentHeader {
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<Iterable<Object>> metadata();
    public DataFetcher<String> name();
    public DataFetcher<Object> size();
    public DataFetcher<Object> storageEndDate();
    public DataFetcher<String> tenantId();
  }
  
  public interface TemporaryDocumentHeaderTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface TenantRightValue {
    public DataFetcher<Object> right();
    public DataFetcher<Boolean> value();
  }
  
  public interface TenantRightValueTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface TenantUser {
    public DataFetcher<String> civility();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> culture();
    public DataFetcher<Object> documentAccessType();
    public DataFetcher<String> email();
    public DataFetcher<String> firstName();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastConnectionDate();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> lastName();
    public DataFetcher<String> phone();
    public DataFetcher<Iterable<Object>> services();
    public DataFetcher<String> tenantId();
    public DataFetcher<String> timeZone();
    public DataFetcher<String> userId();
    public DataFetcher<Boolean> weeklyReport();
  }
  
  public interface TenantUserTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ThirdParty {
    public DataFetcher<Object> address();
    public DataFetcher<String> code();
    public DataFetcher<Integer> contactCount();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Boolean> isMoralPerson();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<String> tenantId();
    public DataFetcher<Iterable<String>> thirdPartyTypeIds();
  }
  
  public interface ThirdPartyType {
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Boolean> isEnabled();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> name();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
  }
  
  public interface ThirdPartyTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ThirdPartyTypeTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
  public interface ValueOfList {
    public DataFetcher<String> code();
    public DataFetcher<Object> creationDate();
    public DataFetcher<String> creationUserId();
    public DataFetcher<String> creationUserLabel();
    public DataFetcher<String> id();
    public DataFetcher<Object> lastModificationDate();
    public DataFetcher<String> lastModificationUserId();
    public DataFetcher<String> lastModificationUserLabel();
    public DataFetcher<String> listOfValuesId();
    public DataFetcher<String> name();
    public DataFetcher<String> ownerId();
    public DataFetcher<Object> ownerType();
  }
  
  public interface ValueOfListTypeConnection {
    public DataFetcher<Iterable<Object>> edges();
    public DataFetcher<Object> pageInfo();
  }
  
}
