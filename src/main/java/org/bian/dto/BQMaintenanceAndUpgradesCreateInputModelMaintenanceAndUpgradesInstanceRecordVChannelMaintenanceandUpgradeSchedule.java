package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule
 */
public class BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule   {
  private String vChannelMaintenanceandUpgradeWorkTaskType = null;

  private String vChannelMaintenanceandUpgradeWorkTask = null;

  private String vChannelMaintenanceandUpgradeWorkTaskWorkProducts = null;

  private String vChannelMaintenanceandUpgradeWorkTaskDateTime = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of work task (e.g. scheduled maintenance, version release, platform upgrade) 
   * @return vChannelMaintenanceandUpgradeWorkTaskType
  **/

  public String getVChannelMaintenanceandUpgradeWorkTaskType() {
    return vChannelMaintenanceandUpgradeWorkTaskType;
  }

  public void setVChannelMaintenanceandUpgradeWorkTaskType(String vChannelMaintenanceandUpgradeWorkTaskType) {
    this.vChannelMaintenanceandUpgradeWorkTaskType = vChannelMaintenanceandUpgradeWorkTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The make-up of the channel platform task performed, includes work plan, assignments, effort/expenditures and deliverables as appropriate 
   * @return vChannelMaintenanceandUpgradeWorkTask
  **/

  public String getVChannelMaintenanceandUpgradeWorkTask() {
    return vChannelMaintenanceandUpgradeWorkTask;
  }

  public void setVChannelMaintenanceandUpgradeWorkTask(String vChannelMaintenanceandUpgradeWorkTask) {
    this.vChannelMaintenanceandUpgradeWorkTask = vChannelMaintenanceandUpgradeWorkTask;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: File of consolidated work notes, testing results, agreements etc. for the work task 
   * @return vChannelMaintenanceandUpgradeWorkTaskWorkProducts
  **/

  public String getVChannelMaintenanceandUpgradeWorkTaskWorkProducts() {
    return vChannelMaintenanceandUpgradeWorkTaskWorkProducts;
  }

  public void setVChannelMaintenanceandUpgradeWorkTaskWorkProducts(String vChannelMaintenanceandUpgradeWorkTaskWorkProducts) {
    this.vChannelMaintenanceandUpgradeWorkTaskWorkProducts = vChannelMaintenanceandUpgradeWorkTaskWorkProducts;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The key date-times associated with the work task (e.g. cutover date) 
   * @return vChannelMaintenanceandUpgradeWorkTaskDateTime
  **/

  public String getVChannelMaintenanceandUpgradeWorkTaskDateTime() {
    return vChannelMaintenanceandUpgradeWorkTaskDateTime;
  }

  public void setVChannelMaintenanceandUpgradeWorkTaskDateTime(String vChannelMaintenanceandUpgradeWorkTaskDateTime) {
    this.vChannelMaintenanceandUpgradeWorkTaskDateTime = vChannelMaintenanceandUpgradeWorkTaskDateTime;
  }


}

