package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord;
import org.bian.dto.CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesCreateOutputModel
 */
public class BQMaintenanceAndUpgradesCreateOutputModel   {
  private CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord = null;

  private String maintenanceAndUpgradesInstanceReference = null;

  private String maintenanceAndUpgradesInitiateActionReference = null;

  private Object maintenanceAndUpgradesInitiateActionRecord = null;

  private String maintenanceAndUpgradesInstanceStatus = null;

  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;


  /**
   * Get voiceChannelManagementPlanInstanceRecord
   * @return voiceChannelManagementPlanInstanceRecord
  **/

  public CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord getVoiceChannelManagementPlanInstanceRecord() {
    return voiceChannelManagementPlanInstanceRecord;
  }

  public void setVoiceChannelManagementPlanInstanceRecord(CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord) {
    this.voiceChannelManagementPlanInstanceRecord = voiceChannelManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance And Upgrades instance 
   * @return maintenanceAndUpgradesInstanceReference
  **/

  public String getMaintenanceAndUpgradesInstanceReference() {
    return maintenanceAndUpgradesInstanceReference;
  }

  public void setMaintenanceAndUpgradesInstanceReference(String maintenanceAndUpgradesInstanceReference) {
    this.maintenanceAndUpgradesInstanceReference = maintenanceAndUpgradesInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return maintenanceAndUpgradesInitiateActionReference
  **/

  public String getMaintenanceAndUpgradesInitiateActionReference() {
    return maintenanceAndUpgradesInitiateActionReference;
  }

  public void setMaintenanceAndUpgradesInitiateActionReference(String maintenanceAndUpgradesInitiateActionReference) {
    this.maintenanceAndUpgradesInitiateActionReference = maintenanceAndUpgradesInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return maintenanceAndUpgradesInitiateActionRecord
  **/

  public Object getMaintenanceAndUpgradesInitiateActionRecord() {
    return maintenanceAndUpgradesInitiateActionRecord;
  }

  public void setMaintenanceAndUpgradesInitiateActionRecord(Object maintenanceAndUpgradesInitiateActionRecord) {
    this.maintenanceAndUpgradesInitiateActionRecord = maintenanceAndUpgradesInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Maintenance And Upgrades instance (e.g. initialised, pending, active) 
   * @return maintenanceAndUpgradesInstanceStatus
  **/

  public String getMaintenanceAndUpgradesInstanceStatus() {
    return maintenanceAndUpgradesInstanceStatus;
  }

  public void setMaintenanceAndUpgradesInstanceStatus(String maintenanceAndUpgradesInstanceStatus) {
    this.maintenanceAndUpgradesInstanceStatus = maintenanceAndUpgradesInstanceStatus;
  }


  /**
   * Get maintenanceAndUpgradesInstanceRecord
   * @return maintenanceAndUpgradesInstanceRecord
  **/

  public BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord getMaintenanceAndUpgradesInstanceRecord() {
    return maintenanceAndUpgradesInstanceRecord;
  }

  public void setMaintenanceAndUpgradesInstanceRecord(BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord) {
    this.maintenanceAndUpgradesInstanceRecord = maintenanceAndUpgradesInstanceRecord;
  }


}

