package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord
 */
public class CRVoiceChannelManagementPlanRetrieveOutputModelVoiceChannelManagementPlanInstanceReportRecord   {
  private String voiceChannelManagementPlanInstanceReportData = null;

  private String voiceChannelManagementPlanInstanceReportType = null;

  private Object voiceChannelManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return voiceChannelManagementPlanInstanceReportData
  **/

  public String getVoiceChannelManagementPlanInstanceReportData() {
    return voiceChannelManagementPlanInstanceReportData;
  }

  public void setVoiceChannelManagementPlanInstanceReportData(String voiceChannelManagementPlanInstanceReportData) {
    this.voiceChannelManagementPlanInstanceReportData = voiceChannelManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return voiceChannelManagementPlanInstanceReport
  **/

  public Object getVoiceChannelManagementPlanInstanceReport() {
    return voiceChannelManagementPlanInstanceReport;
  }

  public void setVoiceChannelManagementPlanInstanceReport(Object voiceChannelManagementPlanInstanceReport) {
    this.voiceChannelManagementPlanInstanceReport = voiceChannelManagementPlanInstanceReport;
  }


}

