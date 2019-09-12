package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport
 */
public class BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport   {
  private Object maintenanceAndUpgradesInstanceReportRecord = null;

  private String maintenanceAndUpgradesInstanceReportType = null;

  private String maintenanceAndUpgradesInstanceReportParameters = null;

  private Object maintenanceAndUpgradesInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return maintenanceAndUpgradesInstanceReportRecord
  **/

  public Object getMaintenanceAndUpgradesInstanceReportRecord() {
    return maintenanceAndUpgradesInstanceReportRecord;
  }

  public void setMaintenanceAndUpgradesInstanceReportRecord(Object maintenanceAndUpgradesInstanceReportRecord) {
    this.maintenanceAndUpgradesInstanceReportRecord = maintenanceAndUpgradesInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return maintenanceAndUpgradesInstanceReportType
  **/

  public String getMaintenanceAndUpgradesInstanceReportType() {
    return maintenanceAndUpgradesInstanceReportType;
  }

  public void setMaintenanceAndUpgradesInstanceReportType(String maintenanceAndUpgradesInstanceReportType) {
    this.maintenanceAndUpgradesInstanceReportType = maintenanceAndUpgradesInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return maintenanceAndUpgradesInstanceReportParameters
  **/

  public String getMaintenanceAndUpgradesInstanceReportParameters() {
    return maintenanceAndUpgradesInstanceReportParameters;
  }

  public void setMaintenanceAndUpgradesInstanceReportParameters(String maintenanceAndUpgradesInstanceReportParameters) {
    this.maintenanceAndUpgradesInstanceReportParameters = maintenanceAndUpgradesInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return maintenanceAndUpgradesInstanceReport
  **/

  public Object getMaintenanceAndUpgradesInstanceReport() {
    return maintenanceAndUpgradesInstanceReport;
  }

  public void setMaintenanceAndUpgradesInstanceReport(Object maintenanceAndUpgradesInstanceReport) {
    this.maintenanceAndUpgradesInstanceReport = maintenanceAndUpgradesInstanceReport;
  }


}

