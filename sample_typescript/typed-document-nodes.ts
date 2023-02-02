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
  DocumentArchived = 'DOCUMENT_ARCHIVED',
  DocumentCanceled = 'DOCUMENT_CANCELED',
  DocumentRead = 'DOCUMENT_READ',
  DocumentSigned = 'DOCUMENT_SIGNED',
  Error = 'ERROR',
  ExternalProcess = 'EXTERNAL_PROCESS',
  JobCreated = 'JOB_CREATED',
  JobLaunched = 'JOB_LAUNCHED',
  JobProcessing = 'JOB_PROCESSING',
  NotificationSent = 'NOTIFICATION_SENT'
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
  documentTransmissionMode?: InputMaybe<DocumentTransmissionMode>;
  existingDocumentId?: InputMaybe<Scalars['String']>;
  newDocument?: InputMaybe<DocumentInput>;
};

export enum BoolFilterOperator {
  Equal = 'EQUAL',
  NotEqual = 'NOT_EQUAL'
}

export type BusinessSchemaMutation = {
  __typename?: 'BusinessSchemaMutation';
  addApiDomainUser?: Maybe<ApiDomainUser>;
  addApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  addApiTenantUser?: Maybe<ApiTenantUser>;
  addContact?: Maybe<Contact>;
  addContactFunction?: Maybe<ContactFunction>;
  addDashboardRight?: Maybe<DashboardRight>;
  addDocumentJob?: Maybe<DocumentJob>;
  addDocumentProbativeJob?: Maybe<DocumentProbativeJob>;
  addDocumentType?: Maybe<DocumentType>;
  addDocumentTypeMetadata?: Maybe<DocumentType>;
  addDomainUser?: Maybe<DomainUser>;
  addEmailJob?: Maybe<JobResult>;
  addEnvironmentUser?: Maybe<EnvironmentUser>;
  addFaxJob?: Maybe<JobResult>;
  addHostedDocumentFile?: Maybe<FileContent>;
  addHostedListFile?: Maybe<FileContent>;
  addListOfValues?: Maybe<ListOfValues>;
  addMetadata?: Maybe<Metadata>;
  addNote?: Maybe<Note>;
  addPaperMailJob?: Maybe<PaperMailJob>;
  addPowerBiAuthToken?: Maybe<PowerBiAuthToken>;
  addPushJob?: Maybe<JobResult>;
  addService?: Maybe<Service>;
  addSmsJob?: Maybe<JobResult>;
  addTemporaryDocument?: Maybe<TemporaryDocumentContent>;
  addTenantUser?: Maybe<TenantUser>;
  addThirdParty?: Maybe<ThirdParty>;
  addThirdPartyType?: Maybe<ThirdPartyType>;
  addValueOfList?: Maybe<ValueOfList>;
  addVoiceJob?: Maybe<JobResult>;
  deleteContact?: Maybe<Scalars['Void']>;
  deleteContactFunction?: Maybe<Scalars['Void']>;
  deleteDashboardRight?: Maybe<Scalars['Void']>;
  deleteDocumentType?: Maybe<Scalars['Void']>;
  deleteDocumentTypeMetadata?: Maybe<Scalars['Void']>;
  deleteHostedDocumentFile?: Maybe<Scalars['Void']>;
  deleteHostedInboundFile?: Maybe<Scalars['Void']>;
  deleteHostedListFile?: Maybe<Scalars['Void']>;
  deleteHostedReportFile?: Maybe<Scalars['Void']>;
  deleteListOfValues?: Maybe<Scalars['Void']>;
  deleteMetadata?: Maybe<Scalars['Void']>;
  deleteNote?: Maybe<Scalars['Void']>;
  deleteService?: Maybe<Scalars['Void']>;
  deleteTemporaryDocument?: Maybe<Scalars['Void']>;
  deleteThirdParty?: Maybe<Scalars['Void']>;
  deleteThirdPartyType?: Maybe<Scalars['Void']>;
  deleteValueOfList?: Maybe<Scalars['Void']>;
  editApiDomainUser?: Maybe<ApiDomainUser>;
  editApiDomainUserRight?: Maybe<Array<DomainRightValue>>;
  editApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  editApiEnvironmentUserRight?: Maybe<Array<EnvironmentRightValue>>;
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
  editListOfValues?: Maybe<ListOfValues>;
  editMetadata?: Maybe<Metadata>;
  editNote?: Maybe<Note>;
  editService?: Maybe<Service>;
  editTenantUser?: Maybe<TenantUser>;
  editTenantUserRight?: Maybe<Array<TenantRightValue>>;
  editThirdParty?: Maybe<ThirdParty>;
  editThirdPartyType?: Maybe<ThirdPartyType>;
  editValueOfList?: Maybe<ValueOfList>;
  readDocument?: Maybe<Scalars['Void']>;
  renewApiDomainUser?: Maybe<ApiDomainUser>;
  renewApiEnvironmentUser?: Maybe<ApiEnvironmentUser>;
  renewApiTenantUser?: Maybe<ApiTenantUser>;
  resendInviteDomainUser?: Maybe<Scalars['Void']>;
  resendInviteEnvironmentUser?: Maybe<Scalars['Void']>;
  resendInviteTenantUser?: Maybe<Scalars['Void']>;
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


export type BusinessSchemaMutationAddPaperMailJobArgs = {
  item: PaperMailJobInput;
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


export type BusinessSchemaMutationDeleteServiceArgs = {
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


export type BusinessSchemaMutationEditServiceArgs = {
  id: Scalars['String'];
  item: ServiceInput;
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
  jobId: Scalars['String'];
  jobMessageId: Scalars['String'];
  tenantId: Scalars['String'];
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
  apiTenantUserItems?: Maybe<Array<Maybe<ApiTenantUser>>>;
  apiTenantUserList?: Maybe<ApiTenantUserTypeConnection>;
  apiTenantUserRightList?: Maybe<TenantRightValueTypeConnection>;
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
  documentCountStatisticsList?: Maybe<Array<Maybe<DocumentCountStatistics>>>;
  documentItems?: Maybe<Array<Maybe<Document>>>;
  documentJobItems?: Maybe<Array<Maybe<DocumentJob>>>;
  documentJobList?: Maybe<DocumentJobTypeConnection>;
  documentList?: Maybe<DocumentTypeConnection>;
  documentProbativeJobItems?: Maybe<Array<Maybe<DocumentProbativeJob>>>;
  documentProbativeJobList?: Maybe<DocumentProbativeJobTypeConnection>;
  documentSizeStatistics?: Maybe<DocumentSizeStatistics>;
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
  jobItemItems?: Maybe<Array<Maybe<JobItem>>>;
  jobItemList?: Maybe<JobItemTypeConnection>;
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
  processingJobCountStatistics?: Maybe<JobCountStatistics>;
  rightInitialValueList?: Maybe<RightInitialValueTypeConnection>;
  schema?: Maybe<Scalars['String']>;
  serviceItems?: Maybe<Array<Maybe<Service>>>;
  serviceList?: Maybe<ServiceTypeConnection>;
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


export type BusinessSchemaQueryJobItemItemsArgs = {
  idList: Array<InputMaybe<JobItemId>>;
  tenantId?: InputMaybe<Scalars['String']>;
};


export type BusinessSchemaQueryJobItemListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<JobItemQueryParams>;
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

export type ChorusB2GAdhocRecipientInput = {
  name: Scalars['String'];
  service: Scalars['String'];
};

export type ClickedLinkDocument = {
  __typename?: 'ClickedLinkDocument';
  content: Scalars['String'];
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
  documentTransmissionMode: DocumentTransmissionMode;
  email: Scalars['String'];
  firstName: Scalars['String'];
  functionIds: Array<Scalars['String']>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  isFavorite: Scalars['Boolean'];
  isPrincipal: Scalars['Boolean'];
  lastName: Scalars['String'];
  phone: Scalars['String'];
  thirdPartyId?: InputMaybe<Scalars['String']>;
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

export type Document = {
  __typename?: 'Document';
  archiveId: Scalars['String'];
  archiver?: Maybe<ArchiverProvider>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  documentTypeCode: Scalars['String'];
  fileContent?: Maybe<Scalars['String']>;
  fileName: Scalars['String'];
  id: Scalars['String'];
  jobIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  metadata?: Maybe<Array<Maybe<KeyValue>>>;
  signRequired: Scalars['Boolean'];
  status: DocumentStatus;
  tenantId: Scalars['String'];
};

export enum DocumentArrayElementFilterField {
  Metadata = 'METADATA'
}

export type DocumentCountStatistics = {
  __typename?: 'DocumentCountStatistics';
  count: Scalars['Long'];
  documentTypeCode: Scalars['String'];
  month: Scalars['Int'];
  year: Scalars['Int'];
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
  CreationDate = 'CREATION_DATE'
}

export type DocumentDocumentArrayElementFilterFieldArrayElementFilter = {
  field: DocumentArrayElementFilterField;
  filterArrayElementName: Scalars['String'];
  filterValue1: Scalars['String'];
  filterValue2?: InputMaybe<Scalars['String']>;
  operator: ArrayElementFilterOperator;
};

export type DocumentDocumentStatusEnumFilter = {
  field: DocumentStatusFilterField;
  filterValue1: DocumentStatus;
  filterValue2?: InputMaybe<DocumentStatus>;
  operator: NumberFilterOperator;
};

export type DocumentIdOrNewInput = {
  existingDocumentId?: InputMaybe<Scalars['String']>;
  newDocument?: InputMaybe<DocumentInput>;
};

export type DocumentInput = {
  base64?: InputMaybe<Scalars['String']>;
  documentTypeCode: Scalars['String'];
  fileName: Scalars['String'];
  gedFields?: InputMaybe<Array<InputMaybe<GedFieldInput>>>;
  gedXml?: InputMaybe<Scalars['String']>;
  tempFileId?: InputMaybe<Scalars['String']>;
};

export type DocumentJob = {
  __typename?: 'DocumentJob';
  attachmentsId?: Maybe<Array<Maybe<Scalars['String']>>>;
  documentsId?: Maybe<Array<Maybe<Scalars['String']>>>;
  id: Scalars['String'];
  note?: Maybe<Scalars['String']>;
  serviceId?: Maybe<Scalars['String']>;
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
  validationType: DocumentJobValidationType;
};

export type DocumentJobDateFilter = {
  field: DocumentJobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum DocumentJobDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type DocumentJobInput = {
  adhocRecipientsFiles?: InputMaybe<Array<InputMaybe<FileIdOrBase64Input>>>;
  attachments?: InputMaybe<Array<InputMaybe<AttachmentInput>>>;
  chorusB2GAdhocRecipient?: InputMaybe<ChorusB2GAdhocRecipientInput>;
  contactRecipients?: InputMaybe<Array<InputMaybe<ContactRecipientInput>>>;
  document: DocumentIdOrNewInput;
  emailAdhocRecipients?: InputMaybe<Array<InputMaybe<EmailAdhocRecipientInput>>>;
  note?: InputMaybe<Scalars['String']>;
  paperMailAdhocRecipients?: InputMaybe<Array<InputMaybe<PostalAdhocRecipientInput>>>;
  serviceId?: InputMaybe<Scalars['String']>;
  thirdPartyRecipients?: InputMaybe<Array<InputMaybe<ThirdPartyRecipientInput>>>;
  trackingId?: InputMaybe<Scalars['String']>;
  validationType: DocumentJobValidationType;
};

export type DocumentJobJobBaseStatusEnumFilter = {
  field: DocumentJobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type DocumentJobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentJobDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentJobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentJobJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentJobStringFilter>>>;
};

export enum DocumentJobSortField {
  Id = 'ID',
  ServiceId = 'SERVICE_ID',
  TrackingId = 'TRACKING_ID'
}

export enum DocumentJobStatusFilterField {
  Status = 'STATUS'
}

export type DocumentJobStringFilter = {
  field: DocumentJobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentJobStringFilterField {
  ServiceId = 'SERVICE_ID',
  TenantId = 'TENANT_ID',
  TrackingId = 'TRACKING_ID'
}

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
  documentsId?: Maybe<Array<Maybe<Scalars['String']>>>;
  id: Scalars['String'];
  joinedMessage: Scalars['String'];
  note?: Maybe<Scalars['String']>;
  registeredPostalOptions?: Maybe<RegisteredPostalOptions>;
  serviceId?: Maybe<Scalars['String']>;
  subject: Scalars['String'];
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
  validationType: DocumentJobValidationType;
};

export type DocumentProbativeJobDateFilter = {
  field: DocumentProbativeJobDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum DocumentProbativeJobDateFilterField {
  CreationDate = 'CREATION_DATE'
}

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
  field: DocumentProbativeJobStatusFilterField;
  filterValue1: JobBaseStatus;
  filterValue2?: InputMaybe<JobBaseStatus>;
  operator: NumberFilterOperator;
};

export type DocumentProbativeJobQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentProbativeJobSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobJobBaseStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentProbativeJobStringFilter>>>;
};

export enum DocumentProbativeJobSortField {
  Id = 'ID',
  ServiceId = 'SERVICE_ID',
  TrackingId = 'TRACKING_ID'
}

export enum DocumentProbativeJobStatusFilterField {
  Status = 'STATUS'
}

export type DocumentProbativeJobStringFilter = {
  field: DocumentProbativeJobStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DocumentProbativeJobStringFilterField {
  TenantId = 'TENANT_ID'
}

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
  dateFilters?: InputMaybe<Array<InputMaybe<DocumentDateFilter>>>;
  sortArrayElementName?: InputMaybe<Scalars['String']>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DocumentSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<DocumentDocumentStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<DocumentStringFilter>>>;
};

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
  Metadata = 'METADATA'
}

export enum DocumentStatus {
  Archived = 'ARCHIVED',
  Canceled = 'CANCELED',
  Disputed = 'DISPUTED',
  Draft = 'DRAFT',
  EdiNotTranslated = 'EDI_NOT_TRANSLATED',
  EdiProcessed = 'EDI_PROCESSED',
  EdiSubmit = 'EDI_SUBMIT',
  EdiTransmitted = 'EDI_TRANSMITTED',
  Error = 'ERROR',
  Late = 'LATE',
  Paid = 'PAID',
  Read = 'READ',
  Sent = 'SENT',
  Signed = 'SIGNED',
  ToPay = 'TO_PAY'
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
  DocumentTypeCode = 'DOCUMENT_TYPE_CODE',
  FileName = 'FILE_NAME',
  TenantId = 'TENANT_ID'
}

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
  /** Create or edit domains */
  ChangeDomain = 'CHANGE_DOMAIN',
  /** Create or edit domain administrators */
  ChangeDomainUser = 'CHANGE_DOMAIN_USER',
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Synchronize EDC resources */
  SynchronizeEdcResources = 'SYNCHRONIZE_EDC_RESOURCES'
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
  civility: Scalars['String'];
  culture?: InputMaybe<Scalars['String']>;
  domainId: Scalars['String'];
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
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
  ArchiveDocument = 'ARCHIVE_DOCUMENT',
  CancelDocument = 'CANCEL_DOCUMENT',
  CreateJob = 'CREATE_JOB',
  GenerateProof = 'GENERATE_PROOF',
  LaunchJob = 'LAUNCH_JOB',
  NotReadEre = 'NOT_READ_ERE',
  ProcessJob = 'PROCESS_JOB',
  ReadDocument = 'READ_DOCUMENT',
  ReadEreNotification = 'READ_ERE_NOTIFICATION',
  RefuseEre = 'REFUSE_ERE',
  RelaunchEre = 'RELAUNCH_ERE',
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
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create or edit environment administrators */
  ChangeEnvironmentUser = 'CHANGE_ENVIRONMENT_USER',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
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
  civility: Scalars['String'];
  culture?: InputMaybe<Scalars['String']>;
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
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
  errorFunctionName: Scalars['String'];
  errorMessage: Scalars['String'];
  errorStackTrace: Scalars['String'];
  id: Scalars['String'];
  jobId: Scalars['String'];
  resourceId: Scalars['String'];
  resourceType: ErrorQueueMessageResourceType;
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
  value: Scalars['String'];
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

export enum JobBaseStatus {
  AwaitingJobVisa = 'AWAITING_JOB_VISA',
  AwaitingNewThirdPartyVisa = 'AWAITING_NEW_THIRD_PARTY_VISA',
  Canceled = 'CANCELED',
  Complete = 'COMPLETE',
  Created = 'CREATED',
  Error = 'ERROR',
  Processing = 'PROCESSING'
}

export type JobCountStatistics = {
  __typename?: 'JobCountStatistics';
  count: Scalars['Int'];
};

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
  contactId?: Maybe<Scalars['String']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  documentIds: Array<Maybe<Scalars['String']>>;
  emailAddress: Scalars['String'];
  id: Scalars['String'];
  jobId: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  messageType: JobMessageType;
  name?: Maybe<Scalars['String']>;
  recipientName: Scalars['String'];
  status: JobMessageStatus;
  tenantId: Scalars['String'];
  thirdPartyId?: Maybe<Scalars['String']>;
  trackingId: Scalars['String'];
  transmissionStatus: JobMessageTransmissionStatus;
};

export type JobMessageDateFilter = {
  field: JobMessageDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum JobMessageDateFilterField {
  CreationDate = 'CREATION_DATE'
}

export type JobMessageJobMessageStatusEnumFilter = {
  field: JobMessageStatusFilterField;
  filterValue1: JobMessageStatus;
  filterValue2?: InputMaybe<JobMessageStatus>;
  operator: NumberFilterOperator;
};

export type JobMessageJobMessageTransmissionStatusEnumFilter = {
  field: JobMessageTransmissionStatusFilterField;
  filterValue1: JobMessageTransmissionStatus;
  filterValue2?: InputMaybe<JobMessageTransmissionStatus>;
  operator: NumberFilterOperator;
};

export type JobMessageQueryParams = {
  dateFilters?: InputMaybe<Array<InputMaybe<JobMessageDateFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<JobMessageSortField>;
  statusFilters?: InputMaybe<Array<InputMaybe<JobMessageJobMessageStatusEnumFilter>>>;
  stringFilters?: InputMaybe<Array<InputMaybe<JobMessageStringFilter>>>;
  transmissionStatusFilters?: InputMaybe<Array<InputMaybe<JobMessageJobMessageTransmissionStatusEnumFilter>>>;
};

export enum JobMessageSortField {
  Id = 'ID',
  Name = 'NAME',
  TrackingId = 'TRACKING_ID'
}

export enum JobMessageStatus {
  Canceled = 'CANCELED',
  Complete = 'COMPLETE',
  Error = 'ERROR',
  Processing = 'PROCESSING'
}

export enum JobMessageStatusFilterField {
  Status = 'STATUS'
}

export type JobMessageStringFilter = {
  field: JobMessageStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum JobMessageStringFilterField {
  DocumentId = 'DOCUMENT_ID',
  ExternalId = 'EXTERNAL_ID',
  JobId = 'JOB_ID',
  TenantId = 'TENANT_ID',
  TrackingId = 'TRACKING_ID'
}

export enum JobMessageTransmissionStatus {
  Pending = 'PENDING',
  Success = 'SUCCESS',
  UnknownEmailTransmissionError = 'UNKNOWN_EMAIL_TRANSMISSION_ERROR',
  UnknownPostalTransmissionError = 'UNKNOWN_POSTAL_TRANSMISSION_ERROR',
  UnknownWebNotificationTransmissionError = 'UNKNOWN_WEB_NOTIFICATION_TRANSMISSION_ERROR',
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

export type JobResult = {
  __typename?: 'JobResult';
  jobNumber: Scalars['Int'];
};

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
  Equal = 'EQUAL',
  GreaterThan = 'GREATER_THAN',
  GreaterThanOrEqual = 'GREATER_THAN_OR_EQUAL',
  LowerThan = 'LOWER_THAN',
  LowerThanOrEqual = 'LOWER_THAN_OR_EQUAL',
  NotEqual = 'NOT_EQUAL'
}

export type PageInfo = {
  __typename?: 'PageInfo';
  endCursor?: Maybe<Scalars['String']>;
  hasNextPage: Scalars['Boolean'];
};

export type PaperMailJob = {
  __typename?: 'PaperMailJob';
  id: Scalars['String'];
  tenantId: Scalars['String'];
  trackingId: Scalars['String'];
};

export type PaperMailJobInput = {
  adhocRecipientFiles?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  deDuplicate?: InputMaybe<Scalars['Boolean']>;
  documents?: InputMaybe<Array<InputMaybe<FileIdOrNewInputType>>>;
  parameter?: InputMaybe<PostalParameter>;
  postalAdhocRecipients?: InputMaybe<Array<InputMaybe<PostalAdhocRecipientInput>>>;
  scheduledStartTime?: InputMaybe<Scalars['DateTime']>;
  tenantId: Scalars['String'];
  trackingId?: InputMaybe<Scalars['String']>;
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
  city?: InputMaybe<Scalars['String']>;
  country?: InputMaybe<Scalars['String']>;
  name?: InputMaybe<Scalars['String']>;
  postBox?: InputMaybe<Scalars['String']>;
  street?: InputMaybe<Scalars['String']>;
  zipCode?: InputMaybe<Scalars['String']>;
};

export type PostalAdhocRecipientInput = {
  addressLine1: Scalars['String'];
  addressLine2: Scalars['String'];
  city: Scalars['String'];
  country: Scalars['String'];
  name: Scalars['String'];
  postalCode: Scalars['String'];
  printOptions?: InputMaybe<PrintOptionsInput>;
};

export type PostalParameter = {
  envelope?: InputMaybe<EnvelopeType>;
  lreArManagement?: InputMaybe<LreArManagementType>;
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

export type PrintOptionsInput = {
  addAddressPage: Scalars['Boolean'];
  color: Scalars['Boolean'];
  doubleSided: Scalars['Boolean'];
  type: PrintType;
};

export enum PrintType {
  FrIndustriel = 'FR_INDUSTRIEL',
  FrIndustrielPlus_4 = 'FR_INDUSTRIEL_PLUS_4',
  FrLettreVerte = 'FR_LETTRE_VERTE',
  Normal = 'NORMAL'
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
  /** Create, edit or delete activities */
  ChangeActivity = 'CHANGE_ACTIVITY',
  /** Create, edit or renew Api users */
  ChangeApiUser = 'CHANGE_API_USER',
  /** Create or edit configurations */
  ChangeConfiguration = 'CHANGE_CONFIGURATION',
  /** Create, edit or delete contacts */
  ChangeContact = 'CHANGE_CONTACT',
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create, edit or delete dashboards */
  ChangeDashboard = 'CHANGE_DASHBOARD',
  /** Create, edit or delete documents */
  ChangeDocument = 'CHANGE_DOCUMENT',
  /** Create documentJob */
  ChangeDocumentJob = 'CHANGE_DOCUMENT_JOB',
  /** Create, edit or delete document types */
  ChangeDocumentType = 'CHANGE_DOCUMENT_TYPE',
  /** Create or edit domains */
  ChangeDomain = 'CHANGE_DOMAIN',
  /** Create or edit domain administrators */
  ChangeDomainUser = 'CHANGE_DOMAIN_USER',
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
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Create, edit or delete third parties */
  ChangeThirdParty = 'CHANGE_THIRD_PARTY',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Edit environments */
  EditEnvironment = 'EDIT_ENVIRONMENT',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Get or list activities */
  ReadActivity = 'READ_ACTIVITY',
  /** Get or list Api users */
  ReadApiUser = 'READ_API_USER',
  /** Get or list configurations */
  ReadConfiguration = 'READ_CONFIGURATION',
  /** Get or list contacts */
  ReadContact = 'READ_CONTACT',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
  /** Get or list dashboards */
  ReadDashboard = 'READ_DASHBOARD',
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
  /** Get or list domain administrators */
  ReadDomainUser = 'READ_DOMAIN_USER',
  /** Get or list environments */
  ReadEnvironment = 'READ_ENVIRONMENT',
  /** Get or list environment administrators */
  ReadEnvironmentUser = 'READ_ENVIRONMENT_USER',
  /** Get or list documentJobs */
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
  /** Get or list products */
  ReadProduct = 'READ_PRODUCT',
  /** Get or list product installs */
  ReadProductInstall = 'READ_PRODUCT_INSTALL',
  /** List user rights */
  ReadRight = 'READ_RIGHT',
  /** Get or list services */
  ReadService = 'READ_SERVICE',
  /** Get or list template contents */
  ReadTemplateContent = 'READ_TEMPLATE_CONTENT',
  /** Get or list template structures */
  ReadTemplateStructure = 'READ_TEMPLATE_STRUCTURE',
  /** Get or list tenants */
  ReadTenant = 'READ_TENANT',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Get or list tenant users */
  ReadTenantUser = 'READ_TENANT_USER',
  /** Get or list third parties */
  ReadThirdParty = 'READ_THIRD_PARTY',
  /** Get or list third party types */
  ReadThirdPartyType = 'READ_THIRD_PARTY_TYPE',
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
  senderAddress?: InputMaybe<Scalars['String']>;
  senderName?: InputMaybe<Scalars['String']>;
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

export enum StringFilterOperator {
  Contain = 'CONTAIN',
  Defined = 'DEFINED',
  EndWith = 'END_WITH',
  Equal = 'EQUAL',
  EqualOrUndefined = 'EQUAL_OR_UNDEFINED',
  InArray = 'IN_ARRAY',
  NotContain = 'NOT_CONTAIN',
  NotEndWith = 'NOT_END_WITH',
  NotEqual = 'NOT_EQUAL',
  NotStartWith = 'NOT_START_WITH',
  StartWith = 'START_WITH',
  Undefined = 'UNDEFINED'
}

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
  /** Create, edit or delete activities */
  ChangeActivity = 'CHANGE_ACTIVITY',
  /** Create, edit or renew Api users */
  ChangeApiUser = 'CHANGE_API_USER',
  /** Create, edit or delete contacts */
  ChangeContact = 'CHANGE_CONTACT',
  /** Create, edit or delete contact functions */
  ChangeContactFunction = 'CHANGE_CONTACT_FUNCTION',
  /** Create, edit or delete dashboards */
  ChangeDashboard = 'CHANGE_DASHBOARD',
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
  /** Create, edit or delete services */
  ChangeService = 'CHANGE_SERVICE',
  /** Create, edit or delete template contents */
  ChangeTemplateContent = 'CHANGE_TEMPLATE_CONTENT',
  /** Create, edit or delete template structures */
  ChangeTemplateStructure = 'CHANGE_TEMPLATE_STRUCTURE',
  /** Create or edit tenant internal info */
  ChangeTenantEdcOmsInfo = 'CHANGE_TENANT_EDC_OMS_INFO',
  /** Create or edit tenant users */
  ChangeTenantUser = 'CHANGE_TENANT_USER',
  /** Create, edit or delete third parties */
  ChangeThirdParty = 'CHANGE_THIRD_PARTY',
  /** Create, edit or delete third party types */
  ChangeThirdPartyType = 'CHANGE_THIRD_PARTY_TYPE',
  /** Edit tenants */
  EditTenant = 'EDIT_TENANT',
  /** Grant internal user rights */
  GrantInternalRight = 'GRANT_INTERNAL_RIGHT',
  /** Grant user rights */
  GrantRight = 'GRANT_RIGHT',
  /** Get or list activities */
  ReadActivity = 'READ_ACTIVITY',
  /** Get or list Api users */
  ReadApiUser = 'READ_API_USER',
  /** Get or list contacts */
  ReadContact = 'READ_CONTACT',
  /** Get or list contact functions */
  ReadContactFunction = 'READ_CONTACT_FUNCTION',
  /** Get or list dashboards */
  ReadDashboard = 'READ_DASHBOARD',
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
  /** Get or list template contents */
  ReadTemplateContent = 'READ_TEMPLATE_CONTENT',
  /** Get or list template structures */
  ReadTemplateStructure = 'READ_TEMPLATE_STRUCTURE',
  /** Get or list tenants */
  ReadTenant = 'READ_TENANT',
  /** Get or list tenants with internal info */
  ReadTenantEdcOmsInfo = 'READ_TENANT_EDC_OMS_INFO',
  /** Get or list third parties */
  ReadThirdParty = 'READ_THIRD_PARTY',
  /** Get or list third party types */
  ReadThirdPartyType = 'READ_THIRD_PARTY_TYPE'
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
  civility: Scalars['String'];
  culture?: InputMaybe<Scalars['String']>;
  documentAccessType: TenantUserDocumentAccessType;
  email: Scalars['String'];
  firstName: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  lastName: Scalars['String'];
  phone: Scalars['String'];
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
  code?: Maybe<Scalars['String']>;
  contactCount: Scalars['Int'];
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  isMoralPerson: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name?: Maybe<Scalars['String']>;
  tenantId: Scalars['String'];
  thirdPartyTypeIds?: Maybe<Array<Maybe<Scalars['String']>>>;
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
  isMoralPerson: Scalars['Boolean'];
  name: Scalars['String'];
  thirdPartyTypeIds: Array<Scalars['String']>;
};

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
