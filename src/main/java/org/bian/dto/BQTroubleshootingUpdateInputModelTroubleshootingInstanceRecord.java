package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord
 */
public class BQTroubleshootingUpdateInputModelTroubleshootingInstanceRecord   {
  private Object vChannelProductionIssueRecord = null;

  private String vChannelIssueAnalysisAndRecommendedResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: A record of any production issues arising during the session (see Advanced Voice Channel Operations for detailed content) 
   * @return vChannelProductionIssueRecord
  **/

  @JsonProperty("vChannelProductionIssueRecord")
  public Object getVChannelProductionIssueRecord() {
    return vChannelProductionIssueRecord;
  }

  public void setVChannelProductionIssueRecord(Object vChannelProductionIssueRecord) {
    this.vChannelProductionIssueRecord = vChannelProductionIssueRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A record of the root cause analysis for recurring issues and suggested remedial action 
   * @return vChannelIssueAnalysisAndRecommendedResponse
  **/

  @JsonProperty("vChannelIssueAnalysisAndRecommendedResponse")
  public String getVChannelIssueAnalysisAndRecommendedResponse() {
    return vChannelIssueAnalysisAndRecommendedResponse;
  }

  public void setVChannelIssueAnalysisAndRecommendedResponse(String vChannelIssueAnalysisAndRecommendedResponse) {
    this.vChannelIssueAnalysisAndRecommendedResponse = vChannelIssueAnalysisAndRecommendedResponse;
  }


}

