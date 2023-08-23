package com.actimizewebservice.api.actimize.endpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import com.actimizewebservice.api.actimize.service.RealTimeWSActimizeService;
import com.actimizewebservice.api.actimize.RealTimeWSProviderRequest;
import com.actimizewebservice.api.actimize.RealTimeWSProviderResponse;

@Endpoint
public class RealTimeWSActimizeEndpoint {

	private static final String NAMESPACE = "http://www.actimizewebservice.com/api/actimize";
	@Autowired
	private RealTimeWSActimizeService service;
	
	@PayloadRoot(namespace = NAMESPACE, localPart = "RealTimeWSProviderRequest")
	@ResponsePayload
	public RealTimeWSProviderResponse getHitStatus(@RequestPayload RealTimeWSProviderRequest request) {
		return service.checkHitOutput(request);
	}
}
