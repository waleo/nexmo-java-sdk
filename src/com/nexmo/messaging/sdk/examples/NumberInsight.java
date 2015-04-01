/**
 * An example of using the Number Insight API
 */
package com.nexmo.messaging.sdk.examples;

import java.util.ArrayList;
import java.util.List;

import com.nexmo.messaging.sdk.NexmoInsightClient;
import com.nexmo.messaging.sdk.insight.Feature;
import com.nexmo.messaging.sdk.insight.InsightRequest;

/**
 * @author Wale Olaleye
 *
 */
public class NumberInsight {
	
	public static final String API_KEY = "your-api-key";
	public static final String API_SECRET = "your-api-secret";
	public static final String ENDPOINT_BASE_URL = "https://rest.nexmo.com";
	public static final String ENDPOINT_PATH = "/ni/json";
	
	
	
	public static void main(String[] args) {
		NexmoInsightClient client = null;
		try {
			client = new NexmoInsightClient(ENDPOINT_BASE_URL, ENDPOINT_PATH, API_KEY, API_SECRET);
		} catch (Exception e) {
			System.err.println("Failed to instanciate a Nexmo Client");
			e.printStackTrace();
			throw new RuntimeException("Failed to instanciate a Nexmo Client");
		}
		
		//Check verification code sent to SMS
		try {
			List<Feature> features = new ArrayList<Feature>();
			features.add(Feature.CARRIER);
			features.add(Feature.PORTED);
			features.add(Feature.REACHABLE);
			features.add(Feature.ROAMING);
			features.add(Feature.TYPE);
			features.add(Feature.VALID);
			
			InsightRequest request = new InsightRequest("122222222", features, "http://requestb.in/1ate3t", 5000, "GET", "TEST");
			client.submit(request);
            
		} catch (Exception e) {
            System.err.println("Problems were encountered");
            e.printStackTrace();
            throw new RuntimeException("Problems were encountered");
        }
		

	}

}