package com.actimizewebservice.api.actimize.service;

import org.springframework.stereotype.Service;

import com.actimizewebservice.api.actimize.RealTimeWSProviderRequest;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse.Hits;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse.RealTimeWSProviderReturn;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse.Hits.HitsInnerSet;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType;

@Service
public class RealTimeWSActimizeService {

	public RealTimeWSProviderResponse checkHitOutput(RealTimeWSProviderRequest request) {
		RealTimeWSProviderResponse rtwsResponse = new RealTimeWSProviderResponse();

		// Checking for hit Score and Details
		Hits outermostHitTypes = new Hits();
		HitsInnerSet outerHitTypes = new HitsInnerSet();
		RealTimeWSProviderHitsInnerSetTupleType hitTypes = new RealTimeWSProviderHitsInnerSetTupleType();
		RealTimeWSProviderReturn rtwsReturn = new RealTimeWSProviderReturn();
		int returnValue = request.getReturnCode();
		boolean hitBool = request.isBoolHit();

		// Checking for Return Codes
		rtwsReturn.setAddtionalData(null);
		switch (returnValue) {
		case 0:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with SUCCESS");
			break;
		case 1:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with EH_ERROR");
			break;
		case 2:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with AIS_CONNECTION_ERROR");
			break;
		case 3:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with MISSING_PROCESS_MAPPING");
			break;
		case 4:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with AIS_INTERNAL_ERROR");
			break;
		case 5:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with AIS_LOGIN_ERROR");
			break;
		case 6:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with AUTHENTICATION_ERROR");
			break;
		case 7:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with EH_INITIALIZATION_ERROR");
			break;
		case 8:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with NON_VALID_FLOWS");
			break;
		case 9:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with TIME_OUT");
			break;
		case 10:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("Ais invocation return with TIME_OUT");
			break;
		default:
			rtwsReturn.setReturnCode("No Return Code");
			rtwsReturn.setMessage(null);
		}

		rtwsResponse.setRealTimeWSProviderReturn(rtwsReturn);

		if (returnValue == 0) {
			// Checking for hit boolean
			if (hitBool) {
				hitTypes.setAdditionalInfo("A whole bunch of info here on the sanction");
				hitTypes.setScore(110);
				rtwsResponse.setHasHits(true);
				rtwsResponse.setAlertID(0L);
				rtwsResponse.setSearchId("MaSo_1");
			} else {
				rtwsResponse.setHasHits(false);
				hitTypes.setAdditionalInfo(null);
				hitTypes.setScore(0);
				rtwsResponse.setHits(null);
				rtwsResponse.setAlertID(0L);
				rtwsResponse.setSearchId(null);
			}
			outerHitTypes.getRealTimeWSProviderHitsInnerSetTupleType().add(hitTypes);
			outermostHitTypes.setHitsInnerSet(outerHitTypes);
			rtwsResponse.setHits(outermostHitTypes);
		}

		return rtwsResponse;
	}
}
