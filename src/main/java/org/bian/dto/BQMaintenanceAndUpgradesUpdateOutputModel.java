package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesUpdateOutputModel
 */
public class BQMaintenanceAndUpgradesUpdateOutputModel   {
  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord maintenanceAndUpgradesInstanceRecord = null;

  private String maintenanceAndUpgradesUpdateActionTaskReference = null;

  private Object maintenanceAndUpgradesUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return maintenanceAndUpgradesUpdateActionTaskReference
  **/

  public String getMaintenanceAndUpgradesUpdateActionTaskReference() {
    return maintenanceAndUpgradesUpdateActionTaskReference;
  }

  public void setMaintenanceAndUpgradesUpdateActionTaskReference(String maintenanceAndUpgradesUpdateActionTaskReference) {
    this.maintenanceAndUpgradesUpdateActionTaskReference = maintenanceAndUpgradesUpdateActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return maintenanceAndUpgradesUpdateActionTaskRecord
  **/

  public Object getMaintenanceAndUpgradesUpdateActionTaskRecord() {
    return maintenanceAndUpgradesUpdateActionTaskRecord;
  }

  public void setMaintenanceAndUpgradesUpdateActionTaskRecord(Object maintenanceAndUpgradesUpdateActionTaskRecord) {
    this.maintenanceAndUpgradesUpdateActionTaskRecord = maintenanceAndUpgradesUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}

