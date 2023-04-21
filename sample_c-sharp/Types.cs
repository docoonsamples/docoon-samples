using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Newtonsoft.Json;

namespace GraphQLCodeGen {
  public class Types {
    
    #region Activity
    public class Activity {
      #region members
      [JsonProperty("activityType")]
      public ActivityCategory activityType { get; set; }
    
      [JsonProperty("additionalFields")]
      public List<KeyValue> additionalFields { get; set; }
    
      [JsonProperty("consumer")]
      public IdNameType consumer { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("date")]
      public any date { get; set; }
    
      [JsonProperty("detail")]
      public string detail { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("producer")]
      public IdNameType producer { get; set; }
    
      [JsonProperty("source")]
      public ActivitySource source { get; set; }
      #endregion
    }
    #endregion
    
    #region ActivityActivityActorTypeEnumFilter
    public class ActivityActivityActorTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ActivityActorTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public ActivityActorType filterValue1 { get; set; }
    
      public ActivityActorType? filterValue2 { get; set; }
    
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
    
    #region ActivityActivityCategoryEnumFilter
    public class ActivityActivityCategoryEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ActivityCategoryFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public ActivityCategory filterValue1 { get; set; }
    
      public ActivityCategory? filterValue2 { get; set; }
    
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
    
    #region ActivityActivitySourceTypeEnumFilter
    public class ActivityActivitySourceTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ActivitySourceTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public ActivitySourceType filterValue1 { get; set; }
    
      public ActivitySourceType? filterValue2 { get; set; }
    
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
    public enum ActivityActorType {
      CONTACT,
      EMAIL_ADDRESS,
      EXTERNAL,
      SERVICE,
      SYSTEM,
      TENANT_USER,
      THIRD_PARTY
    }
    
    public enum ActivityActorTypeFilterField {
      CONSUMER_TYPE,
      PRODUCER_TYPE
    }
    
    public enum ActivityCategory {
      ADD_ATTACHMENTS_DOCUMENT,
      CHANGE_STATUS_CHORUS_B_2_G,
      COMPLETE_CHORUS_B_2_G,
      DOCUMENT_ARCHIVED,
      DOCUMENT_CANCELED,
      DOCUMENT_READ,
      DOCUMENT_SIGNED,
      EDIT_METADATA_DOCUMENT,
      ERROR,
      EXTERNAL_PROCESS,
      JOB_CREATED,
      JOB_LAUNCHED,
      JOB_PROCESSING,
      NOTIFICATION_SENT,
      SEND_CHORUS_B_2_G
    }
    
    public enum ActivityCategoryFilterField {
      ACTIVITY_TYPE
    }
    
    
    #region ActivityDateFilter
    public class ActivityDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public ActivityDateFilterField field { get; set; }
    
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
    public enum ActivityDateFilterField {
      DATE
    }
    
    
    #region ActivityQueryParams
    public class ActivityQueryParams {
      #region members
      public List<ActivityActivityActorTypeEnumFilter> actorTypeFilters { get; set; }
    
      public List<ActivityDateFilter> dateFilters { get; set; }
    
      public List<ActivityActivityCategoryEnumFilter> eventTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ActivitySortField? sortField { get; set; }
    
      public List<ActivityActivitySourceTypeEnumFilter> sourceTypeFilters { get; set; }
    
      public List<ActivityStringFilter> stringFilters { get; set; }
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
    public enum ActivitySortField {
      ACTIVITY_TYPE,
      CONSUMER,
      CONTACT_SOURCE_NAME,
      DATE,
      DETAIL,
      DOCUMENT_SOURCE_NAME,
      JOB_MESSAGE_SOURCE_NAME,
      JOB_SOURCE_NAME,
      PRODUCER,
      TENANT_SOURCE_NAME,
      TENANT_USER_SOURCE_NAME,
      THIRD_PARTY_SOURCE_NAME
    }
    
    
    #region ActivitySource
    public class ActivitySource {
      #region members
      [JsonProperty("contact")]
      public IdName contact { get; set; }
    
      [JsonProperty("document")]
      public IdName document { get; set; }
    
      [JsonProperty("job")]
      public IdName job { get; set; }
    
      [JsonProperty("jobMessage")]
      public IdName jobMessage { get; set; }
    
      [JsonProperty("tenant")]
      public IdName tenant { get; set; }
    
      [JsonProperty("tenantUser")]
      public IdName tenantUser { get; set; }
    
      [JsonProperty("thirdParty")]
      public IdName thirdParty { get; set; }
      #endregion
    }
    #endregion
    public enum ActivitySourceType {
      CONTACT,
      DOCUMENT,
      JOB,
      JOB_MESSAGE,
      TENANT,
      TENANT_USER,
      THIRD_PARTY
    }
    
    public enum ActivitySourceTypeFilterField {
      SOURCE_TYPE
    }
    
    
    #region ActivityStringFilter
    public class ActivityStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ActivityStringFilterField field { get; set; }
    
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
    public enum ActivityStringFilterField {
      CONSUMER_ID,
      CONSUMER_NAME,
      CONTACT_SOURCE_ID,
      CONTACT_SOURCE_NAME,
      DOCUMENT_SOURCE_ID,
      DOCUMENT_SOURCE_NAME,
      JOB_MESSAGE_SOURCE_ID,
      JOB_MESSAGE_SOURCE_NAME,
      JOB_SOURCE_ID,
      JOB_SOURCE_NAME,
      PRODUCER_ID,
      PRODUCER_NAME,
      TENANT_SOURCE_ID,
      TENANT_SOURCE_NAME,
      TENANT_USER_SOURCE_ID,
      TENANT_USER_SOURCE_NAME,
      THIRD_PARTY_SOURCE_ID,
      THIRD_PARTY_SOURCE_NAME
    }
    
    
    #region ActivityTypeConnection
    public class ActivityTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Activity> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiDomainUser
    public class ApiDomainUser {
      #region members
      [JsonProperty("authorizedIPs")]
      public List<string> authorizedIPs { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("domainId")]
      public string domainId { get; set; }
    
      [JsonProperty("domainName")]
      public string domainName { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("keyPreview")]
      public string keyPreview { get; set; }
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
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
    
    #region ApiDomainUserBoolFilter
    public class ApiDomainUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiDomainUserBoolFilterField field { get; set; }
    
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
    public enum ApiDomainUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ApiDomainUserDateFilter
    public class ApiDomainUserDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiDomainUserDateFilterField field { get; set; }
    
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
    public enum ApiDomainUserDateFilterField {
      CREATION_DATE,
      LAST_CONNECTION_DATE
    }
    
    
    #region ApiDomainUserInput
    public class ApiDomainUserInput {
      #region members
      public List<string> authorizedIPs { get; set; }
    
      [Required]
      [JsonRequired]
      public string domainId { get; set; }
    
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
    
    #region ApiDomainUserQueryParams
    public class ApiDomainUserQueryParams {
      #region members
      public List<ApiDomainUserBoolFilter> boolFilters { get; set; }
    
      public List<ApiDomainUserDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ApiDomainUserSortField? sortField { get; set; }
    
      public List<ApiDomainUserStringFilter> stringFilters { get; set; }
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
    public enum ApiDomainUserSortField {
      CREATION_DATE,
      CREATION_USER_LABEL,
      DOMAIN_ID,
      IS_ENABLED,
      LAST_CONNECTION_DATE,
      NAME
    }
    
    
    #region ApiDomainUserStringFilter
    public class ApiDomainUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiDomainUserStringFilterField field { get; set; }
    
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
    public enum ApiDomainUserStringFilterField {
      CREATION_USER_ID,
      CREATION_USER_LABEL,
      DOMAIN_ID,
      NAME
    }
    
    
    #region ApiDomainUserTypeConnection
    public class ApiDomainUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ApiDomainUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiEnvironmentUser
    public class ApiEnvironmentUser {
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
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
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
    
    #region ApiEnvironmentUserBoolFilter
    public class ApiEnvironmentUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiEnvironmentUserBoolFilterField field { get; set; }
    
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
    public enum ApiEnvironmentUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ApiEnvironmentUserDateFilter
    public class ApiEnvironmentUserDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiEnvironmentUserDateFilterField field { get; set; }
    
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
    public enum ApiEnvironmentUserDateFilterField {
      CREATION_DATE,
      LAST_CONNECTION_DATE
    }
    
    
    #region ApiEnvironmentUserInput
    public class ApiEnvironmentUserInput {
      #region members
      public List<string> authorizedIPs { get; set; }
    
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
    
    #region ApiEnvironmentUserQueryParams
    public class ApiEnvironmentUserQueryParams {
      #region members
      public List<ApiEnvironmentUserBoolFilter> boolFilters { get; set; }
    
      public List<ApiEnvironmentUserDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ApiEnvironmentUserSortField? sortField { get; set; }
    
      public List<ApiEnvironmentUserStringFilter> stringFilters { get; set; }
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
    public enum ApiEnvironmentUserSortField {
      CREATION_DATE,
      CREATION_USER_LABEL,
      IS_ENABLED,
      LAST_CONNECTION_DATE,
      NAME
    }
    
    
    #region ApiEnvironmentUserStringFilter
    public class ApiEnvironmentUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiEnvironmentUserStringFilterField field { get; set; }
    
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
    public enum ApiEnvironmentUserStringFilterField {
      CREATION_USER_ID,
      CREATION_USER_LABEL,
      NAME
    }
    
    
    #region ApiEnvironmentUserTypeConnection
    public class ApiEnvironmentUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ApiEnvironmentUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiTenantUser
    public class ApiTenantUser {
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
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
      #endregion
    }
    #endregion
    
    #region ApiTenantUserBoolFilter
    public class ApiTenantUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiTenantUserBoolFilterField field { get; set; }
    
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
    public enum ApiTenantUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ApiTenantUserDateFilter
    public class ApiTenantUserDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiTenantUserDateFilterField field { get; set; }
    
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
    public enum ApiTenantUserDateFilterField {
      CREATION_DATE,
      LAST_CONNECTION_DATE
    }
    
    
    #region ApiTenantUserInput
    public class ApiTenantUserInput {
      #region members
      public List<string> authorizedIPs { get; set; }
    
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
    
    #region ApiTenantUserQueryParams
    public class ApiTenantUserQueryParams {
      #region members
      public List<ApiTenantUserBoolFilter> boolFilters { get; set; }
    
      public List<ApiTenantUserDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ApiTenantUserSortField? sortField { get; set; }
    
      public List<ApiTenantUserStringFilter> stringFilters { get; set; }
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
    public enum ApiTenantUserSortField {
      CREATION_DATE,
      CREATION_USER_LABEL,
      IS_ENABLED,
      LAST_CONNECTION_DATE,
      NAME,
      TENANT_ID
    }
    
    
    #region ApiTenantUserStringFilter
    public class ApiTenantUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ApiTenantUserStringFilterField field { get; set; }
    
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
    public enum ApiTenantUserStringFilterField {
      CREATION_USER_ID,
      CREATION_USER_LABEL,
      NAME,
      TENANT_ID
    }
    
    
    #region ApiTenantUserTypeConnection
    public class ApiTenantUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ApiTenantUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ArchiveConfiguration
    public class ArchiveConfiguration {
      #region members
      [JsonProperty("archiveMetadata")]
      public bool archiveMetadata { get; set; }
    
      [JsonProperty("billingMode")]
      public ArchiveConfigurationBillingMode billingMode { get; set; }
    
      [JsonProperty("durationInMonth")]
      public int durationInMonth { get; set; }
    
      [JsonProperty("provider")]
      public ArchiverProvider provider { get; set; }
      #endregion
    }
    #endregion
    public enum ArchiveConfigurationBillingMode {
      FILES,
      GIGA
    }
    
    
    #region ArchiveConfigurationInput
    public class ArchiveConfigurationInput {
      #region members
      [Required]
      [JsonRequired]
      public bool archiveMetadata { get; set; }
    
      [Required]
      [JsonRequired]
      public ArchiveConfigurationBillingMode billingMode { get; set; }
    
      [Required]
      [JsonRequired]
      public int durationInMonth { get; set; }
    
      [Required]
      [JsonRequired]
      public ArchiverProvider provider { get; set; }
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
    public enum ArchiverProvider {
      DOCOON,
      XELIANS
    }
    
    public enum ArrayElementFilterOperator {
      BETWEEN,
      CONTAIN,
      DEFINED,
      END_WITH,
      EQUAL,
      EQUAL_OR_UNDEFINED,
      GREATER_THAN,
      GREATER_THAN_OR_EQUAL,
      IN_ARRAY,
      IS_NOT_NULL,
      IS_NULL,
      LOWER_THAN,
      LOWER_THAN_OR_EQUAL,
      NOT_CONTAIN,
      NOT_END_WITH,
      NOT_EQUAL,
      NOT_START_WITH,
      START_WITH,
      UNDEFINED
    }
    
    
    #region AttachmentInput
    public class AttachmentInput {
      #region members
      public DocumentTransmissionMode? documentTransmissionMode { get; set; }
    
      public string existingDocumentId { get; set; }
    
      public DocumentInput newDocument { get; set; }
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
    
    
    #region BusinessSchemaMutation
    public class BusinessSchemaMutation {
      #region members
      [JsonProperty("addApiDomainUser")]
      public ApiDomainUser addApiDomainUser { get; set; }
    
      [JsonProperty("addApiEnvironmentUser")]
      public ApiEnvironmentUser addApiEnvironmentUser { get; set; }
    
      [JsonProperty("addApiTenantUser")]
      public ApiTenantUser addApiTenantUser { get; set; }
    
      [JsonProperty("addContact")]
      public Contact addContact { get; set; }
    
      [JsonProperty("addContactFunction")]
      public ContactFunction addContactFunction { get; set; }
    
      [JsonProperty("addDashboardRight")]
      public DashboardRight addDashboardRight { get; set; }
    
      [JsonProperty("addDocumentJob")]
      public JobCreationResult addDocumentJob { get; set; }
    
      [JsonProperty("addDocumentProbativeJob")]
      public JobCreationResult addDocumentProbativeJob { get; set; }
    
      [JsonProperty("addDocumentType")]
      public DocumentType addDocumentType { get; set; }
    
      [JsonProperty("addDocumentTypeMetadata")]
      public DocumentType addDocumentTypeMetadata { get; set; }
    
      [JsonProperty("addDomainUser")]
      public DomainUser addDomainUser { get; set; }
    
      [JsonProperty("addEmailJob")]
      public JobResult addEmailJob { get; set; }
    
      [JsonProperty("addEnvironmentUser")]
      public EnvironmentUser addEnvironmentUser { get; set; }
    
      [JsonProperty("addFaxJob")]
      public JobResult addFaxJob { get; set; }
    
      [JsonProperty("addHostedDocumentFile")]
      public FileContent addHostedDocumentFile { get; set; }
    
      [JsonProperty("addHostedListFile")]
      public FileContent addHostedListFile { get; set; }
    
      [JsonProperty("addListOfValues")]
      public ListOfValues addListOfValues { get; set; }
    
      [JsonProperty("addMetadata")]
      public Metadata addMetadata { get; set; }
    
      [JsonProperty("addNote")]
      public Note addNote { get; set; }
    
      [JsonProperty("addPostalJob")]
      public JobCreationResult addPostalJob { get; set; }
    
      [JsonProperty("addPowerBiAuthToken")]
      public PowerBiAuthToken addPowerBiAuthToken { get; set; }
    
      [JsonProperty("addPushJob")]
      public JobResult addPushJob { get; set; }
    
      [JsonProperty("addService")]
      public Service addService { get; set; }
    
      [JsonProperty("addSmsJob")]
      public JobResult addSmsJob { get; set; }
    
      [JsonProperty("addTemporaryDocument")]
      public TemporaryDocumentContent addTemporaryDocument { get; set; }
    
      [JsonProperty("addTenantUser")]
      public TenantUser addTenantUser { get; set; }
    
      [JsonProperty("addThirdParty")]
      public ThirdParty addThirdParty { get; set; }
    
      [JsonProperty("addThirdPartyType")]
      public ThirdPartyType addThirdPartyType { get; set; }
    
      [JsonProperty("addValueOfList")]
      public ValueOfList addValueOfList { get; set; }
    
      [JsonProperty("addVoiceJob")]
      public JobResult addVoiceJob { get; set; }
    
      [JsonProperty("deleteContact")]
      public any deleteContact { get; set; }
    
      [JsonProperty("deleteContactFunction")]
      public any deleteContactFunction { get; set; }
    
      [JsonProperty("deleteDashboardRight")]
      public any deleteDashboardRight { get; set; }
    
      [JsonProperty("deleteDocumentType")]
      public any deleteDocumentType { get; set; }
    
      [JsonProperty("deleteDocumentTypeMetadata")]
      public any deleteDocumentTypeMetadata { get; set; }
    
      [JsonProperty("deleteHostedDocumentFile")]
      public any deleteHostedDocumentFile { get; set; }
    
      [JsonProperty("deleteHostedInboundFile")]
      public any deleteHostedInboundFile { get; set; }
    
      [JsonProperty("deleteHostedListFile")]
      public any deleteHostedListFile { get; set; }
    
      [JsonProperty("deleteHostedReportFile")]
      public any deleteHostedReportFile { get; set; }
    
