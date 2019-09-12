package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule;

import javax.validation.Valid;
  
/**
 * BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord
 */
public class BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecord   {
  private BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule vChannelMaintenanceandUpgradeSchedule = null;


  /**
   * Get vChannelMaintenanceandUpgradeSchedule
   * @return vChannelMaintenanceandUpgradeSchedule
  **/

  @JsonProperty("vChannelMaintenanceandUpgradeSchedule")
  public BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule getVChannelMaintenanceandUpgradeSchedule() {
    return vChannelMaintenanceandUpgradeSchedule;
  }

  public void setVChannelMaintenanceandUpgradeSchedule(BQMaintenanceAndUpgradesCreateOutputModelMaintenanceAndUpgradesInstanceRecordVChannelMaintenanceandUpgradeSchedule vChannelMaintenanceandUpgradeSchedule) {
    this.vChannelMaintenanceandUpgradeSchedule = vChannelMaintenanceandUpgradeSchedule;
  }


}

