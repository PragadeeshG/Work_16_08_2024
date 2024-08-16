package com.test1;

public class AzureCosmosEventGrid {
	private Integer cosmosSchemaCode;
	private Integer eventId;
	private Integer sequenceId;
	private String eventName;
	private String roleId;
	private Integer keyAttribute;
	private String eventType;
	private String approximateEventDuration;
	private String eventStatus;
	private String actualDuration;
	private String eventProjection;
	private String isScheduled;
	private String entityState;

	public AzureCosmosEventGrid() {

	}

	public AzureCosmosEventGrid(Integer cosmosSchemaCode, Integer eventId, Integer sequenceId, String eventName,
			String roleId, Integer keyAttribute, String eventType, String approximateEventDuration, String eventStatus,
			String actualDuration, String eventProjection, String isScheduled, String entityState) {
		super();
		this.cosmosSchemaCode = cosmosSchemaCode;
		this.eventId = eventId;
		this.sequenceId = sequenceId;
		this.eventName = eventName;
		this.roleId = roleId;
		this.keyAttribute = keyAttribute;
		this.eventType = eventType;
		this.approximateEventDuration = approximateEventDuration;
		this.eventStatus = eventStatus;
		this.actualDuration = actualDuration;
		this.eventProjection = eventProjection;
		this.isScheduled = isScheduled;
		this.entityState = entityState;
	}

	public Integer getCosmosSchemaCode() {
		return cosmosSchemaCode;
	}

	public void setCosmosSchemaCode(Integer cosmosSchemaCode) {
		this.cosmosSchemaCode = cosmosSchemaCode;
	}

	public Integer getEventId() {
		return eventId;
	}

	public void setEventId(Integer eventId) {
		this.eventId = eventId;
	}

	public Integer getSequenceId() {
		return sequenceId;
	}

	public void setSequenceId(Integer sequenceId) {
		this.sequenceId = sequenceId;
	}

	public String getEventName() {
		return eventName;
	}

	public void setEventName(String eventName) {
		this.eventName = eventName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public Integer getKeyAttribute() {
		return keyAttribute;
	}

	public void setKeyAttribute(Integer keyAttribute) {
		this.keyAttribute = keyAttribute;
	}

	public String getEventType() {
		return eventType;
	}

	public void setEventType(String eventType) {
		this.eventType = eventType;
	}

	public String getApproximateEventDuration() {
		return approximateEventDuration;
	}

	public void setApproximateEventDuration(String approximateEventDuration) {
		this.approximateEventDuration = approximateEventDuration;
	}

	public String getEventStatus() {
		return eventStatus;
	}

	public void setEventStatus(String eventStatus) {
		this.eventStatus = eventStatus;
	}

	public String getActualDuration() {
		return actualDuration;
	}

	public void setActualDuration(String actualDuration) {
		this.actualDuration = actualDuration;
	}

	public String getEventProjection() {
		return eventProjection;
	}

	public void setEventProjection(String eventProjection) {
		this.eventProjection = eventProjection;
	}

	public String getIsScheduled() {
		return isScheduled;
	}

	public void setIsScheduled(String isScheduled) {
		this.isScheduled = isScheduled;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
