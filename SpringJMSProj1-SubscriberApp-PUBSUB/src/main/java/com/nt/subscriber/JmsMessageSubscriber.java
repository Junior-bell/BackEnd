package com.nt.subscriber;

import org.springframework.jms.annotation.JmsListener;

public class JmsMessageSubscriber {

	@JmsListener(destination="testmq1")
	public void readMessage(String text)
	{
		System.out.println("Received message :"+text);
	}
}
