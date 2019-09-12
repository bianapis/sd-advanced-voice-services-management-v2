package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanExchangeOutputModel
 */
public class CRVoiceChannelManagementPlanExchangeOutputModel   {
  private String voiceChannelManagementPlanExchangeActionTaskReference = null;

  private Object voiceChannelManagementPlanExchangeActionTaskRecord = null;

  private String voiceChannelManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Management Plan instance exchange service call 
   * @return voiceChannelManagementPlanExchangeActionTaskReference
  **/

  public String getVoiceChannelManagementPlanExchangeActionTaskReference() {
    return voiceChannelManagementPlanExchangeActionTaskReference;
  }

  public void setVoiceChannelManagementPlanExchangeActionTaskReference(String voiceChannelManagementPlanExchangeActionTaskReference) {
    this.voiceChannelManagementPlanExchangeActionTaskReference = voiceChannelManagementPlanExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return voiceChannelManagementPlanExchangeActionResponse
  **/

  public String getVoiceChannelManagementPlanExchangeActionResponse() {
    return voiceChannelManagementPlanExchangeActionResponse;
  }

  public void setVoiceChannelManagementPlanExchangeActionResponse(String voiceChannelManagementPlanExchangeActionResponse) {
    this.voiceChannelManagementPlanExchangeActionResponse = voiceChannelManagementPlanExchangeActionResponse;
  }


}

