package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord
 */
public class BQCapacityPlanningUpdateInputModelCapacityPlanningInstanceRecord   {
  private String vChannelPlatformUtilization = null;

  private String vChannelLoadingProjections = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Record of the channel resource utilization and loading 
   * @return vChannelPlatformUtilization
  **/

  @JsonProperty("vChannelPlatformUtilization")
  public String getVChannelPlatformUtilization() {
    return vChannelPlatformUtilization;
  }

  public void setVChannelPlatformUtilization(String vChannelPlatformUtilization) {
    this.vChannelPlatformUtilization = vChannelPlatformUtilization;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Estimated projected resource utilization and loading based on historical patterns and anticipated activity - used to identify the need for capacity upgrades 
   * @return vChannelLoadingProjections
  **/

  @JsonProperty("vChannelLoadingProjections")
  public String getVChannelLoadingProjections() {
    return vChannelLoadingProjections;
  }

  public void setVChannelLoadingProjections(String vChannelLoadingProjections) {
    this.vChannelLoadingProjections = vChannelLoadingProjections;
  }


}

