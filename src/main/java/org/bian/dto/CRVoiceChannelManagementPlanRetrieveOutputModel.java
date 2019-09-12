package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord;
import org.bian.dto.CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis;
import org.bian.dto.CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveOutputModel
 */
public class CRVoiceChannelManagementPlanRetrieveOutputModel   {
  private CRVoiceChannelManagementPlanCreateOutputModelVoiceChannelManagementPlanInstanceRecord voiceChannelManagementPlanInstanceRecord = null;

  private String voiceChannelManagementPlanRetrieveActionTaskReference = null;

  private Object voiceChannelManagementPlanRetrieveActionTaskRecord = null;

  private String voiceChannelManagementPlanRetrieveActionResponse = null;

  private CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord voiceChannelManagementPlanInstanceReportRecord = null;

  private CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis voiceChannelManagementPlanInstanceAnalysis = null;


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


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Voice Channel Management Plan instance retrieve service call 
   * @return voiceChannelManagementPlanRetrieveActionTaskReference
  **/

  public String getVoiceChannelManagementPlanRetrieveActionTaskReference() {
    return voiceChannelManagementPlanRetrieveActionTaskReference;
  }

  public void setVoiceChannelManagementPlanRetrieveActionTaskReference(String voiceChannelManagementPlanRetrieveActionTaskReference) {
    this.voiceChannelManagementPlanRetrieveActionTaskReference = voiceChannelManagementPlanRetrieveActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return voiceChannelManagementPlanRetrieveActionTaskRecord
  **/

  public Object getVoiceChannelManagementPlanRetrieveActionTaskRecord() {
    return voiceChannelManagementPlanRetrieveActionTaskRecord;
  }

  public void setVoiceChannelManagementPlanRetrieveActionTaskRecord(Object voiceChannelManagementPlanRetrieveActionTaskRecord) {
    this.voiceChannelManagementPlanRetrieveActionTaskRecord = voiceChannelManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return voiceChannelManagementPlanRetrieveActionResponse
  **/

  public String getVoiceChannelManagementPlanRetrieveActionResponse() {
    return voiceChannelManagementPlanRetrieveActionResponse;
  }

  public void setVoiceChannelManagementPlanRetrieveActionResponse(String voiceChannelManagementPlanRetrieveActionResponse) {
    this.voiceChannelManagementPlanRetrieveActionResponse = voiceChannelManagementPlanRetrieveActionResponse;
  }


  /**
   * Get voiceChannelManagementPlanInstanceReportRecord
   * @return voiceChannelManagementPlanInstanceReportRecord
  **/

  public CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord getVoiceChannelManagementPlanInstanceReportRecord() {
    return voiceChannelManagementPlanInstanceReportRecord;
  }

  public void setVoiceChannelManagementPlanInstanceReportRecord(CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord voiceChannelManagementPlanInstanceReportRecord) {
    this.voiceChannelManagementPlanInstanceReportRecord = voiceChannelManagementPlanInstanceReportRecord;
  }


  /**
   * Get voiceChannelManagementPlanInstanceAnalysis
   * @return voiceChannelManagementPlanInstanceAnalysis
  **/

  public CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis getVoiceChannelManagementPlanInstanceAnalysis() {
    return voiceChannelManagementPlanInstanceAnalysis;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysis(CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis voiceChannelManagementPlanInstanceAnalysis) {
    this.voiceChannelManagementPlanInstanceAnalysis = voiceChannelManagementPlanInstanceAnalysis;
  }


}

