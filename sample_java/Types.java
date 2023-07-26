package sample_java;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

public class Types {
  
  public static class ActivityActivityActorTypeEnumFilterInput {
    private ActivityActorTypeFilterField field;
    private ActivityActorType filterValue1;
    private ActivityActorType filterValue2;
    private NumberFilterOperator operator;
  
    public ActivityActivityActorTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ActivityActorTypeFilterField) {
          this.field = (ActivityActorTypeFilterField) args.get("field");
        } else {
          this.field = ActivityActorTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ActivityActorType) {
          this.filterValue1 = (ActivityActorType) args.get("filterValue1");
        } else {
          this.filterValue1 = ActivityActorType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ActivityActorType) {
          this.filterValue2 = (ActivityActorType) args.get("filterValue2");
        } else {
          this.filterValue2 = ActivityActorType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ActivityActorTypeFilterField getField() { return this.field; }
    public ActivityActorType getFilterValue1() { return this.filterValue1; }
    public ActivityActorType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ActivityActorTypeFilterField field) { this.field = field; }
    public void setFilterValue1(ActivityActorType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ActivityActorType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ActivityActivityCategoryEnumFilterInput {
    private ActivityCategoryFilterField field;
    private ActivityCategory filterValue1;
    private ActivityCategory filterValue2;
    private NumberFilterOperator operator;
  
    public ActivityActivityCategoryEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ActivityCategoryFilterField) {
          this.field = (ActivityCategoryFilterField) args.get("field");
        } else {
          this.field = ActivityCategoryFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ActivityCategory) {
          this.filterValue1 = (ActivityCategory) args.get("filterValue1");
        } else {
          this.filterValue1 = ActivityCategory.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ActivityCategory) {
          this.filterValue2 = (ActivityCategory) args.get("filterValue2");
        } else {
          this.filterValue2 = ActivityCategory.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ActivityCategoryFilterField getField() { return this.field; }
    public ActivityCategory getFilterValue1() { return this.filterValue1; }
    public ActivityCategory getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ActivityCategoryFilterField field) { this.field = field; }
    public void setFilterValue1(ActivityCategory filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ActivityCategory filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ActivityActivitySourceTypeEnumFilterInput {
    private ActivitySourceTypeFilterField field;
    private ActivitySourceType filterValue1;
    private ActivitySourceType filterValue2;
    private NumberFilterOperator operator;
  
    public ActivityActivitySourceTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ActivitySourceTypeFilterField) {
          this.field = (ActivitySourceTypeFilterField) args.get("field");
        } else {
          this.field = ActivitySourceTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ActivitySourceType) {
          this.filterValue1 = (ActivitySourceType) args.get("filterValue1");
        } else {
          this.filterValue1 = ActivitySourceType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ActivitySourceType) {
          this.filterValue2 = (ActivitySourceType) args.get("filterValue2");
        } else {
          this.filterValue2 = ActivitySourceType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ActivitySourceTypeFilterField getField() { return this.field; }
    public ActivitySourceType getFilterValue1() { return this.filterValue1; }
    public ActivitySourceType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ActivitySourceTypeFilterField field) { this.field = field; }
    public void setFilterValue1(ActivitySourceType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ActivitySourceType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ActivityActorType {
    CONTACT,
    EMAIL_ADDRESS,
    EXTERNAL,
    POSTAL_ADDRESS,
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
    ADD_DATA_FILE_ACTION,
    CANCEL_JOB_MESSAGE,
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
  
  public static class ActivityDateFilterInput {
    private ActivityDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public ActivityDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ActivityDateFilterField) {
          this.field = (ActivityDateFilterField) args.get("field");
        } else {
          this.field = ActivityDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ActivityDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ActivityDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ActivityDateFilterField {
    DATE
    
  }
  
  public static class ActivityQueryParamsInput {
    private Iterable<ActivityActivityActorTypeEnumFilterInput> actorTypeFilters;
    private Iterable<ActivityDateFilterInput> dateFilters;
    private Iterable<ActivityActivityCategoryEnumFilterInput> eventTypeFilters;
    private SortDirection sortDirection;
    private ActivitySortField sortField;
    private Iterable<ActivityActivitySourceTypeEnumFilterInput> sourceTypeFilters;
    private Iterable<ActivityStringFilterInput> stringFilters;
  
    public ActivityQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("actorTypeFilters") != null) {
        		this.actorTypeFilters = (Iterable<ActivityActivityActorTypeEnumFilterInput>) args.get("actorTypeFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<ActivityDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("eventTypeFilters") != null) {
        		this.eventTypeFilters = (Iterable<ActivityActivityCategoryEnumFilterInput>) args.get("eventTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ActivitySortField) {
          this.sortField = (ActivitySortField) args.get("sortField");
        } else {
          this.sortField = ActivitySortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("sourceTypeFilters") != null) {
        		this.sourceTypeFilters = (Iterable<ActivityActivitySourceTypeEnumFilterInput>) args.get("sourceTypeFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ActivityStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ActivityActivityActorTypeEnumFilterInput> getActorTypeFilters() { return this.actorTypeFilters; }
    public Iterable<ActivityDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<ActivityActivityCategoryEnumFilterInput> getEventTypeFilters() { return this.eventTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ActivitySortField getSortField() { return this.sortField; }
    public Iterable<ActivityActivitySourceTypeEnumFilterInput> getSourceTypeFilters() { return this.sourceTypeFilters; }
    public Iterable<ActivityStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setActorTypeFilters(Iterable<ActivityActivityActorTypeEnumFilterInput> actorTypeFilters) { this.actorTypeFilters = actorTypeFilters; }
    public void setDateFilters(Iterable<ActivityDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setEventTypeFilters(Iterable<ActivityActivityCategoryEnumFilterInput> eventTypeFilters) { this.eventTypeFilters = eventTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ActivitySortField sortField) { this.sortField = sortField; }
    public void setSourceTypeFilters(Iterable<ActivityActivitySourceTypeEnumFilterInput> sourceTypeFilters) { this.sourceTypeFilters = sourceTypeFilters; }
    public void setStringFilters(Iterable<ActivityStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class ActivityStringFilterInput {
    private ActivityStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ActivityStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ActivityStringFilterField) {
          this.field = (ActivityStringFilterField) args.get("field");
        } else {
          this.field = ActivityStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ActivityStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ActivityStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  
  public static class ApiDomainUserBoolFilterInput {
    private ApiDomainUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ApiDomainUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiDomainUserBoolFilterField) {
          this.field = (ApiDomainUserBoolFilterField) args.get("field");
        } else {
          this.field = ApiDomainUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiDomainUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ApiDomainUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiDomainUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ApiDomainUserDateFilterInput {
    private ApiDomainUserDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public ApiDomainUserDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiDomainUserDateFilterField) {
          this.field = (ApiDomainUserDateFilterField) args.get("field");
        } else {
          this.field = ApiDomainUserDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiDomainUserDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiDomainUserDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiDomainUserDateFilterField {
    CREATION_DATE,
    LAST_CONNECTION_DATE
    
  }
  
  public static class ApiDomainUserInput {
    private Iterable<String> authorizedIPs;
    private String domainId;
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public ApiDomainUserInput(Map<String, Object> args) {
      if (args != null) {
        this.authorizedIPs = (Iterable<String>) args.get("authorizedIPs");
        this.domainId = (String) args.get("domainId");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
      }
    }
  
    public Iterable<String> getAuthorizedIPs() { return this.authorizedIPs; }
    public String getDomainId() { return this.domainId; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public void setAuthorizedIPs(Iterable<String> authorizedIPs) { this.authorizedIPs = authorizedIPs; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
  }
  public static class ApiDomainUserQueryParamsInput {
    private Iterable<ApiDomainUserBoolFilterInput> boolFilters;
    private Iterable<ApiDomainUserDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private ApiDomainUserSortField sortField;
    private Iterable<ApiDomainUserStringFilterInput> stringFilters;
  
    public ApiDomainUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ApiDomainUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<ApiDomainUserDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ApiDomainUserSortField) {
          this.sortField = (ApiDomainUserSortField) args.get("sortField");
        } else {
          this.sortField = ApiDomainUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ApiDomainUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ApiDomainUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ApiDomainUserDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ApiDomainUserSortField getSortField() { return this.sortField; }
    public Iterable<ApiDomainUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ApiDomainUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<ApiDomainUserDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ApiDomainUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ApiDomainUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ApiDomainUserSortField {
    CREATION_DATE,
    CREATION_USER_LABEL,
    DOMAIN_ID,
    IS_ENABLED,
    LAST_CONNECTION_DATE,
    NAME
    
  }
  
  public static class ApiDomainUserStringFilterInput {
    private ApiDomainUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ApiDomainUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiDomainUserStringFilterField) {
          this.field = (ApiDomainUserStringFilterField) args.get("field");
        } else {
          this.field = ApiDomainUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiDomainUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ApiDomainUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiDomainUserStringFilterField {
    CREATION_USER_ID,
    CREATION_USER_LABEL,
    DOMAIN_ID,
    NAME
    
  }
  
  
  
  public static class ApiEnvironmentUserBoolFilterInput {
    private ApiEnvironmentUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ApiEnvironmentUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiEnvironmentUserBoolFilterField) {
          this.field = (ApiEnvironmentUserBoolFilterField) args.get("field");
        } else {
          this.field = ApiEnvironmentUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiEnvironmentUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ApiEnvironmentUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiEnvironmentUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ApiEnvironmentUserDateFilterInput {
    private ApiEnvironmentUserDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public ApiEnvironmentUserDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiEnvironmentUserDateFilterField) {
          this.field = (ApiEnvironmentUserDateFilterField) args.get("field");
        } else {
          this.field = ApiEnvironmentUserDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiEnvironmentUserDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiEnvironmentUserDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiEnvironmentUserDateFilterField {
    CREATION_DATE,
    LAST_CONNECTION_DATE
    
  }
  
  public static class ApiEnvironmentUserInput {
    private Iterable<String> authorizedIPs;
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public ApiEnvironmentUserInput(Map<String, Object> args) {
      if (args != null) {
        this.authorizedIPs = (Iterable<String>) args.get("authorizedIPs");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
      }
    }
  
    public Iterable<String> getAuthorizedIPs() { return this.authorizedIPs; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public void setAuthorizedIPs(Iterable<String> authorizedIPs) { this.authorizedIPs = authorizedIPs; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
  }
  public static class ApiEnvironmentUserQueryParamsInput {
    private Iterable<ApiEnvironmentUserBoolFilterInput> boolFilters;
    private Iterable<ApiEnvironmentUserDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private ApiEnvironmentUserSortField sortField;
    private Iterable<ApiEnvironmentUserStringFilterInput> stringFilters;
  
    public ApiEnvironmentUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ApiEnvironmentUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<ApiEnvironmentUserDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ApiEnvironmentUserSortField) {
          this.sortField = (ApiEnvironmentUserSortField) args.get("sortField");
        } else {
          this.sortField = ApiEnvironmentUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ApiEnvironmentUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ApiEnvironmentUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ApiEnvironmentUserDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ApiEnvironmentUserSortField getSortField() { return this.sortField; }
    public Iterable<ApiEnvironmentUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ApiEnvironmentUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<ApiEnvironmentUserDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ApiEnvironmentUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ApiEnvironmentUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ApiEnvironmentUserSortField {
    CREATION_DATE,
    CREATION_USER_LABEL,
    IS_ENABLED,
    LAST_CONNECTION_DATE,
    NAME
    
  }
  
  public static class ApiEnvironmentUserStringFilterInput {
    private ApiEnvironmentUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ApiEnvironmentUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiEnvironmentUserStringFilterField) {
          this.field = (ApiEnvironmentUserStringFilterField) args.get("field");
        } else {
          this.field = ApiEnvironmentUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiEnvironmentUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ApiEnvironmentUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiEnvironmentUserStringFilterField {
    CREATION_USER_ID,
    CREATION_USER_LABEL,
    NAME
    
  }
  
  
  
  public static class ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput {
    private ApiRoutingConfigurationOwnerTypeFilterField field;
    private InheritedConfigurationOwnerType filterValue1;
    private InheritedConfigurationOwnerType filterValue2;
    private NumberFilterOperator operator;
  
    public ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiRoutingConfigurationOwnerTypeFilterField) {
          this.field = (ApiRoutingConfigurationOwnerTypeFilterField) args.get("field");
        } else {
          this.field = ApiRoutingConfigurationOwnerTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof InheritedConfigurationOwnerType) {
          this.filterValue1 = (InheritedConfigurationOwnerType) args.get("filterValue1");
        } else {
          this.filterValue1 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof InheritedConfigurationOwnerType) {
          this.filterValue2 = (InheritedConfigurationOwnerType) args.get("filterValue2");
        } else {
          this.filterValue2 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiRoutingConfigurationOwnerTypeFilterField getField() { return this.field; }
    public InheritedConfigurationOwnerType getFilterValue1() { return this.filterValue1; }
    public InheritedConfigurationOwnerType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiRoutingConfigurationOwnerTypeFilterField field) { this.field = field; }
    public void setFilterValue1(InheritedConfigurationOwnerType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(InheritedConfigurationOwnerType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ApiRoutingConfigurationInput {
    private String action;
    private String format;
    private String id;
    private String ownerId;
    private InheritedConfigurationOwnerType ownerType;
    private String queueName;
    private PostalAddressInput sender;
  
    public ApiRoutingConfigurationInput(Map<String, Object> args) {
      if (args != null) {
        this.action = (String) args.get("action");
        this.format = (String) args.get("format");
        this.id = (String) args.get("id");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof InheritedConfigurationOwnerType) {
          this.ownerType = (InheritedConfigurationOwnerType) args.get("ownerType");
        } else {
          this.ownerType = InheritedConfigurationOwnerType.valueOf((String) args.get("ownerType"));
        }
        this.queueName = (String) args.get("queueName");
        this.sender = new PostalAddressInput((Map<String, Object>) args.get("sender"));
      }
    }
  
    public String getAction() { return this.action; }
    public String getFormat() { return this.format; }
    public String getId() { return this.id; }
    public String getOwnerId() { return this.ownerId; }
    public InheritedConfigurationOwnerType getOwnerType() { return this.ownerType; }
    public String getQueueName() { return this.queueName; }
    public PostalAddressInput getSender() { return this.sender; }
    public void setAction(String action) { this.action = action; }
    public void setFormat(String format) { this.format = format; }
    public void setId(String id) { this.id = id; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(InheritedConfigurationOwnerType ownerType) { this.ownerType = ownerType; }
    public void setQueueName(String queueName) { this.queueName = queueName; }
    public void setSender(PostalAddressInput sender) { this.sender = sender; }
  }
  public enum ApiRoutingConfigurationOwnerTypeFilterField {
    OWNER_TYPE
    
  }
  
  public static class ApiRoutingConfigurationQueryParamsInput {
    private Iterable<ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters;
    private SortDirection sortDirection;
    private ApiRoutingConfigurationSortField sortField;
    private Iterable<ApiRoutingConfigurationStringFilterInput> stringFilters;
  
    public ApiRoutingConfigurationQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("ownerTypeFilters") != null) {
        		this.ownerTypeFilters = (Iterable<ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput>) args.get("ownerTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ApiRoutingConfigurationSortField) {
          this.sortField = (ApiRoutingConfigurationSortField) args.get("sortField");
        } else {
          this.sortField = ApiRoutingConfigurationSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ApiRoutingConfigurationStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> getOwnerTypeFilters() { return this.ownerTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ApiRoutingConfigurationSortField getSortField() { return this.sortField; }
    public Iterable<ApiRoutingConfigurationStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setOwnerTypeFilters(Iterable<ApiRoutingConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters) { this.ownerTypeFilters = ownerTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ApiRoutingConfigurationSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ApiRoutingConfigurationStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ApiRoutingConfigurationSortField {
    ACTION,
    CREATION_DATE,
    FORMAT,
    LAST_MODIFICATION_DATE,
    OWNER_ID,
    OWNER_TYPE,
    QUEUE_NAME
    
  }
  
  public static class ApiRoutingConfigurationStringFilterInput {
    private ApiRoutingConfigurationStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ApiRoutingConfigurationStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiRoutingConfigurationStringFilterField) {
          this.field = (ApiRoutingConfigurationStringFilterField) args.get("field");
        } else {
          this.field = ApiRoutingConfigurationStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiRoutingConfigurationStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ApiRoutingConfigurationStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiRoutingConfigurationStringFilterField {
    ACTION,
    FORMAT,
    OWNER_ID,
    QUEUE_NAME
    
  }
  
  
  
  public static class ApiTenantUserBoolFilterInput {
    private ApiTenantUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ApiTenantUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiTenantUserBoolFilterField) {
          this.field = (ApiTenantUserBoolFilterField) args.get("field");
        } else {
          this.field = ApiTenantUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiTenantUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ApiTenantUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiTenantUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ApiTenantUserDateFilterInput {
    private ApiTenantUserDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public ApiTenantUserDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiTenantUserDateFilterField) {
          this.field = (ApiTenantUserDateFilterField) args.get("field");
        } else {
          this.field = ApiTenantUserDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiTenantUserDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiTenantUserDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiTenantUserDateFilterField {
    CREATION_DATE,
    LAST_CONNECTION_DATE
    
  }
  
  public static class ApiTenantUserInput {
    private Iterable<String> authorizedIPs;
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public ApiTenantUserInput(Map<String, Object> args) {
      if (args != null) {
        this.authorizedIPs = (Iterable<String>) args.get("authorizedIPs");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
      }
    }
  
    public Iterable<String> getAuthorizedIPs() { return this.authorizedIPs; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public void setAuthorizedIPs(Iterable<String> authorizedIPs) { this.authorizedIPs = authorizedIPs; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
  }
  public static class ApiTenantUserQueryParamsInput {
    private Iterable<ApiTenantUserBoolFilterInput> boolFilters;
    private Iterable<ApiTenantUserDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private ApiTenantUserSortField sortField;
    private Iterable<ApiTenantUserStringFilterInput> stringFilters;
  
    public ApiTenantUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ApiTenantUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<ApiTenantUserDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ApiTenantUserSortField) {
          this.sortField = (ApiTenantUserSortField) args.get("sortField");
        } else {
          this.sortField = ApiTenantUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ApiTenantUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ApiTenantUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ApiTenantUserDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ApiTenantUserSortField getSortField() { return this.sortField; }
    public Iterable<ApiTenantUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ApiTenantUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<ApiTenantUserDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ApiTenantUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ApiTenantUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ApiTenantUserSortField {
    CREATION_DATE,
    CREATION_USER_LABEL,
    IS_ENABLED,
    LAST_CONNECTION_DATE,
    NAME,
    TENANT_ID
    
  }
  
  public static class ApiTenantUserStringFilterInput {
    private ApiTenantUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ApiTenantUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiTenantUserStringFilterField) {
          this.field = (ApiTenantUserStringFilterField) args.get("field");
        } else {
          this.field = ApiTenantUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiTenantUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ApiTenantUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiTenantUserStringFilterField {
    CREATION_USER_ID,
    CREATION_USER_LABEL,
    NAME,
    TENANT_ID
    
  }
  
  
  
  public enum ArchiveConfigurationBillingMode {
    FILES,
    GIGA
    
  }
  
  public static class ArchiveConfigurationInput {
    private Boolean archiveMetadata;
    private ArchiveConfigurationBillingMode billingMode;
    private Integer durationInMonth;
    private ArchiverProvider provider;
  
    public ArchiveConfigurationInput(Map<String, Object> args) {
      if (args != null) {
        this.archiveMetadata = (Boolean) args.get("archiveMetadata");
        if (args.get("billingMode") instanceof ArchiveConfigurationBillingMode) {
          this.billingMode = (ArchiveConfigurationBillingMode) args.get("billingMode");
        } else {
          this.billingMode = ArchiveConfigurationBillingMode.valueOf((String) args.get("billingMode"));
        }
        this.durationInMonth = (Integer) args.get("durationInMonth");
        if (args.get("provider") instanceof ArchiverProvider) {
          this.provider = (ArchiverProvider) args.get("provider");
        } else {
          this.provider = ArchiverProvider.valueOf((String) args.get("provider"));
        }
      }
    }
  
    public Boolean getArchiveMetadata() { return this.archiveMetadata; }
    public ArchiveConfigurationBillingMode getBillingMode() { return this.billingMode; }
    public Integer getDurationInMonth() { return this.durationInMonth; }
    public ArchiverProvider getProvider() { return this.provider; }
    public void setArchiveMetadata(Boolean archiveMetadata) { this.archiveMetadata = archiveMetadata; }
    public void setBillingMode(ArchiveConfigurationBillingMode billingMode) { this.billingMode = billingMode; }
    public void setDurationInMonth(Integer durationInMonth) { this.durationInMonth = durationInMonth; }
    public void setProvider(ArchiverProvider provider) { this.provider = provider; }
  }
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
  
  public static class AttachmentInput {
    private String existingDocumentId;
    private DocumentInput newDocument;
  
    public AttachmentInput(Map<String, Object> args) {
      if (args != null) {
        this.existingDocumentId = (String) args.get("existingDocumentId");
        this.newDocument = new DocumentInput((Map<String, Object>) args.get("newDocument"));
      }
    }
  
    public String getExistingDocumentId() { return this.existingDocumentId; }
    public DocumentInput getNewDocument() { return this.newDocument; }
    public void setExistingDocumentId(String existingDocumentId) { this.existingDocumentId = existingDocumentId; }
    public void setNewDocument(DocumentInput newDocument) { this.newDocument = newDocument; }
  }
  public enum BoolFilterOperator {
    DEFINED,
    EQUAL,
    EQUAL_OR_UNDEFINED,
    IS_NOT_NULL,
    IS_NULL,
    NOT_EQUAL,
    UNDEFINED
    
  }
  
  public static class BusinessSchemaMutationAddApiDomainUserArgs {
    private ApiDomainUserInput item;
  
    public BusinessSchemaMutationAddApiDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ApiDomainUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ApiDomainUserInput getItem() { return this.item; }
    public void setItem(ApiDomainUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddApiEnvironmentUserArgs {
    private ApiEnvironmentUserInput item;
  
    public BusinessSchemaMutationAddApiEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ApiEnvironmentUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ApiEnvironmentUserInput getItem() { return this.item; }
    public void setItem(ApiEnvironmentUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddApiRoutingConfigurationArgs {
    private ApiRoutingConfigurationInput item;
  
    public BusinessSchemaMutationAddApiRoutingConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ApiRoutingConfigurationInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ApiRoutingConfigurationInput getItem() { return this.item; }
    public void setItem(ApiRoutingConfigurationInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddApiTenantUserArgs {
    private ApiTenantUserInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddApiTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ApiTenantUserInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ApiTenantUserInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ApiTenantUserInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddContactArgs {
    private ContactInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddContactArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ContactInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ContactInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ContactInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddContactFunctionArgs {
    private ContactFunctionInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddContactFunctionArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ContactFunctionInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ContactFunctionInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ContactFunctionInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDashboardRightArgs {
    private DashboardRightInput item;
  
    public BusinessSchemaMutationAddDashboardRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DashboardRightInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public DashboardRightInput getItem() { return this.item; }
    public void setItem(DashboardRightInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddDataFileActionArgs {
    private DataFileActionInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddDataFileActionArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DataFileActionInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DataFileActionInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(DataFileActionInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDocumentJobArgs {
    private DocumentJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddDocumentJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DocumentJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DocumentJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(DocumentJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDocumentProbativeJobArgs {
    private DocumentProbativeJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddDocumentProbativeJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DocumentProbativeJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DocumentProbativeJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(DocumentProbativeJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDocumentTypeArgs {
    private DocumentTypeInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddDocumentTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DocumentTypeInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DocumentTypeInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(DocumentTypeInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDocumentTypeMetadataArgs {
    private String documentTypeId;
    private MetadataConfigInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddDocumentTypeMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.documentTypeId = (String) args.get("documentTypeId");
        this.item = new MetadataConfigInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDocumentTypeId() { return this.documentTypeId; }
    public MetadataConfigInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setDocumentTypeId(String documentTypeId) { this.documentTypeId = documentTypeId; }
    public void setItem(MetadataConfigInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddDomainUserArgs {
    private DomainUserInput item;
  
    public BusinessSchemaMutationAddDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DomainUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public DomainUserInput getItem() { return this.item; }
    public void setItem(DomainUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddEmailJobArgs {
    private EmailJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddEmailJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new EmailJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public EmailJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(EmailJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddEnvironmentUserArgs {
    private EnvironmentUserInput item;
  
    public BusinessSchemaMutationAddEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new EnvironmentUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public EnvironmentUserInput getItem() { return this.item; }
    public void setItem(EnvironmentUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddFaxJobArgs {
    private FaxJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddFaxJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new FaxJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public FaxJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(FaxJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddHostedDocumentFileArgs {
    private FileContentInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddHostedDocumentFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new FileContentInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public FileContentInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(FileContentInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddHostedListFileArgs {
    private FileContentInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddHostedListFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new FileContentInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public FileContentInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(FileContentInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddIncomingEmailHistoryArgs {
    private IncomingEmailHistoryInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddIncomingEmailHistoryArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new IncomingEmailHistoryInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public IncomingEmailHistoryInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(IncomingEmailHistoryInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddListOfValuesArgs {
    private ListOfValuesInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddListOfValuesArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ListOfValuesInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ListOfValuesInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ListOfValuesInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddMetadataArgs {
    private MetadataInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new MetadataInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public MetadataInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(MetadataInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddNoteArgs {
    private NoteInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddNoteArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new NoteInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public NoteInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(NoteInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddPostalJobArgs {
    private PostalJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddPostalJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new PostalJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public PostalJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(PostalJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddPostalParameterConfigurationArgs {
    private PostalParameterConfigurationInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddPostalParameterConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new PostalParameterConfigurationInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public PostalParameterConfigurationInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(PostalParameterConfigurationInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddPowerBiAuthTokenArgs {
    private String id;
  
    public BusinessSchemaMutationAddPowerBiAuthTokenArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationAddPushJobArgs {
    private PushJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddPushJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new PushJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public PushJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(PushJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddServiceArgs {
    private ServiceInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddServiceArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ServiceInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ServiceInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ServiceInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddSmsJobArgs {
    private SmsJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddSmsJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new SmsJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public SmsJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(SmsJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddTemplateContentArgs {
    private TemplateContentInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddTemplateContentArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new TemplateContentInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public TemplateContentInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(TemplateContentInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddTemplateStructureArgs {
    private TemplateStructureInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddTemplateStructureArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new TemplateStructureInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public TemplateStructureInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(TemplateStructureInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddTemporaryDocumentArgs {
    private TemporaryDocumentContentInput item;
  
    public BusinessSchemaMutationAddTemporaryDocumentArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new TemporaryDocumentContentInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public TemporaryDocumentContentInput getItem() { return this.item; }
    public void setItem(TemporaryDocumentContentInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationAddTenantUserArgs {
    private TenantUserInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new TenantUserInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public TenantUserInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(TenantUserInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddThirdPartyArgs {
    private ThirdPartyInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddThirdPartyArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ThirdPartyInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ThirdPartyInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ThirdPartyInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddThirdPartyTypeArgs {
    private ThirdPartyTypeInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddThirdPartyTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ThirdPartyTypeInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ThirdPartyTypeInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ThirdPartyTypeInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddValueOfListArgs {
    private ValueOfListInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddValueOfListArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ValueOfListInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public ValueOfListInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(ValueOfListInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationAddVoiceJobArgs {
    private VoiceJobInput item;
    private String tenantId;
  
    public BusinessSchemaMutationAddVoiceJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new VoiceJobInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public VoiceJobInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setItem(VoiceJobInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteApiRoutingConfigurationArgs {
    private String id;
  
    public BusinessSchemaMutationDeleteApiRoutingConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationDeleteContactArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteContactArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteContactFunctionArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteContactFunctionArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteDashboardRightArgs {
    private String id;
  
    public BusinessSchemaMutationDeleteDashboardRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationDeleteDocumentTypeArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteDocumentTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteDocumentTypeMetadataArgs {
    private String documentTypeId;
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteDocumentTypeMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.documentTypeId = (String) args.get("documentTypeId");
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDocumentTypeId() { return this.documentTypeId; }
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setDocumentTypeId(String documentTypeId) { this.documentTypeId = documentTypeId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteHostedDocumentFileArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteHostedDocumentFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteHostedInboundFileArgs {
    private String id;
    private String inboundFolder;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteHostedInboundFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.inboundFolder = (String) args.get("inboundFolder");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getInboundFolder() { return this.inboundFolder; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setInboundFolder(String inboundFolder) { this.inboundFolder = inboundFolder; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteHostedListFileArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteHostedListFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteHostedReportFileArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteHostedReportFileArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteIncomingEmailHistoryArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteIncomingEmailHistoryArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteListOfValuesArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteListOfValuesArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteMetadataArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteNoteArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteNoteArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeletePostalParameterConfigurationArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeletePostalParameterConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteServiceArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteServiceArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteTemplateContentArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteTemplateContentArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteTemplateStructureArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteTemplateStructureArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteTemporaryDocumentArgs {
    private String id;
  
    public BusinessSchemaMutationDeleteTemporaryDocumentArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationDeleteThirdPartyArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteThirdPartyArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteThirdPartyTypeArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteThirdPartyTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationDeleteValueOfListArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationDeleteValueOfListArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditApiDomainUserArgs {
    private String id;
    private ApiDomainUserInput item;
  
    public BusinessSchemaMutationEditApiDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ApiDomainUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ApiDomainUserInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ApiDomainUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditApiDomainUserRightArgs {
    private String apiUserId;
    private Iterable<DomainRightValueInput> item;
  
    public BusinessSchemaMutationEditApiDomainUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.apiUserId = (String) args.get("apiUserId");
        if (args.get("item") != null) {
        		this.item = (Iterable<DomainRightValueInput>) args.get("item");
        }
      }
    }
  
    public String getApiUserId() { return this.apiUserId; }
    public Iterable<DomainRightValueInput> getItem() { return this.item; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setItem(Iterable<DomainRightValueInput> item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditApiEnvironmentUserArgs {
    private String id;
    private ApiEnvironmentUserInput item;
  
    public BusinessSchemaMutationEditApiEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ApiEnvironmentUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ApiEnvironmentUserInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ApiEnvironmentUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditApiEnvironmentUserRightArgs {
    private String apiUserId;
    private Iterable<EnvironmentRightValueInput> item;
  
    public BusinessSchemaMutationEditApiEnvironmentUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.apiUserId = (String) args.get("apiUserId");
        if (args.get("item") != null) {
        		this.item = (Iterable<EnvironmentRightValueInput>) args.get("item");
        }
      }
    }
  
    public String getApiUserId() { return this.apiUserId; }
    public Iterable<EnvironmentRightValueInput> getItem() { return this.item; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setItem(Iterable<EnvironmentRightValueInput> item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditApiRoutingConfigurationArgs {
    private String id;
    private ApiRoutingConfigurationInput item;
  
    public BusinessSchemaMutationEditApiRoutingConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ApiRoutingConfigurationInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ApiRoutingConfigurationInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ApiRoutingConfigurationInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditApiTenantUserArgs {
    private String id;
    private ApiTenantUserInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditApiTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ApiTenantUserInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ApiTenantUserInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ApiTenantUserInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditApiTenantUserRightArgs {
    private String apiUserId;
    private Iterable<TenantRightValueInput> item;
  
    public BusinessSchemaMutationEditApiTenantUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.apiUserId = (String) args.get("apiUserId");
        if (args.get("item") != null) {
        		this.item = (Iterable<TenantRightValueInput>) args.get("item");
        }
      }
    }
  
    public String getApiUserId() { return this.apiUserId; }
    public Iterable<TenantRightValueInput> getItem() { return this.item; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setItem(Iterable<TenantRightValueInput> item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditContactArgs {
    private String id;
    private ContactInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditContactArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ContactInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ContactInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ContactInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditContactFunctionArgs {
    private String id;
    private ContactFunctionInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditContactFunctionArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ContactFunctionInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ContactFunctionInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ContactFunctionInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditDocumentTypeArgs {
    private String id;
    private DocumentTypeInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditDocumentTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new DocumentTypeInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public DocumentTypeInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(DocumentTypeInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditDocumentTypeMetadataArgs {
    private String documentTypeId;
    private String id;
    private MetadataConfigInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditDocumentTypeMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.documentTypeId = (String) args.get("documentTypeId");
        this.id = (String) args.get("id");
        this.item = new MetadataConfigInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDocumentTypeId() { return this.documentTypeId; }
    public String getId() { return this.id; }
    public MetadataConfigInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setDocumentTypeId(String documentTypeId) { this.documentTypeId = documentTypeId; }
    public void setId(String id) { this.id = id; }
    public void setItem(MetadataConfigInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditDomainUserArgs {
    private String id;
    private DomainUserInput item;
  
    public BusinessSchemaMutationEditDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new DomainUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public DomainUserInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(DomainUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditDomainUserRightArgs {
    private String domainUserId;
    private Iterable<DomainRightValueInput> item;
  
    public BusinessSchemaMutationEditDomainUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.domainUserId = (String) args.get("domainUserId");
        if (args.get("item") != null) {
        		this.item = (Iterable<DomainRightValueInput>) args.get("item");
        }
      }
    }
  
    public String getDomainUserId() { return this.domainUserId; }
    public Iterable<DomainRightValueInput> getItem() { return this.item; }
    public void setDomainUserId(String domainUserId) { this.domainUserId = domainUserId; }
    public void setItem(Iterable<DomainRightValueInput> item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditEnvironmentUserArgs {
    private String id;
    private EnvironmentUserInput item;
  
    public BusinessSchemaMutationEditEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new EnvironmentUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public EnvironmentUserInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(EnvironmentUserInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditEnvironmentUserRightArgs {
    private String environmentUserId;
    private Iterable<EnvironmentRightValueInput> item;
  
    public BusinessSchemaMutationEditEnvironmentUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        this.environmentUserId = (String) args.get("environmentUserId");
        if (args.get("item") != null) {
        		this.item = (Iterable<EnvironmentRightValueInput>) args.get("item");
        }
      }
    }
  
    public String getEnvironmentUserId() { return this.environmentUserId; }
    public Iterable<EnvironmentRightValueInput> getItem() { return this.item; }
    public void setEnvironmentUserId(String environmentUserId) { this.environmentUserId = environmentUserId; }
    public void setItem(Iterable<EnvironmentRightValueInput> item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditErrorQueueMessageArgs {
    private String id;
    private ErrorQueueMessageInput item;
  
    public BusinessSchemaMutationEditErrorQueueMessageArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ErrorQueueMessageInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ErrorQueueMessageInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ErrorQueueMessageInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationEditIncomingEmailHistoryArgs {
    private String id;
    private IncomingEmailHistoryInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditIncomingEmailHistoryArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new IncomingEmailHistoryInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public IncomingEmailHistoryInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(IncomingEmailHistoryInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditListOfValuesArgs {
    private String id;
    private ListOfValuesInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditListOfValuesArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ListOfValuesInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ListOfValuesInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ListOfValuesInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditMetadataArgs {
    private String id;
    private MetadataInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditMetadataArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new MetadataInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public MetadataInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(MetadataInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditNoteArgs {
    private String id;
    private NoteInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditNoteArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new NoteInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public NoteInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(NoteInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditPostalParameterConfigurationArgs {
    private String id;
    private PostalParameterConfigurationInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditPostalParameterConfigurationArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new PostalParameterConfigurationInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public PostalParameterConfigurationInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(PostalParameterConfigurationInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditServiceArgs {
    private String id;
    private ServiceInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditServiceArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ServiceInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ServiceInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ServiceInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditTemplateContentArgs {
    private String id;
    private TemplateContentInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditTemplateContentArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new TemplateContentInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public TemplateContentInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(TemplateContentInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditTemplateStructureArgs {
    private String id;
    private TemplateStructureInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditTemplateStructureArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new TemplateStructureInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public TemplateStructureInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(TemplateStructureInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditTenantUserArgs {
    private String id;
    private TenantUserInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new TenantUserInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public TenantUserInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(TenantUserInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditTenantUserRightArgs {
    private Iterable<TenantRightValueInput> item;
    private String tenantId;
    private String tenantUserId;
  
    public BusinessSchemaMutationEditTenantUserRightArgs(Map<String, Object> args) {
      if (args != null) {
        if (args.get("item") != null) {
        		this.item = (Iterable<TenantRightValueInput>) args.get("item");
        }
        this.tenantId = (String) args.get("tenantId");
        this.tenantUserId = (String) args.get("tenantUserId");
      }
    }
  
    public Iterable<TenantRightValueInput> getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public String getTenantUserId() { return this.tenantUserId; }
    public void setItem(Iterable<TenantRightValueInput> item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public void setTenantUserId(String tenantUserId) { this.tenantUserId = tenantUserId; }
  }
  public static class BusinessSchemaMutationEditThirdPartyArgs {
    private String id;
    private ThirdPartyInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditThirdPartyArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ThirdPartyInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ThirdPartyInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ThirdPartyInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditThirdPartyTypeArgs {
    private String id;
    private ThirdPartyTypeInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditThirdPartyTypeArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ThirdPartyTypeInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ThirdPartyTypeInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ThirdPartyTypeInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationEditValueOfListArgs {
    private String id;
    private ValueOfListInput item;
    private String tenantId;
  
    public BusinessSchemaMutationEditValueOfListArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ValueOfListInput((Map<String, Object>) args.get("item"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public ValueOfListInput getItem() { return this.item; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setItem(ValueOfListInput item) { this.item = item; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationReadDocumentArgs {
    private String documentId;
    private String jobId;
    private String jobMessageId;
    private String tenantId;
  
    public BusinessSchemaMutationReadDocumentArgs(Map<String, Object> args) {
      if (args != null) {
        this.documentId = (String) args.get("documentId");
        this.jobId = (String) args.get("jobId");
        this.jobMessageId = (String) args.get("jobMessageId");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDocumentId() { return this.documentId; }
    public String getJobId() { return this.jobId; }
    public String getJobMessageId() { return this.jobMessageId; }
    public String getTenantId() { return this.tenantId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public void setJobMessageId(String jobMessageId) { this.jobMessageId = jobMessageId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationRelaunchJobMessageArgs {
    private RelaunchJobMessageOptionsInput item;
  
    public BusinessSchemaMutationRelaunchJobMessageArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new RelaunchJobMessageOptionsInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public RelaunchJobMessageOptionsInput getItem() { return this.item; }
    public void setItem(RelaunchJobMessageOptionsInput item) { this.item = item; }
  }
  public static class BusinessSchemaMutationRenewApiDomainUserArgs {
    private String id;
  
    public BusinessSchemaMutationRenewApiDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationRenewApiEnvironmentUserArgs {
    private String id;
  
    public BusinessSchemaMutationRenewApiEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationRenewApiTenantUserArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationRenewApiTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationResendInviteDomainUserArgs {
    private String id;
  
    public BusinessSchemaMutationResendInviteDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationResendInviteEnvironmentUserArgs {
    private String id;
  
    public BusinessSchemaMutationResendInviteEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaMutationResendInviteTenantUserArgs {
    private String id;
    private String tenantId;
  
    public BusinessSchemaMutationResendInviteTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getId() { return this.id; }
    public String getTenantId() { return this.tenantId; }
    public void setId(String id) { this.id = id; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationRunActionOnDocumentArgs {
    private String documentId;
    private DocumentActionOptionsInput options;
    private String tenantId;
  
    public BusinessSchemaMutationRunActionOnDocumentArgs(Map<String, Object> args) {
      if (args != null) {
        this.documentId = (String) args.get("documentId");
        this.options = new DocumentActionOptionsInput((Map<String, Object>) args.get("options"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDocumentId() { return this.documentId; }
    public DocumentActionOptionsInput getOptions() { return this.options; }
    public String getTenantId() { return this.tenantId; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }
    public void setOptions(DocumentActionOptionsInput options) { this.options = options; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationRunActionOnJobArgs {
    private String jobId;
    private JobActionOptionsInput options;
    private String tenantId;
  
    public BusinessSchemaMutationRunActionOnJobArgs(Map<String, Object> args) {
      if (args != null) {
        this.jobId = (String) args.get("jobId");
        this.options = new JobActionOptionsInput((Map<String, Object>) args.get("options"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getJobId() { return this.jobId; }
    public JobActionOptionsInput getOptions() { return this.options; }
    public String getTenantId() { return this.tenantId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public void setOptions(JobActionOptionsInput options) { this.options = options; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationRunActionOnJobMessageArgs {
    private String jobMessageId;
    private JobMessageActionOptionsInput options;
    private String tenantId;
  
    public BusinessSchemaMutationRunActionOnJobMessageArgs(Map<String, Object> args) {
      if (args != null) {
        this.jobMessageId = (String) args.get("jobMessageId");
        this.options = new JobMessageActionOptionsInput((Map<String, Object>) args.get("options"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getJobMessageId() { return this.jobMessageId; }
    public JobMessageActionOptionsInput getOptions() { return this.options; }
    public String getTenantId() { return this.tenantId; }
    public void setJobMessageId(String jobMessageId) { this.jobMessageId = jobMessageId; }
    public void setOptions(JobMessageActionOptionsInput options) { this.options = options; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaMutationValidateDomainUserArgs {
    private String key;
  
    public BusinessSchemaMutationValidateDomainUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.key = (String) args.get("key");
      }
    }
  
    public String getKey() { return this.key; }
    public void setKey(String key) { this.key = key; }
  }
  public static class BusinessSchemaMutationValidateEnvironmentUserArgs {
    private String key;
  
    public BusinessSchemaMutationValidateEnvironmentUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.key = (String) args.get("key");
      }
    }
  
    public String getKey() { return this.key; }
    public void setKey(String key) { this.key = key; }
  }
  public static class BusinessSchemaMutationValidateTenantUserArgs {
    private String key;
  
    public BusinessSchemaMutationValidateTenantUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.key = (String) args.get("key");
      }
    }
  
    public String getKey() { return this.key; }
    public void setKey(String key) { this.key = key; }
  }
  public static class BusinessSchemaQueryActivityItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryActivityItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryActivityListArgs {
    private String after;
    private Language language;
    private ActivityQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryActivityListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new ActivityQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public ActivityQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(ActivityQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryApiDomainUserItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryApiDomainUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryApiDomainUserListArgs {
    private String after;
    private ApiDomainUserQueryParamsInput params;
  
    public BusinessSchemaQueryApiDomainUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ApiDomainUserQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ApiDomainUserQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ApiDomainUserQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryApiDomainUserRightListArgs {
    private String after;
    private String apiUserId;
    private RightValueQueryParamsInput params;
  
    public BusinessSchemaQueryApiDomainUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.apiUserId = (String) args.get("apiUserId");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getApiUserId() { return this.apiUserId; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryApiEnvironmentUserItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryApiEnvironmentUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryApiEnvironmentUserListArgs {
    private String after;
    private ApiEnvironmentUserQueryParamsInput params;
  
    public BusinessSchemaQueryApiEnvironmentUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ApiEnvironmentUserQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ApiEnvironmentUserQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ApiEnvironmentUserQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryApiEnvironmentUserRightListArgs {
    private String after;
    private String apiUserId;
    private RightValueQueryParamsInput params;
  
    public BusinessSchemaQueryApiEnvironmentUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.apiUserId = (String) args.get("apiUserId");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getApiUserId() { return this.apiUserId; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryApiRoutingConfigurationItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryApiRoutingConfigurationItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryApiRoutingConfigurationListArgs {
    private String after;
    private ApiRoutingConfigurationQueryParamsInput params;
  
    public BusinessSchemaQueryApiRoutingConfigurationListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ApiRoutingConfigurationQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ApiRoutingConfigurationQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ApiRoutingConfigurationQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryApiTenantUserItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryApiTenantUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryApiTenantUserListArgs {
    private String after;
    private ApiTenantUserQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryApiTenantUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ApiTenantUserQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ApiTenantUserQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ApiTenantUserQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryApiTenantUserRightListArgs {
    private String after;
    private String apiUserId;
    private RightValueQueryParamsInput params;
  
    public BusinessSchemaQueryApiTenantUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.apiUserId = (String) args.get("apiUserId");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getApiUserId() { return this.apiUserId; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setApiUserId(String apiUserId) { this.apiUserId = apiUserId; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryChorusB2GProvidersListArgs {
    private String login;
    private String password;
    private ChorusServerType serverType;
  
    public BusinessSchemaQueryChorusB2GProvidersListArgs(Map<String, Object> args) {
      if (args != null) {
        this.login = (String) args.get("login");
        this.password = (String) args.get("password");
        if (args.get("serverType") instanceof ChorusServerType) {
          this.serverType = (ChorusServerType) args.get("serverType");
        } else {
          this.serverType = ChorusServerType.valueOf((String) args.get("serverType"));
        }
      }
    }
  
    public String getLogin() { return this.login; }
    public String getPassword() { return this.password; }
    public ChorusServerType getServerType() { return this.serverType; }
    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }
    public void setServerType(ChorusServerType serverType) { this.serverType = serverType; }
  }
  public static class BusinessSchemaQueryClickedLinkDocumentItemsArgs {
    private String id;
  
    public BusinessSchemaQueryClickedLinkDocumentItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class BusinessSchemaQueryContactFunctionItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryContactFunctionItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryContactFunctionListArgs {
    private String after;
    private ContactFunctionQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryContactFunctionListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ContactFunctionQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ContactFunctionQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ContactFunctionQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryContactFunctionSystemListArgs {
    private String after;
    private Language language;
    private ContactFunctionQueryParamsInput params;
  
    public BusinessSchemaQueryContactFunctionSystemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new ContactFunctionQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public ContactFunctionQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(ContactFunctionQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryContactItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryContactItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryContactListArgs {
    private String after;
    private ContactQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryContactListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ContactQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ContactQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ContactQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDashboardItemsArgs {
    private Iterable<String> idList;
    private Language language;
  
    public BusinessSchemaQueryDashboardItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
  }
  public static class BusinessSchemaQueryDashboardListArgs {
    private String after;
    private Language language;
    private DashboardQueryParamsInput params;
  
    public BusinessSchemaQueryDashboardListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new DashboardQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public DashboardQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(DashboardQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryDashboardRightItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryDashboardRightItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryDashboardRightListArgs {
    private String after;
    private DashboardRightQueryParamsInput params;
  
    public BusinessSchemaQueryDashboardRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DashboardRightQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public DashboardRightQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DashboardRightQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryDocumentCountListArgs {
    private String tenantId;
  
    public BusinessSchemaQueryDocumentCountListArgs(Map<String, Object> args) {
      if (args != null) {
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getTenantId() { return this.tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentCountStatisticsListArgs {
    private DocumentCountStatisticsQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentCountStatisticsListArgs(Map<String, Object> args) {
      if (args != null) {
        this.params = new DocumentCountStatisticsQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DocumentCountStatisticsQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setParams(DocumentCountStatisticsQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentJobItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentJobItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentJobListArgs {
    private String after;
    private DocumentJobQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentJobListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DocumentJobQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public DocumentJobQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DocumentJobQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentListArgs {
    private String after;
    private DocumentQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DocumentQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public DocumentQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DocumentQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentProbativeJobItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentProbativeJobItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentProbativeJobListArgs {
    private String after;
    private DocumentProbativeJobQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentProbativeJobListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DocumentProbativeJobQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public DocumentProbativeJobQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DocumentProbativeJobQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentSizeStatisticsArgs {
    private DocumentSizeStatisticsQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentSizeStatisticsArgs(Map<String, Object> args) {
      if (args != null) {
        this.params = new DocumentSizeStatisticsQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public DocumentSizeStatisticsQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setParams(DocumentSizeStatisticsQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentSubTypeItemsArgs {
    private Iterable<String> idList;
    private Language language;
  
    public BusinessSchemaQueryDocumentSubTypeItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
  }
  public static class BusinessSchemaQueryDocumentSubTypeListArgs {
    private String after;
    private Language language;
    private DocumentSubTypeQueryParamsInput params;
  
    public BusinessSchemaQueryDocumentSubTypeListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new DocumentSubTypeQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public DocumentSubTypeQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(DocumentSubTypeQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryDocumentTypeItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentTypeItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDocumentTypeListArgs {
    private String after;
    private DocumentTypeQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryDocumentTypeListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DocumentTypeQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public DocumentTypeQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DocumentTypeQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryDomainUserItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryDomainUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryDomainUserListArgs {
    private String after;
    private DomainUserQueryParamsInput params;
  
    public BusinessSchemaQueryDomainUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DomainUserQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public DomainUserQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DomainUserQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryDomainUserRightListArgs {
    private String after;
    private String domainUserId;
    private RightValueQueryParamsInput params;
  
    public BusinessSchemaQueryDomainUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.domainUserId = (String) args.get("domainUserId");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getDomainUserId() { return this.domainUserId; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setDomainUserId(String domainUserId) { this.domainUserId = domainUserId; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryEnvironmentUserItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryEnvironmentUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryEnvironmentUserListArgs {
    private String after;
    private EnvironmentUserQueryParamsInput params;
  
    public BusinessSchemaQueryEnvironmentUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new EnvironmentUserQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public EnvironmentUserQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(EnvironmentUserQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryEnvironmentUserRightListArgs {
    private String after;
    private String environmentUserId;
    private RightValueQueryParamsInput params;
  
    public BusinessSchemaQueryEnvironmentUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.environmentUserId = (String) args.get("environmentUserId");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getEnvironmentUserId() { return this.environmentUserId; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setEnvironmentUserId(String environmentUserId) { this.environmentUserId = environmentUserId; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryErrorQueueMessageItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryErrorQueueMessageItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryErrorQueueMessageListArgs {
    private String after;
    private ErrorQueueMessageQueryParamsInput params;
  
    public BusinessSchemaQueryErrorQueueMessageListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ErrorQueueMessageQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ErrorQueueMessageQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ErrorQueueMessageQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryHostedDocumentFileItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryHostedDocumentFileItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedDocumentFileListArgs {
    private String after;
    private String tenantId;
  
    public BusinessSchemaQueryHostedDocumentFileListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedInboundFileItemsArgs {
    private Iterable<String> idList;
    private String inboundFolder;
    private String tenantId;
  
    public BusinessSchemaQueryHostedInboundFileItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.inboundFolder = (String) args.get("inboundFolder");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getInboundFolder() { return this.inboundFolder; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setInboundFolder(String inboundFolder) { this.inboundFolder = inboundFolder; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedInboundFileListArgs {
    private String after;
    private String inboundFolder;
    private String tenantId;
  
    public BusinessSchemaQueryHostedInboundFileListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.inboundFolder = (String) args.get("inboundFolder");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public String getInboundFolder() { return this.inboundFolder; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setInboundFolder(String inboundFolder) { this.inboundFolder = inboundFolder; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedListFileItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryHostedListFileItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedListFileListArgs {
    private String after;
    private String tenantId;
  
    public BusinessSchemaQueryHostedListFileListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedReportFileItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryHostedReportFileItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryHostedReportFileListArgs {
    private String after;
    private String tenantId;
  
    public BusinessSchemaQueryHostedReportFileListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryInboundFaxListArgs {
    private String after;
    private InboundFaxQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryInboundFaxListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new InboundFaxQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public InboundFaxQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(InboundFaxQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryInboundSmsListArgs {
    private String after;
    private InboundSmsQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryInboundSmsListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new InboundSmsQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public InboundSmsQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(InboundSmsQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryIncomingEmailHistoryItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryIncomingEmailHistoryItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryIncomingEmailHistoryListArgs {
    private String after;
    private IncomingEmailHistoryQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryIncomingEmailHistoryListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new IncomingEmailHistoryQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public IncomingEmailHistoryQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(IncomingEmailHistoryQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobItemItemsArgs {
    private Iterable<JobItemIdInput> idList;
    private String tenantId;
  
    public BusinessSchemaQueryJobItemItemsArgs(Map<String, Object> args) {
      if (args != null) {
        if (args.get("idList") != null) {
        		this.idList = (Iterable<JobItemIdInput>) args.get("idList");
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<JobItemIdInput> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<JobItemIdInput> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobItemListArgs {
    private String after;
    private JobItemQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryJobItemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new JobItemQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public JobItemQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(JobItemQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryJobItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobListArgs {
    private String after;
    private JobQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryJobListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new JobQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public JobQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(JobQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobMessageItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryJobMessageItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobMessageListArgs {
    private String after;
    private JobMessageQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryJobMessageListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new JobMessageQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public JobMessageQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(JobMessageQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobSummaryItemsArgs {
    private Iterable<Integer> idList;
    private String tenantId;
  
    public BusinessSchemaQueryJobSummaryItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<Integer>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<Integer> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<Integer> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryJobSummaryListArgs {
    private String after;
    private JobSummaryQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryJobSummaryListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new JobSummaryQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public JobSummaryQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(JobSummaryQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryListOfValuesItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryListOfValuesItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryListOfValuesListArgs {
    private String after;
    private ListOfValuesQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryListOfValuesListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ListOfValuesQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ListOfValuesQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ListOfValuesQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryListOfValuesSystemListArgs {
    private String after;
    private Language language;
    private ListOfValuesQueryParamsInput params;
  
    public BusinessSchemaQueryListOfValuesSystemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new ListOfValuesQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public ListOfValuesQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(ListOfValuesQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryMetadataItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryMetadataItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryMetadataListArgs {
    private String after;
    private MetadataQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryMetadataListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new MetadataQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public MetadataQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(MetadataQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryMetadataSystemListArgs {
    private String after;
    private Language language;
    private MetadataQueryParamsInput params;
  
    public BusinessSchemaQueryMetadataSystemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new MetadataQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public MetadataQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(MetadataQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryNatureItemsArgs {
    private Iterable<String> idList;
    private Language language;
  
    public BusinessSchemaQueryNatureItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
  }
  public static class BusinessSchemaQueryNatureListArgs {
    private String after;
    private Language language;
    private NatureQueryParamsInput params;
  
    public BusinessSchemaQueryNatureListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new NatureQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public NatureQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(NatureQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryNoteItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryNoteItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryNoteListArgs {
    private String after;
    private NoteQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryNoteListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new NoteQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public NoteQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(NoteQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryPostalJobItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryPostalJobItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryPostalJobListArgs {
    private String after;
    private PostalJobQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryPostalJobListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new PostalJobQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public PostalJobQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(PostalJobQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryPostalParameterConfigurationItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryPostalParameterConfigurationItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryPostalParameterConfigurationListArgs {
    private String after;
    private PostalParameterConfigurationQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryPostalParameterConfigurationListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new PostalParameterConfigurationQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public PostalParameterConfigurationQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(PostalParameterConfigurationQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryProcessingJobCountStatisticsArgs {
    private String tenantId;
  
    public BusinessSchemaQueryProcessingJobCountStatisticsArgs(Map<String, Object> args) {
      if (args != null) {
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getTenantId() { return this.tenantId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryRightInitialValueListArgs {
    private String after;
    private RightInitialValueQueryParamsInput params;
    private UserProfile profile;
  
    public BusinessSchemaQueryRightInitialValueListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new RightInitialValueQueryParamsInput((Map<String, Object>) args.get("params"));
        if (args.get("profile") instanceof UserProfile) {
          this.profile = (UserProfile) args.get("profile");
        } else {
          this.profile = UserProfile.valueOf((String) args.get("profile"));
        }
      }
    }
  
    public String getAfter() { return this.after; }
    public RightInitialValueQueryParamsInput getParams() { return this.params; }
    public UserProfile getProfile() { return this.profile; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(RightInitialValueQueryParamsInput params) { this.params = params; }
    public void setProfile(UserProfile profile) { this.profile = profile; }
  }
  public static class BusinessSchemaQueryServiceItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryServiceItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryServiceListArgs {
    private String after;
    private ServiceQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryServiceListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ServiceQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ServiceQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ServiceQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryStatusActionListArgs {
    private String after;
    private StatusActionQueryParamsInput params;
  
    public BusinessSchemaQueryStatusActionListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new StatusActionQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public StatusActionQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(StatusActionQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryTemplateContentItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryTemplateContentItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTemplateContentListArgs {
    private String after;
    private Language language;
    private TemplateContentQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryTemplateContentListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new TemplateContentQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public TemplateContentQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(TemplateContentQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTemplateStructureItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryTemplateStructureItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTemplateStructureListArgs {
    private String after;
    private Language language;
    private TemplateStructureQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryTemplateStructureListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new TemplateStructureQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public TemplateStructureQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(TemplateStructureQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTemplateVariableListArgs {
    private Iterable<String> ancestorIds;
    private String documentTypeId;
    private String domainId;
    private String natureId;
    private TemplateContentNotificationType notificationType;
    private String serviceId;
    private String tenantId;
  
    public BusinessSchemaQueryTemplateVariableListArgs(Map<String, Object> args) {
      if (args != null) {
        this.ancestorIds = (Iterable<String>) args.get("ancestorIds");
        this.documentTypeId = (String) args.get("documentTypeId");
        this.domainId = (String) args.get("domainId");
        this.natureId = (String) args.get("natureId");
        if (args.get("notificationType") instanceof TemplateContentNotificationType) {
          this.notificationType = (TemplateContentNotificationType) args.get("notificationType");
        } else {
          this.notificationType = TemplateContentNotificationType.valueOf((String) args.get("notificationType"));
        }
        this.serviceId = (String) args.get("serviceId");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getAncestorIds() { return this.ancestorIds; }
    public String getDocumentTypeId() { return this.documentTypeId; }
    public String getDomainId() { return this.domainId; }
    public String getNatureId() { return this.natureId; }
    public TemplateContentNotificationType getNotificationType() { return this.notificationType; }
    public String getServiceId() { return this.serviceId; }
    public String getTenantId() { return this.tenantId; }
    public void setAncestorIds(Iterable<String> ancestorIds) { this.ancestorIds = ancestorIds; }
    public void setDocumentTypeId(String documentTypeId) { this.documentTypeId = documentTypeId; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setNatureId(String natureId) { this.natureId = natureId; }
    public void setNotificationType(TemplateContentNotificationType notificationType) { this.notificationType = notificationType; }
    public void setServiceId(String serviceId) { this.serviceId = serviceId; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTemporaryDocumentItemsArgs {
    private Iterable<String> idList;
  
    public BusinessSchemaQueryTemporaryDocumentItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class BusinessSchemaQueryTemporaryDocumentListArgs {
    private String after;
    private TemporaryDocumentHeaderQueryParamsInput params;
  
    public BusinessSchemaQueryTemporaryDocumentListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new TemporaryDocumentHeaderQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public TemporaryDocumentHeaderQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(TemporaryDocumentHeaderQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryTenantUserItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryTenantUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTenantUserListArgs {
    private String after;
    private TenantUserQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryTenantUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new TenantUserQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public TenantUserQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(TenantUserQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryTenantUserRightListArgs {
    private String after;
    private RightValueQueryParamsInput params;
    private String tenantId;
    private String tenantUserId;
  
    public BusinessSchemaQueryTenantUserRightListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new RightValueQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
        this.tenantUserId = (String) args.get("tenantUserId");
      }
    }
  
    public String getAfter() { return this.after; }
    public RightValueQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public String getTenantUserId() { return this.tenantUserId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(RightValueQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public void setTenantUserId(String tenantUserId) { this.tenantUserId = tenantUserId; }
  }
  public static class BusinessSchemaQueryThirdPartyItemsArgs {
    private Iterable<String> idList;
    private String tenantId;
  
    public BusinessSchemaQueryThirdPartyItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryThirdPartyListArgs {
    private String after;
    private ThirdPartyQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryThirdPartyListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ThirdPartyQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ThirdPartyQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ThirdPartyQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryThirdPartyTypeItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryThirdPartyTypeItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryThirdPartyTypeListArgs {
    private String after;
    private ThirdPartyTypeQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryThirdPartyTypeListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ThirdPartyTypeQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ThirdPartyTypeQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ThirdPartyTypeQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryThirdPartyTypeSystemListArgs {
    private String after;
    private Language language;
    private ThirdPartyTypeQueryParamsInput params;
  
    public BusinessSchemaQueryThirdPartyTypeSystemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new ThirdPartyTypeQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public ThirdPartyTypeQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(ThirdPartyTypeQueryParamsInput params) { this.params = params; }
  }
  public static class BusinessSchemaQueryValueOfListItemsArgs {
    private Iterable<String> idList;
    private Language language;
    private String tenantId;
  
    public BusinessSchemaQueryValueOfListItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public Language getLanguage() { return this.language; }
    public String getTenantId() { return this.tenantId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
    public void setLanguage(Language language) { this.language = language; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryValueOfListListArgs {
    private String after;
    private ValueOfListQueryParamsInput params;
    private String tenantId;
  
    public BusinessSchemaQueryValueOfListListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ValueOfListQueryParamsInput((Map<String, Object>) args.get("params"));
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getAfter() { return this.after; }
    public ValueOfListQueryParamsInput getParams() { return this.params; }
    public String getTenantId() { return this.tenantId; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ValueOfListQueryParamsInput params) { this.params = params; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  public static class BusinessSchemaQueryValueOfListSystemListArgs {
    private String after;
    private Language language;
    private ValueOfListQueryParamsInput params;
  
    public BusinessSchemaQueryValueOfListSystemListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        if (args.get("language") instanceof Language) {
          this.language = (Language) args.get("language");
        } else {
          this.language = Language.valueOf((String) args.get("language"));
        }
        this.params = new ValueOfListQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public Language getLanguage() { return this.language; }
    public ValueOfListQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setLanguage(Language language) { this.language = language; }
    public void setParams(ValueOfListQueryParamsInput params) { this.params = params; }
  }
  
  public static class ChorusB2GAdhocRecipientInput {
    private String name;
  
    public ChorusB2GAdhocRecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.name = (String) args.get("name");
      }
    }
  
    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }
  }
  
  public static class ChorusB2GConfigInput {
    private Boolean isTestMode;
    private String login;
    private String password;
    private String providerId;
    private Boolean recalculate;
    private ChorusServerType serverType;
  
    public ChorusB2GConfigInput(Map<String, Object> args) {
      if (args != null) {
        this.isTestMode = (Boolean) args.get("isTestMode");
        this.login = (String) args.get("login");
        this.password = (String) args.get("password");
        this.providerId = (String) args.get("providerId");
        this.recalculate = (Boolean) args.get("recalculate");
        if (args.get("serverType") instanceof ChorusServerType) {
          this.serverType = (ChorusServerType) args.get("serverType");
        } else {
          this.serverType = ChorusServerType.valueOf((String) args.get("serverType"));
        }
      }
    }
  
    public Boolean getIsTestMode() { return this.isTestMode; }
    public String getLogin() { return this.login; }
    public String getPassword() { return this.password; }
    public String getProviderId() { return this.providerId; }
    public Boolean getRecalculate() { return this.recalculate; }
    public ChorusServerType getServerType() { return this.serverType; }
    public void setIsTestMode(Boolean isTestMode) { this.isTestMode = isTestMode; }
    public void setLogin(String login) { this.login = login; }
    public void setPassword(String password) { this.password = password; }
    public void setProviderId(String providerId) { this.providerId = providerId; }
    public void setRecalculate(Boolean recalculate) { this.recalculate = recalculate; }
    public void setServerType(ChorusServerType serverType) { this.serverType = serverType; }
  }
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
  
  
  
  public enum ChorusServerType {
    PROD,
    QUALIF
    
  }
  
  
  
  public static class ContactBoolFilterInput {
    private ContactBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ContactBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ContactBoolFilterField) {
          this.field = (ContactBoolFilterField) args.get("field");
        } else {
          this.field = ContactBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ContactBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ContactBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ContactBoolFilterField {
    IS_ENABLED,
    IS_FAVORITE,
    IS_PRINCIPAL
    
  }
  
  
  public static class ContactFunctionBoolFilterInput {
    private ContactFunctionBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ContactFunctionBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ContactFunctionBoolFilterField) {
          this.field = (ContactFunctionBoolFilterField) args.get("field");
        } else {
          this.field = ContactFunctionBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ContactFunctionBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ContactFunctionBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ContactFunctionBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ContactFunctionInput {
    private String code;
    private String id;
    private Boolean isEnabled;
    private String name;
    private String ownerId;
    private ContactFunctionOwnerType ownerType;
  
    public ContactFunctionInput(Map<String, Object> args) {
      if (args != null) {
        this.code = (String) args.get("code");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof ContactFunctionOwnerType) {
          this.ownerType = (ContactFunctionOwnerType) args.get("ownerType");
        } else {
          this.ownerType = ContactFunctionOwnerType.valueOf((String) args.get("ownerType"));
        }
      }
    }
  
    public String getCode() { return this.code; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public String getOwnerId() { return this.ownerId; }
    public ContactFunctionOwnerType getOwnerType() { return this.ownerType; }
    public void setCode(String code) { this.code = code; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(ContactFunctionOwnerType ownerType) { this.ownerType = ownerType; }
  }
  public enum ContactFunctionOwnerType {
    SYSTEM,
    TENANT
    
  }
  
  public static class ContactFunctionQueryParamsInput {
    private Iterable<ContactFunctionBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private ContactFunctionSortField sortField;
    private Iterable<ContactFunctionStringFilterInput> stringFilters;
  
    public ContactFunctionQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ContactFunctionBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ContactFunctionSortField) {
          this.sortField = (ContactFunctionSortField) args.get("sortField");
        } else {
          this.sortField = ContactFunctionSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ContactFunctionStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ContactFunctionBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ContactFunctionSortField getSortField() { return this.sortField; }
    public Iterable<ContactFunctionStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ContactFunctionBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ContactFunctionSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ContactFunctionStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ContactFunctionSortField {
    CODE,
    IS_ENABLED,
    NAME,
    OWNER_TYPE
    
  }
  
  public static class ContactFunctionStringFilterInput {
    private ContactFunctionStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ContactFunctionStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ContactFunctionStringFilterField) {
          this.field = (ContactFunctionStringFilterField) args.get("field");
        } else {
          this.field = ContactFunctionStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ContactFunctionStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ContactFunctionStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ContactFunctionStringFilterField {
    CODE,
    NAME
    
  }
  
  
  public static class ContactInput {
    private String civility;
    private String culture;
    private DocumentTransmissionMode documentTransmissionMode;
    private String email;
    private String firstName;
    private Iterable<String> functionIds;
    private String id;
    private Boolean isEnabled;
    private Boolean isFavorite;
    private Boolean isPrincipal;
    private String lastName;
    private String phone;
    private String thirdPartyId;
    private String timeZone;
  
    public ContactInput(Map<String, Object> args) {
      if (args != null) {
        this.civility = (String) args.get("civility");
        this.culture = (String) args.get("culture");
        if (args.get("documentTransmissionMode") instanceof DocumentTransmissionMode) {
          this.documentTransmissionMode = (DocumentTransmissionMode) args.get("documentTransmissionMode");
        } else {
          this.documentTransmissionMode = DocumentTransmissionMode.valueOf((String) args.get("documentTransmissionMode"));
        }
        this.email = (String) args.get("email");
        this.firstName = (String) args.get("firstName");
        this.functionIds = (Iterable<String>) args.get("functionIds");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.isFavorite = (Boolean) args.get("isFavorite");
        this.isPrincipal = (Boolean) args.get("isPrincipal");
        this.lastName = (String) args.get("lastName");
        this.phone = (String) args.get("phone");
        this.thirdPartyId = (String) args.get("thirdPartyId");
        this.timeZone = (String) args.get("timeZone");
      }
    }
  
    public String getCivility() { return this.civility; }
    public String getCulture() { return this.culture; }
    public DocumentTransmissionMode getDocumentTransmissionMode() { return this.documentTransmissionMode; }
    public String getEmail() { return this.email; }
    public String getFirstName() { return this.firstName; }
    public Iterable<String> getFunctionIds() { return this.functionIds; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public Boolean getIsFavorite() { return this.isFavorite; }
    public Boolean getIsPrincipal() { return this.isPrincipal; }
    public String getLastName() { return this.lastName; }
    public String getPhone() { return this.phone; }
    public String getThirdPartyId() { return this.thirdPartyId; }
    public String getTimeZone() { return this.timeZone; }
    public void setCivility(String civility) { this.civility = civility; }
    public void setCulture(String culture) { this.culture = culture; }
    public void setDocumentTransmissionMode(DocumentTransmissionMode documentTransmissionMode) { this.documentTransmissionMode = documentTransmissionMode; }
    public void setEmail(String email) { this.email = email; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setFunctionIds(Iterable<String> functionIds) { this.functionIds = functionIds; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setIsFavorite(Boolean isFavorite) { this.isFavorite = isFavorite; }
    public void setIsPrincipal(Boolean isPrincipal) { this.isPrincipal = isPrincipal; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setThirdPartyId(String thirdPartyId) { this.thirdPartyId = thirdPartyId; }
    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }
  }
  public static class ContactQueryParamsInput {
    private Iterable<ContactBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private ContactSortField sortField;
    private Iterable<ContactStringFilterInput> stringFilters;
  
    public ContactQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ContactBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ContactSortField) {
          this.sortField = (ContactSortField) args.get("sortField");
        } else {
          this.sortField = ContactSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ContactStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ContactBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ContactSortField getSortField() { return this.sortField; }
    public Iterable<ContactStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ContactBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ContactSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ContactStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public static class ContactRecipientInput {
    private String contactId;
  
    public ContactRecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.contactId = (String) args.get("contactId");
      }
    }
  
    public String getContactId() { return this.contactId; }
    public void setContactId(String contactId) { this.contactId = contactId; }
  }
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
  
  public static class ContactStringFilterInput {
    private ContactStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ContactStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ContactStringFilterField) {
          this.field = (ContactStringFilterField) args.get("field");
        } else {
          this.field = ContactStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ContactStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ContactStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ContactStringFilterField {
    EMAIL,
    FIRST_NAME,
    LAST_NAME,
    THIRD_PARTY_ID,
    THIRD_PARTY_NAME,
    USER_ID
    
  }
  
  
  
  public static class DashboardDashboardVisibilityTypeEnumFilterInput {
    private DashboardVisibilityFilterField field;
    private DashboardVisibilityType filterValue1;
    private DashboardVisibilityType filterValue2;
    private NumberFilterOperator operator;
  
    public DashboardDashboardVisibilityTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DashboardVisibilityFilterField) {
          this.field = (DashboardVisibilityFilterField) args.get("field");
        } else {
          this.field = DashboardVisibilityFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof DashboardVisibilityType) {
          this.filterValue1 = (DashboardVisibilityType) args.get("filterValue1");
        } else {
          this.filterValue1 = DashboardVisibilityType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof DashboardVisibilityType) {
          this.filterValue2 = (DashboardVisibilityType) args.get("filterValue2");
        } else {
          this.filterValue2 = DashboardVisibilityType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DashboardVisibilityFilterField getField() { return this.field; }
    public DashboardVisibilityType getFilterValue1() { return this.filterValue1; }
    public DashboardVisibilityType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DashboardVisibilityFilterField field) { this.field = field; }
    public void setFilterValue1(DashboardVisibilityType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(DashboardVisibilityType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DashboardQueryParamsInput {
    private Iterable<DashboardDashboardVisibilityTypeEnumFilterInput> dashboardVisibilityFilters;
    private SortDirection sortDirection;
    private DashboardSortField sortField;
    private Iterable<DashboardStringFilterInput> stringFilters;
  
    public DashboardQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dashboardVisibilityFilters") != null) {
        		this.dashboardVisibilityFilters = (Iterable<DashboardDashboardVisibilityTypeEnumFilterInput>) args.get("dashboardVisibilityFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DashboardSortField) {
          this.sortField = (DashboardSortField) args.get("sortField");
        } else {
          this.sortField = DashboardSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DashboardStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DashboardDashboardVisibilityTypeEnumFilterInput> getDashboardVisibilityFilters() { return this.dashboardVisibilityFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DashboardSortField getSortField() { return this.sortField; }
    public Iterable<DashboardStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDashboardVisibilityFilters(Iterable<DashboardDashboardVisibilityTypeEnumFilterInput> dashboardVisibilityFilters) { this.dashboardVisibilityFilters = dashboardVisibilityFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DashboardSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DashboardStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  
  public static class DashboardRightInput {
    private String dashboardType;
    private String userId;
  
    public DashboardRightInput(Map<String, Object> args) {
      if (args != null) {
        this.dashboardType = (String) args.get("dashboardType");
        this.userId = (String) args.get("userId");
      }
    }
  
    public String getDashboardType() { return this.dashboardType; }
    public String getUserId() { return this.userId; }
    public void setDashboardType(String dashboardType) { this.dashboardType = dashboardType; }
    public void setUserId(String userId) { this.userId = userId; }
  }
  public static class DashboardRightQueryParamsInput {
    private SortDirection sortDirection;
    private DashboardRightSortField sortField;
    private Iterable<DashboardRightStringFilterInput> stringFilters;
  
    public DashboardRightQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DashboardRightSortField) {
          this.sortField = (DashboardRightSortField) args.get("sortField");
        } else {
          this.sortField = DashboardRightSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DashboardRightStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DashboardRightSortField getSortField() { return this.sortField; }
    public Iterable<DashboardRightStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DashboardRightSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DashboardRightStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum DashboardRightSortField {
    ID,
    USER_ID
    
  }
  
  public static class DashboardRightStringFilterInput {
    private DashboardRightStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DashboardRightStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DashboardRightStringFilterField) {
          this.field = (DashboardRightStringFilterField) args.get("field");
        } else {
          this.field = DashboardRightStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DashboardRightStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DashboardRightStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DashboardRightStringFilterField {
    USER_ID
    
  }
  
  
  public enum DashboardSortField {
    NAME
    
  }
  
  public static class DashboardStringFilterInput {
    private DashboardStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DashboardStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DashboardStringFilterField) {
          this.field = (DashboardStringFilterField) args.get("field");
        } else {
          this.field = DashboardStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DashboardStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DashboardStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DashboardStringFilterField {
    DASHBOARD_TYPE,
    NAME
    
  }
  
  
  public enum DashboardVisibilityFilterField {
    DASHBOARD_VISIBILITY
    
  }
  
  public enum DashboardVisibilityType {
    INTERNAL,
    PUBLIC_CUSTOM,
    PUBLIC_STANDARD
    
  }
  
  public static class DataFileActionInput {
    private String action;
    private String data;
    private String format;
    private String name;
    private String parameters;
  
    public DataFileActionInput(Map<String, Object> args) {
      if (args != null) {
        this.action = (String) args.get("action");
        this.data = (String) args.get("data");
        this.format = (String) args.get("format");
        this.name = (String) args.get("name");
        this.parameters = (String) args.get("parameters");
      }
    }
  
    public String getAction() { return this.action; }
    public String getData() { return this.data; }
    public String getFormat() { return this.format; }
    public String getName() { return this.name; }
    public String getParameters() { return this.parameters; }
    public void setAction(String action) { this.action = action; }
    public void setData(String data) { this.data = data; }
    public void setFormat(String format) { this.format = format; }
    public void setName(String name) { this.name = name; }
    public void setParameters(String parameters) { this.parameters = parameters; }
  }
  
  
  public static class DocumentActionOptionsInput {
    private DocumentActionType action;
    private Iterable<AttachmentInput> attachments;
    private String comment;
    private Iterable<GedFieldInput> metadata;
  
    public DocumentActionOptionsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("action") instanceof DocumentActionType) {
          this.action = (DocumentActionType) args.get("action");
        } else {
          this.action = DocumentActionType.valueOf((String) args.get("action"));
        }
        if (args.get("attachments") != null) {
        		this.attachments = (Iterable<AttachmentInput>) args.get("attachments");
        }
        this.comment = (String) args.get("comment");
        if (args.get("metadata") != null) {
        		this.metadata = (Iterable<GedFieldInput>) args.get("metadata");
        }
      }
    }
  
    public DocumentActionType getAction() { return this.action; }
    public Iterable<AttachmentInput> getAttachments() { return this.attachments; }
    public String getComment() { return this.comment; }
    public Iterable<GedFieldInput> getMetadata() { return this.metadata; }
    public void setAction(DocumentActionType action) { this.action = action; }
    public void setAttachments(Iterable<AttachmentInput> attachments) { this.attachments = attachments; }
    public void setComment(String comment) { this.comment = comment; }
    public void setMetadata(Iterable<GedFieldInput> metadata) { this.metadata = metadata; }
  }
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
  
  public static class DocumentBoolFilterInput {
    private DocumentBooleanFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public DocumentBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentBooleanFilterField) {
          this.field = (DocumentBooleanFilterField) args.get("field");
        } else {
          this.field = DocumentBooleanFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentBooleanFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentBooleanFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentBooleanFilterField {
    IS_READ,
    IS_SENT,
    IS_SIGNED
    
  }
  
  
  
  public enum DocumentCountStatisticsCycleFilterField {
    CYCLE
    
  }
  
  public static class DocumentCountStatisticsDateFilterInput {
    private DocumentCountStatisticsDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentCountStatisticsDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentCountStatisticsDateFilterField) {
          this.field = (DocumentCountStatisticsDateFilterField) args.get("field");
        } else {
          this.field = DocumentCountStatisticsDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentCountStatisticsDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentCountStatisticsDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentCountStatisticsDateFilterField {
    FIRST_JOB_DATE
    
  }
  
  public static class DocumentCountStatisticsNatureCycleEnumFilterInput {
    private DocumentCountStatisticsCycleFilterField field;
    private NatureCycle filterValue1;
    private NatureCycle filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentCountStatisticsNatureCycleEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentCountStatisticsCycleFilterField) {
          this.field = (DocumentCountStatisticsCycleFilterField) args.get("field");
        } else {
          this.field = DocumentCountStatisticsCycleFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof NatureCycle) {
          this.filterValue1 = (NatureCycle) args.get("filterValue1");
        } else {
          this.filterValue1 = NatureCycle.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof NatureCycle) {
          this.filterValue2 = (NatureCycle) args.get("filterValue2");
        } else {
          this.filterValue2 = NatureCycle.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentCountStatisticsCycleFilterField getField() { return this.field; }
    public NatureCycle getFilterValue1() { return this.filterValue1; }
    public NatureCycle getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentCountStatisticsCycleFilterField field) { this.field = field; }
    public void setFilterValue1(NatureCycle filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(NatureCycle filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentCountStatisticsQueryParamsInput {
    private Iterable<DocumentCountStatisticsNatureCycleEnumFilterInput> cycleFilters;
    private Iterable<DocumentCountStatisticsDateFilterInput> dateFilters;
  
    public DocumentCountStatisticsQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("cycleFilters") != null) {
        		this.cycleFilters = (Iterable<DocumentCountStatisticsNatureCycleEnumFilterInput>) args.get("cycleFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<DocumentCountStatisticsDateFilterInput>) args.get("dateFilters");
        }
      }
    }
  
    public Iterable<DocumentCountStatisticsNatureCycleEnumFilterInput> getCycleFilters() { return this.cycleFilters; }
    public Iterable<DocumentCountStatisticsDateFilterInput> getDateFilters() { return this.dateFilters; }
    public void setCycleFilters(Iterable<DocumentCountStatisticsNatureCycleEnumFilterInput> cycleFilters) { this.cycleFilters = cycleFilters; }
    public void setDateFilters(Iterable<DocumentCountStatisticsDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
  }
  public static class DocumentDateFilterInput {
    private DocumentDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentDateFilterField) {
          this.field = (DocumentDateFilterField) args.get("field");
        } else {
          this.field = DocumentDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentDateFilterField {
    CREATION_DATE,
    READ_DATE,
    SENT_DATE,
    SIGN_DATE
    
  }
  
  public static class DocumentDocumentArrayElementFilterFieldArrayElementFilterInput {
    private DocumentArrayElementFilterField field;
    private String filterArrayElementName;
    private Boolean filterBoolValue1;
    private Boolean filterBoolValue2;
    private Object filterDateValue1;
    private Object filterDateValue2;
    private Double filterDoubleValue1;
    private Double filterDoubleValue2;
    private Integer filterIntValue1;
    private Integer filterIntValue2;
    private String filterStringValue1;
    private String filterStringValue2;
    private ArrayElementFilterOperator operator;
  
    public DocumentDocumentArrayElementFilterFieldArrayElementFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentArrayElementFilterField) {
          this.field = (DocumentArrayElementFilterField) args.get("field");
        } else {
          this.field = DocumentArrayElementFilterField.valueOf((String) args.get("field"));
        }
        this.filterArrayElementName = (String) args.get("filterArrayElementName");
        this.filterBoolValue1 = (Boolean) args.get("filterBoolValue1");
        this.filterBoolValue2 = (Boolean) args.get("filterBoolValue2");
        this.filterDateValue1 = (Object) args.get("filterDateValue1");
        this.filterDateValue2 = (Object) args.get("filterDateValue2");
        this.filterDoubleValue1 = (Double) args.get("filterDoubleValue1");
        this.filterDoubleValue2 = (Double) args.get("filterDoubleValue2");
        this.filterIntValue1 = (Integer) args.get("filterIntValue1");
        this.filterIntValue2 = (Integer) args.get("filterIntValue2");
        this.filterStringValue1 = (String) args.get("filterStringValue1");
        this.filterStringValue2 = (String) args.get("filterStringValue2");
        if (args.get("operator") instanceof ArrayElementFilterOperator) {
          this.operator = (ArrayElementFilterOperator) args.get("operator");
        } else {
          this.operator = ArrayElementFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentArrayElementFilterField getField() { return this.field; }
    public String getFilterArrayElementName() { return this.filterArrayElementName; }
    public Boolean getFilterBoolValue1() { return this.filterBoolValue1; }
    public Boolean getFilterBoolValue2() { return this.filterBoolValue2; }
    public Object getFilterDateValue1() { return this.filterDateValue1; }
    public Object getFilterDateValue2() { return this.filterDateValue2; }
    public Double getFilterDoubleValue1() { return this.filterDoubleValue1; }
    public Double getFilterDoubleValue2() { return this.filterDoubleValue2; }
    public Integer getFilterIntValue1() { return this.filterIntValue1; }
    public Integer getFilterIntValue2() { return this.filterIntValue2; }
    public String getFilterStringValue1() { return this.filterStringValue1; }
    public String getFilterStringValue2() { return this.filterStringValue2; }
    public ArrayElementFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentArrayElementFilterField field) { this.field = field; }
    public void setFilterArrayElementName(String filterArrayElementName) { this.filterArrayElementName = filterArrayElementName; }
    public void setFilterBoolValue1(Boolean filterBoolValue1) { this.filterBoolValue1 = filterBoolValue1; }
    public void setFilterBoolValue2(Boolean filterBoolValue2) { this.filterBoolValue2 = filterBoolValue2; }
    public void setFilterDateValue1(Object filterDateValue1) { this.filterDateValue1 = filterDateValue1; }
    public void setFilterDateValue2(Object filterDateValue2) { this.filterDateValue2 = filterDateValue2; }
    public void setFilterDoubleValue1(Double filterDoubleValue1) { this.filterDoubleValue1 = filterDoubleValue1; }
    public void setFilterDoubleValue2(Double filterDoubleValue2) { this.filterDoubleValue2 = filterDoubleValue2; }
    public void setFilterIntValue1(Integer filterIntValue1) { this.filterIntValue1 = filterIntValue1; }
    public void setFilterIntValue2(Integer filterIntValue2) { this.filterIntValue2 = filterIntValue2; }
    public void setFilterStringValue1(String filterStringValue1) { this.filterStringValue1 = filterStringValue1; }
    public void setFilterStringValue2(String filterStringValue2) { this.filterStringValue2 = filterStringValue2; }
    public void setOperator(ArrayElementFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentDocumentStatusEnumFilterInput {
    private DocumentStatusFilterField field;
    private DocumentStatus filterValue1;
    private DocumentStatus filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentDocumentStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentStatusFilterField) {
          this.field = (DocumentStatusFilterField) args.get("field");
        } else {
          this.field = DocumentStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof DocumentStatus) {
          this.filterValue1 = (DocumentStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = DocumentStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof DocumentStatus) {
          this.filterValue2 = (DocumentStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = DocumentStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentStatusFilterField getField() { return this.field; }
    public DocumentStatus getFilterValue1() { return this.filterValue1; }
    public DocumentStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentStatusFilterField field) { this.field = field; }
    public void setFilterValue1(DocumentStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(DocumentStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentDocumentTypeSignTypeEnumFilterInput {
    private DocumentSignTypeFilterField field;
    private DocumentTypeSignType filterValue1;
    private DocumentTypeSignType filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentDocumentTypeSignTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentSignTypeFilterField) {
          this.field = (DocumentSignTypeFilterField) args.get("field");
        } else {
          this.field = DocumentSignTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof DocumentTypeSignType) {
          this.filterValue1 = (DocumentTypeSignType) args.get("filterValue1");
        } else {
          this.filterValue1 = DocumentTypeSignType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof DocumentTypeSignType) {
          this.filterValue2 = (DocumentTypeSignType) args.get("filterValue2");
        } else {
          this.filterValue2 = DocumentTypeSignType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentSignTypeFilterField getField() { return this.field; }
    public DocumentTypeSignType getFilterValue1() { return this.filterValue1; }
    public DocumentTypeSignType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentSignTypeFilterField field) { this.field = field; }
    public void setFilterValue1(DocumentTypeSignType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(DocumentTypeSignType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentIdOrNewInput {
    private String existingDocumentId;
    private DocumentInput newDocument;
  
    public DocumentIdOrNewInput(Map<String, Object> args) {
      if (args != null) {
        this.existingDocumentId = (String) args.get("existingDocumentId");
        this.newDocument = new DocumentInput((Map<String, Object>) args.get("newDocument"));
      }
    }
  
    public String getExistingDocumentId() { return this.existingDocumentId; }
    public DocumentInput getNewDocument() { return this.newDocument; }
    public void setExistingDocumentId(String existingDocumentId) { this.existingDocumentId = existingDocumentId; }
    public void setNewDocument(DocumentInput newDocument) { this.newDocument = newDocument; }
  }
  
  public static class DocumentInput {
    private String base64;
    private String documentSubTypeCode;
    private String documentTypeCode;
    private String fileName;
    private Iterable<GedFieldInput> gedFields;
    private String gedXml;
    private String hash;
    private String tempFileId;
  
    public DocumentInput(Map<String, Object> args) {
      if (args != null) {
        this.base64 = (String) args.get("base64");
        this.documentSubTypeCode = (String) args.get("documentSubTypeCode");
        this.documentTypeCode = (String) args.get("documentTypeCode");
        this.fileName = (String) args.get("fileName");
        if (args.get("gedFields") != null) {
        		this.gedFields = (Iterable<GedFieldInput>) args.get("gedFields");
        }
        this.gedXml = (String) args.get("gedXml");
        this.hash = (String) args.get("hash");
        this.tempFileId = (String) args.get("tempFileId");
      }
    }
  
    public String getBase64() { return this.base64; }
    public String getDocumentSubTypeCode() { return this.documentSubTypeCode; }
    public String getDocumentTypeCode() { return this.documentTypeCode; }
    public String getFileName() { return this.fileName; }
    public Iterable<GedFieldInput> getGedFields() { return this.gedFields; }
    public String getGedXml() { return this.gedXml; }
    public String getHash() { return this.hash; }
    public String getTempFileId() { return this.tempFileId; }
    public void setBase64(String base64) { this.base64 = base64; }
    public void setDocumentSubTypeCode(String documentSubTypeCode) { this.documentSubTypeCode = documentSubTypeCode; }
    public void setDocumentTypeCode(String documentTypeCode) { this.documentTypeCode = documentTypeCode; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setGedFields(Iterable<GedFieldInput> gedFields) { this.gedFields = gedFields; }
    public void setGedXml(String gedXml) { this.gedXml = gedXml; }
    public void setHash(String hash) { this.hash = hash; }
    public void setTempFileId(String tempFileId) { this.tempFileId = tempFileId; }
  }
  
  public static class DocumentJobDateFilterInput {
    private JobDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentJobDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobDateFilterField) {
          this.field = (JobDateFilterField) args.get("field");
        } else {
          this.field = JobDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentJobInput {
    private Iterable<FileIdOrBase64Input> adhocRecipientsFiles;
    private Iterable<AttachmentInput> attachments;
    private ChorusB2GAdhocRecipientInput chorusB2GAdhocRecipient;
    private Iterable<ContactRecipientInput> contactRecipients;
    private DocumentIdOrNewInput document;
    private Iterable<EmailAdhocRecipientInput> emailAdhocRecipients;
    private String note;
    private Iterable<PostalAdhocRecipientInput> postalAdhocRecipients;
    private PostalParameterInput postalParameter;
    private String serviceId;
    private Iterable<ThirdPartyRecipientInput> thirdPartyRecipients;
    private String trackingId;
    private DocumentJobValidationType validationType;
  
    public DocumentJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientsFiles") != null) {
        		this.adhocRecipientsFiles = (Iterable<FileIdOrBase64Input>) args.get("adhocRecipientsFiles");
        }
        if (args.get("attachments") != null) {
        		this.attachments = (Iterable<AttachmentInput>) args.get("attachments");
        }
        this.chorusB2GAdhocRecipient = new ChorusB2GAdhocRecipientInput((Map<String, Object>) args.get("chorusB2GAdhocRecipient"));
        if (args.get("contactRecipients") != null) {
        		this.contactRecipients = (Iterable<ContactRecipientInput>) args.get("contactRecipients");
        }
        this.document = new DocumentIdOrNewInput((Map<String, Object>) args.get("document"));
        if (args.get("emailAdhocRecipients") != null) {
        		this.emailAdhocRecipients = (Iterable<EmailAdhocRecipientInput>) args.get("emailAdhocRecipients");
        }
        this.note = (String) args.get("note");
        if (args.get("postalAdhocRecipients") != null) {
        		this.postalAdhocRecipients = (Iterable<PostalAdhocRecipientInput>) args.get("postalAdhocRecipients");
        }
        this.postalParameter = new PostalParameterInput((Map<String, Object>) args.get("postalParameter"));
        this.serviceId = (String) args.get("serviceId");
        if (args.get("thirdPartyRecipients") != null) {
        		this.thirdPartyRecipients = (Iterable<ThirdPartyRecipientInput>) args.get("thirdPartyRecipients");
        }
        this.trackingId = (String) args.get("trackingId");
        if (args.get("validationType") instanceof DocumentJobValidationType) {
          this.validationType = (DocumentJobValidationType) args.get("validationType");
        } else {
          this.validationType = DocumentJobValidationType.valueOf((String) args.get("validationType"));
        }
      }
    }
  
    public Iterable<FileIdOrBase64Input> getAdhocRecipientsFiles() { return this.adhocRecipientsFiles; }
    public Iterable<AttachmentInput> getAttachments() { return this.attachments; }
    public ChorusB2GAdhocRecipientInput getChorusB2GAdhocRecipient() { return this.chorusB2GAdhocRecipient; }
    public Iterable<ContactRecipientInput> getContactRecipients() { return this.contactRecipients; }
    public DocumentIdOrNewInput getDocument() { return this.document; }
    public Iterable<EmailAdhocRecipientInput> getEmailAdhocRecipients() { return this.emailAdhocRecipients; }
    public String getNote() { return this.note; }
    public Iterable<PostalAdhocRecipientInput> getPostalAdhocRecipients() { return this.postalAdhocRecipients; }
    public PostalParameterInput getPostalParameter() { return this.postalParameter; }
    public String getServiceId() { return this.serviceId; }
    public Iterable<ThirdPartyRecipientInput> getThirdPartyRecipients() { return this.thirdPartyRecipients; }
    public String getTrackingId() { return this.trackingId; }
    public DocumentJobValidationType getValidationType() { return this.validationType; }
    public void setAdhocRecipientsFiles(Iterable<FileIdOrBase64Input> adhocRecipientsFiles) { this.adhocRecipientsFiles = adhocRecipientsFiles; }
    public void setAttachments(Iterable<AttachmentInput> attachments) { this.attachments = attachments; }
    public void setChorusB2GAdhocRecipient(ChorusB2GAdhocRecipientInput chorusB2GAdhocRecipient) { this.chorusB2GAdhocRecipient = chorusB2GAdhocRecipient; }
    public void setContactRecipients(Iterable<ContactRecipientInput> contactRecipients) { this.contactRecipients = contactRecipients; }
    public void setDocument(DocumentIdOrNewInput document) { this.document = document; }
    public void setEmailAdhocRecipients(Iterable<EmailAdhocRecipientInput> emailAdhocRecipients) { this.emailAdhocRecipients = emailAdhocRecipients; }
    public void setNote(String note) { this.note = note; }
    public void setPostalAdhocRecipients(Iterable<PostalAdhocRecipientInput> postalAdhocRecipients) { this.postalAdhocRecipients = postalAdhocRecipients; }
    public void setPostalParameter(PostalParameterInput postalParameter) { this.postalParameter = postalParameter; }
    public void setServiceId(String serviceId) { this.serviceId = serviceId; }
    public void setThirdPartyRecipients(Iterable<ThirdPartyRecipientInput> thirdPartyRecipients) { this.thirdPartyRecipients = thirdPartyRecipients; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
    public void setValidationType(DocumentJobValidationType validationType) { this.validationType = validationType; }
  }
  public static class DocumentJobJobBaseStatusEnumFilterInput {
    private JobStatusFilterField field;
    private JobBaseStatus filterValue1;
    private JobBaseStatus filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentJobJobBaseStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStatusFilterField) {
          this.field = (JobStatusFilterField) args.get("field");
        } else {
          this.field = JobStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobBaseStatus) {
          this.filterValue1 = (JobBaseStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobBaseStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobBaseStatus) {
          this.filterValue2 = (JobBaseStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobBaseStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStatusFilterField getField() { return this.field; }
    public JobBaseStatus getFilterValue1() { return this.filterValue1; }
    public JobBaseStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobBaseStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobBaseStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentJobQueryParamsInput {
    private Iterable<DocumentJobDateFilterInput> dateFilters;
    private Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters;
    private SortDirection sortDirection;
    private JobSortField sortField;
    private Iterable<DocumentJobJobBaseStatusEnumFilterInput> statusFilters;
    private Iterable<DocumentJobStringFilterInput> stringFilters;
  
    public DocumentJobQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<DocumentJobDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("jobTypeFilters") != null) {
        		this.jobTypeFilters = (Iterable<JobBaseJobBaseTypeEnumFilterInput>) args.get("jobTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobSortField) {
          this.sortField = (JobSortField) args.get("sortField");
        } else {
          this.sortField = JobSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<DocumentJobJobBaseStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DocumentJobStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DocumentJobDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobBaseJobBaseTypeEnumFilterInput> getJobTypeFilters() { return this.jobTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobSortField getSortField() { return this.sortField; }
    public Iterable<DocumentJobJobBaseStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<DocumentJobStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<DocumentJobDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setJobTypeFilters(Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters) { this.jobTypeFilters = jobTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<DocumentJobJobBaseStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<DocumentJobStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public static class DocumentJobStringFilterInput {
    private JobStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DocumentJobStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStringFilterField) {
          this.field = (JobStringFilterField) args.get("field");
        } else {
          this.field = JobStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  
  public enum DocumentJobValidationType {
    FOR_NEW_THIRDPARTY,
    NONE,
    WITH_VALIDATION
    
  }
  
  
  public static class DocumentProbativeJobDateFilterInput {
    private JobDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentProbativeJobDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobDateFilterField) {
          this.field = (JobDateFilterField) args.get("field");
        } else {
          this.field = JobDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentProbativeJobInput {
    private Iterable<FileIdOrBase64Input> adhocRecipientsFiles;
    private Iterable<AttachmentInput> attachments;
    private Iterable<ContactRecipientInput> contactRecipients;
    private DocumentIdOrNewInput document;
    private Iterable<EmailAdhocRecipientInput> emailAdhocRecipients;
    private String joinedMessage;
    private String note;
    private DocumentProbativeJobType probativeType;
    private RegisteredPostalOptionsInput registeredPostalOptions;
    private String serviceId;
    private String subject;
    private Iterable<ThirdPartyRecipientInput> thirdPartyRecipients;
    private String trackingId;
    private DocumentJobValidationType validationType;
  
    public DocumentProbativeJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientsFiles") != null) {
        		this.adhocRecipientsFiles = (Iterable<FileIdOrBase64Input>) args.get("adhocRecipientsFiles");
        }
        if (args.get("attachments") != null) {
        		this.attachments = (Iterable<AttachmentInput>) args.get("attachments");
        }
        if (args.get("contactRecipients") != null) {
        		this.contactRecipients = (Iterable<ContactRecipientInput>) args.get("contactRecipients");
        }
        this.document = new DocumentIdOrNewInput((Map<String, Object>) args.get("document"));
        if (args.get("emailAdhocRecipients") != null) {
        		this.emailAdhocRecipients = (Iterable<EmailAdhocRecipientInput>) args.get("emailAdhocRecipients");
        }
        this.joinedMessage = (String) args.get("joinedMessage");
        this.note = (String) args.get("note");
        if (args.get("probativeType") instanceof DocumentProbativeJobType) {
          this.probativeType = (DocumentProbativeJobType) args.get("probativeType");
        } else {
          this.probativeType = DocumentProbativeJobType.valueOf((String) args.get("probativeType"));
        }
        this.registeredPostalOptions = new RegisteredPostalOptionsInput((Map<String, Object>) args.get("registeredPostalOptions"));
        this.serviceId = (String) args.get("serviceId");
        this.subject = (String) args.get("subject");
        if (args.get("thirdPartyRecipients") != null) {
        		this.thirdPartyRecipients = (Iterable<ThirdPartyRecipientInput>) args.get("thirdPartyRecipients");
        }
        this.trackingId = (String) args.get("trackingId");
        if (args.get("validationType") instanceof DocumentJobValidationType) {
          this.validationType = (DocumentJobValidationType) args.get("validationType");
        } else {
          this.validationType = DocumentJobValidationType.valueOf((String) args.get("validationType"));
        }
      }
    }
  
    public Iterable<FileIdOrBase64Input> getAdhocRecipientsFiles() { return this.adhocRecipientsFiles; }
    public Iterable<AttachmentInput> getAttachments() { return this.attachments; }
    public Iterable<ContactRecipientInput> getContactRecipients() { return this.contactRecipients; }
    public DocumentIdOrNewInput getDocument() { return this.document; }
    public Iterable<EmailAdhocRecipientInput> getEmailAdhocRecipients() { return this.emailAdhocRecipients; }
    public String getJoinedMessage() { return this.joinedMessage; }
    public String getNote() { return this.note; }
    public DocumentProbativeJobType getProbativeType() { return this.probativeType; }
    public RegisteredPostalOptionsInput getRegisteredPostalOptions() { return this.registeredPostalOptions; }
    public String getServiceId() { return this.serviceId; }
    public String getSubject() { return this.subject; }
    public Iterable<ThirdPartyRecipientInput> getThirdPartyRecipients() { return this.thirdPartyRecipients; }
    public String getTrackingId() { return this.trackingId; }
    public DocumentJobValidationType getValidationType() { return this.validationType; }
    public void setAdhocRecipientsFiles(Iterable<FileIdOrBase64Input> adhocRecipientsFiles) { this.adhocRecipientsFiles = adhocRecipientsFiles; }
    public void setAttachments(Iterable<AttachmentInput> attachments) { this.attachments = attachments; }
    public void setContactRecipients(Iterable<ContactRecipientInput> contactRecipients) { this.contactRecipients = contactRecipients; }
    public void setDocument(DocumentIdOrNewInput document) { this.document = document; }
    public void setEmailAdhocRecipients(Iterable<EmailAdhocRecipientInput> emailAdhocRecipients) { this.emailAdhocRecipients = emailAdhocRecipients; }
    public void setJoinedMessage(String joinedMessage) { this.joinedMessage = joinedMessage; }
    public void setNote(String note) { this.note = note; }
    public void setProbativeType(DocumentProbativeJobType probativeType) { this.probativeType = probativeType; }
    public void setRegisteredPostalOptions(RegisteredPostalOptionsInput registeredPostalOptions) { this.registeredPostalOptions = registeredPostalOptions; }
    public void setServiceId(String serviceId) { this.serviceId = serviceId; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setThirdPartyRecipients(Iterable<ThirdPartyRecipientInput> thirdPartyRecipients) { this.thirdPartyRecipients = thirdPartyRecipients; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
    public void setValidationType(DocumentJobValidationType validationType) { this.validationType = validationType; }
  }
  public static class DocumentProbativeJobJobBaseStatusEnumFilterInput {
    private JobStatusFilterField field;
    private JobBaseStatus filterValue1;
    private JobBaseStatus filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentProbativeJobJobBaseStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStatusFilterField) {
          this.field = (JobStatusFilterField) args.get("field");
        } else {
          this.field = JobStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobBaseStatus) {
          this.filterValue1 = (JobBaseStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobBaseStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobBaseStatus) {
          this.filterValue2 = (JobBaseStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobBaseStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStatusFilterField getField() { return this.field; }
    public JobBaseStatus getFilterValue1() { return this.filterValue1; }
    public JobBaseStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobBaseStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobBaseStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class DocumentProbativeJobQueryParamsInput {
    private Iterable<DocumentProbativeJobDateFilterInput> dateFilters;
    private Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters;
    private SortDirection sortDirection;
    private JobSortField sortField;
    private Iterable<DocumentProbativeJobJobBaseStatusEnumFilterInput> statusFilters;
    private Iterable<DocumentProbativeJobStringFilterInput> stringFilters;
  
    public DocumentProbativeJobQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<DocumentProbativeJobDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("jobTypeFilters") != null) {
        		this.jobTypeFilters = (Iterable<JobBaseJobBaseTypeEnumFilterInput>) args.get("jobTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobSortField) {
          this.sortField = (JobSortField) args.get("sortField");
        } else {
          this.sortField = JobSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<DocumentProbativeJobJobBaseStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DocumentProbativeJobStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DocumentProbativeJobDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobBaseJobBaseTypeEnumFilterInput> getJobTypeFilters() { return this.jobTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobSortField getSortField() { return this.sortField; }
    public Iterable<DocumentProbativeJobJobBaseStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<DocumentProbativeJobStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<DocumentProbativeJobDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setJobTypeFilters(Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters) { this.jobTypeFilters = jobTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<DocumentProbativeJobJobBaseStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<DocumentProbativeJobStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public static class DocumentProbativeJobStringFilterInput {
    private JobStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DocumentProbativeJobStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStringFilterField) {
          this.field = (JobStringFilterField) args.get("field");
        } else {
          this.field = JobStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentProbativeJobType {
    CERTIFIED,
    EIDAS_REGISTERED,
    REGISTERED,
    SIMPLE
    
  }
  
  
  public static class DocumentQueryParamsInput {
    private Iterable<DocumentDocumentArrayElementFilterFieldArrayElementFilterInput> arrayElementFilters;
    private Iterable<DocumentBoolFilterInput> boolFilters;
    private Iterable<DocumentDateFilterInput> dateFilters;
    private Iterable<DocumentDocumentTypeSignTypeEnumFilterInput> signTypeFilters;
    private String sortArrayElementName;
    private SortDirection sortDirection;
    private DocumentSortField sortField;
    private Iterable<DocumentDocumentStatusEnumFilterInput> statusFilters;
    private Iterable<DocumentStringFilterInput> stringFilters;
  
    public DocumentQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("arrayElementFilters") != null) {
        		this.arrayElementFilters = (Iterable<DocumentDocumentArrayElementFilterFieldArrayElementFilterInput>) args.get("arrayElementFilters");
        }
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<DocumentBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<DocumentDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("signTypeFilters") != null) {
        		this.signTypeFilters = (Iterable<DocumentDocumentTypeSignTypeEnumFilterInput>) args.get("signTypeFilters");
        }
        this.sortArrayElementName = (String) args.get("sortArrayElementName");
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DocumentSortField) {
          this.sortField = (DocumentSortField) args.get("sortField");
        } else {
          this.sortField = DocumentSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<DocumentDocumentStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DocumentStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DocumentDocumentArrayElementFilterFieldArrayElementFilterInput> getArrayElementFilters() { return this.arrayElementFilters; }
    public Iterable<DocumentBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<DocumentDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<DocumentDocumentTypeSignTypeEnumFilterInput> getSignTypeFilters() { return this.signTypeFilters; }
    public String getSortArrayElementName() { return this.sortArrayElementName; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DocumentSortField getSortField() { return this.sortField; }
    public Iterable<DocumentDocumentStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<DocumentStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setArrayElementFilters(Iterable<DocumentDocumentArrayElementFilterFieldArrayElementFilterInput> arrayElementFilters) { this.arrayElementFilters = arrayElementFilters; }
    public void setBoolFilters(Iterable<DocumentBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<DocumentDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSignTypeFilters(Iterable<DocumentDocumentTypeSignTypeEnumFilterInput> signTypeFilters) { this.signTypeFilters = signTypeFilters; }
    public void setSortArrayElementName(String sortArrayElementName) { this.sortArrayElementName = sortArrayElementName; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DocumentSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<DocumentDocumentStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<DocumentStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum DocumentSignTypeFilterField {
    SIGN_TYPE
    
  }
  
  
  public static class DocumentSizeStatisticsDateFilterInput {
    private DocumentSizeStatisticsDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public DocumentSizeStatisticsDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentSizeStatisticsDateFilterField) {
          this.field = (DocumentSizeStatisticsDateFilterField) args.get("field");
        } else {
          this.field = DocumentSizeStatisticsDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentSizeStatisticsDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentSizeStatisticsDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentSizeStatisticsDateFilterField {
    FIRST_JOB_DATE
    
  }
  
  public static class DocumentSizeStatisticsQueryParamsInput {
    private Iterable<DocumentSizeStatisticsDateFilterInput> dateFilters;
  
    public DocumentSizeStatisticsQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<DocumentSizeStatisticsDateFilterInput>) args.get("dateFilters");
        }
      }
    }
  
    public Iterable<DocumentSizeStatisticsDateFilterInput> getDateFilters() { return this.dateFilters; }
    public void setDateFilters(Iterable<DocumentSizeStatisticsDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
  }
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
  
  public static class DocumentStringFilterInput {
    private DocumentStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DocumentStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentStringFilterField) {
          this.field = (DocumentStringFilterField) args.get("field");
        } else {
          this.field = DocumentStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  public static class DocumentSubTypeQueryParamsInput {
    private SortDirection sortDirection;
    private DocumentSubTypeSortField sortField;
    private Iterable<DocumentSubTypeStringFilterInput> stringFilters;
  
    public DocumentSubTypeQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DocumentSubTypeSortField) {
          this.sortField = (DocumentSubTypeSortField) args.get("sortField");
        } else {
          this.sortField = DocumentSubTypeSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DocumentSubTypeStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DocumentSubTypeSortField getSortField() { return this.sortField; }
    public Iterable<DocumentSubTypeStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DocumentSubTypeSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DocumentSubTypeStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum DocumentSubTypeSortField {
    CHORUS_ATTACHMENT_TYPE_CODE,
    CHORUS_ATTACHMENT_TYPE_ID,
    CODE,
    CREATION_DATE,
    NAME
    
  }
  
  public static class DocumentSubTypeStringFilterInput {
    private DocumentSubTypeStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DocumentSubTypeStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentSubTypeStringFilterField) {
          this.field = (DocumentSubTypeStringFilterField) args.get("field");
        } else {
          this.field = DocumentSubTypeStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentSubTypeStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentSubTypeStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentSubTypeStringFilterField {
    CHORUS_ATTACHMENT_TYPE_CODE,
    CHORUS_ATTACHMENT_TYPE_ID,
    CODE,
    NAME,
    NATURE_CODES
    
  }
  
  
  public enum DocumentTransmissionMode {
    EMAIL_WITH_ATTACHMENT,
    EMAIL_WITH_LINK,
    NONE
    
  }
  
  
  
  
  public static class DocumentTypeInput {
    private ArchiveConfigurationInput archiveConfiguration;
    private String code;
    private String id;
    private String name;
    private String natureCode;
    private DocumentTypeSignType sign;
  
    public DocumentTypeInput(Map<String, Object> args) {
      if (args != null) {
        this.archiveConfiguration = new ArchiveConfigurationInput((Map<String, Object>) args.get("archiveConfiguration"));
        this.code = (String) args.get("code");
        this.id = (String) args.get("id");
        this.name = (String) args.get("name");
        this.natureCode = (String) args.get("natureCode");
        if (args.get("sign") instanceof DocumentTypeSignType) {
          this.sign = (DocumentTypeSignType) args.get("sign");
        } else {
          this.sign = DocumentTypeSignType.valueOf((String) args.get("sign"));
        }
      }
    }
  
    public ArchiveConfigurationInput getArchiveConfiguration() { return this.archiveConfiguration; }
    public String getCode() { return this.code; }
    public String getId() { return this.id; }
    public String getName() { return this.name; }
    public String getNatureCode() { return this.natureCode; }
    public DocumentTypeSignType getSign() { return this.sign; }
    public void setArchiveConfiguration(ArchiveConfigurationInput archiveConfiguration) { this.archiveConfiguration = archiveConfiguration; }
    public void setCode(String code) { this.code = code; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setNatureCode(String natureCode) { this.natureCode = natureCode; }
    public void setSign(DocumentTypeSignType sign) { this.sign = sign; }
  }
  public static class DocumentTypeQueryParamsInput {
    private SortDirection sortDirection;
    private DocumentTypeSortField sortField;
    private Iterable<DocumentTypeStringFilterInput> stringFilters;
  
    public DocumentTypeQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DocumentTypeSortField) {
          this.sortField = (DocumentTypeSortField) args.get("sortField");
        } else {
          this.sortField = DocumentTypeSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DocumentTypeStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DocumentTypeSortField getSortField() { return this.sortField; }
    public Iterable<DocumentTypeStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DocumentTypeSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DocumentTypeStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class DocumentTypeStringFilterInput {
    private DocumentTypeStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DocumentTypeStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DocumentTypeStringFilterField) {
          this.field = (DocumentTypeStringFilterField) args.get("field");
        } else {
          this.field = DocumentTypeStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DocumentTypeStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DocumentTypeStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DocumentTypeStringFilterField {
    CODE,
    NAME,
    NATURE_CODE
    
  }
  
  
  /** The application rights for domain user. */
  public enum DomainRightType {
    ADD_TENANT,
    CANCEL_JOB_MESSAGE,
    CHANGE_CONFIGURATION,
    CHANGE_DASHBOARD,
    CHANGE_DOMAIN,
    CHANGE_DOMAIN_API_USER,
    CHANGE_DOMAIN_USER,
    CHANGE_OMS_RESOURCES,
    CHANGE_POSTAL_PARAMETER_CONFIGURATION,
    CHANGE_POWER_BI_AUTH_TOKEN,
    CHANGE_PRODUCT,
    CHANGE_PRODUCT_INSTALL,
    CHANGE_TEMPLATE_CONTENT,
    CHANGE_TEMPLATE_STRUCTURE,
    CHANGE_TEMPLATE_VARIABLE_CONFIGURATION,
    CHANGE_TENANT_API_USER,
    CHANGE_TENANT_EDC_OMS_INFO,
    CHANGE_TENANT_USER,
    EDIT_TENANT,
    EDIT_TENANT_POSTAL_CONFIG,
    GRANT_INTERNAL_RIGHT,
    GRANT_RIGHT,
    READ_CONFIGURATION,
    READ_DASHBOARD,
    READ_DOMAIN,
    READ_DOMAIN_API_USER,
    READ_OMS_RESOURCES,
    READ_POSTAL_PARAMETER_CONFIGURATION,
    READ_PRODUCT,
    READ_PRODUCT_INSTALL,
    READ_STATUS_ACTION,
    READ_TEMPLATE_CONTENT,
    READ_TEMPLATE_STRUCTURE,
    READ_TEMPLATE_VARIABLE_CONFIGURATION,
    READ_TENANT,
    READ_TENANT_API_USER,
    READ_TENANT_EDC_OMS_INFO,
    SYNCHRONIZE_EDC_RESOURCES,
    VALIDATE_USER
    
  }
  
  
  public static class DomainRightValueInput {
    private DomainRightType right;
    private Boolean value;
  
    public DomainRightValueInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("right") instanceof DomainRightType) {
          this.right = (DomainRightType) args.get("right");
        } else {
          this.right = DomainRightType.valueOf((String) args.get("right"));
        }
        this.value = (Boolean) args.get("value");
      }
    }
  
    public DomainRightType getRight() { return this.right; }
    public Boolean getValue() { return this.value; }
    public void setRight(DomainRightType right) { this.right = right; }
    public void setValue(Boolean value) { this.value = value; }
  }
  
  
  public static class DomainUserBoolFilterInput {
    private DomainUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public DomainUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DomainUserBoolFilterField) {
          this.field = (DomainUserBoolFilterField) args.get("field");
        } else {
          this.field = DomainUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DomainUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(DomainUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum DomainUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class DomainUserInput {
    private String civility;
    private String culture;
    private String domainId;
    private String email;
    private String firstName;
    private String id;
    private Boolean isEnabled;
    private String lastName;
    private String phone;
    private String timeZone;
  
    public DomainUserInput(Map<String, Object> args) {
      if (args != null) {
        this.civility = (String) args.get("civility");
        this.culture = (String) args.get("culture");
        this.domainId = (String) args.get("domainId");
        this.email = (String) args.get("email");
        this.firstName = (String) args.get("firstName");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.lastName = (String) args.get("lastName");
        this.phone = (String) args.get("phone");
        this.timeZone = (String) args.get("timeZone");
      }
    }
  
    public String getCivility() { return this.civility; }
    public String getCulture() { return this.culture; }
    public String getDomainId() { return this.domainId; }
    public String getEmail() { return this.email; }
    public String getFirstName() { return this.firstName; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getLastName() { return this.lastName; }
    public String getPhone() { return this.phone; }
    public String getTimeZone() { return this.timeZone; }
    public void setCivility(String civility) { this.civility = civility; }
    public void setCulture(String culture) { this.culture = culture; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setEmail(String email) { this.email = email; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }
  }
  public static class DomainUserQueryParamsInput {
    private Iterable<DomainUserBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private DomainUserSortField sortField;
    private Iterable<DomainUserStringFilterInput> stringFilters;
  
    public DomainUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<DomainUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DomainUserSortField) {
          this.sortField = (DomainUserSortField) args.get("sortField");
        } else {
          this.sortField = DomainUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DomainUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DomainUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DomainUserSortField getSortField() { return this.sortField; }
    public Iterable<DomainUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<DomainUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DomainUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DomainUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class DomainUserStringFilterInput {
    private DomainUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DomainUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DomainUserStringFilterField) {
          this.field = (DomainUserStringFilterField) args.get("field");
        } else {
          this.field = DomainUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DomainUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DomainUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum DomainUserStringFilterField {
    DOMAIN_ID,
    DOMAIN_NAME,
    EMAIL,
    FIRST_NAME,
    LAST_NAME,
    USER_ID
    
  }
  
  
  public static class EmailAdhocRecipientInput {
    private DocumentTransmissionMode documentTransmissionMode;
    private String email;
    private Boolean isPrimary;
    private String name;
  
    public EmailAdhocRecipientInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("documentTransmissionMode") instanceof DocumentTransmissionMode) {
          this.documentTransmissionMode = (DocumentTransmissionMode) args.get("documentTransmissionMode");
        } else {
          this.documentTransmissionMode = DocumentTransmissionMode.valueOf((String) args.get("documentTransmissionMode"));
        }
        this.email = (String) args.get("email");
        this.isPrimary = (Boolean) args.get("isPrimary");
        this.name = (String) args.get("name");
      }
    }
  
    public DocumentTransmissionMode getDocumentTransmissionMode() { return this.documentTransmissionMode; }
    public String getEmail() { return this.email; }
    public Boolean getIsPrimary() { return this.isPrimary; }
    public String getName() { return this.name; }
    public void setDocumentTransmissionMode(DocumentTransmissionMode documentTransmissionMode) { this.documentTransmissionMode = documentTransmissionMode; }
    public void setEmail(String email) { this.email = email; }
    public void setIsPrimary(Boolean isPrimary) { this.isPrimary = isPrimary; }
    public void setName(String name) { this.name = name; }
  }
  public static class EmailJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<FileIdOrNewInputTypeInput> attachments;
    private Boolean deDuplicate;
    private Iterable<EmailJobRecipientInput> emailAdhocRecipients;
    private FileIdOrNewInputTypeInput emailAltBody;
    private FileIdOrNewInputTypeInput emailBody;
    private String jobType;
    private EmailParameterInput parameter;
    private Object scheduledStartTime;
    private String trackingId;
  
    public EmailJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("attachments") != null) {
        		this.attachments = (Iterable<FileIdOrNewInputTypeInput>) args.get("attachments");
        }
        this.deDuplicate = (Boolean) args.get("deDuplicate");
        if (args.get("emailAdhocRecipients") != null) {
        		this.emailAdhocRecipients = (Iterable<EmailJobRecipientInput>) args.get("emailAdhocRecipients");
        }
        this.emailAltBody = new FileIdOrNewInputTypeInput((Map<String, Object>) args.get("emailAltBody"));
        this.emailBody = new FileIdOrNewInputTypeInput((Map<String, Object>) args.get("emailBody"));
        this.jobType = (String) args.get("jobType");
        this.parameter = new EmailParameterInput((Map<String, Object>) args.get("parameter"));
        this.scheduledStartTime = (Object) args.get("scheduledStartTime");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<FileIdOrNewInputTypeInput> getAttachments() { return this.attachments; }
    public Boolean getDeDuplicate() { return this.deDuplicate; }
    public Iterable<EmailJobRecipientInput> getEmailAdhocRecipients() { return this.emailAdhocRecipients; }
    public FileIdOrNewInputTypeInput getEmailAltBody() { return this.emailAltBody; }
    public FileIdOrNewInputTypeInput getEmailBody() { return this.emailBody; }
    public String getJobType() { return this.jobType; }
    public EmailParameterInput getParameter() { return this.parameter; }
    public Object getScheduledStartTime() { return this.scheduledStartTime; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setAttachments(Iterable<FileIdOrNewInputTypeInput> attachments) { this.attachments = attachments; }
    public void setDeDuplicate(Boolean deDuplicate) { this.deDuplicate = deDuplicate; }
    public void setEmailAdhocRecipients(Iterable<EmailJobRecipientInput> emailAdhocRecipients) { this.emailAdhocRecipients = emailAdhocRecipients; }
    public void setEmailAltBody(FileIdOrNewInputTypeInput emailAltBody) { this.emailAltBody = emailAltBody; }
    public void setEmailBody(FileIdOrNewInputTypeInput emailBody) { this.emailBody = emailBody; }
    public void setJobType(String jobType) { this.jobType = jobType; }
    public void setParameter(EmailParameterInput parameter) { this.parameter = parameter; }
    public void setScheduledStartTime(Object scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public static class EmailJobRecipientInput {
    private String email;
    private String name;
    private Iterable<String> optionalFields;
  
    public EmailJobRecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.email = (String) args.get("email");
        this.name = (String) args.get("name");
        this.optionalFields = (Iterable<String>) args.get("optionalFields");
      }
    }
  
    public String getEmail() { return this.email; }
    public String getName() { return this.name; }
    public Iterable<String> getOptionalFields() { return this.optionalFields; }
    public void setEmail(String email) { this.email = email; }
    public void setName(String name) { this.name = name; }
    public void setOptionalFields(Iterable<String> optionalFields) { this.optionalFields = optionalFields; }
  }
  public static class EmailParameterInput {
    private Boolean activateAutoPull;
    private Boolean activateEmbeddedImageInHTML;
    private Boolean activateTracking;
    private String envelopeSender;
    private String from;
    private String preHeader;
    private EmailPriorityFlagType priorityFlag;
    private String replyTo;
    private String subject;
    private EmailTrackingType trackingType;
  
    public EmailParameterInput(Map<String, Object> args) {
      if (args != null) {
        this.activateAutoPull = (Boolean) args.get("activateAutoPull");
        this.activateEmbeddedImageInHTML = (Boolean) args.get("activateEmbeddedImageInHTML");
        this.activateTracking = (Boolean) args.get("activateTracking");
        this.envelopeSender = (String) args.get("envelopeSender");
        this.from = (String) args.get("from");
        this.preHeader = (String) args.get("preHeader");
        if (args.get("priorityFlag") instanceof EmailPriorityFlagType) {
          this.priorityFlag = (EmailPriorityFlagType) args.get("priorityFlag");
        } else {
          this.priorityFlag = EmailPriorityFlagType.valueOf((String) args.get("priorityFlag"));
        }
        this.replyTo = (String) args.get("replyTo");
        this.subject = (String) args.get("subject");
        if (args.get("trackingType") instanceof EmailTrackingType) {
          this.trackingType = (EmailTrackingType) args.get("trackingType");
        } else {
          this.trackingType = EmailTrackingType.valueOf((String) args.get("trackingType"));
        }
      }
    }
  
    public Boolean getActivateAutoPull() { return this.activateAutoPull; }
    public Boolean getActivateEmbeddedImageInHtml() { return this.activateEmbeddedImageInHTML; }
    public Boolean getActivateTracking() { return this.activateTracking; }
    public String getEnvelopeSender() { return this.envelopeSender; }
    public String getFrom() { return this.from; }
    public String getPreHeader() { return this.preHeader; }
    public EmailPriorityFlagType getPriorityFlag() { return this.priorityFlag; }
    public String getReplyTo() { return this.replyTo; }
    public String getSubject() { return this.subject; }
    public EmailTrackingType getTrackingType() { return this.trackingType; }
    public void setActivateAutoPull(Boolean activateAutoPull) { this.activateAutoPull = activateAutoPull; }
    public void setActivateEmbeddedImageInHtml(Boolean activateEmbeddedImageInHTML) { this.activateEmbeddedImageInHTML = activateEmbeddedImageInHTML; }
    public void setActivateTracking(Boolean activateTracking) { this.activateTracking = activateTracking; }
    public void setEnvelopeSender(String envelopeSender) { this.envelopeSender = envelopeSender; }
    public void setFrom(String from) { this.from = from; }
    public void setPreHeader(String preHeader) { this.preHeader = preHeader; }
    public void setPriorityFlag(EmailPriorityFlagType priorityFlag) { this.priorityFlag = priorityFlag; }
    public void setReplyTo(String replyTo) { this.replyTo = replyTo; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTrackingType(EmailTrackingType trackingType) { this.trackingType = trackingType; }
  }
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
    ADD_DATA_FILE_ACTION,
    ARCHIVE_DOCUMENT,
    CANCEL_DOCUMENT,
    CANCEL_JOB_MESSAGE,
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
  
  /** The application rights for environment user. */
  public enum EnvironmentRightType {
    CHANGE_API_ROUTING_CONFIGURATION,
    CHANGE_CONTACT_FUNCTION,
    CHANGE_ENVIRONMENT_API_USER,
    CHANGE_ENVIRONMENT_USER,
    CHANGE_THIRD_PARTY_TYPE,
    EDIT_TENANT_POSTAL_CONFIG,
    READ_API_ROUTING_CONFIGURATION,
    READ_CONTACT_FUNCTION,
    READ_ENVIRONMENT_API_USER,
    READ_STATUS_ACTION,
    READ_THIRD_PARTY_TYPE
    
  }
  
  
  public static class EnvironmentRightValueInput {
    private EnvironmentRightType right;
    private Boolean value;
  
    public EnvironmentRightValueInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("right") instanceof EnvironmentRightType) {
          this.right = (EnvironmentRightType) args.get("right");
        } else {
          this.right = EnvironmentRightType.valueOf((String) args.get("right"));
        }
        this.value = (Boolean) args.get("value");
      }
    }
  
    public EnvironmentRightType getRight() { return this.right; }
    public Boolean getValue() { return this.value; }
    public void setRight(EnvironmentRightType right) { this.right = right; }
    public void setValue(Boolean value) { this.value = value; }
  }
  
  
  public static class EnvironmentUserBoolFilterInput {
    private EnvironmentUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public EnvironmentUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof EnvironmentUserBoolFilterField) {
          this.field = (EnvironmentUserBoolFilterField) args.get("field");
        } else {
          this.field = EnvironmentUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public EnvironmentUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(EnvironmentUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum EnvironmentUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class EnvironmentUserInput {
    private String civility;
    private String culture;
    private String email;
    private String firstName;
    private String id;
    private Boolean isEnabled;
    private String lastName;
    private String phone;
    private String timeZone;
  
    public EnvironmentUserInput(Map<String, Object> args) {
      if (args != null) {
        this.civility = (String) args.get("civility");
        this.culture = (String) args.get("culture");
        this.email = (String) args.get("email");
        this.firstName = (String) args.get("firstName");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.lastName = (String) args.get("lastName");
        this.phone = (String) args.get("phone");
        this.timeZone = (String) args.get("timeZone");
      }
    }
  
    public String getCivility() { return this.civility; }
    public String getCulture() { return this.culture; }
    public String getEmail() { return this.email; }
    public String getFirstName() { return this.firstName; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getLastName() { return this.lastName; }
    public String getPhone() { return this.phone; }
    public String getTimeZone() { return this.timeZone; }
    public void setCivility(String civility) { this.civility = civility; }
    public void setCulture(String culture) { this.culture = culture; }
    public void setEmail(String email) { this.email = email; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }
  }
  public static class EnvironmentUserQueryParamsInput {
    private Iterable<EnvironmentUserBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private EnvironmentUserSortField sortField;
    private Iterable<EnvironmentUserStringFilterInput> stringFilters;
  
    public EnvironmentUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<EnvironmentUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof EnvironmentUserSortField) {
          this.sortField = (EnvironmentUserSortField) args.get("sortField");
        } else {
          this.sortField = EnvironmentUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<EnvironmentUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<EnvironmentUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public EnvironmentUserSortField getSortField() { return this.sortField; }
    public Iterable<EnvironmentUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<EnvironmentUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(EnvironmentUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<EnvironmentUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class EnvironmentUserStringFilterInput {
    private EnvironmentUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public EnvironmentUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof EnvironmentUserStringFilterField) {
          this.field = (EnvironmentUserStringFilterField) args.get("field");
        } else {
          this.field = EnvironmentUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public EnvironmentUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(EnvironmentUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum EnvironmentUserStringFilterField {
    EMAIL,
    FIRST_NAME,
    LAST_NAME,
    USER_ID
    
  }
  
  
  
  public enum ErrorQueueMessageActionFilterField {
    ACTION
    
  }
  
  public static class ErrorQueueMessageEngineEventActionEnumFilterInput {
    private ErrorQueueMessageActionFilterField field;
    private EngineEventAction filterValue1;
    private EngineEventAction filterValue2;
    private NumberFilterOperator operator;
  
    public ErrorQueueMessageEngineEventActionEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ErrorQueueMessageActionFilterField) {
          this.field = (ErrorQueueMessageActionFilterField) args.get("field");
        } else {
          this.field = ErrorQueueMessageActionFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof EngineEventAction) {
          this.filterValue1 = (EngineEventAction) args.get("filterValue1");
        } else {
          this.filterValue1 = EngineEventAction.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof EngineEventAction) {
          this.filterValue2 = (EngineEventAction) args.get("filterValue2");
        } else {
          this.filterValue2 = EngineEventAction.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ErrorQueueMessageActionFilterField getField() { return this.field; }
    public EngineEventAction getFilterValue1() { return this.filterValue1; }
    public EngineEventAction getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ErrorQueueMessageActionFilterField field) { this.field = field; }
    public void setFilterValue1(EngineEventAction filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(EngineEventAction filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput {
    private ErrorQueueMessageResourceTypeFilterField field;
    private ErrorQueueMessageResourceType filterValue1;
    private ErrorQueueMessageResourceType filterValue2;
    private NumberFilterOperator operator;
  
    public ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ErrorQueueMessageResourceTypeFilterField) {
          this.field = (ErrorQueueMessageResourceTypeFilterField) args.get("field");
        } else {
          this.field = ErrorQueueMessageResourceTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ErrorQueueMessageResourceType) {
          this.filterValue1 = (ErrorQueueMessageResourceType) args.get("filterValue1");
        } else {
          this.filterValue1 = ErrorQueueMessageResourceType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ErrorQueueMessageResourceType) {
          this.filterValue2 = (ErrorQueueMessageResourceType) args.get("filterValue2");
        } else {
          this.filterValue2 = ErrorQueueMessageResourceType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ErrorQueueMessageResourceTypeFilterField getField() { return this.field; }
    public ErrorQueueMessageResourceType getFilterValue1() { return this.filterValue1; }
    public ErrorQueueMessageResourceType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ErrorQueueMessageResourceTypeFilterField field) { this.field = field; }
    public void setFilterValue1(ErrorQueueMessageResourceType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ErrorQueueMessageResourceType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput {
    private ErrorQueueMessageStatusFilterField field;
    private ErrorQueueMessageStatus filterValue1;
    private ErrorQueueMessageStatus filterValue2;
    private NumberFilterOperator operator;
  
    public ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ErrorQueueMessageStatusFilterField) {
          this.field = (ErrorQueueMessageStatusFilterField) args.get("field");
        } else {
          this.field = ErrorQueueMessageStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ErrorQueueMessageStatus) {
          this.filterValue1 = (ErrorQueueMessageStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = ErrorQueueMessageStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ErrorQueueMessageStatus) {
          this.filterValue2 = (ErrorQueueMessageStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = ErrorQueueMessageStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ErrorQueueMessageStatusFilterField getField() { return this.field; }
    public ErrorQueueMessageStatus getFilterValue1() { return this.filterValue1; }
    public ErrorQueueMessageStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ErrorQueueMessageStatusFilterField field) { this.field = field; }
    public void setFilterValue1(ErrorQueueMessageStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ErrorQueueMessageStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class ErrorQueueMessageInput {
    private EngineEventAction action;
    private Integer errorCode;
    private String errorFunctionName;
    private String errorMessage;
    private String errorServiceName;
    private String errorStackTrace;
    private String id;
    private String jobId;
    private String resourceId;
    private ErrorQueueMessageResourceType resourceType;
    private ErrorQueueMessageStatus status;
    private String tenantId;
    private String tenantName;
  
    public ErrorQueueMessageInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("action") instanceof EngineEventAction) {
          this.action = (EngineEventAction) args.get("action");
        } else {
          this.action = EngineEventAction.valueOf((String) args.get("action"));
        }
        this.errorCode = (Integer) args.get("errorCode");
        this.errorFunctionName = (String) args.get("errorFunctionName");
        this.errorMessage = (String) args.get("errorMessage");
        this.errorServiceName = (String) args.get("errorServiceName");
        this.errorStackTrace = (String) args.get("errorStackTrace");
        this.id = (String) args.get("id");
        this.jobId = (String) args.get("jobId");
        this.resourceId = (String) args.get("resourceId");
        if (args.get("resourceType") instanceof ErrorQueueMessageResourceType) {
          this.resourceType = (ErrorQueueMessageResourceType) args.get("resourceType");
        } else {
          this.resourceType = ErrorQueueMessageResourceType.valueOf((String) args.get("resourceType"));
        }
        if (args.get("status") instanceof ErrorQueueMessageStatus) {
          this.status = (ErrorQueueMessageStatus) args.get("status");
        } else {
          this.status = ErrorQueueMessageStatus.valueOf((String) args.get("status"));
        }
        this.tenantId = (String) args.get("tenantId");
        this.tenantName = (String) args.get("tenantName");
      }
    }
  
    public EngineEventAction getAction() { return this.action; }
    public Integer getErrorCode() { return this.errorCode; }
    public String getErrorFunctionName() { return this.errorFunctionName; }
    public String getErrorMessage() { return this.errorMessage; }
    public String getErrorServiceName() { return this.errorServiceName; }
    public String getErrorStackTrace() { return this.errorStackTrace; }
    public String getId() { return this.id; }
    public String getJobId() { return this.jobId; }
    public String getResourceId() { return this.resourceId; }
    public ErrorQueueMessageResourceType getResourceType() { return this.resourceType; }
    public ErrorQueueMessageStatus getStatus() { return this.status; }
    public String getTenantId() { return this.tenantId; }
    public String getTenantName() { return this.tenantName; }
    public void setAction(EngineEventAction action) { this.action = action; }
    public void setErrorCode(Integer errorCode) { this.errorCode = errorCode; }
    public void setErrorFunctionName(String errorFunctionName) { this.errorFunctionName = errorFunctionName; }
    public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }
    public void setErrorServiceName(String errorServiceName) { this.errorServiceName = errorServiceName; }
    public void setErrorStackTrace(String errorStackTrace) { this.errorStackTrace = errorStackTrace; }
    public void setId(String id) { this.id = id; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public void setResourceId(String resourceId) { this.resourceId = resourceId; }
    public void setResourceType(ErrorQueueMessageResourceType resourceType) { this.resourceType = resourceType; }
    public void setStatus(ErrorQueueMessageStatus status) { this.status = status; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public void setTenantName(String tenantName) { this.tenantName = tenantName; }
  }
  public static class ErrorQueueMessageIntFilterInput {
    private ErrorQueueMessageIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public ErrorQueueMessageIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ErrorQueueMessageIntFilterField) {
          this.field = (ErrorQueueMessageIntFilterField) args.get("field");
        } else {
          this.field = ErrorQueueMessageIntFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Integer) args.get("filterValue1");
        this.filterValue2 = (Integer) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ErrorQueueMessageIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ErrorQueueMessageIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ErrorQueueMessageIntFilterField {
    ERROR_CODE
    
  }
  
  public static class ErrorQueueMessageQueryParamsInput {
    private Iterable<ErrorQueueMessageEngineEventActionEnumFilterInput> actionFilters;
    private Iterable<ErrorQueueMessageIntFilterInput> intFilters;
    private Iterable<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput> resourceTypeFilters;
    private SortDirection sortDirection;
    private ErrorQueueMessageSortField sortField;
    private Iterable<ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput> statusFilters;
    private Iterable<ErrorQueueMessageStringFilterInput> stringFilters;
  
    public ErrorQueueMessageQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("actionFilters") != null) {
        		this.actionFilters = (Iterable<ErrorQueueMessageEngineEventActionEnumFilterInput>) args.get("actionFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<ErrorQueueMessageIntFilterInput>) args.get("intFilters");
        }
        if (args.get("resourceTypeFilters") != null) {
        		this.resourceTypeFilters = (Iterable<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput>) args.get("resourceTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ErrorQueueMessageSortField) {
          this.sortField = (ErrorQueueMessageSortField) args.get("sortField");
        } else {
          this.sortField = ErrorQueueMessageSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ErrorQueueMessageStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ErrorQueueMessageEngineEventActionEnumFilterInput> getActionFilters() { return this.actionFilters; }
    public Iterable<ErrorQueueMessageIntFilterInput> getIntFilters() { return this.intFilters; }
    public Iterable<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput> getResourceTypeFilters() { return this.resourceTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ErrorQueueMessageSortField getSortField() { return this.sortField; }
    public Iterable<ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<ErrorQueueMessageStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setActionFilters(Iterable<ErrorQueueMessageEngineEventActionEnumFilterInput> actionFilters) { this.actionFilters = actionFilters; }
    public void setIntFilters(Iterable<ErrorQueueMessageIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setResourceTypeFilters(Iterable<ErrorQueueMessageErrorQueueMessageResourceTypeEnumFilterInput> resourceTypeFilters) { this.resourceTypeFilters = resourceTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ErrorQueueMessageSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<ErrorQueueMessageErrorQueueMessageStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<ErrorQueueMessageStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class ErrorQueueMessageStringFilterInput {
    private ErrorQueueMessageStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ErrorQueueMessageStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ErrorQueueMessageStringFilterField) {
          this.field = (ErrorQueueMessageStringFilterField) args.get("field");
        } else {
          this.field = ErrorQueueMessageStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ErrorQueueMessageStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ErrorQueueMessageStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  public static class FaxJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<RecipientInput> adhocRecipients;
    private Boolean deDuplicate;
    private Iterable<FileIdOrNewInputTypeInput> documents;
    private String jobType;
    private FaxParameterInput parameter;
    private Object scheduledStartTime;
    private String trackingId;
  
    public FaxJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("adhocRecipients") != null) {
        		this.adhocRecipients = (Iterable<RecipientInput>) args.get("adhocRecipients");
        }
        this.deDuplicate = (Boolean) args.get("deDuplicate");
        if (args.get("documents") != null) {
        		this.documents = (Iterable<FileIdOrNewInputTypeInput>) args.get("documents");
        }
        this.jobType = (String) args.get("jobType");
        this.parameter = new FaxParameterInput((Map<String, Object>) args.get("parameter"));
        this.scheduledStartTime = (Object) args.get("scheduledStartTime");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<RecipientInput> getAdhocRecipients() { return this.adhocRecipients; }
    public Boolean getDeDuplicate() { return this.deDuplicate; }
    public Iterable<FileIdOrNewInputTypeInput> getDocuments() { return this.documents; }
    public String getJobType() { return this.jobType; }
    public FaxParameterInput getParameter() { return this.parameter; }
    public Object getScheduledStartTime() { return this.scheduledStartTime; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setAdhocRecipients(Iterable<RecipientInput> adhocRecipients) { this.adhocRecipients = adhocRecipients; }
    public void setDeDuplicate(Boolean deDuplicate) { this.deDuplicate = deDuplicate; }
    public void setDocuments(Iterable<FileIdOrNewInputTypeInput> documents) { this.documents = documents; }
    public void setJobType(String jobType) { this.jobType = jobType; }
    public void setParameter(FaxParameterInput parameter) { this.parameter = parameter; }
    public void setScheduledStartTime(Object scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public enum FaxMode {
    FINE,
    STANDARD
    
  }
  
  public static class FaxParameterInput {
    private String coverSheetMemo;
    private String csid;
    private FaxMode resolution;
    private Boolean shouldFaxEmailBody;
    private Boolean shouldSuppressFaxConversion;
    private Boolean useBadNumberDns;
  
    public FaxParameterInput(Map<String, Object> args) {
      if (args != null) {
        this.coverSheetMemo = (String) args.get("coverSheetMemo");
        this.csid = (String) args.get("csid");
        if (args.get("resolution") instanceof FaxMode) {
          this.resolution = (FaxMode) args.get("resolution");
        } else {
          this.resolution = FaxMode.valueOf((String) args.get("resolution"));
        }
        this.shouldFaxEmailBody = (Boolean) args.get("shouldFaxEmailBody");
        this.shouldSuppressFaxConversion = (Boolean) args.get("shouldSuppressFaxConversion");
        this.useBadNumberDns = (Boolean) args.get("useBadNumberDns");
      }
    }
  
    public String getCoverSheetMemo() { return this.coverSheetMemo; }
    public String getCsid() { return this.csid; }
    public FaxMode getResolution() { return this.resolution; }
    public Boolean getShouldFaxEmailBody() { return this.shouldFaxEmailBody; }
    public Boolean getShouldSuppressFaxConversion() { return this.shouldSuppressFaxConversion; }
    public Boolean getUseBadNumberDns() { return this.useBadNumberDns; }
    public void setCoverSheetMemo(String coverSheetMemo) { this.coverSheetMemo = coverSheetMemo; }
    public void setCsid(String csid) { this.csid = csid; }
    public void setResolution(FaxMode resolution) { this.resolution = resolution; }
    public void setShouldFaxEmailBody(Boolean shouldFaxEmailBody) { this.shouldFaxEmailBody = shouldFaxEmailBody; }
    public void setShouldSuppressFaxConversion(Boolean shouldSuppressFaxConversion) { this.shouldSuppressFaxConversion = shouldSuppressFaxConversion; }
    public void setUseBadNumberDns(Boolean useBadNumberDns) { this.useBadNumberDns = useBadNumberDns; }
  }
  
  public static class FileContentInput {
    private String content;
    private String name;
  
    public FileContentInput(Map<String, Object> args) {
      if (args != null) {
        this.content = (String) args.get("content");
        this.name = (String) args.get("name");
      }
    }
  
    public String getContent() { return this.content; }
    public String getName() { return this.name; }
    public void setContent(String content) { this.content = content; }
    public void setName(String name) { this.name = name; }
  }
  
  
  public static class FileIdOrBase64Input {
    private String base64;
    private String tempFileId;
  
    public FileIdOrBase64Input(Map<String, Object> args) {
      if (args != null) {
        this.base64 = (String) args.get("base64");
        this.tempFileId = (String) args.get("tempFileId");
      }
    }
  
    public String getBase64() { return this.base64; }
    public String getTempFileId() { return this.tempFileId; }
    public void setBase64(String base64) { this.base64 = base64; }
    public void setTempFileId(String tempFileId) { this.tempFileId = tempFileId; }
  }
  public static class FileIdOrNewInputTypeInput {
    private String existingFileId;
    private FileInputTypeInput newFile;
  
    public FileIdOrNewInputTypeInput(Map<String, Object> args) {
      if (args != null) {
        this.existingFileId = (String) args.get("existingFileId");
        this.newFile = new FileInputTypeInput((Map<String, Object>) args.get("newFile"));
      }
    }
  
    public String getExistingFileId() { return this.existingFileId; }
    public FileInputTypeInput getNewFile() { return this.newFile; }
    public void setExistingFileId(String existingFileId) { this.existingFileId = existingFileId; }
    public void setNewFile(FileInputTypeInput newFile) { this.newFile = newFile; }
  }
  public static class FileInputTypeInput {
    private String base64;
    private String fileName;
    private String tempFileId;
  
    public FileInputTypeInput(Map<String, Object> args) {
      if (args != null) {
        this.base64 = (String) args.get("base64");
        this.fileName = (String) args.get("fileName");
        this.tempFileId = (String) args.get("tempFileId");
      }
    }
  
    public String getBase64() { return this.base64; }
    public String getFileName() { return this.fileName; }
    public String getTempFileId() { return this.tempFileId; }
    public void setBase64(String base64) { this.base64 = base64; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setTempFileId(String tempFileId) { this.tempFileId = tempFileId; }
  }
  public static class FileReferenceBaseInput {
    private String content;
    private Boolean hosted;
    private String name;
  
    public FileReferenceBaseInput(Map<String, Object> args) {
      if (args != null) {
        this.content = (String) args.get("content");
        this.hosted = (Boolean) args.get("hosted");
        this.name = (String) args.get("name");
      }
    }
  
    public String getContent() { return this.content; }
    public Boolean getHosted() { return this.hosted; }
    public String getName() { return this.name; }
    public void setContent(String content) { this.content = content; }
    public void setHosted(Boolean hosted) { this.hosted = hosted; }
    public void setName(String name) { this.name = name; }
  }
  public static class GedFieldInput {
    private String key;
    private MultipleTypeValueInput typedValue;
    private String value;
  
    public GedFieldInput(Map<String, Object> args) {
      if (args != null) {
        this.key = (String) args.get("key");
        this.typedValue = new MultipleTypeValueInput((Map<String, Object>) args.get("typedValue"));
        this.value = (String) args.get("value");
      }
    }
  
    public String getKey() { return this.key; }
    public MultipleTypeValueInput getTypedValue() { return this.typedValue; }
    public String getValue() { return this.value; }
    public void setKey(String key) { this.key = key; }
    public void setTypedValue(MultipleTypeValueInput typedValue) { this.typedValue = typedValue; }
    public void setValue(String value) { this.value = value; }
  }
  
  public static class IdNameInput {
    private String id;
  
    public IdNameInput(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  
  
  public static class InboundFaxDateFilterInput {
    private InboundFaxDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public InboundFaxDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof InboundFaxDateFilterField) {
          this.field = (InboundFaxDateFilterField) args.get("field");
        } else {
          this.field = InboundFaxDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public InboundFaxDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(InboundFaxDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum InboundFaxDateFilterField {
    RECEIVED_DATE
    
  }
  
  public static class InboundFaxQueryParamsInput {
    private Iterable<InboundFaxDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private InboundFaxSortField sortField;
    private Iterable<InboundFaxStringFilterInput> stringFilters;
  
    public InboundFaxQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<InboundFaxDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof InboundFaxSortField) {
          this.sortField = (InboundFaxSortField) args.get("sortField");
        } else {
          this.sortField = InboundFaxSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<InboundFaxStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<InboundFaxDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public InboundFaxSortField getSortField() { return this.sortField; }
    public Iterable<InboundFaxStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<InboundFaxDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(InboundFaxSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<InboundFaxStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class InboundFaxStringFilterInput {
    private InboundFaxStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public InboundFaxStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof InboundFaxStringFilterField) {
          this.field = (InboundFaxStringFilterField) args.get("field");
        } else {
          this.field = InboundFaxStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public InboundFaxStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(InboundFaxStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum InboundFaxStringFilterField {
    FROM,
    LOGIN,
    TO
    
  }
  
  
  
  public static class InboundSmsDateFilterInput {
    private InboundSmsDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public InboundSmsDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof InboundSmsDateFilterField) {
          this.field = (InboundSmsDateFilterField) args.get("field");
        } else {
          this.field = InboundSmsDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public InboundSmsDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(InboundSmsDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum InboundSmsDateFilterField {
    RECEIVED_DATE
    
  }
  
  public static class InboundSmsIntFilterInput {
    private InboundSmsIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public InboundSmsIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof InboundSmsIntFilterField) {
          this.field = (InboundSmsIntFilterField) args.get("field");
        } else {
          this.field = InboundSmsIntFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Integer) args.get("filterValue1");
        this.filterValue2 = (Integer) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public InboundSmsIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(InboundSmsIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum InboundSmsIntFilterField {
    JOB_NUMBER
    
  }
  
  public static class InboundSmsQueryParamsInput {
    private Iterable<InboundSmsDateFilterInput> dateFilters;
    private Iterable<InboundSmsIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private InboundSmsSortField sortField;
    private Iterable<InboundSmsStringFilterInput> stringFilters;
  
    public InboundSmsQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<InboundSmsDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<InboundSmsIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof InboundSmsSortField) {
          this.sortField = (InboundSmsSortField) args.get("sortField");
        } else {
          this.sortField = InboundSmsSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<InboundSmsStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<InboundSmsDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<InboundSmsIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public InboundSmsSortField getSortField() { return this.sortField; }
    public Iterable<InboundSmsStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<InboundSmsDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setIntFilters(Iterable<InboundSmsIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(InboundSmsSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<InboundSmsStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum InboundSmsSortField {
    CUSTOMER_NUMBER,
    FROM_ADDRESS,
    JOB_ITEM,
    JOB_NUMBER,
    RECEIVED_DATE,
    TO_ADDRESS
    
  }
  
  public static class InboundSmsStringFilterInput {
    private InboundSmsStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public InboundSmsStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof InboundSmsStringFilterField) {
          this.field = (InboundSmsStringFilterField) args.get("field");
        } else {
          this.field = InboundSmsStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public InboundSmsStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(InboundSmsStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum InboundSmsStringFilterField {
    FROM_ADDRESS,
    TO_ADDRESS
    
  }
  
  
  
  public static class IncomingEmailHistoryDateFilterInput {
    private IncomingEmailHistoryDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public IncomingEmailHistoryDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof IncomingEmailHistoryDateFilterField) {
          this.field = (IncomingEmailHistoryDateFilterField) args.get("field");
        } else {
          this.field = IncomingEmailHistoryDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public IncomingEmailHistoryDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(IncomingEmailHistoryDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum IncomingEmailHistoryDateFilterField {
    CREATION_DATE
    
  }
  
  public static class IncomingEmailHistoryInput {
    private Iterable<String> attachmentNames;
    private String errorString;
    private String from;
    private Iterable<KeyValuePairInput> headerValues;
    private String id;
    private String incomingEmailPath;
    private String routingConfigurationId;
    private ProcessingStatus status;
    private String subject;
    private String tenantId;
    private String to;
    private ProcessingType type;
  
    public IncomingEmailHistoryInput(Map<String, Object> args) {
      if (args != null) {
        this.attachmentNames = (Iterable<String>) args.get("attachmentNames");
        this.errorString = (String) args.get("errorString");
        this.from = (String) args.get("from");
        if (args.get("headerValues") != null) {
        		this.headerValues = (Iterable<KeyValuePairInput>) args.get("headerValues");
        }
        this.id = (String) args.get("id");
        this.incomingEmailPath = (String) args.get("incomingEmailPath");
        this.routingConfigurationId = (String) args.get("routingConfigurationId");
        if (args.get("status") instanceof ProcessingStatus) {
          this.status = (ProcessingStatus) args.get("status");
        } else {
          this.status = ProcessingStatus.valueOf((String) args.get("status"));
        }
        this.subject = (String) args.get("subject");
        this.tenantId = (String) args.get("tenantId");
        this.to = (String) args.get("to");
        if (args.get("type") instanceof ProcessingType) {
          this.type = (ProcessingType) args.get("type");
        } else {
          this.type = ProcessingType.valueOf((String) args.get("type"));
        }
      }
    }
  
    public Iterable<String> getAttachmentNames() { return this.attachmentNames; }
    public String getErrorString() { return this.errorString; }
    public String getFrom() { return this.from; }
    public Iterable<KeyValuePairInput> getHeaderValues() { return this.headerValues; }
    public String getId() { return this.id; }
    public String getIncomingEmailPath() { return this.incomingEmailPath; }
    public String getRoutingConfigurationId() { return this.routingConfigurationId; }
    public ProcessingStatus getStatus() { return this.status; }
    public String getSubject() { return this.subject; }
    public String getTenantId() { return this.tenantId; }
    public String getTo() { return this.to; }
    public ProcessingType getType() { return this.type; }
    public void setAttachmentNames(Iterable<String> attachmentNames) { this.attachmentNames = attachmentNames; }
    public void setErrorString(String errorString) { this.errorString = errorString; }
    public void setFrom(String from) { this.from = from; }
    public void setHeaderValues(Iterable<KeyValuePairInput> headerValues) { this.headerValues = headerValues; }
    public void setId(String id) { this.id = id; }
    public void setIncomingEmailPath(String incomingEmailPath) { this.incomingEmailPath = incomingEmailPath; }
    public void setRoutingConfigurationId(String routingConfigurationId) { this.routingConfigurationId = routingConfigurationId; }
    public void setStatus(ProcessingStatus status) { this.status = status; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public void setTo(String to) { this.to = to; }
    public void setType(ProcessingType type) { this.type = type; }
  }
  public static class IncomingEmailHistoryProcessingStatusEnumFilterInput {
    private IncomingEmailHistoryStatusFilterField field;
    private ProcessingStatus filterValue1;
    private ProcessingStatus filterValue2;
    private NumberFilterOperator operator;
  
    public IncomingEmailHistoryProcessingStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof IncomingEmailHistoryStatusFilterField) {
          this.field = (IncomingEmailHistoryStatusFilterField) args.get("field");
        } else {
          this.field = IncomingEmailHistoryStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ProcessingStatus) {
          this.filterValue1 = (ProcessingStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = ProcessingStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ProcessingStatus) {
          this.filterValue2 = (ProcessingStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = ProcessingStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public IncomingEmailHistoryStatusFilterField getField() { return this.field; }
    public ProcessingStatus getFilterValue1() { return this.filterValue1; }
    public ProcessingStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(IncomingEmailHistoryStatusFilterField field) { this.field = field; }
    public void setFilterValue1(ProcessingStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ProcessingStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class IncomingEmailHistoryProcessingTypeEnumFilterInput {
    private IncomingEmailHistoryTypeFilterField field;
    private ProcessingType filterValue1;
    private ProcessingType filterValue2;
    private NumberFilterOperator operator;
  
    public IncomingEmailHistoryProcessingTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof IncomingEmailHistoryTypeFilterField) {
          this.field = (IncomingEmailHistoryTypeFilterField) args.get("field");
        } else {
          this.field = IncomingEmailHistoryTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof ProcessingType) {
          this.filterValue1 = (ProcessingType) args.get("filterValue1");
        } else {
          this.filterValue1 = ProcessingType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof ProcessingType) {
          this.filterValue2 = (ProcessingType) args.get("filterValue2");
        } else {
          this.filterValue2 = ProcessingType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public IncomingEmailHistoryTypeFilterField getField() { return this.field; }
    public ProcessingType getFilterValue1() { return this.filterValue1; }
    public ProcessingType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(IncomingEmailHistoryTypeFilterField field) { this.field = field; }
    public void setFilterValue1(ProcessingType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(ProcessingType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class IncomingEmailHistoryQueryParamsInput {
    private Iterable<IncomingEmailHistoryDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private IncomingEmailHistorySortField sortField;
    private Iterable<IncomingEmailHistoryProcessingStatusEnumFilterInput> statusFilters;
    private Iterable<IncomingEmailHistoryStringFilterInput> stringFilters;
    private Iterable<IncomingEmailHistoryProcessingTypeEnumFilterInput> typeFilters;
  
    public IncomingEmailHistoryQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<IncomingEmailHistoryDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof IncomingEmailHistorySortField) {
          this.sortField = (IncomingEmailHistorySortField) args.get("sortField");
        } else {
          this.sortField = IncomingEmailHistorySortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<IncomingEmailHistoryProcessingStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<IncomingEmailHistoryStringFilterInput>) args.get("stringFilters");
        }
        if (args.get("typeFilters") != null) {
        		this.typeFilters = (Iterable<IncomingEmailHistoryProcessingTypeEnumFilterInput>) args.get("typeFilters");
        }
      }
    }
  
    public Iterable<IncomingEmailHistoryDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public IncomingEmailHistorySortField getSortField() { return this.sortField; }
    public Iterable<IncomingEmailHistoryProcessingStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<IncomingEmailHistoryStringFilterInput> getStringFilters() { return this.stringFilters; }
    public Iterable<IncomingEmailHistoryProcessingTypeEnumFilterInput> getTypeFilters() { return this.typeFilters; }
    public void setDateFilters(Iterable<IncomingEmailHistoryDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(IncomingEmailHistorySortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<IncomingEmailHistoryProcessingStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<IncomingEmailHistoryStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
    public void setTypeFilters(Iterable<IncomingEmailHistoryProcessingTypeEnumFilterInput> typeFilters) { this.typeFilters = typeFilters; }
  }
  public enum IncomingEmailHistorySortField {
    CREATION_DATE,
    FROM,
    ID,
    INCOMING_EMAIL_PATH,
    STATUS,
    SUBJECT,
    TENANT_ID,
    TO,
    TYPE
    
  }
  
  public enum IncomingEmailHistoryStatusFilterField {
    STATUS
    
  }
  
  public static class IncomingEmailHistoryStringFilterInput {
    private IncomingEmailHistoryStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public IncomingEmailHistoryStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof IncomingEmailHistoryStringFilterField) {
          this.field = (IncomingEmailHistoryStringFilterField) args.get("field");
        } else {
          this.field = IncomingEmailHistoryStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public IncomingEmailHistoryStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(IncomingEmailHistoryStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum IncomingEmailHistoryStringFilterField {
    FROM,
    ID,
    INCOMING_EMAIL_PATH,
    ROUTING_CONFIGURATION_ID,
    SUBJECT,
    TENANT_ID,
    TO
    
  }
  
  
  public enum IncomingEmailHistoryTypeFilterField {
    TYPE
    
  }
  
  public enum InheritedConfigurationOwnerType {
    DOCUMENT_TYPE,
    DOMAIN,
    NATURE,
    SERVICE,
    SYSTEM,
    TENANT
    
  }
  
  
  public static class JobActionOptionsInput {
    private JobActionType action;
  
    public JobActionOptionsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("action") instanceof JobActionType) {
          this.action = (JobActionType) args.get("action");
        } else {
          this.action = JobActionType.valueOf((String) args.get("action"));
        }
      }
    }
  
    public JobActionType getAction() { return this.action; }
    public void setAction(JobActionType action) { this.action = action; }
  }
  public enum JobActionType {
    NONE
    
  }
  
  public static class JobBaseDateFilterInput {
    private JobDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public JobBaseDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobDateFilterField) {
          this.field = (JobDateFilterField) args.get("field");
        } else {
          this.field = JobDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class JobBaseJobBaseStatusEnumFilterInput {
    private JobStatusFilterField field;
    private JobBaseStatus filterValue1;
    private JobBaseStatus filterValue2;
    private NumberFilterOperator operator;
  
    public JobBaseJobBaseStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStatusFilterField) {
          this.field = (JobStatusFilterField) args.get("field");
        } else {
          this.field = JobStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobBaseStatus) {
          this.filterValue1 = (JobBaseStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobBaseStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobBaseStatus) {
          this.filterValue2 = (JobBaseStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobBaseStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStatusFilterField getField() { return this.field; }
    public JobBaseStatus getFilterValue1() { return this.filterValue1; }
    public JobBaseStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobBaseStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobBaseStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class JobBaseJobBaseTypeEnumFilterInput {
    private JobTypeFilterField field;
    private JobBaseType filterValue1;
    private JobBaseType filterValue2;
    private NumberFilterOperator operator;
  
    public JobBaseJobBaseTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobTypeFilterField) {
          this.field = (JobTypeFilterField) args.get("field");
        } else {
          this.field = JobTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobBaseType) {
          this.filterValue1 = (JobBaseType) args.get("filterValue1");
        } else {
          this.filterValue1 = JobBaseType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobBaseType) {
          this.filterValue2 = (JobBaseType) args.get("filterValue2");
        } else {
          this.filterValue2 = JobBaseType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobTypeFilterField getField() { return this.field; }
    public JobBaseType getFilterValue1() { return this.filterValue1; }
    public JobBaseType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobTypeFilterField field) { this.field = field; }
    public void setFilterValue1(JobBaseType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobBaseType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum JobBaseStatus {
    CANCELED,
    COMPLETED,
    CREATED,
    ERROR,
    PROCESSING
    
  }
  
  public static class JobBaseStringFilterInput {
    private JobStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public JobBaseStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStringFilterField) {
          this.field = (JobStringFilterField) args.get("field");
        } else {
          this.field = JobStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  
  public enum JobDateFilterField {
    COMPLETED_DATE,
    CREATION_DATE
    
  }
  
  
  public static class JobItemBoolFilterInput {
    private JobItemBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public JobItemBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobItemBoolFilterField) {
          this.field = (JobItemBoolFilterField) args.get("field");
        } else {
          this.field = JobItemBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobItemBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(JobItemBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum JobItemBoolFilterField {
    FAILED
    
  }
  
  public static class JobItemDateFilterInput {
    private JobItemDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public JobItemDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobItemDateFilterField) {
          this.field = (JobItemDateFilterField) args.get("field");
        } else {
          this.field = JobItemDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobItemDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobItemDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum JobItemDateFilterField {
    FINISH_DATE
    
  }
  
  public static class JobItemIdInput {
    private Integer jobItemNumber;
    private Integer jobNumber;
  
    public JobItemIdInput(Map<String, Object> args) {
      if (args != null) {
        this.jobItemNumber = (Integer) args.get("jobItemNumber");
        this.jobNumber = (Integer) args.get("jobNumber");
      }
    }
  
    public Integer getJobItemNumber() { return this.jobItemNumber; }
    public Integer getJobNumber() { return this.jobNumber; }
    public void setJobItemNumber(Integer jobItemNumber) { this.jobItemNumber = jobItemNumber; }
    public void setJobNumber(Integer jobNumber) { this.jobNumber = jobNumber; }
  }
  public static class JobItemIntFilterInput {
    private JobItemIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public JobItemIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobItemIntFilterField) {
          this.field = (JobItemIntFilterField) args.get("field");
        } else {
          this.field = JobItemIntFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Integer) args.get("filterValue1");
        this.filterValue2 = (Integer) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobItemIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobItemIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum JobItemIntFilterField {
    JOB_NUMBER
    
  }
  
  public static class JobItemQueryParamsInput {
    private Iterable<JobItemBoolFilterInput> boolFilters;
    private Iterable<JobItemDateFilterInput> dateFilters;
    private Iterable<JobItemIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private JobItemSortField sortField;
    private Iterable<JobItemStringFilterInput> stringFilters;
  
    public JobItemQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<JobItemBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<JobItemDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<JobItemIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobItemSortField) {
          this.sortField = (JobItemSortField) args.get("sortField");
        } else {
          this.sortField = JobItemSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<JobItemStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<JobItemBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<JobItemDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobItemIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobItemSortField getSortField() { return this.sortField; }
    public Iterable<JobItemStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<JobItemBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<JobItemDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setIntFilters(Iterable<JobItemIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobItemSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<JobItemStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class JobItemStringFilterInput {
    private JobItemStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public JobItemStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobItemStringFilterField) {
          this.field = (JobItemStringFilterField) args.get("field");
        } else {
          this.field = JobItemStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobItemStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobItemStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum JobItemStringFilterField {
    ADDRESS,
    OUTCOME,
    TRACKING_ID
    
  }
  
  
  
  public static class JobMessageActionOptionsInput {
    private JobMessageActionType action;
  
    public JobMessageActionOptionsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("action") instanceof JobMessageActionType) {
          this.action = (JobMessageActionType) args.get("action");
        } else {
          this.action = JobMessageActionType.valueOf((String) args.get("action"));
        }
      }
    }
  
    public JobMessageActionType getAction() { return this.action; }
    public void setAction(JobMessageActionType action) { this.action = action; }
  }
  public enum JobMessageActionType {
    CANCEL
    
  }
  
  public static class JobMessageBaseDateFilterInput {
    private JobMessageDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public JobMessageBaseDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobMessageDateFilterField) {
          this.field = (JobMessageDateFilterField) args.get("field");
        } else {
          this.field = JobMessageDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobMessageDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobMessageDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class JobMessageBaseJobMessageStatusEnumFilterInput {
    private JobMessageStatusFilterField field;
    private JobMessageStatus filterValue1;
    private JobMessageStatus filterValue2;
    private NumberFilterOperator operator;
  
    public JobMessageBaseJobMessageStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobMessageStatusFilterField) {
          this.field = (JobMessageStatusFilterField) args.get("field");
        } else {
          this.field = JobMessageStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobMessageStatus) {
          this.filterValue1 = (JobMessageStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobMessageStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobMessageStatus) {
          this.filterValue2 = (JobMessageStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobMessageStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobMessageStatusFilterField getField() { return this.field; }
    public JobMessageStatus getFilterValue1() { return this.filterValue1; }
    public JobMessageStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobMessageStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobMessageStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobMessageStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class JobMessageBaseJobMessageTransmissionStatusEnumFilterInput {
    private JobMessageTransmissionStatusFilterField field;
    private JobMessageTransmissionStatus filterValue1;
    private JobMessageTransmissionStatus filterValue2;
    private NumberFilterOperator operator;
  
    public JobMessageBaseJobMessageTransmissionStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobMessageTransmissionStatusFilterField) {
          this.field = (JobMessageTransmissionStatusFilterField) args.get("field");
        } else {
          this.field = JobMessageTransmissionStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobMessageTransmissionStatus) {
          this.filterValue1 = (JobMessageTransmissionStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobMessageTransmissionStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobMessageTransmissionStatus) {
          this.filterValue2 = (JobMessageTransmissionStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobMessageTransmissionStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobMessageTransmissionStatusFilterField getField() { return this.field; }
    public JobMessageTransmissionStatus getFilterValue1() { return this.filterValue1; }
    public JobMessageTransmissionStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobMessageTransmissionStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobMessageTransmissionStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobMessageTransmissionStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class JobMessageBaseStringFilterInput {
    private JobMessageStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public JobMessageBaseStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobMessageStringFilterField) {
          this.field = (JobMessageStringFilterField) args.get("field");
        } else {
          this.field = JobMessageStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobMessageStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobMessageStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum JobMessageChorusActionType {
    COMPLETE,
    SEND
    
  }
  
  public enum JobMessageChorusStatus {
    COMPLETED,
    DRAFT,
    ERROR,
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
  
  public enum JobMessageDateFilterField {
    CREATION_DATE
    
  }
  
  
  public static class JobMessageQueryParamsInput {
    private Iterable<JobMessageBaseDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private JobMessageSortField sortField;
    private Iterable<JobMessageBaseJobMessageStatusEnumFilterInput> statusFilters;
    private Iterable<JobMessageBaseStringFilterInput> stringFilters;
    private Iterable<JobMessageBaseJobMessageTransmissionStatusEnumFilterInput> transmissionStatusFilters;
  
    public JobMessageQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<JobMessageBaseDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobMessageSortField) {
          this.sortField = (JobMessageSortField) args.get("sortField");
        } else {
          this.sortField = JobMessageSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<JobMessageBaseJobMessageStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<JobMessageBaseStringFilterInput>) args.get("stringFilters");
        }
        if (args.get("transmissionStatusFilters") != null) {
        		this.transmissionStatusFilters = (Iterable<JobMessageBaseJobMessageTransmissionStatusEnumFilterInput>) args.get("transmissionStatusFilters");
        }
      }
    }
  
    public Iterable<JobMessageBaseDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobMessageSortField getSortField() { return this.sortField; }
    public Iterable<JobMessageBaseJobMessageStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<JobMessageBaseStringFilterInput> getStringFilters() { return this.stringFilters; }
    public Iterable<JobMessageBaseJobMessageTransmissionStatusEnumFilterInput> getTransmissionStatusFilters() { return this.transmissionStatusFilters; }
    public void setDateFilters(Iterable<JobMessageBaseDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobMessageSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<JobMessageBaseJobMessageStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<JobMessageBaseStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
    public void setTransmissionStatusFilters(Iterable<JobMessageBaseJobMessageTransmissionStatusEnumFilterInput> transmissionStatusFilters) { this.transmissionStatusFilters = transmissionStatusFilters; }
  }
  public enum JobMessageSortField {
    ID,
    NAME,
    TRACKING_ID
    
  }
  
  public enum JobMessageStatus {
    CANCELED,
    COMPLETED,
    ERROR,
    PROCESSING
    
  }
  
  
  public enum JobMessageStatusFilterField {
    STATUS
    
  }
  
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
  
  
  public static class JobQueryParamsInput {
    private Iterable<JobBaseDateFilterInput> dateFilters;
    private Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters;
    private SortDirection sortDirection;
    private JobSortField sortField;
    private Iterable<JobBaseJobBaseStatusEnumFilterInput> statusFilters;
    private Iterable<JobBaseStringFilterInput> stringFilters;
  
    public JobQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<JobBaseDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("jobTypeFilters") != null) {
        		this.jobTypeFilters = (Iterable<JobBaseJobBaseTypeEnumFilterInput>) args.get("jobTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobSortField) {
          this.sortField = (JobSortField) args.get("sortField");
        } else {
          this.sortField = JobSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<JobBaseJobBaseStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<JobBaseStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<JobBaseDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobBaseJobBaseTypeEnumFilterInput> getJobTypeFilters() { return this.jobTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobSortField getSortField() { return this.sortField; }
    public Iterable<JobBaseJobBaseStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<JobBaseStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<JobBaseDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setJobTypeFilters(Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters) { this.jobTypeFilters = jobTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<JobBaseJobBaseStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<JobBaseStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  
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
  
  
  public static class JobSummaryBoolFilterInput {
    private JobSummaryBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public JobSummaryBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobSummaryBoolFilterField) {
          this.field = (JobSummaryBoolFilterField) args.get("field");
        } else {
          this.field = JobSummaryBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobSummaryBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(JobSummaryBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum JobSummaryBoolFilterField {
    ALL_SUB_ACCOUNTS,
    IS_PROOF,
    ONLY_NOT_SENT
    
  }
  
  public static class JobSummaryDateFilterInput {
    private JobSummaryDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public JobSummaryDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobSummaryDateFilterField) {
          this.field = (JobSummaryDateFilterField) args.get("field");
        } else {
          this.field = JobSummaryDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobSummaryDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobSummaryDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum JobSummaryDateFilterField {
    MOST_RECENT_DATE
    
  }
  
  public static class JobSummaryMediaEnumFilterInput {
    private JobSummaryMediaFilterField field;
    private Media filterValue1;
    private Media filterValue2;
    private NumberFilterOperator operator;
  
    public JobSummaryMediaEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobSummaryMediaFilterField) {
          this.field = (JobSummaryMediaFilterField) args.get("field");
        } else {
          this.field = JobSummaryMediaFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof Media) {
          this.filterValue1 = (Media) args.get("filterValue1");
        } else {
          this.filterValue1 = Media.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof Media) {
          this.filterValue2 = (Media) args.get("filterValue2");
        } else {
          this.filterValue2 = Media.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobSummaryMediaFilterField getField() { return this.field; }
    public Media getFilterValue1() { return this.filterValue1; }
    public Media getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobSummaryMediaFilterField field) { this.field = field; }
    public void setFilterValue1(Media filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Media filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum JobSummaryMediaFilterField {
    MEDIA
    
  }
  
  public static class JobSummaryQueryParamsInput {
    private Iterable<JobSummaryBoolFilterInput> boolFilters;
    private Iterable<JobSummaryDateFilterInput> dateFilters;
    private Iterable<JobSummaryMediaEnumFilterInput> mediaFilters;
    private SortDirection sortDirection;
    private JobSummarySortField sortField;
    private Iterable<JobSummaryStringFilterInput> stringFilters;
  
    public JobSummaryQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<JobSummaryBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<JobSummaryDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("mediaFilters") != null) {
        		this.mediaFilters = (Iterable<JobSummaryMediaEnumFilterInput>) args.get("mediaFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobSummarySortField) {
          this.sortField = (JobSummarySortField) args.get("sortField");
        } else {
          this.sortField = JobSummarySortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<JobSummaryStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<JobSummaryBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<JobSummaryDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobSummaryMediaEnumFilterInput> getMediaFilters() { return this.mediaFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobSummarySortField getSortField() { return this.sortField; }
    public Iterable<JobSummaryStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<JobSummaryBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<JobSummaryDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setMediaFilters(Iterable<JobSummaryMediaEnumFilterInput> mediaFilters) { this.mediaFilters = mediaFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobSummarySortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<JobSummaryStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class JobSummaryStringFilterInput {
    private JobSummaryStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public JobSummaryStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobSummaryStringFilterField) {
          this.field = (JobSummaryStringFilterField) args.get("field");
        } else {
          this.field = JobSummaryStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobSummaryStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobSummaryStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum JobSummaryStringFilterField {
    JOB_NUMBER,
    TID
    
  }
  
  
  
  public enum JobTypeFilterField {
    JOB_TYPE
    
  }
  
  
  
  
  public static class KeyValuePairInput {
    private String key;
    private String value;
  
    public KeyValuePairInput(Map<String, Object> args) {
      if (args != null) {
        this.key = (String) args.get("key");
        this.value = (String) args.get("value");
      }
    }
  
    public String getKey() { return this.key; }
    public String getValue() { return this.value; }
    public void setKey(String key) { this.key = key; }
    public void setValue(String value) { this.value = value; }
  }
  public enum Language {
    EN,
    FR,
    UKN
    
  }
  
  
  public static class ListOfValuesInput {
    private String id;
    private String name;
    private String ownerId;
    private ListOfValuesOwnerType ownerType;
  
    public ListOfValuesInput(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.name = (String) args.get("name");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof ListOfValuesOwnerType) {
          this.ownerType = (ListOfValuesOwnerType) args.get("ownerType");
        } else {
          this.ownerType = ListOfValuesOwnerType.valueOf((String) args.get("ownerType"));
        }
      }
    }
  
    public String getId() { return this.id; }
    public String getName() { return this.name; }
    public String getOwnerId() { return this.ownerId; }
    public ListOfValuesOwnerType getOwnerType() { return this.ownerType; }
    public void setId(String id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(ListOfValuesOwnerType ownerType) { this.ownerType = ownerType; }
  }
  public enum ListOfValuesOwnerType {
    SYSTEM,
    TENANT
    
  }
  
  public static class ListOfValuesQueryParamsInput {
    private SortDirection sortDirection;
    private ListOfValuesSortField sortField;
    private Iterable<ListOfValuesStringFilterInput> stringFilters;
  
    public ListOfValuesQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ListOfValuesSortField) {
          this.sortField = (ListOfValuesSortField) args.get("sortField");
        } else {
          this.sortField = ListOfValuesSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ListOfValuesStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ListOfValuesSortField getSortField() { return this.sortField; }
    public Iterable<ListOfValuesStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ListOfValuesSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ListOfValuesStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ListOfValuesSortField {
    NAME
    
  }
  
  public static class ListOfValuesStringFilterInput {
    private ListOfValuesStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ListOfValuesStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ListOfValuesStringFilterField) {
          this.field = (ListOfValuesStringFilterField) args.get("field");
        } else {
          this.field = ListOfValuesStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ListOfValuesStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ListOfValuesStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ListOfValuesStringFilterField {
    NAME,
    OWNER_ID
    
  }
  
  
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
  
  
  
  public static class MetadataConfigInput {
    private String defaultValue;
    private String expectedFormat;
    private Boolean isEditable;
    private Boolean isMandatory;
    private String metadataId;
  
    public MetadataConfigInput(Map<String, Object> args) {
      if (args != null) {
        this.defaultValue = (String) args.get("defaultValue");
        this.expectedFormat = (String) args.get("expectedFormat");
        this.isEditable = (Boolean) args.get("isEditable");
        this.isMandatory = (Boolean) args.get("isMandatory");
        this.metadataId = (String) args.get("metadataId");
      }
    }
  
    public String getDefaultValue() { return this.defaultValue; }
    public String getExpectedFormat() { return this.expectedFormat; }
    public Boolean getIsEditable() { return this.isEditable; }
    public Boolean getIsMandatory() { return this.isMandatory; }
    public String getMetadataId() { return this.metadataId; }
    public void setDefaultValue(String defaultValue) { this.defaultValue = defaultValue; }
    public void setExpectedFormat(String expectedFormat) { this.expectedFormat = expectedFormat; }
    public void setIsEditable(Boolean isEditable) { this.isEditable = isEditable; }
    public void setIsMandatory(Boolean isMandatory) { this.isMandatory = isMandatory; }
    public void setMetadataId(String metadataId) { this.metadataId = metadataId; }
  }
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
  
  public static class MetadataInput {
    private String code;
    private MetadataDataType dataType;
    private String id;
    private String listOfValuesId;
    private String name;
    private String ownerId;
    private MetadataOwnerType ownerType;
  
    public MetadataInput(Map<String, Object> args) {
      if (args != null) {
        this.code = (String) args.get("code");
        if (args.get("dataType") instanceof MetadataDataType) {
          this.dataType = (MetadataDataType) args.get("dataType");
        } else {
          this.dataType = MetadataDataType.valueOf((String) args.get("dataType"));
        }
        this.id = (String) args.get("id");
        this.listOfValuesId = (String) args.get("listOfValuesId");
        this.name = (String) args.get("name");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof MetadataOwnerType) {
          this.ownerType = (MetadataOwnerType) args.get("ownerType");
        } else {
          this.ownerType = MetadataOwnerType.valueOf((String) args.get("ownerType"));
        }
      }
    }
  
    public String getCode() { return this.code; }
    public MetadataDataType getDataType() { return this.dataType; }
    public String getId() { return this.id; }
    public String getListOfValuesId() { return this.listOfValuesId; }
    public String getName() { return this.name; }
    public String getOwnerId() { return this.ownerId; }
    public MetadataOwnerType getOwnerType() { return this.ownerType; }
    public void setCode(String code) { this.code = code; }
    public void setDataType(MetadataDataType dataType) { this.dataType = dataType; }
    public void setId(String id) { this.id = id; }
    public void setListOfValuesId(String listOfValuesId) { this.listOfValuesId = listOfValuesId; }
    public void setName(String name) { this.name = name; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(MetadataOwnerType ownerType) { this.ownerType = ownerType; }
  }
  public static class MetadataMetadataDataTypeEnumFilterInput {
    private MetadataDataTypeFilterField field;
    private MetadataDataType filterValue1;
    private MetadataDataType filterValue2;
    private NumberFilterOperator operator;
  
    public MetadataMetadataDataTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof MetadataDataTypeFilterField) {
          this.field = (MetadataDataTypeFilterField) args.get("field");
        } else {
          this.field = MetadataDataTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof MetadataDataType) {
          this.filterValue1 = (MetadataDataType) args.get("filterValue1");
        } else {
          this.filterValue1 = MetadataDataType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof MetadataDataType) {
          this.filterValue2 = (MetadataDataType) args.get("filterValue2");
        } else {
          this.filterValue2 = MetadataDataType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public MetadataDataTypeFilterField getField() { return this.field; }
    public MetadataDataType getFilterValue1() { return this.filterValue1; }
    public MetadataDataType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(MetadataDataTypeFilterField field) { this.field = field; }
    public void setFilterValue1(MetadataDataType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(MetadataDataType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum MetadataOwnerType {
    SYSTEM,
    TENANT
    
  }
  
  public static class MetadataQueryParamsInput {
    private Iterable<MetadataMetadataDataTypeEnumFilterInput> dataTypeFilters;
    private SortDirection sortDirection;
    private MetadataSortField sortField;
    private Iterable<MetadataStringFilterInput> stringFilters;
  
    public MetadataQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dataTypeFilters") != null) {
        		this.dataTypeFilters = (Iterable<MetadataMetadataDataTypeEnumFilterInput>) args.get("dataTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof MetadataSortField) {
          this.sortField = (MetadataSortField) args.get("sortField");
        } else {
          this.sortField = MetadataSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<MetadataStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<MetadataMetadataDataTypeEnumFilterInput> getDataTypeFilters() { return this.dataTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public MetadataSortField getSortField() { return this.sortField; }
    public Iterable<MetadataStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDataTypeFilters(Iterable<MetadataMetadataDataTypeEnumFilterInput> dataTypeFilters) { this.dataTypeFilters = dataTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(MetadataSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<MetadataStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum MetadataSortField {
    CODE,
    DATA_TYPE,
    NAME
    
  }
  
  public static class MetadataStringFilterInput {
    private MetadataStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public MetadataStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof MetadataStringFilterField) {
          this.field = (MetadataStringFilterField) args.get("field");
        } else {
          this.field = MetadataStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public MetadataStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(MetadataStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum MetadataStringFilterField {
    CODE,
    NAME
    
  }
  
  
  
  public static class MultipleTypeValueInput {
    private Boolean boolValue;
    private Object dateValue;
    private Double doubleValue;
    private Integer intValue;
    private Iterable<String> listValues;
    private String stringValue;
  
    public MultipleTypeValueInput(Map<String, Object> args) {
      if (args != null) {
        this.boolValue = (Boolean) args.get("boolValue");
        this.dateValue = (Object) args.get("dateValue");
        this.doubleValue = (Double) args.get("doubleValue");
        this.intValue = (Integer) args.get("intValue");
        this.listValues = (Iterable<String>) args.get("listValues");
        this.stringValue = (String) args.get("stringValue");
      }
    }
  
    public Boolean getBoolValue() { return this.boolValue; }
    public Object getDateValue() { return this.dateValue; }
    public Double getDoubleValue() { return this.doubleValue; }
    public Integer getIntValue() { return this.intValue; }
    public Iterable<String> getListValues() { return this.listValues; }
    public String getStringValue() { return this.stringValue; }
    public void setBoolValue(Boolean boolValue) { this.boolValue = boolValue; }
    public void setDateValue(Object dateValue) { this.dateValue = dateValue; }
    public void setDoubleValue(Double doubleValue) { this.doubleValue = doubleValue; }
    public void setIntValue(Integer intValue) { this.intValue = intValue; }
    public void setListValues(Iterable<String> listValues) { this.listValues = listValues; }
    public void setStringValue(String stringValue) { this.stringValue = stringValue; }
  }
  
  public enum NatureCycle {
    O_2_C,
    P_2_P
    
  }
  
  public static class NatureQueryParamsInput {
    private SortDirection sortDirection;
    private NatureSortField sortField;
  
    public NatureQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof NatureSortField) {
          this.sortField = (NatureSortField) args.get("sortField");
        } else {
          this.sortField = NatureSortField.valueOf((String) args.get("sortField"));
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public NatureSortField getSortField() { return this.sortField; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(NatureSortField sortField) { this.sortField = sortField; }
  }
  public enum NatureSortField {
    CODE,
    LABEL
    
  }
  
  
  
  public static class NoteInput {
    private String id;
    private String ownerId;
    private NoteOwnerType ownerType;
    private String text;
  
    public NoteInput(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof NoteOwnerType) {
          this.ownerType = (NoteOwnerType) args.get("ownerType");
        } else {
          this.ownerType = NoteOwnerType.valueOf((String) args.get("ownerType"));
        }
        this.text = (String) args.get("text");
      }
    }
  
    public String getId() { return this.id; }
    public String getOwnerId() { return this.ownerId; }
    public NoteOwnerType getOwnerType() { return this.ownerType; }
    public String getText() { return this.text; }
    public void setId(String id) { this.id = id; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(NoteOwnerType ownerType) { this.ownerType = ownerType; }
    public void setText(String text) { this.text = text; }
  }
  public static class NoteNoteOwnerTypeEnumFilterInput {
    private NoteOwnerTypeFilterField field;
    private NoteOwnerType filterValue1;
    private NoteOwnerType filterValue2;
    private NumberFilterOperator operator;
  
    public NoteNoteOwnerTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof NoteOwnerTypeFilterField) {
          this.field = (NoteOwnerTypeFilterField) args.get("field");
        } else {
          this.field = NoteOwnerTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof NoteOwnerType) {
          this.filterValue1 = (NoteOwnerType) args.get("filterValue1");
        } else {
          this.filterValue1 = NoteOwnerType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof NoteOwnerType) {
          this.filterValue2 = (NoteOwnerType) args.get("filterValue2");
        } else {
          this.filterValue2 = NoteOwnerType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public NoteOwnerTypeFilterField getField() { return this.field; }
    public NoteOwnerType getFilterValue1() { return this.filterValue1; }
    public NoteOwnerType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(NoteOwnerTypeFilterField field) { this.field = field; }
    public void setFilterValue1(NoteOwnerType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(NoteOwnerType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum NoteOwnerType {
    SERVICE,
    THIRD_PARTY
    
  }
  
  public enum NoteOwnerTypeFilterField {
    OWNER_TYPE
    
  }
  
  public static class NoteQueryParamsInput {
    private Iterable<NoteNoteOwnerTypeEnumFilterInput> ownerTypeFilters;
    private SortDirection sortDirection;
    private NoteSortField sortField;
    private Iterable<NoteStringFilterInput> stringFilters;
  
    public NoteQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("ownerTypeFilters") != null) {
        		this.ownerTypeFilters = (Iterable<NoteNoteOwnerTypeEnumFilterInput>) args.get("ownerTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof NoteSortField) {
          this.sortField = (NoteSortField) args.get("sortField");
        } else {
          this.sortField = NoteSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<NoteStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<NoteNoteOwnerTypeEnumFilterInput> getOwnerTypeFilters() { return this.ownerTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public NoteSortField getSortField() { return this.sortField; }
    public Iterable<NoteStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setOwnerTypeFilters(Iterable<NoteNoteOwnerTypeEnumFilterInput> ownerTypeFilters) { this.ownerTypeFilters = ownerTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(NoteSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<NoteStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum NoteSortField {
    CREATION_DATE,
    LAST_MODIFICATION_DATE
    
  }
  
  public static class NoteStringFilterInput {
    private NoteStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public NoteStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof NoteStringFilterField) {
          this.field = (NoteStringFilterField) args.get("field");
        } else {
          this.field = NoteStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public NoteStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(NoteStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum NoteStringFilterField {
    OWNER_ID
    
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
  
  
  
  public static class PostalAddressInput {
    private String additionalGeographicInfo;
    private String additionalInfo;
    private String city;
    private String country;
    private String name;
    private String postBox;
    private String street;
    private String zipCode;
  
    public PostalAddressInput(Map<String, Object> args) {
      if (args != null) {
        this.additionalGeographicInfo = (String) args.get("additionalGeographicInfo");
        this.additionalInfo = (String) args.get("additionalInfo");
        this.city = (String) args.get("city");
        this.country = (String) args.get("country");
        this.name = (String) args.get("name");
        this.postBox = (String) args.get("postBox");
        this.street = (String) args.get("street");
        this.zipCode = (String) args.get("zipCode");
      }
    }
  
    public String getAdditionalGeographicInfo() { return this.additionalGeographicInfo; }
    public String getAdditionalInfo() { return this.additionalInfo; }
    public String getCity() { return this.city; }
    public String getCountry() { return this.country; }
    public String getName() { return this.name; }
    public String getPostBox() { return this.postBox; }
    public String getStreet() { return this.street; }
    public String getZipCode() { return this.zipCode; }
    public void setAdditionalGeographicInfo(String additionalGeographicInfo) { this.additionalGeographicInfo = additionalGeographicInfo; }
    public void setAdditionalInfo(String additionalInfo) { this.additionalInfo = additionalInfo; }
    public void setCity(String city) { this.city = city; }
    public void setCountry(String country) { this.country = country; }
    public void setName(String name) { this.name = name; }
    public void setPostBox(String postBox) { this.postBox = postBox; }
    public void setStreet(String street) { this.street = street; }
    public void setZipCode(String zipCode) { this.zipCode = zipCode; }
  }
  public static class PostalAdhocRecipientInput {
    private PostalAddressInput address;
    private Boolean isPrimary;
    private String name;
  
    public PostalAdhocRecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.address = new PostalAddressInput((Map<String, Object>) args.get("address"));
        this.isPrimary = (Boolean) args.get("isPrimary");
        this.name = (String) args.get("name");
      }
    }
  
    public PostalAddressInput getAddress() { return this.address; }
    public Boolean getIsPrimary() { return this.isPrimary; }
    public String getName() { return this.name; }
    public void setAddress(PostalAddressInput address) { this.address = address; }
    public void setIsPrimary(Boolean isPrimary) { this.isPrimary = isPrimary; }
    public void setName(String name) { this.name = name; }
  }
  
  public static class PostalJobDateFilterInput {
    private JobDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public PostalJobDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobDateFilterField) {
          this.field = (JobDateFilterField) args.get("field");
        } else {
          this.field = JobDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class PostalJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<FileIdOrNewInputTypeInput> documents;
    private String note;
    private PostalParameterInput parameter;
    private Iterable<PostalAdhocRecipientInput> postalAdhocRecipients;
    private String serviceId;
    private String trackingId;
  
    public PostalJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("documents") != null) {
        		this.documents = (Iterable<FileIdOrNewInputTypeInput>) args.get("documents");
        }
        this.note = (String) args.get("note");
        this.parameter = new PostalParameterInput((Map<String, Object>) args.get("parameter"));
        if (args.get("postalAdhocRecipients") != null) {
        		this.postalAdhocRecipients = (Iterable<PostalAdhocRecipientInput>) args.get("postalAdhocRecipients");
        }
        this.serviceId = (String) args.get("serviceId");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<FileIdOrNewInputTypeInput> getDocuments() { return this.documents; }
    public String getNote() { return this.note; }
    public PostalParameterInput getParameter() { return this.parameter; }
    public Iterable<PostalAdhocRecipientInput> getPostalAdhocRecipients() { return this.postalAdhocRecipients; }
    public String getServiceId() { return this.serviceId; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setDocuments(Iterable<FileIdOrNewInputTypeInput> documents) { this.documents = documents; }
    public void setNote(String note) { this.note = note; }
    public void setParameter(PostalParameterInput parameter) { this.parameter = parameter; }
    public void setPostalAdhocRecipients(Iterable<PostalAdhocRecipientInput> postalAdhocRecipients) { this.postalAdhocRecipients = postalAdhocRecipients; }
    public void setServiceId(String serviceId) { this.serviceId = serviceId; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public static class PostalJobJobBaseStatusEnumFilterInput {
    private JobStatusFilterField field;
    private JobBaseStatus filterValue1;
    private JobBaseStatus filterValue2;
    private NumberFilterOperator operator;
  
    public PostalJobJobBaseStatusEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStatusFilterField) {
          this.field = (JobStatusFilterField) args.get("field");
        } else {
          this.field = JobStatusFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof JobBaseStatus) {
          this.filterValue1 = (JobBaseStatus) args.get("filterValue1");
        } else {
          this.filterValue1 = JobBaseStatus.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof JobBaseStatus) {
          this.filterValue2 = (JobBaseStatus) args.get("filterValue2");
        } else {
          this.filterValue2 = JobBaseStatus.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStatusFilterField getField() { return this.field; }
    public JobBaseStatus getFilterValue1() { return this.filterValue1; }
    public JobBaseStatus getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(JobStatusFilterField field) { this.field = field; }
    public void setFilterValue1(JobBaseStatus filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(JobBaseStatus filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class PostalJobQueryParamsInput {
    private Iterable<PostalJobDateFilterInput> dateFilters;
    private Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters;
    private SortDirection sortDirection;
    private JobSortField sortField;
    private Iterable<PostalJobJobBaseStatusEnumFilterInput> statusFilters;
    private Iterable<PostalJobStringFilterInput> stringFilters;
  
    public PostalJobQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<PostalJobDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("jobTypeFilters") != null) {
        		this.jobTypeFilters = (Iterable<JobBaseJobBaseTypeEnumFilterInput>) args.get("jobTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof JobSortField) {
          this.sortField = (JobSortField) args.get("sortField");
        } else {
          this.sortField = JobSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("statusFilters") != null) {
        		this.statusFilters = (Iterable<PostalJobJobBaseStatusEnumFilterInput>) args.get("statusFilters");
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<PostalJobStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<PostalJobDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<JobBaseJobBaseTypeEnumFilterInput> getJobTypeFilters() { return this.jobTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public JobSortField getSortField() { return this.sortField; }
    public Iterable<PostalJobJobBaseStatusEnumFilterInput> getStatusFilters() { return this.statusFilters; }
    public Iterable<PostalJobStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<PostalJobDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setJobTypeFilters(Iterable<JobBaseJobBaseTypeEnumFilterInput> jobTypeFilters) { this.jobTypeFilters = jobTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(JobSortField sortField) { this.sortField = sortField; }
    public void setStatusFilters(Iterable<PostalJobJobBaseStatusEnumFilterInput> statusFilters) { this.statusFilters = statusFilters; }
    public void setStringFilters(Iterable<PostalJobStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public static class PostalJobStringFilterInput {
    private JobStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public PostalJobStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof JobStringFilterField) {
          this.field = (JobStringFilterField) args.get("field");
        } else {
          this.field = JobStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public JobStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(JobStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  
  
  
  public static class PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput {
    private PostalParameterConfigurationOwnerTypeFilterField field;
    private InheritedConfigurationOwnerType filterValue1;
    private InheritedConfigurationOwnerType filterValue2;
    private NumberFilterOperator operator;
  
    public PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof PostalParameterConfigurationOwnerTypeFilterField) {
          this.field = (PostalParameterConfigurationOwnerTypeFilterField) args.get("field");
        } else {
          this.field = PostalParameterConfigurationOwnerTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof InheritedConfigurationOwnerType) {
          this.filterValue1 = (InheritedConfigurationOwnerType) args.get("filterValue1");
        } else {
          this.filterValue1 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof InheritedConfigurationOwnerType) {
          this.filterValue2 = (InheritedConfigurationOwnerType) args.get("filterValue2");
        } else {
          this.filterValue2 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public PostalParameterConfigurationOwnerTypeFilterField getField() { return this.field; }
    public InheritedConfigurationOwnerType getFilterValue1() { return this.filterValue1; }
    public InheritedConfigurationOwnerType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(PostalParameterConfigurationOwnerTypeFilterField field) { this.field = field; }
    public void setFilterValue1(InheritedConfigurationOwnerType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(InheritedConfigurationOwnerType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class PostalParameterConfigurationInput {
    private EnvelopeType envelope;
    private String id;
    private LreArManagementType lreArManagement;
    private Boolean mergeDocuments;
    private String ownerId;
    private InheritedConfigurationOwnerType ownerType;
    private Boolean printBothSide;
    private Boolean printColor;
    private PostalAddressInput sender;
    private StampType stamp;
  
    public PostalParameterConfigurationInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("envelope") instanceof EnvelopeType) {
          this.envelope = (EnvelopeType) args.get("envelope");
        } else {
          this.envelope = EnvelopeType.valueOf((String) args.get("envelope"));
        }
        this.id = (String) args.get("id");
        if (args.get("lreArManagement") instanceof LreArManagementType) {
          this.lreArManagement = (LreArManagementType) args.get("lreArManagement");
        } else {
          this.lreArManagement = LreArManagementType.valueOf((String) args.get("lreArManagement"));
        }
        this.mergeDocuments = (Boolean) args.get("mergeDocuments");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof InheritedConfigurationOwnerType) {
          this.ownerType = (InheritedConfigurationOwnerType) args.get("ownerType");
        } else {
          this.ownerType = InheritedConfigurationOwnerType.valueOf((String) args.get("ownerType"));
        }
        this.printBothSide = (Boolean) args.get("printBothSide");
        this.printColor = (Boolean) args.get("printColor");
        this.sender = new PostalAddressInput((Map<String, Object>) args.get("sender"));
        if (args.get("stamp") instanceof StampType) {
          this.stamp = (StampType) args.get("stamp");
        } else {
          this.stamp = StampType.valueOf((String) args.get("stamp"));
        }
      }
    }
  
    public EnvelopeType getEnvelope() { return this.envelope; }
    public String getId() { return this.id; }
    public LreArManagementType getLreArManagement() { return this.lreArManagement; }
    public Boolean getMergeDocuments() { return this.mergeDocuments; }
    public String getOwnerId() { return this.ownerId; }
    public InheritedConfigurationOwnerType getOwnerType() { return this.ownerType; }
    public Boolean getPrintBothSide() { return this.printBothSide; }
    public Boolean getPrintColor() { return this.printColor; }
    public PostalAddressInput getSender() { return this.sender; }
    public StampType getStamp() { return this.stamp; }
    public void setEnvelope(EnvelopeType envelope) { this.envelope = envelope; }
    public void setId(String id) { this.id = id; }
    public void setLreArManagement(LreArManagementType lreArManagement) { this.lreArManagement = lreArManagement; }
    public void setMergeDocuments(Boolean mergeDocuments) { this.mergeDocuments = mergeDocuments; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(InheritedConfigurationOwnerType ownerType) { this.ownerType = ownerType; }
    public void setPrintBothSide(Boolean printBothSide) { this.printBothSide = printBothSide; }
    public void setPrintColor(Boolean printColor) { this.printColor = printColor; }
    public void setSender(PostalAddressInput sender) { this.sender = sender; }
    public void setStamp(StampType stamp) { this.stamp = stamp; }
  }
  public enum PostalParameterConfigurationOwnerTypeFilterField {
    OWNER_TYPE
    
  }
  
  public static class PostalParameterConfigurationQueryParamsInput {
    private Iterable<PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters;
    private SortDirection sortDirection;
    private PostalParameterConfigurationSortField sortField;
    private Iterable<PostalParameterConfigurationStringFilterInput> stringFilters;
  
    public PostalParameterConfigurationQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("ownerTypeFilters") != null) {
        		this.ownerTypeFilters = (Iterable<PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput>) args.get("ownerTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof PostalParameterConfigurationSortField) {
          this.sortField = (PostalParameterConfigurationSortField) args.get("sortField");
        } else {
          this.sortField = PostalParameterConfigurationSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<PostalParameterConfigurationStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> getOwnerTypeFilters() { return this.ownerTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public PostalParameterConfigurationSortField getSortField() { return this.sortField; }
    public Iterable<PostalParameterConfigurationStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setOwnerTypeFilters(Iterable<PostalParameterConfigurationInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters) { this.ownerTypeFilters = ownerTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(PostalParameterConfigurationSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<PostalParameterConfigurationStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum PostalParameterConfigurationSortField {
    CREATION_DATE,
    LAST_MODIFICATION_DATE,
    OWNER_ID
    
  }
  
  public static class PostalParameterConfigurationStringFilterInput {
    private PostalParameterConfigurationStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public PostalParameterConfigurationStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof PostalParameterConfigurationStringFilterField) {
          this.field = (PostalParameterConfigurationStringFilterField) args.get("field");
        } else {
          this.field = PostalParameterConfigurationStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public PostalParameterConfigurationStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(PostalParameterConfigurationStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum PostalParameterConfigurationStringFilterField {
    OWNER_ID
    
  }
  
  
  public static class PostalParameterInput {
    private EnvelopeType envelope;
    private LreArManagementType lreArManagement;
    private Boolean mergeDocuments;
    private Boolean printBothSide;
    private Boolean printColor;
    private PostalAddressInput sender;
    private StampType stamp;
  
    public PostalParameterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("envelope") instanceof EnvelopeType) {
          this.envelope = (EnvelopeType) args.get("envelope");
        } else {
          this.envelope = EnvelopeType.valueOf((String) args.get("envelope"));
        }
        if (args.get("lreArManagement") instanceof LreArManagementType) {
          this.lreArManagement = (LreArManagementType) args.get("lreArManagement");
        } else {
          this.lreArManagement = LreArManagementType.valueOf((String) args.get("lreArManagement"));
        }
        this.mergeDocuments = (Boolean) args.get("mergeDocuments");
        this.printBothSide = (Boolean) args.get("printBothSide");
        this.printColor = (Boolean) args.get("printColor");
        this.sender = new PostalAddressInput((Map<String, Object>) args.get("sender"));
        if (args.get("stamp") instanceof StampType) {
          this.stamp = (StampType) args.get("stamp");
        } else {
          this.stamp = StampType.valueOf((String) args.get("stamp"));
        }
      }
    }
  
    public EnvelopeType getEnvelope() { return this.envelope; }
    public LreArManagementType getLreArManagement() { return this.lreArManagement; }
    public Boolean getMergeDocuments() { return this.mergeDocuments; }
    public Boolean getPrintBothSide() { return this.printBothSide; }
    public Boolean getPrintColor() { return this.printColor; }
    public PostalAddressInput getSender() { return this.sender; }
    public StampType getStamp() { return this.stamp; }
    public void setEnvelope(EnvelopeType envelope) { this.envelope = envelope; }
    public void setLreArManagement(LreArManagementType lreArManagement) { this.lreArManagement = lreArManagement; }
    public void setMergeDocuments(Boolean mergeDocuments) { this.mergeDocuments = mergeDocuments; }
    public void setPrintBothSide(Boolean printBothSide) { this.printBothSide = printBothSide; }
    public void setPrintColor(Boolean printColor) { this.printColor = printColor; }
    public void setSender(PostalAddressInput sender) { this.sender = sender; }
    public void setStamp(StampType stamp) { this.stamp = stamp; }
  }
  
  public enum ProcessingStatus {
    COMPLETED,
    ERROR
    
  }
  
  public enum ProcessingType {
    REDIRECT_EMAIL
    
  }
  
  public static class PushJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<RecipientInput> adhocRecipients;
    private Boolean deDuplicate;
    private String jobType;
    private PushParameterInput parameter;
    private Object scheduledStartTime;
    private String text;
    private String trackingId;
  
    public PushJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("adhocRecipients") != null) {
        		this.adhocRecipients = (Iterable<RecipientInput>) args.get("adhocRecipients");
        }
        this.deDuplicate = (Boolean) args.get("deDuplicate");
        this.jobType = (String) args.get("jobType");
        this.parameter = new PushParameterInput((Map<String, Object>) args.get("parameter"));
        this.scheduledStartTime = (Object) args.get("scheduledStartTime");
        this.text = (String) args.get("text");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<RecipientInput> getAdhocRecipients() { return this.adhocRecipients; }
    public Boolean getDeDuplicate() { return this.deDuplicate; }
    public String getJobType() { return this.jobType; }
    public PushParameterInput getParameter() { return this.parameter; }
    public Object getScheduledStartTime() { return this.scheduledStartTime; }
    public String getText() { return this.text; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setAdhocRecipients(Iterable<RecipientInput> adhocRecipients) { this.adhocRecipients = adhocRecipients; }
    public void setDeDuplicate(Boolean deDuplicate) { this.deDuplicate = deDuplicate; }
    public void setJobType(String jobType) { this.jobType = jobType; }
    public void setParameter(PushParameterInput parameter) { this.parameter = parameter; }
    public void setScheduledStartTime(Object scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }
    public void setText(String text) { this.text = text; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public static class PushParameterInput {
    private Boolean activateTracking;
    private Integer applicationId;
    private Integer badgeCount;
    private Integer expirationDuration;
    private Boolean isByToken;
    private Boolean isSilent;
    private String soundFileName;
    private String title;
  
    public PushParameterInput(Map<String, Object> args) {
      if (args != null) {
        this.activateTracking = (Boolean) args.get("activateTracking");
        this.applicationId = (Integer) args.get("applicationId");
        this.badgeCount = (Integer) args.get("badgeCount");
        this.expirationDuration = (Integer) args.get("expirationDuration");
        this.isByToken = (Boolean) args.get("isByToken");
        this.isSilent = (Boolean) args.get("isSilent");
        this.soundFileName = (String) args.get("soundFileName");
        this.title = (String) args.get("title");
      }
    }
  
    public Boolean getActivateTracking() { return this.activateTracking; }
    public Integer getApplicationId() { return this.applicationId; }
    public Integer getBadgeCount() { return this.badgeCount; }
    public Integer getExpirationDuration() { return this.expirationDuration; }
    public Boolean getIsByToken() { return this.isByToken; }
    public Boolean getIsSilent() { return this.isSilent; }
    public String getSoundFileName() { return this.soundFileName; }
    public String getTitle() { return this.title; }
    public void setActivateTracking(Boolean activateTracking) { this.activateTracking = activateTracking; }
    public void setApplicationId(Integer applicationId) { this.applicationId = applicationId; }
    public void setBadgeCount(Integer badgeCount) { this.badgeCount = badgeCount; }
    public void setExpirationDuration(Integer expirationDuration) { this.expirationDuration = expirationDuration; }
    public void setIsByToken(Boolean isByToken) { this.isByToken = isByToken; }
    public void setIsSilent(Boolean isSilent) { this.isSilent = isSilent; }
    public void setSoundFileName(String soundFileName) { this.soundFileName = soundFileName; }
    public void setTitle(String title) { this.title = title; }
  }
  public static class RecipientInput {
    private String address;
    private String name;
    private Iterable<String> optionalFields;
  
    public RecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.address = (String) args.get("address");
        this.name = (String) args.get("name");
        this.optionalFields = (Iterable<String>) args.get("optionalFields");
      }
    }
  
    public String getAddress() { return this.address; }
    public String getName() { return this.name; }
    public Iterable<String> getOptionalFields() { return this.optionalFields; }
    public void setAddress(String address) { this.address = address; }
    public void setName(String name) { this.name = name; }
    public void setOptionalFields(Iterable<String> optionalFields) { this.optionalFields = optionalFields; }
  }
  
  public static class RegisteredPostalOptionsInput {
    private Boolean anonymous;
  
    public RegisteredPostalOptionsInput(Map<String, Object> args) {
      if (args != null) {
        this.anonymous = (Boolean) args.get("anonymous");
      }
    }
  
    public Boolean getAnonymous() { return this.anonymous; }
    public void setAnonymous(Boolean anonymous) { this.anonymous = anonymous; }
  }
  public static class RelaunchJobMessageOptionsInput {
    private String documentId;
    private String domainId;
    private String jobId;
    private String jobMessageId;
    private JobMessageType messageType;
    private String tenantId;
    private JobMessageTransmissionStatus transmissionStatus;
  
    public RelaunchJobMessageOptionsInput(Map<String, Object> args) {
      if (args != null) {
        this.documentId = (String) args.get("documentId");
        this.domainId = (String) args.get("domainId");
        this.jobId = (String) args.get("jobId");
        this.jobMessageId = (String) args.get("jobMessageId");
        if (args.get("messageType") instanceof JobMessageType) {
          this.messageType = (JobMessageType) args.get("messageType");
        } else {
          this.messageType = JobMessageType.valueOf((String) args.get("messageType"));
        }
        this.tenantId = (String) args.get("tenantId");
        if (args.get("transmissionStatus") instanceof JobMessageTransmissionStatus) {
          this.transmissionStatus = (JobMessageTransmissionStatus) args.get("transmissionStatus");
        } else {
          this.transmissionStatus = JobMessageTransmissionStatus.valueOf((String) args.get("transmissionStatus"));
        }
      }
    }
  
    public String getDocumentId() { return this.documentId; }
    public String getDomainId() { return this.domainId; }
    public String getJobId() { return this.jobId; }
    public String getJobMessageId() { return this.jobMessageId; }
    public JobMessageType getMessageType() { return this.messageType; }
    public String getTenantId() { return this.tenantId; }
    public JobMessageTransmissionStatus getTransmissionStatus() { return this.transmissionStatus; }
    public void setDocumentId(String documentId) { this.documentId = documentId; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public void setJobMessageId(String jobMessageId) { this.jobMessageId = jobMessageId; }
    public void setMessageType(JobMessageType messageType) { this.messageType = messageType; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
    public void setTransmissionStatus(JobMessageTransmissionStatus transmissionStatus) { this.transmissionStatus = transmissionStatus; }
  }
  /** The application rights action type. */
  public enum RightActionType {
    CHANGE,
    READ
    
  }
  
  
  public static class RightInitialValueBoolFilterInput {
    private RightInitialValueBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public RightInitialValueBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof RightInitialValueBoolFilterField) {
          this.field = (RightInitialValueBoolFilterField) args.get("field");
        } else {
          this.field = RightInitialValueBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public RightInitialValueBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(RightInitialValueBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum RightInitialValueBoolFilterField {
    INITIAL_VALUE
    
  }
  
  public static class RightInitialValueQueryParamsInput {
    private Iterable<RightInitialValueBoolFilterInput> boolFilters;
    private Iterable<RightInitialValueRightTypeEnumFilterInput> rightTypeFilters;
    private SortDirection sortDirection;
    private RightInitialValueSortField sortField;
  
    public RightInitialValueQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<RightInitialValueBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("rightTypeFilters") != null) {
        		this.rightTypeFilters = (Iterable<RightInitialValueRightTypeEnumFilterInput>) args.get("rightTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof RightInitialValueSortField) {
          this.sortField = (RightInitialValueSortField) args.get("sortField");
        } else {
          this.sortField = RightInitialValueSortField.valueOf((String) args.get("sortField"));
        }
      }
    }
  
    public Iterable<RightInitialValueBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<RightInitialValueRightTypeEnumFilterInput> getRightTypeFilters() { return this.rightTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public RightInitialValueSortField getSortField() { return this.sortField; }
    public void setBoolFilters(Iterable<RightInitialValueBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setRightTypeFilters(Iterable<RightInitialValueRightTypeEnumFilterInput> rightTypeFilters) { this.rightTypeFilters = rightTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(RightInitialValueSortField sortField) { this.sortField = sortField; }
  }
  public static class RightInitialValueRightTypeEnumFilterInput {
    private RightInitialValueRightTypeFilterField field;
    private RightType filterValue1;
    private RightType filterValue2;
    private NumberFilterOperator operator;
  
    public RightInitialValueRightTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof RightInitialValueRightTypeFilterField) {
          this.field = (RightInitialValueRightTypeFilterField) args.get("field");
        } else {
          this.field = RightInitialValueRightTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof RightType) {
          this.filterValue1 = (RightType) args.get("filterValue1");
        } else {
          this.filterValue1 = RightType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof RightType) {
          this.filterValue2 = (RightType) args.get("filterValue2");
        } else {
          this.filterValue2 = RightType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public RightInitialValueRightTypeFilterField getField() { return this.field; }
    public RightType getFilterValue1() { return this.filterValue1; }
    public RightType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(RightInitialValueRightTypeFilterField field) { this.field = field; }
    public void setFilterValue1(RightType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(RightType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum RightInitialValueRightTypeFilterField {
    RIGHT
    
  }
  
  public enum RightInitialValueSortField {
    INITIAL_VALUE,
    RIGHT
    
  }
  
  
  /** The application rights. */
  public enum RightType {
    ADD_ENVIRONMENT,
    ADD_TENANT,
    CANCEL_JOB_MESSAGE,
    CHANGE_ACTIVITY,
    CHANGE_API_ROUTING_CONFIGURATION,
    CHANGE_CLICKED_LINK_DOCUMENT,
    CHANGE_CONFIGURATION,
    CHANGE_CONTACT,
    CHANGE_CONTACT_FUNCTION,
    CHANGE_DASHBOARD,
    CHANGE_DATA_FILE_ACTION,
    CHANGE_DOCUMENT,
    CHANGE_DOCUMENT_JOB,
    CHANGE_DOCUMENT_TYPE,
    CHANGE_DOMAIN,
    CHANGE_DOMAIN_API_USER,
    CHANGE_DOMAIN_USER,
    CHANGE_ENVIRONMENT_API_USER,
    CHANGE_ENVIRONMENT_USER,
    CHANGE_JOB_MESSAGE,
    CHANGE_LIST_OF_VALUES,
    CHANGE_METADATA,
    CHANGE_NOTE,
    CHANGE_OMS_RESOURCES,
    CHANGE_POSTAL_JOB,
    CHANGE_POSTAL_PARAMETER_CONFIGURATION,
    CHANGE_POWER_BI_AUTH_TOKEN,
    CHANGE_PRODUCT,
    CHANGE_PRODUCT_INSTALL,
    CHANGE_SERVICE,
    CHANGE_TEMPLATE_CONTENT,
    CHANGE_TEMPLATE_STRUCTURE,
    CHANGE_TEMPLATE_VARIABLE_CONFIGURATION,
    CHANGE_TENANT_API_USER,
    CHANGE_TENANT_EDC_OMS_INFO,
    CHANGE_TENANT_USER,
    CHANGE_THIRD_PARTY,
    CHANGE_THIRD_PARTY_TYPE,
    COMPLETE_DOCUMENT,
    EDIT_ENVIRONMENT,
    EDIT_TENANT,
    EDIT_TENANT_POSTAL_CONFIG,
    GRANT_INTERNAL_RIGHT,
    GRANT_RIGHT,
    MARK_DOCUMENT_AS_READ,
    READ_ACTIVITY,
    READ_API_ROUTING_CONFIGURATION,
    READ_CLICKED_LINK_DOCUMENT,
    READ_CONFIGURATION,
    READ_CONTACT,
    READ_CONTACT_FUNCTION,
    READ_DASHBOARD,
    READ_DATA_FILE_ACTION,
    READ_DOCUMENT,
    READ_DOCUMENT_JOB,
    READ_DOCUMENT_ON_SERVICE,
    READ_DOCUMENT_TYPE,
    READ_DOMAIN,
    READ_DOMAIN_API_USER,
    READ_DOMAIN_USER,
    READ_ENVIRONMENT,
    READ_ENVIRONMENT_API_USER,
    READ_ENVIRONMENT_USER,
    READ_JOB_MESSAGE,
    READ_LIST_OF_VALUES,
    READ_METADATA,
    READ_NOTE,
    READ_OMS_RESOURCES,
    READ_POSTAL_JOB,
    READ_POSTAL_PARAMETER_CONFIGURATION,
    READ_PRODUCT,
    READ_PRODUCT_INSTALL,
    READ_RIGHT,
    READ_SERVICE,
    READ_STATUS_ACTION,
    READ_TEMPLATE_CONTENT,
    READ_TEMPLATE_STRUCTURE,
    READ_TEMPLATE_VARIABLE_CONFIGURATION,
    READ_TENANT,
    READ_TENANT_API_USER,
    READ_TENANT_EDC_OMS_INFO,
    READ_TENANT_USER,
    READ_THIRD_PARTY,
    READ_THIRD_PARTY_TYPE,
    RELAUNCH_JOB_MESSAGE,
    RESEND_DOCUMENT,
    SYNCHRONIZE_EDC_RESOURCES,
    VALIDATE_USER
    
  }
  
  public static class RightValueBoolFilterInput {
    private RightValueBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public RightValueBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof RightValueBoolFilterField) {
          this.field = (RightValueBoolFilterField) args.get("field");
        } else {
          this.field = RightValueBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public RightValueBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(RightValueBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum RightValueBoolFilterField {
    VALUE
    
  }
  
  public static class RightValueQueryParamsInput {
    private Iterable<RightValueBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private RightValueSortField sortField;
  
    public RightValueQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<RightValueBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof RightValueSortField) {
          this.sortField = (RightValueSortField) args.get("sortField");
        } else {
          this.sortField = RightValueSortField.valueOf((String) args.get("sortField"));
        }
      }
    }
  
    public Iterable<RightValueBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public RightValueSortField getSortField() { return this.sortField; }
    public void setBoolFilters(Iterable<RightValueBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(RightValueSortField sortField) { this.sortField = sortField; }
  }
  public enum RightValueSortField {
    RIGHT,
    VALUE
    
  }
  
  
  public static class ServiceBoolFilterInput {
    private ServiceBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ServiceBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ServiceBoolFilterField) {
          this.field = (ServiceBoolFilterField) args.get("field");
        } else {
          this.field = ServiceBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ServiceBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ServiceBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ServiceBoolFilterField {
    HAS_CUSTOM_SMTP_CONFIG,
    IS_ENABLED
    
  }
  
  public static class ServiceInput {
    private ChorusB2GConfigInput chorusB2GConfig;
    private String code;
    private SmtpConfigInput customSmtpConfig;
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public ServiceInput(Map<String, Object> args) {
      if (args != null) {
        this.chorusB2GConfig = new ChorusB2GConfigInput((Map<String, Object>) args.get("chorusB2GConfig"));
        this.code = (String) args.get("code");
        this.customSmtpConfig = new SmtpConfigInput((Map<String, Object>) args.get("customSmtpConfig"));
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
      }
    }
  
    public ChorusB2GConfigInput getChorusB2GConfig() { return this.chorusB2GConfig; }
    public String getCode() { return this.code; }
    public SmtpConfigInput getCustomSmtpConfig() { return this.customSmtpConfig; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public void setChorusB2GConfig(ChorusB2GConfigInput chorusB2GConfig) { this.chorusB2GConfig = chorusB2GConfig; }
    public void setCode(String code) { this.code = code; }
    public void setCustomSmtpConfig(SmtpConfigInput customSmtpConfig) { this.customSmtpConfig = customSmtpConfig; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
  }
  public static class ServiceIntFilterInput {
    private ServiceIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public ServiceIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ServiceIntFilterField) {
          this.field = (ServiceIntFilterField) args.get("field");
        } else {
          this.field = ServiceIntFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Integer) args.get("filterValue1");
        this.filterValue2 = (Integer) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ServiceIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ServiceIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ServiceIntFilterField {
    TENANT_USER_COUNT
    
  }
  
  public static class ServiceQueryParamsInput {
    private Iterable<ServiceBoolFilterInput> boolFilters;
    private Iterable<ServiceIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private ServiceSortField sortField;
    private Iterable<ServiceStringFilterInput> stringFilters;
  
    public ServiceQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ServiceBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<ServiceIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ServiceSortField) {
          this.sortField = (ServiceSortField) args.get("sortField");
        } else {
          this.sortField = ServiceSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ServiceStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ServiceBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ServiceIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ServiceSortField getSortField() { return this.sortField; }
    public Iterable<ServiceStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ServiceBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setIntFilters(Iterable<ServiceIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ServiceSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ServiceStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ServiceSortField {
    HAS_CUSTOM_SMTP_CONFIG,
    IS_ENABLED,
    NAME,
    TENANT_USER_COUNT
    
  }
  
  public static class ServiceStringFilterInput {
    private ServiceStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ServiceStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ServiceStringFilterField) {
          this.field = (ServiceStringFilterField) args.get("field");
        } else {
          this.field = ServiceStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ServiceStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ServiceStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ServiceStringFilterField {
    NAME
    
  }
  
  
  public enum SmsContentType {
    BINARY,
    TEXT,
    UNICODE
    
  }
  
  public static class SmsJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<RecipientInput> adhocRecipients;
    private Boolean deDuplicate;
    private String jobType;
    private SmsParameterInput parameter;
    private Object scheduledStartTime;
    private String text;
    private String trackingId;
  
    public SmsJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("adhocRecipients") != null) {
        		this.adhocRecipients = (Iterable<RecipientInput>) args.get("adhocRecipients");
        }
        this.deDuplicate = (Boolean) args.get("deDuplicate");
        this.jobType = (String) args.get("jobType");
        this.parameter = new SmsParameterInput((Map<String, Object>) args.get("parameter"));
        this.scheduledStartTime = (Object) args.get("scheduledStartTime");
        this.text = (String) args.get("text");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<RecipientInput> getAdhocRecipients() { return this.adhocRecipients; }
    public Boolean getDeDuplicate() { return this.deDuplicate; }
    public String getJobType() { return this.jobType; }
    public SmsParameterInput getParameter() { return this.parameter; }
    public Object getScheduledStartTime() { return this.scheduledStartTime; }
    public String getText() { return this.text; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setAdhocRecipients(Iterable<RecipientInput> adhocRecipients) { this.adhocRecipients = adhocRecipients; }
    public void setDeDuplicate(Boolean deDuplicate) { this.deDuplicate = deDuplicate; }
    public void setJobType(String jobType) { this.jobType = jobType; }
    public void setParameter(SmsParameterInput parameter) { this.parameter = parameter; }
    public void setScheduledStartTime(Object scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }
    public void setText(String text) { this.text = text; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public static class SmsParameterInput {
    private Boolean allowMultiPartition;
    private SmsContentType contentType;
    private Boolean formsManagement;
    private Integer lifeSpan;
    private Integer maxPartition;
    private String sender;
    private Boolean shortUrl;
    private Boolean shortUrlGeotagging;
    private Boolean shortUrlTracking;
    private Boolean smsFlash;
  
    public SmsParameterInput(Map<String, Object> args) {
      if (args != null) {
        this.allowMultiPartition = (Boolean) args.get("allowMultiPartition");
        if (args.get("contentType") instanceof SmsContentType) {
          this.contentType = (SmsContentType) args.get("contentType");
        } else {
          this.contentType = SmsContentType.valueOf((String) args.get("contentType"));
        }
        this.formsManagement = (Boolean) args.get("formsManagement");
        this.lifeSpan = (Integer) args.get("lifeSpan");
        this.maxPartition = (Integer) args.get("maxPartition");
        this.sender = (String) args.get("sender");
        this.shortUrl = (Boolean) args.get("shortUrl");
        this.shortUrlGeotagging = (Boolean) args.get("shortUrlGeotagging");
        this.shortUrlTracking = (Boolean) args.get("shortUrlTracking");
        this.smsFlash = (Boolean) args.get("smsFlash");
      }
    }
  
    public Boolean getAllowMultiPartition() { return this.allowMultiPartition; }
    public SmsContentType getContentType() { return this.contentType; }
    public Boolean getFormsManagement() { return this.formsManagement; }
    public Integer getLifeSpan() { return this.lifeSpan; }
    public Integer getMaxPartition() { return this.maxPartition; }
    public String getSender() { return this.sender; }
    public Boolean getShortUrl() { return this.shortUrl; }
    public Boolean getShortUrlGeotagging() { return this.shortUrlGeotagging; }
    public Boolean getShortUrlTracking() { return this.shortUrlTracking; }
    public Boolean getSmsFlash() { return this.smsFlash; }
    public void setAllowMultiPartition(Boolean allowMultiPartition) { this.allowMultiPartition = allowMultiPartition; }
    public void setContentType(SmsContentType contentType) { this.contentType = contentType; }
    public void setFormsManagement(Boolean formsManagement) { this.formsManagement = formsManagement; }
    public void setLifeSpan(Integer lifeSpan) { this.lifeSpan = lifeSpan; }
    public void setMaxPartition(Integer maxPartition) { this.maxPartition = maxPartition; }
    public void setSender(String sender) { this.sender = sender; }
    public void setShortUrl(Boolean shortUrl) { this.shortUrl = shortUrl; }
    public void setShortUrlGeotagging(Boolean shortUrlGeotagging) { this.shortUrlGeotagging = shortUrlGeotagging; }
    public void setShortUrlTracking(Boolean shortUrlTracking) { this.shortUrlTracking = shortUrlTracking; }
    public void setSmsFlash(Boolean smsFlash) { this.smsFlash = smsFlash; }
  }
  
  public static class SmtpConfigInput {
    private String errorAddress;
    private Boolean hasSmtpSsl;
    private String replyAddress;
    private String senderAddress;
    private String senderName;
    private String smtpLogin;
    private String smtpPassword;
    private Integer smtpPort;
    private String smtpServer;
  
    public SmtpConfigInput(Map<String, Object> args) {
      if (args != null) {
        this.errorAddress = (String) args.get("errorAddress");
        this.hasSmtpSsl = (Boolean) args.get("hasSmtpSsl");
        this.replyAddress = (String) args.get("replyAddress");
        this.senderAddress = (String) args.get("senderAddress");
        this.senderName = (String) args.get("senderName");
        this.smtpLogin = (String) args.get("smtpLogin");
        this.smtpPassword = (String) args.get("smtpPassword");
        this.smtpPort = (Integer) args.get("smtpPort");
        this.smtpServer = (String) args.get("smtpServer");
      }
    }
  
    public String getErrorAddress() { return this.errorAddress; }
    public Boolean getHasSmtpSsl() { return this.hasSmtpSsl; }
    public String getReplyAddress() { return this.replyAddress; }
    public String getSenderAddress() { return this.senderAddress; }
    public String getSenderName() { return this.senderName; }
    public String getSmtpLogin() { return this.smtpLogin; }
    public String getSmtpPassword() { return this.smtpPassword; }
    public Integer getSmtpPort() { return this.smtpPort; }
    public String getSmtpServer() { return this.smtpServer; }
    public void setErrorAddress(String errorAddress) { this.errorAddress = errorAddress; }
    public void setHasSmtpSsl(Boolean hasSmtpSsl) { this.hasSmtpSsl = hasSmtpSsl; }
    public void setReplyAddress(String replyAddress) { this.replyAddress = replyAddress; }
    public void setSenderAddress(String senderAddress) { this.senderAddress = senderAddress; }
    public void setSenderName(String senderName) { this.senderName = senderName; }
    public void setSmtpLogin(String smtpLogin) { this.smtpLogin = smtpLogin; }
    public void setSmtpPassword(String smtpPassword) { this.smtpPassword = smtpPassword; }
    public void setSmtpPort(Integer smtpPort) { this.smtpPort = smtpPort; }
    public void setSmtpServer(String smtpServer) { this.smtpServer = smtpServer; }
  }
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
  
  
  public static class StatusActionQueryParamsInput {
    private SortDirection sortDirection;
    private StatusActionSortField sortField;
    private Iterable<StatusActionStringFilterInput> stringFilters;
  
    public StatusActionQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof StatusActionSortField) {
          this.sortField = (StatusActionSortField) args.get("sortField");
        } else {
          this.sortField = StatusActionSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<StatusActionStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public StatusActionSortField getSortField() { return this.sortField; }
    public Iterable<StatusActionStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(StatusActionSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<StatusActionStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum StatusActionSortField {
    ACTION,
    CATEGORY,
    ID,
    STATUS
    
  }
  
  public static class StatusActionStringFilterInput {
    private StatusActionStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public StatusActionStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof StatusActionStringFilterField) {
          this.field = (StatusActionStringFilterField) args.get("field");
        } else {
          this.field = StatusActionStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public StatusActionStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(StatusActionStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum StatusActionStringFilterField {
    ACTION,
    CATEGORY,
    ID,
    STATUS
    
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
  
  
  
  public static class TemplateContentBoolFilterInput {
    private TemplateContentBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public TemplateContentBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentBoolFilterField) {
          this.field = (TemplateContentBoolFilterField) args.get("field");
        } else {
          this.field = TemplateContentBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateContentBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class TemplateContentDateFilterInput {
    private TemplateContentDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateContentDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentDateFilterField) {
          this.field = (TemplateContentDateFilterField) args.get("field");
        } else {
          this.field = TemplateContentDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateContentDateFilterField {
    CREATION_DATE
    
  }
  
  public static class TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput {
    private TemplateContentOwnerTypeFilterField field;
    private InheritedConfigurationOwnerType filterValue1;
    private InheritedConfigurationOwnerType filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentOwnerTypeFilterField) {
          this.field = (TemplateContentOwnerTypeFilterField) args.get("field");
        } else {
          this.field = TemplateContentOwnerTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof InheritedConfigurationOwnerType) {
          this.filterValue1 = (InheritedConfigurationOwnerType) args.get("filterValue1");
        } else {
          this.filterValue1 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof InheritedConfigurationOwnerType) {
          this.filterValue2 = (InheritedConfigurationOwnerType) args.get("filterValue2");
        } else {
          this.filterValue2 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentOwnerTypeFilterField getField() { return this.field; }
    public InheritedConfigurationOwnerType getFilterValue1() { return this.filterValue1; }
    public InheritedConfigurationOwnerType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentOwnerTypeFilterField field) { this.field = field; }
    public void setFilterValue1(InheritedConfigurationOwnerType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(InheritedConfigurationOwnerType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class TemplateContentInput {
    private String content;
    private String id;
    private Boolean isEnabled;
    private TemplateContentNotificationType notificationType;
    private String ownerId;
    private InheritedConfigurationOwnerType ownerType;
    private String subject;
    private TemplateContentTransmissionType transmissionType;
  
    public TemplateContentInput(Map<String, Object> args) {
      if (args != null) {
        this.content = (String) args.get("content");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        if (args.get("notificationType") instanceof TemplateContentNotificationType) {
          this.notificationType = (TemplateContentNotificationType) args.get("notificationType");
        } else {
          this.notificationType = TemplateContentNotificationType.valueOf((String) args.get("notificationType"));
        }
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof InheritedConfigurationOwnerType) {
          this.ownerType = (InheritedConfigurationOwnerType) args.get("ownerType");
        } else {
          this.ownerType = InheritedConfigurationOwnerType.valueOf((String) args.get("ownerType"));
        }
        this.subject = (String) args.get("subject");
        if (args.get("transmissionType") instanceof TemplateContentTransmissionType) {
          this.transmissionType = (TemplateContentTransmissionType) args.get("transmissionType");
        } else {
          this.transmissionType = TemplateContentTransmissionType.valueOf((String) args.get("transmissionType"));
        }
      }
    }
  
    public String getContent() { return this.content; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public TemplateContentNotificationType getNotificationType() { return this.notificationType; }
    public String getOwnerId() { return this.ownerId; }
    public InheritedConfigurationOwnerType getOwnerType() { return this.ownerType; }
    public String getSubject() { return this.subject; }
    public TemplateContentTransmissionType getTransmissionType() { return this.transmissionType; }
    public void setContent(String content) { this.content = content; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setNotificationType(TemplateContentNotificationType notificationType) { this.notificationType = notificationType; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(InheritedConfigurationOwnerType ownerType) { this.ownerType = ownerType; }
    public void setSubject(String subject) { this.subject = subject; }
    public void setTransmissionType(TemplateContentTransmissionType transmissionType) { this.transmissionType = transmissionType; }
  }
  public enum TemplateContentNotificationType {
    ACTIVITY_ADD_ATTACHMENTS_DOCUMENT,
    ACTIVITY_ADD_DATA_FILE_ACTION,
    ACTIVITY_CANCEL_JOB_MESSAGE,
    ACTIVITY_CHANGE_STATUS_CHORUS_B_2_G,
    ACTIVITY_COMPLETE_CHORUS_B_2_G,
    ACTIVITY_DOCUMENT_ARCHIVED,
    ACTIVITY_DOCUMENT_CANCELED,
    ACTIVITY_DOCUMENT_READ,
    ACTIVITY_DOCUMENT_SIGNED,
    ACTIVITY_EDIT_METADATA_DOCUMENT,
    ACTIVITY_ERROR,
    ACTIVITY_EXTERNAL_PROCESS,
    ACTIVITY_JOB_CREATED,
    ACTIVITY_JOB_LAUNCHED,
    ACTIVITY_JOB_PROCESSING,
    ACTIVITY_NOTIFICATION_SENT,
    ACTIVITY_SEND_CHORUS_B_2_G,
    ADD_USER_TO_TENANT,
    DOCUMENT_NOTIFICATION,
    DOCUMENT_NOTIFICATION_LINK,
    DOCUMENT_NOTIFICATION_WITH_LINK,
    ERE,
    ERE_ANONYMOUS,
    INTERNAL_NOT_ARCHIVED_FILES,
    INVITE_USER,
    LSE,
    LSE_ANONYMOUS,
    LSE_ERE_END_OF_JOB,
    NEW_USER_LOGIN,
    NEW_USER_PASSWORD
    
  }
  
  public enum TemplateContentNotificationTypeFilterField {
    NOTIFICATION_TYPE
    
  }
  
  public enum TemplateContentOwnerTypeFilterField {
    OWNER_TYPE
    
  }
  
  public static class TemplateContentQueryParamsInput {
    private Iterable<TemplateContentBoolFilterInput> boolFilters;
    private Iterable<TemplateContentDateFilterInput> dateFilters;
    private Iterable<TemplateContentTemplateContentNotificationTypeEnumFilterInput> notificationTypeFilters;
    private Iterable<TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters;
    private SortDirection sortDirection;
    private TemplateContentSortField sortField;
    private Iterable<TemplateContentStringFilterInput> stringFilters;
    private Iterable<TemplateContentTemplateContentTransmissionTypeEnumFilterInput> transmissionTypeFilters;
  
    public TemplateContentQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<TemplateContentBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<TemplateContentDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("notificationTypeFilters") != null) {
        		this.notificationTypeFilters = (Iterable<TemplateContentTemplateContentNotificationTypeEnumFilterInput>) args.get("notificationTypeFilters");
        }
        if (args.get("ownerTypeFilters") != null) {
        		this.ownerTypeFilters = (Iterable<TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput>) args.get("ownerTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof TemplateContentSortField) {
          this.sortField = (TemplateContentSortField) args.get("sortField");
        } else {
          this.sortField = TemplateContentSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<TemplateContentStringFilterInput>) args.get("stringFilters");
        }
        if (args.get("transmissionTypeFilters") != null) {
        		this.transmissionTypeFilters = (Iterable<TemplateContentTemplateContentTransmissionTypeEnumFilterInput>) args.get("transmissionTypeFilters");
        }
      }
    }
  
    public Iterable<TemplateContentBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<TemplateContentDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<TemplateContentTemplateContentNotificationTypeEnumFilterInput> getNotificationTypeFilters() { return this.notificationTypeFilters; }
    public Iterable<TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput> getOwnerTypeFilters() { return this.ownerTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public TemplateContentSortField getSortField() { return this.sortField; }
    public Iterable<TemplateContentStringFilterInput> getStringFilters() { return this.stringFilters; }
    public Iterable<TemplateContentTemplateContentTransmissionTypeEnumFilterInput> getTransmissionTypeFilters() { return this.transmissionTypeFilters; }
    public void setBoolFilters(Iterable<TemplateContentBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<TemplateContentDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setNotificationTypeFilters(Iterable<TemplateContentTemplateContentNotificationTypeEnumFilterInput> notificationTypeFilters) { this.notificationTypeFilters = notificationTypeFilters; }
    public void setOwnerTypeFilters(Iterable<TemplateContentInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters) { this.ownerTypeFilters = ownerTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(TemplateContentSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<TemplateContentStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
    public void setTransmissionTypeFilters(Iterable<TemplateContentTemplateContentTransmissionTypeEnumFilterInput> transmissionTypeFilters) { this.transmissionTypeFilters = transmissionTypeFilters; }
  }
  public enum TemplateContentSortField {
    CREATION_DATE,
    IS_ENABLED,
    NOTIFICATION_TYPE,
    OWNER_ID,
    OWNER_TYPE,
    SUBJECT,
    TRANSMISSION_TYPE
    
  }
  
  public static class TemplateContentStringFilterInput {
    private TemplateContentStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public TemplateContentStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentStringFilterField) {
          this.field = (TemplateContentStringFilterField) args.get("field");
        } else {
          this.field = TemplateContentStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateContentStringFilterField {
    ID,
    OWNER_ID,
    SUBJECT
    
  }
  
  public static class TemplateContentTemplateContentNotificationTypeEnumFilterInput {
    private TemplateContentNotificationTypeFilterField field;
    private TemplateContentNotificationType filterValue1;
    private TemplateContentNotificationType filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateContentTemplateContentNotificationTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentNotificationTypeFilterField) {
          this.field = (TemplateContentNotificationTypeFilterField) args.get("field");
        } else {
          this.field = TemplateContentNotificationTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof TemplateContentNotificationType) {
          this.filterValue1 = (TemplateContentNotificationType) args.get("filterValue1");
        } else {
          this.filterValue1 = TemplateContentNotificationType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof TemplateContentNotificationType) {
          this.filterValue2 = (TemplateContentNotificationType) args.get("filterValue2");
        } else {
          this.filterValue2 = TemplateContentNotificationType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentNotificationTypeFilterField getField() { return this.field; }
    public TemplateContentNotificationType getFilterValue1() { return this.filterValue1; }
    public TemplateContentNotificationType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentNotificationTypeFilterField field) { this.field = field; }
    public void setFilterValue1(TemplateContentNotificationType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(TemplateContentNotificationType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class TemplateContentTemplateContentTransmissionTypeEnumFilterInput {
    private TemplateContentTransmissionTypeFilterField field;
    private TemplateContentTransmissionType filterValue1;
    private TemplateContentTransmissionType filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateContentTemplateContentTransmissionTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateContentTransmissionTypeFilterField) {
          this.field = (TemplateContentTransmissionTypeFilterField) args.get("field");
        } else {
          this.field = TemplateContentTransmissionTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof TemplateContentTransmissionType) {
          this.filterValue1 = (TemplateContentTransmissionType) args.get("filterValue1");
        } else {
          this.filterValue1 = TemplateContentTransmissionType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof TemplateContentTransmissionType) {
          this.filterValue2 = (TemplateContentTransmissionType) args.get("filterValue2");
        } else {
          this.filterValue2 = TemplateContentTransmissionType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateContentTransmissionTypeFilterField getField() { return this.field; }
    public TemplateContentTransmissionType getFilterValue1() { return this.filterValue1; }
    public TemplateContentTransmissionType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateContentTransmissionTypeFilterField field) { this.field = field; }
    public void setFilterValue1(TemplateContentTransmissionType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(TemplateContentTransmissionType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateContentTransmissionType {
    EMAIL,
    NONE,
    SMS,
    WEB_NOTIFICATION
    
  }
  
  public enum TemplateContentTransmissionTypeFilterField {
    TRANSMISSION_TYPE
    
  }
  
  
  
  public static class TemplateStructureBoolFilterInput {
    private TemplateStructureBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public TemplateStructureBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateStructureBoolFilterField) {
          this.field = (TemplateStructureBoolFilterField) args.get("field");
        } else {
          this.field = TemplateStructureBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateStructureBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateStructureBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateStructureBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class TemplateStructureDateFilterInput {
    private TemplateStructureDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateStructureDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateStructureDateFilterField) {
          this.field = (TemplateStructureDateFilterField) args.get("field");
        } else {
          this.field = TemplateStructureDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateStructureDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateStructureDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateStructureDateFilterField {
    CREATION_DATE
    
  }
  
  public static class TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput {
    private TemplateStructureOwnerTypeFilterField field;
    private InheritedConfigurationOwnerType filterValue1;
    private InheritedConfigurationOwnerType filterValue2;
    private NumberFilterOperator operator;
  
    public TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateStructureOwnerTypeFilterField) {
          this.field = (TemplateStructureOwnerTypeFilterField) args.get("field");
        } else {
          this.field = TemplateStructureOwnerTypeFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof InheritedConfigurationOwnerType) {
          this.filterValue1 = (InheritedConfigurationOwnerType) args.get("filterValue1");
        } else {
          this.filterValue1 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof InheritedConfigurationOwnerType) {
          this.filterValue2 = (InheritedConfigurationOwnerType) args.get("filterValue2");
        } else {
          this.filterValue2 = InheritedConfigurationOwnerType.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateStructureOwnerTypeFilterField getField() { return this.field; }
    public InheritedConfigurationOwnerType getFilterValue1() { return this.filterValue1; }
    public InheritedConfigurationOwnerType getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateStructureOwnerTypeFilterField field) { this.field = field; }
    public void setFilterValue1(InheritedConfigurationOwnerType filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(InheritedConfigurationOwnerType filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public static class TemplateStructureInput {
    private String contentBase64;
    private String id;
    private Boolean isEnabled;
    private String ownerId;
    private InheritedConfigurationOwnerType ownerType;
  
    public TemplateStructureInput(Map<String, Object> args) {
      if (args != null) {
        this.contentBase64 = (String) args.get("contentBase64");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof InheritedConfigurationOwnerType) {
          this.ownerType = (InheritedConfigurationOwnerType) args.get("ownerType");
        } else {
          this.ownerType = InheritedConfigurationOwnerType.valueOf((String) args.get("ownerType"));
        }
      }
    }
  
    public String getContentBase64() { return this.contentBase64; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getOwnerId() { return this.ownerId; }
    public InheritedConfigurationOwnerType getOwnerType() { return this.ownerType; }
    public void setContentBase64(String contentBase64) { this.contentBase64 = contentBase64; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(InheritedConfigurationOwnerType ownerType) { this.ownerType = ownerType; }
  }
  public enum TemplateStructureOwnerTypeFilterField {
    OWNER_TYPE
    
  }
  
  public static class TemplateStructureQueryParamsInput {
    private Iterable<TemplateStructureBoolFilterInput> boolFilters;
    private Iterable<TemplateStructureDateFilterInput> dateFilters;
    private Iterable<TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters;
    private SortDirection sortDirection;
    private TemplateStructureSortField sortField;
    private Iterable<TemplateStructureStringFilterInput> stringFilters;
  
    public TemplateStructureQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<TemplateStructureBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<TemplateStructureDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("ownerTypeFilters") != null) {
        		this.ownerTypeFilters = (Iterable<TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput>) args.get("ownerTypeFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof TemplateStructureSortField) {
          this.sortField = (TemplateStructureSortField) args.get("sortField");
        } else {
          this.sortField = TemplateStructureSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<TemplateStructureStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<TemplateStructureBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<TemplateStructureDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput> getOwnerTypeFilters() { return this.ownerTypeFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public TemplateStructureSortField getSortField() { return this.sortField; }
    public Iterable<TemplateStructureStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<TemplateStructureBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<TemplateStructureDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setOwnerTypeFilters(Iterable<TemplateStructureInheritedConfigurationOwnerTypeEnumFilterInput> ownerTypeFilters) { this.ownerTypeFilters = ownerTypeFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(TemplateStructureSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<TemplateStructureStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum TemplateStructureSortField {
    CREATION_DATE,
    IS_ENABLED,
    OWNER_ID,
    OWNER_TYPE
    
  }
  
  public static class TemplateStructureStringFilterInput {
    private TemplateStructureStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public TemplateStructureStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemplateStructureStringFilterField) {
          this.field = (TemplateStructureStringFilterField) args.get("field");
        } else {
          this.field = TemplateStructureStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemplateStructureStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(TemplateStructureStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum TemplateStructureStringFilterField {
    ID,
    OWNER_ID
    
  }
  
  
  
  
  public static class TemporaryDocumentContentInput {
    private String content;
    private String id;
    private Iterable<KeyValuePairInput> metadata;
    private String name;
    private String tenantId;
  
    public TemporaryDocumentContentInput(Map<String, Object> args) {
      if (args != null) {
        this.content = (String) args.get("content");
        this.id = (String) args.get("id");
        if (args.get("metadata") != null) {
        		this.metadata = (Iterable<KeyValuePairInput>) args.get("metadata");
        }
        this.name = (String) args.get("name");
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getContent() { return this.content; }
    public String getId() { return this.id; }
    public Iterable<KeyValuePairInput> getMetadata() { return this.metadata; }
    public String getName() { return this.name; }
    public String getTenantId() { return this.tenantId; }
    public void setContent(String content) { this.content = content; }
    public void setId(String id) { this.id = id; }
    public void setMetadata(Iterable<KeyValuePairInput> metadata) { this.metadata = metadata; }
    public void setName(String name) { this.name = name; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
  
  public static class TemporaryDocumentHeaderDateFilterInput {
    private TemporaryDocumentHeaderDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public TemporaryDocumentHeaderDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemporaryDocumentHeaderDateFilterField) {
          this.field = (TemporaryDocumentHeaderDateFilterField) args.get("field");
        } else {
          this.field = TemporaryDocumentHeaderDateFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Object) args.get("filterValue1");
        this.filterValue2 = (Object) args.get("filterValue2");
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemporaryDocumentHeaderDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TemporaryDocumentHeaderDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum TemporaryDocumentHeaderDateFilterField {
    CREATION_DATE,
    STORAGE_END_DATE
    
  }
  
  public static class TemporaryDocumentHeaderQueryParamsInput {
    private Iterable<TemporaryDocumentHeaderDateFilterInput> dateFilters;
    private SortDirection sortDirection;
    private TemporaryDocumentHeaderSortField sortField;
    private Iterable<TemporaryDocumentHeaderStringFilterInput> stringFilters;
  
    public TemporaryDocumentHeaderQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<TemporaryDocumentHeaderDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof TemporaryDocumentHeaderSortField) {
          this.sortField = (TemporaryDocumentHeaderSortField) args.get("sortField");
        } else {
          this.sortField = TemporaryDocumentHeaderSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<TemporaryDocumentHeaderStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<TemporaryDocumentHeaderDateFilterInput> getDateFilters() { return this.dateFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public TemporaryDocumentHeaderSortField getSortField() { return this.sortField; }
    public Iterable<TemporaryDocumentHeaderStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setDateFilters(Iterable<TemporaryDocumentHeaderDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(TemporaryDocumentHeaderSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<TemporaryDocumentHeaderStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum TemporaryDocumentHeaderSortField {
    CREATION_DATE,
    NAME,
    SIZE,
    STORAGE_END_DATE
    
  }
  
  public static class TemporaryDocumentHeaderStringFilterInput {
    private TemporaryDocumentHeaderStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public TemporaryDocumentHeaderStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TemporaryDocumentHeaderStringFilterField) {
          this.field = (TemporaryDocumentHeaderStringFilterField) args.get("field");
        } else {
          this.field = TemporaryDocumentHeaderStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TemporaryDocumentHeaderStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(TemporaryDocumentHeaderStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum TemporaryDocumentHeaderStringFilterField {
    NAME,
    TENANT_ID
    
  }
  
  
  /** The application rights for tenant user. */
  public enum TenantRightType {
    CANCEL_JOB_MESSAGE,
    CHANGE_ACTIVITY,
    CHANGE_CLICKED_LINK_DOCUMENT,
    CHANGE_CONTACT,
    CHANGE_CONTACT_FUNCTION,
    CHANGE_DASHBOARD,
    CHANGE_DATA_FILE_ACTION,
    CHANGE_DOCUMENT,
    CHANGE_DOCUMENT_JOB,
    CHANGE_DOCUMENT_TYPE,
    CHANGE_JOB_MESSAGE,
    CHANGE_LIST_OF_VALUES,
    CHANGE_METADATA,
    CHANGE_NOTE,
    CHANGE_OMS_RESOURCES,
    CHANGE_POSTAL_JOB,
    CHANGE_POSTAL_PARAMETER_CONFIGURATION,
    CHANGE_SERVICE,
    CHANGE_TEMPLATE_CONTENT,
    CHANGE_TEMPLATE_STRUCTURE,
    CHANGE_TEMPLATE_VARIABLE_CONFIGURATION,
    CHANGE_TENANT_API_USER,
    CHANGE_TENANT_EDC_OMS_INFO,
    CHANGE_TENANT_USER,
    CHANGE_THIRD_PARTY,
    CHANGE_THIRD_PARTY_TYPE,
    COMPLETE_DOCUMENT,
    EDIT_TENANT,
    GRANT_INTERNAL_RIGHT,
    GRANT_RIGHT,
    READ_ACTIVITY,
    READ_CONTACT,
    READ_CONTACT_FUNCTION,
    READ_DASHBOARD,
    READ_DATA_FILE_ACTION,
    READ_DOCUMENT,
    READ_DOCUMENT_JOB,
    READ_DOCUMENT_ON_SERVICE,
    READ_DOCUMENT_TYPE,
    READ_JOB_MESSAGE,
    READ_LIST_OF_VALUES,
    READ_METADATA,
    READ_NOTE,
    READ_OMS_RESOURCES,
    READ_POSTAL_JOB,
    READ_POSTAL_PARAMETER_CONFIGURATION,
    READ_SERVICE,
    READ_STATUS_ACTION,
    READ_TEMPLATE_CONTENT,
    READ_TEMPLATE_STRUCTURE,
    READ_TEMPLATE_VARIABLE_CONFIGURATION,
    READ_TENANT,
    READ_TENANT_API_USER,
    READ_TENANT_EDC_OMS_INFO,
    READ_TENANT_USER,
    READ_THIRD_PARTY,
    READ_THIRD_PARTY_TYPE,
    RELAUNCH_JOB_MESSAGE,
    RESEND_DOCUMENT,
    VALIDATE_USER
    
  }
  
  
  public static class TenantRightValueInput {
    private TenantRightType right;
    private Boolean value;
  
    public TenantRightValueInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("right") instanceof TenantRightType) {
          this.right = (TenantRightType) args.get("right");
        } else {
          this.right = TenantRightType.valueOf((String) args.get("right"));
        }
        this.value = (Boolean) args.get("value");
      }
    }
  
    public TenantRightType getRight() { return this.right; }
    public Boolean getValue() { return this.value; }
    public void setRight(TenantRightType right) { this.right = right; }
    public void setValue(Boolean value) { this.value = value; }
  }
  
  
  public static class TenantUserBoolFilterInput {
    private TenantUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public TenantUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TenantUserBoolFilterField) {
          this.field = (TenantUserBoolFilterField) args.get("field");
        } else {
          this.field = TenantUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TenantUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(TenantUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum TenantUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public enum TenantUserDocumentAccessType {
    FULL,
    RESTRICTED
    
  }
  
  public static class TenantUserInput {
    private String civility;
    private String culture;
    private TenantUserDocumentAccessType documentAccessType;
    private String email;
    private String firstName;
    private String id;
    private Boolean isEnabled;
    private String lastName;
    private String phone;
    private Iterable<IdNameInput> services;
    private String timeZone;
    private Boolean weeklyReport;
  
    public TenantUserInput(Map<String, Object> args) {
      if (args != null) {
        this.civility = (String) args.get("civility");
        this.culture = (String) args.get("culture");
        if (args.get("documentAccessType") instanceof TenantUserDocumentAccessType) {
          this.documentAccessType = (TenantUserDocumentAccessType) args.get("documentAccessType");
        } else {
          this.documentAccessType = TenantUserDocumentAccessType.valueOf((String) args.get("documentAccessType"));
        }
        this.email = (String) args.get("email");
        this.firstName = (String) args.get("firstName");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.lastName = (String) args.get("lastName");
        this.phone = (String) args.get("phone");
        if (args.get("services") != null) {
        		this.services = (Iterable<IdNameInput>) args.get("services");
        }
        this.timeZone = (String) args.get("timeZone");
        this.weeklyReport = (Boolean) args.get("weeklyReport");
      }
    }
  
    public String getCivility() { return this.civility; }
    public String getCulture() { return this.culture; }
    public TenantUserDocumentAccessType getDocumentAccessType() { return this.documentAccessType; }
    public String getEmail() { return this.email; }
    public String getFirstName() { return this.firstName; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getLastName() { return this.lastName; }
    public String getPhone() { return this.phone; }
    public Iterable<IdNameInput> getServices() { return this.services; }
    public String getTimeZone() { return this.timeZone; }
    public Boolean getWeeklyReport() { return this.weeklyReport; }
    public void setCivility(String civility) { this.civility = civility; }
    public void setCulture(String culture) { this.culture = culture; }
    public void setDocumentAccessType(TenantUserDocumentAccessType documentAccessType) { this.documentAccessType = documentAccessType; }
    public void setEmail(String email) { this.email = email; }
    public void setFirstName(String firstName) { this.firstName = firstName; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setLastName(String lastName) { this.lastName = lastName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setServices(Iterable<IdNameInput> services) { this.services = services; }
    public void setTimeZone(String timeZone) { this.timeZone = timeZone; }
    public void setWeeklyReport(Boolean weeklyReport) { this.weeklyReport = weeklyReport; }
  }
  public static class TenantUserQueryParamsInput {
    private Iterable<TenantUserBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private TenantUserSortField sortField;
    private Iterable<TenantUserStringFilterInput> stringFilters;
  
    public TenantUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<TenantUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof TenantUserSortField) {
          this.sortField = (TenantUserSortField) args.get("sortField");
        } else {
          this.sortField = TenantUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<TenantUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<TenantUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public TenantUserSortField getSortField() { return this.sortField; }
    public Iterable<TenantUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<TenantUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(TenantUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<TenantUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class TenantUserStringFilterInput {
    private TenantUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public TenantUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TenantUserStringFilterField) {
          this.field = (TenantUserStringFilterField) args.get("field");
        } else {
          this.field = TenantUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TenantUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(TenantUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum TenantUserStringFilterField {
    EMAIL,
    FIRST_NAME,
    LAST_NAME,
    SERVICE_ID,
    USER_ID
    
  }
  
  
  
  public static class ThirdPartyBoolFilterInput {
    private ThirdPartyBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ThirdPartyBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ThirdPartyBoolFilterField) {
          this.field = (ThirdPartyBoolFilterField) args.get("field");
        } else {
          this.field = ThirdPartyBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ThirdPartyBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ThirdPartyBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ThirdPartyBoolFilterField {
    IS_ENABLED,
    IS_MORAL_PERSON
    
  }
  
  public enum ThirdPartyIdentifierType {
    FROM_GED_FIELDS,
    THIRDPARTY_ID
    
  }
  
  public static class ThirdPartyInput {
    private PostalAddressInput address;
    private String code;
    private String id;
    private Boolean isEnabled;
    private String name;
    private ThirdPartyPersonType personType;
    private Iterable<String> thirdPartyTypeIds;
  
    public ThirdPartyInput(Map<String, Object> args) {
      if (args != null) {
        this.address = new PostalAddressInput((Map<String, Object>) args.get("address"));
        this.code = (String) args.get("code");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
        if (args.get("personType") instanceof ThirdPartyPersonType) {
          this.personType = (ThirdPartyPersonType) args.get("personType");
        } else {
          this.personType = ThirdPartyPersonType.valueOf((String) args.get("personType"));
        }
        this.thirdPartyTypeIds = (Iterable<String>) args.get("thirdPartyTypeIds");
      }
    }
  
    public PostalAddressInput getAddress() { return this.address; }
    public String getCode() { return this.code; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public ThirdPartyPersonType getPersonType() { return this.personType; }
    public Iterable<String> getThirdPartyTypeIds() { return this.thirdPartyTypeIds; }
    public void setAddress(PostalAddressInput address) { this.address = address; }
    public void setCode(String code) { this.code = code; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
    public void setPersonType(ThirdPartyPersonType personType) { this.personType = personType; }
    public void setThirdPartyTypeIds(Iterable<String> thirdPartyTypeIds) { this.thirdPartyTypeIds = thirdPartyTypeIds; }
  }
  public enum ThirdPartyPersonType {
    MORAL_PERSON_PRIVATE,
    MORAL_PERSON_PUBLIC,
    PRIVATE_PERSON
    
  }
  
  public static class ThirdPartyQueryParamsInput {
    private Iterable<ThirdPartyBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private ThirdPartySortField sortField;
    private Iterable<ThirdPartyStringFilterInput> stringFilters;
  
    public ThirdPartyQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ThirdPartyBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ThirdPartySortField) {
          this.sortField = (ThirdPartySortField) args.get("sortField");
        } else {
          this.sortField = ThirdPartySortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ThirdPartyStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ThirdPartyBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ThirdPartySortField getSortField() { return this.sortField; }
    public Iterable<ThirdPartyStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ThirdPartyBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ThirdPartySortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ThirdPartyStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public static class ThirdPartyRecipientInput {
    private Iterable<String> contactFunctionCodes;
    private String thirdPartyIdentifier;
    private ThirdPartyIdentifierType thirdPartyIdentifierType;
    private ThirdPartyUpdateOptionsInput updateOptions;
  
    public ThirdPartyRecipientInput(Map<String, Object> args) {
      if (args != null) {
        this.contactFunctionCodes = (Iterable<String>) args.get("contactFunctionCodes");
        this.thirdPartyIdentifier = (String) args.get("thirdPartyIdentifier");
        if (args.get("thirdPartyIdentifierType") instanceof ThirdPartyIdentifierType) {
          this.thirdPartyIdentifierType = (ThirdPartyIdentifierType) args.get("thirdPartyIdentifierType");
        } else {
          this.thirdPartyIdentifierType = ThirdPartyIdentifierType.valueOf((String) args.get("thirdPartyIdentifierType"));
        }
        this.updateOptions = new ThirdPartyUpdateOptionsInput((Map<String, Object>) args.get("updateOptions"));
      }
    }
  
    public Iterable<String> getContactFunctionCodes() { return this.contactFunctionCodes; }
    public String getThirdPartyIdentifier() { return this.thirdPartyIdentifier; }
    public ThirdPartyIdentifierType getThirdPartyIdentifierType() { return this.thirdPartyIdentifierType; }
    public ThirdPartyUpdateOptionsInput getUpdateOptions() { return this.updateOptions; }
    public void setContactFunctionCodes(Iterable<String> contactFunctionCodes) { this.contactFunctionCodes = contactFunctionCodes; }
    public void setThirdPartyIdentifier(String thirdPartyIdentifier) { this.thirdPartyIdentifier = thirdPartyIdentifier; }
    public void setThirdPartyIdentifierType(ThirdPartyIdentifierType thirdPartyIdentifierType) { this.thirdPartyIdentifierType = thirdPartyIdentifierType; }
    public void setUpdateOptions(ThirdPartyUpdateOptionsInput updateOptions) { this.updateOptions = updateOptions; }
  }
  public enum ThirdPartySortField {
    CODE,
    IS_ENABLED,
    IS_MORAL_PERSON,
    NAME
    
  }
  
  public static class ThirdPartyStringFilterInput {
    private ThirdPartyStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ThirdPartyStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ThirdPartyStringFilterField) {
          this.field = (ThirdPartyStringFilterField) args.get("field");
        } else {
          this.field = ThirdPartyStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ThirdPartyStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ThirdPartyStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ThirdPartyStringFilterField {
    CODE,
    NAME
    
  }
  
  
  public static class ThirdPartyTypeBoolFilterInput {
    private ThirdPartyTypeBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ThirdPartyTypeBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ThirdPartyTypeBoolFilterField) {
          this.field = (ThirdPartyTypeBoolFilterField) args.get("field");
        } else {
          this.field = ThirdPartyTypeBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ThirdPartyTypeBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ThirdPartyTypeBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ThirdPartyTypeBoolFilterField {
    IS_ENABLED
    
  }
  
  
  public static class ThirdPartyTypeInput {
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public ThirdPartyTypeInput(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
      }
    }
  
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
  }
  public enum ThirdPartyTypeOwnerType {
    SYSTEM,
    TENANT
    
  }
  
  public static class ThirdPartyTypeQueryParamsInput {
    private Iterable<ThirdPartyTypeBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private ThirdPartyTypeSortField sortField;
    private Iterable<ThirdPartyTypeStringFilterInput> stringFilters;
  
    public ThirdPartyTypeQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ThirdPartyTypeBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ThirdPartyTypeSortField) {
          this.sortField = (ThirdPartyTypeSortField) args.get("sortField");
        } else {
          this.sortField = ThirdPartyTypeSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ThirdPartyTypeStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ThirdPartyTypeBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ThirdPartyTypeSortField getSortField() { return this.sortField; }
    public Iterable<ThirdPartyTypeStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ThirdPartyTypeBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ThirdPartyTypeSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ThirdPartyTypeStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ThirdPartyTypeSortField {
    IS_ENABLED,
    NAME
    
  }
  
  public static class ThirdPartyTypeStringFilterInput {
    private ThirdPartyTypeStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ThirdPartyTypeStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ThirdPartyTypeStringFilterField) {
          this.field = (ThirdPartyTypeStringFilterField) args.get("field");
        } else {
          this.field = ThirdPartyTypeStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ThirdPartyTypeStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ThirdPartyTypeStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ThirdPartyTypeStringFilterField {
    NAME,
    OWNER_ID
    
  }
  
  
  public static class ThirdPartyUpdateOptionsInput {
    private Boolean createThirdParty;
  
    public ThirdPartyUpdateOptionsInput(Map<String, Object> args) {
      if (args != null) {
        this.createThirdParty = (Boolean) args.get("createThirdParty");
      }
    }
  
    public Boolean getCreateThirdParty() { return this.createThirdParty; }
    public void setCreateThirdParty(Boolean createThirdParty) { this.createThirdParty = createThirdParty; }
  }
  public enum UserProfile {
    ADMINISTRATOR,
    DOMAIN_ADMINISTRATOR,
    ENVIRONMENT_ADMINISTRATOR,
    STANDARD_USER,
    TENANT_RECEIVER,
    WEBSITE_ADMINISTRATOR
    
  }
  
  
  public static class ValueOfListInput {
    private String code;
    private String id;
    private String listOfValuesId;
    private String name;
    private String ownerId;
    private ValueOfListOwnerType ownerType;
  
    public ValueOfListInput(Map<String, Object> args) {
      if (args != null) {
        this.code = (String) args.get("code");
        this.id = (String) args.get("id");
        this.listOfValuesId = (String) args.get("listOfValuesId");
        this.name = (String) args.get("name");
        this.ownerId = (String) args.get("ownerId");
        if (args.get("ownerType") instanceof ValueOfListOwnerType) {
          this.ownerType = (ValueOfListOwnerType) args.get("ownerType");
        } else {
          this.ownerType = ValueOfListOwnerType.valueOf((String) args.get("ownerType"));
        }
      }
    }
  
    public String getCode() { return this.code; }
    public String getId() { return this.id; }
    public String getListOfValuesId() { return this.listOfValuesId; }
    public String getName() { return this.name; }
    public String getOwnerId() { return this.ownerId; }
    public ValueOfListOwnerType getOwnerType() { return this.ownerType; }
    public void setCode(String code) { this.code = code; }
    public void setId(String id) { this.id = id; }
    public void setListOfValuesId(String listOfValuesId) { this.listOfValuesId = listOfValuesId; }
    public void setName(String name) { this.name = name; }
    public void setOwnerId(String ownerId) { this.ownerId = ownerId; }
    public void setOwnerType(ValueOfListOwnerType ownerType) { this.ownerType = ownerType; }
  }
  public enum ValueOfListOwnerType {
    SYSTEM,
    TENANT
    
  }
  
  public static class ValueOfListQueryParamsInput {
    private SortDirection sortDirection;
    private ValueOfListSortField sortField;
    private Iterable<ValueOfListStringFilterInput> stringFilters;
  
    public ValueOfListQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ValueOfListSortField) {
          this.sortField = (ValueOfListSortField) args.get("sortField");
        } else {
          this.sortField = ValueOfListSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ValueOfListStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ValueOfListSortField getSortField() { return this.sortField; }
    public Iterable<ValueOfListStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ValueOfListSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ValueOfListStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ValueOfListSortField {
    CODE,
    NAME
    
  }
  
  public static class ValueOfListStringFilterInput {
    private ValueOfListStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ValueOfListStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ValueOfListStringFilterField) {
          this.field = (ValueOfListStringFilterField) args.get("field");
        } else {
          this.field = ValueOfListStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ValueOfListStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ValueOfListStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ValueOfListStringFilterField {
    CODE,
    LIST_OF_VALUES_ID,
    NAME
    
  }
  
  
  public static class VoiceJobInput {
    private Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles;
    private Iterable<RecipientInput> adhocRecipients;
    private Boolean deDuplicate;
    private Iterable<FileIdOrNewInputTypeInput> documents;
    private String jobType;
    private VoiceParameterInput parameter;
    private Object scheduledStartTime;
    private String trackingId;
  
    public VoiceJobInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("adhocRecipientFiles") != null) {
        		this.adhocRecipientFiles = (Iterable<FileIdOrNewInputTypeInput>) args.get("adhocRecipientFiles");
        }
        if (args.get("adhocRecipients") != null) {
        		this.adhocRecipients = (Iterable<RecipientInput>) args.get("adhocRecipients");
        }
        this.deDuplicate = (Boolean) args.get("deDuplicate");
        if (args.get("documents") != null) {
        		this.documents = (Iterable<FileIdOrNewInputTypeInput>) args.get("documents");
        }
        this.jobType = (String) args.get("jobType");
        this.parameter = new VoiceParameterInput((Map<String, Object>) args.get("parameter"));
        this.scheduledStartTime = (Object) args.get("scheduledStartTime");
        this.trackingId = (String) args.get("trackingId");
      }
    }
  
    public Iterable<FileIdOrNewInputTypeInput> getAdhocRecipientFiles() { return this.adhocRecipientFiles; }
    public Iterable<RecipientInput> getAdhocRecipients() { return this.adhocRecipients; }
    public Boolean getDeDuplicate() { return this.deDuplicate; }
    public Iterable<FileIdOrNewInputTypeInput> getDocuments() { return this.documents; }
    public String getJobType() { return this.jobType; }
    public VoiceParameterInput getParameter() { return this.parameter; }
    public Object getScheduledStartTime() { return this.scheduledStartTime; }
    public String getTrackingId() { return this.trackingId; }
    public void setAdhocRecipientFiles(Iterable<FileIdOrNewInputTypeInput> adhocRecipientFiles) { this.adhocRecipientFiles = adhocRecipientFiles; }
    public void setAdhocRecipients(Iterable<RecipientInput> adhocRecipients) { this.adhocRecipients = adhocRecipients; }
    public void setDeDuplicate(Boolean deDuplicate) { this.deDuplicate = deDuplicate; }
    public void setDocuments(Iterable<FileIdOrNewInputTypeInput> documents) { this.documents = documents; }
    public void setJobType(String jobType) { this.jobType = jobType; }
    public void setParameter(VoiceParameterInput parameter) { this.parameter = parameter; }
    public void setScheduledStartTime(Object scheduledStartTime) { this.scheduledStartTime = scheduledStartTime; }
    public void setTrackingId(String trackingId) { this.trackingId = trackingId; }
  }
  public static class VoiceParameterInput {
    private String acknowledgeKey;
    private FileReferenceBaseInput actionMessage;
    private String repeatKey;
    private Integer scenarioId;
    private String sender;
    private Integer textToSpeechVoiceId;
    private Integer textToSpeechVoiceRate;
    private String transferKey;
    private String transferNumber;
  
    public VoiceParameterInput(Map<String, Object> args) {
      if (args != null) {
        this.acknowledgeKey = (String) args.get("acknowledgeKey");
        this.actionMessage = new FileReferenceBaseInput((Map<String, Object>) args.get("actionMessage"));
        this.repeatKey = (String) args.get("repeatKey");
        this.scenarioId = (Integer) args.get("scenarioId");
        this.sender = (String) args.get("sender");
        this.textToSpeechVoiceId = (Integer) args.get("textToSpeechVoiceId");
        this.textToSpeechVoiceRate = (Integer) args.get("textToSpeechVoiceRate");
        this.transferKey = (String) args.get("transferKey");
        this.transferNumber = (String) args.get("transferNumber");
      }
    }
  
    public String getAcknowledgeKey() { return this.acknowledgeKey; }
    public FileReferenceBaseInput getActionMessage() { return this.actionMessage; }
    public String getRepeatKey() { return this.repeatKey; }
    public Integer getScenarioId() { return this.scenarioId; }
    public String getSender() { return this.sender; }
    public Integer getTextToSpeechVoiceId() { return this.textToSpeechVoiceId; }
    public Integer getTextToSpeechVoiceRate() { return this.textToSpeechVoiceRate; }
    public String getTransferKey() { return this.transferKey; }
    public String getTransferNumber() { return this.transferNumber; }
    public void setAcknowledgeKey(String acknowledgeKey) { this.acknowledgeKey = acknowledgeKey; }
    public void setActionMessage(FileReferenceBaseInput actionMessage) { this.actionMessage = actionMessage; }
    public void setRepeatKey(String repeatKey) { this.repeatKey = repeatKey; }
    public void setScenarioId(Integer scenarioId) { this.scenarioId = scenarioId; }
    public void setSender(String sender) { this.sender = sender; }
    public void setTextToSpeechVoiceId(Integer textToSpeechVoiceId) { this.textToSpeechVoiceId = textToSpeechVoiceId; }
    public void setTextToSpeechVoiceRate(Integer textToSpeechVoiceRate) { this.textToSpeechVoiceRate = textToSpeechVoiceRate; }
    public void setTransferKey(String transferKey) { this.transferKey = transferKey; }
    public void setTransferNumber(String transferNumber) { this.transferNumber = transferNumber; }
  }
}
