package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis;
import org.bian.dto.CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveInputModel
 */
public class CRVoiceChannelManagementPlanRetrieveInputModel   {
  private Object voiceChannelManagementPlanRetrieveActionTaskRecord = null;

  private String voiceChannelManagementPlanRetrieveActionRequest = null;

  private CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord voiceChannelManagementPlanInstanceReportRecord = null;

  private CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis voiceChannelManagementPlanInstanceAnalysis = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return voiceChannelManagementPlanRetrieveActionRequest
  **/

  public String getVoiceChannelManagementPlanRetrieveActionRequest() {
    return voiceChannelManagementPlanRetrieveActionRequest;
  }

  public void setVoiceChannelManagementPlanRetrieveActionRequest(String voiceChannelManagementPlanRetrieveActionRequest) {
    this.voiceChannelManagementPlanRetrieveActionRequest = voiceChannelManagementPlanRetrieveActionRequest;
  }


  /**
   * Get voiceChannelManagementPlanInstanceReportRecord
   * @return voiceChannelManagementPlanInstanceReportRecord
  **/

  public CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord getVoiceChannelManagementPlanInstanceReportRecord() {
    return voiceChannelManagementPlanInstanceReportRecord;
  }

  public void setVoiceChannelManagementPlanInstanceReportRecord(CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord voiceChannelManagementPlanInstanceReportRecord) {
    this.voiceChannelManagementPlanInstanceReportRecord = voiceChannelManagementPlanInstanceReportRecord;
  }


  /**
   * Get voiceChannelManagementPlanInstanceAnalysis
   * @return voiceChannelManagementPlanInstanceAnalysis
  **/

  public CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis getVoiceChannelManagementPlanInstanceAnalysis() {
    return voiceChannelManagementPlanInstanceAnalysis;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysis(CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis voiceChannelManagementPlanInstanceAnalysis) {
    this.voiceChannelManagementPlanInstanceAnalysis = voiceChannelManagementPlanInstanceAnalysis;
  }


}

