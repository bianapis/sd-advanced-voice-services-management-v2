package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanCreateInputModel
 */
public class CRVoiceChannelManagementPlanCreateInputModel   {
  private String advancedVoiceServicesManagementServicingSessionReference = null;

  private Object voiceChannelManagementPlanCreateActionRecord = null;

  private String voiceChannelManagementPlanInstanceStatus = null;

  private CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return advancedVoiceServicesManagementServicingSessionReference
  **/

  public String getAdvancedVoiceServicesManagementServicingSessionReference() {
    return advancedVoiceServicesManagementServicingSessionReference;
  }

  public void setAdvancedVoiceServicesManagementServicingSessionReference(String advancedVoiceServicesManagementServicingSessionReference) {
    this.advancedVoiceServicesManagementServicingSessionReference = advancedVoiceServicesManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return voiceChannelManagementPlanCreateActionRecord
  **/

  public Object getVoiceChannelManagementPlanCreateActionRecord() {
    return voiceChannelManagementPlanCreateActionRecord;
  }

  public void setVoiceChannelManagementPlanCreateActionRecord(Object voiceChannelManagementPlanCreateActionRecord) {
    this.voiceChannelManagementPlanCreateActionRecord = voiceChannelManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Voice Channel Management Plan instance (e.g. initialised, pending, active) 
   * @return voiceChannelManagementPlanInstanceStatus
  **/

  public String getVoiceChannelManagementPlanInstanceStatus() {
    return voiceChannelManagementPlanInstanceStatus;
  }

  public void setVoiceChannelManagementPlanInstanceStatus(String voiceChannelManagementPlanInstanceStatus) {
    this.voiceChannelManagementPlanInstanceStatus = voiceChannelManagementPlanInstanceStatus;
  }


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


}

