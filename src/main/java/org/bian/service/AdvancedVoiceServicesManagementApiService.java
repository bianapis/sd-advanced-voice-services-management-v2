/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface AdvancedVoiceServicesManagementApiService {

	SDAdvancedVoiceServicesManagementActivateOutputModel activate(SDAdvancedVoiceServicesManagementActivateInputModel request);
	
	SDAdvancedVoiceServicesManagementConfigureOutputModel configure(String sdReferenceId, SDAdvancedVoiceServicesManagementConfigureInputModel request);
	
	CRVoiceChannelManagementPlanCreateOutputModel create(String sdReferenceId, CRVoiceChannelManagementPlanCreateInputModel request);
	
	BQMaintenanceAndUpgradesCreateOutputModel createMaintenanceandupgrades(String sdReferenceId, String crReferenceId, BQMaintenanceAndUpgradesCreateInputModel request);
	
	CRVoiceChannelManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanExchangeInputModel request);
	
	SDAdvancedVoiceServicesManagementFeedbackOutputModel feedback(String sdReferenceId, SDAdvancedVoiceServicesManagementFeedbackInputModel request);
	
	BQCapacityPlanningRequestOutputModel requestCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningRequestInputModel request);
	
	BQMaintenanceAndUpgradesRequestOutputModel requestMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradesRequestInputModel request);
	
	BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request);
	
	CRVoiceChannelManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanRequestInputModel request);
	
	CRVoiceChannelManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDAdvancedVoiceServicesManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	BQCapacityPlanningRetrieveOutputModel retrieveCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQMaintenanceAndUpgradesRetrieveOutputModel retrieveMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	CRVoiceChannelManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanUpdateInputModel request);
	
	BQCapacityPlanningUpdateOutputModel updateCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningUpdateInputModel request);
	
	BQMaintenanceAndUpgradesUpdateOutputModel updateMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradesUpdateInputModel request);
	
	BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request);
	
}
