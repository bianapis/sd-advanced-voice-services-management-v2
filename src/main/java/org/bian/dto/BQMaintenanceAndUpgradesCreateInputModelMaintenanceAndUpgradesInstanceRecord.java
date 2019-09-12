package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord
 */
public class BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecord   {
  private BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule vChannelMaintenanceandUpgradeSchedule = null;


  /**
   * Get vChannelMaintenanceandUpgradeSchedule
   * @return vChannelMaintenanceandUpgradeSchedule
  **/

  public BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule getVChannelMaintenanceandUpgradeSchedule() {
    return vChannelMaintenanceandUpgradeSchedule;
  }

  public void setVChannelMaintenanceandUpgradeSchedule(BQMaintenanceAndUpgradesCreateInputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule vChannelMaintenanceandUpgradeSchedule) {
    this.vChannelMaintenanceandUpgradeSchedule = vChannelMaintenanceandUpgradeSchedule;
  }


}

