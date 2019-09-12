package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis
 */
public class BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis   {
  private Object maintenanceAndUpgradesInstanceAnalysisRecord = null;

  private String maintenanceAndUpgradesInstanceAnalysisReportType = null;

  private String maintenanceAndUpgradesInstanceAnalysisParameters = null;

  private Object maintenanceAndUpgradesInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return maintenanceAndUpgradesInstanceAnalysisRecord
  **/

  public Object getMaintenanceAndUpgradesInstanceAnalysisRecord() {
    return maintenanceAndUpgradesInstanceAnalysisRecord;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysisRecord(Object maintenanceAndUpgradesInstanceAnalysisRecord) {
    this.maintenanceAndUpgradesInstanceAnalysisRecord = maintenanceAndUpgradesInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return maintenanceAndUpgradesInstanceAnalysisReportType
  **/

  public String getMaintenanceAndUpgradesInstanceAnalysisReportType() {
    return maintenanceAndUpgradesInstanceAnalysisReportType;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysisReportType(String maintenanceAndUpgradesInstanceAnalysisReportType) {
    this.maintenanceAndUpgradesInstanceAnalysisReportType = maintenanceAndUpgradesInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return maintenanceAndUpgradesInstanceAnalysisParameters
  **/

  public String getMaintenanceAndUpgradesInstanceAnalysisParameters() {
    return maintenanceAndUpgradesInstanceAnalysisParameters;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysisParameters(String maintenanceAndUpgradesInstanceAnalysisParameters) {
    this.maintenanceAndUpgradesInstanceAnalysisParameters = maintenanceAndUpgradesInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return maintenanceAndUpgradesInstanceAnalysisReport
  **/

  public Object getMaintenanceAndUpgradesInstanceAnalysisReport() {
    return maintenanceAndUpgradesInstanceAnalysisReport;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysisReport(Object maintenanceAndUpgradesInstanceAnalysisReport) {
    this.maintenanceAndUpgradesInstanceAnalysisReport = maintenanceAndUpgradesInstanceAnalysisReport;
  }


}

