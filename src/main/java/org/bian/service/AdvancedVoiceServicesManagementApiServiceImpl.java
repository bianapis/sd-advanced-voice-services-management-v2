/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class AdvancedVoiceServicesManagementApiServiceImpl implements AdvancedVoiceServicesManagementApiService {

	public SDAdvancedVoiceServicesManagementActivateOutputModel activate(SDAdvancedVoiceServicesManagementActivateInputModel request){
		return JsonReader.read("activate-SDAdvancedVoiceServicesManagementActivateOutputModel.json",new TypeReference<SDAdvancedVoiceServicesManagementActivateOutputModel>(){});
	}
	
	public SDAdvancedVoiceServicesManagementConfigureOutputModel configure(String sdReferenceId, SDAdvancedVoiceServicesManagementConfigureInputModel request){
		return JsonReader.read("configure-SDAdvancedVoiceServicesManagementConfigureOutputModel.json",new TypeReference<SDAdvancedVoiceServicesManagementConfigureOutputModel>(){});
	}
	
	public CRVoiceChannelManagementPlanCreateOutputModel create(String sdReferenceId, CRVoiceChannelManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRVoiceChannelManagementPlanCreateOutputModel.json",new TypeReference<CRVoiceChannelManagementPlanCreateOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradesCreateOutputModel createMaintenanceandupgrades(String sdReferenceId, String crReferenceId, BQMaintenanceAndUpgradesCreateInputModel request){
		return JsonReader.read("create-BQMaintenanceAndUpgradesCreateOutputModel.json",new TypeReference<BQMaintenanceAndUpgradesCreateOutputModel>(){});
	}
	
	public CRVoiceChannelManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRVoiceChannelManagementPlanExchangeOutputModel.json",new TypeReference<CRVoiceChannelManagementPlanExchangeOutputModel>(){});
	}
	
	public SDAdvancedVoiceServicesManagementFeedbackOutputModel feedback(String sdReferenceId, SDAdvancedVoiceServicesManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDAdvancedVoiceServicesManagementFeedbackOutputModel.json",new TypeReference<SDAdvancedVoiceServicesManagementFeedbackOutputModel>(){});
	}
	
	public BQCapacityPlanningRequestOutputModel requestCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningRequestInputModel request){
		return JsonReader.read("request-BQCapacityPlanningRequestOutputModel.json",new TypeReference<BQCapacityPlanningRequestOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradesRequestOutputModel requestMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradesRequestInputModel request){
		return JsonReader.read("request-BQMaintenanceAndUpgradesRequestOutputModel.json",new TypeReference<BQMaintenanceAndUpgradesRequestOutputModel>(){});
	}
	
	public BQTroubleshootingRequestOutputModel requestTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingRequestInputModel request){
		return JsonReader.read("request-BQTroubleshootingRequestOutputModel.json",new TypeReference<BQTroubleshootingRequestOutputModel>(){});
	}
	
	public CRVoiceChannelManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRVoiceChannelManagementPlanRequestOutputModel.json",new TypeReference<CRVoiceChannelManagementPlanRequestOutputModel>(){});
	}
	
	public CRVoiceChannelManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRVoiceChannelManagementPlanRetrieveOutputModel.json",new TypeReference<CRVoiceChannelManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDAdvancedVoiceServicesManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDAdvancedVoiceServicesManagementRetrieveOutputModel.json",new TypeReference<SDAdvancedVoiceServicesManagementRetrieveOutputModel>(){});
	}
	
	public BQCapacityPlanningRetrieveOutputModel retrieveCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQCapacityPlanningRetrieveOutputModel.json",new TypeReference<BQCapacityPlanningRetrieveOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradesRetrieveOutputModel retrieveMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQMaintenanceAndUpgradesRetrieveOutputModel.json",new TypeReference<BQMaintenanceAndUpgradesRetrieveOutputModel>(){});
	}
	
	public BQTroubleshootingRetrieveOutputModel retrieveTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQTroubleshootingRetrieveOutputModel.json",new TypeReference<BQTroubleshootingRetrieveOutputModel>(){});
	}
	
	public CRVoiceChannelManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRVoiceChannelManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRVoiceChannelManagementPlanUpdateOutputModel.json",new TypeReference<CRVoiceChannelManagementPlanUpdateOutputModel>(){});
	}
	
	public BQCapacityPlanningUpdateOutputModel updateCapacityplanning(String sdReferenceId, String crReferenceId, String bqReferenceId, BQCapacityPlanningUpdateInputModel request){
		return JsonReader.read("update-BQCapacityPlanningUpdateOutputModel.json",new TypeReference<BQCapacityPlanningUpdateOutputModel>(){});
	}
	
	public BQMaintenanceAndUpgradesUpdateOutputModel updateMaintenanceandupgrades(String sdReferenceId, String crReferenceId, String bqReferenceId, BQMaintenanceAndUpgradesUpdateInputModel request){
		return JsonReader.read("update-BQMaintenanceAndUpgradesUpdateOutputModel.json",new TypeReference<BQMaintenanceAndUpgradesUpdateOutputModel>(){});
	}
	
	public BQTroubleshootingUpdateOutputModel updateTroubleshooting(String sdReferenceId, String crReferenceId, String bqReferenceId, BQTroubleshootingUpdateInputModel request){
		return JsonReader.read("update-BQTroubleshootingUpdateOutputModel.json",new TypeReference<BQTroubleshootingUpdateOutputModel>(){});
	}
	
}
