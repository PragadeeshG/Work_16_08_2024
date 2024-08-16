package com.test1;

public class AzureCosmosAppService {
	private Integer cosmosSchemaCode;
	private Integer dataDictionary;
	private Integer numberOfInstances;
	private String metadata;
	private Integer queryPlan;
	private boolean optimizable;
	private boolean performanceTunable;
	private String serviceName;
	private String serviceCode;
	private String dataEngine;
	private String underlyingMachine;
	private String jvmId;
	private String hardwaresApplicable;
	private String enterpriseSystem;

	public AzureCosmosAppService() {

	}

	public AzureCosmosAppService(Integer cosmosSchemaCode, Integer dataDictionary, Integer numberOfInstances,
			String metadata, Integer queryPlan, boolean optimizable, boolean performanceTunable, String serviceName,
			String serviceCode, String dataEngine, String underlyingMachine, String jvmId, String hardwaresApplicable,
			String enterpriseSystem) {
		super();
		this.cosmosSchemaCode = cosmosSchemaCode;
		this.dataDictionary = dataDictionary;
		this.numberOfInstances = numberOfInstances;
		this.metadata = metadata;
		this.queryPlan = queryPlan;
		this.optimizable = optimizable;
		this.performanceTunable = performanceTunable;
		this.serviceName = serviceName;
		this.serviceCode = serviceCode;
		this.dataEngine = dataEngine;
		this.underlyingMachine = underlyingMachine;
		this.jvmId = jvmId;
		this.hardwaresApplicable = hardwaresApplicable;
		this.enterpriseSystem = enterpriseSystem;
	}

	public Integer getCosmosSchemaCode() {
		return cosmosSchemaCode;
	}

	public void setCosmosSchemaCode(Integer cosmosSchemaCode) {
		this.cosmosSchemaCode = cosmosSchemaCode;
	}

	public Integer getDataDictionary() {
		return dataDictionary;
	}

	public void setDataDictionary(Integer dataDictionary) {
		this.dataDictionary = dataDictionary;
	}

	public Integer getNumberOfInstances() {
		return numberOfInstances;
	}

	public void setNumberOfInstances(Integer numberOfInstances) {
		this.numberOfInstances = numberOfInstances;
	}

	public String getMetadata() {
		return metadata;
	}

	public void setMetadata(String metadata) {
		this.metadata = metadata;
	}

	public Integer getQueryPlan() {
		return queryPlan;
	}

	public void setQueryPlan(Integer queryPlan) {
		this.queryPlan = queryPlan;
	}

	public boolean isOptimizable() {
		return optimizable;
	}

	public void setOptimizable(boolean optimizable) {
		this.optimizable = optimizable;
	}

	public boolean isPerformanceTunable() {
		return performanceTunable;
	}

	public void setPerformanceTunable(boolean performanceTunable) {
		this.performanceTunable = performanceTunable;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceCode() {
		return serviceCode;
	}

	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}

	public String getDataEngine() {
		return dataEngine;
	}

	public void setDataEngine(String dataEngine) {
		this.dataEngine = dataEngine;
	}

	public String getUnderlyingMachine() {
		return underlyingMachine;
	}

	public void setUnderlyingMachine(String underlyingMachine) {
		this.underlyingMachine = underlyingMachine;
	}

	public String getJvmId() {
		return jvmId;
	}

	public void setJvmId(String jvmId) {
		this.jvmId = jvmId;
	}

	public String getHardwaresApplicable() {
		return hardwaresApplicable;
	}

	public void setHardwaresApplicable(String hardwaresApplicable) {
		this.hardwaresApplicable = hardwaresApplicable;
	}

	public String getEnterpriseSystem() {
		return enterpriseSystem;
	}

	public void setEnterpriseSystem(String enterpriseSystem) {
		this.enterpriseSystem = enterpriseSystem;
	}

}
