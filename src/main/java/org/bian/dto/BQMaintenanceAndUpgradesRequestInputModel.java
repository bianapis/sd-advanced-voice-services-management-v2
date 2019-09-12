package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord;
import org.bian.dto.CRVoiceChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRequestInputModel
 */
public class BQMaintenanceAndUpgradesRequestInputModel   {
  private String voiceChannelManagementPlanInstanceReference = null;

  private String maintenanceAndUpgradesInstanceReference = null;

  private BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;

  private Object maintenanceAndUpgradesRequestActionTaskRecord = null;

  private CRVoiceChannelManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord getMaintenanceAndUpgradesInstanceRecord() {
    return maintenanceAndUpgradesInstanceRecord;
  }

  public void setMaintenanceAndUpgradesInstanceRecord(BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord) {
    this.maintenanceAndUpgradesInstanceRecord = maintenanceAndUpgradesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintenanceAndUpgradesRequestActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradesRequestActionTaskRecord() {
    return maintenanceAndUpgradesRequestActionTaskRecord;
  }

  public void setMaintenanceAndUpgradesRequestActionTaskRecord(Object maintenanceAndUpgradesRequestActionTaskRecord) {
    this.maintenanceAndUpgradesRequestActionTaskRecord = maintenanceAndUpgradesRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRVoiceChannelManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRVoiceChannelManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}

