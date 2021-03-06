package com.nexmo.messaging.sdk.examples;

import com.nexmo.messaging.sdk.NexmoVerifyClient;
import com.nexmo.messaging.sdk.verify.VerifyRequest;
import com.nexmo.messaging.sdk.verify.VerifyResponse;

/**
 * Example shows how to start a number verification
 * 
 * @author Wale Olaleye
 */

public class BeginNumberVerification {
	public static final String API_KEY = "your-public-api-key";
	public static final String API_SECRET = "your-api-secret";

	public static final String SMS_FROM = "12069396346";
	public static final String SMS_TO = "12222222222";
	public static final String SMS_TEXT = "Hello World!";

	public static void main(String[] args) {

		NexmoVerifyClient client = null;
		try {
			client = new NexmoVerifyClient(API_KEY, API_SECRET);
		} catch (Exception e) {
			System.err.println("Failed to instanciate a Nexmo Client");
			e.printStackTrace();
			throw new RuntimeException("Failed to instanciate a Nexmo Client");
		}
		

		//verify number
		
		try {
            //VerifyResponse vrs = client.beginVerifyRequest(new VerifyRequest(SMS_TO, "testBrand"));
			VerifyResponse vrs = client.beginVerifyRequest(new VerifyRequest(SMS_TO, "testBrand", "MEFIY", 6,  "en-US", null, 600));
            System.out.println(vrs);
            
		} catch (Exception e) {
            System.err.println("Failed to communicate with the Nexmo Client");
            e.printStackTrace();
            throw new RuntimeException("Failed to communicate with the Nexmo Client");
        }
	}

}
