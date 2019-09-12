package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanExchangeInputModelVoiceChannelManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanExchangeInputModel
 */
public class CRVoiceChannelManagementPlanExchangeInputModel   {
  private String advancedVoiceServicesManagementServicingSessionReference = null;

  private String voiceChannelManagementPlanInstanceReference = null;

  private Object voiceChannelManagementPlanExchangeActionTaskRecord = null;

  private CRVoiceChannelManagementPlanExchangeInputModelVoiceChannelManagementPlanExchangeActionRequest voiceChannelManagementPlanExchangeActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return voiceChannelManagementPlanExchangeActionTaskRecord
  **/

  public Object getVoiceChannelManagementPlanExchangeActionTaskRecord() {
    return voiceChannelManagementPlanExchangeActionTaskRecord;
  }

  public void setVoiceChannelManagementPlanExchangeActionTaskRecord(Object voiceChannelManagementPlanExchangeActionTaskRecord) {
    this.voiceChannelManagementPlanExchangeActionTaskRecord = voiceChannelManagementPlanExchangeActionTaskRecord;
  }


  /**
   * Get voiceChannelManagementPlanExchangeActionRequest
   * @return voiceChannelManagementPlanExchangeActionRequest
  **/

  public CRVoiceChannelManagementPlanExchangeInputModelVoiceChannelManagementPlanExchangeActionRequest getVoiceChannelManagementPlanExchangeActionRequest() {
    return voiceChannelManagementPlanExchangeActionRequest;
  }

  public void setVoiceChannelManagementPlanExchangeActionRequest(CRVoiceChannelManagementPlanExchangeInputModelVoiceChannelManagementPlanExchangeActionRequest voiceChannelManagementPlanExchangeActionRequest) {
    this.voiceChannelManagementPlanExchangeActionRequest = voiceChannelManagementPlanExchangeActionRequest;
  }


}