      [JsonProperty("deleteListOfValues")]
      public any deleteListOfValues { get; set; }
    
      [JsonProperty("deleteMetadata")]
      public any deleteMetadata { get; set; }
    
      [JsonProperty("deleteNote")]
      public any deleteNote { get; set; }
    
      [JsonProperty("deleteService")]
      public any deleteService { get; set; }
    
      [JsonProperty("deleteTemporaryDocument")]
      public any deleteTemporaryDocument { get; set; }
    
      [JsonProperty("deleteThirdParty")]
      public any deleteThirdParty { get; set; }
    
      [JsonProperty("deleteThirdPartyType")]
      public any deleteThirdPartyType { get; set; }
    
      [JsonProperty("deleteValueOfList")]
      public any deleteValueOfList { get; set; }
    
      [JsonProperty("editApiDomainUser")]
      public ApiDomainUser editApiDomainUser { get; set; }
    
      [JsonProperty("editApiDomainUserRight")]
      public List<DomainRightValue> editApiDomainUserRight { get; set; }
    
      [JsonProperty("editApiEnvironmentUser")]
      public ApiEnvironmentUser editApiEnvironmentUser { get; set; }
    
      [JsonProperty("editApiEnvironmentUserRight")]
      public List<EnvironmentRightValue> editApiEnvironmentUserRight { get; set; }
    
      [JsonProperty("editApiTenantUser")]
      public ApiTenantUser editApiTenantUser { get; set; }
    
      [JsonProperty("editApiTenantUserRight")]
      public List<TenantRightValue> editApiTenantUserRight { get; set; }
    
      [JsonProperty("editContact")]
      public Contact editContact { get; set; }
    
      [JsonProperty("editContactFunction")]
      public ContactFunction editContactFunction { get; set; }
    
      [JsonProperty("editDocumentType")]
      public DocumentType editDocumentType { get; set; }
    
      [JsonProperty("editDocumentTypeMetadata")]
      public DocumentType editDocumentTypeMetadata { get; set; }
    
      [JsonProperty("editDomainUser")]
      public DomainUser editDomainUser { get; set; }
    
      [JsonProperty("editDomainUserRight")]
      public List<DomainRightValue> editDomainUserRight { get; set; }
    
      [JsonProperty("editEnvironmentUser")]
      public EnvironmentUser editEnvironmentUser { get; set; }
    
      [JsonProperty("editEnvironmentUserRight")]
      public List<EnvironmentRightValue> editEnvironmentUserRight { get; set; }
    
      [JsonProperty("editErrorQueueMessage")]
      public ErrorQueueMessage editErrorQueueMessage { get; set; }
    
      [JsonProperty("editListOfValues")]
      public ListOfValues editListOfValues { get; set; }
    
      [JsonProperty("editMetadata")]
      public Metadata editMetadata { get; set; }
    
      [JsonProperty("editNote")]
      public Note editNote { get; set; }
    
      [JsonProperty("editService")]
      public Service editService { get; set; }
    
      [JsonProperty("editTenantUser")]
      public TenantUser editTenantUser { get; set; }
    
      [JsonProperty("editTenantUserRight")]
      public List<TenantRightValue> editTenantUserRight { get; set; }
    
      [JsonProperty("editThirdParty")]
      public ThirdParty editThirdParty { get; set; }
    
      [JsonProperty("editThirdPartyType")]
      public ThirdPartyType editThirdPartyType { get; set; }
    
      [JsonProperty("editValueOfList")]
      public ValueOfList editValueOfList { get; set; }
    
      [JsonProperty("readDocument")]
      public any readDocument { get; set; }
    
      [JsonProperty("relaunchJobMessage")]
      public any relaunchJobMessage { get; set; }
    
      [JsonProperty("renewApiDomainUser")]
      public ApiDomainUser renewApiDomainUser { get; set; }
    
      [JsonProperty("renewApiEnvironmentUser")]
      public ApiEnvironmentUser renewApiEnvironmentUser { get; set; }
    
      [JsonProperty("renewApiTenantUser")]
      public ApiTenantUser renewApiTenantUser { get; set; }
    
      [JsonProperty("resendInviteDomainUser")]
      public any resendInviteDomainUser { get; set; }
    
      [JsonProperty("resendInviteEnvironmentUser")]
      public any resendInviteEnvironmentUser { get; set; }
    
      [JsonProperty("resendInviteTenantUser")]
      public any resendInviteTenantUser { get; set; }
    
      [JsonProperty("runActionOnDocument")]
      public any runActionOnDocument { get; set; }
    
      [JsonProperty("runActionOnJob")]
      public any runActionOnJob { get; set; }
    
      [JsonProperty("runActionOnJobMessage")]
      public any runActionOnJobMessage { get; set; }
    
      [JsonProperty("validateDomainUser")]
      public DomainUser validateDomainUser { get; set; }
    
      [JsonProperty("validateEnvironmentUser")]
      public EnvironmentUser validateEnvironmentUser { get; set; }
    
      [JsonProperty("validateTenantUser")]
      public TenantUser validateTenantUser { get; set; }
      #endregion
    }
    #endregion
    
    #region BusinessSchemaQuery
    public class BusinessSchemaQuery {
      #region members
      [JsonProperty("activityItems")]
      public List<Activity> activityItems { get; set; }
    
      [JsonProperty("activityList")]
      public ActivityTypeConnection activityList { get; set; }
    
      [JsonProperty("apiDomainUserItems")]
      public List<ApiDomainUser> apiDomainUserItems { get; set; }
    
      [JsonProperty("apiDomainUserList")]
      public ApiDomainUserTypeConnection apiDomainUserList { get; set; }
    
      [JsonProperty("apiDomainUserRightList")]
      public DomainRightValueTypeConnection apiDomainUserRightList { get; set; }
    
      [JsonProperty("apiEnvironmentUserItems")]
      public List<ApiEnvironmentUser> apiEnvironmentUserItems { get; set; }
    
      [JsonProperty("apiEnvironmentUserList")]
      public ApiEnvironmentUserTypeConnection apiEnvironmentUserList { get; set; }
    
      [JsonProperty("apiEnvironmentUserRightList")]
      public EnvironmentRightValueTypeConnection apiEnvironmentUserRightList { get; set; }
    
      [JsonProperty("apiTenantUserItems")]
      public List<ApiTenantUser> apiTenantUserItems { get; set; }
    
      [JsonProperty("apiTenantUserList")]
      public ApiTenantUserTypeConnection apiTenantUserList { get; set; }
    
      [JsonProperty("apiTenantUserRightList")]
      public TenantRightValueTypeConnection apiTenantUserRightList { get; set; }
    
      [JsonProperty("chorusB2GProvidersList")]
      public List<ChorusProviderIdName> chorusB2GProvidersList { get; set; }
    
      [JsonProperty("clickedLinkDocumentItems")]
      public ClickedLinkDocument clickedLinkDocumentItems { get; set; }
    
      [JsonProperty("contactFunctionItems")]
      public List<ContactFunction> contactFunctionItems { get; set; }
    
      [JsonProperty("contactFunctionList")]
      public ContactFunctionTypeConnection contactFunctionList { get; set; }
    
      [JsonProperty("contactFunctionSystemList")]
      public ContactFunctionTypeConnection contactFunctionSystemList { get; set; }
    
      [JsonProperty("contactItems")]
      public List<Contact> contactItems { get; set; }
    
      [JsonProperty("contactList")]
      public ContactTypeConnection contactList { get; set; }
    
      [JsonProperty("dashboardItems")]
      public List<Dashboard> dashboardItems { get; set; }
    
      [JsonProperty("dashboardList")]
      public DashboardTypeConnection dashboardList { get; set; }
    
      [JsonProperty("dashboardRightItems")]
      public List<DashboardRight> dashboardRightItems { get; set; }
    
      [JsonProperty("dashboardRightList")]
      public DashboardRightTypeConnection dashboardRightList { get; set; }
    
      [JsonProperty("documentCountStatisticsList")]
      public List<DocumentCountStatistics> documentCountStatisticsList { get; set; }
    
      [JsonProperty("documentItems")]
      public List<Document> documentItems { get; set; }
    
      [JsonProperty("documentJobItems")]
      public List<DocumentJob> documentJobItems { get; set; }
    
      [JsonProperty("documentJobList")]
      public DocumentJobTypeConnection documentJobList { get; set; }
    
      [JsonProperty("documentList")]
      public DocumentTypeConnection documentList { get; set; }
    
      [JsonProperty("documentProbativeJobItems")]
      public List<DocumentProbativeJob> documentProbativeJobItems { get; set; }
    
      [JsonProperty("documentProbativeJobList")]
      public DocumentProbativeJobTypeConnection documentProbativeJobList { get; set; }
    
      [JsonProperty("documentSizeStatistics")]
      public DocumentSizeStatistics documentSizeStatistics { get; set; }
    
      [JsonProperty("documentSubTypeItems")]
      public List<DocumentSubType> documentSubTypeItems { get; set; }
    
      [JsonProperty("documentSubTypeList")]
      public DocumentSubTypeTypeConnection documentSubTypeList { get; set; }
    
      [JsonProperty("documentTypeItems")]
      public List<DocumentType> documentTypeItems { get; set; }
    
      [JsonProperty("documentTypeList")]
      public DocumentTypeTypeConnection documentTypeList { get; set; }
    
      [JsonProperty("domainUserItems")]
      public List<DomainUser> domainUserItems { get; set; }
    
      [JsonProperty("domainUserList")]
      public DomainUserTypeConnection domainUserList { get; set; }
    
      [JsonProperty("domainUserRightList")]
      public DomainRightValueTypeConnection domainUserRightList { get; set; }
    
      [JsonProperty("environmentUserItems")]
      public List<EnvironmentUser> environmentUserItems { get; set; }
    
      [JsonProperty("environmentUserList")]
      public EnvironmentUserTypeConnection environmentUserList { get; set; }
    
      [JsonProperty("environmentUserRightList")]
      public EnvironmentRightValueTypeConnection environmentUserRightList { get; set; }
    
      [JsonProperty("errorQueueMessageItems")]
      public List<ErrorQueueMessage> errorQueueMessageItems { get; set; }
    
      [JsonProperty("errorQueueMessageList")]
      public ErrorQueueMessageTypeConnection errorQueueMessageList { get; set; }
    
      [JsonProperty("hostedDocumentFileItems")]
      public List<FileContent> hostedDocumentFileItems { get; set; }
    
      [JsonProperty("hostedDocumentFileList")]
      public FileHeaderTypeConnection hostedDocumentFileList { get; set; }
    
      [JsonProperty("hostedInboundFileItems")]
      public List<FileContent> hostedInboundFileItems { get; set; }
    
      [JsonProperty("hostedInboundFileList")]
      public FileHeaderTypeConnection hostedInboundFileList { get; set; }
    
      [JsonProperty("hostedListFileItems")]
      public List<FileContent> hostedListFileItems { get; set; }
    
      [JsonProperty("hostedListFileList")]
      public FileHeaderTypeConnection hostedListFileList { get; set; }
    
      [JsonProperty("hostedReportFileItems")]
      public List<FileContent> hostedReportFileItems { get; set; }
    
      [JsonProperty("hostedReportFileList")]
      public FileHeaderTypeConnection hostedReportFileList { get; set; }
    
      [JsonProperty("inboundFaxList")]
      public InboundFaxTypeConnection inboundFaxList { get; set; }
    
      [JsonProperty("inboundSmsList")]
      public InboundSmsTypeConnection inboundSmsList { get; set; }
    
      [JsonProperty("jobItemItems")]
      public List<JobItem> jobItemItems { get; set; }
    
      [JsonProperty("jobItemList")]
      public JobItemTypeConnection jobItemList { get; set; }
    
      [JsonProperty("jobItems")]
      public List<Job> jobItems { get; set; }
    
      [JsonProperty("jobList")]
      public JobTypeConnection jobList { get; set; }
    
      [JsonProperty("jobMessageItems")]
      public List<JobMessage> jobMessageItems { get; set; }
    
      [JsonProperty("jobMessageList")]
      public JobMessageTypeConnection jobMessageList { get; set; }
    
      [JsonProperty("jobSummaryItems")]
      public List<JobSummary> jobSummaryItems { get; set; }
    
      [JsonProperty("jobSummaryList")]
      public JobSummaryTypeConnection jobSummaryList { get; set; }
    
      [JsonProperty("listOfValuesItems")]
      public List<ListOfValues> listOfValuesItems { get; set; }
    
      [JsonProperty("listOfValuesList")]
      public ListOfValuesTypeConnection listOfValuesList { get; set; }
    
      [JsonProperty("listOfValuesSystemList")]
      public ListOfValuesTypeConnection listOfValuesSystemList { get; set; }
    
      [JsonProperty("metadataItems")]
      public List<Metadata> metadataItems { get; set; }
    
      [JsonProperty("metadataList")]
      public MetadataTypeConnection metadataList { get; set; }
    
      [JsonProperty("metadataSystemList")]
      public MetadataTypeConnection metadataSystemList { get; set; }
    
      [JsonProperty("natureItems")]
      public List<Nature> natureItems { get; set; }
    
      [JsonProperty("natureList")]
      public NatureTypeConnection natureList { get; set; }
    
      [JsonProperty("noteItems")]
      public List<Note> noteItems { get; set; }
    
      [JsonProperty("noteList")]
      public NoteTypeConnection noteList { get; set; }
    
      [JsonProperty("postalJobItems")]
      public List<PostalJob> postalJobItems { get; set; }
    
      [JsonProperty("postalJobList")]
      public PostalJobTypeConnection postalJobList { get; set; }
    
      [JsonProperty("processingJobCountStatistics")]
      public JobCountStatistics processingJobCountStatistics { get; set; }
    
      [JsonProperty("rightInitialValueList")]
      public RightInitialValueTypeConnection rightInitialValueList { get; set; }
    
      [JsonProperty("schema")]
      public string schema { get; set; }
    
      [JsonProperty("serviceItems")]
      public List<Service> serviceItems { get; set; }
    
      [JsonProperty("serviceList")]
      public ServiceTypeConnection serviceList { get; set; }
    
      [JsonProperty("temporaryDocumentItems")]
      public List<TemporaryDocumentContent> temporaryDocumentItems { get; set; }
    
      [JsonProperty("temporaryDocumentList")]
      public TemporaryDocumentHeaderTypeConnection temporaryDocumentList { get; set; }
    
      [JsonProperty("tenantUserItems")]
      public List<TenantUser> tenantUserItems { get; set; }
    
      [JsonProperty("tenantUserList")]
      public TenantUserTypeConnection tenantUserList { get; set; }
    
      [JsonProperty("tenantUserRightList")]
      public TenantRightValueTypeConnection tenantUserRightList { get; set; }
    
      [JsonProperty("test")]
      public string test { get; set; }
    
      [JsonProperty("thirdPartyItems")]
      public List<ThirdParty> thirdPartyItems { get; set; }
    
      [JsonProperty("thirdPartyList")]
      public ThirdPartyTypeConnection thirdPartyList { get; set; }
    
      [JsonProperty("thirdPartyTypeItems")]
      public List<ThirdPartyType> thirdPartyTypeItems { get; set; }
    
      [JsonProperty("thirdPartyTypeList")]
      public ThirdPartyTypeTypeConnection thirdPartyTypeList { get; set; }
    
      [JsonProperty("thirdPartyTypeSystemList")]
      public ThirdPartyTypeTypeConnection thirdPartyTypeSystemList { get; set; }
    
      [JsonProperty("valueOfListItems")]
      public List<ValueOfList> valueOfListItems { get; set; }
    
      [JsonProperty("valueOfListList")]
      public ValueOfListTypeConnection valueOfListList { get; set; }
    
      [JsonProperty("valueOfListSystemList")]
      public ValueOfListTypeConnection valueOfListSystemList { get; set; }
      #endregion
    }
    #endregion
    
    #region ChorusB2GAddress
    public class ChorusB2GAddress {
      #region members
      [JsonProperty("name")]
      public string name { get; set; }
      #endregion
    }
    #endregion
    
    #region ChorusB2GAdhocRecipientInput
    public class ChorusB2GAdhocRecipientInput {
      #region members
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
    public enum ChorusB2GErrorType {
      INVALID_ATTACHMENT_TYPE,
      INVALID_EXEMPTION_REASON,
      INVALID_SERVICE_CODE,
      INVALID_SIRET,
      INVALID_STRUCTURE,
      INVOICE_ALREADY_EXISTS,
      MISSING_ATTACHMENT_TYPE,
      MISSING_CHORUS_PROVIDER_ID,
      MISSING_CURRENCY,
      MISSING_DISCOUNT_REASON,
      MISSING_EXEMPTION_REASON,
      MISSING_GRAND_TOTAL_AMOUNT,
      MISSING_INVOICE_DATE,
      MISSING_INVOICE_NUMBER,
      MISSING_ORIGINAL_INVOICE_NUMBER,
      MISSING_PURCHASE_ORDER_NUMBER,
      MISSING_SERVICE_CODE,
      MISSING_SERVICE_CODE_OR_PURCHASE_ORDER_NUMBER,
      MISSING_SIRET,
      MISSING_TAX_DUE_DATE_TYPE,
      MISSING_TAX_TOTAL_AMOUNT,
      MISSING_VALIDER_INFORMATIONS,
      MISSING_VAT_INFORMATIONS,
      RECEIVER_IS_ONLY_MOA,
      UNKNOWN_ERROR
    }
    
    
    #region ChorusB2GValidationError
    public class ChorusB2GValidationError {
      #region members
      [JsonProperty("errorString")]
      public string errorString { get; set; }
    
