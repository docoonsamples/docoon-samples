export type Maybe<T> = T | null;
export type InputMaybe<T> = Maybe<T>;
export type Exact<T extends { [key: string]: unknown }> = { [K in keyof T]: T[K] };
export type MakeOptional<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]?: Maybe<T[SubKey]> };
export type MakeMaybe<T, K extends keyof T> = Omit<T, K> & { [SubKey in K]: Maybe<T[SubKey]> };
/** All built-in and custom scalars, mapped to their actual values */
export type Scalars = {
  ID: string;
  String: string;
  Boolean: boolean;
  Int: number;
  Float: number;
  Byte: any;
  /**
   * The `DateTime` scalar type represents a date and time. `DateTime` expects
   * timestamps to be formatted in accordance with the
   * [ISO-8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
   */
  DateTime: any;
  Long: any;
  Void: any;
};

export type Activity = {
  __typename?: 'Activity';
  activityType: ActivityCategory;
  additionalFields?: Maybe<Array<Maybe<KeyValue>>>;
  consumer?: Maybe<IdNameType>;
  creationDate?: Maybe<Scalars['DateTime']>;
  date: Scalars['DateTime'];
  detail?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  producer?: Maybe<IdNameType>;
  source?: Maybe<ActivitySource>;
};

export type ActivityActivityActorTypeEnumFilter = {
  field: ActivityActorTypeFilterField;
  filterValue1: ActivityActorType;
  filterValue2?: InputMaybe<ActivityActorType>;
  operator: NumberFilterOperator;
};

export type ActivityActivityCategoryEnumFilter = {
  field: ActivityCategoryFilterField;
  filterValue1: ActivityCategory;
  filterValue2?: InputMaybe<ActivityCategory>;
  operator: NumberFilterOperator;
};

export type ActivityActivitySourceTypeEnumFilter = {
  field: ActivitySourceTypeFilterField;
  filterValue1: ActivitySourceType;
  filterValue2?: InputMaybe<ActivitySourceType>;
  operator: NumberFilterOperator;
};

export enum ActivityActorType {
  Contact = 'CONTACT',
  EmailAddress = 'EMAIL_ADDRESS',
  External = 'EXTERNAL',
  PostalAddress = 'POSTAL_ADDRESS',
  Service = 'SERVICE',
  System = 'SYSTEM',
  TenantUser = 'TENANT_USER',
  ThirdParty = 'THIRD_PARTY'
}

export enum ActivityActorTypeFilterField {
  ConsumerType = 'CONSUMER_TYPE',
  ProducerType = 'PRODUCER_TYPE'
}

export enum ActivityCategory {
  AddAttachmentsDocument = 'ADD_ATTACHMENTS_DOCUMENT',
  AddDataFileAction = 'ADD_DATA_FILE_ACTION',
  CancelJobMessage = 'CANCEL_JOB_MESSAGE',
  ChangeStatusChorusB_2G = 'CHANGE_STATUS_CHORUS_B_2_G',
  CompleteChorusB_2G = 'COMPLETE_CHORUS_B_2_G',
  DocumentArchived = 'DOCUMENT_ARCHIVED',
  DocumentCanceled = 'DOCUMENT_CANCELED',
  DocumentRead = 'DOCUMENT_READ',
  DocumentSigned = 'DOCUMENT_SIGNED',
  EditMetadataDocument = 'EDIT_METADATA_DOCUMENT',
  Error = 'ERROR',
  ExternalProcess = 'EXTERNAL_PROCESS',
  JobCreated = 'JOB_CREATED',
  JobLaunched = 'JOB_LAUNCHED',
  JobProcessing = 'JOB_PROCESSING',
  NotificationSent = 'NOTIFICATION_SENT',
  SendChorusB_2G = 'SEND_CHORUS_B_2_G'
}

export enum ActivityCategoryFilterField {
  ActivityType = 'ACTIVITY_TYPE'
}

