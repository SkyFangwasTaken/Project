package com.actimizewebservice.api.actimize.service;

import org.springframework.stereotype.Service;

import com.actmizewebservice.api.actimize.RealTimeWSProviderRequest;
import com.actmizewebservice.api.actimize.RealTimeWSProviderResponse;
import com.actmizewebservice.api.actimize.RealTimeWSProviderRequest.Names;
import com.actmizewebservice.api.actimize.RealTimeWSProviderResponse.Hits;
import com.actmizewebservice.api.actimize.RealTimeWSProviderResponse.RealTimeWSProviderReturn;
import com.actmizewebservice.api.actimize.RealTimeWSProviderResponse.Hits.HitsInnerSet;
import com.actmizewebservice.api.actimize.RealTimeWSProviderResponse.Hits.HitsInnerSet.RealTimeWSProviderHitsInnerSetTupleType;

@Service
public class RealTimeWSActimizeService {

	public RealTimeWSProviderResponse checkHitOutput(RealTimeWSProviderRequest request) {
		RealTimeWSProviderResponse rtwsResponse = new RealTimeWSProviderResponse();

		// Checking for hit Score and Details
		Hits outermostHitTypes = new Hits();
		HitsInnerSet outerHitTypes = new HitsInnerSet();
		RealTimeWSProviderHitsInnerSetTupleType hitTypes = new RealTimeWSProviderHitsInnerSetTupleType();
		Names names = request.getNames();

		String hitName = names.getFullName();
		if (hitName.equals("osama")) {
			hitTypes.setAdditionalInfo("Mastermind of 9/11 Attack");
			hitTypes.setScore(110);
		} else {
			hitTypes.setAdditionalInfo(null);
			hitTypes.setScore(0);
		}

		System.out.println(hitTypes.getAdditionalInfo());
		System.out.println(hitTypes.getScore());
		outerHitTypes.getRealTimeWSProviderHitsInnerSetTupleType().add(hitTypes);
		System.out.println(outerHitTypes.toString());
		outermostHitTypes.setHitsInnerSet(outerHitTypes);;
		System.out.println(outermostHitTypes.toString());

		rtwsResponse.setHits(outermostHitTypes);
		
		//Checking for hit boolean
		if (hitName.equals("osama")) {
			System.out.println("gotHit");
			rtwsResponse.setHasHits(true);
			rtwsResponse.setAlertID(0);
			rtwsResponse.setSearchId("MaSo_1");
		} else {
			rtwsResponse.setHits(null);
			rtwsResponse.setAlertID(0);
			rtwsResponse.setSearchId(null);
		}
		
		//Checking for Return Codes
		RealTimeWSProviderReturn rtwsReturn = new RealTimeWSProviderReturn();
		int returnValue = 0;
		rtwsReturn.setAddtionalData(null);

		switch (returnValue) {
		case 0:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("SUCCESS");
			break;
		case 1:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("EH_ERROR");
			break;
		case 2:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("AIS_CONNECTION_ERROR");
			break;
		case 3:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("MISSING_PROCESS_MAPPING");
			break;
		case 4:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("AIS_INTERNAL_ERROR");
			break;
		case 5:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("AIS_LOGIN_ERROR");
			break;
		case 6:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("AUTHENTICATION_ERROR");
			break;
		case 7:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("EH_INITIALIZATION_ERROR");
			break;
		case 8:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("NON_VALID_FLOWS");
			break;
		case 9:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("TIME_OUT");
			break;
		case 10:
			rtwsReturn.setReturnCode(Integer.toString(returnValue));
			rtwsReturn.setMessage("TIME_OUT");
			break;
		default:
			rtwsReturn.setReturnCode("No Return Code");
			rtwsReturn.setMessage(null);
		}
		
		rtwsResponse.setRealTimeWSProviderReturn(rtwsReturn);
		
		
		return rtwsResponse;
	}
}
