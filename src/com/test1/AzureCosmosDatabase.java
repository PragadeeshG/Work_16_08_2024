package com.test1;

public class AzureCosmosDatabase {
	private Integer cosmosSchemaCode;
	private Integer masterSchemaEffective;
	private String masterSchemaEffectiveDate;
	private String masterSchemaSize;
	private String masterSchemaDbStat;
	private Integer userSchemaSize;
	private String userSchemaDbStat;
	private String dataConstraints;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public AzureCosmosDatabase() {

	}

	public AzureCosmosDatabase(Integer cosmosSchemaCode, Integer masterSchemaEffective,
			String masterSchemaEffectiveDate, String masterSchemaSize, String masterSchemaDbStat,
			Integer userSchemaSize, String userSchemaDbStat, String dataConstraints, String creationDate,
			String modifiedDate, String entityState) {
		super();
		this.cosmosSchemaCode = cosmosSchemaCode;
		this.masterSchemaEffective = masterSchemaEffective;
		this.masterSchemaEffectiveDate = masterSchemaEffectiveDate;
		this.masterSchemaSize = masterSchemaSize;
		this.masterSchemaDbStat = masterSchemaDbStat;
		this.userSchemaSize = userSchemaSize;
		this.userSchemaDbStat = userSchemaDbStat;
		this.dataConstraints = dataConstraints;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getCosmosSchemaCode() {
		return cosmosSchemaCode;
	}

	public void setCosmosSchemaCode(Integer cosmosSchemaCode) {
		this.cosmosSchemaCode = cosmosSchemaCode;
	}

	public Integer getMasterSchemaEffective() {
		return masterSchemaEffective;
	}

	public void setMasterSchemaEffective(Integer masterSchemaEffective) {
		this.masterSchemaEffective = masterSchemaEffective;
	}

	public String getMasterSchemaEffectiveDate() {
		return masterSchemaEffectiveDate;
	}

	public void setMasterSchemaEffectiveDate(String masterSchemaEffectiveDate) {
		this.masterSchemaEffectiveDate = masterSchemaEffectiveDate;
	}

	public String getMasterSchemaSize() {
		return masterSchemaSize;
	}

	public void setMasterSchemaSize(String masterSchemaSize) {
		this.masterSchemaSize = masterSchemaSize;
	}

	public String getMasterSchemaDbStat() {
		return masterSchemaDbStat;
	}

	public void setMasterSchemaDbStat(String masterSchemaDbStat) {
		this.masterSchemaDbStat = masterSchemaDbStat;
	}

	public Integer getUserSchemaSize() {
		return userSchemaSize;
	}

	public void setUserSchemaSize(Integer userSchemaSize) {
		this.userSchemaSize = userSchemaSize;
	}

	public String getUserSchemaDbStat() {
		return userSchemaDbStat;
	}

	public void setUserSchemaDbStat(String userSchemaDbStat) {
		this.userSchemaDbStat = userSchemaDbStat;
	}

	public String getDataConstraints() {
		return dataConstraints;
	}

	public void setDataConstraints(String dataConstraints) {
		this.dataConstraints = dataConstraints;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
