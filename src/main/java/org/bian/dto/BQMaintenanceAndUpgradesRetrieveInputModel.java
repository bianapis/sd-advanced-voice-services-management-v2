package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceAnalysis;
import org.bian.dto.BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRetrieveInputModel
 */
public class BQMaintenanceAndUpgradesRetrieveInputModel   {
  private Object maintenanceAndUpgradesRetrieveActionTaskRecord = null;

  private String maintenanceAndUpgradesRetrieveActionRequest = null;

  private BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport maintenanceAndUpgradesInstanceReport = null;

  private BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceAnalysis maintenanceAndUpgradesInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return maintenanceAndUpgradesRetrieveActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradesRetrieveActionTaskRecord() {
    return maintenanceAndUpgradesRetrieveActionTaskRecord;
  }

  public void setMaintenanceAndUpgradesRetrieveActionTaskRecord(Object maintenanceAndUpgradesRetrieveActionTaskRecord) {
    this.maintenanceAndUpgradesRetrieveActionTaskRecord = maintenanceAndUpgradesRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return maintenanceAndUpgradesRetrieveActionRequest
  **/

  public String getMaintenanceAndUpgradesRetrieveActionRequest() {
    return maintenanceAndUpgradesRetrieveActionRequest;
  }

  public void setMaintenanceAndUpgradesRetrieveActionRequest(String maintenanceAndUpgradesRetrieveActionRequest) {
    this.maintenanceAndUpgradesRetrieveActionRequest = maintenanceAndUpgradesRetrieveActionRequest;
  }


  /**
   * Get maintenanceAndUpgradesInstanceReport
   * @return maintenanceAndUpgradesInstanceReport
  **/

  public BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport getMaintenanceAndUpgradesInstanceReport() {
    return maintenanceAndUpgradesInstanceReport;
  }

  public void setMaintenanceAndUpgradesInstanceReport(BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceReport maintenanceAndUpgradesInstanceReport) {
    this.maintenanceAndUpgradesInstanceReport = maintenanceAndUpgradesInstanceReport;
  }


  /**
   * Get maintenanceAndUpgradesInstanceAnalysis
   * @return maintenanceAndUpgradesInstanceAnalysis
  **/

  public BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceAnalysis getMaintenanceAndUpgradesInstanceAnalysis() {
    return maintenanceAndUpgradesInstanceAnalysis;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysis(BQMaintenanceAndUpgradesRetrieveInputModelMaintenanceAndUpgradesInstanceAnalysis maintenanceAndUpgradesInstanceAnalysis) {
    this.maintenanceAndUpgradesInstanceAnalysis = maintenanceAndUpgradesInstanceAnalysis;
  }


}

