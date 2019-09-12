package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesRequestOutputModel
 */
public class BQMaintenanceAndUpgradesRequestOutputModel   {
  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;

  private String maintenanceAndUpgradesRequestActionTaskReference = null;

  private Object maintenanceAndUpgradesRequestActionTaskRecord = null;

  private String maintenanceAndUpgradesRequestRecordReference = null;

  private Object requestResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Maintenance And Upgrades instance request service call 
   * @return maintenanceAndUpgradesRequestActionTaskReference
  **/

  public String getMaintenanceAndUpgradesRequestActionTaskReference() {
    return maintenanceAndUpgradesRequestActionTaskReference;
  }

  public void setMaintenanceAndUpgradesRequestActionTaskReference(String maintenanceAndUpgradesRequestActionTaskReference) {
    this.maintenanceAndUpgradesRequestActionTaskReference = maintenanceAndUpgradesRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return maintenanceAndUpgradesRequestActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradesRequestActionTaskRecord() {
    return maintenanceAndUpgradesRequestActionTaskRecord;
  }

  public void setMaintenanceAndUpgradesRequestActionTaskRecord(Object maintenanceAndUpgradesRequestActionTaskRecord) {
    this.maintenanceAndUpgradesRequestActionTaskRecord = maintenanceAndUpgradesRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Maintenance And Upgrades service request record 
   * @return maintenanceAndUpgradesRequestRecordReference
  **/

  public String getMaintenanceAndUpgradesRequestRecordReference() {
    return maintenanceAndUpgradesRequestRecordReference;
  }

  public void setMaintenanceAndUpgradesRequestRecordReference(String maintenanceAndUpgradesRequestRecordReference) {
    this.maintenanceAndUpgradesRequestRecordReference = maintenanceAndUpgradesRequestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}

