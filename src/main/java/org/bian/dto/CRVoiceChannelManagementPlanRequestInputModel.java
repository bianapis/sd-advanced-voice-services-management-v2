package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRequestInputModel
 */
public class CRVoiceChannelManagementPlanRequestInputModel   {
  private String advancedVoiceServicesManagementServicingSessionReference = null;

  private String voiceChannelManagementPlanInstanceReference = null;

  private Object voiceChannelManagementPlanRequestActionTaskRecord = null;

  private CRVoiceChannelManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