      [JsonProperty("errorType")]
      public ChorusB2GErrorType errorType { get; set; }
      #endregion
    }
    #endregion
    
    #region ChorusProviderIdName
    public class ChorusProviderIdName {
      #region members
      [JsonProperty("providerId")]
      public string providerId { get; set; }
    
      [JsonProperty("providerName")]
      public string providerName { get; set; }
      #endregion
    }
    #endregion
    public enum ChorusServerType {
      PROD,
      QUALIF
    }
    
    
    #region ClickedLinkDocument
    public class ClickedLinkDocument {
      #region members
      [JsonProperty("content")]
      public string content { get; set; }
    
      [JsonProperty("documentId")]
      public string documentId { get; set; }
    
      [JsonProperty("documentName")]
      public string documentName { get; set; }
    
      [JsonProperty("expirationDate")]
      public any expirationDate { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isCountExpired")]
      public bool isCountExpired { get; set; }
    
      [JsonProperty("jobId")]
      public string jobId { get; set; }
    
      [JsonProperty("jobMessageId")]
      public string jobMessageId { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
      #endregion
    }
    #endregion
    
    #region Contact
    public class Contact {
      #region members
      [JsonProperty("civility")]
      public string civility { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("culture")]
      public string culture { get; set; }
    
      [JsonProperty("documentTransmissionMode")]
      public DocumentTransmissionMode documentTransmissionMode { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("firstName")]
      public string firstName { get; set; }
    
      [JsonProperty("functionIds")]
      public List<string> functionIds { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("isFavorite")]
      public bool isFavorite { get; set; }
    
      [JsonProperty("isPrincipal")]
      public bool isPrincipal { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("lastName")]
      public string lastName { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("thirdPartyId")]
      public string thirdPartyId { get; set; }
    
      [JsonProperty("thirdPartyName")]
      public string thirdPartyName { get; set; }
    
      [JsonProperty("timeZone")]
      public string timeZone { get; set; }
      #endregion
    }
    #endregion
    
    #region ContactBoolFilter
    public class ContactBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ContactBoolFilterField field { get; set; }
    
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
    public enum ContactBoolFilterField {
      IS_ENABLED,
      IS_FAVORITE,
      IS_PRINCIPAL
    }
    
    
    #region ContactFunction
    public class ContactFunction {
      #region members
      [JsonProperty("code")]
      public string code { get; set; }
    
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
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public ContactFunctionOwnerType ownerType { get; set; }
      #endregion
    }
    #endregion
    
    #region ContactFunctionBoolFilter
    public class ContactFunctionBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ContactFunctionBoolFilterField field { get; set; }
    
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
    public enum ContactFunctionBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ContactFunctionInput
    public class ContactFunctionInput {
      #region members
      [Required]
      [JsonRequired]
      public string code { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public string ownerId { get; set; }
    
      [Required]
      [JsonRequired]
      public ContactFunctionOwnerType ownerType { get; set; }
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
    public enum ContactFunctionOwnerType {
      SYSTEM,
      TENANT
    }
    
    
    #region ContactFunctionQueryParams
    public class ContactFunctionQueryParams {
      #region members
      public List<ContactFunctionBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ContactFunctionSortField? sortField { get; set; }
    
      public List<ContactFunctionStringFilter> stringFilters { get; set; }
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
    public enum ContactFunctionSortField {
      CODE,
      IS_ENABLED,
      NAME,
      OWNER_TYPE
    }
    
    
    #region ContactFunctionStringFilter
    public class ContactFunctionStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ContactFunctionStringFilterField field { get; set; }
    
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
    public enum ContactFunctionStringFilterField {
      CODE,
      NAME
    }
    
    
    #region ContactFunctionTypeConnection
    public class ContactFunctionTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ContactFunction> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ContactInput
    public class ContactInput {
      #region members
      [Required]
      [JsonRequired]
      public string civility { get; set; }
    
      public string culture { get; set; }
    
      public DocumentTransmissionMode? documentTransmissionMode { get; set; }
    
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
      [Required]
      [JsonRequired]
      public string firstName { get; set; }
    
      public List<string> functionIds { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      public bool? isFavorite { get; set; }
    
      public bool? isPrincipal { get; set; }
    
      [Required]
      [JsonRequired]
      public string lastName { get; set; }
    
      [Required]
      [JsonRequired]
      public string phone { get; set; }
    
      [Required]
      [JsonRequired]
      public string thirdPartyId { get; set; }
    
      public string timeZone { get; set; }
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
    
    #region ContactQueryParams
    public class ContactQueryParams {
      #region members
      public List<ContactBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ContactSortField? sortField { get; set; }
    
      public List<ContactStringFilter> stringFilters { get; set; }
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
    
    #region ContactRecipientInput
    public class ContactRecipientInput {
      #region members
      [Required]
      [JsonRequired]
      public string contactId { get; set; }
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
    public enum ContactSortField {
      CIVILITY,
      CULTURE,
      DOCUMENT_TRANSMISSION_MODE,
      EMAIL,
      FIRST_NAME,
      IS_ENABLED,
      IS_FAVORITE,
      IS_PRINCIPAL,
      LAST_NAME,
      PHONE,
      THIRD_PARTY_ID,
      THIRD_PARTY_NAME,
      TIME_ZONE,
      USER_ID
    }
    
    
    #region ContactStringFilter
    public class ContactStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ContactStringFilterField field { get; set; }
    
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
    public enum ContactStringFilterField {
      EMAIL,
      FIRST_NAME,
      LAST_NAME,
      THIRD_PARTY_ID,
      THIRD_PARTY_NAME,
      USER_ID
    }
    
    
    #region ContactTypeConnection
    public class ContactTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Contact> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region Dashboard
    public class Dashboard {
      #region members
      [JsonProperty("dashboardType")]
      public string dashboardType { get; set; }
    
      [JsonProperty("dashboardVisibility")]
      public DashboardVisibilityType dashboardVisibility { get; set; }
    
      [JsonProperty("datasetId")]
      public string datasetId { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("reportId")]
      public string reportId { get; set; }
      #endregion
    }
    #endregion
    
    #region DashboardDashboardVisibilityTypeEnumFilter
    public class DashboardDashboardVisibilityTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public DashboardVisibilityFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public DashboardVisibilityType filterValue1 { get; set; }
    
      public DashboardVisibilityType? filterValue2 { get; set; }
    
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
    
    #region DashboardQueryParams
    public class DashboardQueryParams {
      #region members
      public List<DashboardDashboardVisibilityTypeEnumFilter> dashboardVisibilityFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public DashboardSortField? sortField { get; set; }
    
      public List<DashboardStringFilter> stringFilters { get; set; }
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
    
    #region DashboardRight
    public class DashboardRight {
      #region members
      [JsonProperty("dashboardType")]
      public string dashboardType { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("userId")]
      public string userId { get; set; }
      #endregion
    }
    #endregion
    
    #region DashboardRightInput
    public class DashboardRightInput {
      #region members
      [Required]
      [JsonRequired]
      public string dashboardType { get; set; }
    
      [Required]
      [JsonRequired]
      public string userId { get; set; }
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
    
    #region DashboardRightQueryParams
    public class DashboardRightQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public DashboardRightSortField? sortField { get; set; }
    
      public List<DashboardRightStringFilter> stringFilters { get; set; }
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
    public enum DashboardRightSortField {
      ID,
      USER_ID
    }
    
    
    #region DashboardRightStringFilter
    public class DashboardRightStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DashboardRightStringFilterField field { get; set; }
    
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
    public enum DashboardRightStringFilterField {
      USER_ID
    }
    
    
    #region DashboardRightTypeConnection
    public class DashboardRightTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DashboardRight> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum DashboardSortField {
      NAME
    }
    
    
    #region DashboardStringFilter
    public class DashboardStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DashboardStringFilterField field { get; set; }
    
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
    public enum DashboardStringFilterField {
      DASHBOARD_TYPE,
      NAME
    }
    
    
    #region DashboardTypeConnection
    public class DashboardTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Dashboard> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum DashboardVisibilityFilterField {
      DASHBOARD_VISIBILITY
    }
    
    public enum DashboardVisibilityType {
      INTERNAL,
      PUBLIC_CUSTOM,
      PUBLIC_STANDARD
    }
    
    
    #region Document
    public class Document {
      #region members
      [JsonProperty("archiveDate")]
      public any archiveDate { get; set; }
    
      [JsonProperty("archiveId")]
      public string archiveId { get; set; }
    
      [JsonProperty("archiver")]
      public ArchiverProvider? archiver { get; set; }
    
      [JsonProperty("attachmentIds")]
      public List<string> attachmentIds { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("documentSubTypeCode")]
      public string documentSubTypeCode { get; set; }
    
      [JsonProperty("documentTypeCode")]
      public string documentTypeCode { get; set; }
    
      [JsonProperty("fileContent")]
      public string fileContent { get; set; }
    
      [JsonProperty("fileName")]
      public string fileName { get; set; }
    
      [JsonProperty("hash")]
      public string hash { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobIds")]
      public List<string> jobIds { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("metadata")]
      public List<KeyValue> metadata { get; set; }
    
      [JsonProperty("readDate")]
      public any readDate { get; set; }
    
      [JsonProperty("sentDate")]
      public any sentDate { get; set; }
    
      [JsonProperty("signRequired")]
      public bool signRequired { get; set; }
    
      [JsonProperty("signType")]
      public DocumentTypeSignType? signType { get; set; }
    
      [JsonProperty("signedDate")]
      public any signedDate { get; set; }
    
      [JsonProperty("status")]
      public DocumentStatus status { get; set; }
    
      [JsonProperty("subStatus")]
      public DocumentSubStatus? subStatus { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("typedMetadata")]
      public List<KeyMultipleTypeValue> typedMetadata { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentActionOptions
    public class DocumentActionOptions {
      #region members
      [Required]
      [JsonRequired]
      public DocumentActionType action { get; set; }
    
      public List<AttachmentInput> attachments { get; set; }
    
      public string comment { get; set; }
    
      public List<GedFieldInput> metadata { get; set; }
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
    public enum DocumentActionType {
      CANCEL,
      CANCEL_DOCUMENT_LINK,
      COMPLETE,
      EDIT_METADATA,
      RESEND
    }
    
    public enum DocumentArrayElementFilterField {
      METADATA
    }
    
    
    #region DocumentBoolFilter
    public class DocumentBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentBooleanFilterField field { get; set; }
    
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
    public enum DocumentBooleanFilterField {
      IS_READ,
      IS_SENT,
      IS_SIGNED
    }
    
    
    #region DocumentCountStatistics
    public class DocumentCountStatistics {
      #region members
      [JsonProperty("count")]
      public any count { get; set; }
    
      [JsonProperty("documentTypeCode")]
      public string documentTypeCode { get; set; }
    
      [JsonProperty("month")]
      public int month { get; set; }
    
      [JsonProperty("year")]
      public int year { get; set; }
      #endregion
    }
    #endregion
    public enum DocumentCountStatisticsCycleFilterField {
      CYCLE
    }
    
    
    #region DocumentCountStatisticsDateFilter
    public class DocumentCountStatisticsDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentCountStatisticsDateFilterField field { get; set; }
    
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
    public enum DocumentCountStatisticsDateFilterField {
      FIRST_JOB_DATE
    }
    
    
    #region DocumentCountStatisticsNatureCycleEnumFilter
    public class DocumentCountStatisticsNatureCycleEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentCountStatisticsCycleFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public NatureCycle filterValue1 { get; set; }
    
      public NatureCycle? filterValue2 { get; set; }
    
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
    
    #region DocumentCountStatisticsQueryParams
    public class DocumentCountStatisticsQueryParams {
      #region members
      public List<DocumentCountStatisticsNatureCycleEnumFilter> cycleFilters { get; set; }
    
      public List<DocumentCountStatisticsDateFilter> dateFilters { get; set; }
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
    
    #region DocumentDateFilter
    public class DocumentDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentDateFilterField field { get; set; }
    
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
    public enum DocumentDateFilterField {
      CREATION_DATE,
      READ_DATE,
      SENT_DATE,
      SIGN_DATE
    }
    
    
    #region DocumentDocumentArrayElementFilterFieldArrayElementFilter
    public class DocumentDocumentArrayElementFilterFieldArrayElementFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentArrayElementFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public string filterArrayElementName { get; set; }
    
      public bool? filterBoolValue1 { get; set; }
    
      public bool? filterBoolValue2 { get; set; }
    
      public any filterDateValue1 { get; set; }
    
      public any filterDateValue2 { get; set; }
    
      public double? filterDoubleValue1 { get; set; }
    
      public double? filterDoubleValue2 { get; set; }
    
      public int? filterIntValue1 { get; set; }
    
      public int? filterIntValue2 { get; set; }
    
      public string filterStringValue1 { get; set; }
    
      public string filterStringValue2 { get; set; }
    
      [Required]
      [JsonRequired]
      public ArrayElementFilterOperator @operator { get; set; }
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
    
    #region DocumentDocumentStatusEnumFilter
    public class DocumentDocumentStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentStatus filterValue1 { get; set; }
    
      public DocumentStatus? filterValue2 { get; set; }
    
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
    
    #region DocumentDocumentTypeSignTypeEnumFilter
    public class DocumentDocumentTypeSignTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentSignTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentTypeSignType filterValue1 { get; set; }
    
      public DocumentTypeSignType? filterValue2 { get; set; }
    
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
    
    #region DocumentIdOrNewInput
    public class DocumentIdOrNewInput {
      #region members
      public string existingDocumentId { get; set; }
    
      public DocumentInput newDocument { get; set; }
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
    
    #region DocumentInfo
    public class DocumentInfo {
      #region members
      [JsonProperty("hash")]
      public string hash { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentInput
    public class DocumentInput {
      #region members
      public string base64 { get; set; }
    
      public string documentSubTypeCode { get; set; }
    
      [Required]
      [JsonRequired]
      public string documentTypeCode { get; set; }
    
      [Required]
      [JsonRequired]
      public string fileName { get; set; }
    
      public List<GedFieldInput> gedFields { get; set; }
    
      public string gedXml { get; set; }
    
      public string hash { get; set; }
    
      public string tempFileId { get; set; }
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
    
    #region DocumentJob
    public class DocumentJob {
      #region members
      [JsonProperty("attachmentIds")]
      public List<string> attachmentIds { get; set; }
    
      [JsonProperty("completedDate")]
      public any completedDate { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("documentIds")]
      public List<string> documentIds { get; set; }
    
      [JsonProperty("failedCount")]
      public int failedCount { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobType")]
      public JobBaseType? jobType { get; set; }
    
      [JsonProperty("note")]
      public string note { get; set; }
    
      [JsonProperty("readCount")]
      public int readCount { get; set; }
    
      [JsonProperty("recipientCount")]
      public int recipientCount { get; set; }
    
      [JsonProperty("sentCount")]
      public int sentCount { get; set; }
    
      [JsonProperty("serviceId")]
      public string serviceId { get; set; }
    
      [JsonProperty("status")]
      public JobBaseStatus status { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
    
      [JsonProperty("validationType")]
      public DocumentJobValidationType validationType { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentJobDateFilter
    public class DocumentJobDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobDateFilterField field { get; set; }
    
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
    
    #region DocumentJobInput
    public class DocumentJobInput {
      #region members
      public List<FileIdOrBase64Input> adhocRecipientsFiles { get; set; }
    
      public List<AttachmentInput> attachments { get; set; }
    
      public ChorusB2GAdhocRecipientInput chorusB2GAdhocRecipient { get; set; }
    
      public List<ContactRecipientInput> contactRecipients { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentIdOrNewInput document { get; set; }
    
      public List<EmailAdhocRecipientInput> emailAdhocRecipients { get; set; }
    
      public string note { get; set; }
    
      public List<PostalAdhocRecipientInput> postalAdhocRecipients { get; set; }
    
      public string serviceId { get; set; }
    
      public List<ThirdPartyRecipientInput> thirdPartyRecipients { get; set; }
    
      public string trackingId { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentJobValidationType validationType { get; set; }
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
    
    #region DocumentJobJobBaseStatusEnumFilter
    public class DocumentJobJobBaseStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobBaseStatus filterValue1 { get; set; }
    
      public JobBaseStatus? filterValue2 { get; set; }
    
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
    
    #region DocumentJobQueryParams
    public class DocumentJobQueryParams {
      #region members
      public List<DocumentJobDateFilter> dateFilters { get; set; }
    
      public List<JobBaseJobBaseTypeEnumFilter> jobTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobSortField? sortField { get; set; }
    
      public List<DocumentJobJobBaseStatusEnumFilter> statusFilters { get; set; }
    
      public List<DocumentJobStringFilter> stringFilters { get; set; }
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
    
    #region DocumentJobStringFilter
    public class DocumentJobStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStringFilterField field { get; set; }
    
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
    
    #region DocumentJobTypeConnection
    public class DocumentJobTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DocumentJob> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum DocumentJobValidationType {
      FOR_NEW_THIRDPARTY,
      NONE,
      WITH_VALIDATION
    }
    
    
    #region DocumentProbativeJob
    public class DocumentProbativeJob {
      #region members
      [JsonProperty("attachmentsId")]
      public List<string> attachmentsId { get; set; }
    
      [JsonProperty("completedDate")]
      public any completedDate { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("documentsId")]
      public List<string> documentsId { get; set; }
    
      [JsonProperty("failedCount")]
      public int failedCount { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobType")]
      public JobBaseType? jobType { get; set; }
    
      [JsonProperty("joinedMessage")]
      public string joinedMessage { get; set; }
    
      [JsonProperty("note")]
      public string note { get; set; }
    
      [JsonProperty("recipientCount")]
      public int recipientCount { get; set; }
    
      [JsonProperty("registeredPostalOptions")]
      public RegisteredPostalOptions registeredPostalOptions { get; set; }
    
      [JsonProperty("sentCount")]
      public int sentCount { get; set; }
    
      [JsonProperty("serviceId")]
      public string serviceId { get; set; }
    
      [JsonProperty("status")]
      public JobBaseStatus status { get; set; }
    
      [JsonProperty("subject")]
      public string subject { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
    
      [JsonProperty("validationType")]
      public DocumentJobValidationType validationType { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentProbativeJobDateFilter
    public class DocumentProbativeJobDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobDateFilterField field { get; set; }
    
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
    
    #region DocumentProbativeJobInput
    public class DocumentProbativeJobInput {
      #region members
      public List<FileIdOrBase64Input> adhocRecipientsFiles { get; set; }
    
      public List<AttachmentInput> attachments { get; set; }
    
      public List<ContactRecipientInput> contactRecipients { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentIdOrNewInput document { get; set; }
    
      public List<EmailAdhocRecipientInput> emailAdhocRecipients { get; set; }
    
      public string joinedMessage { get; set; }
    
      public string note { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentProbativeJobType probativeType { get; set; }
    
      public RegisteredPostalOptionsInput registeredPostalOptions { get; set; }
    
      public string serviceId { get; set; }
    
      public string subject { get; set; }
    
      public List<ThirdPartyRecipientInput> thirdPartyRecipients { get; set; }
    
      public string trackingId { get; set; }
    
      [Required]
      [JsonRequired]
      public DocumentJobValidationType validationType { get; set; }
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
    
    #region DocumentProbativeJobJobBaseStatusEnumFilter
    public class DocumentProbativeJobJobBaseStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobBaseStatus filterValue1 { get; set; }
    
      public JobBaseStatus? filterValue2 { get; set; }
    
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
    
    #region DocumentProbativeJobQueryParams
    public class DocumentProbativeJobQueryParams {
      #region members
      public List<DocumentProbativeJobDateFilter> dateFilters { get; set; }
    
      public List<JobBaseJobBaseTypeEnumFilter> jobTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobSortField? sortField { get; set; }
    
      public List<DocumentProbativeJobJobBaseStatusEnumFilter> statusFilters { get; set; }
    
      public List<DocumentProbativeJobStringFilter> stringFilters { get; set; }
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
    
    #region DocumentProbativeJobStringFilter
    public class DocumentProbativeJobStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStringFilterField field { get; set; }
    
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
    public enum DocumentProbativeJobType {
      CERTIFIED,
      EIDAS_REGISTERED,
      REGISTERED,
      SIMPLE
    }
    
    
    #region DocumentProbativeJobTypeConnection
    public class DocumentProbativeJobTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DocumentProbativeJob> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentQueryParams
    public class DocumentQueryParams {
      #region members
      public List<DocumentDocumentArrayElementFilterFieldArrayElementFilter> arrayElementFilters { get; set; }
    
      public List<DocumentBoolFilter> boolFilters { get; set; }
    
      public List<DocumentDateFilter> dateFilters { get; set; }
    
      public List<DocumentDocumentTypeSignTypeEnumFilter> signTypeFilters { get; set; }
    
      public string sortArrayElementName { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public DocumentSortField? sortField { get; set; }
    
      public List<DocumentDocumentStatusEnumFilter> statusFilters { get; set; }
    
      public List<DocumentStringFilter> stringFilters { get; set; }
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
    public enum DocumentSignTypeFilterField {
      SIGN_TYPE
    }
    
    
    #region DocumentSizeStatistics
    public class DocumentSizeStatistics {
      #region members
      [JsonProperty("size")]
      public any size { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentSizeStatisticsDateFilter
    public class DocumentSizeStatisticsDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentSizeStatisticsDateFilterField field { get; set; }
    
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
    public enum DocumentSizeStatisticsDateFilterField {
      FIRST_JOB_DATE
    }
    
    
    #region DocumentSizeStatisticsQueryParams
    public class DocumentSizeStatisticsQueryParams {
      #region members
      public List<DocumentSizeStatisticsDateFilter> dateFilters { get; set; }
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
    public enum DocumentSortField {
      CREATION_DATE,
      FILE_NAME,
      ID,
      METADATA,
      READ_DATE,
      SENT_DATE,
      SIGN_DATE,
      SIGN_TYPE
    }
    
    public enum DocumentStatus {
      CANCELED,
      COMPLETED,
      DRAFT,
      ERROR,
      PROCESSING
    }
    
    public enum DocumentStatusFilterField {
      STATUS
    }
    
    
    #region DocumentStringFilter
    public class DocumentStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentStringFilterField field { get; set; }
    
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
    public enum DocumentStringFilterField {
      DOCUMENT_SUB_TYPE_CODE,
      DOCUMENT_TYPE_CODE,
      FILE_NAME,
      TENANT_ID
    }
    
    public enum DocumentSubStatus {
      APPROVED,
      CANCELED,
      COMPLETED,
      DISPUTE,
      DRAFT,
      ERROR,
      IN_HAND,
      MADE_AVAILABLE,
      PARTIALLY_APPROVED,
      PAYMENT_RECEIVED,
      PAYMENT_SENT,
      RECEIVED_BY_PLATFORM,
      REFUSED,
      REJECTED,
      SENT_BY_PLATFORM,
      SUBMITED,
      SUSPENDED
    }
    
    
    #region DocumentSubType
    public class DocumentSubType {
      #region members
      [JsonProperty("chorusAttachmentTypeCode")]
      public string chorusAttachmentTypeCode { get; set; }
    
      [JsonProperty("chorusAttachmentTypeId")]
      public string chorusAttachmentTypeId { get; set; }
    
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("natureCodes")]
      public List<string> natureCodes { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentSubTypeQueryParams
    public class DocumentSubTypeQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public DocumentSubTypeSortField? sortField { get; set; }
    
      public List<DocumentSubTypeStringFilter> stringFilters { get; set; }
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
    public enum DocumentSubTypeSortField {
      CHORUS_ATTACHMENT_TYPE_CODE,
      CHORUS_ATTACHMENT_TYPE_ID,
      CODE,
      CREATION_DATE,
      NAME
    }
    
    
    #region DocumentSubTypeStringFilter
    public class DocumentSubTypeStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentSubTypeStringFilterField field { get; set; }
    
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
    public enum DocumentSubTypeStringFilterField {
      CHORUS_ATTACHMENT_TYPE_CODE,
      CHORUS_ATTACHMENT_TYPE_ID,
      CODE,
      NAME,
      NATURE_CODES
    }
    
    
    #region DocumentSubTypeTypeConnection
    public class DocumentSubTypeTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DocumentSubType> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum DocumentTransmissionMode {
      EMAIL_WITH_ATTACHMENT,
      EMAIL_WITH_LINK,
      NONE
    }
    
    
    #region DocumentType
    public class DocumentType {
      #region members
      [JsonProperty("archiveConfiguration")]
      public ArchiveConfiguration archiveConfiguration { get; set; }
    
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("metadataConfigs")]
      public List<MetadataConfig> metadataConfigs { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("natureCode")]
      public string natureCode { get; set; }
    
      [JsonProperty("sign")]
      public DocumentTypeSignType? sign { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentTypeConnection
    public class DocumentTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Document> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region DocumentTypeInput
    public class DocumentTypeInput {
      #region members
      public ArchiveConfigurationInput archiveConfiguration { get; set; }
    
      [Required]
      [JsonRequired]
      public string code { get; set; }
    
      public string id { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public string natureCode { get; set; }
    
      public DocumentTypeSignType? sign { get; set; }
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
    
    #region DocumentTypeQueryParams
    public class DocumentTypeQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public DocumentTypeSortField? sortField { get; set; }
    
      public List<DocumentTypeStringFilter> stringFilters { get; set; }
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
    public enum DocumentTypeSignType {
      NONE,
      QUALIFIED_EIDAS_CERTIFICATE
    }
    
    public enum DocumentTypeSortField {
      CODE,
      CREATION_DATE,
      NAME,
      NATURE_CODE
    }
    
    
    #region DocumentTypeStringFilter
    public class DocumentTypeStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DocumentTypeStringFilterField field { get; set; }
    
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
    public enum DocumentTypeStringFilterField {
      CODE,
      NAME,
      NATURE_CODE
    }
    
    
    #region DocumentTypeTypeConnection
    public class DocumentTypeTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DocumentType> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
      /// <summary>
      /// The application rights for domain user.
      /// </summary>
    public enum DomainRightType {
      /// <summary>
      /// Create tenants
      /// </summary>
      ADD_TENANT,
      /// <summary>
      /// Create or edit configurations
      /// </summary>
      CHANGE_CONFIGURATION,
      /// <summary>
      /// Create, edit or delete dashboards
      /// </summary>
      CHANGE_DASHBOARD,
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
      /// Create or edit OMS resources
      /// </summary>
      CHANGE_OMS_RESOURCES,
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
      /// Get or list configurations
      /// </summary>
      READ_CONFIGURATION,
      /// <summary>
      /// Get or list dashboards
      /// </summary>
      READ_DASHBOARD,
      /// <summary>
      /// Get or list domains
      /// </summary>
      READ_DOMAIN,
      /// <summary>
      /// Get or list Domain Api users
      /// </summary>
      READ_DOMAIN_API_USER,
      /// <summary>
      /// Get or list OMS resources
      /// </summary>
      READ_OMS_RESOURCES,
      /// <summary>
      /// Get or list products
      /// </summary>
      READ_PRODUCT,
      /// <summary>
      /// Get or list product installs
      /// </summary>
      READ_PRODUCT_INSTALL,
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
      /// Synchronize EDC resources
      /// </summary>
      SYNCHRONIZE_EDC_RESOURCES,
      /// <summary>
      /// Validate invited user
      /// </summary>
      VALIDATE_USER
    }
    
    
    #region DomainRightValue
    public class DomainRightValue {
      #region members
      [JsonProperty("right")]
      public DomainRightType? right { get; set; }
    
      [JsonProperty("value")]
      public bool value { get; set; }
      #endregion
    }
    #endregion
    
    #region DomainRightValueInput
    public class DomainRightValueInput {
      #region members
      public DomainRightType? right { get; set; }
    
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
    
    #region DomainRightValueTypeConnection
    public class DomainRightValueTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DomainRightValue> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region DomainUser
    public class DomainUser {
      #region members
      [JsonProperty("civility")]
      public string civility { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("culture")]
      public string culture { get; set; }
    
      [JsonProperty("domainId")]
      public string domainId { get; set; }
    
      [JsonProperty("domainName")]
      public string domainName { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("firstName")]
      public string firstName { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("lastName")]
      public string lastName { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("timeZone")]
      public string timeZone { get; set; }
    
      [JsonProperty("userId")]
      public string userId { get; set; }
      #endregion
    }
    #endregion
    
    #region DomainUserBoolFilter
    public class DomainUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public DomainUserBoolFilterField field { get; set; }
    
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
    public enum DomainUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region DomainUserInput
    public class DomainUserInput {
      #region members
      public string civility { get; set; }
    
      public string culture { get; set; }
    
      [Required]
      [JsonRequired]
      public string domainId { get; set; }
    
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
      [Required]
      [JsonRequired]
      public string firstName { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string lastName { get; set; }
    
      public string phone { get; set; }
    
      public string timeZone { get; set; }
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
    
    #region DomainUserQueryParams
    public class DomainUserQueryParams {
      #region members
      public List<DomainUserBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public DomainUserSortField? sortField { get; set; }
    
      public List<DomainUserStringFilter> stringFilters { get; set; }
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
    public enum DomainUserSortField {
      CIVILITY,
      CULTURE,
      DOMAIN_ID,
      DOMAIN_NAME,
      EMAIL,
      FIRST_NAME,
      IS_ENABLED,
      LAST_NAME,
      PHONE,
      TIME_ZONE,
      USER_ID
    }
    
    
    #region DomainUserStringFilter
    public class DomainUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public DomainUserStringFilterField field { get; set; }
    
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
    public enum DomainUserStringFilterField {
      DOMAIN_ID,
      DOMAIN_NAME,
      EMAIL,
      FIRST_NAME,
      LAST_NAME,
      USER_ID
    }
    
    
    #region DomainUserTypeConnection
    public class DomainUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<DomainUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region EmailAdhocRecipientInput
    public class EmailAdhocRecipientInput {
      #region members
      [Required]
      [JsonRequired]
      public DocumentTransmissionMode documentTransmissionMode { get; set; }
    
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
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
    
    #region EmailJob
    public class EmailJob {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<FileIdOrNewInputType> attachments { get; set; }
    
      public bool? deDuplicate { get; set; }
    
      public List<EmailJobRecipient> emailAdhocRecipients { get; set; }
    
      public FileIdOrNewInputType emailAltBody { get; set; }
    
      public FileIdOrNewInputType emailBody { get; set; }
    
      public string jobType { get; set; }
    
      public EmailParameter parameter { get; set; }
    
      public any scheduledStartTime { get; set; }
    
      public string trackingId { get; set; }
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
    
    #region EmailJobRecipient
    public class EmailJobRecipient {
      #region members
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
      public string name { get; set; }
    
      public List<string> optionalFields { get; set; }
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
    
    #region EmailParameter
    public class EmailParameter {
      #region members
      public bool? activateAutoPull { get; set; }
    
      public bool? activateEmbeddedImageInHTML { get; set; }
    
      public bool? activateTracking { get; set; }
    
      public string envelopeSender { get; set; }
    
      public string from { get; set; }
    
      public string preHeader { get; set; }
    
      public EmailPriorityFlagType? priorityFlag { get; set; }
    
      public string replyTo { get; set; }
    
      public string subject { get; set; }
    
      public EmailTrackingType? trackingType { get; set; }
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
    public enum EmailPriorityFlagType {
      HIGH,
      LOW,
      STANDARD
    }
    
    public enum EmailTrackingType {
      ALL,
      CLICK_ONLY,
      OPEN_ONLY
    }
    
    public enum EngineEventAction {
      ACCEPT_ERE,
      ADD_ATTACHMENTS_DOCUMENT,
      ARCHIVE_DOCUMENT,
      CANCEL_DOCUMENT,
      CHANGE_STATUS_CHORUS_B_2_G,
      COMPLETE_CHORUS_B_2_G,
      CREATE_JOB,
      EDIT_METADATA_DOCUMENT,
      GENERATE_PROOF,
      LAUNCH_JOB,
      NOT_READ_ERE,
      PROCESS_JOB,
      READ_DOCUMENT,
      READ_ERE_NOTIFICATION,
      REFUSE_ERE,
      RELAUNCH_ERE,
      SEND_CHORUS_B_2_G,
      SEND_NOTIFICATION,
      SEND_POSTAL,
      SIGN_DOCUMENT,
      UNDELIVERED_POSTAL
    }
    
    public enum EnvelopeType {
      C_4,
      C_5,
      DL_2
    }
    
      /// <summary>
      /// The application rights for environment user.
      /// </summary>
    public enum EnvironmentRightType {
      /// <summary>
      /// Create, edit or delete contact functions
      /// </summary>
      CHANGE_CONTACT_FUNCTION,
      /// <summary>
      /// Create, edit or renew Environment Api users
      /// </summary>
      CHANGE_ENVIRONMENT_API_USER,
      /// <summary>
      /// Create or edit environment administrators
      /// </summary>
      CHANGE_ENVIRONMENT_USER,
      /// <summary>
      /// Create, edit or delete third party types
      /// </summary>
      CHANGE_THIRD_PARTY_TYPE,
      /// <summary>
      /// Get or list contact functions
      /// </summary>
      READ_CONTACT_FUNCTION,
      /// <summary>
      /// Get or list Environment Api users
      /// </summary>
      READ_ENVIRONMENT_API_USER,
      /// <summary>
      /// Get or list third party types
      /// </summary>
      READ_THIRD_PARTY_TYPE
    }
    
    
    #region EnvironmentRightValue
    public class EnvironmentRightValue {
      #region members
      [JsonProperty("right")]
      public EnvironmentRightType? right { get; set; }
    
      [JsonProperty("value")]
      public bool value { get; set; }
      #endregion
    }
    #endregion
    
    #region EnvironmentRightValueInput
    public class EnvironmentRightValueInput {
      #region members
      public EnvironmentRightType? right { get; set; }
    
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
    
    #region EnvironmentRightValueTypeConnection
    public class EnvironmentRightValueTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<EnvironmentRightValue> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region EnvironmentUser
    public class EnvironmentUser {
      #region members
      [JsonProperty("civility")]
      public string civility { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("culture")]
      public string culture { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("firstName")]
      public string firstName { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("lastName")]
      public string lastName { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("timeZone")]
      public string timeZone { get; set; }
    
      [JsonProperty("userId")]
      public string userId { get; set; }
      #endregion
    }
    #endregion
    
    #region EnvironmentUserBoolFilter
    public class EnvironmentUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public EnvironmentUserBoolFilterField field { get; set; }
    
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
    public enum EnvironmentUserBoolFilterField {
      IS_ENABLED
    }
    
    
    #region EnvironmentUserInput
    public class EnvironmentUserInput {
      #region members
      public string civility { get; set; }
    
      public string culture { get; set; }
    
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
      [Required]
      [JsonRequired]
      public string firstName { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string lastName { get; set; }
    
      public string phone { get; set; }
    
      public string timeZone { get; set; }
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
    
    #region EnvironmentUserQueryParams
    public class EnvironmentUserQueryParams {
      #region members
      public List<EnvironmentUserBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public EnvironmentUserSortField? sortField { get; set; }
    
      public List<EnvironmentUserStringFilter> stringFilters { get; set; }
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
    public enum EnvironmentUserSortField {
      CIVILITY,
      CULTURE,
      EMAIL,
      FIRST_NAME,
      IS_ENABLED,
      LAST_NAME,
      PHONE,
      TIME_ZONE,
      USER_ID
    }
    
    
    #region EnvironmentUserStringFilter
    public class EnvironmentUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public EnvironmentUserStringFilterField field { get; set; }
    
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
    public enum EnvironmentUserStringFilterField {
      EMAIL,
      FIRST_NAME,
      LAST_NAME,
      USER_ID
    }
    
    
    #region EnvironmentUserTypeConnection
    public class EnvironmentUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<EnvironmentUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ErrorQueueMessage
    public class ErrorQueueMessage {
      #region members
      [JsonProperty("action")]
      public EngineEventAction action { get; set; }
    
      [JsonProperty("errorCode")]
      public int errorCode { get; set; }
    
      [JsonProperty("errorFunctionName")]
      public string errorFunctionName { get; set; }
    
      [JsonProperty("errorMessage")]
      public string errorMessage { get; set; }
    
      [JsonProperty("errorServiceName")]
      public string errorServiceName { get; set; }
    
      [JsonProperty("errorStackTrace")]
      public string errorStackTrace { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobId")]
      public string jobId { get; set; }
    
      [JsonProperty("resourceId")]
      public string resourceId { get; set; }
    
      [JsonProperty("resourceType")]
      public ErrorQueueMessageResourceType? resourceType { get; set; }
    
      [JsonProperty("status")]
      public ErrorQueueMessageStatus status { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("tenantName")]
      public string tenantName { get; set; }
      #endregion
    }
    #endregion
    public enum ErrorQueueMessageActionFilterField {
      ACTION
    }
    
    
    #region ErrorQueueMessageEngineEventActionEnumFilter
    public class ErrorQueueMessageEngineEventActionEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ErrorQueueMessageActionFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public EngineEventAction filterValue1 { get; set; }
    
      public EngineEventAction? filterValue2 { get; set; }
    
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
    
    #region ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilter
    public class ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ErrorQueueMessageResourceTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public ErrorQueueMessageResourceType filterValue1 { get; set; }
    
      public ErrorQueueMessageResourceType? filterValue2 { get; set; }
    
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
    
    #region ErrorQueueMessageErrorQueueMessageStatusEnumFilter
    public class ErrorQueueMessageErrorQueueMessageStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public ErrorQueueMessageStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public ErrorQueueMessageStatus filterValue1 { get; set; }
    
      public ErrorQueueMessageStatus? filterValue2 { get; set; }
    
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
    
    #region ErrorQueueMessageInput
    public class ErrorQueueMessageInput {
      #region members
      [Required]
      [JsonRequired]
      public EngineEventAction action { get; set; }
    
      [Required]
      [JsonRequired]
      public int errorCode { get; set; }
    
      [Required]
      [JsonRequired]
      public string errorFunctionName { get; set; }
    
      [Required]
      [JsonRequired]
      public string errorMessage { get; set; }
    
      [Required]
      [JsonRequired]
      public string errorServiceName { get; set; }
    
      [Required]
      [JsonRequired]
      public string errorStackTrace { get; set; }
    
      [Required]
      [JsonRequired]
      public string id { get; set; }
    
      [Required]
      [JsonRequired]
      public string jobId { get; set; }
    
      [Required]
      [JsonRequired]
      public string resourceId { get; set; }
    
      [Required]
      [JsonRequired]
      public ErrorQueueMessageResourceType resourceType { get; set; }
    
      [Required]
      [JsonRequired]
      public ErrorQueueMessageStatus status { get; set; }
    
      [Required]
      [JsonRequired]
      public string tenantId { get; set; }
    
      [Required]
      [JsonRequired]
      public string tenantName { get; set; }
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
    
    #region ErrorQueueMessageIntFilter
    public class ErrorQueueMessageIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public ErrorQueueMessageIntFilterField field { get; set; }
    
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
    public enum ErrorQueueMessageIntFilterField {
      ERROR_CODE
    }
    
    
    #region ErrorQueueMessageQueryParams
    public class ErrorQueueMessageQueryParams {
      #region members
      public List<ErrorQueueMessageEngineEventActionEnumFilter> actionFilters { get; set; }
    
      public List<ErrorQueueMessageIntFilter> intFilters { get; set; }
    
      public List<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilter> resourceTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ErrorQueueMessageSortField? sortField { get; set; }
    
      public List<ErrorQueueMessageErrorQueueMessageStatusEnumFilter> statusFilters { get; set; }
    
      public List<ErrorQueueMessageStringFilter> stringFilters { get; set; }
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
    public enum ErrorQueueMessageResourceType {
      ARCHIVE_BATCH,
      DOCUMENT,
      JOB,
      JOB_MESSAGE
    }
    
    public enum ErrorQueueMessageResourceTypeFilterField {
      RESOURCE_TYPE
    }
    
    public enum ErrorQueueMessageSortField {
      ACTION,
      ERROR_CODE,
      ERROR_FUNCTION_NAME,
      ERROR_MESSAGE,
      ERROR_SERVICE_NAME,
      ERROR_STACK_TRACE,
      JOB_ID,
      RESOURCE_ID,
      RESOURCE_TYPE,
      STATUS,
      TENANT_ID,
      TENANT_NAME
    }
    
    public enum ErrorQueueMessageStatus {
      COMPLETED,
      IN_PROGRESS,
      TO_PROCESS
    }
    
    public enum ErrorQueueMessageStatusFilterField {
      STATUS
    }
    
    
    #region ErrorQueueMessageStringFilter
    public class ErrorQueueMessageStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ErrorQueueMessageStringFilterField field { get; set; }
    
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
    public enum ErrorQueueMessageStringFilterField {
      ERROR_FUNCTION_NAME,
      ERROR_MESSAGE,
      ERROR_SERVICE_NAME,
      ERROR_STACK_TRACE,
      JOB_ID,
      RESOURCE_ID,
      TENANT_ID,
      TENANT_NAME
    }
    
    
    #region ErrorQueueMessageTypeConnection
    public class ErrorQueueMessageTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ErrorQueueMessage> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region FaxJob
    public class FaxJob {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<Recipient> adhocRecipients { get; set; }
    
      public bool? deDuplicate { get; set; }
    
      public List<FileIdOrNewInputType> documents { get; set; }
    
      public string jobType { get; set; }
    
      public FaxParameter parameter { get; set; }
    
      public any scheduledStartTime { get; set; }
    
      public string trackingId { get; set; }
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
    public enum FaxMode {
      FINE,
      STANDARD
    }
    
    
    #region FaxParameter
    public class FaxParameter {
      #region members
      public string coverSheetMemo { get; set; }
    
      public string csid { get; set; }
    
      public FaxMode? resolution { get; set; }
    
      public bool? shouldFaxEmailBody { get; set; }
    
      public bool? shouldSuppressFaxConversion { get; set; }
    
      public bool? useBadNumberDns { get; set; }
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
    
    #region FileContent
    public class FileContent {
      #region members
      [JsonProperty("content")]
      public string content { get; set; }
    
      [JsonProperty("creationDateTime")]
      public any creationDateTime { get; set; }
    
      [JsonProperty("lastModificationDateTime")]
      public any lastModificationDateTime { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("size")]
      public any size { get; set; }
      #endregion
    }
    #endregion
    
    #region FileContentInput
    public class FileContentInput {
      #region members
      [Required]
      [JsonRequired]
      public string content { get; set; }
    
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
    
    #region FileHeader
    public class FileHeader {
      #region members
      [JsonProperty("creationDateTime")]
      public any creationDateTime { get; set; }
    
      [JsonProperty("lastModificationDateTime")]
      public any lastModificationDateTime { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("size")]
      public any size { get; set; }
      #endregion
    }
    #endregion
    
    #region FileHeaderTypeConnection
    public class FileHeaderTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<FileHeader> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region FileIdOrBase64Input
    public class FileIdOrBase64Input {
      #region members
      public string base64 { get; set; }
    
      public string tempFileId { get; set; }
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
    
    #region FileIdOrNewInputType
    public class FileIdOrNewInputType {
      #region members
      public string existingFileId { get; set; }
    
      public FileInputType newFile { get; set; }
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
    
    #region FileInputType
    public class FileInputType {
      #region members
      public string base64 { get; set; }
    
      [Required]
      [JsonRequired]
      public string fileName { get; set; }
    
      public string tempFileId { get; set; }
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
    
    #region FileReferenceBase
    public class FileReferenceBase {
      #region members
      public string content { get; set; }
    
      public bool? hosted { get; set; }
    
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
    
    #region GedFieldInput
    public class GedFieldInput {
      #region members
      [Required]
      [JsonRequired]
      public string key { get; set; }
    
      public MultipleTypeValueInput typedValue { get; set; }
    
      public string value { get; set; }
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
    
    #region IdNameInput
    public class IdNameInput {
      #region members
      [Required]
      [JsonRequired]
      public string id { get; set; }
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
    
    #region IdNameType
    public class IdNameType {
      #region members
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("type")]
      public ActivityActorType? type { get; set; }
      #endregion
    }
    #endregion
    
    #region InboundFax
    public class InboundFax {
      #region members
      [JsonProperty("baudRate")]
      public int baudRate { get; set; }
    
      [JsonProperty("callTime")]
      public int callTime { get; set; }
    
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("fileName")]
      public string fileName { get; set; }
    
      [JsonProperty("folder")]
      public string folder { get; set; }
    
      [JsonProperty("from")]
      public string from { get; set; }
    
      [JsonProperty("isDeleted")]
      public bool isDeleted { get; set; }
    
      [JsonProperty("messageId")]
      public string messageId { get; set; }
    
      [JsonProperty("pages")]
      public int pages { get; set; }
    
      [JsonProperty("receivedDate")]
      public any receivedDate { get; set; }
    
      [JsonProperty("to")]
      public string to { get; set; }
      #endregion
    }
    #endregion
    
    #region InboundFaxDateFilter
    public class InboundFaxDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public InboundFaxDateFilterField field { get; set; }
    
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
    public enum InboundFaxDateFilterField {
      RECEIVED_DATE
    }
    
    
    #region InboundFaxQueryParams
    public class InboundFaxQueryParams {
      #region members
      public List<InboundFaxDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public InboundFaxSortField? sortField { get; set; }
    
      public List<InboundFaxStringFilter> stringFilters { get; set; }
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
    public enum InboundFaxSortField {
      BAUD_RATE,
      CALL_TIME,
      CUSTOMER_NUMBER,
      FILE_NAME,
      FOLDER,
      FROM,
      MESSAGE_ID,
      PAGES,
      RECEIVED_DATE,
      TO
    }
    
    
    #region InboundFaxStringFilter
    public class InboundFaxStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public InboundFaxStringFilterField field { get; set; }
    
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
    public enum InboundFaxStringFilterField {
      FROM,
      LOGIN,
      TO
    }
    
    
    #region InboundFaxTypeConnection
    public class InboundFaxTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<InboundFax> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region InboundSms
    public class InboundSms {
      #region members
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("fromAddress")]
      public string fromAddress { get; set; }
    
      [JsonProperty("jobItemNumber")]
      public int jobItemNumber { get; set; }
    
      [JsonProperty("jobNumber")]
      public int jobNumber { get; set; }
    
      [JsonProperty("message")]
      public string message { get; set; }
    
      [JsonProperty("receivedDate")]
      public any receivedDate { get; set; }
    
      [JsonProperty("recipient")]
      public string recipient { get; set; }
    
      [JsonProperty("toAddress")]
      public string toAddress { get; set; }
      #endregion
    }
    #endregion
    
    #region InboundSmsDateFilter
    public class InboundSmsDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public InboundSmsDateFilterField field { get; set; }
    
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
    public enum InboundSmsDateFilterField {
      RECEIVED_DATE
    }
    
    
    #region InboundSmsIntFilter
    public class InboundSmsIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public InboundSmsIntFilterField field { get; set; }
    
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
    public enum InboundSmsIntFilterField {
      JOB_NUMBER
    }
    
    
    #region InboundSmsQueryParams
    public class InboundSmsQueryParams {
      #region members
      public List<InboundSmsDateFilter> dateFilters { get; set; }
    
      public List<InboundSmsIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public InboundSmsSortField? sortField { get; set; }
    
      public List<InboundSmsStringFilter> stringFilters { get; set; }
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
    public enum InboundSmsSortField {
      CUSTOMER_NUMBER,
      FROM_ADDRESS,
      JOB_ITEM,
      JOB_NUMBER,
      RECEIVED_DATE,
      TO_ADDRESS
    }
    
    
    #region InboundSmsStringFilter
    public class InboundSmsStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public InboundSmsStringFilterField field { get; set; }
    
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
    public enum InboundSmsStringFilterField {
      FROM_ADDRESS,
      TO_ADDRESS
    }
    
    
    #region InboundSmsTypeConnection
    public class InboundSmsTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<InboundSms> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region Job
    public class Job {
      #region members
      [JsonProperty("completedDate")]
      public any completedDate { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("documentIds")]
      public List<string> documentIds { get; set; }
    
      [JsonProperty("failedCount")]
      public int failedCount { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobType")]
      public JobBaseType? jobType { get; set; }
    
      [JsonProperty("note")]
      public string note { get; set; }
    
      [JsonProperty("recipientCount")]
      public int recipientCount { get; set; }
    
      [JsonProperty("sentCount")]
      public int sentCount { get; set; }
    
      [JsonProperty("serviceId")]
      public string serviceId { get; set; }
    
      [JsonProperty("status")]
      public JobBaseStatus status { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
      #endregion
    }
    #endregion
    
    #region JobActionOptions
    public class JobActionOptions {
      #region members
      [Required]
      [JsonRequired]
      public JobActionType action { get; set; }
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
    public enum JobActionType {
      NONE
    }
    
    
    #region JobBaseDateFilter
    public class JobBaseDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobDateFilterField field { get; set; }
    
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
    
    #region JobBaseJobBaseStatusEnumFilter
    public class JobBaseJobBaseStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobBaseStatus filterValue1 { get; set; }
    
      public JobBaseStatus? filterValue2 { get; set; }
    
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
    
    #region JobBaseJobBaseTypeEnumFilter
    public class JobBaseJobBaseTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobBaseType filterValue1 { get; set; }
    
      public JobBaseType? filterValue2 { get; set; }
    
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
    public enum JobBaseStatus {
      CANCELED,
      COMPLETED,
      CREATED,
      ERROR,
      PROCESSING
    }
    
    
    #region JobBaseStringFilter
    public class JobBaseStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStringFilterField field { get; set; }
    
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
    public enum JobBaseType {
      DOCUMENT,
      DOCUMENT_PROBATIVE,
      EMAIL,
      FAX,
      NONE,
      POSTAL,
      PUSH,
      SMS,
      VOICE
    }
    
    
    #region JobCountStatistics
    public class JobCountStatistics {
      #region members
      [JsonProperty("count")]
      public int count { get; set; }
      #endregion
    }
    #endregion
    
    #region JobCreationResult
    public class JobCreationResult {
      #region members
      [JsonProperty("attachments")]
      public List<DocumentInfo> attachments { get; set; }
    
      [JsonProperty("documents")]
      public List<DocumentInfo> documents { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
      #endregion
    }
    #endregion
    public enum JobDateFilterField {
      COMPLETED_DATE,
      CREATION_DATE
    }
    
    
    #region JobItem
    public class JobItem {
      #region members
      [JsonProperty("address")]
      public string address { get; set; }
    
      [JsonProperty("answerBack")]
      public string answerBack { get; set; }
    
      [JsonProperty("attempts")]
      public int attempts { get; set; }
    
      [JsonProperty("baudRate")]
      public int baudRate { get; set; }
    
      [JsonProperty("bytes")]
      public int bytes { get; set; }
    
      [JsonProperty("callAnalysis")]
      public string callAnalysis { get; set; }
    
      [JsonProperty("callTime")]
      public int callTime { get; set; }
    
      [JsonProperty("connectionDuration")]
      public double connectionDuration { get; set; }
    
      [JsonProperty("faxResolution")]
      public FaxMode faxResolution { get; set; }
    
      [JsonProperty("finishDate")]
      public any finishDate { get; set; }
    
      [JsonProperty("firstDate")]
      public any firstDate { get; set; }
    
      [JsonProperty("isSent")]
      public bool isSent { get; set; }
    
      [JsonProperty("jobItemNumber")]
      public int jobItemNumber { get; set; }
    
      [JsonProperty("jobNumber")]
      public int jobNumber { get; set; }
    
      [JsonProperty("lastCall")]
      public double lastCall { get; set; }
    
      [JsonProperty("lastConnectionDuration")]
      public double lastConnectionDuration { get; set; }
    
      [JsonProperty("media")]
      public Media media { get; set; }
    
      [JsonProperty("outcome")]
      public string outcome { get; set; }
    
      [JsonProperty("outcomes")]
      public string outcomes { get; set; }
    
      [JsonProperty("pages")]
      public int pages { get; set; }
    
      [JsonProperty("priority")]
      public any priority { get; set; }
    
      [JsonProperty("recipient")]
      public string recipient { get; set; }
    
      [JsonProperty("sentPages")]
      public int sentPages { get; set; }
    
      [JsonProperty("status")]
      public int? status { get; set; }
    
      [JsonProperty("statusText")]
      public string statusText { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
    
      [JsonProperty("uD1")]
      public string uD1 { get; set; }
    
      [JsonProperty("uD2")]
      public string uD2 { get; set; }
    
      [JsonProperty("uD3")]
      public string uD3 { get; set; }
    
      [JsonProperty("uD4")]
      public string uD4 { get; set; }
    
      [JsonProperty("uD5")]
      public string uD5 { get; set; }
      #endregion
    }
    #endregion
    
    #region JobItemBoolFilter
    public class JobItemBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobItemBoolFilterField field { get; set; }
    
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
    public enum JobItemBoolFilterField {
      FAILED
    }
    
    
    #region JobItemDateFilter
    public class JobItemDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobItemDateFilterField field { get; set; }
    
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
    public enum JobItemDateFilterField {
      FINISH_DATE
    }
    
    
    #region JobItemId
    public class JobItemId {
      #region members
      [Required]
      [JsonRequired]
      public int jobItemNumber { get; set; }
    
      [Required]
      [JsonRequired]
      public int jobNumber { get; set; }
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
    
    #region JobItemIntFilter
    public class JobItemIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobItemIntFilterField field { get; set; }
    
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
    public enum JobItemIntFilterField {
      JOB_NUMBER
    }
    
    
    #region JobItemQueryParams
    public class JobItemQueryParams {
      #region members
      public List<JobItemBoolFilter> boolFilters { get; set; }
    
      public List<JobItemDateFilter> dateFilters { get; set; }
    
      public List<JobItemIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobItemSortField? sortField { get; set; }
    
      public List<JobItemStringFilter> stringFilters { get; set; }
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
    public enum JobItemSortField {
      ADDRESS,
      ANSWER_BACK,
      ATTEMPTS,
      BAUD_RATE,
      BYTES,
      CALL_TIME,
      FINISH_DATE,
      FIRST_DATE,
      JOB_ITEM,
      JOB_NUMBER,
      OUTCOME,
      OUTCOMES,
      PAGES,
      RECIPIENT,
      SENT_PAGES,
      STATUS,
      TRACKING_ID
    }
    
    
    #region JobItemStringFilter
    public class JobItemStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobItemStringFilterField field { get; set; }
    
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
    public enum JobItemStringFilterField {
      ADDRESS,
      OUTCOME,
      TRACKING_ID
    }
    
    
    #region JobItemTypeConnection
    public class JobItemTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<JobItem> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region JobMessage
    public class JobMessage {
      #region members
      [JsonProperty("chorusActionType")]
      public JobMessageChorusActionType? chorusActionType { get; set; }
    
      [JsonProperty("chorusAddedAttachmentIds")]
      public List<string> chorusAddedAttachmentIds { get; set; }
    
      [JsonProperty("chorusB2GAddress")]
      public ChorusB2GAddress chorusB2GAddress { get; set; }
    
      [JsonProperty("chorusStatus")]
      public JobMessageChorusStatus? chorusStatus { get; set; }
    
      [JsonProperty("contactId")]
      public string contactId { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [Obsolete("This property has been deprecated. Use Documents instead.")]
      [JsonProperty("documentIds")]
      public List<string> documentIds { get; set; }
    
      [JsonProperty("documents")]
      public List<JobMessageDocument> documents { get; set; }
    
      [JsonProperty("emailAddress")]
      public string emailAddress { get; set; }
    
      [JsonProperty("hasReadDocument")]
      public bool hasReadDocument { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobId")]
      public string jobId { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("messageType")]
      public JobMessageType messageType { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("recipientName")]
      public string recipientName { get; set; }
    
      [JsonProperty("retryCount")]
      public int retryCount { get; set; }
    
      [JsonProperty("status")]
      public JobMessageStatus status { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("thirdPartyId")]
      public string thirdPartyId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
    
      [JsonProperty("transmissionMode")]
      public DocumentTransmissionMode? transmissionMode { get; set; }
    
      [JsonProperty("transmissionStatus")]
      public JobMessageTransmissionStatus transmissionStatus { get; set; }
    
      [JsonProperty("validationErrors")]
      public List<ChorusB2GValidationError> validationErrors { get; set; }
      #endregion
    }
    #endregion
    
    #region JobMessageActionOptions
    public class JobMessageActionOptions {
      #region members
      [Required]
      [JsonRequired]
      public JobMessageActionType action { get; set; }
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
    public enum JobMessageActionType {
      NONE
    }
    
    public enum JobMessageChorusActionType {
      COMPLETE,
      SEND
    }
    
    public enum JobMessageChorusStatus {
      COMPLETED,
      DRAFT,
      MADE_AVAILABLE_TO_THE_ACCOUNTING_OFFICER,
      MADE_AVAILABLE_TO_THE_FIRST_VALIDATOR,
      MADE_AVAILABLE_TO_THE_RECIPIENT,
      MADE_AVAILABLE_TO_THE_SECOND_VALIDATOR,
      MANDATED,
      POSTED_IN_THE_ACCOUNTS,
      REJECTED,
      REJECTED_BY_FIRST_VALIDATOR,
      REJECTED_BY_SECOND_VALIDATOR,
      RELEASED_FOR_PAYMENT,
      SERVICE_RENDERED,
      SUBMITED,
      SUSPENDED,
      TRANSMISSION_IN_PROGRESS,
      UNKNOWN,
      VALIDATED_BY_FIRST_VALIDATOR,
      VALIDATED_BY_SECOND_VALIDATOR,
      VALIDATION_1_OVER_THE_DEADLINE,
      VALIDATION_2_OVER_THE_DEADLINE,
      WRONG_RECEIVER_INFORMATIONS,
      WRONG_VALIDATOR_BY_COCONTRACTOR,
      WRONG_VALIDATOR_BY_SUPPLIER
    }
    
    
    #region JobMessageDateFilter
    public class JobMessageDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobMessageDateFilterField field { get; set; }
    
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
    public enum JobMessageDateFilterField {
      CREATION_DATE
    }
    
    
    #region JobMessageDocument
    public class JobMessageDocument {
      #region members
      [JsonProperty("attachmentIds")]
      public List<string> attachmentIds { get; set; }
    
      [JsonProperty("documentId")]
      public string documentId { get; set; }
      #endregion
    }
    #endregion
    
    #region JobMessageJobMessageStatusEnumFilter
    public class JobMessageJobMessageStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobMessageStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobMessageStatus filterValue1 { get; set; }
    
      public JobMessageStatus? filterValue2 { get; set; }
    
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
    
    #region JobMessageJobMessageTransmissionStatusEnumFilter
    public class JobMessageJobMessageTransmissionStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobMessageTransmissionStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobMessageTransmissionStatus filterValue1 { get; set; }
    
      public JobMessageTransmissionStatus? filterValue2 { get; set; }
    
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
    
    #region JobMessageQueryParams
    public class JobMessageQueryParams {
      #region members
      public List<JobMessageDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobMessageSortField? sortField { get; set; }
    
      public List<JobMessageJobMessageStatusEnumFilter> statusFilters { get; set; }
    
      public List<JobMessageStringFilter> stringFilters { get; set; }
    
      public List<JobMessageJobMessageTransmissionStatusEnumFilter> transmissionStatusFilters { get; set; }
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
    public enum JobMessageSortField {
      ID,
      NAME,
      TRACKING_ID
    }
    
    public enum JobMessageStatus {
      CANCELED,
      COMPLETE,
      ERROR,
      PROCESSING
    }
    
    public enum JobMessageStatusFilterField {
      STATUS
    }
    
    
    #region JobMessageStringFilter
    public class JobMessageStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobMessageStringFilterField field { get; set; }
    
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
    public enum JobMessageStringFilterField {
      DOCUMENT_ID,
      EXTERNAL_ID,
      JOB_ID,
      TENANT_ID,
      TRACKING_ID
    }
    
    public enum JobMessageTransmissionStatus {
      EXPIRED_CREDENTIALS,
      INVALID_DOCUMENT,
      PENDING,
      REJECTED,
      STATUS_DELAY_EXPIRED,
      SUCCESS,
      UNKNOWN_CHORUS_B_2_G_TRANSMISSION_ERROR,
      UNKNOWN_EMAIL_TRANSMISSION_ERROR,
      UNKNOWN_POSTAL_TRANSMISSION_ERROR,
      UNKNOWN_WEB_NOTIFICATION_TRANSMISSION_ERROR,
      VALIDATION_ERROR,
      WRONG_DELIVERY_ADDRESS
    }
    
    public enum JobMessageTransmissionStatusFilterField {
      TRANSMISSION_STATUS
    }
    
    public enum JobMessageType {
      CHORUS,
      EMAIL,
      POSTAL,
      WEB_NOTIFICATION
    }
    
    
    #region JobMessageTypeConnection
    public class JobMessageTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<JobMessage> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region JobQueryParams
    public class JobQueryParams {
      #region members
      public List<JobBaseDateFilter> dateFilters { get; set; }
    
      public List<JobBaseJobBaseTypeEnumFilter> jobTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobSortField? sortField { get; set; }
    
      public List<JobBaseJobBaseStatusEnumFilter> statusFilters { get; set; }
    
      public List<JobBaseStringFilter> stringFilters { get; set; }
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
    
    #region JobResult
    public class JobResult {
      #region members
      [JsonProperty("jobNumber")]
      public int jobNumber { get; set; }
      #endregion
    }
    #endregion
    public enum JobSortField {
      COMPLETED_DATE,
      CREATION_DATE,
      ID,
      JOB_TYPE,
      SERVICE_ID,
      STATUS,
      TRACKING_ID
    }
    
    public enum JobStatus {
      ACTIVE,
      ARCHIVED,
      AWAITING_TIMEOUT_TO_LAUNCH,
      CANCELED,
      CANCELED_DURING_LAUNCH,
      CANCEL_IN_PROGRESS,
      COMPLETED,
      FINISHED,
      LAUNCH_FAILED,
      LAUNCH_IN_PROGRESS,
      NEW_JOB_SETUP,
      PROCESSING_PREVIEW,
      PROOF_CANCELED,
      PROOF_FAILED,
      PROOF_PENDING,
      PROOF_TRANSMITED,
      QUOTA_LAUNCH_ERROR,
      QUOTA_REACHED,
      RESUBMIT_IN_PROCESS,
      SUSPENDED,
      SUSPENDED_DURING_LAUNCH
    }
    
    public enum JobStatusFilterField {
      STATUS
    }
    
    public enum JobStringFilterField {
      SERVICE_ID,
      TENANT_ID,
      TRACKING_ID
    }
    
    
    #region JobSummary
    public class JobSummary {
      #region members
      [JsonProperty("applicationId")]
      public int? applicationId { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("customerNumber")]
      public int customerNumber { get; set; }
    
      [JsonProperty("failed")]
      public int failed { get; set; }
    
      [JsonProperty("firstDoc")]
      public string firstDoc { get; set; }
    
      [JsonProperty("firstList")]
      public string firstList { get; set; }
    
      [JsonProperty("isProofJob")]
      public bool isProofJob { get; set; }
    
      [JsonProperty("jobNumber")]
      public int jobNumber { get; set; }
    
      [JsonProperty("jobType")]
      public string jobType { get; set; }
    
      [JsonProperty("login")]
      public string login { get; set; }
    
      [JsonProperty("media")]
      public Media media { get; set; }
    
      [JsonProperty("mostRecentDate")]
      public any mostRecentDate { get; set; }
    
      [JsonProperty("page")]
      public int page { get; set; }
    
      [JsonProperty("pageSent")]
      public int pageSent { get; set; }
    
      [JsonProperty("remaining")]
      public int remaining { get; set; }
    
      [JsonProperty("retries")]
      public int retries { get; set; }
    
      [JsonProperty("sent")]
      public int sent { get; set; }
    
      [JsonProperty("startDate")]
      public any startDate { get; set; }
    
      [JsonProperty("status")]
      public JobStatus status { get; set; }
    
      [JsonProperty("tID")]
      public string tID { get; set; }
    
      [JsonProperty("total")]
      public int total { get; set; }
      #endregion
    }
    #endregion
    
    #region JobSummaryBoolFilter
    public class JobSummaryBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobSummaryBoolFilterField field { get; set; }
    
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
    public enum JobSummaryBoolFilterField {
      ALL_SUB_ACCOUNTS,
      IS_PROOF,
      ONLY_NOT_SENT
    }
    
    
    #region JobSummaryDateFilter
    public class JobSummaryDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobSummaryDateFilterField field { get; set; }
    
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
    public enum JobSummaryDateFilterField {
      MOST_RECENT_DATE
    }
    
    
    #region JobSummaryMediaEnumFilter
    public class JobSummaryMediaEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobSummaryMediaFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public Media filterValue1 { get; set; }
    
      public Media? filterValue2 { get; set; }
    
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
    public enum JobSummaryMediaFilterField {
      MEDIA
    }
    
    
    #region JobSummaryQueryParams
    public class JobSummaryQueryParams {
      #region members
      public List<JobSummaryBoolFilter> boolFilters { get; set; }
    
      public List<JobSummaryDateFilter> dateFilters { get; set; }
    
      public List<JobSummaryMediaEnumFilter> mediaFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobSummarySortField? sortField { get; set; }
    
      public List<JobSummaryStringFilter> stringFilters { get; set; }
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
    public enum JobSummarySortField {
      CREATION_DATE,
      DATE,
      FAILED,
      JOB_NUMBER,
      MEDIA,
      REFERENCE,
      REMAINING,
      SENT,
      START_DATE,
      STATUS,
      TOTAL
    }
    
    
    #region JobSummaryStringFilter
    public class JobSummaryStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobSummaryStringFilterField field { get; set; }
    
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
    public enum JobSummaryStringFilterField {
      JOB_NUMBER,
      TID
    }
    
    
    #region JobSummaryTypeConnection
    public class JobSummaryTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<JobSummary> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region JobTypeConnection
    public class JobTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Job> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum JobTypeFilterField {
      JOB_TYPE
    }
    
    
    #region KeyMultipleTypeValue
    public class KeyMultipleTypeValue {
      #region members
      [JsonProperty("key")]
      public string key { get; set; }
    
      [JsonProperty("value")]
      public MultipleTypeValue value { get; set; }
      #endregion
    }
    #endregion
    
    #region KeyValue
    public class KeyValue {
      #region members
      [JsonProperty("key")]
      public string key { get; set; }
    
      [JsonProperty("value")]
      public string value { get; set; }
      #endregion
    }
    #endregion
    
    #region KeyValuePair
    public class KeyValuePair {
      #region members
      [JsonProperty("key")]
      public string key { get; set; }
    
      [JsonProperty("value")]
      public string value { get; set; }
      #endregion
    }
    #endregion
    
    #region KeyValuePairInput
    public class KeyValuePairInput {
      #region members
      [Required]
      [JsonRequired]
      public string key { get; set; }
    
      public string value { get; set; }
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
    public enum Language {
      EN,
      FR,
      UKN
    }
    
    
    #region ListOfValues
    public class ListOfValues {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("metadataIds")]
      public List<string> metadataIds { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public ListOfValuesOwnerType ownerType { get; set; }
    
      [JsonProperty("valueCount")]
      public int valueCount { get; set; }
      #endregion
    }
    #endregion
    
    #region ListOfValuesInput
    public class ListOfValuesInput {
      #region members
      public string id { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      public string ownerId { get; set; }
    
      [Required]
      [JsonRequired]
      public ListOfValuesOwnerType ownerType { get; set; }
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
    public enum ListOfValuesOwnerType {
      SYSTEM,
      TENANT
    }
    
    
    #region ListOfValuesQueryParams
    public class ListOfValuesQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public ListOfValuesSortField? sortField { get; set; }
    
      public List<ListOfValuesStringFilter> stringFilters { get; set; }
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
    public enum ListOfValuesSortField {
      NAME
    }
    
    
    #region ListOfValuesStringFilter
    public class ListOfValuesStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ListOfValuesStringFilterField field { get; set; }
    
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
    public enum ListOfValuesStringFilterField {
      NAME,
      OWNER_ID
    }
    
    
    #region ListOfValuesTypeConnection
    public class ListOfValuesTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ListOfValues> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum LreArManagementType {
      ELECTRONIC,
      MANUAL
    }
    
    public enum Media {
      EMAIL,
      FAX,
      FAX_EMAIL,
      POSTAL,
      PUSH_NOTIFICATION,
      SMS,
      VOICE
    }
    
    
    #region Metadata
    public class Metadata {
      #region members
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("dataType")]
      public MetadataDataType dataType { get; set; }
    
      [JsonProperty("documentTypeIds")]
      public List<string> documentTypeIds { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("listOfValuesId")]
      public string listOfValuesId { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public MetadataOwnerType ownerType { get; set; }
      #endregion
    }
    #endregion
    
    #region MetadataConfig
    public class MetadataConfig {
      #region members
      [JsonProperty("defaultValue")]
      public string defaultValue { get; set; }
    
      [JsonProperty("expectedFormat")]
      public string expectedFormat { get; set; }
    
      [JsonProperty("isDeletable")]
      public bool? isDeletable { get; set; }
    
      [JsonProperty("isEditable")]
      public bool isEditable { get; set; }
    
      [JsonProperty("isMandatory")]
      public bool isMandatory { get; set; }
    
      [JsonProperty("metadataId")]
      public string metadataId { get; set; }
      #endregion
    }
    #endregion
    
    #region MetadataConfigInput
    public class MetadataConfigInput {
      #region members
      public string defaultValue { get; set; }
    
      public string expectedFormat { get; set; }
    
      [Required]
      [JsonRequired]
      public bool isEditable { get; set; }
    
      [Required]
      [JsonRequired]
      public bool isMandatory { get; set; }
    
      [Required]
      [JsonRequired]
      public string metadataId { get; set; }
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
    public enum MetadataDataType {
      BOOL,
      DATE,
      DOUBLE,
      INTEGER,
      LIST_OF_VALUES,
      STRING
    }
    
    public enum MetadataDataTypeFilterField {
      DATA_TYPE
    }
    
    
    #region MetadataInput
    public class MetadataInput {
      #region members
      [Required]
      [JsonRequired]
      public string code { get; set; }
    
      [Required]
      [JsonRequired]
      public MetadataDataType dataType { get; set; }
    
      public string id { get; set; }
    
      public string listOfValuesId { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
      public string ownerId { get; set; }
    
      [Required]
      [JsonRequired]
      public MetadataOwnerType ownerType { get; set; }
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
    
    #region MetadataMetadataDataTypeEnumFilter
    public class MetadataMetadataDataTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public MetadataDataTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public MetadataDataType filterValue1 { get; set; }
    
      public MetadataDataType? filterValue2 { get; set; }
    
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
    public enum MetadataOwnerType {
      SYSTEM,
      TENANT
    }
    
    
    #region MetadataQueryParams
    public class MetadataQueryParams {
      #region members
      public List<MetadataMetadataDataTypeEnumFilter> dataTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public MetadataSortField? sortField { get; set; }
    
      public List<MetadataStringFilter> stringFilters { get; set; }
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
    public enum MetadataSortField {
      CODE,
      DATA_TYPE,
      NAME
    }
    
    
    #region MetadataStringFilter
    public class MetadataStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public MetadataStringFilterField field { get; set; }
    
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
    public enum MetadataStringFilterField {
      CODE,
      NAME
    }
    
    
    #region MetadataTypeConnection
    public class MetadataTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Metadata> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region MultipleTypeValue
    public class MultipleTypeValue {
      #region members
      [JsonProperty("boolValue")]
      public bool? boolValue { get; set; }
    
      [JsonProperty("dateValue")]
      public any dateValue { get; set; }
    
      [JsonProperty("doubleValue")]
      public double? doubleValue { get; set; }
    
      [JsonProperty("intValue")]
      public int? intValue { get; set; }
    
      [JsonProperty("listValues")]
      public List<string> listValues { get; set; }
    
      [JsonProperty("stringValue")]
      public string stringValue { get; set; }
      #endregion
    }
    #endregion
    
    #region MultipleTypeValueInput
    public class MultipleTypeValueInput {
      #region members
      public bool? boolValue { get; set; }
    
      public any dateValue { get; set; }
    
      public double? doubleValue { get; set; }
    
      public int? intValue { get; set; }
    
      public List<string> listValues { get; set; }
    
      public string stringValue { get; set; }
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
    
    #region Nature
    public class Nature {
      #region members
      [JsonProperty("archiveConfiguration")]
      public ArchiveConfiguration archiveConfiguration { get; set; }
    
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("cycle")]
      public NatureCycle cycle { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("label")]
      public string label { get; set; }
    
      [JsonProperty("metadataConfigs")]
      public List<MetadataConfig> metadataConfigs { get; set; }
      #endregion
    }
    #endregion
    public enum NatureCycle {
      O_2_C,
      P_2_P
    }
    
    
    #region NatureQueryParams
    public class NatureQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public NatureSortField? sortField { get; set; }
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
    public enum NatureSortField {
      CODE,
      LABEL
    }
    
    
    #region NatureTypeConnection
    public class NatureTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Nature> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region Note
    public class Note {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public NoteOwnerType ownerType { get; set; }
    
      [JsonProperty("text")]
      public string text { get; set; }
      #endregion
    }
    #endregion
    
    #region NoteInput
    public class NoteInput {
      #region members
      public string id { get; set; }
    
      [Required]
      [JsonRequired]
      public string ownerId { get; set; }
    
      [Required]
      [JsonRequired]
      public NoteOwnerType ownerType { get; set; }
    
      [Required]
      [JsonRequired]
      public string text { get; set; }
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
    
    #region NoteNoteOwnerTypeEnumFilter
    public class NoteNoteOwnerTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public NoteOwnerTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public NoteOwnerType filterValue1 { get; set; }
    
      public NoteOwnerType? filterValue2 { get; set; }
    
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
    public enum NoteOwnerType {
      SERVICE,
      THIRD_PARTY
    }
    
    public enum NoteOwnerTypeFilterField {
      OWNER_TYPE
    }
    
    
    #region NoteQueryParams
    public class NoteQueryParams {
      #region members
      public List<NoteNoteOwnerTypeEnumFilter> ownerTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public NoteSortField? sortField { get; set; }
    
      public List<NoteStringFilter> stringFilters { get; set; }
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
    public enum NoteSortField {
      CREATION_DATE,
      LAST_MODIFICATION_DATE
    }
    
    
    #region NoteStringFilter
    public class NoteStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public NoteStringFilterField field { get; set; }
    
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
    public enum NoteStringFilterField {
      OWNER_ID
    }
    
    
    #region NoteTypeConnection
    public class NoteTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Note> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
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
    
      public string city { get; set; }
    
      public string country { get; set; }
    
      public string name { get; set; }
    
      public string postBox { get; set; }
    
      public string street { get; set; }
    
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
    
    #region PostalAdhocRecipientInput
    public class PostalAdhocRecipientInput {
      #region members
      [Required]
      [JsonRequired]
      public string addressLine1 { get; set; }
    
      [Required]
      [JsonRequired]
      public string addressLine2 { get; set; }
    
      [Required]
      [JsonRequired]
      public string city { get; set; }
    
      [Required]
      [JsonRequired]
      public string country { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
      public string postalCode { get; set; }
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
    
    #region PostalJob
    public class PostalJob {
      #region members
      [JsonProperty("completedDate")]
      public any completedDate { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("documentIds")]
      public List<string> documentIds { get; set; }
    
      [JsonProperty("failedCount")]
      public int failedCount { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("jobType")]
      public JobBaseType? jobType { get; set; }
    
      [JsonProperty("note")]
      public string note { get; set; }
    
      [JsonProperty("recipientCount")]
      public int recipientCount { get; set; }
    
      [JsonProperty("sentCount")]
      public int sentCount { get; set; }
    
      [JsonProperty("serviceId")]
      public string serviceId { get; set; }
    
      [JsonProperty("status")]
      public JobBaseStatus status { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("trackingId")]
      public string trackingId { get; set; }
    
      [JsonProperty("undeliveredCount")]
      public int undeliveredCount { get; set; }
      #endregion
    }
    #endregion
    
    #region PostalJobDateFilter
    public class PostalJobDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobDateFilterField field { get; set; }
    
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
    
    #region PostalJobInput
    public class PostalJobInput {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<FileIdOrNewInputType> documents { get; set; }
    
      public string note { get; set; }
    
      public PostalParameter parameter { get; set; }
    
      public List<PostalAdhocRecipientInput> postalAdhocRecipients { get; set; }
    
      public string serviceId { get; set; }
    
      public string trackingId { get; set; }
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
    
    #region PostalJobJobBaseStatusEnumFilter
    public class PostalJobJobBaseStatusEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStatusFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public JobBaseStatus filterValue1 { get; set; }
    
      public JobBaseStatus? filterValue2 { get; set; }
    
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
    
    #region PostalJobQueryParams
    public class PostalJobQueryParams {
      #region members
      public List<PostalJobDateFilter> dateFilters { get; set; }
    
      public List<JobBaseJobBaseTypeEnumFilter> jobTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public JobSortField? sortField { get; set; }
    
      public List<PostalJobJobBaseStatusEnumFilter> statusFilters { get; set; }
    
      public List<PostalJobStringFilter> stringFilters { get; set; }
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
    
    #region PostalJobStringFilter
    public class PostalJobStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public JobStringFilterField field { get; set; }
    
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
    
    #region PostalJobTypeConnection
    public class PostalJobTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<PostalJob> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region PostalParameter
    public class PostalParameter {
      #region members
      public EnvelopeType? envelope { get; set; }
    
      public LreArManagementType? lreArManagement { get; set; }
    
      public bool? printBothSide { get; set; }
    
      public bool? printColor { get; set; }
    
      public PostalAddressInput sender { get; set; }
    
      public StampType? stamp { get; set; }
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
    
    #region PowerBiAuthToken
    public class PowerBiAuthToken {
      #region members
      [JsonProperty("accessToken")]
      public string accessToken { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("embedUrl")]
      public string embedUrl { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
      #endregion
    }
    #endregion
    
    #region PushJob
    public class PushJob {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<Recipient> adhocRecipients { get; set; }
    
      public bool? deDuplicate { get; set; }
    
      public string jobType { get; set; }
    
      public PushParameter parameter { get; set; }
    
      public any scheduledStartTime { get; set; }
    
      [Required]
      [JsonRequired]
      public string text { get; set; }
    
      public string trackingId { get; set; }
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
    
    #region PushParameter
    public class PushParameter {
      #region members
      public bool? activateTracking { get; set; }
    
      public int? applicationId { get; set; }
    
      public int? badgeCount { get; set; }
    
      public int? expirationDuration { get; set; }
    
      public bool? isByToken { get; set; }
    
      public bool? isSilent { get; set; }
    
      public string soundFileName { get; set; }
    
      public string title { get; set; }
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
    
    #region Recipient
    public class Recipient {
      #region members
      [Required]
      [JsonRequired]
      public string address { get; set; }
    
      public string name { get; set; }
    
      public List<string> optionalFields { get; set; }
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
    
    #region RegisteredPostalOptions
    public class RegisteredPostalOptions {
      #region members
      [JsonProperty("anonymous")]
      public bool anonymous { get; set; }
      #endregion
    }
    #endregion
    
    #region RegisteredPostalOptionsInput
    public class RegisteredPostalOptionsInput {
      #region members
      [Required]
      [JsonRequired]
      public bool anonymous { get; set; }
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
    
    #region RelaunchJobMessageOptionsInput
    public class RelaunchJobMessageOptionsInput {
      #region members
      public string documentId { get; set; }
    
      public string domainId { get; set; }
    
      public string jobId { get; set; }
    
      public string jobMessageId { get; set; }
    
      public JobMessageType? messageType { get; set; }
    
      public string tenantId { get; set; }
    
      [Required]
      [JsonRequired]
      public JobMessageTransmissionStatus transmissionStatus { get; set; }
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
      /// <summary>
      /// The application rights action type.
      /// </summary>
    public enum RightActionType {
      CHANGE,
      READ
    }
    
    
    #region RightInitialValue
    public class RightInitialValue {
      #region members
      [JsonProperty("actionType")]
      public RightActionType? actionType { get; set; }
    
      [JsonProperty("category")]
      public string category { get; set; }
    
      [JsonProperty("initialValue")]
      public bool initialValue { get; set; }
    
      [JsonProperty("right")]
      public RightType right { get; set; }
    
      [JsonProperty("subCategory")]
      public string subCategory { get; set; }
      #endregion
    }
    #endregion
    
    #region RightInitialValueBoolFilter
    public class RightInitialValueBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public RightInitialValueBoolFilterField field { get; set; }
    
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
    public enum RightInitialValueBoolFilterField {
      INITIAL_VALUE
    }
    
    
    #region RightInitialValueQueryParams
    public class RightInitialValueQueryParams {
      #region members
      public List<RightInitialValueBoolFilter> boolFilters { get; set; }
    
      public List<RightInitialValueRightTypeEnumFilter> rightTypeFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public RightInitialValueSortField? sortField { get; set; }
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
    
    #region RightInitialValueRightTypeEnumFilter
    public class RightInitialValueRightTypeEnumFilter {
      #region members
      [Required]
      [JsonRequired]
      public RightInitialValueRightTypeFilterField field { get; set; }
    
      [Required]
      [JsonRequired]
      public RightType filterValue1 { get; set; }
    
      public RightType? filterValue2 { get; set; }
    
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
    public enum RightInitialValueRightTypeFilterField {
      RIGHT
    }
    
    public enum RightInitialValueSortField {
      INITIAL_VALUE,
      RIGHT
    }
    
    
    #region RightInitialValueTypeConnection
    public class RightInitialValueTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<RightInitialValue> edges { get; set; }
    
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
    
    
    #region RightValueBoolFilter
    public class RightValueBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public RightValueBoolFilterField field { get; set; }
    
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
    public enum RightValueBoolFilterField {
      VALUE
    }
    
    
    #region RightValueQueryParams
    public class RightValueQueryParams {
      #region members
      public List<RightValueBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public RightValueSortField? sortField { get; set; }
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
    public enum RightValueSortField {
      RIGHT,
      VALUE
    }
    
    
    #region Service
    public class Service {
      #region members
      [JsonProperty("chorusB2GConfig")]
      public ChorusB2GConfig chorusB2GConfig { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("customSmtpConfig")]
      public SmtpConfig customSmtpConfig { get; set; }
    
      [JsonProperty("hasCustomSmtpConfig")]
      public bool hasCustomSmtpConfig { get; set; }
    
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
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("tenantUserCount")]
      public int tenantUserCount { get; set; }
      #endregion
    }
    #endregion
    
    #region ServiceBoolFilter
    public class ServiceBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ServiceBoolFilterField field { get; set; }
    
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
    public enum ServiceBoolFilterField {
      HAS_CUSTOM_SMTP_CONFIG,
      IS_ENABLED
    }
    
    
    #region ServiceInput
    public class ServiceInput {
      #region members
      public ChorusB2GConfigInput chorusB2GConfig { get; set; }
    
      public SmtpConfigInput customSmtpConfig { get; set; }
    
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
    
    #region ServiceIntFilter
    public class ServiceIntFilter {
      #region members
      [Required]
      [JsonRequired]
      public ServiceIntFilterField field { get; set; }
    
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
    public enum ServiceIntFilterField {
      TENANT_USER_COUNT
    }
    
    
    #region ServiceQueryParams
    public class ServiceQueryParams {
      #region members
      public List<ServiceBoolFilter> boolFilters { get; set; }
    
      public List<ServiceIntFilter> intFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ServiceSortField? sortField { get; set; }
    
      public List<ServiceStringFilter> stringFilters { get; set; }
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
    public enum ServiceSortField {
      HAS_CUSTOM_SMTP_CONFIG,
      IS_ENABLED,
      NAME,
      TENANT_USER_COUNT
    }
    
    
    #region ServiceStringFilter
    public class ServiceStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ServiceStringFilterField field { get; set; }
    
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
    public enum ServiceStringFilterField {
      NAME
    }
    
    
    #region ServiceTypeConnection
    public class ServiceTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<Service> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    public enum SmsContentType {
      BINARY,
      TEXT,
      UNICODE
    }
    
    
    #region SmsJob
    public class SmsJob {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<Recipient> adhocRecipients { get; set; }
    
      public bool? deDuplicate { get; set; }
    
      public string jobType { get; set; }
    
      public SmsParameter parameter { get; set; }
    
      public any scheduledStartTime { get; set; }
    
      [Required]
      [JsonRequired]
      public string text { get; set; }
    
      public string trackingId { get; set; }
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
    
    #region SmsParameter
    public class SmsParameter {
      #region members
      public bool? allowMultiPartition { get; set; }
    
      public SmsContentType? contentType { get; set; }
    
      public bool? formsManagement { get; set; }
    
      public int? lifeSpan { get; set; }
    
      public int? maxPartition { get; set; }
    
      public string sender { get; set; }
    
      public bool? shortUrl { get; set; }
    
      public bool? shortUrlGeotagging { get; set; }
    
      public bool? shortUrlTracking { get; set; }
    
      public bool? smsFlash { get; set; }
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
    
    #region SmtpConfig
    public class SmtpConfig {
      #region members
      [JsonProperty("errorAddress")]
      public string errorAddress { get; set; }
    
      [JsonProperty("hasSmtpSsl")]
      public bool? hasSmtpSsl { get; set; }
    
      [JsonProperty("replyAddress")]
      public string replyAddress { get; set; }
    
      [JsonProperty("senderAddress")]
      public string senderAddress { get; set; }
    
      [JsonProperty("senderName")]
      public string senderName { get; set; }
    
      [JsonProperty("smtpLogin")]
      public string smtpLogin { get; set; }
    
      [JsonProperty("smtpPassword")]
      public string smtpPassword { get; set; }
    
      [JsonProperty("smtpPort")]
      public int? smtpPort { get; set; }
    
      [JsonProperty("smtpServer")]
      public string smtpServer { get; set; }
      #endregion
    }
    #endregion
    
    #region SmtpConfigInput
    public class SmtpConfigInput {
      #region members
      public string errorAddress { get; set; }
    
      public bool? hasSmtpSsl { get; set; }
    
      public string replyAddress { get; set; }
    
      [Required]
      [JsonRequired]
      public string senderAddress { get; set; }
    
      [Required]
      [JsonRequired]
      public string senderName { get; set; }
    
      public string smtpLogin { get; set; }
    
      public string smtpPassword { get; set; }
    
      public int? smtpPort { get; set; }
    
      public string smtpServer { get; set; }
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
    
    public enum StampType {
      INDUSTRIEL,
      INDUSTRIEL_JPLUS_4,
      LETTRE_VERTE,
      NORMAL,
      RECOMMANDE
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
    
    
    #region TemporaryDocumentContent
    public class TemporaryDocumentContent {
      #region members
      [JsonProperty("content")]
      public string content { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("metadata")]
      public List<KeyValuePair> metadata { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("size")]
      public any size { get; set; }
    
      [JsonProperty("storageEndDate")]
      public any storageEndDate { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
      #endregion
    }
    #endregion
    
    #region TemporaryDocumentContentInput
    public class TemporaryDocumentContentInput {
      #region members
      [Required]
      [JsonRequired]
      public string content { get; set; }
    
      public string id { get; set; }
    
      public List<KeyValuePairInput> metadata { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
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
    
    #region TemporaryDocumentHeader
    public class TemporaryDocumentHeader {
      #region members
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("metadata")]
      public List<KeyValuePair> metadata { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("size")]
      public any size { get; set; }
    
      [JsonProperty("storageEndDate")]
      public any storageEndDate { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
      #endregion
    }
    #endregion
    
    #region TemporaryDocumentHeaderDateFilter
    public class TemporaryDocumentHeaderDateFilter {
      #region members
      [Required]
      [JsonRequired]
      public TemporaryDocumentHeaderDateFilterField field { get; set; }
    
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
    public enum TemporaryDocumentHeaderDateFilterField {
      CREATION_DATE,
      STORAGE_END_DATE
    }
    
    
    #region TemporaryDocumentHeaderQueryParams
    public class TemporaryDocumentHeaderQueryParams {
      #region members
      public List<TemporaryDocumentHeaderDateFilter> dateFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public TemporaryDocumentHeaderSortField? sortField { get; set; }
    
      public List<TemporaryDocumentHeaderStringFilter> stringFilters { get; set; }
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
    public enum TemporaryDocumentHeaderSortField {
      CREATION_DATE,
      NAME,
      SIZE,
      STORAGE_END_DATE
    }
    
    
    #region TemporaryDocumentHeaderStringFilter
    public class TemporaryDocumentHeaderStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public TemporaryDocumentHeaderStringFilterField field { get; set; }
    
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
    public enum TemporaryDocumentHeaderStringFilterField {
      NAME,
      TENANT_ID
    }
    
    
    #region TemporaryDocumentHeaderTypeConnection
    public class TemporaryDocumentHeaderTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<TemporaryDocumentHeader> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
      /// <summary>
      /// The application rights for tenant user.
      /// </summary>
    public enum TenantRightType {
      /// <summary>
      /// Create, edit or delete activities
      /// </summary>
      CHANGE_ACTIVITY,
      /// <summary>
      /// Create, edit or delete document links
      /// </summary>
      CHANGE_CLICKED_LINK_DOCUMENT,
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
      /// Create, edit or delete documentJob
      /// </summary>
      CHANGE_DOCUMENT_JOB,
      /// <summary>
      /// Create, edit or delete document types
      /// </summary>
      CHANGE_DOCUMENT_TYPE,
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
      /// Create, edit or delete mailJob
      /// </summary>
      CHANGE_POSTAL_JOB,
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
      /// Get or list activities
      /// </summary>
      READ_ACTIVITY,
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
      /// Get or list documentJob
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
      /// Get or list jobMessage
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
      /// Get or list mailJob
      /// </summary>
      READ_POSTAL_JOB,
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
      /// Validate invited user
      /// </summary>
      VALIDATE_USER
    }
    
    
    #region TenantRightValue
    public class TenantRightValue {
      #region members
      [JsonProperty("right")]
      public TenantRightType? right { get; set; }
    
      [JsonProperty("value")]
      public bool value { get; set; }
      #endregion
    }
    #endregion
    
    #region TenantRightValueInput
    public class TenantRightValueInput {
      #region members
      public TenantRightType? right { get; set; }
    
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
    
    #region TenantRightValueTypeConnection
    public class TenantRightValueTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<TenantRightValue> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region TenantUser
    public class TenantUser {
      #region members
      [JsonProperty("civility")]
      public string civility { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("culture")]
      public string culture { get; set; }
    
      [JsonProperty("documentAccessType")]
      public TenantUserDocumentAccessType documentAccessType { get; set; }
    
      [JsonProperty("email")]
      public string email { get; set; }
    
      [JsonProperty("firstName")]
      public string firstName { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("isEnabled")]
      public bool isEnabled { get; set; }
    
      [JsonProperty("lastConnectionDate")]
      public any lastConnectionDate { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("lastName")]
      public string lastName { get; set; }
    
      [JsonProperty("phone")]
      public string phone { get; set; }
    
      [JsonProperty("services")]
      public List<IdName> services { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("timeZone")]
      public string timeZone { get; set; }
    
      [JsonProperty("userId")]
      public string userId { get; set; }
    
      [JsonProperty("weeklyReport")]
      public bool weeklyReport { get; set; }
      #endregion
    }
    #endregion
    
    #region TenantUserBoolFilter
    public class TenantUserBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public TenantUserBoolFilterField field { get; set; }
    
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
    public enum TenantUserBoolFilterField {
      IS_ENABLED
    }
    
    public enum TenantUserDocumentAccessType {
      FULL,
      RESTRICTED
    }
    
    
    #region TenantUserInput
    public class TenantUserInput {
      #region members
      public string civility { get; set; }
    
      public string culture { get; set; }
    
      [Required]
      [JsonRequired]
      public TenantUserDocumentAccessType documentAccessType { get; set; }
    
      [Required]
      [JsonRequired]
      public string email { get; set; }
    
      [Required]
      [JsonRequired]
      public string firstName { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public string lastName { get; set; }
    
      public string phone { get; set; }
    
      public List<IdNameInput> services { get; set; }
    
      public string timeZone { get; set; }
    
      [Required]
      [JsonRequired]
      public bool weeklyReport { get; set; }
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
    
    #region TenantUserQueryParams
    public class TenantUserQueryParams {
      #region members
      public List<TenantUserBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public TenantUserSortField? sortField { get; set; }
    
      public List<TenantUserStringFilter> stringFilters { get; set; }
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
    public enum TenantUserSortField {
      CIVILITY,
      CULTURE,
      DOCUMENT_ACCESS_TYPE,
      EMAIL,
      FIRST_NAME,
      IS_ENABLED,
      LAST_NAME,
      PHONE,
      TIME_ZONE,
      USER_ID,
      WEEKLY_REPORT
    }
    
    
    #region TenantUserStringFilter
    public class TenantUserStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public TenantUserStringFilterField field { get; set; }
    
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
    public enum TenantUserStringFilterField {
      EMAIL,
      FIRST_NAME,
      LAST_NAME,
      SERVICE_ID,
      USER_ID
    }
    
    
    #region TenantUserTypeConnection
    public class TenantUserTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<TenantUser> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ThirdParty
    public class ThirdParty {
      #region members
      [JsonProperty("address")]
      public PostalAddress address { get; set; }
    
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("contactCount")]
      public int contactCount { get; set; }
    
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
    
      [JsonProperty("isMoralPerson")]
      public bool isMoralPerson { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("tenantId")]
      public string tenantId { get; set; }
    
      [JsonProperty("thirdPartyTypeIds")]
      public List<string> thirdPartyTypeIds { get; set; }
      #endregion
    }
    #endregion
    
    #region ThirdPartyBoolFilter
    public class ThirdPartyBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ThirdPartyBoolFilterField field { get; set; }
    
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
    public enum ThirdPartyBoolFilterField {
      IS_ENABLED,
      IS_MORAL_PERSON
    }
    
    public enum ThirdPartyIdentifierType {
      FROM_GED_FIELDS,
      THIRDPARTY_ID
    }
    
    
    #region ThirdPartyInput
    public class ThirdPartyInput {
      #region members
      public PostalAddressInput address { get; set; }
    
      [Required]
      [JsonRequired]
      public string code { get; set; }
    
      public string id { get; set; }
    
      public bool? isEnabled { get; set; }
    
      [Required]
      [JsonRequired]
      public bool isMoralPerson { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
      public List<string> thirdPartyTypeIds { get; set; }
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
    
    #region ThirdPartyQueryParams
    public class ThirdPartyQueryParams {
      #region members
      public List<ThirdPartyBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ThirdPartySortField? sortField { get; set; }
    
      public List<ThirdPartyStringFilter> stringFilters { get; set; }
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
    
    #region ThirdPartyRecipientInput
    public class ThirdPartyRecipientInput {
      #region members
      public List<string> contactFunctionCodes { get; set; }
    
      [Required]
      [JsonRequired]
      public string thirdPartyIdentifier { get; set; }
    
      [Required]
      [JsonRequired]
      public ThirdPartyIdentifierType thirdPartyIdentifierType { get; set; }
    
      public ThirdPartyUpdateOptionsInput updateOptions { get; set; }
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
    public enum ThirdPartySortField {
      CODE,
      IS_ENABLED,
      IS_MORAL_PERSON,
      NAME
    }
    
    
    #region ThirdPartyStringFilter
    public class ThirdPartyStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ThirdPartyStringFilterField field { get; set; }
    
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
    public enum ThirdPartyStringFilterField {
      CODE,
      NAME
    }
    
    
    #region ThirdPartyType
    public class ThirdPartyType {
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
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public ThirdPartyTypeOwnerType ownerType { get; set; }
      #endregion
    }
    #endregion
    
    #region ThirdPartyTypeBoolFilter
    public class ThirdPartyTypeBoolFilter {
      #region members
      [Required]
      [JsonRequired]
      public ThirdPartyTypeBoolFilterField field { get; set; }
    
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
    public enum ThirdPartyTypeBoolFilterField {
      IS_ENABLED
    }
    
    
    #region ThirdPartyTypeConnection
    public class ThirdPartyTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ThirdParty> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ThirdPartyTypeInput
    public class ThirdPartyTypeInput {
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
    public enum ThirdPartyTypeOwnerType {
      SYSTEM,
      TENANT
    }
    
    
    #region ThirdPartyTypeQueryParams
    public class ThirdPartyTypeQueryParams {
      #region members
      public List<ThirdPartyTypeBoolFilter> boolFilters { get; set; }
    
      public SortDirection? sortDirection { get; set; }
    
      public ThirdPartyTypeSortField? sortField { get; set; }
    
      public List<ThirdPartyTypeStringFilter> stringFilters { get; set; }
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
    public enum ThirdPartyTypeSortField {
      IS_ENABLED,
      NAME
    }
    
    
    #region ThirdPartyTypeStringFilter
    public class ThirdPartyTypeStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ThirdPartyTypeStringFilterField field { get; set; }
    
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
    public enum ThirdPartyTypeStringFilterField {
      NAME,
      OWNER_ID
    }
    
    
    #region ThirdPartyTypeTypeConnection
    public class ThirdPartyTypeTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ThirdPartyType> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region ThirdPartyUpdateOptionsInput
    public class ThirdPartyUpdateOptionsInput {
      #region members
      [Required]
      [JsonRequired]
      public bool createThirdParty { get; set; }
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
    public enum UserProfile {
      ADMINISTRATOR,
      DOMAIN_ADMINISTRATOR,
      ENVIRONMENT_ADMINISTRATOR,
      STANDARD_USER,
      TENANT_RECEIVER,
      WEBSITE_ADMINISTRATOR
    }
    
    
    #region ValueOfList
    public class ValueOfList {
      #region members
      [JsonProperty("code")]
      public string code { get; set; }
    
      [JsonProperty("creationDate")]
      public any creationDate { get; set; }
    
      [JsonProperty("creationUserId")]
      public string creationUserId { get; set; }
    
      [JsonProperty("creationUserLabel")]
      public string creationUserLabel { get; set; }
    
      [JsonProperty("id")]
      public string id { get; set; }
    
      [JsonProperty("lastModificationDate")]
      public any lastModificationDate { get; set; }
    
      [JsonProperty("lastModificationUserId")]
      public string lastModificationUserId { get; set; }
    
      [JsonProperty("lastModificationUserLabel")]
      public string lastModificationUserLabel { get; set; }
    
      [JsonProperty("listOfValuesId")]
      public string listOfValuesId { get; set; }
    
      [JsonProperty("name")]
      public string name { get; set; }
    
      [JsonProperty("ownerId")]
      public string ownerId { get; set; }
    
      [JsonProperty("ownerType")]
      public ValueOfListOwnerType ownerType { get; set; }
      #endregion
    }
    #endregion
    
    #region ValueOfListInput
    public class ValueOfListInput {
      #region members
      [Required]
      [JsonRequired]
      public string code { get; set; }
    
      public string id { get; set; }
    
      [Required]
      [JsonRequired]
      public string listOfValuesId { get; set; }
    
      [Required]
      [JsonRequired]
      public string name { get; set; }
    
      [Required]
      [JsonRequired]
      public string ownerId { get; set; }
    
      [Required]
      [JsonRequired]
      public ValueOfListOwnerType ownerType { get; set; }
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
    public enum ValueOfListOwnerType {
      SYSTEM,
      TENANT
    }
    
    
    #region ValueOfListQueryParams
    public class ValueOfListQueryParams {
      #region members
      public SortDirection? sortDirection { get; set; }
    
      public ValueOfListSortField? sortField { get; set; }
    
      public List<ValueOfListStringFilter> stringFilters { get; set; }
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
    public enum ValueOfListSortField {
      CODE,
      NAME
    }
    
    
    #region ValueOfListStringFilter
    public class ValueOfListStringFilter {
      #region members
      [Required]
      [JsonRequired]
      public ValueOfListStringFilterField field { get; set; }
    
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
    public enum ValueOfListStringFilterField {
      CODE,
      LIST_OF_VALUES_ID,
      NAME
    }
    
    
    #region ValueOfListTypeConnection
    public class ValueOfListTypeConnection {
      #region members
      [JsonProperty("edges")]
      public List<ValueOfList> edges { get; set; }
    
      [JsonProperty("pageInfo")]
      public PageInfo pageInfo { get; set; }
      #endregion
    }
    #endregion
    
    #region VoiceJob
    public class VoiceJob {
      #region members
      public List<FileIdOrNewInputType> adhocRecipientFiles { get; set; }
    
      public List<Recipient> adhocRecipients { get; set; }
    
      public bool? deDuplicate { get; set; }
    
      public List<FileIdOrNewInputType> documents { get; set; }
    
      public string jobType { get; set; }
    
      public VoiceParameter parameter { get; set; }
    
      public any scheduledStartTime { get; set; }
    
      public string trackingId { get; set; }
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
    
    #region VoiceParameter
    public class VoiceParameter {
      #region members
      public string acknowledgeKey { get; set; }
    
      public FileReferenceBase actionMessage { get; set; }
    
      public string repeatKey { get; set; }
    
      public int? scenarioId { get; set; }
    
      public string sender { get; set; }
    
      public int? textToSpeechVoiceId { get; set; }
    
      public int? textToSpeechVoiceRate { get; set; }
    
      public string transferKey { get; set; }
    
      public string transferNumber { get; set; }
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
  }
  
}
