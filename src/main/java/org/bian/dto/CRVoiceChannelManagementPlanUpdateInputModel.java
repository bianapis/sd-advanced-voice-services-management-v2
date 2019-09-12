package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanUpdateInputModel
 */
public class CRVoiceChannelManagementPlanUpdateInputModel   {
  private String advancedVoiceServicesManagementServicingSessionReference = null;

  private String voiceChannelManagementPlanInstanceReference = null;

  private Object voiceChannelManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Voice Channel Management Plan instance 
   * @return voiceChannelManagementPlanInstanceReference
  **/

  public String getVoiceChannelManagementPlanInstanceReference() {
    return voiceChannelManagementPlanInstanceReference;
  }

  public void setVoiceChannelManagementPlanInstanceReference(String voiceChannelManagementPlanInstanceReference) {
    this.voiceChannelManagementPlanInstanceReference = voiceChannelManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return voiceChannelManagementPlanUpdateActionTaskRecord
  **/

  public Object getVoiceChannelManagementPlanUpdateActionTaskRecord() {
    return voiceChannelManagementPlanUpdateActionTaskRecord;
  }

  public void setVoiceChannelManagementPlanUpdateActionTaskRecord(Object voiceChannelManagementPlanUpdateActionTaskRecord) {
    this.voiceChannelManagementPlanUpdateActionTaskRecord = voiceChannelManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}

