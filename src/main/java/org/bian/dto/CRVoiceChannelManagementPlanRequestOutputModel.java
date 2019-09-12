package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRequestOutputModel
 */
public class CRVoiceChannelManagementPlanRequestOutputModel   {
  private String voiceChannelManagementPlanRequestActionTaskReference = null;

  private Object voiceChannelManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Management Plan instance request service call 
   * @return voiceChannelManagementPlanRequestActionTaskReference
  **/

  public String getVoiceChannelManagementPlanRequestActionTaskReference() {
    return voiceChannelManagementPlanRequestActionTaskReference;
  }

  public void setVoiceChannelManagementPlanRequestActionTaskReference(String voiceChannelManagementPlanRequestActionTaskReference) {
    this.voiceChannelManagementPlanRequestActionTaskReference = voiceChannelManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return voiceChannelManagementPlanRequestActionTaskRecord
  **/

  public Object getVoiceChannelManagementPlanRequestActionTaskRecord() {
    return voiceChannelManagementPlanRequestActionTaskRecord;
  }

  public void setVoiceChannelManagementPlanRequestActionTaskRecord(Object voiceChannelManagementPlanRequestActionTaskRecord) {
    this.voiceChannelManagementPlanRequestActionTaskRecord = voiceChannelManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

