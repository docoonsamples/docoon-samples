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
  /**
   * The `DateTime` scalar type represents a date and time. `DateTime` expects
   * timestamps to be formatted in accordance with the
   * [ISO-8601](https://en.wikipedia.org/wiki/ISO_8601) standard.
   */
  DateTime: any;
};

export enum AccountBillingParameterBillingType {
  None = 'NONE',
  Postpaid = 'POSTPAID',
  Prepaid = 'PREPAID'
}

export enum AccountBillingParameterPricingModelType {
  Duration = 'DURATION',
  Page = 'PAGE'
}

export type ApiUser = {
  __typename?: 'ApiUser';
  authorizedIPs?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  keyPreview: Scalars['String'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  role: Role;
};

export type ApiUserBoolFilter = {
  field: ApiUserBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ApiUserBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ApiUserDateFilter = {
  field: ApiUserDateFilterField;
  filterValue1?: InputMaybe<Scalars['DateTime']>;
  filterValue2?: InputMaybe<Scalars['DateTime']>;
  operator: NumberFilterOperator;
};

export enum ApiUserDateFilterField {
  CreationDate = 'CREATION_DATE',
  LastConnectionDate = 'LAST_CONNECTION_DATE'
}

export type ApiUserInput = {
  authorizedIPs?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  role?: InputMaybe<RoleInput>;
};

export enum ApiUserProfileFilterField {
  Profile = 'PROFILE'
}

export type ApiUserQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ApiUserBoolFilter>>>;
  dateFilters?: InputMaybe<Array<InputMaybe<ApiUserDateFilter>>>;
  profileFilters?: InputMaybe<Array<InputMaybe<ApiUserUserProfileEnumFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ApiUserSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ApiUserStringFilter>>>;
};

export enum ApiUserSortField {
  CreationDate = 'CREATION_DATE',
  CreationUserLabel = 'CREATION_USER_LABEL',
  DomainId = 'DOMAIN_ID',
  EnvironmentId = 'ENVIRONMENT_ID',
  IsEnabled = 'IS_ENABLED',
  LastConnectionDate = 'LAST_CONNECTION_DATE',
  Name = 'NAME',
  TenantId = 'TENANT_ID'
}

export type ApiUserStringFilter = {
  field: ApiUserStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ApiUserStringFilterField {
  CreationUserId = 'CREATION_USER_ID',
  CreationUserLabel = 'CREATION_USER_LABEL',
  DomainId = 'DOMAIN_ID',
  EnvironmentId = 'ENVIRONMENT_ID',
  Name = 'NAME',
  TenantId = 'TENANT_ID'
}

export type ApiUserTypeConnection = {
  __typename?: 'ApiUserTypeConnection';
  edges?: Maybe<Array<Maybe<ApiUser>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ApiUserUserProfileEnumFilter = {
  field: ApiUserProfileFilterField;
  filterValue1: UserProfile;
  filterValue2?: InputMaybe<UserProfile>;
  operator: NumberFilterOperator;
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

export type ChorusB2GConfig = {
  __typename?: 'ChorusB2GConfig';
  login?: Maybe<Scalars['String']>;
  password?: Maybe<Scalars['String']>;
  technicalAccount?: Maybe<Scalars['String']>;
};

export type ChorusB2GConfigInput = {
  login?: InputMaybe<Scalars['String']>;
  password?: InputMaybe<Scalars['String']>;
  technicalAccount?: InputMaybe<Scalars['String']>;
};

export type CommonSchemaMutation = {
  __typename?: 'CommonSchemaMutation';
  addApiUser?: Maybe<ApiUser>;
  addDomain?: Maybe<Domain>;
  addEnvironment?: Maybe<Environment>;
  addProduct?: Maybe<Product>;
  addProductInstall?: Maybe<ProductInstall>;
  addTenant?: Maybe<Tenant>;
  editApiUser?: Maybe<ApiUser>;
  editDomain?: Maybe<Domain>;
  editEnvironment?: Maybe<Environment>;
  editProduct?: Maybe<Product>;
  editProductInstall?: Maybe<ProductInstall>;
  editTenant?: Maybe<Tenant>;
  renewApiKey?: Maybe<ApiUser>;
};


export type CommonSchemaMutationAddApiUserArgs = {
  item: ApiUserInput;
};


export type CommonSchemaMutationAddDomainArgs = {
  item: DomainInput;
};


export type CommonSchemaMutationAddEnvironmentArgs = {
  item: EnvironmentInput;
};


export type CommonSchemaMutationAddProductArgs = {
  item: ProductInput;
};


export type CommonSchemaMutationAddProductInstallArgs = {
  item: ProductInstallInput;
};


export type CommonSchemaMutationAddTenantArgs = {
  domainId?: InputMaybe<Scalars['String']>;
  item: TenantInput;
};


export type CommonSchemaMutationEditApiUserArgs = {
  id: Scalars['String'];
  item: ApiUserInput;
};


export type CommonSchemaMutationEditDomainArgs = {
  id: Scalars['String'];
  item: DomainInput;
};


export type CommonSchemaMutationEditEnvironmentArgs = {
  id: Scalars['String'];
  item: EnvironmentInput;
};


export type CommonSchemaMutationEditProductArgs = {
  id: Scalars['String'];
  item: ProductInput;
};


export type CommonSchemaMutationEditProductInstallArgs = {
  id: Scalars['String'];
  item: ProductInstallInput;
};


export type CommonSchemaMutationEditTenantArgs = {
  domainId?: InputMaybe<Scalars['String']>;
  id: Scalars['String'];
  item: TenantInput;
};


export type CommonSchemaMutationRenewApiKeyArgs = {
  id: Scalars['String'];
};

export type CommonSchemaQuery = {
  __typename?: 'CommonSchemaQuery';
  apiUserItems?: Maybe<Array<Maybe<ApiUser>>>;
  apiUserList?: Maybe<ApiUserTypeConnection>;
  configurationItems?: Maybe<Array<Maybe<Scalars['String']>>>;
  domainItems?: Maybe<Array<Maybe<Domain>>>;
  domainList?: Maybe<DomainTypeConnection>;
  environmentItems?: Maybe<Array<Maybe<Environment>>>;
  environmentList?: Maybe<EnvironmentTypeConnection>;
  omsAccountInfoItems?: Maybe<Array<Maybe<OmsAccountData>>>;
  omsAccountInfoList?: Maybe<OmsAccountInfoTypeConnection>;
  productInstallItems?: Maybe<Array<Maybe<ProductInstall>>>;
  productInstallList?: Maybe<ProductInstallTypeConnection>;
  productItems?: Maybe<Array<Maybe<Product>>>;
  productList?: Maybe<ProductTypeConnection>;
  schema?: Maybe<Scalars['String']>;
  tenantItems?: Maybe<Array<Maybe<Tenant>>>;
  tenantList?: Maybe<TenantTypeConnection>;
  test?: Maybe<Scalars['String']>;
  userItems?: Maybe<Array<Maybe<User>>>;
};


export type CommonSchemaQueryApiUserItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryApiUserListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ApiUserQueryParams>;
};


export type CommonSchemaQueryConfigurationItemsArgs = {
  environmentId?: InputMaybe<Scalars['String']>;
  nameList: Array<Scalars['String']>;
};


export type CommonSchemaQueryDomainItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryDomainListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<DomainQueryParams>;
};


export type CommonSchemaQueryEnvironmentItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryEnvironmentListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<EnvironmentQueryParams>;
};


export type CommonSchemaQueryOmsAccountInfoItemsArgs = {
  idList: Array<Scalars['Int']>;
};


export type CommonSchemaQueryOmsAccountInfoListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<OmsAccountInfoQueryParams>;
};


export type CommonSchemaQueryProductInstallItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryProductInstallListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ProductInstallQueryParams>;
};


export type CommonSchemaQueryProductItemsArgs = {
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryProductListArgs = {
  after?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<ProductQueryParams>;
};


export type CommonSchemaQueryTenantItemsArgs = {
  domainId?: InputMaybe<Scalars['String']>;
  idList: Array<Scalars['String']>;
};


export type CommonSchemaQueryTenantListArgs = {
  after?: InputMaybe<Scalars['String']>;
  domainId?: InputMaybe<Scalars['String']>;
  params?: InputMaybe<TenantQueryParams>;
};


export type CommonSchemaQueryUserItemsArgs = {
  idList: Array<Scalars['String']>;
};

export type Domain = {
  __typename?: 'Domain';
  address?: Maybe<PostalAddress>;
  ancestorDomains?: Maybe<Array<Maybe<IdName>>>;
  authorizedProductIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  email?: Maybe<Scalars['String']>;
  environmentId: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  isSubDomainAllowed: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  parentDomainId?: Maybe<Scalars['String']>;
  parentDomainName?: Maybe<Scalars['String']>;
  phone?: Maybe<Scalars['String']>;
};

export type DomainBoolFilter = {
  field: DomainBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum DomainBoolFilterField {
  IsEnabled = 'IS_ENABLED',
  IsSubDomainAllowed = 'IS_SUB_DOMAIN_ALLOWED'
}

export type DomainInput = {
  address?: InputMaybe<PostalAddressInput>;
  authorizedProductIds?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  email?: InputMaybe<Scalars['String']>;
  environmentId: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  isSubDomainAllowed?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  parentDomainId?: InputMaybe<Scalars['String']>;
  phone?: InputMaybe<Scalars['String']>;
};

export type DomainQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<DomainBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<DomainSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<DomainStringFilter>>>;
};

export enum DomainSortField {
  Email = 'EMAIL',
  EnvironmentId = 'ENVIRONMENT_ID',
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME',
  ParentDomainId = 'PARENT_DOMAIN_ID',
  ParentDomainName = 'PARENT_DOMAIN_NAME',
  Phone = 'PHONE'
}

export type DomainStringFilter = {
  field: DomainStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum DomainStringFilterField {
  AddressAddressLine_1 = 'ADDRESS_ADDRESS_LINE_1',
  AddressAddressLine_2 = 'ADDRESS_ADDRESS_LINE_2',
  AddressCity = 'ADDRESS_CITY',
  AddressCountry = 'ADDRESS_COUNTRY',
  AddressPostalCode = 'ADDRESS_POSTAL_CODE',
  AddressState = 'ADDRESS_STATE',
  AncestorDomainId = 'ANCESTOR_DOMAIN_ID',
  AncestorDomainName = 'ANCESTOR_DOMAIN_NAME',
  Email = 'EMAIL',
  EnvironmentId = 'ENVIRONMENT_ID',
  Name = 'NAME',
  ParentDomainId = 'PARENT_DOMAIN_ID',
  ParentDomainName = 'PARENT_DOMAIN_NAME',
  Phone = 'PHONE'
}

export type DomainTypeConnection = {
  __typename?: 'DomainTypeConnection';
  edges?: Maybe<Array<Maybe<Domain>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type EdcUserAccount = {
  __typename?: 'EdcUserAccount';
  accountCodeDest: Scalars['String'];
  accountId: Scalars['Int'];
  accountIdDest: Scalars['Int'];
  gedSchema: Scalars['String'];
  login?: Maybe<Scalars['String']>;
  loginDest?: Maybe<Scalars['String']>;
};

export type EdcUserAccountInput = {
  accountCodeDest: Scalars['String'];
  accountId: Scalars['Int'];
  accountIdDest: Scalars['Int'];
  gedSchema: Scalars['String'];
};

export type EmailConfig = {
  __typename?: 'EmailConfig';
  replyAddress?: Maybe<Scalars['String']>;
  senderAddress?: Maybe<Scalars['String']>;
  senderName?: Maybe<Scalars['String']>;
};

export type EmailConfigInput = {
  replyAddress?: InputMaybe<Scalars['String']>;
  senderAddress?: InputMaybe<Scalars['String']>;
  senderName?: InputMaybe<Scalars['String']>;
};

export type Environment = {
  __typename?: 'Environment';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
};

export type EnvironmentBoolFilter = {
  field: EnvironmentBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum EnvironmentBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type EnvironmentInput = {
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
};

export type EnvironmentQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<EnvironmentBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<EnvironmentSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<EnvironmentStringFilter>>>;
};

export enum EnvironmentSortField {
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME'
}

export type EnvironmentStringFilter = {
  field: EnvironmentStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum EnvironmentStringFilterField {
  Name = 'NAME'
}

export type EnvironmentTypeConnection = {
  __typename?: 'EnvironmentTypeConnection';
  edges?: Maybe<Array<Maybe<Environment>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type IdName = {
  __typename?: 'IdName';
  id: Scalars['String'];
  name?: Maybe<Scalars['String']>;
};

export enum Media {
  Email = 'EMAIL',
  Fax = 'FAX',
  FaxEmail = 'FAX_EMAIL',
  Postal = 'POSTAL',
  PushNotification = 'PUSH_NOTIFICATION',
  Sms = 'SMS',
  Voice = 'VOICE'
}

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

export type OmsAccount = {
  __typename?: 'OmsAccount';
  billingInfo?: Maybe<OmsAccountBillingInfo>;
  billingParameter?: Maybe<OmsAccountBillingParameter>;
  info?: Maybe<OmsAccountInfo>;
};

export type OmsAccountBillingInfo = {
  __typename?: 'OmsAccountBillingInfo';
  attention: Scalars['String'];
  city: Scalars['String'];
  companyName: Scalars['String'];
  customerNumber: Scalars['Int'];
  email: Scalars['String'];
  fax?: Maybe<Scalars['String']>;
  phone?: Maybe<Scalars['String']>;
  state: Scalars['String'];
  street1: Scalars['String'];
  street2?: Maybe<Scalars['String']>;
  zip: Scalars['String'];
};

export type OmsAccountBillingParameter = {
  __typename?: 'OmsAccountBillingParameter';
  billingType?: Maybe<AccountBillingParameterBillingType>;
  customerNumber: Scalars['Int'];
  idClientCrm: Scalars['Int'];
  overchargingDuration?: Maybe<Scalars['Boolean']>;
  overchargingFineMode?: Maybe<Scalars['Boolean']>;
  overchargingPagesOfNotCompletelySentDoc?: Maybe<Scalars['Boolean']>;
  overchargingUnsentPage?: Maybe<Scalars['Boolean']>;
  pricingModel?: Maybe<AccountBillingParameterPricingModelType>;
  quota?: Maybe<Scalars['Boolean']>;
};

export type OmsAccountData = {
  __typename?: 'OmsAccountData';
  mediaList: Array<Media>;
  omsAccount?: Maybe<OmsAccount>;
};

export type OmsAccountInfo = {
  __typename?: 'OmsAccountInfo';
  accountType: Scalars['Int'];
  billingGroup: Scalars['Int'];
  city: Scalars['String'];
  companyName: Scalars['String'];
  customerNumber: Scalars['Int'];
  fax: Scalars['String'];
  isBillingGroup: Scalars['Boolean'];
  phone: Scalars['String'];
  sla: Scalars['Int'];
  state: Scalars['String'];
  zip: Scalars['String'];
};

export type OmsAccountInfoIntFilter = {
  field: OmsAccountInfoIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum OmsAccountInfoIntFilterField {
  BillingGroup = 'BILLING_GROUP'
}

export type OmsAccountInfoQueryParams = {
  intFilters?: InputMaybe<Array<InputMaybe<OmsAccountInfoIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<OmsAccountInfoSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<OmsAccountInfoStringFilter>>>;
};

export enum OmsAccountInfoSortField {
  BillingGroup = 'BILLING_GROUP',
  City = 'CITY',
  CompanyName = 'COMPANY_NAME',
  Country = 'COUNTRY',
  CustomerNumber = 'CUSTOMER_NUMBER',
  Zip = 'ZIP'
}

export type OmsAccountInfoStringFilter = {
  field: OmsAccountInfoStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum OmsAccountInfoStringFilterField {
  CompanyName = 'COMPANY_NAME',
  CustomerNumber = 'CUSTOMER_NUMBER'
}

export type OmsAccountInfoTypeConnection = {
  __typename?: 'OmsAccountInfoTypeConnection';
  edges?: Maybe<Array<Maybe<OmsAccountInfo>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type OmsUserAccount = {
  __typename?: 'OmsUserAccount';
  customerNumber: Scalars['Int'];
  login: Scalars['String'];
};

export type OmsUserAccountInput = {
  customerNumber: Scalars['Int'];
};

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

export type Product = {
  __typename?: 'Product';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  order: Scalars['Int'];
};

export type ProductAccess = {
  __typename?: 'ProductAccess';
  order: Scalars['Int'];
  productId: Scalars['String'];
  productInstallId: Scalars['String'];
  productName: Scalars['String'];
  url: Scalars['String'];
};

export type ProductAccessInput = {
  productInstallId: Scalars['String'];
};

export type ProductBoolFilter = {
  field: ProductBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ProductBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ProductInput = {
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  order: Scalars['Int'];
};

export type ProductInstall = {
  __typename?: 'ProductInstall';
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  environmentId: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  productId: Scalars['String'];
  url: Scalars['String'];
};

export type ProductInstallBoolFilter = {
  field: ProductInstallBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum ProductInstallBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type ProductInstallInput = {
  environmentId: Scalars['String'];
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  productId: Scalars['String'];
  url: Scalars['String'];
};

export type ProductInstallQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ProductInstallBoolFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ProductInstallSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ProductInstallStringFilter>>>;
};

export enum ProductInstallSortField {
  EnvironmentId = 'ENVIRONMENT_ID',
  IsEnabled = 'IS_ENABLED',
  ProductId = 'PRODUCT_ID',
  Url = 'URL'
}

export type ProductInstallStringFilter = {
  field: ProductInstallStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ProductInstallStringFilterField {
  EnvironmentId = 'ENVIRONMENT_ID',
  ProductId = 'PRODUCT_ID',
  Url = 'URL'
}

export type ProductInstallTypeConnection = {
  __typename?: 'ProductInstallTypeConnection';
  edges?: Maybe<Array<Maybe<ProductInstall>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type ProductIntFilter = {
  field: ProductIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum ProductIntFilterField {
  Order = 'ORDER'
}

export type ProductQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<ProductBoolFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<ProductIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<ProductSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<ProductStringFilter>>>;
};

export enum ProductSortField {
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME',
  Order = 'ORDER'
}

export type ProductStringFilter = {
  field: ProductStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum ProductStringFilterField {
  Name = 'NAME'
}

export type ProductTypeConnection = {
  __typename?: 'ProductTypeConnection';
  edges?: Maybe<Array<Maybe<Product>>>;
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
  /** Synchronize EDC resources */
  SynchronizeEdcResources = 'SYNCHRONIZE_EDC_RESOURCES',
  /** Validate invited user */
  ValidateUser = 'VALIDATE_USER'
}

export type RightValue = {
  __typename?: 'RightValue';
  right: RightType;
  value: Scalars['Boolean'];
};

export type RightValueInput = {
  right: RightType;
  value: Scalars['Boolean'];
};

export type Role = {
  __typename?: 'Role';
  domainId?: Maybe<Scalars['String']>;
  domainName?: Maybe<Scalars['String']>;
  environmentId?: Maybe<Scalars['String']>;
  environmentName?: Maybe<Scalars['String']>;
  lastConnectionDate?: Maybe<Scalars['DateTime']>;
  productAccesses?: Maybe<Array<Maybe<ProductAccess>>>;
  profile: UserProfile;
  rights?: Maybe<Array<Maybe<RightValue>>>;
  tenantId?: Maybe<Scalars['String']>;
  tenantName?: Maybe<Scalars['String']>;
};

export type RoleInput = {
  domainId?: InputMaybe<Scalars['String']>;
  environmentId?: InputMaybe<Scalars['String']>;
  productAccesses?: InputMaybe<Array<InputMaybe<ProductAccessInput>>>;
  profile: UserProfile;
  rights?: InputMaybe<Array<InputMaybe<RightValueInput>>>;
  tenantId?: InputMaybe<Scalars['String']>;
};

export enum SortDirection {
  Ascending = 'ASCENDING',
  Descending = 'DESCENDING'
}

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

export type Tenant = {
  __typename?: 'Tenant';
  address?: Maybe<PostalAddress>;
  authorizedProductIds?: Maybe<Array<Maybe<Scalars['String']>>>;
  chorusB2GConfig?: Maybe<ChorusB2GConfig>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  domainId: Scalars['String'];
  edcServiceAccount?: Maybe<EdcUserAccount>;
  email?: Maybe<Scalars['String']>;
  emailConfig?: Maybe<EmailConfig>;
  environmentId: Scalars['String'];
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  name: Scalars['String'];
  omsServiceAccount?: Maybe<OmsUserAccount>;
  phone?: Maybe<Scalars['String']>;
};

export type TenantBoolFilter = {
  field: TenantBoolFilterField;
  filterValue1: Scalars['Boolean'];
  operator: BoolFilterOperator;
};

export enum TenantBoolFilterField {
  IsEnabled = 'IS_ENABLED'
}

export type TenantInput = {
  address?: InputMaybe<PostalAddressInput>;
  authorizedProductIds?: InputMaybe<Array<InputMaybe<Scalars['String']>>>;
  chorusB2GConfig?: InputMaybe<ChorusB2GConfigInput>;
  edcServiceAccount?: InputMaybe<EdcUserAccountInput>;
  email?: InputMaybe<Scalars['String']>;
  emailConfig?: InputMaybe<EmailConfigInput>;
  id?: InputMaybe<Scalars['String']>;
  isEnabled?: InputMaybe<Scalars['Boolean']>;
  name: Scalars['String'];
  omsServiceAccount?: InputMaybe<OmsUserAccountInput>;
  phone?: InputMaybe<Scalars['String']>;
};

export type TenantIntFilter = {
  field: TenantIntFilterField;
  filterValue1: Scalars['Int'];
  filterValue2?: InputMaybe<Scalars['Int']>;
  operator: NumberFilterOperator;
};

export enum TenantIntFilterField {
  OmsServiceAccountCustomerNumber = 'OMS_SERVICE_ACCOUNT_CUSTOMER_NUMBER'
}

export type TenantQueryParams = {
  boolFilters?: InputMaybe<Array<InputMaybe<TenantBoolFilter>>>;
  intFilters?: InputMaybe<Array<InputMaybe<TenantIntFilter>>>;
  sortDirection?: InputMaybe<SortDirection>;
  sortField?: InputMaybe<TenantSortField>;
  stringFilters?: InputMaybe<Array<InputMaybe<TenantStringFilter>>>;
};

export enum TenantSortField {
  DomainId = 'DOMAIN_ID',
  EdcServiceAccountGedSchema = 'EDC_SERVICE_ACCOUNT_GED_SCHEMA',
  Email = 'EMAIL',
  EnvironmentId = 'ENVIRONMENT_ID',
  IsEnabled = 'IS_ENABLED',
  Name = 'NAME',
  OmsServiceAccountCustomerNumber = 'OMS_SERVICE_ACCOUNT_CUSTOMER_NUMBER',
  Phone = 'PHONE'
}

export type TenantStringFilter = {
  field: TenantStringFilterField;
  filterValue1: Scalars['String'];
  operator: StringFilterOperator;
};

export enum TenantStringFilterField {
  AddressAddressLine_1 = 'ADDRESS_ADDRESS_LINE_1',
  AddressAddressLine_2 = 'ADDRESS_ADDRESS_LINE_2',
  AddressCity = 'ADDRESS_CITY',
  AddressCountry = 'ADDRESS_COUNTRY',
  AddressPostalCode = 'ADDRESS_POSTAL_CODE',
  AddressState = 'ADDRESS_STATE',
  DomainId = 'DOMAIN_ID',
  EdcServiceAccountGedSchema = 'EDC_SERVICE_ACCOUNT_GED_SCHEMA',
  Email = 'EMAIL',
  EnvironmentId = 'ENVIRONMENT_ID',
  Name = 'NAME',
  Phone = 'PHONE'
}

export type TenantTypeConnection = {
  __typename?: 'TenantTypeConnection';
  edges?: Maybe<Array<Maybe<Tenant>>>;
  pageInfo?: Maybe<PageInfo>;
};

export type User = {
  __typename?: 'User';
  azureId?: Maybe<Scalars['String']>;
  creationDate?: Maybe<Scalars['DateTime']>;
  creationUserId?: Maybe<Scalars['String']>;
  creationUserLabel?: Maybe<Scalars['String']>;
  email?: Maybe<Scalars['String']>;
  id: Scalars['String'];
  isEnabled: Scalars['Boolean'];
  isInvited: Scalars['Boolean'];
  lastModificationDate?: Maybe<Scalars['DateTime']>;
  lastModificationUserId?: Maybe<Scalars['String']>;
  lastModificationUserLabel?: Maybe<Scalars['String']>;
  roles?: Maybe<Array<Maybe<Role>>>;
};

export enum UserProfile {
  Administrator = 'ADMINISTRATOR',
  DomainAdministrator = 'DOMAIN_ADMINISTRATOR',
  EnvironmentAdministrator = 'ENVIRONMENT_ADMINISTRATOR',
  StandardUser = 'STANDARD_USER',
  TenantReceiver = 'TENANT_RECEIVER',
  WebsiteAdministrator = 'WEBSITE_ADMINISTRATOR'
}
