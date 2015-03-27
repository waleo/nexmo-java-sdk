/**
 * Example of a verification search
 * @see https://docs.nexmo.com/index.php/verify/search
 */
package com.nexmo.messaging.sdk.examples;

import com.nexmo.messaging.sdk.NexmoVerifyClient;
import com.nexmo.messaging.sdk.verify.SearchResponse;

/**
 * @author Wale Olaleye
 *
 */
public class VerificationSearchSingle {
	
	public static final String API_KEY = "493178a1";
	public static final String API_SECRET = "6b932842";
	public static final String REQUEST_ID = "31aae80d6d2c4feaa1952a4941bd405e";
	
	
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
