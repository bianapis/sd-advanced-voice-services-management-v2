package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesUpdateInputModel
 */
public class BQMaintenanceAndUpgradesUpdateInputModel   {
  private String voiceChannelManagementPlanInstanceReference = null;

  private String maintenanceAndUpgradesInstanceReference = null;

  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;

  private Object maintenanceAndUpgradesUpdateActionTaskRecord = null;

  private String maintenanceAndUpgradesUpdateActionRequest = null;


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
   * Get maintenanceAndUpgradesInstanceRecord
   * @return maintenanceAndUpgradesInstanceRecord
  **/

  public BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord getMaintenanceAndUpgradesInstanceRecord() {
    return maintenanceAndUpgradesInstanceRecord;
  }

  public void setMaintenanceAndUpgradesInstanceRecord(BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord) {
    this.maintenanceAndUpgradesInstanceRecord = maintenanceAndUpgradesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceAndUpgradesUpdateActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradesUpdateActionTaskRecord() {
    return maintenanceAndUpgradesUpdateActionTaskRecord;
  }

  public void setMaintenanceAndUpgradesUpdateActionTaskRecord(Object maintenanceAndUpgradesUpdateActionTaskRecord) {
    this.maintenanceAndUpgradesUpdateActionTaskRecord = maintenanceAndUpgradesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return maintenanceAndUpgradesUpdateActionRequest
  **/

  public String getMaintenanceAndUpgradesUpdateActionRequest() {
    return maintenanceAndUpgradesUpdateActionRequest;
  }

  public void setMaintenanceAndUpgradesUpdateActionRequest(String maintenanceAndUpgradesUpdateActionRequest) {
    this.maintenanceAndUpgradesUpdateActionRequest = maintenanceAndUpgradesUpdateActionRequest;
  }


}

