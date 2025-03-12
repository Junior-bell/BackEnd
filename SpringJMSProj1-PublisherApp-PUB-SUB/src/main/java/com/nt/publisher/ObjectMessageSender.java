package com.nt.publisher;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import com.nt.model.ActorInfo;

@Component
public class ObjectMessageSender {

	private JmsTemplate template;
	
	public void sendObjectDataMessage()
	{
		ActorInfo actor=new ActorInfo(1001,"ranveer","Mumbai");
		template.convertAndSend("obj_mq1",actor);
		System.out.println("Object is sent as a message");
	}
}
