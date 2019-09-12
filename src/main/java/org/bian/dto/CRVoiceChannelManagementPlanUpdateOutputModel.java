package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanUpdateOutputModel
 */
public class CRVoiceChannelManagementPlanUpdateOutputModel   {
  private String voiceChannelManagementPlanUpdateActionTaskReference = null;

  private Object voiceChannelManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return voiceChannelManagementPlanUpdateActionTaskReference
  **/

  public String getVoiceChannelManagementPlanUpdateActionTaskReference() {
    return voiceChannelManagementPlanUpdateActionTaskReference;
  }

  public void setVoiceChannelManagementPlanUpdateActionTaskReference(String voiceChannelManagementPlanUpdateActionTaskReference) {
    this.voiceChannelManagementPlanUpdateActionTaskReference = voiceChannelManagementPlanUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

