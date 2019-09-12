package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanCreateOutputModel
 */
public class CRVoiceChannelManagementPlanCreateOutputModel   {
  private String voiceChannelManagementPlanInstanceReference = null;

  private String voiceChannelManagementPlanCreateActionReference = null;

  private Object voiceChannelManagementPlanCreateActionRecord = null;

  private String voiceChannelManagementPlanInstanceStatus = null;

  private CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return voiceChannelManagementPlanCreateActionReference
  **/

  public String getVoiceChannelManagementPlanCreateActionReference() {
    return voiceChannelManagementPlanCreateActionReference;
  }

  public void setVoiceChannelManagementPlanCreateActionReference(String voiceChannelManagementPlanCreateActionReference) {
    this.voiceChannelManagementPlanCreateActionReference = voiceChannelManagementPlanCreateActionReference;
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

  public CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord getVoiceChannelManagementPlanInstanceRecord() {
    return voiceChannelManagementPlanInstanceRecord;
  }

  public void setVoiceChannelManagementPlanInstanceRecord(CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord) {
    this.voiceChannelManagementPlanInstanceRecord = voiceChannelManagementPlanInstanceRecord;
  }


}

