package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord
 */
public class CRVoiceChannelManagementPlanCreateInputModelVoiceChannelManagementPlanInstanceRecord   {
  private String vChannelManagementPlanPeriod = null;

  private String vChannelServicePerformanceGoals = null;

  private String vChannelServiceSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The time period addressed by the management plan 
   * @return vChannelManagementPlanPeriod
  **/

  @JsonProperty("vChannelManagementPlanPeriod")
  public String getVChannelManagementPlanPeriod() {
    return vChannelManagementPlanPeriod;
  }

  public void setVChannelManagementPlanPeriod(String vChannelManagementPlanPeriod) {
    this.vChannelManagementPlanPeriod = vChannelManagementPlanPeriod;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The Target and actual service performance goals that are tracked by channel management 
   * @return vChannelServicePerformanceGoals
  **/

  @JsonProperty("vChannelServicePerformanceGoals")
  public String getVChannelServicePerformanceGoals() {
    return vChannelServicePerformanceGoals;
  }

  public void setVChannelServicePerformanceGoals(String vChannelServicePerformanceGoals) {
    this.vChannelServicePerformanceGoals = vChannelServicePerformanceGoals;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual channel service schedule - recording planned and actual service availability and outages (includes any partial service access constraints or restrictions for a 24/7 service)  
   * @return vChannelServiceSchedule
  **/

  @JsonProperty("vChannelServiceSchedule")
  public String getVChannelServiceSchedule() {
    return vChannelServiceSchedule;
  }

  public void setVChannelServiceSchedule(String vChannelServiceSchedule) {
    this.vChannelServiceSchedule = vChannelServiceSchedule;
  }


}

