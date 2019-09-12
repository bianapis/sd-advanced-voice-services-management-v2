package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis
 */
public class CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceAnalysis   {
  private String voiceChannelManagementPlanInstanceAnalysisReference = null;

  private String voiceChannelManagementPlanInstanceAnalysisReportType = null;

  private String voiceChannelManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return voiceChannelManagementPlanInstanceAnalysisReference
  **/

  public String getVoiceChannelManagementPlanInstanceAnalysisReference() {
    return voiceChannelManagementPlanInstanceAnalysisReference;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysisReference(String voiceChannelManagementPlanInstanceAnalysisReference) {
    this.voiceChannelManagementPlanInstanceAnalysisReference = voiceChannelManagementPlanInstanceAnalysisReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return voiceChannelManagementPlanInstanceAnalysisParameters
  **/

  public String getVoiceChannelManagementPlanInstanceAnalysisParameters() {
    return voiceChannelManagementPlanInstanceAnalysisParameters;
  }

  public void setVoiceChannelManagementPlanInstanceAnalysisParameters(String voiceChannelManagementPlanInstanceAnalysisParameters) {
    this.voiceChannelManagementPlanInstanceAnalysisParameters = voiceChannelManagementPlanInstanceAnalysisParameters;
  }


}

