package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord;
import org.bian.dto.CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesCreateInputModel
 */
public class BQMaintenanceAndUpgradesCreateInputModel   {
  private CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord = null;

  private String voiceChannelManagementPlanInstanceReference = null;

  private Object maintenanceAndUpgradesInitiateActionRecord = null;

  private BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;


  /**
   * Get voiceChannelManagementPlanInstanceRecord
   * @return voiceChannelManagementPlanInstanceRecord
  **/

  public CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord getVoiceChannelManagementPlanInstanceRecord() {
    return voiceChannelManagementPlanInstanceRecord;
  }

  public void setVoiceChannelManagementPlanInstanceRecord(CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord) {
    this.voiceChannelManagementPlanInstanceRecord = voiceChannelManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Voice Channel Management Plan instance 
   * @return voiceChannelManagementPlanInstanceReference
  **/

  public String getVoiceChannelManagementPlanInstanceReference() {
    return voiceChannelManagementPlanInstanceReference;
  }

  public void setVoiceChannelManagementPlanInstanceReference(String voiceChannelManagementPlanInstanceReference) {
    this.voiceChannelManagementPlanInstanceReference = voiceChannelManagementPlanInstanceReference;
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
   * Get maintenanceAndUpgradesInstanceRecord
   * @return maintenanceAndUpgradesInstanceRecord
  **/

  public BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord getMaintenanceAndUpgradesInstanceRecord() {
    return maintenanceAndUpgradesInstanceRecord;
  }

  public void setMaintenanceAndUpgradesInstanceRecord(BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord) {
    this.maintenanceAndUpgradesInstanceRecord = maintenanceAndUpgradesInstanceRecord;
  }


}

