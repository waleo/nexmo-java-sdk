
package com.nexmo.messaging.sdk.examples;

import com.nexmo.messaging.sdk.NexmoVerifyClient;
import com.nexmo.messaging.sdk.verify.SearchResponse;

/**
 * 
 * Example of a verification search - single request
 * @author Wale Olaleye
 *
 */
public class VerificationSearchSingle {
	
	public static final String API_KEY = "your-public-api-key";
	public static final String API_SECRET = "your-api-secret";
	public static final String REQUEST_ID = "45f8d1okok8d4072ba6122d68ad9de60";
	
	
	public static void main(String[] args) {
		NexmoVerifyClient client = null;
		try {
			client = new NexmoVerifyClient(API_KEY, API_SECRET);
		} catch (Exception e) {
			System.err.println("Failed to instanciate a Nexmo Client");
			e.printStackTrace();
			throw new RuntimeException("Failed to instanciate a Nexmo Client");
		}
		
		//Search verification code
		try {
            SearchResponse result = client.search(REQUEST_ID);
            System.out.println(result);
            
		} catch (Exception e) {
            System.err.println("Failed to process results");
            e.printStackTrace();
            throw new RuntimeException("Failed to process results");
        }

	}

}
