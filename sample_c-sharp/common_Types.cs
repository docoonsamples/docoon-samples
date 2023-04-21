using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Newtonsoft.Json;

namespace GraphQLCodeGen {
  public class Types {
    public enum AccountBillingParameterBillingType {
      NONE,
      POSTPAID,
      PREPAID
    }
    
    public enum AccountBillingParameterPricingModelType {
      DURATION,
      PAGE
    }
    
    
    #region ApiUser
    public class ApiUser {
      #region members
      [JsonProperty("authorizedIPs")]
      public List<string> authorizedIPs { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("keyPreview")]
      public string keyPreview { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("role")]
      public Role role { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiUserBoolFilter
    public class ApiUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiUserBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ApiUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ApiUserDateFilter
    public class ApiUserDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiUserDateFilterField field { get; set; }
    
      public any filterValue1 { get; set; }
    
      public any filterValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public NumberFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ApiUserDateFilterField {
      CREATION_DATE,
      LAST_CONNECTION_DATE
    }
    
    
    #region ApiUserInput
    public class ApiUserInput {
      #region members
      public List<string> authorizedIPs { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public RoleInput role { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ApiUserProfileFilterField {
      PROFILE
    }
    
    
    #region ApiUserQueryParams
    public class ApiUserQueryParams {
      #region members
      public List<ApiUserBoolFilter> boolFilters { get; set; }
    
      public List<ApiUserDateFilter> dateFilters { get; set; }
    
      public List<ApiUserUserProfileEnumFilter> profileFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ApiUserSortField? sortField { get; set; }
    
      public List<ApiUserStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ApiUserSortField {
      CREATION_DATE,
      CREATION_USER_LABEL,
      DOMAIN_ID,
      ENVIRONMENT_ID,
      IS_ENABLED,
      LAST_CONNECTION_DATE,
      NAME,
      TENANT_ID
    }
    
    
    #region ApiUserStringFilter
    public class ApiUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiUserStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ApiUserStringFilterField {
      CREATION_USER_ID,
      CREATION_USER_LABEL,
      DOMAIN_ID,
      ENVIRONMENT_ID,
      NAME,
      TENANT_ID
    }
    
    
    #region ApiUserTypeConnection
    public class ApiUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ApiUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiUserUserProfileEnumFilter
    public class ApiUserUserProfileEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiUserProfileFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public UserProfile filterValue1 { get; set; }
    
      public UserProfile? filterValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public NumberFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum BoolFilterOperator {
      DEFINED,
      EQUAL,
      EQUAL_OR_UNDEFINED,
      IS_NOT_NULL,
      IS_NULL,
      NOT_EQUAL,
      UNDEFINED
    }
    
    
    #region ChorusB2GConfig
    public class ChorusB2GConfig {
      #region members
      [JsonProperty("isTestMode")]
      public bool isTestMode { get; set; }
    
      [JsonProperty("login")]
      public string login { get; set; }
    
      [JsonProperty("password")]
      public string password { get; set; }
    
      [JsonProperty("providerId")]
      public string providerId { get; set; }
    
      [JsonProperty("recalculate")]
      public bool recalculate { get; set; }
    
      [JsonProperty("serverType")]
      public ChorusServerType serverType { get; set; }
      #endregion
    }
    #endregion
    
    #region ChorusB2GConfigInput
    public class ChorusB2GConfigInput {
      #region members
      [Required]
      [JsonRequired]
      public bool isTestMode { get; set; }
    
      [Required]
      [JsonRequired]
      public string login { get; set; }
    
      [Required]
      [JsonRequired]
      public string password { get; set; }
    
      [Required]
      [JsonRequired]
      public string providerId { get; set; }
    
      [Required]
      [JsonRequired]
      public bool recalculate { get; set; }
    
      [Required]
      [JsonRequired]
      public ChorusServerType serverType { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ChorusServerType {
      PROD,
      QUALIF
    }
    
    
    #region CommonSchemaMutation
    public class CommonSchemaMutation {
      #region members
      [JsonProperty("addApiUser")]
      public ApiUser addApiUser { get; set; }
    
      [JsonProperty("addDomain")]
      public Domain addDomain { get; set; }
    
      [JsonProperty("addEnvironment")]
      public Environment addEnvironment { get; set; }
    
      [JsonProperty("addProduct")]
      public Product addProduct { get; set; }
    
      [JsonProperty("addProductInstall")]
      public ProductInstall addProductInstall { get; set; }
    
      [JsonProperty("addTenant")]
      public Tenant addTenant { get; set; }
    
      [JsonProperty("editApiUser")]
      public ApiUser editApiUser { get; set; }
    
      [JsonProperty("editDomain")]
      public Domain editDomain { get; set; }
    
      [JsonProperty("editEnvironment")]
      public Environment editEnvironment { get; set; }
    
      [JsonProperty("editProduct")]
      public Product editProduct { get; set; }
    
      [JsonProperty("editProductInstall")]
      public ProductInstall editProductInstall { get; set; }
    
      [JsonProperty("editTenant")]
      public Tenant editTenant { get; set; }
    
      [JsonProperty("renewApiKey")]
      public ApiUser renewApiKey { get; set; }
      #endregion
    }
    #endregion
    
    #region CommonSchemaQuery
    public class CommonSchemaQuery {
      #region members
      [JsonProperty("apiUserItems")]
      public List<ApiUser> apiUserItems { get; set; }
    
      [JsonProperty("apiUserList")]
      public ApiUserTypeConnection apiUserList { get; set; }
    
      [JsonProperty("configurationItems")]
      public List<string> configurationItems { get; set; }
    
      [JsonProperty("domainItems")]
      public List<Domain> domainItems { get; set; }
    
      [JsonProperty("domainList")]
      public DomainTypeConnection domainList { get; set; }
    
      [JsonProperty("environmentItems")]
      public List<Environment> environmentItems { get; set; }
    
      [JsonProperty("environmentList")]
      public EnvironmentTypeConnection environmentList { get; set; }
    
      [JsonProperty("omsAccountInfoItems")]
      public List<OmsAccountData> omsAccountInfoItems { get; set; }
    
      [JsonProperty("omsAccountInfoList")]
      public OmsAccountInfoTypeConnection omsAccountInfoList { get; set; }
    
      [JsonProperty("productInstallItems")]
      public List<ProductInstall> productInstallItems { get; set; }
    
      [JsonProperty("productInstallList")]
      public ProductInstallTypeConnection productInstallList { get; set; }
    
      [JsonProperty("productItems")]
      public List<Product> productItems { get; set; }
    
      [JsonProperty("productList")]
      public ProductTypeConnection productList { get; set; }
    
      [JsonProperty("schema")]
      public string schema { get; set; }
    
      [JsonProperty("tenantItems")]
      public List<Tenant> tenantItems { get; set; }
    
      [JsonProperty("tenantList")]
      public TenantTypeConnection tenantList { get; set; }
    
      [JsonProperty("test")]
      public string test { get; set; }
    
      [JsonProperty("userItems")]
      public List<User> userItems { get; set; }
      #endregion
    }
    #endregion
    
    #region Domain
    public class Domain {
      #region members
      [JsonProperty("address")]
      public PostalAddress address { get; set; }
    
      [JsonProperty("ancestorDomains")]
      public List<IdName> ancestorDomains { get; set; }
    
      [JsonProperty("authorizedProductIds")]
      public List<string> authorizedProductIds { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("environmentId")]
      public string environmentId { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("isSubDomainAllowed")]
      public bool isSubDomainAllowed { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("parentDomainId")]
      public string parentDomainId { get; set; }
    
      [JsonProperty("parentDomainName")]
      public string parentDomainName { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
      #endregion
    }
    #endregion
    
    #region DomainBoolFilter
    public class DomainBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public DomainBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum DomainBoolFilterField {
      IS_ENABLED,
      IS_SUB_DOMAIN_ALLOWED
    }
    
    
    #region DomainInput
    public class DomainInput {
      #region members
      public PostalAddressInput address { get; set; }
    
      public List<string> authorizedProductIds { get; set; }
    
      public string email { get; set; }
    
      [Required]
      [JsonRequired]
      public string environmentId { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      public bool? isSubDomainAllowed { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public string parentDomainId { get; set; }
    
      public string phone { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region DomainQueryParams
    public class DomainQueryParams {
      #region members
      public List<DomainBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public DomainSortField? sortField { get; set; }
    
      public List<DomainStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum DomainSortField {
      EMAIL,
      ENVIRONMENT_ID,
      IS_ENABLED,
      NAME,
      PARENT_DOMAIN_ID,
      PARENT_DOMAIN_NAME,
      PHONE
    }
    
    
    #region DomainStringFilter
    public class DomainStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DomainStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum DomainStringFilterField {
      ADDRESS_ADDRESS_LINE_1,
      ADDRESS_ADDRESS_LINE_2,
      ADDRESS_CITY,
      ADDRESS_COUNTRY,
      ADDRESS_POSTAL_CODE,
      ADDRESS_STATE,
      ANCESTOR_DOMAIN_ID,
      ANCESTOR_DOMAIN_NAME,
      EMAIL,
      ENVIRONMENT_ID,
      NAME,
      PARENT_DOMAIN_ID,
      PARENT_DOMAIN_NAME,
      PHONE
    }
    
    
    #region DomainTypeConnection
    public class DomainTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Domain> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region EdcUserAccount
    public class EdcUserAccount {
      #region members
      [JsonProperty("accountCodeDest")]
      public string accountCodeDest { get; set; }
    
      [JsonProperty("accountId")]
      public int accountId { get; set; }
    
      [JsonProperty("accountIdDest")]
      public int accountIdDest { get; set; }
    
      [JsonProperty("gedSchema")]
      public string gedSchema { get; set; }
    
      [JsonProperty("login")]
      public string login { get; set; }
    
      [JsonProperty("loginDest")]
      public string loginDest { get; set; }
      #endregion
    }
    #endregion
    
    #region EdcUserAccountInput
    public class EdcUserAccountInput {
      #region members
      [Required]
      [JsonRequired]
      public string accountCodeDest { get; set; }
    
      [Required]
      [JsonRequired]
      public int accountId { get; set; }
    
      [Required]
      [JsonRequired]
      public int accountIdDest { get; set; }
    
      [Required]
      [JsonRequired]
      public string gedSchema { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region EmailConfig
    public class EmailConfig {
      #region members
      [JsonProperty("replyAddress")]
      public string replyAddress { get; set; }
    
      [JsonProperty("senderAddress")]
      public string senderAddress { get; set; }
    
      [JsonProperty("senderName")]
      public string senderName { get; set; }
      #endregion
    }
    #endregion
    
    #region EmailConfigInput
    public class EmailConfigInput {
      #region members
      public string replyAddress { get; set; }
    
      public string senderAddress { get; set; }
    
      public string senderName { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region Environment
    public class Environment {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
      #endregion
    }
    #endregion
    
    #region EnvironmentBoolFilter
    public class EnvironmentBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public EnvironmentBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum EnvironmentBoolFilterField {
      IS_ENABLED
    }
    
    
    #region EnvironmentInput
    public class EnvironmentInput {
      #region members
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region EnvironmentQueryParams
    public class EnvironmentQueryParams {
      #region members
      public List<EnvironmentBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public EnvironmentSortField? sortField { get; set; }
    
      public List<EnvironmentStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum EnvironmentSortField {
      IS_ENABLED,
      NAME
    }
    
    
    #region EnvironmentStringFilter
    public class EnvironmentStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public EnvironmentStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum EnvironmentStringFilterField {
      NAME
    }
    
    
    #region EnvironmentTypeConnection
    public class EnvironmentTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Environment> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region IdName
    public class IdName {
      #region members
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
      #endregion
    }
    #endregion
    public enum Media {
      EMAIL,
      FAX,
      FAX_EMAIL,
      POSTAL,
      PUSH_NOTIFICATION,
      SMS,
      VOICE
    }
    
    public enum NumberFilterOperator {
      BETWEEN,
      DEFINED,
      EQUAL,
      EQUAL_OR_UNDEFINED,
      GREATER_THAN,
      GREATER_THAN_OR_EQUAL,
      IS_NOT_NULL,
      IS_NULL,
      LOWER_THAN,
      LOWER_THAN_OR_EQUAL,
      NOT_EQUAL,
      UNDEFINED
    }
    
    
    #region OmsAccount
    public class OmsAccount {
      #region members
      [JsonProperty("billingInfo")]
      public OmsAccountBillingInfo billingInfo { get; set; }
    
      [JsonProperty("billingParameter")]
      public OmsAccountBillingParameter billingParameter { get; set; }
    
      [JsonProperty("info")]
      public OmsAccountInfo info { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsAccountBillingInfo
    public class OmsAccountBillingInfo {
      #region members
      [JsonProperty("attention")]
      public string attention { get; set; }
    
      [JsonProperty("city")]
      public string city { get; set; }
    
      [JsonProperty("companyName")]
      public string companyName { get; set; }
    
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("fax")]
      public string fax { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("state")]
      public string state { get; set; }
    
      [JsonProperty("street1")]
      public string street1 { get; set; }
    
      [JsonProperty("street2")]
      public string street2 { get; set; }
    
      [JsonProperty("zip")]
      public string zip { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsAccountBillingParameter
    public class OmsAccountBillingParameter {
      #region members
      [JsonProperty("billingType")]
      public AccountBillingParameterBillingType? billingType { get; set; }
    
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("idClientCrm")]
      public int idClientCrm { get; set; }
    
      [JsonProperty("overchargingDuration")]
      public bool? overchargingDuration { get; set; }
    
      [JsonProperty("overchargingFineMode")]
      public bool? overchargingFineMode { get; set; }
    
      [JsonProperty("overchargingPagesOfNotCompletelySentDoc")]
      public bool? overchargingPagesOfNotCompletelySentDoc { get; set; }
    
      [JsonProperty("overchargingUnsentPage")]
      public bool? overchargingUnsentPage { get; set; }
    
      [JsonProperty("pricingModel")]
      public AccountBillingParameterPricingModelType? pricingModel { get; set; }
    
      [JsonProperty("quota")]
      public bool? quota { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsAccountData
    public class OmsAccountData {
      #region members
      [JsonProperty("mediaList")]
      public List<Media> mediaList { get; set; }
    
      [JsonProperty("omsAccount")]
      public OmsAccount omsAccount { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsAccountInfo
    public class OmsAccountInfo {
      #region members
      [JsonProperty("accountType")]
      public int accountType { get; set; }
    
      [JsonProperty("billingGroup")]
      public int billingGroup { get; set; }
    
      [JsonProperty("city")]
      public string city { get; set; }
    
      [JsonProperty("companyName")]
      public string companyName { get; set; }
    
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("fax")]
      public string fax { get; set; }
    
      [JsonProperty("isBillingGroup")]
      public bool isBillingGroup { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("sla")]
      public int sla { get; set; }
    
      [JsonProperty("state")]
      public string state { get; set; }
    
      [JsonProperty("zip")]
      public string zip { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsAccountInfoIntFilter
    public class OmsAccountInfoIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public OmsAccountInfoIntFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public int filterValue1 { get; set; }
    
      public int? filterValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public NumberFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum OmsAccountInfoIntFilterField {
      BILLING_GROUP
    }
    
    
    #region OmsAccountInfoQueryParams
    public class OmsAccountInfoQueryParams {
      #region members
      public List<OmsAccountInfoIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public OmsAccountInfoSortField? sortField { get; set; }
    
      public List<OmsAccountInfoStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum OmsAccountInfoSortField {
      BILLING_GROUP,
      CITY,
      COMPANY_NAME,
      COUNTRY,
      CUSTOMER_NUMBER,
      ZIP
    }
    
    
    #region OmsAccountInfoStringFilter
    public class OmsAccountInfoStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public OmsAccountInfoStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum OmsAccountInfoStringFilterField {
      COMPANY_NAME,
      CUSTOMER_NUMBER
    }
    
    
    #region OmsAccountInfoTypeConnection
    public class OmsAccountInfoTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<OmsAccountInfo> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsUserAccount
    public class OmsUserAccount {
      #region members
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("login")]
      public string login { get; set; }
      #endregion
    }
    #endregion
    
    #region OmsUserAccountInput
    public class OmsUserAccountInput {
      #region members
      [Required]
      [JsonRequired]
      public int customerNumber { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region PageInfo
    public class PageInfo {
      #region members
      [JsonProperty("endCursor")]
      public string endCursor { get; set; }
    
      [JsonProperty("hasNextPage")]
      public bool hasNextPage { get; set; }
      #endregion
    }
    #endregion
    
    #region PostalAddress
    public class PostalAddress {
      #region members
      [JsonProperty("additionalGeographicInfo")]
      public string additionalGeographicInfo { get; set; }
    
      [JsonProperty("additionalInfo")]
      public string additionalInfo { get; set; }
    
      [JsonProperty("city")]
      public string city { get; set; }
    
      [JsonProperty("country")]
      public string country { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("postBox")]
      public string postBox { get; set; }
    
      [JsonProperty("street")]
      public string street { get; set; }
    
      [JsonProperty("zipCode")]
      public string zipCode { get; set; }
      #endregion
    }
    #endregion
    
    #region PostalAddressInput
    public class PostalAddressInput {
      #region members
      public string additionalGeographicInfo { get; set; }
    
      public string additionalInfo { get; set; }
    
      [Required]
      [JsonRequired]
      public string city { get; set; }
    
      [Required]
      [JsonRequired]
      public string country { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public string postBox { get; set; }
    
      [Required]
      [JsonRequired]
      public string street { get; set; }
    
      [Required]
      [JsonRequired]
      public string zipCode { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region PostalConfiguration
    public class PostalConfiguration {
      #region members
      [JsonProperty("isTestMode")]
      public bool isTestMode { get; set; }
      #endregion
    }
    #endregion
    
    #region PostalConfigurationInput
    public class PostalConfigurationInput {
      #region members
      [Required]
      [JsonRequired]
      public bool isTestMode { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region Product
    public class Product {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("order")]
      public int order { get; set; }
      #endregion
    }
    #endregion
    
    #region ProductAccess
    public class ProductAccess {
      #region members
      [JsonProperty("order")]
      public int order { get; set; }
    
      [JsonProperty("productId")]
      public string productId { get; set; }
    
      [JsonProperty("productInstallId")]
      public string productInstallId { get; set; }
    
      [JsonProperty("productName")]
      public string productName { get; set; }
    
      [JsonProperty("url")]
      public string url { get; set; }
      #endregion
    }
    #endregion
    
    #region ProductAccessInput
    public class ProductAccessInput {
      #region members
      [Required]
      [JsonRequired]
      public string productInstallId { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region ProductBoolFilter
    public class ProductBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ProductBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ProductInput
    public class ProductInput {
      #region members
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
      public int order { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region ProductInstall
    public class ProductInstall {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("environmentId")]
      public string environmentId { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("productId")]
      public string productId { get; set; }
    
      [JsonProperty("url")]
      public string url { get; set; }
      #endregion
    }
    #endregion
    
    #region ProductInstallBoolFilter
    public class ProductInstallBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ProductInstallBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductInstallBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ProductInstallInput
    public class ProductInstallInput {
      #region members
      [Required]
      [JsonRequired]
      public string environmentId { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string productId { get; set; }
    
      [Required]
      [JsonRequired]
      public string url { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region ProductInstallQueryParams
    public class ProductInstallQueryParams {
      #region members
      public List<ProductInstallBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ProductInstallSortField? sortField { get; set; }
    
      public List<ProductInstallStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductInstallSortField {
      ENVIRONMENT_ID,
      IS_ENABLED,
      PRODUCT_ID,
      URL
    }
    
    
    #region ProductInstallStringFilter
    public class ProductInstallStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ProductInstallStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductInstallStringFilterField {
      ENVIRONMENT_ID,
      PRODUCT_ID,
      URL
    }
    
    
    #region ProductInstallTypeConnection
    public class ProductInstallTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ProductInstall> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ProductIntFilter
    public class ProductIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public ProductIntFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public int filterValue1 { get; set; }
    
      public int? filterValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public NumberFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductIntFilterField {
      ORDER
    }
    
    
    #region ProductQueryParams
    public class ProductQueryParams {
      #region members
      public List<ProductBoolFilter> boolFilters { get; set; }
    
      public List<ProductIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ProductSortField? sortField { get; set; }
    
      public List<ProductStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductSortField {
      IS_ENABLED,
      NAME,
      ORDER
    }
    
    
    #region ProductStringFilter
    public class ProductStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ProductStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum ProductStringFilterField {
      NAME
    }
    
    
    #region ProductTypeConnection
    public class ProductTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Product> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
      /// <summary>
      /// The application rights.
      /// </summary>
    public enum RightType {
      /// <summary>
      /// Create environments
      /// </summary>
      ADD_ENVIRONMENT,
      /// <summary>
      /// Create tenants
      /// </summary>
      ADD_TENANT,
      /// <summary>
      /// Create, edit or delete activities
      /// </summary>
      CHANGE_ACTIVITY,
      /// <summary>
      /// Create, edit or delete document links
      /// </summary>
      CHANGE_CLICKED_LINK_DOCUMENT,
      /// <summary>
      /// Create or edit configurations
      /// </summary>
      CHANGE_CONFIGURATION,
      /// <summary>
      /// Create, edit or delete contacts
      /// </summary>
      CHANGE_CONTACT,
      /// <summary>
      /// Create, edit or delete contact functions
      /// </summary>
      CHANGE_CONTACT_FUNCTION,
      /// <summary>
      /// Create, edit or delete dashboards
      /// </summary>
      CHANGE_DASHBOARD,
      /// <summary>
      /// Create, edit or delete documents
      /// </summary>
      CHANGE_DOCUMENT,
      /// <summary>
      /// Create documentJob
      /// </summary>
      CHANGE_DOCUMENT_JOB,
      /// <summary>
      /// Create, edit or delete document types
      /// </summary>
      CHANGE_DOCUMENT_TYPE,
      /// <summary>
      /// Create or edit domains
      /// </summary>
      CHANGE_DOMAIN,
      /// <summary>
      /// Create, edit or renew Domain Api users
      /// </summary>
      CHANGE_DOMAIN_API_USER,
      /// <summary>
      /// Create or edit domain administrators
      /// </summary>
      CHANGE_DOMAIN_USER,
      /// <summary>
      /// Create, edit or renew Environment Api users
      /// </summary>
      CHANGE_ENVIRONMENT_API_USER,
      /// <summary>
      /// Create or edit environment administrators
      /// </summary>
      CHANGE_ENVIRONMENT_USER,
      /// <summary>
      /// Create, edit or delete jobMessage
      /// </summary>
      CHANGE_JOB_MESSAGE,
      /// <summary>
      /// Create, edit or delete list of values
      /// </summary>
      CHANGE_LIST_OF_VALUES,
      /// <summary>
      /// Create, edit or delete metadatas
      /// </summary>
      CHANGE_METADATA,
      /// <summary>
      /// Create or edit notes
      /// </summary>
      CHANGE_NOTE,
      /// <summary>
      /// Create or edit OMS resources
      /// </summary>
      CHANGE_OMS_RESOURCES,
      /// <summary>
      /// Create postalJob
      /// </summary>
      CHANGE_POSTAL_JOB,
      /// <summary>
      /// Create or edit PowerBi auth token
      /// </summary>
      CHANGE_POWER_BI_AUTH_TOKEN,
      /// <summary>
      /// Create or edit products
      /// </summary>
      CHANGE_PRODUCT,
      /// <summary>
      /// Create or edit product installs
      /// </summary>
      CHANGE_PRODUCT_INSTALL,
      /// <summary>
      /// Create, edit or delete services
      /// </summary>
      CHANGE_SERVICE,
      /// <summary>
      /// Create, edit or delete template contents
      /// </summary>
      CHANGE_TEMPLATE_CONTENT,
      /// <summary>
      /// Create, edit or delete template structures
      /// </summary>
      CHANGE_TEMPLATE_STRUCTURE,
      /// <summary>
      /// Create, edit or renew Api users
      /// </summary>
      CHANGE_TENANT_API_USER,
      /// <summary>
      /// Create or edit tenant internal info
      /// </summary>
      CHANGE_TENANT_EDC_OMS_INFO,
      /// <summary>
      /// Create or edit tenant users
      /// </summary>
      CHANGE_TENANT_USER,
      /// <summary>
      /// Create, edit or delete third parties
      /// </summary>
      CHANGE_THIRD_PARTY,
      /// <summary>
      /// Create, edit or delete third party types
      /// </summary>
      CHANGE_THIRD_PARTY_TYPE,
      /// <summary>
      /// Complete document
      /// </summary>
      COMPLETE_DOCUMENT,
      /// <summary>
      /// Edit environments
      /// </summary>
      EDIT_ENVIRONMENT,
      /// <summary>
      /// Edit tenants
      /// </summary>
      EDIT_TENANT,
      /// <summary>
      /// Grant internal user rights
      /// </summary>
      GRANT_INTERNAL_RIGHT,
      /// <summary>
      /// Grant user rights
      /// </summary>
      GRANT_RIGHT,
      /// <summary>
      /// Read clicked link document
      /// </summary>
      MARK_DOCUMENT_AS_READ,
      /// <summary>
      /// Get or list activities
      /// </summary>
      READ_ACTIVITY,
      /// <summary>
      /// Mark document as read
      /// </summary>
      READ_CLICKED_LINK_DOCUMENT,
      /// <summary>
      /// Get or list configurations
      /// </summary>
      READ_CONFIGURATION,
      /// <summary>
      /// Get or list contacts
      /// </summary>
      READ_CONTACT,
      /// <summary>
      /// Get or list contact functions
      /// </summary>
      READ_CONTACT_FUNCTION,
      /// <summary>
      /// Get or list dashboards
      /// </summary>
      READ_DASHBOARD,
      /// <summary>
      /// Get or list documents sent to the user
      /// </summary>
      READ_DOCUMENT,
      /// <summary>
      /// Get or list documentJobs
      /// </summary>
      READ_DOCUMENT_JOB,
      /// <summary>
      /// Get or list documents sent to the service of the user
      /// </summary>
      READ_DOCUMENT_ON_SERVICE,
      /// <summary>
      /// Get or list document types
      /// </summary>
      READ_DOCUMENT_TYPE,
      /// <summary>
      /// Get or list domains
      /// </summary>
      READ_DOMAIN,
      /// <summary>
      /// Get or list Domain Api users
      /// </summary>
      READ_DOMAIN_API_USER,
      /// <summary>
      /// Get or list domain administrators
      /// </summary>
      READ_DOMAIN_USER,
      /// <summary>
      /// Get or list environments
      /// </summary>
      READ_ENVIRONMENT,
      /// <summary>
      /// Get or list Environment Api users
      /// </summary>
      READ_ENVIRONMENT_API_USER,
      /// <summary>
      /// Get or list environment administrators
      /// </summary>
      READ_ENVIRONMENT_USER,
      /// <summary>
      /// Get or list documentJobs
      /// </summary>
      READ_JOB_MESSAGE,
      /// <summary>
      /// Get or list list of values
      /// </summary>
      READ_LIST_OF_VALUES,
      /// <summary>
      /// Get or list metadatas
      /// </summary>
      READ_METADATA,
      /// <summary>
      /// Get or list notes
      /// </summary>
      READ_NOTE,
      /// <summary>
      /// Get or list OMS resources
      /// </summary>
      READ_OMS_RESOURCES,
      /// <summary>
      /// Get or list postalJobs
      /// </summary>
      READ_POSTAL_JOB,
      /// <summary>
      /// Get or list products
      /// </summary>
      READ_PRODUCT,
      /// <summary>
      /// Get or list product installs
      /// </summary>
      READ_PRODUCT_INSTALL,
      /// <summary>
      /// List user rights
      /// </summary>
      READ_RIGHT,
      /// <summary>
      /// Get or list services
      /// </summary>
      READ_SERVICE,
      /// <summary>
      /// Get or list template contents
      /// </summary>
      READ_TEMPLATE_CONTENT,
      /// <summary>
      /// Get or list template structures
      /// </summary>
      READ_TEMPLATE_STRUCTURE,
      /// <summary>
      /// Get or list tenants
      /// </summary>
      READ_TENANT,
      /// <summary>
      /// Get or list Api users
      /// </summary>
      READ_TENANT_API_USER,
      /// <summary>
      /// Get or list tenants with internal info
      /// </summary>
      READ_TENANT_EDC_OMS_INFO,
      /// <summary>
      /// Get or list tenant users
      /// </summary>
      READ_TENANT_USER,
      /// <summary>
      /// Get or list third parties
      /// </summary>
      READ_THIRD_PARTY,
      /// <summary>
      /// Get or list third party types
      /// </summary>
      READ_THIRD_PARTY_TYPE,
      /// <summary>
      /// RelaunchJobMessage
      /// </summary>
      RELAUNCH_JOB_MESSAGE,
      /// <summary>
      /// Resend document to chorusRight
      /// </summary>
      RESEND_DOCUMENT,
      /// <summary>
      /// Synchronize EDC resources
      /// </summary>
      SYNCHRONIZE_EDC_RESOURCES,
      /// <summary>
      /// Validate invited user
      /// </summary>
      VALIDATE_USER
    }
    
    
    #region RightValue
    public class RightValue {
      #region members
      [JsonProperty("right")]
      public RightType right { get; set; }
    
      [JsonProperty("value")]
      public bool value { get; set; }
      #endregion
    }
    #endregion
    
    #region RightValueInput
    public class RightValueInput {
      #region members
      [Required]
      [JsonRequired]
      public RightType right { get; set; }
    
      [Required]
      [JsonRequired]
      public bool value { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region Role
    public class Role {
      #region members
      [JsonProperty("domainId")]
      public string domainId { get; set; }
    
      [JsonProperty("domainName")]
      public string domainName { get; set; }
    
      [JsonProperty("environmentId")]
      public string environmentId { get; set; }
    
      [JsonProperty("environmentName")]
      public string environmentName { get; set; }
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
      [JsonProperty("productAccesses")]
      public List<ProductAccess> productAccesses { get; set; }
    
      [JsonProperty("profile")]
      public UserProfile profile { get; set; }
    
      [JsonProperty("rights")]
      public List<RightValue> rights { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("tenantName")]
      public string tenantName { get; set; }
      #endregion
    }
    #endregion
    
    #region RoleInput
    public class RoleInput {
      #region members
      public string domainId { get; set; }
    
      public string environmentId { get; set; }
    
      public List<ProductAccessInput> productAccesses { get; set; }
    
      [Required]
      [JsonRequired]
      public UserProfile profile { get; set; }
    
      public List<RightValueInput> rights { get; set; }
    
      public string tenantId { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum SortDirection {
      ASCENDING,
      DESCENDING
    }
    
    public enum StringFilterOperator {
      CONTAIN,
      DEFINED,
      END_WITH,
      EQUAL,
      EQUAL_OR_UNDEFINED,
      IN_ARRAY,
      IS_NOT_NULL,
      IS_NULL,
      NOT_CONTAIN,
      NOT_END_WITH,
      NOT_EQUAL,
      NOT_START_WITH,
      START_WITH,
      UNDEFINED
    }
    
    
    #region Tenant
    public class Tenant {
      #region members
      [JsonProperty("address")]
      public PostalAddress address { get; set; }
    
      [JsonProperty("authorizedProductIds")]
      public List<string> authorizedProductIds { get; set; }
    
      [JsonProperty("chorusB2GConfig")]
      public ChorusB2GConfig chorusB2GConfig { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("domainId")]
      public string domainId { get; set; }
    
      [JsonProperty("edcServiceAccount")]
      public EdcUserAccount edcServiceAccount { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("emailConfig")]
      public EmailConfig emailConfig { get; set; }
    
      [JsonProperty("environmentId")]
      public string environmentId { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("omsServiceAccount")]
      public OmsUserAccount omsServiceAccount { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("postalConfig")]
      public PostalConfiguration postalConfig { get; set; }
      #endregion
    }
    #endregion
    
    #region TenantBoolFilter
    public class TenantBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public TenantBoolFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public bool filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public BoolFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum TenantBoolFilterField {
      IS_ENABLED
    }
    
    
    #region TenantInput
    public class TenantInput {
      #region members
      public PostalAddressInput address { get; set; }
    
      public List<string> authorizedProductIds { get; set; }
    
      public ChorusB2GConfigInput chorusB2GConfig { get; set; }
    
      public EdcUserAccountInput edcServiceAccount { get; set; }
    
      public string email { get; set; }
    
      public EmailConfigInput emailConfig { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public OmsUserAccountInput omsServiceAccount { get; set; }
    
      public string phone { get; set; }
    
      public PostalConfigurationInput postalConfig { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    
    #region TenantIntFilter
    public class TenantIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public TenantIntFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public int filterValue1 { get; set; }
    
      public int? filterValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public NumberFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum TenantIntFilterField {
      OMS_SERVICE_ACCOUNT_CUSTOMER_NUMBER
    }
    
    
    #region TenantQueryParams
    public class TenantQueryParams {
      #region members
      public List<TenantBoolFilter> boolFilters { get; set; }
    
      public List<TenantIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public TenantSortField? sortField { get; set; }
    
      public List<TenantStringFilter> stringFilters { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum TenantSortField {
      DOMAIN_ID,
      EDC_SERVICE_ACCOUNT_GED_SCHEMA,
      EMAIL,
      ENVIRONMENT_ID,
      IS_ENABLED,
      NAME,
      OMS_SERVICE_ACCOUNT_CUSTOMER_NUMBER,
      PHONE
    }
    
    
    #region TenantStringFilter
    public class TenantStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public TenantStringFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterValue1 { get; set; }
    
      [Required]
      [JsonRequired]
      public StringFilterOperator @operator { get; set; }
      #endregion
    
      #region methods
      public dynamic GetInputObject()
      {
        IDictionary<string, object> d = new System.Dynamic.ExpandoObject();
    
        var properties = GetType().GetProperties(System.Reflection.BindingFlags.Instance | System.Reflection.BindingFlags.Public);
        foreach (var propertyInfo in properties)
        {
          var value = propertyInfo.GetValue(this);
          var defaultValue = propertyInfo.PropertyType.IsValueType ? Activator.CreateInstance(propertyInfo.PropertyType) : null;
    
          var requiredProp = propertyInfo.GetCustomAttributes(typeof(JsonRequiredAttribute), false).Length > 0;
    
          if (requiredProp || value != defaultValue)
          {
            d[propertyInfo.Name] = value;
          }
        }
        return d;
      }
      #endregion
    }
    #endregion
    public enum TenantStringFilterField {
      ADDRESS_ADDRESS_LINE_1,
      ADDRESS_ADDRESS_LINE_2,
      ADDRESS_CITY,
      ADDRESS_COUNTRY,
      ADDRESS_POSTAL_CODE,
      ADDRESS_STATE,
      DOMAIN_ID,
      EDC_SERVICE_ACCOUNT_GED_SCHEMA,
      EMAIL,
      ENVIRONMENT_ID,
      NAME,
      PHONE
    }
    
    
    #region TenantTypeConnection
    public class TenantTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Tenant> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region User
    public class User {
      #region members
      [JsonProperty("azureId")]
      public string azureId { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("isInvited")]
      public bool isInvited { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("roles")]
      public List<Role> roles { get; set; }
      #endregion
    }
    #endregion
    public enum UserProfile {
      ADMINISTRATOR,
      DOMAIN_ADMINISTRATOR,
      ENVIRONMENT_ADMINISTRATOR,
      STANDARD_USER,
      TENANT_RECEIVER,
      WEBSITE_ADMINISTRATOR
    }
    
  }
  
}
