package com.nt.receiver;

import org.springframework.jms.annotation.JmsListener;

public class JMSMessageReceiver {

	@JmsListener(destination="testmq1")
	public void readMessage(String text)
	{
		System.out.println("Received message :"+text);
	}
}
