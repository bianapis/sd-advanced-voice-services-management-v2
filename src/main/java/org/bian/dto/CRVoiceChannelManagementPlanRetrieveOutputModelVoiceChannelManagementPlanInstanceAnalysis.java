package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis
 */
public class CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceAnalysis   {
  private String voiceChannelManagementPlanInstanceAnalysisData = null;

  private String voiceChannelManagementPlanInstanceAnalysisReportType = null;

  private Object voiceChannelManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return voiceChannelManagementPlanInstanceAnalysisData
  **/

  public String getVoiceChannelManagementPlanInstanceAnalysisData() {
    return voiceChannelManagementPlanInstanceAnalysisData;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysisData(String voiceChannelManagementPlanInstanceAnalysisData) {
    this.voiceChannelManagementPlanInstanceAnalysisData = voiceChannelManagementPlanInstanceAnalysisData;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return voiceChannelManagementPlanInstanceAnalysisReportType
  **/

  public String getVoiceChannelManagementPlanInstanceAnalysisReportType() {
    return voiceChannelManagementPlanInstanceAnalysisReportType;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysisReportType(String voiceChannelManagementPlanInstanceAnalysisReportType) {
    this.voiceChannelManagementPlanInstanceAnalysisReportType = voiceChannelManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return voiceChannelManagementPlanInstanceAnalysisReport
  **/

  public Object getVoiceChannelManagementPlanInstanceAnalysisReport() {
    return voiceChannelManagementPlanInstanceAnalysisReport;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysisReport(Object voiceChannelManagementPlanInstanceAnalysisReport) {
    this.voiceChannelManagementPlanInstanceAnalysisReport = voiceChannelManagementPlanInstanceAnalysisReport;
  }


}

