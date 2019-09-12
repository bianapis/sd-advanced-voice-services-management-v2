package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport
 */
public class BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport   {
  private String maintenanceAndUpgradesInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return maintenanceAndUpgradesInstanceReportReference
  **/

  public String getMaintenanceAndUpgradesInstanceReportReference() {
    return maintenanceAndUpgradesInstanceReportReference;
  }

  public void setMaintenanceAndUpgradesInstanceReportReference(String maintenanceAndUpgradesInstanceReportReference) {
    this.maintenanceAndUpgradesInstanceReportReference = maintenanceAndUpgradesInstanceReportReference;
  }


}

