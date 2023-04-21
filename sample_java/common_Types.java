package sample_java;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

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
  
  
  public static class ApiUserBoolFilterInput {
    private ApiUserBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ApiUserBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiUserBoolFilterField) {
          this.field = (ApiUserBoolFilterField) args.get("field");
        } else {
          this.field = ApiUserBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiUserBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ApiUserBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiUserBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ApiUserDateFilterInput {
    private ApiUserDateFilterField field;
    private Object filterValue1;
    private Object filterValue2;
    private NumberFilterOperator operator;
  
    public ApiUserDateFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiUserDateFilterField) {
          this.field = (ApiUserDateFilterField) args.get("field");
        } else {
          this.field = ApiUserDateFilterField.valueOf((String) args.get("field"));
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
  
    public ApiUserDateFilterField getField() { return this.field; }
    public Object getFilterValue1() { return this.filterValue1; }
    public Object getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiUserDateFilterField field) { this.field = field; }
    public void setFilterValue1(Object filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Object filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiUserDateFilterField {
    CREATION_DATE,
    LAST_CONNECTION_DATE
    
  }
  
  public static class ApiUserInput {
    private Iterable<String> authorizedIPs;
    private String id;
    private Boolean isEnabled;
    private String name;
    private RoleInput role;
  
    public ApiUserInput(Map<String, Object> args) {
      if (args != null) {
        this.authorizedIPs = (Iterable<String>) args.get("authorizedIPs");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
        this.role = new RoleInput((Map<String, Object>) args.get("role"));
      }
    }
  
    public Iterable<String> getAuthorizedIPs() { return this.authorizedIPs; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public RoleInput getRole() { return this.role; }
    public void setAuthorizedIPs(Iterable<String> authorizedIPs) { this.authorizedIPs = authorizedIPs; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
    public void setRole(RoleInput role) { this.role = role; }
  }
  public enum ApiUserProfileFilterField {
    PROFILE
    
  }
  
  public static class ApiUserQueryParamsInput {
    private Iterable<ApiUserBoolFilterInput> boolFilters;
    private Iterable<ApiUserDateFilterInput> dateFilters;
    private Iterable<ApiUserUserProfileEnumFilterInput> profileFilters;
    private SortDirection sortDirection;
    private ApiUserSortField sortField;
    private Iterable<ApiUserStringFilterInput> stringFilters;
  
    public ApiUserQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ApiUserBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("dateFilters") != null) {
        		this.dateFilters = (Iterable<ApiUserDateFilterInput>) args.get("dateFilters");
        }
        if (args.get("profileFilters") != null) {
        		this.profileFilters = (Iterable<ApiUserUserProfileEnumFilterInput>) args.get("profileFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ApiUserSortField) {
          this.sortField = (ApiUserSortField) args.get("sortField");
        } else {
          this.sortField = ApiUserSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ApiUserStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ApiUserBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ApiUserDateFilterInput> getDateFilters() { return this.dateFilters; }
    public Iterable<ApiUserUserProfileEnumFilterInput> getProfileFilters() { return this.profileFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ApiUserSortField getSortField() { return this.sortField; }
    public Iterable<ApiUserStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ApiUserBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setDateFilters(Iterable<ApiUserDateFilterInput> dateFilters) { this.dateFilters = dateFilters; }
    public void setProfileFilters(Iterable<ApiUserUserProfileEnumFilterInput> profileFilters) { this.profileFilters = profileFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ApiUserSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ApiUserStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class ApiUserStringFilterInput {
    private ApiUserStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ApiUserStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiUserStringFilterField) {
          this.field = (ApiUserStringFilterField) args.get("field");
        } else {
          this.field = ApiUserStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiUserStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ApiUserStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ApiUserStringFilterField {
    CREATION_USER_ID,
    CREATION_USER_LABEL,
    DOMAIN_ID,
    ENVIRONMENT_ID,
    NAME,
    TENANT_ID
    
  }
  
  
  public static class ApiUserUserProfileEnumFilterInput {
    private ApiUserProfileFilterField field;
    private UserProfile filterValue1;
    private UserProfile filterValue2;
    private NumberFilterOperator operator;
  
    public ApiUserUserProfileEnumFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ApiUserProfileFilterField) {
          this.field = (ApiUserProfileFilterField) args.get("field");
        } else {
          this.field = ApiUserProfileFilterField.valueOf((String) args.get("field"));
        }
        if (args.get("filterValue1") instanceof UserProfile) {
          this.filterValue1 = (UserProfile) args.get("filterValue1");
        } else {
          this.filterValue1 = UserProfile.valueOf((String) args.get("filterValue1"));
        }
        if (args.get("filterValue2") instanceof UserProfile) {
          this.filterValue2 = (UserProfile) args.get("filterValue2");
        } else {
          this.filterValue2 = UserProfile.valueOf((String) args.get("filterValue2"));
        }
        if (args.get("operator") instanceof NumberFilterOperator) {
          this.operator = (NumberFilterOperator) args.get("operator");
        } else {
          this.operator = NumberFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ApiUserProfileFilterField getField() { return this.field; }
    public UserProfile getFilterValue1() { return this.filterValue1; }
    public UserProfile getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ApiUserProfileFilterField field) { this.field = field; }
    public void setFilterValue1(UserProfile filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(UserProfile filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
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
  public enum ChorusServerType {
    PROD,
    QUALIF
    
  }
  
  public static class CommonSchemaMutationAddApiUserArgs {
    private ApiUserInput item;
  
    public CommonSchemaMutationAddApiUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ApiUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ApiUserInput getItem() { return this.item; }
    public void setItem(ApiUserInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationAddDomainArgs {
    private DomainInput item;
  
    public CommonSchemaMutationAddDomainArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new DomainInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public DomainInput getItem() { return this.item; }
    public void setItem(DomainInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationAddEnvironmentArgs {
    private EnvironmentInput item;
  
    public CommonSchemaMutationAddEnvironmentArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new EnvironmentInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public EnvironmentInput getItem() { return this.item; }
    public void setItem(EnvironmentInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationAddProductArgs {
    private ProductInput item;
  
    public CommonSchemaMutationAddProductArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ProductInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ProductInput getItem() { return this.item; }
    public void setItem(ProductInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationAddProductInstallArgs {
    private ProductInstallInput item;
  
    public CommonSchemaMutationAddProductInstallArgs(Map<String, Object> args) {
      if (args != null) {
        this.item = new ProductInstallInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public ProductInstallInput getItem() { return this.item; }
    public void setItem(ProductInstallInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationAddTenantArgs {
    private String domainId;
    private TenantInput item;
  
    public CommonSchemaMutationAddTenantArgs(Map<String, Object> args) {
      if (args != null) {
        this.domainId = (String) args.get("domainId");
        this.item = new TenantInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getDomainId() { return this.domainId; }
    public TenantInput getItem() { return this.item; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setItem(TenantInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditApiUserArgs {
    private String id;
    private ApiUserInput item;
  
    public CommonSchemaMutationEditApiUserArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ApiUserInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ApiUserInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ApiUserInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditDomainArgs {
    private String id;
    private DomainInput item;
  
    public CommonSchemaMutationEditDomainArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new DomainInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public DomainInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(DomainInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditEnvironmentArgs {
    private String id;
    private EnvironmentInput item;
  
    public CommonSchemaMutationEditEnvironmentArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new EnvironmentInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public EnvironmentInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(EnvironmentInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditProductArgs {
    private String id;
    private ProductInput item;
  
    public CommonSchemaMutationEditProductArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ProductInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ProductInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ProductInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditProductInstallArgs {
    private String id;
    private ProductInstallInput item;
  
    public CommonSchemaMutationEditProductInstallArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.item = new ProductInstallInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getId() { return this.id; }
    public ProductInstallInput getItem() { return this.item; }
    public void setId(String id) { this.id = id; }
    public void setItem(ProductInstallInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationEditTenantArgs {
    private String domainId;
    private String id;
    private TenantInput item;
  
    public CommonSchemaMutationEditTenantArgs(Map<String, Object> args) {
      if (args != null) {
        this.domainId = (String) args.get("domainId");
        this.id = (String) args.get("id");
        this.item = new TenantInput((Map<String, Object>) args.get("item"));
      }
    }
  
    public String getDomainId() { return this.domainId; }
    public String getId() { return this.id; }
    public TenantInput getItem() { return this.item; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setId(String id) { this.id = id; }
    public void setItem(TenantInput item) { this.item = item; }
  }
  public static class CommonSchemaMutationRenewApiKeyArgs {
    private String id;
  
    public CommonSchemaMutationRenewApiKeyArgs(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
      }
    }
  
    public String getId() { return this.id; }
    public void setId(String id) { this.id = id; }
  }
  public static class CommonSchemaQueryApiUserItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryApiUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryApiUserListArgs {
    private String after;
    private ApiUserQueryParamsInput params;
  
    public CommonSchemaQueryApiUserListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ApiUserQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ApiUserQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ApiUserQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryConfigurationItemsArgs {
    private String environmentId;
    private Iterable<String> nameList;
  
    public CommonSchemaQueryConfigurationItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.environmentId = (String) args.get("environmentId");
        this.nameList = (Iterable<String>) args.get("nameList");
      }
    }
  
    public String getEnvironmentId() { return this.environmentId; }
    public Iterable<String> getNameList() { return this.nameList; }
    public void setEnvironmentId(String environmentId) { this.environmentId = environmentId; }
    public void setNameList(Iterable<String> nameList) { this.nameList = nameList; }
  }
  public static class CommonSchemaQueryDomainItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryDomainItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryDomainListArgs {
    private String after;
    private DomainQueryParamsInput params;
  
    public CommonSchemaQueryDomainListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new DomainQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public DomainQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(DomainQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryEnvironmentItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryEnvironmentItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryEnvironmentListArgs {
    private String after;
    private EnvironmentQueryParamsInput params;
  
    public CommonSchemaQueryEnvironmentListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new EnvironmentQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public EnvironmentQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(EnvironmentQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryOmsAccountInfoItemsArgs {
    private Iterable<Integer> idList;
  
    public CommonSchemaQueryOmsAccountInfoItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<Integer>) args.get("idList");
      }
    }
  
    public Iterable<Integer> getIdList() { return this.idList; }
    public void setIdList(Iterable<Integer> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryOmsAccountInfoListArgs {
    private String after;
    private OmsAccountInfoQueryParamsInput params;
  
    public CommonSchemaQueryOmsAccountInfoListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new OmsAccountInfoQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public OmsAccountInfoQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(OmsAccountInfoQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryProductInstallItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryProductInstallItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryProductInstallListArgs {
    private String after;
    private ProductInstallQueryParamsInput params;
  
    public CommonSchemaQueryProductInstallListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ProductInstallQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ProductInstallQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ProductInstallQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryProductItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryProductItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryProductListArgs {
    private String after;
    private ProductQueryParamsInput params;
  
    public CommonSchemaQueryProductListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.params = new ProductQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public ProductQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setParams(ProductQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryTenantItemsArgs {
    private String domainId;
    private Iterable<String> idList;
  
    public CommonSchemaQueryTenantItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.domainId = (String) args.get("domainId");
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public String getDomainId() { return this.domainId; }
    public Iterable<String> getIdList() { return this.idList; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  public static class CommonSchemaQueryTenantListArgs {
    private String after;
    private String domainId;
    private TenantQueryParamsInput params;
  
    public CommonSchemaQueryTenantListArgs(Map<String, Object> args) {
      if (args != null) {
        this.after = (String) args.get("after");
        this.domainId = (String) args.get("domainId");
        this.params = new TenantQueryParamsInput((Map<String, Object>) args.get("params"));
      }
    }
  
    public String getAfter() { return this.after; }
    public String getDomainId() { return this.domainId; }
    public TenantQueryParamsInput getParams() { return this.params; }
    public void setAfter(String after) { this.after = after; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setParams(TenantQueryParamsInput params) { this.params = params; }
  }
  public static class CommonSchemaQueryUserItemsArgs {
    private Iterable<String> idList;
  
    public CommonSchemaQueryUserItemsArgs(Map<String, Object> args) {
      if (args != null) {
        this.idList = (Iterable<String>) args.get("idList");
      }
    }
  
    public Iterable<String> getIdList() { return this.idList; }
    public void setIdList(Iterable<String> idList) { this.idList = idList; }
  }
  
  public static class DomainBoolFilterInput {
    private DomainBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public DomainBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DomainBoolFilterField) {
          this.field = (DomainBoolFilterField) args.get("field");
        } else {
          this.field = DomainBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DomainBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(DomainBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum DomainBoolFilterField {
    IS_ENABLED,
    IS_SUB_DOMAIN_ALLOWED
    
  }
  
  public static class DomainInput {
    private PostalAddressInput address;
    private Iterable<String> authorizedProductIds;
    private String email;
    private String environmentId;
    private String id;
    private Boolean isEnabled;
    private Boolean isSubDomainAllowed;
    private String name;
    private String parentDomainId;
    private String phone;
  
    public DomainInput(Map<String, Object> args) {
      if (args != null) {
        this.address = new PostalAddressInput((Map<String, Object>) args.get("address"));
        this.authorizedProductIds = (Iterable<String>) args.get("authorizedProductIds");
        this.email = (String) args.get("email");
        this.environmentId = (String) args.get("environmentId");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.isSubDomainAllowed = (Boolean) args.get("isSubDomainAllowed");
        this.name = (String) args.get("name");
        this.parentDomainId = (String) args.get("parentDomainId");
        this.phone = (String) args.get("phone");
      }
    }
  
    public PostalAddressInput getAddress() { return this.address; }
    public Iterable<String> getAuthorizedProductIds() { return this.authorizedProductIds; }
    public String getEmail() { return this.email; }
    public String getEnvironmentId() { return this.environmentId; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public Boolean getIsSubDomainAllowed() { return this.isSubDomainAllowed; }
    public String getName() { return this.name; }
    public String getParentDomainId() { return this.parentDomainId; }
    public String getPhone() { return this.phone; }
    public void setAddress(PostalAddressInput address) { this.address = address; }
    public void setAuthorizedProductIds(Iterable<String> authorizedProductIds) { this.authorizedProductIds = authorizedProductIds; }
    public void setEmail(String email) { this.email = email; }
    public void setEnvironmentId(String environmentId) { this.environmentId = environmentId; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setIsSubDomainAllowed(Boolean isSubDomainAllowed) { this.isSubDomainAllowed = isSubDomainAllowed; }
    public void setName(String name) { this.name = name; }
    public void setParentDomainId(String parentDomainId) { this.parentDomainId = parentDomainId; }
    public void setPhone(String phone) { this.phone = phone; }
  }
  public static class DomainQueryParamsInput {
    private Iterable<DomainBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private DomainSortField sortField;
    private Iterable<DomainStringFilterInput> stringFilters;
  
    public DomainQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<DomainBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof DomainSortField) {
          this.sortField = (DomainSortField) args.get("sortField");
        } else {
          this.sortField = DomainSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<DomainStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<DomainBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public DomainSortField getSortField() { return this.sortField; }
    public Iterable<DomainStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<DomainBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(DomainSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<DomainStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum DomainSortField {
    EMAIL,
    ENVIRONMENT_ID,
    IS_ENABLED,
    NAME,
    PARENT_DOMAIN_ID,
    PARENT_DOMAIN_NAME,
    PHONE
    
  }
  
  public static class DomainStringFilterInput {
    private DomainStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public DomainStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof DomainStringFilterField) {
          this.field = (DomainStringFilterField) args.get("field");
        } else {
          this.field = DomainStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public DomainStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(DomainStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  
  public static class EdcUserAccountInput {
    private String accountCodeDest;
    private Integer accountId;
    private Integer accountIdDest;
    private String gedSchema;
  
    public EdcUserAccountInput(Map<String, Object> args) {
      if (args != null) {
        this.accountCodeDest = (String) args.get("accountCodeDest");
        this.accountId = (Integer) args.get("accountId");
        this.accountIdDest = (Integer) args.get("accountIdDest");
        this.gedSchema = (String) args.get("gedSchema");
      }
    }
  
    public String getAccountCodeDest() { return this.accountCodeDest; }
    public Integer getAccountId() { return this.accountId; }
    public Integer getAccountIdDest() { return this.accountIdDest; }
    public String getGedSchema() { return this.gedSchema; }
    public void setAccountCodeDest(String accountCodeDest) { this.accountCodeDest = accountCodeDest; }
    public void setAccountId(Integer accountId) { this.accountId = accountId; }
    public void setAccountIdDest(Integer accountIdDest) { this.accountIdDest = accountIdDest; }
    public void setGedSchema(String gedSchema) { this.gedSchema = gedSchema; }
  }
  
  public static class EmailConfigInput {
    private String replyAddress;
    private String senderAddress;
    private String senderName;
  
    public EmailConfigInput(Map<String, Object> args) {
      if (args != null) {
        this.replyAddress = (String) args.get("replyAddress");
        this.senderAddress = (String) args.get("senderAddress");
        this.senderName = (String) args.get("senderName");
      }
    }
  
    public String getReplyAddress() { return this.replyAddress; }
    public String getSenderAddress() { return this.senderAddress; }
    public String getSenderName() { return this.senderName; }
    public void setReplyAddress(String replyAddress) { this.replyAddress = replyAddress; }
    public void setSenderAddress(String senderAddress) { this.senderAddress = senderAddress; }
    public void setSenderName(String senderName) { this.senderName = senderName; }
  }
  
  public static class EnvironmentBoolFilterInput {
    private EnvironmentBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public EnvironmentBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof EnvironmentBoolFilterField) {
          this.field = (EnvironmentBoolFilterField) args.get("field");
        } else {
          this.field = EnvironmentBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public EnvironmentBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(EnvironmentBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum EnvironmentBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class EnvironmentInput {
    private String id;
    private Boolean isEnabled;
    private String name;
  
    public EnvironmentInput(Map<String, Object> args) {
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
  public static class EnvironmentQueryParamsInput {
    private Iterable<EnvironmentBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private EnvironmentSortField sortField;
    private Iterable<EnvironmentStringFilterInput> stringFilters;
  
    public EnvironmentQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<EnvironmentBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof EnvironmentSortField) {
          this.sortField = (EnvironmentSortField) args.get("sortField");
        } else {
          this.sortField = EnvironmentSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<EnvironmentStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<EnvironmentBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public EnvironmentSortField getSortField() { return this.sortField; }
    public Iterable<EnvironmentStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<EnvironmentBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(EnvironmentSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<EnvironmentStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum EnvironmentSortField {
    IS_ENABLED,
    NAME
    
  }
  
  public static class EnvironmentStringFilterInput {
    private EnvironmentStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public EnvironmentStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof EnvironmentStringFilterField) {
          this.field = (EnvironmentStringFilterField) args.get("field");
        } else {
          this.field = EnvironmentStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public EnvironmentStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(EnvironmentStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum EnvironmentStringFilterField {
    NAME
    
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
  
  
  
  
  
  
  public static class OmsAccountInfoIntFilterInput {
    private OmsAccountInfoIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public OmsAccountInfoIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof OmsAccountInfoIntFilterField) {
          this.field = (OmsAccountInfoIntFilterField) args.get("field");
        } else {
          this.field = OmsAccountInfoIntFilterField.valueOf((String) args.get("field"));
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
  
    public OmsAccountInfoIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(OmsAccountInfoIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum OmsAccountInfoIntFilterField {
    BILLING_GROUP
    
  }
  
  public static class OmsAccountInfoQueryParamsInput {
    private Iterable<OmsAccountInfoIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private OmsAccountInfoSortField sortField;
    private Iterable<OmsAccountInfoStringFilterInput> stringFilters;
  
    public OmsAccountInfoQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<OmsAccountInfoIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof OmsAccountInfoSortField) {
          this.sortField = (OmsAccountInfoSortField) args.get("sortField");
        } else {
          this.sortField = OmsAccountInfoSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<OmsAccountInfoStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<OmsAccountInfoIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public OmsAccountInfoSortField getSortField() { return this.sortField; }
    public Iterable<OmsAccountInfoStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setIntFilters(Iterable<OmsAccountInfoIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(OmsAccountInfoSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<OmsAccountInfoStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum OmsAccountInfoSortField {
    BILLING_GROUP,
    CITY,
    COMPANY_NAME,
    COUNTRY,
    CUSTOMER_NUMBER,
    ZIP
    
  }
  
  public static class OmsAccountInfoStringFilterInput {
    private OmsAccountInfoStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public OmsAccountInfoStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof OmsAccountInfoStringFilterField) {
          this.field = (OmsAccountInfoStringFilterField) args.get("field");
        } else {
          this.field = OmsAccountInfoStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public OmsAccountInfoStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(OmsAccountInfoStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum OmsAccountInfoStringFilterField {
    COMPANY_NAME,
    CUSTOMER_NUMBER
    
  }
  
  
  
  public static class OmsUserAccountInput {
    private Integer customerNumber;
  
    public OmsUserAccountInput(Map<String, Object> args) {
      if (args != null) {
        this.customerNumber = (Integer) args.get("customerNumber");
      }
    }
  
    public Integer getCustomerNumber() { return this.customerNumber; }
    public void setCustomerNumber(Integer customerNumber) { this.customerNumber = customerNumber; }
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
  
  public static class PostalConfigurationInput {
    private Boolean isTestMode;
  
    public PostalConfigurationInput(Map<String, Object> args) {
      if (args != null) {
        this.isTestMode = (Boolean) args.get("isTestMode");
      }
    }
  
    public Boolean getIsTestMode() { return this.isTestMode; }
    public void setIsTestMode(Boolean isTestMode) { this.isTestMode = isTestMode; }
  }
  
  
  public static class ProductAccessInput {
    private String productInstallId;
  
    public ProductAccessInput(Map<String, Object> args) {
      if (args != null) {
        this.productInstallId = (String) args.get("productInstallId");
      }
    }
  
    public String getProductInstallId() { return this.productInstallId; }
    public void setProductInstallId(String productInstallId) { this.productInstallId = productInstallId; }
  }
  public static class ProductBoolFilterInput {
    private ProductBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ProductBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ProductBoolFilterField) {
          this.field = (ProductBoolFilterField) args.get("field");
        } else {
          this.field = ProductBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ProductBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ProductBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ProductBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ProductInput {
    private String id;
    private Boolean isEnabled;
    private String name;
    private Integer order;
  
    public ProductInput(Map<String, Object> args) {
      if (args != null) {
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
        this.order = (Integer) args.get("order");
      }
    }
  
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public Integer getOrder() { return this.order; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
    public void setOrder(Integer order) { this.order = order; }
  }
  
  public static class ProductInstallBoolFilterInput {
    private ProductInstallBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public ProductInstallBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ProductInstallBoolFilterField) {
          this.field = (ProductInstallBoolFilterField) args.get("field");
        } else {
          this.field = ProductInstallBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ProductInstallBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(ProductInstallBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum ProductInstallBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class ProductInstallInput {
    private String environmentId;
    private String id;
    private Boolean isEnabled;
    private String productId;
    private String url;
  
    public ProductInstallInput(Map<String, Object> args) {
      if (args != null) {
        this.environmentId = (String) args.get("environmentId");
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.productId = (String) args.get("productId");
        this.url = (String) args.get("url");
      }
    }
  
    public String getEnvironmentId() { return this.environmentId; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getProductId() { return this.productId; }
    public String getUrl() { return this.url; }
    public void setEnvironmentId(String environmentId) { this.environmentId = environmentId; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setProductId(String productId) { this.productId = productId; }
    public void setUrl(String url) { this.url = url; }
  }
  public static class ProductInstallQueryParamsInput {
    private Iterable<ProductInstallBoolFilterInput> boolFilters;
    private SortDirection sortDirection;
    private ProductInstallSortField sortField;
    private Iterable<ProductInstallStringFilterInput> stringFilters;
  
    public ProductInstallQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ProductInstallBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ProductInstallSortField) {
          this.sortField = (ProductInstallSortField) args.get("sortField");
        } else {
          this.sortField = ProductInstallSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ProductInstallStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ProductInstallBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ProductInstallSortField getSortField() { return this.sortField; }
    public Iterable<ProductInstallStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ProductInstallBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ProductInstallSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ProductInstallStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ProductInstallSortField {
    ENVIRONMENT_ID,
    IS_ENABLED,
    PRODUCT_ID,
    URL
    
  }
  
  public static class ProductInstallStringFilterInput {
    private ProductInstallStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ProductInstallStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ProductInstallStringFilterField) {
          this.field = (ProductInstallStringFilterField) args.get("field");
        } else {
          this.field = ProductInstallStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ProductInstallStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ProductInstallStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ProductInstallStringFilterField {
    ENVIRONMENT_ID,
    PRODUCT_ID,
    URL
    
  }
  
  
  public static class ProductIntFilterInput {
    private ProductIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public ProductIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ProductIntFilterField) {
          this.field = (ProductIntFilterField) args.get("field");
        } else {
          this.field = ProductIntFilterField.valueOf((String) args.get("field"));
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
  
    public ProductIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(ProductIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum ProductIntFilterField {
    ORDER
    
  }
  
  public static class ProductQueryParamsInput {
    private Iterable<ProductBoolFilterInput> boolFilters;
    private Iterable<ProductIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private ProductSortField sortField;
    private Iterable<ProductStringFilterInput> stringFilters;
  
    public ProductQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<ProductBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<ProductIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof ProductSortField) {
          this.sortField = (ProductSortField) args.get("sortField");
        } else {
          this.sortField = ProductSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<ProductStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<ProductBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<ProductIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public ProductSortField getSortField() { return this.sortField; }
    public Iterable<ProductStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<ProductBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setIntFilters(Iterable<ProductIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(ProductSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<ProductStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
  public enum ProductSortField {
    IS_ENABLED,
    NAME,
    ORDER
    
  }
  
  public static class ProductStringFilterInput {
    private ProductStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public ProductStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof ProductStringFilterField) {
          this.field = (ProductStringFilterField) args.get("field");
        } else {
          this.field = ProductStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public ProductStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(ProductStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
  public enum ProductStringFilterField {
    NAME
    
  }
  
  
  /** The application rights. */
  public enum RightType {
    ADD_ENVIRONMENT,
    ADD_TENANT,
    CANCEL_JOB_MESSAGE,
    CHANGE_ACTIVITY,
    CHANGE_CLICKED_LINK_DOCUMENT,
    CHANGE_CONFIGURATION,
    CHANGE_CONTACT,
    CHANGE_CONTACT_FUNCTION,
    CHANGE_DASHBOARD,
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
    GRANT_INTERNAL_RIGHT,
    GRANT_RIGHT,
    MARK_DOCUMENT_AS_READ,
    READ_ACTIVITY,
    READ_CLICKED_LINK_DOCUMENT,
    READ_CONFIGURATION,
    READ_CONTACT,
    READ_CONTACT_FUNCTION,
    READ_DASHBOARD,
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
  
  
  public static class RightValueInput {
    private RightType right;
    private Boolean value;
  
    public RightValueInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("right") instanceof RightType) {
          this.right = (RightType) args.get("right");
        } else {
          this.right = RightType.valueOf((String) args.get("right"));
        }
        this.value = (Boolean) args.get("value");
      }
    }
  
    public RightType getRight() { return this.right; }
    public Boolean getValue() { return this.value; }
    public void setRight(RightType right) { this.right = right; }
    public void setValue(Boolean value) { this.value = value; }
  }
  
  public static class RoleInput {
    private String domainId;
    private String environmentId;
    private Boolean isEnabled;
    private Iterable<ProductAccessInput> productAccesses;
    private UserProfile profile;
    private Iterable<RightValueInput> rights;
    private String tenantId;
  
    public RoleInput(Map<String, Object> args) {
      if (args != null) {
        this.domainId = (String) args.get("domainId");
        this.environmentId = (String) args.get("environmentId");
        this.isEnabled = (Boolean) args.get("isEnabled");
        if (args.get("productAccesses") != null) {
        		this.productAccesses = (Iterable<ProductAccessInput>) args.get("productAccesses");
        }
        if (args.get("profile") instanceof UserProfile) {
          this.profile = (UserProfile) args.get("profile");
        } else {
          this.profile = UserProfile.valueOf((String) args.get("profile"));
        }
        if (args.get("rights") != null) {
        		this.rights = (Iterable<RightValueInput>) args.get("rights");
        }
        this.tenantId = (String) args.get("tenantId");
      }
    }
  
    public String getDomainId() { return this.domainId; }
    public String getEnvironmentId() { return this.environmentId; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public Iterable<ProductAccessInput> getProductAccesses() { return this.productAccesses; }
    public UserProfile getProfile() { return this.profile; }
    public Iterable<RightValueInput> getRights() { return this.rights; }
    public String getTenantId() { return this.tenantId; }
    public void setDomainId(String domainId) { this.domainId = domainId; }
    public void setEnvironmentId(String environmentId) { this.environmentId = environmentId; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setProductAccesses(Iterable<ProductAccessInput> productAccesses) { this.productAccesses = productAccesses; }
    public void setProfile(UserProfile profile) { this.profile = profile; }
    public void setRights(Iterable<RightValueInput> rights) { this.rights = rights; }
    public void setTenantId(String tenantId) { this.tenantId = tenantId; }
  }
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
  
  
  public static class TenantBoolFilterInput {
    private TenantBoolFilterField field;
    private Boolean filterValue1;
    private BoolFilterOperator operator;
  
    public TenantBoolFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TenantBoolFilterField) {
          this.field = (TenantBoolFilterField) args.get("field");
        } else {
          this.field = TenantBoolFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (Boolean) args.get("filterValue1");
        if (args.get("operator") instanceof BoolFilterOperator) {
          this.operator = (BoolFilterOperator) args.get("operator");
        } else {
          this.operator = BoolFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TenantBoolFilterField getField() { return this.field; }
    public Boolean getFilterValue1() { return this.filterValue1; }
    public BoolFilterOperator getOperator() { return this.operator; }
    public void setField(TenantBoolFilterField field) { this.field = field; }
    public void setFilterValue1(Boolean filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(BoolFilterOperator operator) { this.operator = operator; }
  }
  public enum TenantBoolFilterField {
    IS_ENABLED
    
  }
  
  public static class TenantInput {
    private PostalAddressInput address;
    private Iterable<String> authorizedProductIds;
    private ChorusB2GConfigInput chorusB2GConfig;
    private EdcUserAccountInput edcServiceAccount;
    private String email;
    private EmailConfigInput emailConfig;
    private String id;
    private Boolean isEnabled;
    private String name;
    private OmsUserAccountInput omsServiceAccount;
    private String phone;
    private PostalConfigurationInput postalConfig;
  
    public TenantInput(Map<String, Object> args) {
      if (args != null) {
        this.address = new PostalAddressInput((Map<String, Object>) args.get("address"));
        this.authorizedProductIds = (Iterable<String>) args.get("authorizedProductIds");
        this.chorusB2GConfig = new ChorusB2GConfigInput((Map<String, Object>) args.get("chorusB2GConfig"));
        this.edcServiceAccount = new EdcUserAccountInput((Map<String, Object>) args.get("edcServiceAccount"));
        this.email = (String) args.get("email");
        this.emailConfig = new EmailConfigInput((Map<String, Object>) args.get("emailConfig"));
        this.id = (String) args.get("id");
        this.isEnabled = (Boolean) args.get("isEnabled");
        this.name = (String) args.get("name");
        this.omsServiceAccount = new OmsUserAccountInput((Map<String, Object>) args.get("omsServiceAccount"));
        this.phone = (String) args.get("phone");
        this.postalConfig = new PostalConfigurationInput((Map<String, Object>) args.get("postalConfig"));
      }
    }
  
    public PostalAddressInput getAddress() { return this.address; }
    public Iterable<String> getAuthorizedProductIds() { return this.authorizedProductIds; }
    public ChorusB2GConfigInput getChorusB2GConfig() { return this.chorusB2GConfig; }
    public EdcUserAccountInput getEdcServiceAccount() { return this.edcServiceAccount; }
    public String getEmail() { return this.email; }
    public EmailConfigInput getEmailConfig() { return this.emailConfig; }
    public String getId() { return this.id; }
    public Boolean getIsEnabled() { return this.isEnabled; }
    public String getName() { return this.name; }
    public OmsUserAccountInput getOmsServiceAccount() { return this.omsServiceAccount; }
    public String getPhone() { return this.phone; }
    public PostalConfigurationInput getPostalConfig() { return this.postalConfig; }
    public void setAddress(PostalAddressInput address) { this.address = address; }
    public void setAuthorizedProductIds(Iterable<String> authorizedProductIds) { this.authorizedProductIds = authorizedProductIds; }
    public void setChorusB2GConfig(ChorusB2GConfigInput chorusB2GConfig) { this.chorusB2GConfig = chorusB2GConfig; }
    public void setEdcServiceAccount(EdcUserAccountInput edcServiceAccount) { this.edcServiceAccount = edcServiceAccount; }
    public void setEmail(String email) { this.email = email; }
    public void setEmailConfig(EmailConfigInput emailConfig) { this.emailConfig = emailConfig; }
    public void setId(String id) { this.id = id; }
    public void setIsEnabled(Boolean isEnabled) { this.isEnabled = isEnabled; }
    public void setName(String name) { this.name = name; }
    public void setOmsServiceAccount(OmsUserAccountInput omsServiceAccount) { this.omsServiceAccount = omsServiceAccount; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setPostalConfig(PostalConfigurationInput postalConfig) { this.postalConfig = postalConfig; }
  }
  public static class TenantIntFilterInput {
    private TenantIntFilterField field;
    private Integer filterValue1;
    private Integer filterValue2;
    private NumberFilterOperator operator;
  
    public TenantIntFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TenantIntFilterField) {
          this.field = (TenantIntFilterField) args.get("field");
        } else {
          this.field = TenantIntFilterField.valueOf((String) args.get("field"));
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
  
    public TenantIntFilterField getField() { return this.field; }
    public Integer getFilterValue1() { return this.filterValue1; }
    public Integer getFilterValue2() { return this.filterValue2; }
    public NumberFilterOperator getOperator() { return this.operator; }
    public void setField(TenantIntFilterField field) { this.field = field; }
    public void setFilterValue1(Integer filterValue1) { this.filterValue1 = filterValue1; }
    public void setFilterValue2(Integer filterValue2) { this.filterValue2 = filterValue2; }
    public void setOperator(NumberFilterOperator operator) { this.operator = operator; }
  }
  public enum TenantIntFilterField {
    OMS_SERVICE_ACCOUNT_CUSTOMER_NUMBER
    
  }
  
  public static class TenantQueryParamsInput {
    private Iterable<TenantBoolFilterInput> boolFilters;
    private Iterable<TenantIntFilterInput> intFilters;
    private SortDirection sortDirection;
    private TenantSortField sortField;
    private Iterable<TenantStringFilterInput> stringFilters;
  
    public TenantQueryParamsInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("boolFilters") != null) {
        		this.boolFilters = (Iterable<TenantBoolFilterInput>) args.get("boolFilters");
        }
        if (args.get("intFilters") != null) {
        		this.intFilters = (Iterable<TenantIntFilterInput>) args.get("intFilters");
        }
        if (args.get("sortDirection") instanceof SortDirection) {
          this.sortDirection = (SortDirection) args.get("sortDirection");
        } else {
          this.sortDirection = SortDirection.valueOf((String) args.get("sortDirection"));
        }
        if (args.get("sortField") instanceof TenantSortField) {
          this.sortField = (TenantSortField) args.get("sortField");
        } else {
          this.sortField = TenantSortField.valueOf((String) args.get("sortField"));
        }
        if (args.get("stringFilters") != null) {
        		this.stringFilters = (Iterable<TenantStringFilterInput>) args.get("stringFilters");
        }
      }
    }
  
    public Iterable<TenantBoolFilterInput> getBoolFilters() { return this.boolFilters; }
    public Iterable<TenantIntFilterInput> getIntFilters() { return this.intFilters; }
    public SortDirection getSortDirection() { return this.sortDirection; }
    public TenantSortField getSortField() { return this.sortField; }
    public Iterable<TenantStringFilterInput> getStringFilters() { return this.stringFilters; }
    public void setBoolFilters(Iterable<TenantBoolFilterInput> boolFilters) { this.boolFilters = boolFilters; }
    public void setIntFilters(Iterable<TenantIntFilterInput> intFilters) { this.intFilters = intFilters; }
    public void setSortDirection(SortDirection sortDirection) { this.sortDirection = sortDirection; }
    public void setSortField(TenantSortField sortField) { this.sortField = sortField; }
    public void setStringFilters(Iterable<TenantStringFilterInput> stringFilters) { this.stringFilters = stringFilters; }
  }
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
  
  public static class TenantStringFilterInput {
    private TenantStringFilterField field;
    private String filterValue1;
    private StringFilterOperator operator;
  
    public TenantStringFilterInput(Map<String, Object> args) {
      if (args != null) {
        if (args.get("field") instanceof TenantStringFilterField) {
          this.field = (TenantStringFilterField) args.get("field");
        } else {
          this.field = TenantStringFilterField.valueOf((String) args.get("field"));
        }
        this.filterValue1 = (String) args.get("filterValue1");
        if (args.get("operator") instanceof StringFilterOperator) {
          this.operator = (StringFilterOperator) args.get("operator");
        } else {
          this.operator = StringFilterOperator.valueOf((String) args.get("operator"));
        }
      }
    }
  
    public TenantStringFilterField getField() { return this.field; }
    public String getFilterValue1() { return this.filterValue1; }
    public StringFilterOperator getOperator() { return this.operator; }
    public void setField(TenantStringFilterField field) { this.field = field; }
    public void setFilterValue1(String filterValue1) { this.filterValue1 = filterValue1; }
    public void setOperator(StringFilterOperator operator) { this.operator = operator; }
  }
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
  
  
  
  public enum UserProfile {
    ADMINISTRATOR,
    DOMAIN_ADMINISTRATOR,
    ENVIRONMENT_ADMINISTRATOR,
    STANDARD_USER,
    TENANT_RECEIVER,
    WEBSITE_ADMINISTRATOR
    
  }
  
}