export type ActivityDateFilter = {
  field: ActivityDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum ActivityDateFilterField {
  Date = 'DATE'
}

export type ActivityQueryParams = {
  actorTypeFilters?: InputMaybe<Array<InputMaybe<ActivityActivityActorTypeEnumFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<ActivityDateFilter>>>;
  eventTypeFilters?: InputMaybe<Array<InputMaybe<ActivityActivityCategoryEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ActivitySortField>;
  sourceTypeFilters?: InputMaybe<Array<InputMaybe<ActivityActivitySourceTypeEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<ActivityStringFilter>>>;
};

export enum ActivitySortField {
  ActivityType = 'ACTIVITY_TYPE',
  Consumer = 'CONSUMER',
  ContactSourceName = 'CONTACT_SOURCE_NAME',
  Date = 'DATE',
  Detail = 'DETAIL',
  DocumentSourceName = 'DOCUMENT_SOURCE_NAME',
  JobMessageSourceName = 'JOB_MESSAGE_SOURCE_NAME',
  JobSourceName = 'JOB_SOURCE_NAME',
  Producer = 'PRODUCER',
  TenantSourceName = 'TENANT_SOURCE_NAME',
  TenantUserSourceName = 'TENANT_USER_SOURCE_NAME',
  ThirdPartySourceName = 'THIRD_PARTY_SOURCE_NAME'
}

export type ActivitySource = {
  __typename?: 'ActivitySource';
  contact?: Maybe<IdName>;
  document?: Maybe<IdName>;
  job?: Maybe<IdName>;
  jobMessage?: Maybe<IdName>;
  tenant?: Maybe<IdName>;
  tenantUser?: Maybe<IdName>;
  thirdParty?: Maybe<IdName>;
};

export enum ActivitySourceType {
  Contact = 'CONTACT',
  Document = 'DOCUMENT',
  Job = 'JOB',
  JobMessage = 'JOB_MESSAGE',
  Tenant = 'TENANT',
  TenantUser = 'TENANT_USER',
  ThirdParty = 'THIRD_PARTY'
}

export enum ActivitySourceTypeFilterField {
  SourceType = 'SOURCE_TYPE'
}

export type ActivityStringFilter = {
  field: ActivityStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ActivityStringFilterField {
  ConsumerId = 'CONSUMER_ID',
  ConsumerName = 'CONSUMER_NAME',
  ContactSourceId = 'CONTACT_SOURCE_ID',
  ContactSourceName = 'CONTACT_SOURCE_NAME',
  DocumentSourceId = 'DOCUMENT_SOURCE_ID',
  DocumentSourceName = 'DOCUMENT_SOURCE_NAME',
  JobMessageSourceId = 'JOB_MESSAGE_SOURCE_ID',
  JobMessageSourceName = 'JOB_MESSAGE_SOURCE_NAME',
  JobSourceId = 'JOB_SOURCE_ID',
  JobSourceName = 'JOB_SOURCE_NAME',
  ProducerId = 'PRODUCER_ID',
  ProducerName = 'PRODUCER_NAME',
  TenantSourceId = 'TENANT_SOURCE_ID',
  TenantSourceName = 'TENANT_SOURCE_NAME',
  TenantUserSourceId = 'TENANT_USER_SOURCE_ID',
  TenantUserSourceName = 'TENANT_USER_SOURCE_NAME',
  ThirdPartySourceId = 'THIRD_PARTY_SOURCE_ID',
  ThirdPartySourceName = 'THIRD_PARTY_SOURCE_NAME'
}

export type ActivityTypeConnection = {
  __typename?: 'ActivityTypeConnection';
  edges?: Maybe<Array<Maybe<Activity>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ApiDomainUser = {
  __typename?: 'ApiDomainUser';
  authorizedIPs?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  domainId: Scalars['String'];
  domainName: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  keyPreview: Scalars['String'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
};

export type ApiDomainUserBoolFilter = {
  field: ApiDomainUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ApiDomainUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ApiDomainUserDateFilter = {
  field: ApiDomainUserDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum ApiDomainUserDateFilterField {
  CreationDate = 'CREATION_DATE',
  LastConnectionDate = 'LAST_CONNECTION_DATE'
}

export type ApiDomainUserInput = {
  authorizedIPs?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  domainId: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type ApiDomainUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ApiDomainUserBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<ApiDomainUserDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ApiDomainUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ApiDomainUserStringFilter>>>;
};

export enum ApiDomainUserSortField {
  CreationDate = 'CREATION_DATE',
  CreationUserLabel = 'CREATION_USER_LABEL',
  DomainId = 'DOMAIN_ID',
  IsEnabled = 'IS_ENABLED',
  LastConnectionDate = 'LAST_CONNECTION_DATE',
  Name = 'NAME'
}

export type ApiDomainUserStringFilter = {
  field: ApiDomainUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ApiDomainUserStringFilterField {
  CreationUserId = 'CREATION_USER_ID',
  CreationUserLabel = 'CREATION_USER_LABEL',
  DomainId = 'DOMAIN_ID',
  Name = 'NAME'
}

export type ApiDomainUserTypeConnection = {
  __typename?: 'ApiDomainUserTypeConnection';
  edges?: Maybe<Array<Maybe<ApiDomainUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ApiEnvironmentUser = {
  __typename?: 'ApiEnvironmentUser';
  authorizedIPs?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  keyPreview: Scalars['String'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
};

export type ApiEnvironmentUserBoolFilter = {
  field: ApiEnvironmentUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ApiEnvironmentUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ApiEnvironmentUserDateFilter = {
  field: ApiEnvironmentUserDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum ApiEnvironmentUserDateFilterField {
  CreationDate = 'CREATION_DATE',
  LastConnectionDate = 'LAST_CONNECTION_DATE'
}

export type ApiEnvironmentUserInput = {
  authorizedIPs?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type ApiEnvironmentUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ApiEnvironmentUserBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<ApiEnvironmentUserDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ApiEnvironmentUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ApiEnvironmentUserStringFilter>>>;
};

export enum ApiEnvironmentUserSortField {
  CreationDate = 'CREATION_DATE',
  CreationUserLabel = 'CREATION_USER_LABEL',
  IsEnabled = 'IS_ENABLED',
  LastConnectionDate = 'LAST_CONNECTION_DATE',
  Name = 'NAME'
}

export type ApiEnvironmentUserStringFilter = {
  field: ApiEnvironmentUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ApiEnvironmentUserStringFilterField {
  CreationUserId = 'CREATION_USER_ID',
  CreationUserLabel = 'CREATION_USER_LABEL',
  Name = 'NAME'
}

export type ApiEnvironmentUserTypeConnection = {
  __typename?: 'ApiEnvironmentUserTypeConnection';
  edges?: Maybe<Array<Maybe<ApiEnvironmentUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ApiRoutingConfiguration = {
  __typename?: 'ApiRoutingConfiguration';
  action: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  format: Scalars['String'];
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  ownerId?: Maybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
  queueName?: Maybe<Scalars['String']>;
};

export type ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilter = {
  field: ApiRoutingConfigurationOwnerTypeFilterField;
  filterValue1: InheritedConfigurationOwnerType;
  filterValue2?: InputMaybe<InheritedConfigurationOwnerType>;
  operator: NumberFilterOperator;
};

export type ApiRoutingConfigurationInput = {
  action: Scalars['String'];
  format: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  ownerId: Scalars['String'];
  ownerType: InheritedConfigurationOwnerType;
  queueName: Scalars['String'];
  sender?: InputMaybe<PostalAddressInput>;
};

export enum ApiRoutingConfigurationOwnerTypeFilterField {
  OwnerType = 'OWNER_TYPE'
}

export type ApiRoutingConfigurationQueryParams = {
  ownerTypeFilters?: InputMaybe<Array<InputMaybe<ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ApiRoutingConfigurationSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ApiRoutingConfigurationStringFilter>>>;
};

export enum ApiRoutingConfigurationSortField {
  Action = 'ACTION',
  CreationDate = 'CREATION_DATE',
  Format = 'FORMAT',
  LastModificationDate = 'LAST_MODIFICATION_DATE',
  OwnerId = 'OWNER_ID',
  OwnerType = 'OWNER_TYPE',
  QueueName = 'QUEUE_NAME'
}

export type ApiRoutingConfigurationStringFilter = {
  field: ApiRoutingConfigurationStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ApiRoutingConfigurationStringFilterField {
  Action = 'ACTION',
  Format = 'FORMAT',
  OwnerId = 'OWNER_ID',
  QueueName = 'QUEUE_NAME'
}

export type ApiRoutingConfigurationTypeConnection = {
  __typename?: 'ApiRoutingConfigurationTypeConnection';
  edges?: Maybe<Array<Maybe<ApiRoutingConfiguration>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ApiTenantUser = {
  __typename?: 'ApiTenantUser';
  authorizedIPs?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  keyPreview: Scalars['String'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  tenantId: Scalars['String'];
};

export type ApiTenantUserBoolFilter = {
  field: ApiTenantUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ApiTenantUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ApiTenantUserDateFilter = {
  field: ApiTenantUserDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum ApiTenantUserDateFilterField {
  CreationDate = 'CREATION_DATE',
  LastConnectionDate = 'LAST_CONNECTION_DATE'
}

export type ApiTenantUserInput = {
  authorizedIPs?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type ApiTenantUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ApiTenantUserBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<ApiTenantUserDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ApiTenantUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ApiTenantUserStringFilter>>>;
};

export enum ApiTenantUserSortField {
  CreationDate = 'CREATION_DATE',
  CreationUserLabel = 'CREATION_USER_LABEL',
  IsEnabled = 'IS_ENABLED',
  LastConnectionDate = 'LAST_CONNECTION_DATE',
  Name = 'NAME',
  TenantId = 'TENANT_ID'
}

export type ApiTenantUserStringFilter = {
  field: ApiTenantUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ApiTenantUserStringFilterField {
  CreationUserId = 'CREATION_USER_ID',
  CreationUserLabel = 'CREATION_USER_LABEL',
  Name = 'NAME',
  TenantId = 'TENANT_ID'
}

export type ApiTenantUserTypeConnection = {
  __typename?: 'ApiTenantUserTypeConnection';
  edges?: Maybe<Array<Maybe<ApiTenantUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ArchiveConfiguration = {
  __typename?: 'ArchiveConfiguration';
  archiveMetadata: Scalars['Boolean'];
  billingMode: ArchiveConfigurationBillingMode;
  durationInMonth: Scalars['Int'];
  provider: ArchiverProvider;
};

export enum ArchiveConfigurationBillingMode {
  Files = 'FILES',
  Giga = 'GIGA'
}

export type ArchiveConfigurationInput = {
  archiveMetadata: Scalars['Boolean'];
  billingMode: ArchiveConfigurationBillingMode;
  durationInMonth: Scalars['Int'];
  provider: ArchiverProvider;
};

export enum ArchiverProvider {
  Docoon = 'DOCOON',
  Xelians = 'XELIANS'
}

export enum ArrayElementFilterOperator {
  Between = 'BETWEEN',
  Contain = 'CONTAIN',
  Defined = 'DEFINED',
  EndWith = 'END_WITH',
  Equal = 'EQUAL',
  EqualOrUndefined = 'EQUAL_OR_UNDEFINED',
  GreaterThan = 'GREATER_THAN',
  GreaterThanOrEqual = 'GREATER_THAN_OR_EQUAL',
  InArray = 'IN_ARRAY',
  IsNotNull = 'IS_NOT_NULL',
  IsNull = 'IS_NULL',
  LowerThan = 'LOWER_THAN',
  LowerThanOrEqual = 'LOWER_THAN_OR_EQUAL',
  NotContain = 'NOT_CONTAIN',
  NotEndWith = 'NOT_END_WITH',
  NotEqual = 'NOT_EQUAL',
  NotStartWith = 'NOT_START_WITH',
  StartWith = 'START_WITH',
  Undefined = 'UNDEFINED'
}

export type AttachmentInput = {
  existingDocumentId?: InputMaybe<Scalars['String']>;
  newDocument?: InputMaybe<DocumentInput>;
};

export enum BoolFilterOperator {
  Defined = 'DEFINED',
  Equal = 'EQUAL',
  EqualOrUndefined = 'EQUAL_OR_UNDEFINED',
  IsNotNull = 'IS_NOT_NULL',
  IsNull = 'IS_NULL',
  NotEqual = 'NOT_EQUAL',
  Undefined = 'UNDEFINED'
}

export type BusinessSchemaMutation = {
  __typename?: 'BusinessSchemaMutation';
  addApiDomainUser?: Maybe<ApiDomainUser>;
  addApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  addApiRoutingConfiguration?: Maybe<ApiRoutingConfiguration>;
  addApiTenantUser?: Maybe<ApiTenantUser>;
  addContact?: Maybe<Contact>;
  addContactFunction?: Maybe<ContactFunction>;
  addDashboardRight?: Maybe<DashboardRight>;
  addDataFileAction?: Maybe<DataFileActionResult>;
  addDocumentJob?: Maybe<JobCreationResult>;
  addDocumentProbativeJob?: Maybe<JobCreationResult>;
  addDocumentType?: Maybe<DocumentType>;
  addDocumentTypeMetadata?: Maybe<DocumentType>;
  addDomainUser?: Maybe<DomainUser>;
  addEmailJob?: Maybe<JobResult>;
  addEnvironmentUser?: Maybe<EnvironmentUser>;
  addFaxJob?: Maybe<JobResult>;
  addHostedDocumentFile?: Maybe<FileContent>;
  addHostedListFile?: Maybe<FileContent>;
  addIncomingEmailHistory?: Maybe<IncomingEmailHistory>;
  addListOfValues?: Maybe<ListOfValues>;
  addMetadata?: Maybe<Metadata>;
  addNote?: Maybe<Note>;
  addPostalJob?: Maybe<JobCreationResult>;
  addPostalParameterConfiguration?: Maybe<PostalParameterConfiguration>;
  addPowerBiAuthToken?: Maybe<PowerBiAuthToken>;
  addPushJob?: Maybe<JobResult>;
  addService?: Maybe<Service>;
  addSmsJob?: Maybe<JobResult>;
  addTemplateContent?: Maybe<TemplateContent>;
  addTemplateStructure?: Maybe<TemplateStructure>;
  addTemporaryDocument?: Maybe<TemporaryDocumentContent>;
  addTenantUser?: Maybe<TenantUser>;
  addThirdParty?: Maybe<ThirdParty>;
  addThirdPartyType?: Maybe<ThirdPartyType>;
  addValueOfList?: Maybe<ValueOfList>;
  addVoiceJob?: Maybe<JobResult>;
  deleteApiRoutingConfiguration?: Maybe<Scalars['Void']>;
  deleteContact?: Maybe<Scalars['Void']>;
  deleteContactFunction?: Maybe<Scalars['Void']>;
  deleteDashboardRight?: Maybe<Scalars['Void']>;
  deleteDocumentType?: Maybe<Scalars['Void']>;
  deleteDocumentTypeMetadata?: Maybe<Scalars['Void']>;
  deleteHostedDocumentFile?: Maybe<Scalars['Void']>;
  deleteHostedInboundFile?: Maybe<Scalars['Void']>;
  deleteHostedListFile?: Maybe<Scalars['Void']>;
  deleteHostedReportFile?: Maybe<Scalars['Void']>;
  deleteIncomingEmailHistory?: Maybe<Scalars['Void']>;
  deleteListOfValues?: Maybe<Scalars['Void']>;
  deleteMetadata?: Maybe<Scalars['Void']>;
  deleteNote?: Maybe<Scalars['Void']>;
  deletePostalParameterConfiguration?: Maybe<Scalars['Void']>;
  deleteService?: Maybe<Scalars['Void']>;
  deleteTemplateContent?: Maybe<Scalars['Void']>;
  deleteTemplateStructure?: Maybe<Scalars['Void']>;
  deleteTemporaryDocument?: Maybe<Scalars['Void']>;
  deleteThirdParty?: Maybe<Scalars['Void']>;
  deleteThirdPartyType?: Maybe<Scalars['Void']>;
  deleteValueOfList?: Maybe<Scalars['Void']>;
  editApiDomainUser?: Maybe<ApiDomainUser>;
  editApiDomainUserRight?: Maybe<Array<DomainRightValue>>;
  editApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  editApiEnvironmentUserRight?: Maybe<Array<EnvironmentRightValue>>;
  editApiRoutingConfiguration?: Maybe<ApiRoutingConfiguration>;
  editApiTenantUser?: Maybe<ApiTenantUser>;
  editApiTenantUserRight?: Maybe<Array<TenantRightValue>>;
  editContact?: Maybe<Contact>;
  editContactFunction?: Maybe<ContactFunction>;
  editDocumentType?: Maybe<DocumentType>;
  editDocumentTypeMetadata?: Maybe<DocumentType>;
  editDomainUser?: Maybe<DomainUser>;
  editDomainUserRight?: Maybe<Array<DomainRightValue>>;
  editEnvironmentUser?: Maybe<EnvironmentUser>;
  editEnvironmentUserRight?: Maybe<Array<EnvironmentRightValue>>;
  editErrorQueueMessage?: Maybe<ErrorQueueMessage>;
  editIncomingEmailHistory?: Maybe<IncomingEmailHistory>;
  editListOfValues?: Maybe<ListOfValues>;
  editMetadata?: Maybe<Metadata>;
  editNote?: Maybe<Note>;
  editPostalParameterConfiguration?: Maybe<PostalParameterConfiguration>;
  editService?: Maybe<Service>;
  editTemplateContent?: Maybe<TemplateContent>;
  editTemplateStructure?: Maybe<TemplateStructure>;
  editTenantUser?: Maybe<TenantUser>;
  editTenantUserRight?: Maybe<Array<TenantRightValue>>;
  editThirdParty?: Maybe<ThirdParty>;
  editThirdPartyType?: Maybe<ThirdPartyType>;
  editValueOfList?: Maybe<ValueOfList>;
  readDocument?: Maybe<Scalars['Void']>;
  relaunchJobMessage?: Maybe<Scalars['Void']>;
  renewApiDomainUser?: Maybe<ApiDomainUser>;
  renewApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  renewApiTenantUser?: Maybe<ApiTenantUser>;
  resendInviteDomainUser?: Maybe<Scalars['Void']>;
  resendInviteEnvironmentUser?: Maybe<Scalars['Void']>;
  resendInviteTenantUser?: Maybe<Scalars['Void']>;
  runActionOnDocument?: Maybe<Scalars['Void']>;
  runActionOnJob?: Maybe<Scalars['Void']>;
  runActionOnJobMessage?: Maybe<Scalars['Void']>;
  validateDomainUser?: Maybe<DomainUser>;
  validateEnvironmentUser?: Maybe<EnvironmentUser>;
  validateTenantUser?: Maybe<TenantUser>;
};


export type BusinessSchemaMutationAddApiDomainUserArgs = {
  item: ApiDomainUserInput;
};


export type BusinessSchemaMutationAddApiEnvironmentUserArgs = {
  item: ApiEnvironmentUserInput;
};


export type BusinessSchemaMutationAddApiRoutingConfigurationArgs = {
  item: ApiRoutingConfigurationInput;
};


export type BusinessSchemaMutationAddApiTenantUserArgs = {
  item: ApiTenantUserInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddContactArgs = {
  item: ContactInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddContactFunctionArgs = {
  item: ContactFunctionInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDashboardRightArgs = {
  item: DashboardRightInput;
};


export type BusinessSchemaMutationAddDataFileActionArgs = {
  item: DataFileActionInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDocumentJobArgs = {
  item: DocumentJobInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDocumentProbativeJobArgs = {
  item: DocumentProbativeJobInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDocumentTypeArgs = {
  item: DocumentTypeInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDocumentTypeMetadataArgs = {
  documentTypeId: Scalars['String'];
  item: MetadataConfigInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddDomainUserArgs = {
  item: DomainUserInput;
};


export type BusinessSchemaMutationAddEmailJobArgs = {
  item: EmailJob;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddEnvironmentUserArgs = {
  item: EnvironmentUserInput;
};


export type BusinessSchemaMutationAddFaxJobArgs = {
  item: FaxJob;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddHostedDocumentFileArgs = {
  item: FileContentInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddHostedListFileArgs = {
  item: FileContentInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddIncomingEmailHistoryArgs = {
  item: IncomingEmailHistoryInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddListOfValuesArgs = {
  item: ListOfValuesInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddMetadataArgs = {
  item: MetadataInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddNoteArgs = {
  item: NoteInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddPostalJobArgs = {
  item: PostalJobInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddPostalParameterConfigurationArgs = {
  item: PostalParameterConfigurationInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddPowerBiAuthTokenArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationAddPushJobArgs = {
  item: PushJob;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddServiceArgs = {
  item: ServiceInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddSmsJobArgs = {
  item: SmsJob;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddTemplateContentArgs = {
  item: TemplateContentInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddTemplateStructureArgs = {
  item: TemplateStructureInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddTemporaryDocumentArgs = {
  item: TemporaryDocumentContentInput;
};


export type BusinessSchemaMutationAddTenantUserArgs = {
  item: TenantUserInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddThirdPartyArgs = {
  item: ThirdPartyInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddThirdPartyTypeArgs = {
  item: ThirdPartyTypeInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddValueOfListArgs = {
  item: ValueOfListInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationAddVoiceJobArgs = {
  item: VoiceJob;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteApiRoutingConfigurationArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationDeleteContactArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteContactFunctionArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteDashboardRightArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationDeleteDocumentTypeArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteDocumentTypeMetadataArgs = {
  documentTypeId: Scalars['String'];
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteHostedDocumentFileArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteHostedInboundFileArgs = {
  id: Scalars['String'];
  inboundFolder: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteHostedListFileArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteHostedReportFileArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteIncomingEmailHistoryArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteListOfValuesArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteMetadataArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteNoteArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeletePostalParameterConfigurationArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteServiceArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteTemplateContentArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteTemplateStructureArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteTemporaryDocumentArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationDeleteThirdPartyArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteThirdPartyTypeArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationDeleteValueOfListArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditApiDomainUserArgs = {
  id: Scalars['String'];
  item: ApiDomainUserInput;
};


export type BusinessSchemaMutationEditApiDomainUserRightArgs = {
  apiUserId: Scalars['String'];
  item?: InputMaybe<Array<DomainRightValueInput>>;
};


export type BusinessSchemaMutationEditApiEnvironmentUserArgs = {
  id: Scalars['String'];
  item: ApiEnvironmentUserInput;
};


export type BusinessSchemaMutationEditApiEnvironmentUserRightArgs = {
  apiUserId: Scalars['String'];
  item?: InputMaybe<Array<EnvironmentRightValueInput>>;
};


export type BusinessSchemaMutationEditApiRoutingConfigurationArgs = {
  id: Scalars['String'];
  item: ApiRoutingConfigurationInput;
};


export type BusinessSchemaMutationEditApiTenantUserArgs = {
  id: Scalars['String'];
  item: ApiTenantUserInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditApiTenantUserRightArgs = {
  apiUserId: Scalars['String'];
  item?: InputMaybe<Array<TenantRightValueInput>>;
};


export type BusinessSchemaMutationEditContactArgs = {
  id: Scalars['String'];
  item: ContactInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditContactFunctionArgs = {
  id: Scalars['String'];
  item: ContactFunctionInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditDocumentTypeArgs = {
  id: Scalars['String'];
  item: DocumentTypeInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditDocumentTypeMetadataArgs = {
  documentTypeId: Scalars['String'];
  id: Scalars['String'];
  item: MetadataConfigInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditDomainUserArgs = {
  id: Scalars['String'];
  item: DomainUserInput;
};


export type BusinessSchemaMutationEditDomainUserRightArgs = {
  domainUserId: Scalars['String'];
  item?: InputMaybe<Array<DomainRightValueInput>>;
};


export type BusinessSchemaMutationEditEnvironmentUserArgs = {
  id: Scalars['String'];
  item: EnvironmentUserInput;
};


export type BusinessSchemaMutationEditEnvironmentUserRightArgs = {
  environmentUserId: Scalars['String'];
  item?: InputMaybe<Array<EnvironmentRightValueInput>>;
};


export type BusinessSchemaMutationEditErrorQueueMessageArgs = {
  id: Scalars['String'];
  item: ErrorQueueMessageInput;
};


export type BusinessSchemaMutationEditIncomingEmailHistoryArgs = {
  id: Scalars['String'];
  item: IncomingEmailHistoryInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditListOfValuesArgs = {
  id: Scalars['String'];
  item: ListOfValuesInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditMetadataArgs = {
  id: Scalars['String'];
  item: MetadataInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditNoteArgs = {
  id: Scalars['String'];
  item: NoteInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditPostalParameterConfigurationArgs = {
  id: Scalars['String'];
  item: PostalParameterConfigurationInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditServiceArgs = {
  id: Scalars['String'];
  item: ServiceInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditTemplateContentArgs = {
  id: Scalars['String'];
  item: TemplateContentInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditTemplateStructureArgs = {
  id: Scalars['String'];
  item: TemplateStructureInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditTenantUserArgs = {
  id: Scalars['String'];
  item: TenantUserInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditTenantUserRightArgs = {
  item?: InputMaybe<Array<TenantRightValueInput>>;
  tenantId?: InputMaybe<Scalars['String']>;
  tenantUserId: Scalars['String'];
};


export type BusinessSchemaMutationEditThirdPartyArgs = {
  id: Scalars['String'];
  item: ThirdPartyInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditThirdPartyTypeArgs = {
  id: Scalars['String'];
  item: ThirdPartyTypeInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationEditValueOfListArgs = {
  id: Scalars['String'];
  item: ValueOfListInput;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationReadDocumentArgs = {
  documentId: Scalars['String'];
  jobId: Scalars['String'];
  jobMessageId: Scalars['String'];
  tenantId: Scalars['String'];
};


export type BusinessSchemaMutationRelaunchJobMessageArgs = {
  item: RelaunchJobMessageOptionsInput;
};


export type BusinessSchemaMutationRenewApiDomainUserArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationRenewApiEnvironmentUserArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationRenewApiTenantUserArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationResendInviteDomainUserArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationResendInviteEnvironmentUserArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaMutationResendInviteTenantUserArgs = {
  id: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationRunActionOnDocumentArgs = {
  documentId: Scalars['String'];
  options: DocumentActionOptions;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationRunActionOnJobArgs = {
  jobId: Scalars['String'];
  options: JobActionOptions;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationRunActionOnJobMessageArgs = {
  jobMessageId: Scalars['String'];
  options: JobMessageActionOptions;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaMutationValidateDomainUserArgs = {
  key: Scalars['String'];
};


export type BusinessSchemaMutationValidateEnvironmentUserArgs = {
  key: Scalars['String'];
};


export type BusinessSchemaMutationValidateTenantUserArgs = {
  key: Scalars['String'];
};

export type BusinessSchemaQuery = {
  __typename?: 'BusinessSchemaQuery';
  activityItems?: Maybe<Array<Maybe<Activity>>>;
  activityList?: Maybe<ActivityTypeConnection>;
  apiDomainUserItems?: Maybe<Array<Maybe<ApiDomainUser>>>;
  apiDomainUserList?: Maybe<ApiDomainUserTypeConnection>;
  apiDomainUserRightList?: Maybe<DomainRightValueTypeConnection>;
  apiEnvironmentUserItems?: Maybe<Array<Maybe<ApiEnvironmentUser>>>;
  apiEnvironmentUserList?: Maybe<ApiEnvironmentUserTypeConnection>;
  apiEnvironmentUserRightList?: Maybe<EnvironmentRightValueTypeConnection>;
  apiRoutingConfigurationItems?: Maybe<Array<Maybe<ApiRoutingConfiguration>>>;
  apiRoutingConfigurationList?: Maybe<ApiRoutingConfigurationTypeConnection>;
  apiTenantUserItems?: Maybe<Array<Maybe<ApiTenantUser>>>;
  apiTenantUserList?: Maybe<ApiTenantUserTypeConnection>;
  apiTenantUserRightList?: Maybe<TenantRightValueTypeConnection>;
  chorusB2GProvidersList?: Maybe<Array<Maybe<ChorusProviderIdName>>>;
  clickedLinkDocumentItems?: Maybe<ClickedLinkDocument>;
  contactFunctionItems?: Maybe<Array<Maybe<ContactFunction>>>;
  contactFunctionList?: Maybe<ContactFunctionTypeConnection>;
  contactFunctionSystemList?: Maybe<ContactFunctionTypeConnection>;
  contactItems?: Maybe<Array<Maybe<Contact>>>;
  contactList?: Maybe<ContactTypeConnection>;
  dashboardItems?: Maybe<Array<Maybe<Dashboard>>>;
  dashboardList?: Maybe<DashboardTypeConnection>;
  dashboardRightItems?: Maybe<Array<Maybe<DashboardRight>>>;
  dashboardRightList?: Maybe<DashboardRightTypeConnection>;
  documentCountList?: Maybe<DocumentCount>;
  documentCountStatisticsList?: Maybe<Array<Maybe<DocumentCountStatistics>>>;
  documentItems?: Maybe<Array<Maybe<Document>>>;
  documentJobItems?: Maybe<Array<Maybe<DocumentJob>>>;
  documentJobList?: Maybe<DocumentJobTypeConnection>;
  documentList?: Maybe<DocumentTypeConnection>;
  documentProbativeJobItems?: Maybe<Array<Maybe<DocumentProbativeJob>>>;
  documentProbativeJobList?: Maybe<DocumentProbativeJobTypeConnection>;
  documentSizeStatistics?: Maybe<DocumentSizeStatistics>;
  documentSubTypeItems?: Maybe<Array<Maybe<DocumentSubType>>>;
  documentSubTypeList?: Maybe<DocumentSubTypeTypeConnection>;
  documentTypeItems?: Maybe<Array<Maybe<DocumentType>>>;
  documentTypeList?: Maybe<DocumentTypeTypeConnection>;
  domainUserItems?: Maybe<Array<Maybe<DomainUser>>>;
  domainUserList?: Maybe<DomainUserTypeConnection>;
  domainUserRightList?: Maybe<DomainRightValueTypeConnection>;
  environmentUserItems?: Maybe<Array<Maybe<EnvironmentUser>>>;
  environmentUserList?: Maybe<EnvironmentUserTypeConnection>;
  environmentUserRightList?: Maybe<EnvironmentRightValueTypeConnection>;
  errorQueueMessageItems?: Maybe<Array<Maybe<ErrorQueueMessage>>>;
  errorQueueMessageList?: Maybe<ErrorQueueMessageTypeConnection>;
  hostedDocumentFileItems?: Maybe<Array<Maybe<FileContent>>>;
  hostedDocumentFileList?: Maybe<FileHeaderTypeConnection>;
  hostedInboundFileItems?: Maybe<Array<Maybe<FileContent>>>;
  hostedInboundFileList?: Maybe<FileHeaderTypeConnection>;
  hostedListFileItems?: Maybe<Array<Maybe<FileContent>>>;
  hostedListFileList?: Maybe<FileHeaderTypeConnection>;
  hostedReportFileItems?: Maybe<Array<Maybe<FileContent>>>;
  hostedReportFileList?: Maybe<FileHeaderTypeConnection>;
  inboundFaxList?: Maybe<InboundFaxTypeConnection>;
  inboundSmsList?: Maybe<InboundSmsTypeConnection>;
  incomingEmailHistoryItems?: Maybe<Array<Maybe<IncomingEmailHistory>>>;
  incomingEmailHistoryList?: Maybe<IncomingEmailHistoryTypeConnection>;
  jobItemItems?: Maybe<Array<Maybe<JobItem>>>;
  jobItemList?: Maybe<JobItemTypeConnection>;
  jobItems?: Maybe<Array<Maybe<Job>>>;
  jobList?: Maybe<JobTypeConnection>;
  jobMessageItems?: Maybe<Array<Maybe<JobMessage>>>;
  jobMessageList?: Maybe<JobMessageTypeConnection>;
  jobSummaryItems?: Maybe<Array<Maybe<JobSummary>>>;
  jobSummaryList?: Maybe<JobSummaryTypeConnection>;
  listOfValuesItems?: Maybe<Array<Maybe<ListOfValues>>>;
  listOfValuesList?: Maybe<ListOfValuesTypeConnection>;
  listOfValuesSystemList?: Maybe<ListOfValuesTypeConnection>;
  metadataItems?: Maybe<Array<Maybe<Metadata>>>;
  metadataList?: Maybe<MetadataTypeConnection>;
  metadataSystemList?: Maybe<MetadataTypeConnection>;
  natureItems?: Maybe<Array<Maybe<Nature>>>;
  natureList?: Maybe<NatureTypeConnection>;
  noteItems?: Maybe<Array<Maybe<Note>>>;
  noteList?: Maybe<NoteTypeConnection>;
  postalJobItems?: Maybe<Array<Maybe<PostalJob>>>;
  postalJobList?: Maybe<PostalJobTypeConnection>;
  postalParameterConfigurationItems?: Maybe<Array<Maybe<PostalParameterConfiguration>>>;
  postalParameterConfigurationList?: Maybe<PostalParameterConfigurationTypeConnection>;
  processingJobCountStatistics?: Maybe<JobCountStatistics>;
  rightInitialValueList?: Maybe<RightInitialValueTypeConnection>;
  schema?: Maybe<Scalars['String']>;
  serviceItems?: Maybe<Array<Maybe<Service>>>;
  serviceList?: Maybe<ServiceTypeConnection>;
  statusActionList?: Maybe<StatusActionTypeConnection>;
  templateContentItems?: Maybe<Array<Maybe<TemplateContent>>>;
  templateContentList?: Maybe<TemplateContentTypeConnection>;
  templateStructureItems?: Maybe<Array<Maybe<TemplateStructure>>>;
  templateStructureList?: Maybe<TemplateStructureTypeConnection>;
  templateVariableList?: Maybe<Array<Maybe<TemplateVariable>>>;
  temporaryDocumentItems?: Maybe<Array<Maybe<TemporaryDocumentContent>>>;
  temporaryDocumentList?: Maybe<TemporaryDocumentHeaderTypeConnection>;
  tenantUserItems?: Maybe<Array<Maybe<TenantUser>>>;
  tenantUserList?: Maybe<TenantUserTypeConnection>;
  tenantUserRightList?: Maybe<TenantRightValueTypeConnection>;
  test?: Maybe<Scalars['String']>;
  thirdPartyItems?: Maybe<Array<Maybe<ThirdParty>>>;
  thirdPartyList?: Maybe<ThirdPartyTypeConnection>;
  thirdPartyTypeItems?: Maybe<Array<Maybe<ThirdPartyType>>>;
  thirdPartyTypeList?: Maybe<ThirdPartyTypeTypeConnection>;
  thirdPartyTypeSystemList?: Maybe<ThirdPartyTypeTypeConnection>;
  valueOfListItems?: Maybe<Array<Maybe<ValueOfList>>>;
  valueOfListList?: Maybe<ValueOfListTypeConnection>;
  valueOfListSystemList?: Maybe<ValueOfListTypeConnection>;
};


export type BusinessSchemaQueryActivityItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryActivityListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<ActivityQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryApiDomainUserItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryApiDomainUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ApiDomainUserQueryParams>;
};


export type BusinessSchemaQueryApiDomainUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  apiUserId: Scalars['String'];
  params?: InputMaybe<RightValueQueryParams>;
};


export type BusinessSchemaQueryApiEnvironmentUserItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryApiEnvironmentUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ApiEnvironmentUserQueryParams>;
};


export type BusinessSchemaQueryApiEnvironmentUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  apiUserId: Scalars['String'];
  params?: InputMaybe<RightValueQueryParams>;
};


export type BusinessSchemaQueryApiRoutingConfigurationItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryApiRoutingConfigurationListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ApiRoutingConfigurationQueryParams>;
};


export type BusinessSchemaQueryApiTenantUserItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryApiTenantUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ApiTenantUserQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryApiTenantUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  apiUserId: Scalars['String'];
  params?: InputMaybe<RightValueQueryParams>;
};


export type BusinessSchemaQueryChorusB2GProvidersListArgs = {
  login: Scalars['String'];
  password: Scalars['String'];
  serverType: ChorusServerType;
};


export type BusinessSchemaQueryClickedLinkDocumentItemsArgs = {
  id: Scalars['String'];
};


export type BusinessSchemaQueryContactFunctionItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryContactFunctionListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ContactFunctionQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryContactFunctionSystemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<ContactFunctionQueryParams>;
};


export type BusinessSchemaQueryContactItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryContactListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ContactQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDashboardItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
};


export type BusinessSchemaQueryDashboardListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<DashboardQueryParams>;
};


export type BusinessSchemaQueryDashboardRightItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryDashboardRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DashboardRightQueryParams>;
};


export type BusinessSchemaQueryDocumentCountListArgs = {
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentCountStatisticsListArgs = {
  params?: InputMaybe<DocumentCountStatisticsQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentJobItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentJobListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DocumentJobQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DocumentQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentProbativeJobItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentProbativeJobListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DocumentProbativeJobQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentSizeStatisticsArgs = {
  params?: InputMaybe<DocumentSizeStatisticsQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentSubTypeItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
};


export type BusinessSchemaQueryDocumentSubTypeListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<DocumentSubTypeQueryParams>;
};


export type BusinessSchemaQueryDocumentTypeItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDocumentTypeListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DocumentTypeQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryDomainUserItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryDomainUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DomainUserQueryParams>;
};


export type BusinessSchemaQueryDomainUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  domainUserId: Scalars['String'];
  params?: InputMaybe<RightValueQueryParams>;
};


export type BusinessSchemaQueryEnvironmentUserItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryEnvironmentUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<EnvironmentUserQueryParams>;
};


export type BusinessSchemaQueryEnvironmentUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  environmentUserId: Scalars['String'];
  params?: InputMaybe<RightValueQueryParams>;
};


export type BusinessSchemaQueryErrorQueueMessageItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryErrorQueueMessageListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ErrorQueueMessageQueryParams>;
};


export type BusinessSchemaQueryHostedDocumentFileItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedDocumentFileListArgs = {
  after?: InputMaybe<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedInboundFileItemsArgs = {
  idList: Array<Scalars['String']>;
  inboundFolder: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedInboundFileListArgs = {
  after?: InputMaybe<Scalars['String']>;
  inboundFolder: Scalars['String'];
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedListFileItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedListFileListArgs = {
  after?: InputMaybe<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedReportFileItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryHostedReportFileListArgs = {
  after?: InputMaybe<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryInboundFaxListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<InboundFaxQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryInboundSmsListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<InboundSmsQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryIncomingEmailHistoryItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryIncomingEmailHistoryListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<IncomingEmailHistoryQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobItemItemsArgs = {
  idList: Array<InputMaybe<JobItemId>>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobItemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<JobItemQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<JobQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobMessageItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobMessageListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<JobMessageQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobSummaryItemsArgs = {
  idList: Array<Scalars['Int']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobSummaryListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<JobSummaryQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryListOfValuesItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryListOfValuesListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ListOfValuesQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryListOfValuesSystemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<ListOfValuesQueryParams>;
};


export type BusinessSchemaQueryMetadataItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryMetadataListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<MetadataQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryMetadataSystemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<MetadataQueryParams>;
};


export type BusinessSchemaQueryNatureItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
};


export type BusinessSchemaQueryNatureListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<NatureQueryParams>;
};


export type BusinessSchemaQueryNoteItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryNoteListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<NoteQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryPostalJobItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryPostalJobListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<PostalJobQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryPostalParameterConfigurationItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryPostalParameterConfigurationListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<PostalParameterConfigurationQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryProcessingJobCountStatisticsArgs = {
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryRightInitialValueListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<RightInitialValueQueryParams>;
  profile: UserProfile;
};


export type BusinessSchemaQueryServiceItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryServiceListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ServiceQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryStatusActionListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<StatusActionQueryParams>;
};


export type BusinessSchemaQueryTemplateContentItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTemplateContentListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<TemplateContentQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTemplateStructureItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTemplateStructureListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<TemplateStructureQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTemplateVariableListArgs = {
  ancestorIds?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  documentTypeId?: InputMaybe<Scalars['String']>;
  domainId?: InputMaybe<Scalars['String']>;
  natureId?: InputMaybe<Scalars['String']>;
  notificationType: TemplateContentNotificationType;
  serviceId?: InputMaybe<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTemporaryDocumentItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type BusinessSchemaQueryTemporaryDocumentListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<TemporaryDocumentHeaderQueryParams>;
};


export type BusinessSchemaQueryTenantUserItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTenantUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<TenantUserQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryTenantUserRightListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<RightValueQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
  tenantUserId: Scalars['String'];
};


export type BusinessSchemaQueryThirdPartyItemsArgs = {
  idList: Array<Scalars['String']>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryThirdPartyListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ThirdPartyQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryThirdPartyTypeItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryThirdPartyTypeListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ThirdPartyTypeQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryThirdPartyTypeSystemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<ThirdPartyTypeQueryParams>;
};


export type BusinessSchemaQueryValueOfListItemsArgs = {
  idList: Array<Scalars['String']>;
  language?: InputMaybe<Language>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryValueOfListListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ValueOfListQueryParams>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryValueOfListSystemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  language?: InputMaybe<Language>;
  params?: InputMaybe<ValueOfListQueryParams>;
};

export type ChorusB2GAddress = {
  __typename?: 'ChorusB2GAddress';
  name: Scalars['String'];
};

export type ChorusB2GAdhocRecipientInput = {
  name: Scalars['String'];
};

export type ChorusB2GConfig = {
  __typename?: 'ChorusB2GConfig';
  isTestMode: Scalars['Boolean'];
  login: Scalars['String'];
  password: Scalars['String'];
  providerId: Scalars['String'];
  recalculate: Scalars['Boolean'];
  serverType: ChorusServerType;
};

export type ChorusB2GConfigInput = {
  isTestMode: Scalars['Boolean'];
  login: Scalars['String'];
  password: Scalars['String'];
  providerId: Scalars['String'];
  recalculate: Scalars['Boolean'];
  serverType: ChorusServerType;
};

export enum ChorusB2GErrorType {
  InvalidAttachmentType = 'INVALID_ATTACHMENT_TYPE',
  InvalidExemptionReason = 'INVALID_EXEMPTION_REASON',
  InvalidServiceCode = 'INVALID_SERVICE_CODE',
  InvalidSiret = 'INVALID_SIRET',
  InvalidStructure = 'INVALID_STRUCTURE',
  InvoiceAlreadyExists = 'INVOICE_ALREADY_EXISTS',
  MissingAttachmentType = 'MISSING_ATTACHMENT_TYPE',
  MissingChorusProviderId = 'MISSING_CHORUS_PROVIDER_ID',
  MissingCurrency = 'MISSING_CURRENCY',
  MissingDiscountReason = 'MISSING_DISCOUNT_REASON',
  MissingExemptionReason = 'MISSING_EXEMPTION_REASON',
  MissingGrandTotalAmount = 'MISSING_GRAND_TOTAL_AMOUNT',
  MissingInvoiceDate = 'MISSING_INVOICE_DATE',
  MissingInvoiceNumber = 'MISSING_INVOICE_NUMBER',
  MissingOriginalInvoiceNumber = 'MISSING_ORIGINAL_INVOICE_NUMBER',
  MissingPurchaseOrderNumber = 'MISSING_PURCHASE_ORDER_NUMBER',
  MissingServiceCode = 'MISSING_SERVICE_CODE',
  MissingServiceCodeOrPurchaseOrderNumber = 'MISSING_SERVICE_CODE_OR_PURCHASE_ORDER_NUMBER',
  MissingSiret = 'MISSING_SIRET',
  MissingTaxDueDateType = 'MISSING_TAX_DUE_DATE_TYPE',
  MissingTaxTotalAmount = 'MISSING_TAX_TOTAL_AMOUNT',
  MissingValiderInformations = 'MISSING_VALIDER_INFORMATIONS',
  MissingVatInformations = 'MISSING_VAT_INFORMATIONS',
  ReceiverIsOnlyMoa = 'RECEIVER_IS_ONLY_MOA',
  UnknownError = 'UNKNOWN_ERROR'
}

export type ChorusB2GValidationError = {
  __typename?: 'ChorusB2GValidationError';
  errorString: Scalars['String'];
  errorType: ChorusB2GErrorType;
};

export type ChorusProviderIdName = {
  __typename?: 'ChorusProviderIdName';
  providerId: Scalars['String'];
  providerName: Scalars['String'];
};

export enum ChorusServerType {
  Prod = 'PROD',
  Qualif = 'QUALIF'
}

export type ClickedLinkDocument = {
  __typename?: 'ClickedLinkDocument';
  content: Scalars['String'];
  documentId: Scalars['String'];
  documentName: Scalars['String'];
  expirationDate?: Maybe<Scalars['DateTime']>;
  id: Scalars['String'];
  isCountExpired: Scalars['Boolean'];
  jobId: Scalars['String'];
  jobMessageId: Scalars['String'];
  tenantId: Scalars['String'];
};

export type Contact = {
  __typename?: 'Contact';
  civility: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  culture: Scalars['String'];
  documentTransmissionMode: DocumentTransmissionMode;
  email: Scalars['String'];
  firstName: Scalars['String'];
  functionIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  isFavorite: Scalars['Boolean'];
  isPrincipal: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
  thirdPartyId?: Maybe<Scalars['String']>;
  thirdPartyName?: Maybe<Scalars['String']>;
  timeZone: Scalars['String'];
};

export type ContactBoolFilter = {
  field: ContactBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ContactBoolFilterField {
  IsEnabled = 'IS_ENABLED',
  IsFavorite = 'IS_FAVORITE',
  IsPrincipal = 'IS_PRINCIPAL'
}

export type ContactFunction = {
  __typename?: 'ContactFunction';
  code: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: ContactFunctionOwnerType;
};

export type ContactFunctionBoolFilter = {
  field: ContactFunctionBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ContactFunctionBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ContactFunctionInput = {
  code: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  ownerId?: InputMaybe<Scalars['String']>;
  ownerType: ContactFunctionOwnerType;
};

export enum ContactFunctionOwnerType {
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type ContactFunctionQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ContactFunctionBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ContactFunctionSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ContactFunctionStringFilter>>>;
};

export enum ContactFunctionSortField {
  Code = 'CODE',
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME',
  OwnerType = 'OWNER_TYPE'
}

export type ContactFunctionStringFilter = {
  field: ContactFunctionStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ContactFunctionStringFilterField {
  Code = 'CODE',
  Name = 'NAME'
}

export type ContactFunctionTypeConnection = {
  __typename?: 'ContactFunctionTypeConnection';
  edges?: Maybe<Array<Maybe<ContactFunction>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ContactInput = {
  civility: Scalars['String'];
  culture?: InputMaybe<Scalars['String']>;
  documentTransmissionMode?: InputMaybe<DocumentTransmissionMode>;
  email: Scalars['String'];
  firstName: Scalars['String'];
  functionIds?: InputMaybe<Array<Scalars['String']>>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  isFavorite?: InputMaybe<Scalars['Boolean']>;
  isPrincipal?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
  thirdPartyId: Scalars['String'];
  timeZone?: InputMaybe<Scalars['String']>;
};

export type ContactQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ContactBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ContactSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ContactStringFilter>>>;
};

export type ContactRecipientInput = {
  contactId: Scalars['String'];
};

export enum ContactSortField {
  Civility = 'CIVILITY',
  Culture = 'CULTURE',
  DocumentTransmissionMode = 'DOCUMENT_TRANSMISSION_MODE',
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  IsEnabled = 'IS_ENABLED',
  IsFavorite = 'IS_FAVORITE',
  IsPrincipal = 'IS_PRINCIPAL',
  LastName = 'LAST_NAME',
  Phone = 'PHONE',
  ThirdPartyId = 'THIRD_PARTY_ID',
  ThirdPartyName = 'THIRD_PARTY_NAME',
  TimeZone = 'TIME_ZONE',
  UserId = 'USER_ID'
}

export type ContactStringFilter = {
  field: ContactStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ContactStringFilterField {
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  LastName = 'LAST_NAME',
  ThirdPartyId = 'THIRD_PARTY_ID',
  ThirdPartyName = 'THIRD_PARTY_NAME',
  UserId = 'USER_ID'
}

export type ContactTypeConnection = {
  __typename?: 'ContactTypeConnection';
  edges?: Maybe<Array<Maybe<Contact>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type Dashboard = {
  __typename?: 'Dashboard';
  dashboardType: Scalars['String'];
  dashboardVisibility: DashboardVisibilityType;
  datasetId: Scalars['String'];
  id: Scalars['String'];
  name?: Maybe<Scalars['String']>;
  reportId: Scalars['String'];
};

export type DashboardDashboardVisibilityTypeEnumFilter = {
  field: DashboardVisibilityFilterField;
  filterValue1: DashboardVisibilityType;
  filterValue2?: InputMaybe<DashboardVisibilityType>;
  operator: NumberFilterOperator;
};

export type DashboardQueryParams = {
  dashboardVisibilityFilters?: InputMaybe<Array<InputMaybe<DashboardDashboardVisibilityTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DashboardSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DashboardStringFilter>>>;
};

export type DashboardRight = {
  __typename?: 'DashboardRight';
  dashboardType: Scalars['String'];
  id: Scalars['String'];
  userId: Scalars['String'];
};

export type DashboardRightInput = {
  dashboardType: Scalars['String'];
  userId: Scalars['String'];
};

export type DashboardRightQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DashboardRightSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DashboardRightStringFilter>>>;
};

export enum DashboardRightSortField {
  Id = 'ID',
  UserId = 'USER_ID'
}

export type DashboardRightStringFilter = {
  field: DashboardRightStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DashboardRightStringFilterField {
  UserId = 'USER_ID'
}

export type DashboardRightTypeConnection = {
  __typename?: 'DashboardRightTypeConnection';
  edges?: Maybe<Array<Maybe<DashboardRight>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum DashboardSortField {
  Name = 'NAME'
}

export type DashboardStringFilter = {
  field: DashboardStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DashboardStringFilterField {
  DashboardType = 'DASHBOARD_TYPE',
  Name = 'NAME'
}

export type DashboardTypeConnection = {
  __typename?: 'DashboardTypeConnection';
  edges?: Maybe<Array<Maybe<Dashboard>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum DashboardVisibilityFilterField {
  DashboardVisibility = 'DASHBOARD_VISIBILITY'
}

export enum DashboardVisibilityType {
  Internal = 'INTERNAL',
  PublicCustom = 'PUBLIC_CUSTOM',
  PublicStandard = 'PUBLIC_STANDARD'
}

export type DataFileActionInput = {
  action: Scalars['String'];
  data: Scalars['String'];
  format: Scalars['String'];
  name: Scalars['String'];
  parameters?: InputMaybe<Scalars['String']>;
};

export type DataFileActionResult = {
  __typename?: 'DataFileActionResult';
  id: Scalars['String'];
};

export type Document = {
  __typename?: 'Document';
  archiveDate?: Maybe<Scalars['DateTime']>;
  archiveId?: Maybe<Scalars['String']>;
  archiver?: Maybe<ArchiverProvider>;
  attachmentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  documentSubTypeCode?: Maybe<Scalars['String']>;
  documentTypeCode: Scalars['String'];
  fileContent?: Maybe<Scalars['String']>;
  fileName: Scalars['String'];
  hash: Scalars['String'];
  id: Scalars['String'];
  jobIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  jobMessageStatusCounts?: Maybe<Array<Maybe<JobMessageStatusCount>>>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadata?: Maybe<Array<Maybe<KeyValue>>>;
  primaryJobMessageId?: Maybe<Scalars['String']>;
  readDate?: Maybe<Scalars['DateTime']>;
  sentDate?: Maybe<Scalars['DateTime']>;
  signRequired: Scalars['Boolean'];
  signType?: Maybe<DocumentTypeSignType>;
  signedDate?: Maybe<Scalars['DateTime']>;
  status: DocumentStatus;
  subStatus?: Maybe<DocumentSubStatus>;
  tenantId: Scalars['String'];
  typedMetadata?: Maybe<Array<Maybe<KeyMultipleTypeValue>>>;
};

export type DocumentActionOptions = {
  action: DocumentActionType;
  attachments?: InputMaybe<Array<InputMaybe<AttachmentInput>>>;
  comment?: InputMaybe<Scalars['String']>;
  metadata?: InputMaybe<Array<InputMaybe<GedFieldInput>>>;
};

export enum DocumentActionType {
  Cancel = 'CANCEL',
  CancelDocumentLink = 'CANCEL_DOCUMENT_LINK',
  Complete = 'COMPLETE',
  EditMetadata = 'EDIT_METADATA',
  Resend = 'RESEND'
}

export enum DocumentArrayElementFilterField {
  Metadata = 'METADATA'
}

export type DocumentBoolFilter = {
  field: DocumentBooleanFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum DocumentBooleanFilterField {
  IsRead = 'IS_READ',
  IsSent = 'IS_SENT',
  IsSigned = 'IS_SIGNED'
}

export type DocumentCount = {
  __typename?: 'DocumentCount';
  documentTypeCounts?: Maybe<Array<Maybe<DocumentTypeCounts>>>;
  serviceCounts?: Maybe<Array<Maybe<DocumentTypeCounts>>>;
  statusCounts?: Maybe<Array<Maybe<StatusCounts>>>;
  subStatusCounts?: Maybe<Array<Maybe<SubStatusCounts>>>;
  totalCount: Scalars['Long'];
};

export type DocumentCountStatistics = {
  __typename?: 'DocumentCountStatistics';
  count: Scalars['Long'];
  documentTypeCode: Scalars['String'];
  month?: Maybe<Scalars['Int']>;
  year?: Maybe<Scalars['Int']>;
};

export enum DocumentCountStatisticsCycleFilterField {
  Cycle = 'CYCLE'
}

export type DocumentCountStatisticsDateFilter = {
  field: DocumentCountStatisticsDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum DocumentCountStatisticsDateFilterField {
  FirstJobDate = 'FIRST_JOB_DATE'
}

export type DocumentCountStatisticsNatureCycleEnumFilter = {
  field: DocumentCountStatisticsCycleFilterField;
  filterValue1: NatureCycle;
  filterValue2?: InputMaybe<NatureCycle>;
  operator: NumberFilterOperator;
};

export type DocumentCountStatisticsQueryParams = {
  cycleFilters?: InputMaybe<Array<InputMaybe<DocumentCountStatisticsNatureCycleEnumFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentCountStatisticsDateFilter>>>;
};

export type DocumentDateFilter = {
  field: DocumentDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum DocumentDateFilterField {
  CreationDate = 'CREATION_DATE',
  ReadDate = 'READ_DATE',
  SentDate = 'SENT_DATE',
  SignDate = 'SIGN_DATE'
}

export type DocumentDocumentArrayElementFilterFieldArrayElementFilter = {
  field: DocumentArrayElementFilterField;
  filterArrayElementName: Scalars['String'];
  filterBoolValue1?: InputMaybe<Scalars['Boolean']>;
  filterBoolValue2?: InputMaybe<Scalars['Boolean']>;
  filterDateValue1?: InputMaybe<Scalars['DateTime']>;
  filterDateValue2?: InputMaybe<Scalars['DateTime']>;
  filterDoubleValue1?: InputMaybe<Scalars['Float']>;
  filterDoubleValue2?: InputMaybe<Scalars['Float']>;
  filterIntValue1?: InputMaybe<Scalars['Int']>;
  filterIntValue2?: InputMaybe<Scalars['Int']>;
  filterStringValue1?: InputMaybe<Scalars['String']>;
  filterStringValue2?: InputMaybe<Scalars['String']>;
  operator: ArrayElementFilterOperator;
};

export type DocumentDocumentStatusEnumFilter = {
  field: DocumentStatusFilterField;
  filterValue1: DocumentStatus;
  filterValue2?: InputMaybe<DocumentStatus>;
  operator: NumberFilterOperator;
};

export type DocumentDocumentTypeSignTypeEnumFilter = {
  field: DocumentSignTypeFilterField;
  filterValue1: DocumentTypeSignType;
  filterValue2?: InputMaybe<DocumentTypeSignType>;
  operator: NumberFilterOperator;
};

export type DocumentIdOrNewInput = {
  existingDocumentId?: InputMaybe<Scalars['String']>;
  newDocument?: InputMaybe<DocumentInput>;
};

export type DocumentInfo = {
  __typename?: 'DocumentInfo';
  hash: Scalars['String'];
  id: Scalars['String'];
};

export type DocumentInput = {
  base64?: InputMaybe<Scalars['String']>;
  documentSubTypeCode?: InputMaybe<Scalars['String']>;
  documentTypeCode: Scalars['String'];
  fileName: Scalars['String'];
  gedFields?: InputMaybe<Array<InputMaybe<GedFieldInput>>>;
  gedXml?: InputMaybe<Scalars['String']>;
  hash?: InputMaybe<Scalars['String']>;
  tempFileId?: InputMaybe<Scalars['String']>;
};

export type DocumentJob = {
  __typename?: 'DocumentJob';
  attachmentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  completedDate?: Maybe<Scalars['DateTime']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  documentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  failedCount: Scalars['Int'];
  id: Scalars['String'];
  jobType?: Maybe<JobBaseType>;
  note?: Maybe<Scalars['String']>;
  readCount: Scalars['Int'];
  recipientCount: Scalars['Int'];
  sentCount: Scalars['Int'];
  serviceId?: Maybe<Scalars['String']>;
  status: JobBaseStatus;
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
  validationType: DocumentJobValidationType;
};

export type DocumentJobDateFilter = {
  field: JobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export type DocumentJobInput = {
  adhocRecipientsFiles?: InputMaybe<Array<InputMaybe<FileIdOrBase64Input>>>;
  attachments?: InputMaybe<Array<InputMaybe<AttachmentInput>>>;
  chorusB2GAdhocRecipient?: InputMaybe<ChorusB2GAdhocRecipientInput>;
  contactRecipients?: InputMaybe<Array<InputMaybe<ContactRecipientInput>>>;
  document: DocumentIdOrNewInput;
  emailAdhocRecipients?: InputMaybe<Array<InputMaybe<EmailAdhocRecipientInput>>>;
  note?: InputMaybe<Scalars['String']>;
  postalAdhocRecipients?: InputMaybe<Array<InputMaybe<PostalAdhocRecipientInput>>>;
  postalParameter?: InputMaybe<PostalParameterInput>;
  serviceId?: InputMaybe<Scalars['String']>;
  thirdPartyRecipients?: InputMaybe<Array<InputMaybe<ThirdPartyRecipientInput>>>;
  trackingId?: InputMaybe<Scalars['String']>;
  validationType: DocumentJobValidationType;
};

export type DocumentJobJobBaseStatusEnumFilter = {
  field: JobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type DocumentJobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentJobDateFilter>>>;
  jobTypeFilters?: InputMaybe<Array<InputMaybe<JobBaseJobBaseTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentJobJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentJobStringFilter>>>;
};

export type DocumentJobStringFilter = {
  field: JobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export type DocumentJobTypeConnection = {
  __typename?: 'DocumentJobTypeConnection';
  edges?: Maybe<Array<Maybe<DocumentJob>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum DocumentJobValidationType {
  ForNewThirdparty = 'FOR_NEW_THIRDPARTY',
  None = 'NONE',
  WithValidation = 'WITH_VALIDATION'
}

export type DocumentProbativeJob = {
  __typename?: 'DocumentProbativeJob';
  attachmentsId?: Maybe<Array<Maybe<Scalars['String']>>>;
  completedDate?: Maybe<Scalars['DateTime']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  documentsId?: Maybe<Array<Maybe<Scalars['String']>>>;
  failedCount: Scalars['Int'];
  id: Scalars['String'];
  jobType?: Maybe<JobBaseType>;
  joinedMessage: Scalars['String'];
  note?: Maybe<Scalars['String']>;
  recipientCount: Scalars['Int'];
  registeredPostalOptions?: Maybe<RegisteredPostalOptions>;
  sentCount: Scalars['Int'];
  serviceId?: Maybe<Scalars['String']>;
  status: JobBaseStatus;
  subject: Scalars['String'];
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
  validationType: DocumentJobValidationType;
};

export type DocumentProbativeJobDateFilter = {
  field: JobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export type DocumentProbativeJobInput = {
  adhocRecipientsFiles?: InputMaybe<Array<InputMaybe<FileIdOrBase64Input>>>;
  attachments?: InputMaybe<Array<InputMaybe<AttachmentInput>>>;
  contactRecipients?: InputMaybe<Array<InputMaybe<ContactRecipientInput>>>;
  document: DocumentIdOrNewInput;
  emailAdhocRecipients?: InputMaybe<Array<InputMaybe<EmailAdhocRecipientInput>>>;
  joinedMessage?: InputMaybe<Scalars['String']>;
  note?: InputMaybe<Scalars['String']>;
  probativeType: DocumentProbativeJobType;
  registeredPostalOptions?: InputMaybe<RegisteredPostalOptionsInput>;
  serviceId?: InputMaybe<Scalars['String']>;
  subject?: InputMaybe<Scalars['String']>;
  thirdPartyRecipients?: InputMaybe<Array<InputMaybe<ThirdPartyRecipientInput>>>;
  trackingId?: InputMaybe<Scalars['String']>;
  validationType: DocumentJobValidationType;
};

export type DocumentProbativeJobJobBaseStatusEnumFilter = {
  field: JobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type DocumentProbativeJobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobDateFilter>>>;
  jobTypeFilters?: InputMaybe<Array<InputMaybe<JobBaseJobBaseTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobStringFilter>>>;
};

export type DocumentProbativeJobStringFilter = {
  field: JobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentProbativeJobType {
  Certified = 'CERTIFIED',
  EidasRegistered = 'EIDAS_REGISTERED',
  Registered = 'REGISTERED',
  Simple = 'SIMPLE'
}

export type DocumentProbativeJobTypeConnection = {
  __typename?: 'DocumentProbativeJobTypeConnection';
  edges?: Maybe<Array<Maybe<DocumentProbativeJob>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type DocumentQueryParams = {
  arrayElementFilters?: InputMaybe<Array<InputMaybe<DocumentDocumentArrayElementFilterFieldArrayElementFilter>>>;
  boolFilters?: InputMaybe<Array<InputMaybe<DocumentBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentDateFilter>>>;
  signTypeFilters?: InputMaybe<Array<InputMaybe<DocumentDocumentTypeSignTypeEnumFilter>>>;
  sortArrayElementName?: InputMaybe<Scalars['String']>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentDocumentStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentStringFilter>>>;
};

export enum DocumentSignTypeFilterField {
  SignType = 'SIGN_TYPE'
}

export type DocumentSizeStatistics = {
  __typename?: 'DocumentSizeStatistics';
  size: Scalars['Long'];
};

export type DocumentSizeStatisticsDateFilter = {
  field: DocumentSizeStatisticsDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum DocumentSizeStatisticsDateFilterField {
  FirstJobDate = 'FIRST_JOB_DATE'
}

export type DocumentSizeStatisticsQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentSizeStatisticsDateFilter>>>;
};

export enum DocumentSortField {
  CreationDate = 'CREATION_DATE',
  FileName = 'FILE_NAME',
  Id = 'ID',
  Metadata = 'METADATA',
  ReadDate = 'READ_DATE',
  SentDate = 'SENT_DATE',
  SignDate = 'SIGN_DATE',
  SignType = 'SIGN_TYPE'
}

export enum DocumentStatus {
  Canceled = 'CANCELED',
  Completed = 'COMPLETED',
  Draft = 'DRAFT',
  Error = 'ERROR',
  Processing = 'PROCESSING'
}

export enum DocumentStatusFilterField {
  Status = 'STATUS'
}

export type DocumentStringFilter = {
  field: DocumentStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentStringFilterField {
  DocumentSubTypeCode = 'DOCUMENT_SUB_TYPE_CODE',
  DocumentTypeCode = 'DOCUMENT_TYPE_CODE',
  FileName = 'FILE_NAME',
  TenantId = 'TENANT_ID'
}

export enum DocumentSubStatus {
  Approved = 'APPROVED',
  Canceled = 'CANCELED',
  Completed = 'COMPLETED',
  Dispute = 'DISPUTE',
  Draft = 'DRAFT',
  Error = 'ERROR',
  InHand = 'IN_HAND',
  MadeAvailable = 'MADE_AVAILABLE',
  PartiallyApproved = 'PARTIALLY_APPROVED',
  PaymentReceived = 'PAYMENT_RECEIVED',
  PaymentSent = 'PAYMENT_SENT',
  ReceivedByPlatform = 'RECEIVED_BY_PLATFORM',
  Refused = 'REFUSED',
  Rejected = 'REJECTED',
  SentByPlatform = 'SENT_BY_PLATFORM',
  Submited = 'SUBMITED',
  Suspended = 'SUSPENDED'
}

export type DocumentSubType = {
  __typename?: 'DocumentSubType';
  chorusAttachmentTypeCode: Scalars['String'];
  chorusAttachmentTypeId: Scalars['String'];
  code: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  natureCodes?: Maybe<Array<Maybe<Scalars['String']>>>;
};

export type DocumentSubTypeQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentSubTypeSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentSubTypeStringFilter>>>;
};

export enum DocumentSubTypeSortField {
  ChorusAttachmentTypeCode = 'CHORUS_ATTACHMENT_TYPE_CODE',
  ChorusAttachmentTypeId = 'CHORUS_ATTACHMENT_TYPE_ID',
  Code = 'CODE',
  CreationDate = 'CREATION_DATE',
  Name = 'NAME'
}

export type DocumentSubTypeStringFilter = {
  field: DocumentSubTypeStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentSubTypeStringFilterField {
  ChorusAttachmentTypeCode = 'CHORUS_ATTACHMENT_TYPE_CODE',
  ChorusAttachmentTypeId = 'CHORUS_ATTACHMENT_TYPE_ID',
  Code = 'CODE',
  Name = 'NAME',
  NatureCodes = 'NATURE_CODES'
}

export type DocumentSubTypeTypeConnection = {
  __typename?: 'DocumentSubTypeTypeConnection';
  edges?: Maybe<Array<Maybe<DocumentSubType>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum DocumentTransmissionMode {
  EmailWithAttachment = 'EMAIL_WITH_ATTACHMENT',
  EmailWithLink = 'EMAIL_WITH_LINK',
  None = 'NONE'
}

export type DocumentType = {
  __typename?: 'DocumentType';
  archiveConfiguration?: Maybe<ArchiveConfiguration>;
  code: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadataConfigs?: Maybe<Array<Maybe<MetadataConfig>>>;
  name: Scalars['String'];
  natureCode: Scalars['String'];
  sign?: Maybe<DocumentTypeSignType>;
  tenantId: Scalars['String'];
};

export type DocumentTypeConnection = {
  __typename?: 'DocumentTypeConnection';
  edges?: Maybe<Array<Maybe<Document>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type DocumentTypeCounts = {
  __typename?: 'DocumentTypeCounts';
  key: Scalars['String'];
  value: Scalars['Long'];
};

export type DocumentTypeInput = {
  archiveConfiguration?: InputMaybe<ArchiveConfigurationInput>;
  code: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  name: Scalars['String'];
  natureCode?: InputMaybe<Scalars['String']>;
  sign?: InputMaybe<DocumentTypeSignType>;
};

export type DocumentTypeQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentTypeSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentTypeStringFilter>>>;
};

export enum DocumentTypeSignType {
  None = 'NONE',
  QualifiedEidasCertificate = 'QUALIFIED_EIDAS_CERTIFICATE'
}

export enum DocumentTypeSortField {
  Code = 'CODE',
  CreationDate = 'CREATION_DATE',
  Name = 'NAME',
  NatureCode = 'NATURE_CODE'
}

export type DocumentTypeStringFilter = {
  field: DocumentTypeStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentTypeStringFilterField {
  Code = 'CODE',
  Name = 'NAME',
  NatureCode = 'NATURE_CODE'
}

export type DocumentTypeTypeConnection = {
  __typename?: 'DocumentTypeTypeConnection';
  edges?: Maybe<Array<Maybe<DocumentType>>>;
  pageInfo?: Maybe<PageInfo>;
};

/** The application rights for domain user. */
export enum DomainRightType {
  /** Create tenants */
  AddTenant = 'ADD_TENANT',
  /** CancelJobMessage */
  CancelJobMessage = 'CANCEL_JOB_MESSAGE',
  /** Create or edit configurations */
  ChangeConfiguration = 'CHANGE_CONFIGURATION',
  /** Create, edit or delete dashboards */
  ChangeDashboard = 'CHANGE_DASHBOARD',
  /** Create or edit domains */
  ChangeDomain = 'CHANGE_DOMAIN',
  /** Create, edit or renew Domain Api users */
  ChangeDomainApiUser = 'CHANGE_DOMAIN_API_USER',
  /** Create or edit domain administrators */
  ChangeDomainUser = 'CHANGE_DOMAIN_USER',
  /** Create or edit OMS resources */
  ChangeOmsResources = 'CHANGE_OMS_RESOURCES',
  /** Create, edit or delete postal parameter configurations */
  ChangePostalParameterConfiguration = 'CHANGE_POSTAL_PARAMETER_CONFIGURATION',
  /** Create or edit PowerBi auth token */
  ChangePowerBiAuthToken = 'CHANGE_POWER_BI_AUTH_TOKEN',
  /** Create or edit products */
  ChangeProduct = 'CHANGE_PRODUCT',
  /** Create or edit product installs */
  ChangeProductInstall = 'CHANGE_PRODUCT_INSTALL',
  /** Create, edit or delete template contents */
  ChangeTemplateContent = 'CHANGE_TEMPLATE_CONTENT',
  /** Create, edit or delete template structures */
  ChangeTemplateStructure = 'CHANGE_TEMPLATE_STRUCTURE',
  /** Create, edit or delete template contents */
  ChangeTemplateVariableConfiguration = 'CHANGE_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Create, edit or renew Api users */
  ChangeTenantApiUser = 'CHANGE_TENANT_API_USER',
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Edit Tenant postal config */
  EditTenantPostalConfig = 'EDIT_TENANT_POSTAL_CONFIG',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Get or list configurations */
  ReadConfiguration = 'READ_CONFIGURATION',
  /** Get or list dashboards */
  ReadDashboard = 'READ_DASHBOARD',
  /** Get or list domains */
  ReadDomain = 'READ_DOMAIN',
  /** Get or list Domain Api users */
  ReadDomainApiUser = 'READ_DOMAIN_API_USER',
  /** Get or list OMS resources */
  ReadOmsResources = 'READ_OMS_RESOURCES',
  /** Get or list postal parameter configurations */
  ReadPostalParameterConfiguration = 'READ_POSTAL_PARAMETER_CONFIGURATION',
  /** Get or list products */
  ReadProduct = 'READ_PRODUCT',
  /** Get or list product installs */
  ReadProductInstall = 'READ_PRODUCT_INSTALL',
  /** Get or list status actions */
  ReadStatusAction = 'READ_STATUS_ACTION',
  /** Get or list template contents */
  ReadTemplateContent = 'READ_TEMPLATE_CONTENT',
  /** Get or list template structures */
  ReadTemplateStructure = 'READ_TEMPLATE_STRUCTURE',
  /** Get or list template variables configuration */
  ReadTemplateVariableConfiguration = 'READ_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Get or list tenants */
  ReadTenant = 'READ_TENANT',
  /** Get or list Api users */
  ReadTenantApiUser = 'READ_TENANT_API_USER',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Synchronize EDC resources */
  SynchronizeEdcResources = 'SYNCHRONIZE_EDC_RESOURCES',
  /** Validate invited user */
  ValidateUser = 'VALIDATE_USER'
}

export type DomainRightValue = {
  __typename?: 'DomainRightValue';
  right?: Maybe<DomainRightType>;
  value: Scalars['Boolean'];
};

export type DomainRightValueInput = {
  right?: InputMaybe<DomainRightType>;
  value: Scalars['Boolean'];
};

export type DomainRightValueTypeConnection = {
  __typename?: 'DomainRightValueTypeConnection';
  edges?: Maybe<Array<Maybe<DomainRightValue>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type DomainUser = {
  __typename?: 'DomainUser';
  civility: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  culture: Scalars['String'];
  domainId: Scalars['String'];
  domainName: Scalars['String'];
  email: Scalars['String'];
  firstName: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
  timeZone: Scalars['String'];
  userId: Scalars['String'];
};

export type DomainUserBoolFilter = {
  field: DomainUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum DomainUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type DomainUserInput = {
  civility?: InputMaybe<Scalars['String']>;
  culture?: InputMaybe<Scalars['String']>;
  domainId: Scalars['String'];
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone?: InputMaybe<Scalars['String']>;
  timeZone?: InputMaybe<Scalars['String']>;
};

export type DomainUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<DomainUserBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DomainUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DomainUserStringFilter>>>;
};

export enum DomainUserSortField {
  Civility = 'CIVILITY',
  Culture = 'CULTURE',
  DomainId = 'DOMAIN_ID',
  DomainName = 'DOMAIN_NAME',
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  IsEnabled = 'IS_ENABLED',
  LastName = 'LAST_NAME',
  Phone = 'PHONE',
  TimeZone = 'TIME_ZONE',
  UserId = 'USER_ID'
}

export type DomainUserStringFilter = {
  field: DomainUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DomainUserStringFilterField {
  DomainId = 'DOMAIN_ID',
  DomainName = 'DOMAIN_NAME',
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  LastName = 'LAST_NAME',
  UserId = 'USER_ID'
}

export type DomainUserTypeConnection = {
  __typename?: 'DomainUserTypeConnection';
  edges?: Maybe<Array<Maybe<DomainUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type EmailAdhocRecipientInput = {
  documentTransmissionMode: DocumentTransmissionMode;
  email: Scalars['String'];
  isPrimary?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type EmailJob = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  attachments?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  emailAdhocRecipients?: InputMaybe<Array<InputMaybe<EmailJobRecipient>>>;
  emailAltBody?: InputMaybe<FileIdOrNewInputType>;
  emailBody?: InputMaybe<FileIdOrNewInputType>;
  jobType?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<EmailParameter>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  trackingId?: InputMaybe<Scalars['String']>;
};

export type EmailJobRecipient = {
  email: Scalars['String'];
  name?: InputMaybe<Scalars['String']>;
  optionalFields?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
};

export type EmailParameter = {
  activateAutoPull?: InputMaybe<Scalars['Boolean']>;
  activateEmbeddedImageInHTML?: InputMaybe<Scalars['Boolean']>;
  activateTracking?: InputMaybe<Scalars['Boolean']>;
  envelopeSender?: InputMaybe<Scalars['String']>;
  from?: InputMaybe<Scalars['String']>;
  preHeader?: InputMaybe<Scalars['String']>;
  priorityFlag?: InputMaybe<EmailPriorityFlagType>;
  replyTo?: InputMaybe<Scalars['String']>;
  subject?: InputMaybe<Scalars['String']>;
  trackingType?: InputMaybe<EmailTrackingType>;
};

export enum EmailPriorityFlagType {
  High = 'HIGH',
  Low = 'LOW',
  Standard = 'STANDARD'
}

export enum EmailTrackingType {
  All = 'ALL',
  ClickOnly = 'CLICK_ONLY',
  OpenOnly = 'OPEN_ONLY'
}

export enum EngineEventAction {
  AcceptEre = 'ACCEPT_ERE',
  AddAttachmentsDocument = 'ADD_ATTACHMENTS_DOCUMENT',
  AddDataFileAction = 'ADD_DATA_FILE_ACTION',
  ArchiveDocument = 'ARCHIVE_DOCUMENT',
  CancelDocument = 'CANCEL_DOCUMENT',
  CancelJobMessage = 'CANCEL_JOB_MESSAGE',
  ChangeStatusChorusB_2G = 'CHANGE_STATUS_CHORUS_B_2_G',
  CompleteChorusB_2G = 'COMPLETE_CHORUS_B_2_G',
  CreateJob = 'CREATE_JOB',
  EditMetadataDocument = 'EDIT_METADATA_DOCUMENT',
  GenerateProof = 'GENERATE_PROOF',
  LaunchJob = 'LAUNCH_JOB',
  NotReadEre = 'NOT_READ_ERE',
  ProcessJob = 'PROCESS_JOB',
  ReadDocument = 'READ_DOCUMENT',
  ReadEreNotification = 'READ_ERE_NOTIFICATION',
  RefuseEre = 'REFUSE_ERE',
  RelaunchEre = 'RELAUNCH_ERE',
  SendChorusB_2G = 'SEND_CHORUS_B_2_G',
  SendNotification = 'SEND_NOTIFICATION',
  SendPostal = 'SEND_POSTAL',
  SignDocument = 'SIGN_DOCUMENT',
  UndeliveredPostal = 'UNDELIVERED_POSTAL'
}

export enum EnvelopeType {
  C_4 = 'C_4',
  C_5 = 'C_5',
  Dl_2 = 'DL_2'
}

/** The application rights for environment user. */
export enum EnvironmentRightType {
  /** Create, edit or delete api routing configurations */
  ChangeApiRoutingConfiguration = 'CHANGE_API_ROUTING_CONFIGURATION',
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create, edit or renew Environment Api users */
  ChangeEnvironmentApiUser = 'CHANGE_ENVIRONMENT_API_USER',
  /** Create or edit environment administrators */
  ChangeEnvironmentUser = 'CHANGE_ENVIRONMENT_USER',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Edit Tenant postal config */
  EditTenantPostalConfig = 'EDIT_TENANT_POSTAL_CONFIG',
  /** Get or list api routing configurations */
  ReadApiRoutingConfiguration = 'READ_API_ROUTING_CONFIGURATION',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
  /** Get or list Environment Api users */
  ReadEnvironmentApiUser = 'READ_ENVIRONMENT_API_USER',
  /** Get or list status actions */
  ReadStatusAction = 'READ_STATUS_ACTION',
  /** Get or list third party types */
  ReadThirdPartyType = 'READ_THIRD_PARTY_TYPE'
}

export type EnvironmentRightValue = {
  __typename?: 'EnvironmentRightValue';
  right?: Maybe<EnvironmentRightType>;
  value: Scalars['Boolean'];
};

export type EnvironmentRightValueInput = {
  right?: InputMaybe<EnvironmentRightType>;
  value: Scalars['Boolean'];
};

export type EnvironmentRightValueTypeConnection = {
  __typename?: 'EnvironmentRightValueTypeConnection';
  edges?: Maybe<Array<Maybe<EnvironmentRightValue>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type EnvironmentUser = {
  __typename?: 'EnvironmentUser';
  civility: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  culture: Scalars['String'];
  email: Scalars['String'];
  firstName: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
  timeZone: Scalars['String'];
  userId: Scalars['String'];
};

export type EnvironmentUserBoolFilter = {
  field: EnvironmentUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum EnvironmentUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type EnvironmentUserInput = {
  civility?: InputMaybe<Scalars['String']>;
  culture?: InputMaybe<Scalars['String']>;
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone?: InputMaybe<Scalars['String']>;
  timeZone?: InputMaybe<Scalars['String']>;
};

export type EnvironmentUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<EnvironmentUserBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<EnvironmentUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<EnvironmentUserStringFilter>>>;
};

export enum EnvironmentUserSortField {
  Civility = 'CIVILITY',
  Culture = 'CULTURE',
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  IsEnabled = 'IS_ENABLED',
  LastName = 'LAST_NAME',
  Phone = 'PHONE',
  TimeZone = 'TIME_ZONE',
  UserId = 'USER_ID'
}

export type EnvironmentUserStringFilter = {
  field: EnvironmentUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum EnvironmentUserStringFilterField {
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  LastName = 'LAST_NAME',
  UserId = 'USER_ID'
}

export type EnvironmentUserTypeConnection = {
  __typename?: 'EnvironmentUserTypeConnection';
  edges?: Maybe<Array<Maybe<EnvironmentUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ErrorQueueMessage = {
  __typename?: 'ErrorQueueMessage';
  action: EngineEventAction;
  errorCode: Scalars['Int'];
  errorFunctionName?: Maybe<Scalars['String']>;
  errorMessage: Scalars['String'];
  errorServiceName?: Maybe<Scalars['String']>;
  errorStackTrace: Scalars['String'];
  id: Scalars['String'];
  jobId: Scalars['String'];
  resourceId?: Maybe<Scalars['String']>;
  resourceType?: Maybe<ErrorQueueMessageResourceType>;
  status: ErrorQueueMessageStatus;
  tenantId: Scalars['String'];
  tenantName: Scalars['String'];
};

export enum ErrorQueueMessageActionFilterField {
  Action = 'ACTION'
}

export type ErrorQueueMessageEngineEventActionEnumFilter = {
  field: ErrorQueueMessageActionFilterField;
  filterValue1: EngineEventAction;
  filterValue2?: InputMaybe<EngineEventAction>;
  operator: NumberFilterOperator;
};

export type ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilter = {
  field: ErrorQueueMessageResourceTypeFilterField;
  filterValue1: ErrorQueueMessageResourceType;
  filterValue2?: InputMaybe<ErrorQueueMessageResourceType>;
  operator: NumberFilterOperator;
};

export type ErrorQueueMessageErrorQueueMessageStatusEnumFilter = {
  field: ErrorQueueMessageStatusFilterField;
  filterValue1: ErrorQueueMessageStatus;
  filterValue2?: InputMaybe<ErrorQueueMessageStatus>;
  operator: NumberFilterOperator;
};

export type ErrorQueueMessageInput = {
  action: EngineEventAction;
  errorCode: Scalars['Int'];
  errorFunctionName: Scalars['String'];
  errorMessage: Scalars['String'];
  errorServiceName: Scalars['String'];
  errorStackTrace: Scalars['String'];
  id: Scalars['String'];
  jobId: Scalars['String'];
  resourceId: Scalars['String'];
  resourceType: ErrorQueueMessageResourceType;
  status: ErrorQueueMessageStatus;
  tenantId: Scalars['String'];
  tenantName: Scalars['String'];
};

export type ErrorQueueMessageIntFilter = {
  field: ErrorQueueMessageIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum ErrorQueueMessageIntFilterField {
  ErrorCode = 'ERROR_CODE'
}

export type ErrorQueueMessageQueryParams = {
  actionFilters?: InputMaybe<Array<InputMaybe<ErrorQueueMessageEngineEventActionEnumFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<ErrorQueueMessageIntFilter>>>;
  resourceTypeFilters?: InputMaybe<Array<InputMaybe<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ErrorQueueMessageSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<ErrorQueueMessageErrorQueueMessageStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<ErrorQueueMessageStringFilter>>>;
};

export enum ErrorQueueMessageResourceType {
  ArchiveBatch = 'ARCHIVE_BATCH',
  Document = 'DOCUMENT',
  Job = 'JOB',
  JobMessage = 'JOB_MESSAGE'
}

export enum ErrorQueueMessageResourceTypeFilterField {
  ResourceType = 'RESOURCE_TYPE'
}

export enum ErrorQueueMessageSortField {
  Action = 'ACTION',
  ErrorCode = 'ERROR_CODE',
  ErrorFunctionName = 'ERROR_FUNCTION_NAME',
  ErrorMessage = 'ERROR_MESSAGE',
  ErrorServiceName = 'ERROR_SERVICE_NAME',
  ErrorStackTrace = 'ERROR_STACK_TRACE',
  JobId = 'JOB_ID',
  ResourceId = 'RESOURCE_ID',
  ResourceType = 'RESOURCE_TYPE',
  Status = 'STATUS',
  TenantId = 'TENANT_ID',
  TenantName = 'TENANT_NAME'
}

export enum ErrorQueueMessageStatus {
  Completed = 'COMPLETED',
  InProgress = 'IN_PROGRESS',
  ToProcess = 'TO_PROCESS'
}

export enum ErrorQueueMessageStatusFilterField {
  Status = 'STATUS'
}

export type ErrorQueueMessageStringFilter = {
  field: ErrorQueueMessageStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ErrorQueueMessageStringFilterField {
  ErrorFunctionName = 'ERROR_FUNCTION_NAME',
  ErrorMessage = 'ERROR_MESSAGE',
  ErrorServiceName = 'ERROR_SERVICE_NAME',
  ErrorStackTrace = 'ERROR_STACK_TRACE',
  JobId = 'JOB_ID',
  ResourceId = 'RESOURCE_ID',
  TenantId = 'TENANT_ID',
  TenantName = 'TENANT_NAME'
}

export type ErrorQueueMessageTypeConnection = {
  __typename?: 'ErrorQueueMessageTypeConnection';
  edges?: Maybe<Array<Maybe<ErrorQueueMessage>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type FaxJob = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  adhocRecipients?: InputMaybe<Array<InputMaybe<Recipient>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  documents?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  jobType?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<FaxParameter>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  trackingId?: InputMaybe<Scalars['String']>;
};

export enum FaxMode {
  Fine = 'FINE',
  Standard = 'STANDARD'
}

export type FaxParameter = {
  coverSheetMemo?: InputMaybe<Scalars['String']>;
  csid?: InputMaybe<Scalars['String']>;
  resolution?: InputMaybe<FaxMode>;
  shouldFaxEmailBody?: InputMaybe<Scalars['Boolean']>;
  shouldSuppressFaxConversion?: InputMaybe<Scalars['Boolean']>;
  useBadNumberDns?: InputMaybe<Scalars['Boolean']>;
};

export type FileContent = {
  __typename?: 'FileContent';
  content: Scalars['String'];
  creationDateTime: Scalars['DateTime'];
  lastModificationDateTime: Scalars['DateTime'];
  name: Scalars['String'];
  size: Scalars['Long'];
};

export type FileContentInput = {
  content: Scalars['String'];
  name: Scalars['String'];
};

export type FileHeader = {
  __typename?: 'FileHeader';
  creationDateTime: Scalars['DateTime'];
  lastModificationDateTime: Scalars['DateTime'];
  name: Scalars['String'];
  size: Scalars['Long'];
};

export type FileHeaderTypeConnection = {
  __typename?: 'FileHeaderTypeConnection';
  edges?: Maybe<Array<Maybe<FileHeader>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type FileIdOrBase64Input = {
  base64?: InputMaybe<Scalars['String']>;
  tempFileId?: InputMaybe<Scalars['String']>;
};

export type FileIdOrNewInputType = {
  existingFileId?: InputMaybe<Scalars['String']>;
  newFile?: InputMaybe<FileInputType>;
};

export type FileInputType = {
  base64?: InputMaybe<Scalars['String']>;
  fileName: Scalars['String'];
  tempFileId?: InputMaybe<Scalars['String']>;
};

export type FileReferenceBase = {
  content?: InputMaybe<Scalars['String']>;
  hosted?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type GedFieldInput = {
  key: Scalars['String'];
  typedValue?: InputMaybe<MultipleTypeValueInput>;
  value?: InputMaybe<Scalars['String']>;
};

export type IdName = {
  __typename?: 'IdName';
  id: Scalars['String'];
  name?: Maybe<Scalars['String']>;
};

export type IdNameInput = {
  id: Scalars['String'];
};

export type IdNameType = {
  __typename?: 'IdNameType';
  id?: Maybe<Scalars['String']>;
  name?: Maybe<Scalars['String']>;
  type?: Maybe<ActivityActorType>;
};

export type InboundFax = {
  __typename?: 'InboundFax';
  baudRate: Scalars['Int'];
  callTime: Scalars['Int'];
  customerNumber: Scalars['Int'];
  fileName?: Maybe<Scalars['String']>;
  folder?: Maybe<Scalars['String']>;
  from?: Maybe<Scalars['String']>;
  isDeleted: Scalars['Boolean'];
  messageId?: Maybe<Scalars['String']>;
  pages: Scalars['Int'];
  receivedDate: Scalars['DateTime'];
  to?: Maybe<Scalars['String']>;
};

export type InboundFaxDateFilter = {
  field: InboundFaxDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum InboundFaxDateFilterField {
  ReceivedDate = 'RECEIVED_DATE'
}

export type InboundFaxQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<InboundFaxDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<InboundFaxSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<InboundFaxStringFilter>>>;
};

export enum InboundFaxSortField {
  BaudRate = 'BAUD_RATE',
  CallTime = 'CALL_TIME',
  CustomerNumber = 'CUSTOMER_NUMBER',
  FileName = 'FILE_NAME',
  Folder = 'FOLDER',
  From = 'FROM',
  MessageId = 'MESSAGE_ID',
  Pages = 'PAGES',
  ReceivedDate = 'RECEIVED_DATE',
  To = 'TO'
}

export type InboundFaxStringFilter = {
  field: InboundFaxStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum InboundFaxStringFilterField {
  From = 'FROM',
  Login = 'LOGIN',
  To = 'TO'
}

export type InboundFaxTypeConnection = {
  __typename?: 'InboundFaxTypeConnection';
  edges?: Maybe<Array<Maybe<InboundFax>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type InboundSms = {
  __typename?: 'InboundSms';
  customerNumber: Scalars['Int'];
  fromAddress?: Maybe<Scalars['String']>;
  jobItemNumber: Scalars['Int'];
  jobNumber: Scalars['Int'];
  message?: Maybe<Scalars['String']>;
  receivedDate: Scalars['DateTime'];
  recipient?: Maybe<Scalars['String']>;
  toAddress?: Maybe<Scalars['String']>;
};

export type InboundSmsDateFilter = {
  field: InboundSmsDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum InboundSmsDateFilterField {
  ReceivedDate = 'RECEIVED_DATE'
}

export type InboundSmsIntFilter = {
  field: InboundSmsIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum InboundSmsIntFilterField {
  JobNumber = 'JOB_NUMBER'
}

export type InboundSmsQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<InboundSmsDateFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<InboundSmsIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<InboundSmsSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<InboundSmsStringFilter>>>;
};

export enum InboundSmsSortField {
  CustomerNumber = 'CUSTOMER_NUMBER',
  FromAddress = 'FROM_ADDRESS',
  JobItem = 'JOB_ITEM',
  JobNumber = 'JOB_NUMBER',
  ReceivedDate = 'RECEIVED_DATE',
  ToAddress = 'TO_ADDRESS'
}

export type InboundSmsStringFilter = {
  field: InboundSmsStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum InboundSmsStringFilterField {
  FromAddress = 'FROM_ADDRESS',
  ToAddress = 'TO_ADDRESS'
}

export type InboundSmsTypeConnection = {
  __typename?: 'InboundSmsTypeConnection';
  edges?: Maybe<Array<Maybe<InboundSms>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type IncomingEmailHistory = {
  __typename?: 'IncomingEmailHistory';
  attachmentNames?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  errorString: Scalars['String'];
  from: Scalars['String'];
  headerValues?: Maybe<Array<Maybe<KeyValuePair>>>;
  id: Scalars['String'];
  incomingEmailPath: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  routingConfigurationId: Scalars['String'];
  status: ProcessingStatus;
  subject: Scalars['String'];
  tenantId: Scalars['String'];
  to: Scalars['String'];
  type: ProcessingType;
};

export type IncomingEmailHistoryDateFilter = {
  field: IncomingEmailHistoryDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum IncomingEmailHistoryDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type IncomingEmailHistoryInput = {
  attachmentNames?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  errorString?: InputMaybe<Scalars['String']>;
  from: Scalars['String'];
  headerValues?: InputMaybe<Array<InputMaybe<KeyValuePairInput>>>;
  id?: InputMaybe<Scalars['String']>;
  incomingEmailPath: Scalars['String'];
  routingConfigurationId: Scalars['String'];
  status: ProcessingStatus;
  subject: Scalars['String'];
  tenantId: Scalars['String'];
  to: Scalars['String'];
  type: ProcessingType;
};

export type IncomingEmailHistoryProcessingStatusEnumFilter = {
  field: IncomingEmailHistoryStatusFilterField;
  filterValue1: ProcessingStatus;
  filterValue2?: InputMaybe<ProcessingStatus>;
  operator: NumberFilterOperator;
};

export type IncomingEmailHistoryProcessingTypeEnumFilter = {
  field: IncomingEmailHistoryTypeFilterField;
  filterValue1: ProcessingType;
  filterValue2?: InputMaybe<ProcessingType>;
  operator: NumberFilterOperator;
};

export type IncomingEmailHistoryQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<IncomingEmailHistoryDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<IncomingEmailHistorySortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<IncomingEmailHistoryProcessingStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<IncomingEmailHistoryStringFilter>>>;
  typeFilters?: InputMaybe<Array<InputMaybe<IncomingEmailHistoryProcessingTypeEnumFilter>>>;
};

export enum IncomingEmailHistorySortField {
  CreationDate = 'CREATION_DATE',
  From = 'FROM',
  Id = 'ID',
  IncomingEmailPath = 'INCOMING_EMAIL_PATH',
  Status = 'STATUS',
  Subject = 'SUBJECT',
  TenantId = 'TENANT_ID',
  To = 'TO',
  Type = 'TYPE'
}

export enum IncomingEmailHistoryStatusFilterField {
  Status = 'STATUS'
}

export type IncomingEmailHistoryStringFilter = {
  field: IncomingEmailHistoryStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum IncomingEmailHistoryStringFilterField {
  From = 'FROM',
  Id = 'ID',
  IncomingEmailPath = 'INCOMING_EMAIL_PATH',
  RoutingConfigurationId = 'ROUTING_CONFIGURATION_ID',
  Subject = 'SUBJECT',
  TenantId = 'TENANT_ID',
  To = 'TO'
}

export type IncomingEmailHistoryTypeConnection = {
  __typename?: 'IncomingEmailHistoryTypeConnection';
  edges?: Maybe<Array<Maybe<IncomingEmailHistory>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum IncomingEmailHistoryTypeFilterField {
  Type = 'TYPE'
}

export enum InheritedConfigurationOwnerType {
  DocumentType = 'DOCUMENT_TYPE',
  Domain = 'DOMAIN',
  Nature = 'NATURE',
  Service = 'SERVICE',
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type Job = {
  __typename?: 'Job';
  completedDate?: Maybe<Scalars['DateTime']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  documentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  failedCount: Scalars['Int'];
  id: Scalars['String'];
  jobType?: Maybe<JobBaseType>;
  note?: Maybe<Scalars['String']>;
  recipientCount: Scalars['Int'];
  sentCount: Scalars['Int'];
  serviceId?: Maybe<Scalars['String']>;
  status: JobBaseStatus;
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
};

export type JobActionOptions = {
  action: JobActionType;
};

export enum JobActionType {
  None = 'NONE'
}

export type JobBaseDateFilter = {
  field: JobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export type JobBaseJobBaseStatusEnumFilter = {
  field: JobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type JobBaseJobBaseTypeEnumFilter = {
  field: JobTypeFilterField;
  filterValue1: JobBaseType;
  filterValue2?: InputMaybe<JobBaseType>;
  operator: NumberFilterOperator;
};

export enum JobBaseStatus {
  Canceled = 'CANCELED',
  Completed = 'COMPLETED',
  Created = 'CREATED',
  Error = 'ERROR',
  Processing = 'PROCESSING'
}

export type JobBaseStringFilter = {
  field: JobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum JobBaseType {
  Document = 'DOCUMENT',
  DocumentProbative = 'DOCUMENT_PROBATIVE',
  Email = 'EMAIL',
  Fax = 'FAX',
  None = 'NONE',
  Postal = 'POSTAL',
  Push = 'PUSH',
  Sms = 'SMS',
  Voice = 'VOICE'
}

export type JobCountStatistics = {
  __typename?: 'JobCountStatistics';
  count: Scalars['Int'];
};

export type JobCreationResult = {
  __typename?: 'JobCreationResult';
  attachments?: Maybe<Array<Maybe<DocumentInfo>>>;
  documents?: Maybe<Array<Maybe<DocumentInfo>>>;
  id: Scalars['String'];
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
};

export enum JobDateFilterField {
  CompletedDate = 'COMPLETED_DATE',
  CreationDate = 'CREATION_DATE'
}

export type JobItem = {
  __typename?: 'JobItem';
  address?: Maybe<Scalars['String']>;
  answerBack?: Maybe<Scalars['String']>;
  attempts: Scalars['Int'];
  baudRate: Scalars['Int'];
  bytes: Scalars['Int'];
  callAnalysis?: Maybe<Scalars['String']>;
  callTime: Scalars['Int'];
  connectionDuration: Scalars['Float'];
  faxResolution: FaxMode;
  finishDate: Scalars['DateTime'];
  firstDate: Scalars['DateTime'];
  isSent: Scalars['Boolean'];
  jobItemNumber: Scalars['Int'];
  jobNumber: Scalars['Int'];
  lastCall: Scalars['Float'];
  lastConnectionDuration: Scalars['Float'];
  media: Media;
  outcome?: Maybe<Scalars['String']>;
  outcomes?: Maybe<Scalars['String']>;
  pages: Scalars['Int'];
  priority: Scalars['Byte'];
  recipient?: Maybe<Scalars['String']>;
  sentPages: Scalars['Int'];
  status?: Maybe<Scalars['Int']>;
  statusText?: Maybe<Scalars['String']>;
  trackingId?: Maybe<Scalars['String']>;
  uD1?: Maybe<Scalars['String']>;
  uD2?: Maybe<Scalars['String']>;
  uD3?: Maybe<Scalars['String']>;
  uD4?: Maybe<Scalars['String']>;
  uD5?: Maybe<Scalars['String']>;
};

export type JobItemBoolFilter = {
  field: JobItemBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum JobItemBoolFilterField {
  Failed = 'FAILED'
}

export type JobItemDateFilter = {
  field: JobItemDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum JobItemDateFilterField {
  FinishDate = 'FINISH_DATE'
}

export type JobItemId = {
  jobItemNumber: Scalars['Int'];
  jobNumber: Scalars['Int'];
};

export type JobItemIntFilter = {
  field: JobItemIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum JobItemIntFilterField {
  JobNumber = 'JOB_NUMBER'
}

export type JobItemQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<JobItemBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<JobItemDateFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<JobItemIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobItemSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<JobItemStringFilter>>>;
};

export enum JobItemSortField {
  Address = 'ADDRESS',
  AnswerBack = 'ANSWER_BACK',
  Attempts = 'ATTEMPTS',
  BaudRate = 'BAUD_RATE',
  Bytes = 'BYTES',
  CallTime = 'CALL_TIME',
  FinishDate = 'FINISH_DATE',
  FirstDate = 'FIRST_DATE',
  JobItem = 'JOB_ITEM',
  JobNumber = 'JOB_NUMBER',
  Outcome = 'OUTCOME',
  Outcomes = 'OUTCOMES',
  Pages = 'PAGES',
  Recipient = 'RECIPIENT',
  SentPages = 'SENT_PAGES',
  Status = 'STATUS',
  TrackingId = 'TRACKING_ID'
}

export type JobItemStringFilter = {
  field: JobItemStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum JobItemStringFilterField {
  Address = 'ADDRESS',
  Outcome = 'OUTCOME',
  TrackingId = 'TRACKING_ID'
}

export type JobItemTypeConnection = {
  __typename?: 'JobItemTypeConnection';
  edges?: Maybe<Array<Maybe<JobItem>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type JobMessage = {
  __typename?: 'JobMessage';
  chorusActionType?: Maybe<JobMessageChorusActionType>;
  chorusAddedAttachmentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  chorusB2GAddress?: Maybe<ChorusB2GAddress>;
  chorusStatus?: Maybe<JobMessageChorusStatus>;
  contactId?: Maybe<Scalars['String']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  /** @deprecated This property has been deprecated. Use Documents instead. */
  documentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  documents?: Maybe<Array<Maybe<JobMessageDocument>>>;
  emailAddress?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isPrimary?: Maybe<Scalars['Boolean']>;
  jobId: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  messageType: JobMessageType;
  name?: Maybe<Scalars['String']>;
  postalAddress?: Maybe<PostalAddress>;
  readDocumentDate?: Maybe<Scalars['DateTime']>;
  recipientName: Scalars['String'];
  recordedDeliveryNumber?: Maybe<Scalars['String']>;
  retryCount: Scalars['Int'];
  status: JobMessageStatus;
  tenantId: Scalars['String'];
  thirdPartyId?: Maybe<Scalars['String']>;
  trackingId: Scalars['String'];
  transmissionMode?: Maybe<DocumentTransmissionMode>;
  transmissionStatus: JobMessageTransmissionStatus;
  validationErrors?: Maybe<Array<Maybe<ChorusB2GValidationError>>>;
};

export type JobMessageActionOptions = {
  action: JobMessageActionType;
};

export enum JobMessageActionType {
  Cancel = 'CANCEL'
}

export type JobMessageBaseDateFilter = {
  field: JobMessageDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export type JobMessageBaseJobMessageStatusEnumFilter = {
  field: JobMessageStatusFilterField;
  filterValue1: JobMessageStatus;
  filterValue2?: InputMaybe<JobMessageStatus>;
  operator: NumberFilterOperator;
};

export type JobMessageBaseJobMessageTransmissionStatusEnumFilter = {
  field: JobMessageTransmissionStatusFilterField;
  filterValue1: JobMessageTransmissionStatus;
  filterValue2?: InputMaybe<JobMessageTransmissionStatus>;
  operator: NumberFilterOperator;
};

export type JobMessageBaseStringFilter = {
  field: JobMessageStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum JobMessageChorusActionType {
  Complete = 'COMPLETE',
  Send = 'SEND'
}

export enum JobMessageChorusStatus {
  Completed = 'COMPLETED',
  Draft = 'DRAFT',
  Error = 'ERROR',
  MadeAvailableToTheAccountingOfficer = 'MADE_AVAILABLE_TO_THE_ACCOUNTING_OFFICER',
  MadeAvailableToTheFirstValidator = 'MADE_AVAILABLE_TO_THE_FIRST_VALIDATOR',
  MadeAvailableToTheRecipient = 'MADE_AVAILABLE_TO_THE_RECIPIENT',
  MadeAvailableToTheSecondValidator = 'MADE_AVAILABLE_TO_THE_SECOND_VALIDATOR',
  Mandated = 'MANDATED',
  PostedInTheAccounts = 'POSTED_IN_THE_ACCOUNTS',
  Rejected = 'REJECTED',
  RejectedByFirstValidator = 'REJECTED_BY_FIRST_VALIDATOR',
  RejectedBySecondValidator = 'REJECTED_BY_SECOND_VALIDATOR',
  ReleasedForPayment = 'RELEASED_FOR_PAYMENT',
  ServiceRendered = 'SERVICE_RENDERED',
  Submited = 'SUBMITED',
  Suspended = 'SUSPENDED',
  TransmissionInProgress = 'TRANSMISSION_IN_PROGRESS',
  Unknown = 'UNKNOWN',
  ValidatedByFirstValidator = 'VALIDATED_BY_FIRST_VALIDATOR',
  ValidatedBySecondValidator = 'VALIDATED_BY_SECOND_VALIDATOR',
  Validation_1OverTheDeadline = 'VALIDATION_1_OVER_THE_DEADLINE',
  Validation_2OverTheDeadline = 'VALIDATION_2_OVER_THE_DEADLINE',
  WrongReceiverInformations = 'WRONG_RECEIVER_INFORMATIONS',
  WrongValidatorByCocontractor = 'WRONG_VALIDATOR_BY_COCONTRACTOR',
  WrongValidatorBySupplier = 'WRONG_VALIDATOR_BY_SUPPLIER'
}

export enum JobMessageDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type JobMessageDocument = {
  __typename?: 'JobMessageDocument';
  attachmentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  documentId: Scalars['String'];
};

export type JobMessageQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<JobMessageBaseDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobMessageSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<JobMessageBaseJobMessageStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<JobMessageBaseStringFilter>>>;
  transmissionStatusFilters?: InputMaybe<Array<InputMaybe<JobMessageBaseJobMessageTransmissionStatusEnumFilter>>>;
};

export enum JobMessageSortField {
  Id = 'ID',
  Name = 'NAME',
  TrackingId = 'TRACKING_ID'
}

export enum JobMessageStatus {
  Canceled = 'CANCELED',
  Completed = 'COMPLETED',
  Error = 'ERROR',
  Processing = 'PROCESSING'
}

export type JobMessageStatusCount = {
  __typename?: 'JobMessageStatusCount';
  canceledCount: Scalars['Int'];
  completedCount: Scalars['Int'];
  errorCount: Scalars['Int'];
  isPrimary: Scalars['Boolean'];
  totalCount: Scalars['Int'];
  type: JobMessageType;
};

export enum JobMessageStatusFilterField {
  Status = 'STATUS'
}

export enum JobMessageStringFilterField {
  DocumentId = 'DOCUMENT_ID',
  ExternalId = 'EXTERNAL_ID',
  JobId = 'JOB_ID',
  TenantId = 'TENANT_ID',
  TrackingId = 'TRACKING_ID'
}

export enum JobMessageTransmissionStatus {
  ExpiredCredentials = 'EXPIRED_CREDENTIALS',
  InvalidDocument = 'INVALID_DOCUMENT',
  Pending = 'PENDING',
  Rejected = 'REJECTED',
  StatusDelayExpired = 'STATUS_DELAY_EXPIRED',
  Success = 'SUCCESS',
  UnknownChorusB_2GTransmissionError = 'UNKNOWN_CHORUS_B_2_G_TRANSMISSION_ERROR',
  UnknownEmailTransmissionError = 'UNKNOWN_EMAIL_TRANSMISSION_ERROR',
  UnknownPostalTransmissionError = 'UNKNOWN_POSTAL_TRANSMISSION_ERROR',
  UnknownWebNotificationTransmissionError = 'UNKNOWN_WEB_NOTIFICATION_TRANSMISSION_ERROR',
  ValidationError = 'VALIDATION_ERROR',
  WrongDeliveryAddress = 'WRONG_DELIVERY_ADDRESS'
}

export enum JobMessageTransmissionStatusFilterField {
  TransmissionStatus = 'TRANSMISSION_STATUS'
}

export enum JobMessageType {
  Chorus = 'CHORUS',
  Email = 'EMAIL',
  Postal = 'POSTAL',
  WebNotification = 'WEB_NOTIFICATION'
}

export type JobMessageTypeConnection = {
  __typename?: 'JobMessageTypeConnection';
  edges?: Maybe<Array<Maybe<JobMessage>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type JobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<JobBaseDateFilter>>>;
  jobTypeFilters?: InputMaybe<Array<InputMaybe<JobBaseJobBaseTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<JobBaseJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<JobBaseStringFilter>>>;
};

export type JobResult = {
  __typename?: 'JobResult';
  jobNumber: Scalars['Int'];
};

export enum JobSortField {
  CompletedDate = 'COMPLETED_DATE',
  CreationDate = 'CREATION_DATE',
  Id = 'ID',
  JobType = 'JOB_TYPE',
  ServiceId = 'SERVICE_ID',
  Status = 'STATUS',
  TrackingId = 'TRACKING_ID'
}

export enum JobStatus {
  Active = 'ACTIVE',
  Archived = 'ARCHIVED',
  AwaitingTimeoutToLaunch = 'AWAITING_TIMEOUT_TO_LAUNCH',
  Canceled = 'CANCELED',
  CanceledDuringLaunch = 'CANCELED_DURING_LAUNCH',
  CancelInProgress = 'CANCEL_IN_PROGRESS',
  Completed = 'COMPLETED',
  Finished = 'FINISHED',
  LaunchFailed = 'LAUNCH_FAILED',
  LaunchInProgress = 'LAUNCH_IN_PROGRESS',
  NewJobSetup = 'NEW_JOB_SETUP',
  ProcessingPreview = 'PROCESSING_PREVIEW',
  ProofCanceled = 'PROOF_CANCELED',
  ProofFailed = 'PROOF_FAILED',
  ProofPending = 'PROOF_PENDING',
  ProofTransmited = 'PROOF_TRANSMITED',
  QuotaLaunchError = 'QUOTA_LAUNCH_ERROR',
  QuotaReached = 'QUOTA_REACHED',
  ResubmitInProcess = 'RESUBMIT_IN_PROCESS',
  Suspended = 'SUSPENDED',
  SuspendedDuringLaunch = 'SUSPENDED_DURING_LAUNCH'
}

export enum JobStatusFilterField {
  Status = 'STATUS'
}

export enum JobStringFilterField {
  ServiceId = 'SERVICE_ID',
  TenantId = 'TENANT_ID',
  TrackingId = 'TRACKING_ID'
}

export type JobSummary = {
  __typename?: 'JobSummary';
  applicationId?: Maybe<Scalars['Int']>;
  creationDate: Scalars['DateTime'];
  customerNumber: Scalars['Int'];
  failed: Scalars['Int'];
  firstDoc?: Maybe<Scalars['String']>;
  firstList?: Maybe<Scalars['String']>;
  isProofJob: Scalars['Boolean'];
  jobNumber: Scalars['Int'];
  jobType: Scalars['String'];
  login: Scalars['String'];
  media: Media;
  mostRecentDate: Scalars['DateTime'];
  page: Scalars['Int'];
  pageSent: Scalars['Int'];
  remaining: Scalars['Int'];
  retries: Scalars['Int'];
  sent: Scalars['Int'];
  startDate: Scalars['DateTime'];
  status: JobStatus;
  tID?: Maybe<Scalars['String']>;
  total: Scalars['Int'];
};

export type JobSummaryBoolFilter = {
  field: JobSummaryBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum JobSummaryBoolFilterField {
  AllSubAccounts = 'ALL_SUB_ACCOUNTS',
  IsProof = 'IS_PROOF',
  OnlyNotSent = 'ONLY_NOT_SENT'
}

export type JobSummaryDateFilter = {
  field: JobSummaryDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum JobSummaryDateFilterField {
  MostRecentDate = 'MOST_RECENT_DATE'
}

export type JobSummaryMediaEnumFilter = {
  field: JobSummaryMediaFilterField;
  filterValue1: Media;
  filterValue2?: InputMaybe<Media>;
  operator: NumberFilterOperator;
};

export enum JobSummaryMediaFilterField {
  Media = 'MEDIA'
}

export type JobSummaryQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<JobSummaryBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<JobSummaryDateFilter>>>;
  mediaFilters?: InputMaybe<Array<InputMaybe<JobSummaryMediaEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobSummarySortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<JobSummaryStringFilter>>>;
};

export enum JobSummarySortField {
  CreationDate = 'CREATION_DATE',
  Date = 'DATE',
  Failed = 'FAILED',
  JobNumber = 'JOB_NUMBER',
  Media = 'MEDIA',
  Reference = 'REFERENCE',
  Remaining = 'REMAINING',
  Sent = 'SENT',
  StartDate = 'START_DATE',
  Status = 'STATUS',
  Total = 'TOTAL'
}

export type JobSummaryStringFilter = {
  field: JobSummaryStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum JobSummaryStringFilterField {
  JobNumber = 'JOB_NUMBER',
  Tid = 'TID'
}

export type JobSummaryTypeConnection = {
  __typename?: 'JobSummaryTypeConnection';
  edges?: Maybe<Array<Maybe<JobSummary>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type JobTypeConnection = {
  __typename?: 'JobTypeConnection';
  edges?: Maybe<Array<Maybe<Job>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum JobTypeFilterField {
  JobType = 'JOB_TYPE'
}

export type KeyMultipleTypeValue = {
  __typename?: 'KeyMultipleTypeValue';
  key: Scalars['String'];
  value?: Maybe<MultipleTypeValue>;
};

export type KeyValue = {
  __typename?: 'KeyValue';
  key: Scalars['String'];
  value?: Maybe<Scalars['String']>;
};

export type KeyValuePair = {
  __typename?: 'KeyValuePair';
  key: Scalars['String'];
  value?: Maybe<Scalars['String']>;
};

export type KeyValuePairInput = {
  key: Scalars['String'];
  value?: InputMaybe<Scalars['String']>;
};

export enum Language {
  En = 'EN',
  Fr = 'FR',
  Ukn = 'UKN'
}

export type ListOfValues = {
  __typename?: 'ListOfValues';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadataIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  name: Scalars['String'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: ListOfValuesOwnerType;
  valueCount: Scalars['Int'];
};

export type ListOfValuesInput = {
  id?: InputMaybe<Scalars['String']>;
  name: Scalars['String'];
  ownerId?: InputMaybe<Scalars['String']>;
  ownerType: ListOfValuesOwnerType;
};

export enum ListOfValuesOwnerType {
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type ListOfValuesQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ListOfValuesSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ListOfValuesStringFilter>>>;
};

export enum ListOfValuesSortField {
  Name = 'NAME'
}

export type ListOfValuesStringFilter = {
  field: ListOfValuesStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ListOfValuesStringFilterField {
  Name = 'NAME',
  OwnerId = 'OWNER_ID'
}

export type ListOfValuesTypeConnection = {
  __typename?: 'ListOfValuesTypeConnection';
  edges?: Maybe<Array<Maybe<ListOfValues>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum LreArManagementType {
  Electronic = 'ELECTRONIC',
  Manual = 'MANUAL'
}

export enum Media {
  Email = 'EMAIL',
  Fax = 'FAX',
  FaxEmail = 'FAX_EMAIL',
  Postal = 'POSTAL',
  PushNotification = 'PUSH_NOTIFICATION',
  Sms = 'SMS',
  Voice = 'VOICE'
}

export type Metadata = {
  __typename?: 'Metadata';
  code: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  dataType: MetadataDataType;
  documentTypeIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  listOfValuesId?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: MetadataOwnerType;
};

export type MetadataConfig = {
  __typename?: 'MetadataConfig';
  defaultValue?: Maybe<Scalars['String']>;
  expectedFormat?: Maybe<Scalars['String']>;
  isDeletable?: Maybe<Scalars['Boolean']>;
  isEditable: Scalars['Boolean'];
  isMandatory: Scalars['Boolean'];
  metadataId: Scalars['String'];
};

export type MetadataConfigInput = {
  defaultValue?: InputMaybe<Scalars['String']>;
  expectedFormat?: InputMaybe<Scalars['String']>;
  isEditable: Scalars['Boolean'];
  isMandatory: Scalars['Boolean'];
  metadataId: Scalars['String'];
};

export enum MetadataDataType {
  Bool = 'BOOL',
  Date = 'DATE',
  Double = 'DOUBLE',
  Integer = 'INTEGER',
  ListOfValues = 'LIST_OF_VALUES',
  String = 'STRING'
}

export enum MetadataDataTypeFilterField {
  DataType = 'DATA_TYPE'
}

export type MetadataInput = {
  code: Scalars['String'];
  dataType: MetadataDataType;
  id?: InputMaybe<Scalars['String']>;
  listOfValuesId?: InputMaybe<Scalars['String']>;
  name: Scalars['String'];
  ownerId: Scalars['String'];
  ownerType: MetadataOwnerType;
};

export type MetadataMetadataDataTypeEnumFilter = {
  field: MetadataDataTypeFilterField;
  filterValue1: MetadataDataType;
  filterValue2?: InputMaybe<MetadataDataType>;
  operator: NumberFilterOperator;
};

export enum MetadataOwnerType {
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type MetadataQueryParams = {
  dataTypeFilters?: InputMaybe<Array<InputMaybe<MetadataMetadataDataTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<MetadataSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<MetadataStringFilter>>>;
};

export enum MetadataSortField {
  Code = 'CODE',
  DataType = 'DATA_TYPE',
  Name = 'NAME'
}

export type MetadataStringFilter = {
  field: MetadataStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum MetadataStringFilterField {
  Code = 'CODE',
  Name = 'NAME'
}

export type MetadataTypeConnection = {
  __typename?: 'MetadataTypeConnection';
  edges?: Maybe<Array<Maybe<Metadata>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type MultipleTypeValue = {
  __typename?: 'MultipleTypeValue';
  boolValue?: Maybe<Scalars['Boolean']>;
  dateValue?: Maybe<Scalars['DateTime']>;
  doubleValue?: Maybe<Scalars['Float']>;
  intValue?: Maybe<Scalars['Int']>;
  listValues?: Maybe<Array<Maybe<Scalars['String']>>>;
  stringValue?: Maybe<Scalars['String']>;
};

export type MultipleTypeValueInput = {
  boolValue?: InputMaybe<Scalars['Boolean']>;
  dateValue?: InputMaybe<Scalars['DateTime']>;
  doubleValue?: InputMaybe<Scalars['Float']>;
  intValue?: InputMaybe<Scalars['Int']>;
  listValues?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  stringValue?: InputMaybe<Scalars['String']>;
};

export type Nature = {
  __typename?: 'Nature';
  archiveConfiguration?: Maybe<ArchiveConfiguration>;
  code: Scalars['String'];
  cycle: NatureCycle;
  id: Scalars['String'];
  label: Scalars['String'];
  metadataConfigs?: Maybe<Array<Maybe<MetadataConfig>>>;
};

export enum NatureCycle {
  O_2C = 'O_2_C',
  P_2P = 'P_2_P'
}

export type NatureQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<NatureSortField>;
};

export enum NatureSortField {
  Code = 'CODE',
  Label = 'LABEL'
}

export type NatureTypeConnection = {
  __typename?: 'NatureTypeConnection';
  edges?: Maybe<Array<Maybe<Nature>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type Note = {
  __typename?: 'Note';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  ownerId: Scalars['String'];
  ownerType: NoteOwnerType;
  text: Scalars['String'];
};

export type NoteInput = {
  id?: InputMaybe<Scalars['String']>;
  ownerId: Scalars['String'];
  ownerType: NoteOwnerType;
  text: Scalars['String'];
};

export type NoteNoteOwnerTypeEnumFilter = {
  field: NoteOwnerTypeFilterField;
  filterValue1: NoteOwnerType;
  filterValue2?: InputMaybe<NoteOwnerType>;
  operator: NumberFilterOperator;
};

export enum NoteOwnerType {
  Service = 'SERVICE',
  ThirdParty = 'THIRD_PARTY'
}

export enum NoteOwnerTypeFilterField {
  OwnerType = 'OWNER_TYPE'
}

export type NoteQueryParams = {
  ownerTypeFilters?: InputMaybe<Array<InputMaybe<NoteNoteOwnerTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<NoteSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<NoteStringFilter>>>;
};

export enum NoteSortField {
  CreationDate = 'CREATION_DATE',
  LastModificationDate = 'LAST_MODIFICATION_DATE'
}

export type NoteStringFilter = {
  field: NoteStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum NoteStringFilterField {
  OwnerId = 'OWNER_ID'
}

export type NoteTypeConnection = {
  __typename?: 'NoteTypeConnection';
  edges?: Maybe<Array<Maybe<Note>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum NumberFilterOperator {
  Between = 'BETWEEN',
  Defined = 'DEFINED',
  Equal = 'EQUAL',
  EqualOrUndefined = 'EQUAL_OR_UNDEFINED',
  GreaterThan = 'GREATER_THAN',
  GreaterThanOrEqual = 'GREATER_THAN_OR_EQUAL',
  IsNotNull = 'IS_NOT_NULL',
  IsNull = 'IS_NULL',
  LowerThan = 'LOWER_THAN',
  LowerThanOrEqual = 'LOWER_THAN_OR_EQUAL',
  NotEqual = 'NOT_EQUAL',
  Undefined = 'UNDEFINED'
}

export type PageInfo = {
  __typename?: 'PageInfo';
  endCursor?: Maybe<Scalars['String']>;
  hasNextPage: Scalars['Boolean'];
};

export type PostalAddress = {
  __typename?: 'PostalAddress';
  additionalGeographicInfo?: Maybe<Scalars['String']>;
  additionalInfo?: Maybe<Scalars['String']>;
  city?: Maybe<Scalars['String']>;
  country?: Maybe<Scalars['String']>;
  name?: Maybe<Scalars['String']>;
  postBox?: Maybe<Scalars['String']>;
  street?: Maybe<Scalars['String']>;
  zipCode?: Maybe<Scalars['String']>;
};

export type PostalAddressInput = {
  additionalGeographicInfo?: InputMaybe<Scalars['String']>;
  additionalInfo?: InputMaybe<Scalars['String']>;
  city: Scalars['String'];
  country: Scalars['String'];
  name: Scalars['String'];
  postBox?: InputMaybe<Scalars['String']>;
  street: Scalars['String'];
  zipCode: Scalars['String'];
};

export type PostalAdhocRecipientInput = {
  address?: InputMaybe<PostalAddressInput>;
  isPrimary?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type PostalJob = {
  __typename?: 'PostalJob';
  completedDate?: Maybe<Scalars['DateTime']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  documentIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  failedCount: Scalars['Int'];
  id: Scalars['String'];
  jobType?: Maybe<JobBaseType>;
  note?: Maybe<Scalars['String']>;
  parameter?: Maybe<PostalParameter>;
  recipientCount: Scalars['Int'];
  sentCount: Scalars['Int'];
  serviceId?: Maybe<Scalars['String']>;
  status: JobBaseStatus;
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
  undeliveredCount: Scalars['Int'];
};

export type PostalJobDateFilter = {
  field: JobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export type PostalJobInput = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  documents?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  note?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<PostalParameterInput>;
  postalAdhocRecipients?: InputMaybe<Array<InputMaybe<PostalAdhocRecipientInput>>>;
  serviceId?: InputMaybe<Scalars['String']>;
  trackingId?: InputMaybe<Scalars['String']>;
};

export type PostalJobJobBaseStatusEnumFilter = {
  field: JobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type PostalJobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<PostalJobDateFilter>>>;
  jobTypeFilters?: InputMaybe<Array<InputMaybe<JobBaseJobBaseTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<PostalJobJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<PostalJobStringFilter>>>;
};

export type PostalJobStringFilter = {
  field: JobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export type PostalJobTypeConnection = {
  __typename?: 'PostalJobTypeConnection';
  edges?: Maybe<Array<Maybe<PostalJob>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type PostalParameter = {
  __typename?: 'PostalParameter';
  envelope?: Maybe<EnvelopeType>;
  lreArManagement?: Maybe<LreArManagementType>;
  mergeDocuments?: Maybe<Scalars['Boolean']>;
  printBothSide?: Maybe<Scalars['Boolean']>;
  printColor?: Maybe<Scalars['Boolean']>;
  sender?: Maybe<PostalAddress>;
  stamp?: Maybe<StampType>;
};

export type PostalParameterConfiguration = {
  __typename?: 'PostalParameterConfiguration';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  envelope?: Maybe<EnvelopeType>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  lreArManagement?: Maybe<LreArManagementType>;
  mergeDocuments?: Maybe<Scalars['Boolean']>;
  ownerId?: Maybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
  printBothSide?: Maybe<Scalars['Boolean']>;
  printColor?: Maybe<Scalars['Boolean']>;
  sender?: Maybe<PostalAddress>;
  stamp?: Maybe<StampType>;
};

export type PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilter = {
  field: PostalParameterConfigurationOwnerTypeFilterField;
  filterValue1: InheritedConfigurationOwnerType;
  filterValue2?: InputMaybe<InheritedConfigurationOwnerType>;
  operator: NumberFilterOperator;
};

export type PostalParameterConfigurationInput = {
  envelope?: InputMaybe<EnvelopeType>;
  id?: InputMaybe<Scalars['String']>;
  lreArManagement?: InputMaybe<LreArManagementType>;
  mergeDocuments?: InputMaybe<Scalars['Boolean']>;
  ownerId: Scalars['String'];
  ownerType: InheritedConfigurationOwnerType;
  printBothSide?: InputMaybe<Scalars['Boolean']>;
  printColor?: InputMaybe<Scalars['Boolean']>;
  sender?: InputMaybe<PostalAddressInput>;
  stamp?: InputMaybe<StampType>;
};

export enum PostalParameterConfigurationOwnerTypeFilterField {
  OwnerType = 'OWNER_TYPE'
}

export type PostalParameterConfigurationQueryParams = {
  ownerTypeFilters?: InputMaybe<Array<InputMaybe<PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<PostalParameterConfigurationSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<PostalParameterConfigurationStringFilter>>>;
};

export enum PostalParameterConfigurationSortField {
  CreationDate = 'CREATION_DATE',
  LastModificationDate = 'LAST_MODIFICATION_DATE',
  OwnerId = 'OWNER_ID'
}

export type PostalParameterConfigurationStringFilter = {
  field: PostalParameterConfigurationStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum PostalParameterConfigurationStringFilterField {
  OwnerId = 'OWNER_ID'
}

export type PostalParameterConfigurationTypeConnection = {
  __typename?: 'PostalParameterConfigurationTypeConnection';
  edges?: Maybe<Array<Maybe<PostalParameterConfiguration>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type PostalParameterInput = {
  envelope?: InputMaybe<EnvelopeType>;
  lreArManagement?: InputMaybe<LreArManagementType>;
  mergeDocuments?: InputMaybe<Scalars['Boolean']>;
  printBothSide?: InputMaybe<Scalars['Boolean']>;
  printColor?: InputMaybe<Scalars['Boolean']>;
  sender?: InputMaybe<PostalAddressInput>;
  stamp?: InputMaybe<StampType>;
};

export type PowerBiAuthToken = {
  __typename?: 'PowerBiAuthToken';
  accessToken: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  embedUrl: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
};

export enum ProcessingStatus {
  Completed = 'COMPLETED',
  Error = 'ERROR'
}

export enum ProcessingType {
  RedirectEmail = 'REDIRECT_EMAIL'
}

export type PushJob = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  adhocRecipients?: InputMaybe<Array<InputMaybe<Recipient>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  jobType?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<PushParameter>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  text: Scalars['String'];
  trackingId?: InputMaybe<Scalars['String']>;
};

export type PushParameter = {
  activateTracking?: InputMaybe<Scalars['Boolean']>;
  applicationId?: InputMaybe<Scalars['Int']>;
  badgeCount?: InputMaybe<Scalars['Int']>;
  expirationDuration?: InputMaybe<Scalars['Int']>;
  isByToken?: InputMaybe<Scalars['Boolean']>;
  isSilent?: InputMaybe<Scalars['Boolean']>;
  soundFileName?: InputMaybe<Scalars['String']>;
  title?: InputMaybe<Scalars['String']>;
};

export type Recipient = {
  address: Scalars['String'];
  name?: InputMaybe<Scalars['String']>;
  optionalFields?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
};

export type RegisteredPostalOptions = {
  __typename?: 'RegisteredPostalOptions';
  anonymous: Scalars['Boolean'];
};

export type RegisteredPostalOptionsInput = {
  anonymous: Scalars['Boolean'];
};

export type RelaunchJobMessageOptionsInput = {
  documentId?: InputMaybe<Scalars['String']>;
  domainId?: InputMaybe<Scalars['String']>;
  jobId?: InputMaybe<Scalars['String']>;
  jobMessageId?: InputMaybe<Scalars['String']>;
  messageType?: InputMaybe<JobMessageType>;
  tenantId?: InputMaybe<Scalars['String']>;
  transmissionStatus: JobMessageTransmissionStatus;
};

/** The application rights action type. */
export enum RightActionType {
  Change = 'CHANGE',
  Read = 'READ'
}

export type RightInitialValue = {
  __typename?: 'RightInitialValue';
  actionType?: Maybe<RightActionType>;
  category?: Maybe<Scalars['String']>;
  initialValue: Scalars['Boolean'];
  right: RightType;
  subCategory?: Maybe<Scalars['String']>;
};

export type RightInitialValueBoolFilter = {
  field: RightInitialValueBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum RightInitialValueBoolFilterField {
  InitialValue = 'INITIAL_VALUE'
}

export type RightInitialValueQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<RightInitialValueBoolFilter>>>;
  rightTypeFilters?: InputMaybe<Array<InputMaybe<RightInitialValueRightTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<RightInitialValueSortField>;
};

export type RightInitialValueRightTypeEnumFilter = {
  field: RightInitialValueRightTypeFilterField;
  filterValue1: RightType;
  filterValue2?: InputMaybe<RightType>;
  operator: NumberFilterOperator;
};

export enum RightInitialValueRightTypeFilterField {
  Right = 'RIGHT'
}

export enum RightInitialValueSortField {
  InitialValue = 'INITIAL_VALUE',
  Right = 'RIGHT'
}

export type RightInitialValueTypeConnection = {
  __typename?: 'RightInitialValueTypeConnection';
  edges?: Maybe<Array<Maybe<RightInitialValue>>>;
  pageInfo?: Maybe<PageInfo>;
};

/** The application rights. */
export enum RightType {
  /** Create environments */
  AddEnvironment = 'ADD_ENVIRONMENT',
  /** Create tenants */
  AddTenant = 'ADD_TENANT',
  /** CancelJobMessage */
  CancelJobMessage = 'CANCEL_JOB_MESSAGE',
  /** Create, edit or delete activities */
  ChangeActivity = 'CHANGE_ACTIVITY',
  /** Create, edit or delete api routing configurations */
  ChangeApiRoutingConfiguration = 'CHANGE_API_ROUTING_CONFIGURATION',
  /** Create, edit or delete document links */
  ChangeClickedLinkDocument = 'CHANGE_CLICKED_LINK_DOCUMENT',
  /** Create or edit configurations */
  ChangeConfiguration = 'CHANGE_CONFIGURATION',
  /** Create, edit or delete contacts */
  ChangeContact = 'CHANGE_CONTACT',
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create, edit or delete dashboards */
  ChangeDashboard = 'CHANGE_DASHBOARD',
  /** Create, edit or delete data file action */
  ChangeDataFileAction = 'CHANGE_DATA_FILE_ACTION',
  /** Create, edit or delete documents */
  ChangeDocument = 'CHANGE_DOCUMENT',
  /** Create documentJob */
  ChangeDocumentJob = 'CHANGE_DOCUMENT_JOB',
  /** Create, edit or delete document types */
  ChangeDocumentType = 'CHANGE_DOCUMENT_TYPE',
  /** Create or edit domains */
  ChangeDomain = 'CHANGE_DOMAIN',
  /** Create, edit or renew Domain Api users */
  ChangeDomainApiUser = 'CHANGE_DOMAIN_API_USER',
  /** Create or edit domain administrators */
  ChangeDomainUser = 'CHANGE_DOMAIN_USER',
  /** Create, edit or renew Environment Api users */
  ChangeEnvironmentApiUser = 'CHANGE_ENVIRONMENT_API_USER',
  /** Create or edit environment administrators */
  ChangeEnvironmentUser = 'CHANGE_ENVIRONMENT_USER',
  /** Create, edit or delete jobMessage */
  ChangeJobMessage = 'CHANGE_JOB_MESSAGE',
  /** Create, edit or delete list of values */
  ChangeListOfValues = 'CHANGE_LIST_OF_VALUES',
  /** Create, edit or delete metadatas */
  ChangeMetadata = 'CHANGE_METADATA',
  /** Create or edit notes */
  ChangeNote = 'CHANGE_NOTE',
  /** Create or edit OMS resources */
  ChangeOmsResources = 'CHANGE_OMS_RESOURCES',
  /** Create postalJob */
  ChangePostalJob = 'CHANGE_POSTAL_JOB',
  /** Create, edit or delete postal parameter configurations */
  ChangePostalParameterConfiguration = 'CHANGE_POSTAL_PARAMETER_CONFIGURATION',
  /** Create or edit PowerBi auth token */
  ChangePowerBiAuthToken = 'CHANGE_POWER_BI_AUTH_TOKEN',
  /** Create or edit products */
  ChangeProduct = 'CHANGE_PRODUCT',
  /** Create or edit product installs */
  ChangeProductInstall = 'CHANGE_PRODUCT_INSTALL',
  /** Create, edit or delete services */
  ChangeService = 'CHANGE_SERVICE',
  /** Create, edit or delete template contents */
  ChangeTemplateContent = 'CHANGE_TEMPLATE_CONTENT',
  /** Create, edit or delete template structures */
  ChangeTemplateStructure = 'CHANGE_TEMPLATE_STRUCTURE',
  /** Create, edit or delete template contents */
  ChangeTemplateVariableConfiguration = 'CHANGE_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Create, edit or renew Api users */
  ChangeTenantApiUser = 'CHANGE_TENANT_API_USER',
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Create, edit or delete third parties */
  ChangeThirdParty = 'CHANGE_THIRD_PARTY',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Complete document */
  CompleteDocument = 'COMPLETE_DOCUMENT',
  /** Edit environments */
  EditEnvironment = 'EDIT_ENVIRONMENT',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Edit Tenant postal config */
  EditTenantPostalConfig = 'EDIT_TENANT_POSTAL_CONFIG',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Read clicked link document */
  MarkDocumentAsRead = 'MARK_DOCUMENT_AS_READ',
  /** Get or list activities */
  ReadActivity = 'READ_ACTIVITY',
  /** Get or list api routing configurations */
  ReadApiRoutingConfiguration = 'READ_API_ROUTING_CONFIGURATION',
  /** Mark document as read */
  ReadClickedLinkDocument = 'READ_CLICKED_LINK_DOCUMENT',
  /** Get or list configurations */
  ReadConfiguration = 'READ_CONFIGURATION',
  /** Get or list contacts */
  ReadContact = 'READ_CONTACT',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
  /** Get or list dashboards */
  ReadDashboard = 'READ_DASHBOARD',
  /** Get or list data file action */
  ReadDataFileAction = 'READ_DATA_FILE_ACTION',
  /** Get or list documents sent to the user */
  ReadDocument = 'READ_DOCUMENT',
  /** Get or list documentJobs */
  ReadDocumentJob = 'READ_DOCUMENT_JOB',
  /** Get or list documents sent to the service of the user */
  ReadDocumentOnService = 'READ_DOCUMENT_ON_SERVICE',
  /** Get or list document types */
  ReadDocumentType = 'READ_DOCUMENT_TYPE',
  /** Get or list domains */
  ReadDomain = 'READ_DOMAIN',
  /** Get or list Domain Api users */
  ReadDomainApiUser = 'READ_DOMAIN_API_USER',
  /** Get or list domain administrators */
  ReadDomainUser = 'READ_DOMAIN_USER',
  /** Get or list environments */
  ReadEnvironment = 'READ_ENVIRONMENT',
  /** Get or list Environment Api users */
  ReadEnvironmentApiUser = 'READ_ENVIRONMENT_API_USER',
  /** Get or list environment administrators */
  ReadEnvironmentUser = 'READ_ENVIRONMENT_USER',
  /** Get or list jobMessages */
  ReadJobMessage = 'READ_JOB_MESSAGE',
  /** Get or list list of values */
  ReadListOfValues = 'READ_LIST_OF_VALUES',
  /** Get or list metadatas */
  ReadMetadata = 'READ_METADATA',
  /** Get or list notes */
  ReadNote = 'READ_NOTE',
  /** Get or list OMS resources */
  ReadOmsResources = 'READ_OMS_RESOURCES',
  /** Get or list postalJobs */
  ReadPostalJob = 'READ_POSTAL_JOB',
  /** Get or list postal parameter configurations */
  ReadPostalParameterConfiguration = 'READ_POSTAL_PARAMETER_CONFIGURATION',
  /** Get or list products */
  ReadProduct = 'READ_PRODUCT',
  /** Get or list product installs */
  ReadProductInstall = 'READ_PRODUCT_INSTALL',
  /** List user rights */
  ReadRight = 'READ_RIGHT',
  /** Get or list services */
  ReadService = 'READ_SERVICE',
  /** Get or list status actions */
  ReadStatusAction = 'READ_STATUS_ACTION',
  /** Get or list template contents */
  ReadTemplateContent = 'READ_TEMPLATE_CONTENT',
  /** Get or list template structures */
  ReadTemplateStructure = 'READ_TEMPLATE_STRUCTURE',
  /** Get or list template variables configuration */
  ReadTemplateVariableConfiguration = 'READ_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Get or list tenants */
  ReadTenant = 'READ_TENANT',
  /** Get or list Api users */
  ReadTenantApiUser = 'READ_TENANT_API_USER',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Get or list tenant users */
  ReadTenantUser = 'READ_TENANT_USER',
  /** Get or list third parties */
  ReadThirdParty = 'READ_THIRD_PARTY',
  /** Get or list third party types */
  ReadThirdPartyType = 'READ_THIRD_PARTY_TYPE',
  /** RelaunchJobMessage */
  RelaunchJobMessage = 'RELAUNCH_JOB_MESSAGE',
  /** Resend document to chorusRight */
  ResendDocument = 'RESEND_DOCUMENT',
  /** Synchronize EDC resources */
  SynchronizeEdcResources = 'SYNCHRONIZE_EDC_RESOURCES',
  /** Validate invited user */
  ValidateUser = 'VALIDATE_USER'
}

export type RightValueBoolFilter = {
  field: RightValueBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum RightValueBoolFilterField {
  Value = 'VALUE'
}

export type RightValueQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<RightValueBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<RightValueSortField>;
};

export enum RightValueSortField {
  Right = 'RIGHT',
  Value = 'VALUE'
}

export type Service = {
  __typename?: 'Service';
  chorusB2GConfig?: Maybe<ChorusB2GConfig>;
  code?: Maybe<Scalars['String']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  customSmtpConfig?: Maybe<SmtpConfig>;
  hasCustomSmtpConfig: Scalars['Boolean'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  tenantId: Scalars['String'];
  tenantUserCount: Scalars['Int'];
};

export type ServiceBoolFilter = {
  field: ServiceBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ServiceBoolFilterField {
  HasCustomSmtpConfig = 'HAS_CUSTOM_SMTP_CONFIG',
  IsEnabled = 'IS_ENABLED'
}

export type ServiceInput = {
  chorusB2GConfig?: InputMaybe<ChorusB2GConfigInput>;
  code?: InputMaybe<Scalars['String']>;
  customSmtpConfig?: InputMaybe<SmtpConfigInput>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type ServiceIntFilter = {
  field: ServiceIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum ServiceIntFilterField {
  TenantUserCount = 'TENANT_USER_COUNT'
}

export type ServiceQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ServiceBoolFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<ServiceIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ServiceSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ServiceStringFilter>>>;
};

export enum ServiceSortField {
  HasCustomSmtpConfig = 'HAS_CUSTOM_SMTP_CONFIG',
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME',
  TenantUserCount = 'TENANT_USER_COUNT'
}

export type ServiceStringFilter = {
  field: ServiceStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ServiceStringFilterField {
  Name = 'NAME'
}

export type ServiceTypeConnection = {
  __typename?: 'ServiceTypeConnection';
  edges?: Maybe<Array<Maybe<Service>>>;
  pageInfo?: Maybe<PageInfo>;
};

export enum SmsContentType {
  Binary = 'BINARY',
  Text = 'TEXT',
  Unicode = 'UNICODE'
}

export type SmsJob = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  adhocRecipients?: InputMaybe<Array<InputMaybe<Recipient>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  jobType?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<SmsParameter>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  text: Scalars['String'];
  trackingId?: InputMaybe<Scalars['String']>;
};

export type SmsParameter = {
  allowMultiPartition?: InputMaybe<Scalars['Boolean']>;
  contentType?: InputMaybe<SmsContentType>;
  formsManagement?: InputMaybe<Scalars['Boolean']>;
  lifeSpan?: InputMaybe<Scalars['Int']>;
  maxPartition?: InputMaybe<Scalars['Int']>;
  sender?: InputMaybe<Scalars['String']>;
  shortUrl?: InputMaybe<Scalars['Boolean']>;
  shortUrlGeotagging?: InputMaybe<Scalars['Boolean']>;
  shortUrlTracking?: InputMaybe<Scalars['Boolean']>;
  smsFlash?: InputMaybe<Scalars['Boolean']>;
};

export type SmtpConfig = {
  __typename?: 'SmtpConfig';
  errorAddress?: Maybe<Scalars['String']>;
  hasSmtpSsl?: Maybe<Scalars['Boolean']>;
  replyAddress?: Maybe<Scalars['String']>;
  senderAddress?: Maybe<Scalars['String']>;
  senderName?: Maybe<Scalars['String']>;
  smtpLogin?: Maybe<Scalars['String']>;
  smtpPassword?: Maybe<Scalars['String']>;
  smtpPort?: Maybe<Scalars['Int']>;
  smtpServer?: Maybe<Scalars['String']>;
};

export type SmtpConfigInput = {
  errorAddress?: InputMaybe<Scalars['String']>;
  hasSmtpSsl?: InputMaybe<Scalars['Boolean']>;
  replyAddress?: InputMaybe<Scalars['String']>;
  senderAddress: Scalars['String'];
  senderName: Scalars['String'];
  smtpLogin?: InputMaybe<Scalars['String']>;
  smtpPassword?: InputMaybe<Scalars['String']>;
  smtpPort?: InputMaybe<Scalars['Int']>;
  smtpServer?: InputMaybe<Scalars['String']>;
};

export enum SortDirection {
  Ascending = 'ASCENDING',
  Descending = 'DESCENDING'
}

export enum StampType {
  Industriel = 'INDUSTRIEL',
  IndustrielJplus_4 = 'INDUSTRIEL_JPLUS_4',
  LettreVerte = 'LETTRE_VERTE',
  Normal = 'NORMAL',
  Recommande = 'RECOMMANDE'
}

export type StatusAction = {
  __typename?: 'StatusAction';
  action: Scalars['String'];
  category: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  status: Scalars['String'];
};

export type StatusActionQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<StatusActionSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<StatusActionStringFilter>>>;
};

export enum StatusActionSortField {
  Action = 'ACTION',
  Category = 'CATEGORY',
  Id = 'ID',
  Status = 'STATUS'
}

export type StatusActionStringFilter = {
  field: StatusActionStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum StatusActionStringFilterField {
  Action = 'ACTION',
  Category = 'CATEGORY',
  Id = 'ID',
  Status = 'STATUS'
}

export type StatusActionTypeConnection = {
  __typename?: 'StatusActionTypeConnection';
  edges?: Maybe<Array<Maybe<StatusAction>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type StatusCounts = {
  __typename?: 'StatusCounts';
  key: DocumentStatus;
  value: Scalars['Long'];
};

export enum StringFilterOperator {
  Contain = 'CONTAIN',
  Defined = 'DEFINED',
  EndWith = 'END_WITH',
  Equal = 'EQUAL',
  EqualOrUndefined = 'EQUAL_OR_UNDEFINED',
  InArray = 'IN_ARRAY',
  IsNotNull = 'IS_NOT_NULL',
  IsNull = 'IS_NULL',
  NotContain = 'NOT_CONTAIN',
  NotEndWith = 'NOT_END_WITH',
  NotEqual = 'NOT_EQUAL',
  NotStartWith = 'NOT_START_WITH',
  StartWith = 'START_WITH',
  Undefined = 'UNDEFINED'
}

export type SubStatusCounts = {
  __typename?: 'SubStatusCounts';
  key: DocumentSubStatus;
  value: Scalars['Long'];
};

export type TemplateContent = {
  __typename?: 'TemplateContent';
  content: Scalars['String'];
  creationDate: Scalars['DateTime'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  notificationType: TemplateContentNotificationType;
  ownerId?: Maybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
  subject?: Maybe<Scalars['String']>;
  transmissionType: TemplateContentTransmissionType;
};

export type TemplateContentBoolFilter = {
  field: TemplateContentBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum TemplateContentBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type TemplateContentDateFilter = {
  field: TemplateContentDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum TemplateContentDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type TemplateContentInheritedConfigurationOwnerTypeEnumFilter = {
  field: TemplateContentOwnerTypeFilterField;
  filterValue1: InheritedConfigurationOwnerType;
  filterValue2?: InputMaybe<InheritedConfigurationOwnerType>;
  operator: NumberFilterOperator;
};

export type TemplateContentInput = {
  content: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled: Scalars['Boolean'];
  notificationType: TemplateContentNotificationType;
  ownerId?: InputMaybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
  subject?: InputMaybe<Scalars['String']>;
  transmissionType: TemplateContentTransmissionType;
};

export enum TemplateContentNotificationType {
  ActivityAddAttachmentsDocument = 'ACTIVITY_ADD_ATTACHMENTS_DOCUMENT',
  ActivityAddDataFileAction = 'ACTIVITY_ADD_DATA_FILE_ACTION',
  ActivityCancelJobMessage = 'ACTIVITY_CANCEL_JOB_MESSAGE',
  ActivityChangeStatusChorusB_2G = 'ACTIVITY_CHANGE_STATUS_CHORUS_B_2_G',
  ActivityCompleteChorusB_2G = 'ACTIVITY_COMPLETE_CHORUS_B_2_G',
  ActivityDocumentArchived = 'ACTIVITY_DOCUMENT_ARCHIVED',
  ActivityDocumentCanceled = 'ACTIVITY_DOCUMENT_CANCELED',
  ActivityDocumentRead = 'ACTIVITY_DOCUMENT_READ',
  ActivityDocumentSigned = 'ACTIVITY_DOCUMENT_SIGNED',
  ActivityEditMetadataDocument = 'ACTIVITY_EDIT_METADATA_DOCUMENT',
  ActivityError = 'ACTIVITY_ERROR',
  ActivityExternalProcess = 'ACTIVITY_EXTERNAL_PROCESS',
  ActivityJobCreated = 'ACTIVITY_JOB_CREATED',
  ActivityJobLaunched = 'ACTIVITY_JOB_LAUNCHED',
  ActivityJobProcessing = 'ACTIVITY_JOB_PROCESSING',
  ActivityNotificationSent = 'ACTIVITY_NOTIFICATION_SENT',
  ActivitySendChorusB_2G = 'ACTIVITY_SEND_CHORUS_B_2_G',
  AddUserToTenant = 'ADD_USER_TO_TENANT',
  DocumentNotification = 'DOCUMENT_NOTIFICATION',
  DocumentNotificationLink = 'DOCUMENT_NOTIFICATION_LINK',
  DocumentNotificationWithLink = 'DOCUMENT_NOTIFICATION_WITH_LINK',
  Ere = 'ERE',
  EreAnonymous = 'ERE_ANONYMOUS',
  InternalNotArchivedFiles = 'INTERNAL_NOT_ARCHIVED_FILES',
  InviteUser = 'INVITE_USER',
  Lse = 'LSE',
  LseAnonymous = 'LSE_ANONYMOUS',
  LseEreEndOfJob = 'LSE_ERE_END_OF_JOB',
  NewUserLogin = 'NEW_USER_LOGIN',
  NewUserPassword = 'NEW_USER_PASSWORD'
}

export enum TemplateContentNotificationTypeFilterField {
  NotificationType = 'NOTIFICATION_TYPE'
}

export enum TemplateContentOwnerTypeFilterField {
  OwnerType = 'OWNER_TYPE'
}

export type TemplateContentQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<TemplateContentBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<TemplateContentDateFilter>>>;
  notificationTypeFilters?: InputMaybe<Array<InputMaybe<TemplateContentTemplateContentNotificationTypeEnumFilter>>>;
  ownerTypeFilters?: InputMaybe<Array<InputMaybe<TemplateContentInheritedConfigurationOwnerTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<TemplateContentSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<TemplateContentStringFilter>>>;
  transmissionTypeFilters?: InputMaybe<Array<InputMaybe<TemplateContentTemplateContentTransmissionTypeEnumFilter>>>;
};

export enum TemplateContentSortField {
  CreationDate = 'CREATION_DATE',
  IsEnabled = 'IS_ENABLED',
  NotificationType = 'NOTIFICATION_TYPE',
  OwnerId = 'OWNER_ID',
  OwnerType = 'OWNER_TYPE',
  Subject = 'SUBJECT',
  TransmissionType = 'TRANSMISSION_TYPE'
}

export type TemplateContentStringFilter = {
  field: TemplateContentStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum TemplateContentStringFilterField {
  Id = 'ID',
  OwnerId = 'OWNER_ID',
  Subject = 'SUBJECT'
}

export type TemplateContentTemplateContentNotificationTypeEnumFilter = {
  field: TemplateContentNotificationTypeFilterField;
  filterValue1: TemplateContentNotificationType;
  filterValue2?: InputMaybe<TemplateContentNotificationType>;
  operator: NumberFilterOperator;
};

export type TemplateContentTemplateContentTransmissionTypeEnumFilter = {
  field: TemplateContentTransmissionTypeFilterField;
  filterValue1: TemplateContentTransmissionType;
  filterValue2?: InputMaybe<TemplateContentTransmissionType>;
  operator: NumberFilterOperator;
};

export enum TemplateContentTransmissionType {
  Email = 'EMAIL',
  None = 'NONE',
  Sms = 'SMS',
  WebNotification = 'WEB_NOTIFICATION'
}

export enum TemplateContentTransmissionTypeFilterField {
  TransmissionType = 'TRANSMISSION_TYPE'
}

export type TemplateContentTypeConnection = {
  __typename?: 'TemplateContentTypeConnection';
  edges?: Maybe<Array<Maybe<TemplateContent>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type TemplateStructure = {
  __typename?: 'TemplateStructure';
  contentBase64: Scalars['String'];
  contentId: Scalars['String'];
  creationDate: Scalars['DateTime'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
};

export type TemplateStructureBoolFilter = {
  field: TemplateStructureBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum TemplateStructureBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type TemplateStructureDateFilter = {
  field: TemplateStructureDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum TemplateStructureDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type TemplateStructureInheritedConfigurationOwnerTypeEnumFilter = {
  field: TemplateStructureOwnerTypeFilterField;
  filterValue1: InheritedConfigurationOwnerType;
  filterValue2?: InputMaybe<InheritedConfigurationOwnerType>;
  operator: NumberFilterOperator;
};

export type TemplateStructureInput = {
  contentBase64: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled: Scalars['Boolean'];
  ownerId?: InputMaybe<Scalars['String']>;
  ownerType: InheritedConfigurationOwnerType;
};

export enum TemplateStructureOwnerTypeFilterField {
  OwnerType = 'OWNER_TYPE'
}

export type TemplateStructureQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<TemplateStructureBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<TemplateStructureDateFilter>>>;
  ownerTypeFilters?: InputMaybe<Array<InputMaybe<TemplateStructureInheritedConfigurationOwnerTypeEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<TemplateStructureSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<TemplateStructureStringFilter>>>;
};

export enum TemplateStructureSortField {
  CreationDate = 'CREATION_DATE',
  IsEnabled = 'IS_ENABLED',
  OwnerId = 'OWNER_ID',
  OwnerType = 'OWNER_TYPE'
}

export type TemplateStructureStringFilter = {
  field: TemplateStructureStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum TemplateStructureStringFilterField {
  Id = 'ID',
  OwnerId = 'OWNER_ID'
}

export type TemplateStructureTypeConnection = {
  __typename?: 'TemplateStructureTypeConnection';
  edges?: Maybe<Array<Maybe<TemplateStructure>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type TemplateVariable = {
  __typename?: 'TemplateVariable';
  description?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  replacementTag: Scalars['String'];
};

export type TemporaryDocumentContent = {
  __typename?: 'TemporaryDocumentContent';
  content: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadata?: Maybe<Array<Maybe<KeyValuePair>>>;
  name: Scalars['String'];
  size: Scalars['Long'];
  storageEndDate?: Maybe<Scalars['DateTime']>;
  tenantId: Scalars['String'];
};

export type TemporaryDocumentContentInput = {
  content: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  metadata?: InputMaybe<Array<InputMaybe<KeyValuePairInput>>>;
  name: Scalars['String'];
  tenantId: Scalars['String'];
};

export type TemporaryDocumentHeader = {
  __typename?: 'TemporaryDocumentHeader';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadata?: Maybe<Array<Maybe<KeyValuePair>>>;
  name: Scalars['String'];
  size: Scalars['Long'];
  storageEndDate?: Maybe<Scalars['DateTime']>;
  tenantId: Scalars['String'];
};

export type TemporaryDocumentHeaderDateFilter = {
  field: TemporaryDocumentHeaderDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum TemporaryDocumentHeaderDateFilterField {
  CreationDate = 'CREATION_DATE',
  StorageEndDate = 'STORAGE_END_DATE'
}

export type TemporaryDocumentHeaderQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<TemporaryDocumentHeaderDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<TemporaryDocumentHeaderSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<TemporaryDocumentHeaderStringFilter>>>;
};

export enum TemporaryDocumentHeaderSortField {
  CreationDate = 'CREATION_DATE',
  Name = 'NAME',
  Size = 'SIZE',
  StorageEndDate = 'STORAGE_END_DATE'
}

export type TemporaryDocumentHeaderStringFilter = {
  field: TemporaryDocumentHeaderStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum TemporaryDocumentHeaderStringFilterField {
  Name = 'NAME',
  TenantId = 'TENANT_ID'
}

export type TemporaryDocumentHeaderTypeConnection = {
  __typename?: 'TemporaryDocumentHeaderTypeConnection';
  edges?: Maybe<Array<Maybe<TemporaryDocumentHeader>>>;
  pageInfo?: Maybe<PageInfo>;
};

/** The application rights for tenant user. */
export enum TenantRightType {
  /** CancelJobMessage */
  CancelJobMessage = 'CANCEL_JOB_MESSAGE',
  /** Create, edit or delete activities */
  ChangeActivity = 'CHANGE_ACTIVITY',
  /** Create, edit or delete document links */
  ChangeClickedLinkDocument = 'CHANGE_CLICKED_LINK_DOCUMENT',
  /** Create, edit or delete contacts */
  ChangeContact = 'CHANGE_CONTACT',
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create, edit or delete dashboards */
  ChangeDashboard = 'CHANGE_DASHBOARD',
  /** Create data file action */
  ChangeDataFileAction = 'CHANGE_DATA_FILE_ACTION',
  /** Create, edit or delete documents */
  ChangeDocument = 'CHANGE_DOCUMENT',
  /** Create, edit or delete documentJob */
  ChangeDocumentJob = 'CHANGE_DOCUMENT_JOB',
  /** Create, edit or delete document types */
  ChangeDocumentType = 'CHANGE_DOCUMENT_TYPE',
  /** Create, edit or delete jobMessage */
  ChangeJobMessage = 'CHANGE_JOB_MESSAGE',
  /** Create, edit or delete list of values */
  ChangeListOfValues = 'CHANGE_LIST_OF_VALUES',
  /** Create, edit or delete metadatas */
  ChangeMetadata = 'CHANGE_METADATA',
  /** Create or edit notes */
  ChangeNote = 'CHANGE_NOTE',
  /** Create or edit OMS resources */
  ChangeOmsResources = 'CHANGE_OMS_RESOURCES',
  /** Create, edit or delete mailJob */
  ChangePostalJob = 'CHANGE_POSTAL_JOB',
  /** Create, edit or delete postal parameter configurations */
  ChangePostalParameterConfiguration = 'CHANGE_POSTAL_PARAMETER_CONFIGURATION',
  /** Create, edit or delete services */
  ChangeService = 'CHANGE_SERVICE',
  /** Create, edit or delete template contents */
  ChangeTemplateContent = 'CHANGE_TEMPLATE_CONTENT',
  /** Create, edit or delete template structures */
  ChangeTemplateStructure = 'CHANGE_TEMPLATE_STRUCTURE',
  /** Create, edit or delete template contents */
  ChangeTemplateVariableConfiguration = 'CHANGE_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Create, edit or renew Api users */
  ChangeTenantApiUser = 'CHANGE_TENANT_API_USER',
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Create, edit or delete third parties */
  ChangeThirdParty = 'CHANGE_THIRD_PARTY',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Complete document */
  CompleteDocument = 'COMPLETE_DOCUMENT',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Get or list activities */
  ReadActivity = 'READ_ACTIVITY',
  /** Get or list contacts */
  ReadContact = 'READ_CONTACT',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
  /** Get or list dashboards */
  ReadDashboard = 'READ_DASHBOARD',
  /** Get or list data file action */
  ReadDataFileAction = 'READ_DATA_FILE_ACTION',
  /** Get or list documents sent to the user */
  ReadDocument = 'READ_DOCUMENT',
  /** Get or list documentJob */
  ReadDocumentJob = 'READ_DOCUMENT_JOB',
  /** Get or list documents sent to the service of the user */
  ReadDocumentOnService = 'READ_DOCUMENT_ON_SERVICE',
  /** Get or list document types */
  ReadDocumentType = 'READ_DOCUMENT_TYPE',
  /** Get or list jobMessage */
  ReadJobMessage = 'READ_JOB_MESSAGE',
  /** Get or list list of values */
  ReadListOfValues = 'READ_LIST_OF_VALUES',
  /** Get or list metadatas */
  ReadMetadata = 'READ_METADATA',
  /** Get or list notes */
  ReadNote = 'READ_NOTE',
  /** Get or list OMS resources */
  ReadOmsResources = 'READ_OMS_RESOURCES',
  /** Get or list mailJob */
  ReadPostalJob = 'READ_POSTAL_JOB',
  /** Get or list postal parameter configurations */
  ReadPostalParameterConfiguration = 'READ_POSTAL_PARAMETER_CONFIGURATION',
  /** Get or list services */
  ReadService = 'READ_SERVICE',
  /** Get or list status actions */
  ReadStatusAction = 'READ_STATUS_ACTION',
  /** Get or list template contents */
  ReadTemplateContent = 'READ_TEMPLATE_CONTENT',
  /** Get or list template structures */
  ReadTemplateStructure = 'READ_TEMPLATE_STRUCTURE',
  /** Get or list template variables configuration */
  ReadTemplateVariableConfiguration = 'READ_TEMPLATE_VARIABLE_CONFIGURATION',
  /** Get or list tenants */
  ReadTenant = 'READ_TENANT',
  /** Get or list Api users */
  ReadTenantApiUser = 'READ_TENANT_API_USER',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Get or list tenant users */
  ReadTenantUser = 'READ_TENANT_USER',
  /** Get or list third parties */
  ReadThirdParty = 'READ_THIRD_PARTY',
  /** Get or list third party types */
  ReadThirdPartyType = 'READ_THIRD_PARTY_TYPE',
  /** RelaunchJobMessage */
  RelaunchJobMessage = 'RELAUNCH_JOB_MESSAGE',
  /** Resend document to chorusRight */
  ResendDocument = 'RESEND_DOCUMENT',
  /** Validate invited user */
  ValidateUser = 'VALIDATE_USER'
}

export type TenantRightValue = {
  __typename?: 'TenantRightValue';
  right?: Maybe<TenantRightType>;
  value: Scalars['Boolean'];
};

export type TenantRightValueInput = {
  right?: InputMaybe<TenantRightType>;
  value: Scalars['Boolean'];
};

export type TenantRightValueTypeConnection = {
  __typename?: 'TenantRightValueTypeConnection';
  edges?: Maybe<Array<Maybe<TenantRightValue>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type TenantUser = {
  __typename?: 'TenantUser';
  civility: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  culture: Scalars['String'];
  documentAccessType: TenantUserDocumentAccessType;
  email: Scalars['String'];
  firstName: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
  services?: Maybe<Array<Maybe<IdName>>>;
  tenantId: Scalars['String'];
  timeZone: Scalars['String'];
  userId: Scalars['String'];
  weeklyReport: Scalars['Boolean'];
};

export type TenantUserBoolFilter = {
  field: TenantUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum TenantUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export enum TenantUserDocumentAccessType {
  Full = 'FULL',
  Restricted = 'RESTRICTED'
}

export type TenantUserInput = {
  civility?: InputMaybe<Scalars['String']>;
  culture?: InputMaybe<Scalars['String']>;
  documentAccessType: TenantUserDocumentAccessType;
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone?: InputMaybe<Scalars['String']>;
  services?: InputMaybe<Array<InputMaybe<IdNameInput>>>;
  timeZone?: InputMaybe<Scalars['String']>;
  weeklyReport: Scalars['Boolean'];
};

export type TenantUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<TenantUserBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<TenantUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<TenantUserStringFilter>>>;
};

export enum TenantUserSortField {
  Civility = 'CIVILITY',
  Culture = 'CULTURE',
  DocumentAccessType = 'DOCUMENT_ACCESS_TYPE',
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  IsEnabled = 'IS_ENABLED',
  LastName = 'LAST_NAME',
  Phone = 'PHONE',
  TimeZone = 'TIME_ZONE',
  UserId = 'USER_ID',
  WeeklyReport = 'WEEKLY_REPORT'
}

export type TenantUserStringFilter = {
  field: TenantUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum TenantUserStringFilterField {
  Email = 'EMAIL',
  FirstName = 'FIRST_NAME',
  LastName = 'LAST_NAME',
  ServiceId = 'SERVICE_ID',
  UserId = 'USER_ID'
}

export type TenantUserTypeConnection = {
  __typename?: 'TenantUserTypeConnection';
  edges?: Maybe<Array<Maybe<TenantUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ThirdParty = {
  __typename?: 'ThirdParty';
  address?: Maybe<PostalAddress>;
  code: Scalars['String'];
  contactCount: Scalars['Int'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  personType: ThirdPartyPersonType;
  tenantId: Scalars['String'];
  thirdPartyTypeIds: Array<Maybe<Scalars['String']>>;
};

export type ThirdPartyBoolFilter = {
  field: ThirdPartyBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ThirdPartyBoolFilterField {
  IsEnabled = 'IS_ENABLED',
  IsMoralPerson = 'IS_MORAL_PERSON'
}

export enum ThirdPartyIdentifierType {
  FromGedFields = 'FROM_GED_FIELDS',
  ThirdpartyId = 'THIRDPARTY_ID'
}

export type ThirdPartyInput = {
  address?: InputMaybe<PostalAddressInput>;
  code: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  personType: ThirdPartyPersonType;
  thirdPartyTypeIds: Array<Scalars['String']>;
};

export enum ThirdPartyPersonType {
  MoralPersonPrivate = 'MORAL_PERSON_PRIVATE',
  MoralPersonPublic = 'MORAL_PERSON_PUBLIC',
  PrivatePerson = 'PRIVATE_PERSON'
}

export type ThirdPartyQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ThirdPartyBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ThirdPartySortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ThirdPartyStringFilter>>>;
};

export type ThirdPartyRecipientInput = {
  contactFunctionCodes?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  thirdPartyIdentifier: Scalars['String'];
  thirdPartyIdentifierType: ThirdPartyIdentifierType;
  updateOptions?: InputMaybe<ThirdPartyUpdateOptionsInput>;
};

export enum ThirdPartySortField {
  Code = 'CODE',
  IsEnabled = 'IS_ENABLED',
  IsMoralPerson = 'IS_MORAL_PERSON',
  Name = 'NAME'
}

export type ThirdPartyStringFilter = {
  field: ThirdPartyStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ThirdPartyStringFilterField {
  Code = 'CODE',
  Name = 'NAME'
}

export type ThirdPartyType = {
  __typename?: 'ThirdPartyType';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: ThirdPartyTypeOwnerType;
};

export type ThirdPartyTypeBoolFilter = {
  field: ThirdPartyTypeBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ThirdPartyTypeBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ThirdPartyTypeConnection = {
  __typename?: 'ThirdPartyTypeConnection';
  edges?: Maybe<Array<Maybe<ThirdParty>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ThirdPartyTypeInput = {
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export enum ThirdPartyTypeOwnerType {
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type ThirdPartyTypeQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ThirdPartyTypeBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ThirdPartyTypeSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ThirdPartyTypeStringFilter>>>;
};

export enum ThirdPartyTypeSortField {
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME'
}

export type ThirdPartyTypeStringFilter = {
  field: ThirdPartyTypeStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ThirdPartyTypeStringFilterField {
  Name = 'NAME',
  OwnerId = 'OWNER_ID'
}

export type ThirdPartyTypeTypeConnection = {
  __typename?: 'ThirdPartyTypeTypeConnection';
  edges?: Maybe<Array<Maybe<ThirdPartyType>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ThirdPartyUpdateOptionsInput = {
  createThirdParty: Scalars['Boolean'];
};

export enum UserProfile {
  Administrator = 'ADMINISTRATOR',
  DomainAdministrator = 'DOMAIN_ADMINISTRATOR',
  EnvironmentAdministrator = 'ENVIRONMENT_ADMINISTRATOR',
  StandardUser = 'STANDARD_USER',
  TenantReceiver = 'TENANT_RECEIVER',
  WebsiteAdministrator = 'WEBSITE_ADMINISTRATOR'
}

export type ValueOfList = {
  __typename?: 'ValueOfList';
  code: Scalars['String'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  listOfValuesId: Scalars['String'];
  name: Scalars['String'];
  ownerId?: Maybe<Scalars['String']>;
  ownerType: ValueOfListOwnerType;
};

export type ValueOfListInput = {
  code: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  listOfValuesId: Scalars['String'];
  name: Scalars['String'];
  ownerId: Scalars['String'];
  ownerType: ValueOfListOwnerType;
};

export enum ValueOfListOwnerType {
  System = 'SYSTEM',
  Tenant = 'TENANT'
}

export type ValueOfListQueryParams = {
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ValueOfListSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ValueOfListStringFilter>>>;
};

export enum ValueOfListSortField {
  Code = 'CODE',
  Name = 'NAME'
}

export type ValueOfListStringFilter = {
  field: ValueOfListStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ValueOfListStringFilterField {
  Code = 'CODE',
  ListOfValuesId = 'LIST_OF_VALUES_ID',
  Name = 'NAME'
}

export type ValueOfListTypeConnection = {
  __typename?: 'ValueOfListTypeConnection';
  edges?: Maybe<Array<Maybe<ValueOfList>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type VoiceJob = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  adhocRecipients?: InputMaybe<Array<InputMaybe<Recipient>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  documents?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  jobType?: InputMaybe<Scalars['String']>;
  parameter?: InputMaybe<VoiceParameter>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  trackingId?: InputMaybe<Scalars['String']>;
};

export type VoiceParameter = {
  acknowledgeKey?: InputMaybe<Scalars['String']>;
  actionMessage?: InputMaybe<FileReferenceBase>;
  repeatKey?: InputMaybe<Scalars['String']>;
  scenarioId?: InputMaybe<Scalars['Int']>;
  sender?: InputMaybe<Scalars['String']>;
  textToSpeechVoiceId?: InputMaybe<Scalars['Int']>;
  textToSpeechVoiceRate?: InputMaybe<Scalars['Int']>;
  transferKey?: InputMaybe<Scalars['String']>;
  transferNumber?: InputMaybe<Scalars['String']>;
};
