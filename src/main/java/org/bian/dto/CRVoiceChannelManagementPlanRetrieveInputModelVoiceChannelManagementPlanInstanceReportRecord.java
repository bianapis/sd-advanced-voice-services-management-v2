package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord
 */
public class CRVoiceChannelManagementPlanRetrieveInputModelVoiceChannelManagementPlanInstanceReportRecord   {
  private String voiceChannelManagementPlanInstanceReportReference = null;

  private String voiceChannelManagementPlanInstanceReportType = null;

  private String voiceChannelManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return voiceChannelManagementPlanInstanceReportReference
  **/

  public String getVoiceChannelManagementPlanInstanceReportReference() {
    return voiceChannelManagementPlanInstanceReportReference;
  }

  public void setVoiceChannelManagementPlanInstanceReportReference(String voiceChannelManagementPlanInstanceReportReference) {
    this.voiceChannelManagementPlanInstanceReportReference = voiceChannelManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return voiceChannelManagementPlanInstanceReportType
  **/

  public String getVoiceChannelManagementPlanInstanceReportType() {
    return voiceChannelManagementPlanInstanceReportType;
  }

  public void setVoiceChannelManagementPlanInstanceReportType(String voiceChannelManagementPlanInstanceReportType) {
    this.voiceChannelManagementPlanInstanceReportType = voiceChannelManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return voiceChannelManagementPlanInstanceReportParameters
  **/

  public String getVoiceChannelManagementPlanInstanceReportParameters() {
    return voiceChannelManagementPlanInstanceReportParameters;
  }

  public void setVoiceChannelManagementPlanInstanceReportParameters(String voiceChannelManagementPlanInstanceReportParameters) {
    this.voiceChannelManagementPlanInstanceReportParameters = voiceChannelManagementPlanInstanceReportParameters;
  }


}

