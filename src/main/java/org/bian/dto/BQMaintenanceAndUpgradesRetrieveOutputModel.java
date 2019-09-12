package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord;
import org.bian.dto.BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis;
import org.bian.dto.BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRetrieveOutputModel
 */
public class BQMaintenanceAndUpgradesRetrieveOutputModel   {
  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;

  private String maintenanceAndUpgradesRetrieveActionTaskReference = null;

  private Object maintenanceAndUpgradesRetrieveActionTaskRecord = null;

  private String maintenanceAndUpgradesRetrieveActionResponse = null;

  private BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport maintenanceAndUpgradesInstanceReport = null;

  private BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis maintenanceAndUpgradesInstanceAnalysis = null;


  /**
   * Get maintenanceAndUpgradesInstanceRecord
   * @return maintenanceAndUpgradesInstanceRecord
  **/

  public BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord getMaintenanceAndUpgradesInstanceRecord() {
    return maintenanceAndUpgradesInstanceRecord;
  }

  public void setMaintenanceAndUpgradesInstanceRecord(BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord) {
    this.maintenanceAndUpgradesInstanceRecord = maintenanceAndUpgradesInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance And Upgrades instance retrieve service call 
   * @return maintenanceAndUpgradesRetrieveActionTaskReference
  **/

  public String getMaintenanceAndUpgradesRetrieveActionTaskReference() {
    return maintenanceAndUpgradesRetrieveActionTaskReference;
  }

  public void setMaintenanceAndUpgradesRetrieveActionTaskReference(String maintenanceAndUpgradesRetrieveActionTaskReference) {
    this.maintenanceAndUpgradesRetrieveActionTaskReference = maintenanceAndUpgradesRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return maintenanceAndUpgradesRetrieveActionResponse
  **/

  public String getMaintenanceAndUpgradesRetrieveActionResponse() {
    return maintenanceAndUpgradesRetrieveActionResponse;
  }

  public void setMaintenanceAndUpgradesRetrieveActionResponse(String maintenanceAndUpgradesRetrieveActionResponse) {
    this.maintenanceAndUpgradesRetrieveActionResponse = maintenanceAndUpgradesRetrieveActionResponse;
  }


  /**
   * Get maintenanceAndUpgradesInstanceReport
   * @return maintenanceAndUpgradesInstanceReport
  **/

  public BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport getMaintenanceAndUpgradesInstanceReport() {
    return maintenanceAndUpgradesInstanceReport;
  }

  public void setMaintenanceAndUpgradesInstanceReport(BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceReport maintenanceAndUpgradesInstanceReport) {
    this.maintenanceAndUpgradesInstanceReport = maintenanceAndUpgradesInstanceReport;
  }


  /**
   * Get maintenanceAndUpgradesInstanceAnalysis
   * @return maintenanceAndUpgradesInstanceAnalysis
  **/

  public BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis getMaintenanceAndUpgradesInstanceAnalysis() {
    return maintenanceAndUpgradesInstanceAnalysis;
  }

  public void setMaintenanceAndUpgradesInstanceAnalysis(BQMaintenanceAndUpgradesRetrieveOutputModelMaintenanceAndUpgradesInstanceAnalysis maintenanceAndUpgradesInstanceAnalysis) {
    this.maintenanceAndUpgradesInstanceAnalysis = maintenanceAndUpgradesInstanceAnalysis;
  }


}

